package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.dto.UserBankCardDTO;
import com.goldeasy.user.entity.UserBankCard;
import com.goldeasy.user.vo.UserBankVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBankCardMapper extends BaseMapper<UserBankCard> {
    /**
     * fetch 获取用户的银行卡列表
     * @author: tianliya
     * @time: 2018/10/25
     * @param userId
     * @return
     */
    List<UserBankVO> listUserBankCard(Long userId);

    /**
     * fetch 设置默认银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @param id
     * @return
     */
    int setDefault(Long id);

    /**
     * fetch 取消默认银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @param id
     * @return
     */
    int cancelDefault(Long id);

    /**
     * fetch 绑定用户银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @param userBankCardDTO
     * @return
     */
    int addUserBankCard(UserBankCardDTO userBankCardDTO);

    /**
     * fetch 删除用户银行卡
     * @author: tianliya
     * @time: 2018/10/25
     * @param id
     * @return
     */
    int deleteUserBankCard(Long id);
}