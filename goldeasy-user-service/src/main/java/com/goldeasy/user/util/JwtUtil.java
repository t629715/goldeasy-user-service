package com.goldeasy.user.util;

import com.alibaba.fastjson.JSONObject;

import com.auth0.jwt.internal.org.apache.commons.codec.binary.Base64;
import com.goldeasy.common.redis.RedisService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: tianliya
 * @date: 2018/10/22
 * @description:
 */
public class JwtUtil {
    /**
     * 由字符串生成加密key
     * @return
     */
    private static SecretKey generalKey(){
        String stringKey = JWTConstant.JWT_SECRET;
        byte[] encodedKey = Base64.decodeBase64(stringKey);
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }

    /**
     * 创建token
     * @param id    个人信息主键
     * @param name  登录名
     * @param times 登录时间
     * @return token
     * @throws Exception
     */
    public static String createJWT(String id, String name, long times) throws Exception {
        Map<String,String> getUser = new HashMap<>();
        getUser.put(JWTConstant.ID_COLUMN, id);
        getUser.put(JWTConstant.NAME_COLUMN, name);
        getUser.put(JWTConstant.NEW_TIMES, String.valueOf(times));
        String subject = JSONObject.toJSONString(getUser);
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        SecretKey key = generalKey();
        Date now = new Date(times);
        JwtBuilder builder = Jwts.builder()
                .setId(JWTConstant.JWT_ID)
                .setIssuedAt(now) //创建时间
                .setSubject(subject) //主题，个人的一些信息
//			.setIssuer(issuer) //发送谁
//			.setAudience(audience) //个人签名
                .signWith(signatureAlgorithm, key);
        //添加Token过期时间
//		if (ttlMillis >= 0) {
//		    long expMillis = nowMillis + ttlMillis;
//		    Date exp = new Date(expMillis);
//		    builder.setExpiration(exp)
//		    .setNotBefore(now);
//		}
        return builder.compact();
    }

    /**
     * 解密token
     * @param jwt
     * @throws Exception
     */
    public static Claims parseJWT(String jwt){
        try {
            SecretKey key = generalKey();
            Claims claims = Jwts.parser()
                    .setSigningKey(key)
                    .parseClaimsJws(jwt).getBody();
            return claims;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static  String userIdByToken(HttpServletRequest request, RedisService redisService){
        String userId=null;
        String token = request.getHeader("token");
        if(!StringUtils.isEmpty(token)) {
            Claims claims = JwtUtil.parseJWT(token);
            if(null != claims){
                String str = claims.getSubject();
                Map<String,String> tt = JSONObject.parseObject(str, Map.class);
                String uid = tt.get(JWTConstant.ID_COLUMN);
                String logintimes = tt.get(JWTConstant.NEW_TIMES);
                String cachetimes = redisService.get(uid);
                if(cachetimes != null && logintimes.equals(cachetimes)){
                    userId = uid;
                }
            }
        }
        return userId;
    }

    public static  String userIdByTokenWithAttribute(HttpServletRequest request, RedisService redisService){
        String userId=null;
        String token = request.getAttribute("token").toString();
        if(!StringUtils.isEmpty(token)) {
            Claims claims = JwtUtil.parseJWT(token);
            if(null != claims){
                String str = claims.getSubject();
                Map<String,String> tt = JSONObject.parseObject(str, Map.class);
                String uid = tt.get(JWTConstant.ID_COLUMN);
                String logintimes = tt.get(JWTConstant.NEW_TIMES);
                String cachetimes = redisService.get(uid);
                if(cachetimes != null && logintimes.equals(cachetimes)){
                    userId = uid;
                }
            }
        }
        return userId;
    }
}
