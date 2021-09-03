<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="layout/header.jsp" %>

<!-- 변수명을 적으면 내부적으로 getter를 때려준다 -->
<h1>${sessionScope.principal.username}</h1>

<%@ include file="layout/footer.jsp" %>

