<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
<form action="/add" method="post">
    标题:<input type="text" name="noticeTitle"/><br/>
    内容:<input type="text" name="noticeContent"/><br/>
    类型<select id="noticeTypeid" name="noticeTypeid">
    <option value="1">公司公告</option>
    <option value="2">业务公告</option>
    <option value="3">优惠政策</option>
    <option value="4">合规专区</option>
    <option value="5">品牌咨询</option>
</select>
    <input type="submit" value="发布"/>
</form>
</body>
</html>
