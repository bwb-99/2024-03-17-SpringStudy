<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<script src="https://unpkg.com/vue@3/dist/vue.global.js"></script>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<style type="text/css">
.container{
 margin-top: 50px;
}
.row{
  margin: 0px auto;
  width: 800px;
}

</style>
</head>
<body>
 <div class="container">
  <div class="row">
    <table class="table">
     <tr>
      <td class="text-center">
        <img :src="vo.poster" style="width: 750px;height: 350px">
      </td>
     </tr>
  	   <tr>
  	   </tr>
    </table>
  </div>
 </div>

</body>
</html>