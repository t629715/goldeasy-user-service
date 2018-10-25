package com.goldeasy.user.mapper;

import com.goldeasy.common.mapper.BaseMapper;
import com.goldeasy.user.entity.SysBank;
import com.goldeasy.user.vo.SysBankVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysBankMapper extends BaseMapper<SysBank> {
    /**
     * fetch 获取开户行列表
     * @author: tianliya
     * @time: 2018/10/25
     * @return
     */
    List<SysBankVO> listSysBank();
}