package com.gongcheng.onedemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

@TableName("tb_notice")
public class TbNotice {
    @TableId(value = "notice_id",type = IdType.AUTO)
    private int noticeId;

    @TableField("notice_title")
    private  String noticeTitle;

    @TableField("notice_content")
    private  String noticeContent;

    @TableField("notice_typeid")
    private  int noticeTypeid;

    @TableField("notice_flag")
    private  int noticeFlag;

    public String getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    @TableField("notice_time")
    private String noticeTime;

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public int getNoticeTypeid() {
        return noticeTypeid;
    }

    public void setNoticeTypeid(int noticeTypeid) {
        this.noticeTypeid = noticeTypeid;
    }

    public int getNoticeFlag() {
        return noticeFlag;
    }

    public void setNoticeFlag(int noticeFlag) {
        this.noticeFlag = noticeFlag;
    }


}
