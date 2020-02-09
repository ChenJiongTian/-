package com.gongcheng.onedemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gongcheng.onedemo.mapper.UserMapper;
import com.gongcheng.onedemo.model.TbUser;
import com.gongcheng.onedemo.service.UserInterface;
import org.springframework.stereotype.Service;

@Service
public class UserInterfaceImpl extends ServiceImpl<UserMapper, TbUser> implements UserInterface {
}
