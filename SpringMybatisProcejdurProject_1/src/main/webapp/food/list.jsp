<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container-fluid{
 margin-top: 50px;
}
.row{
  margin: 0px auto;
  width: 100%;
}
p{
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis;
}
</style>
</head>
<body>
<div class="container">
 <div class="col-md-3" v-for="vo in list">
		    <div class="thumbnail">
		      <a href="#">
		        <img :src="http://www.menupan.com${vo.poster}" style="width:230px;height: 130px">
		        <div class="caption">
		          <p>{{vo.name}</p>
		        </div>
		      </a>
		    </div>
		  </div>
</body>
</html>