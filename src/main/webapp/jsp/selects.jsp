<%@ page language="java" import="java.util.*"  pageEncoding="utf-8"%>
<%@ page import="com.gongcheng.onedemo.model.TbNotice" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
<form action="/selectNotice" method="post">
	标题:<input type="text" name="noticeTitle"/><br/>
	类型:<select id="noticeTypeid" name="noticeTypeid">
	<option value="1">公司公告</option>
	<option value="2">业务公告</option>
	<option value="3">优惠政策</option>
	<option value="4">合规专区</option>
	<option value="5">品牌咨询</option>
    </select>
	<input type="submit" value="查询"/>
</form>



<%
List<TbNotice> hospitals = (ArrayList<TbNotice>) request.getAttribute("tbNoticeList");
%>
 <table>
   <tr>
	 <td>编号</td>
	 <td>标题</td>
	 <td>日期</td>
	 <td>类型</td>
	   <td>操作</td>
	   <td>状态</td>
	</tr>
	  <%
		for(int i = 0; i < hospitals.size(); i++) {
	  %>
		<tr>
			<td><%=hospitals.get(i).getNoticeId()%></td>
			<td><%=hospitals.get(i).getNoticeTitle()%></td>
			<td><%=hospitals.get(i).getNoticeTime()%></td>
			<td>
				<%if (hospitals.get(i).getNoticeTypeid()==1){%>
				公司公告
				<%}%>
				<%if (hospitals.get(i).getNoticeTypeid()==2){%>
				业务公告
				<%}%>
				<%if (hospitals.get(i).getNoticeTypeid()==3){%>
				优惠政策
				<%}%>
				<%if (hospitals.get(i).getNoticeTypeid()==4){%>
				合规专区
				<%}%>
				<%if (hospitals.get(i).getNoticeTypeid()==5){%>
				品牌咨询
				<%}%>
			</td>
			<td><a href="shenhe?flag=0&noticeid=<%=hospitals.get(i).getNoticeId()%>">通过</a>
				<a href="shenhe?flag=2&noticeid=<%=hospitals.get(i).getNoticeId()%>">不通过</a>
			</td>
			<td><%if (hospitals.get(i).getNoticeFlag()==0){%>
				通过
				<%}%>
				<%if (hospitals.get(i).getNoticeFlag()==1){%>
				待审核
				<%}%>
				<%if (hospitals.get(i).getNoticeFlag()==2){%>
				未通过
				<%}%>

			</td>
			</tr>
			<%}%>
	</table>
<a href="/jsp/adds.jsp">去发布公告</a>
</body>
</html>
