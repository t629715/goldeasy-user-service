package com.goldeasy.user.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author: tianliya
 * @date: 2018/10/22
 * @description:
 */
public class Md5Util {
    private static String salt = "727xzh";
    /**
     * @CreateBy：tianliya
     * @CreateTime：2018/1/8 15:10
     * @Description：获取加密后的字符串
     * @param str
     * @return
     */
    public static String getMD5Str(String str) {

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            try {

                md.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            byte[] byteDigest = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < byteDigest.length; offset++) {
                i = byteDigest[offset];
                if (i < 0) {
                    i += 256;
                }
                if (0 <= i && i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            // 32位加密
            return buf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
