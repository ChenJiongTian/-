package com.gongcheng.onedemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gongcheng.onedemo.model.TbUser;
import org.apache.ibatis.annotations.Mapper;

//mybatis-plus
@Mapper
public interface UserMapper extends BaseMapper<TbUser> {

}
