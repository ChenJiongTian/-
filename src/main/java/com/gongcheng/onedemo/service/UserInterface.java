package com.gongcheng.onedemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gongcheng.onedemo.model.TbUser;

//extends IService<tbUser>  mybatis-plus提供service crud
public interface UserInterface extends IService<TbUser> {
}
