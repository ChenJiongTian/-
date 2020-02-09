package com.gongcheng.onedemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gongcheng.onedemo.mapper.NoticeMapper;
import com.gongcheng.onedemo.model.TbNotice;
import com.gongcheng.onedemo.service.NoticeInterface;
import org.springframework.stereotype.Service;

@Service
public class NoticeInterfaceImpl extends ServiceImpl<NoticeMapper, TbNotice> implements NoticeInterface {
}
