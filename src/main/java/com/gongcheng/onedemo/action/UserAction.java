package com.gongcheng.onedemo.action;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gongcheng.onedemo.model.TbNotice;
import com.gongcheng.onedemo.model.TbUser;
import com.gongcheng.onedemo.service.NoticeInterface;
import com.gongcheng.onedemo.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class UserAction {
    @Resource
    private UserInterface userInterface;

    @Autowired
    NoticeInterface noticeInterface;

    public int loginUserId;

    //公告发布
    @RequestMapping("/add")
    public void add(String noticeTitle, String noticeContent, int noticeTypeid, HttpServletResponse res) throws IOException {
        TbNotice tbNotice = new TbNotice();
        tbNotice.setNoticeTitle(noticeTitle);
        tbNotice.setNoticeContent(noticeContent);
        tbNotice.setNoticeTypeid(noticeTypeid);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        tbNotice.setNoticeTime(df.format(new Date()));
        tbNotice.setNoticeFlag(1);
        noticeInterface.save(tbNotice);
        res.sendRedirect("/selects");
    }

    //公告查询
    @RequestMapping("/selectNotice")
    public ModelAndView selectNotice(String noticeTitle,  int noticeTypeid, HttpServletResponse res) throws IOException {
        List<TbNotice> tbNoticeList = noticeInterface.list(new QueryWrapper<TbNotice>().like("notice_title",noticeTitle).eq("notice_typeid",noticeTypeid));
        ModelAndView mv = new ModelAndView("/jsp/selects.jsp");
        mv.addObject("tbNoticeList", tbNoticeList);
        return mv;

    }

    //用户登录
    @RequestMapping("/login")
    public void login(String zhanghao, String psw, HttpServletResponse res) throws IOException {
        int count = userInterface.count(new QueryWrapper<TbUser>().eq("user_name", zhanghao).eq("user_pwd", psw));
        if (count > 0) {
            TbUser one = userInterface.getOne(new QueryWrapper<TbUser>().eq("user_name", zhanghao).eq("user_pwd", psw));
            loginUserId=one.getUserId();
            res.sendRedirect("/selects");
        }
    }


    //审核
    @RequestMapping("/shenhe")
    public String shenhe(int flag, int noticeid, HttpServletResponse res) throws IOException {
        TbUser user = userInterface.getOne(new QueryWrapper<TbUser>().eq("user_id", loginUserId));
        if (user.getUserRole()==1){
        TbNotice notice = noticeInterface.getById(noticeid);
        notice.setNoticeFlag(flag);
        boolean b = noticeInterface.updateById(notice);
        if (b){
            res.sendRedirect("/selects");
        }
        }
        else{
            return "没有权限";
        }
        return "";
    }

    //首页公告
    @RequestMapping("/selects")
    public ModelAndView selectjsp() {
        List<TbNotice> tbNoticeList = noticeInterface.list();
        ModelAndView mv = new ModelAndView("/jsp/selects.jsp");
        mv.addObject("tbNoticeList", tbNoticeList);
        return mv;
    }


}
