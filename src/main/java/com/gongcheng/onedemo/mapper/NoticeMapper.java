package com.gongcheng.onedemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gongcheng.onedemo.model.TbNotice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper extends BaseMapper<TbNotice> {
}
