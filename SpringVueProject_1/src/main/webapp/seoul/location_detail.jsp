<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
<style type="text/css">
.row{
  margin: 0px auto;
  width:800px;
}
</style>
</head>
<body>
  <div class="container" id="app">
    <div class="row">
     <table class="table">
      <tr>
        <td class="text-center" v-for="img in images">
         <img :src="'https://www.menupan.com'+img" style="width:80%">
        </td>
      </tr>
     </table>
     <table class="table">
       <tr>
        <td width=30% class="text-center" rowspan="8">
          <img :src="'https://www.menupan.com'+vo.poster" style="width: 240px;height: 300px">
        </td>
        <td width=70% colspan="2">
          <h3><span id="name">{{vo.name}}</span>&nbsp;<span style="color:orange">{{vo.score}}</span></h3>
        </td>
       </tr>
       <tr>
         <td width=20%>주소</td>
         <td width=50%>{{vo.address}}</td>
       </tr>
       <tr>
         <td width=20%>전화</td>
         <td width=50%>{{vo.phone}}</td>
       </tr>
       <tr>
         <td width=20%>음식종류</td>
         <td width=50%>{{vo.type}}</td>
       </tr>
       <tr>
         <td width=20%>가격대</td>
         <td width=50%>{{vo.price}}</td>
       </tr>
       <tr>
         <td width=20%>영업시간</td>
         <td width=50%>{{vo.time}}</td>
       </tr>
       <tr>
         <td width=20%>주차</td>
         <td width=50%>{{vo.parking}}</td>
       </tr>
       <tr>
         <td width=20%>테마</td>
         <td width=50%>{{vo.theme}}</td>
       </tr>
     </table>
     </div>
    </div>
<script type="importmap">
   {
     "imports":{
       "vue":"https://unpkg.com/vue@3/dist/vue.esm-browser.js"
     }
   }
  </script>
  <script type="module">
   import {createApp} from "vue"
   import axiosClient from "../js/api.js"
   const app=createApp({
      data(){
         return {
            vo:{},
            food_list:[],
			address:''
         }
      },
      mounted(){
         this.dataRecv()
      },
      methods:{
         async dataRecv(){
            const res= await axiosClient.get('seoul/loc_vue.do',{
              params:{
                 no:this.no
              }
           })
           console.log(res)
           this.vo=res.data.vo
           this.
         }
      }
   })
   app.mount("#detail")
</script>
</body>
</html>