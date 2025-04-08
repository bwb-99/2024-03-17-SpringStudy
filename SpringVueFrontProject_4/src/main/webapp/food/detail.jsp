<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
p{
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
</style>
</head>
<body>
 <div class="container">
   <div class="row">
      <table class="table">
      <tr>
       <td colspan="3" class="text-center">
         <img :src="'https://www.menupan.com'+vo.poster" style="width:800px;height:250px">
         </td>
      </tr>
      <tr>
        <td colspan="3" class="text-center">
          <h3>{{vo.name}}</h3>
        </td>
      </tr>
      <tr>
        <td colspan="3" class="text-center" style="color:gray">
          <h3>{{vo.content}}</h3>
        </td>
      </tr>
      <tr>
        <td class="text-center"><img src="a1.png"></td>
        <td class="text-center"><img src="a2.png"></td>
        <td class="text-center"><img src="a3.png"></td>
      </tr>
      <tr>
        <td class="text-center">{{vo.theme}</td>
        <td class="text-center">{{vo.time}}</td>
        <td class="text-center">{{vo.score}}</td>
      </tr>
      </table>
      <table class="table">
       <tr>
        <td><h3>[재료]</h3>
       </tr>
       <tr>
        <td>
          <ul>
            <li v-for="d in data_list">{{d}}</li>
          </ul>
        </td>
       </tr>
      </table>
      <table class="table">
       <tr>
        <td>
          <table class="table" v-for="(a,index) in food_addresses">
           <tr>
             <td width=80% class="text-left">{{m}}</td>
             <td width=20% class="text-right">
              <img :src="image_list[index]" style="width:120px;height:80px">
             </td>
           </tr>
          </table>
        </td>
       </tr>
      </table>
   </div>
 </div>
 <script>
   let detailApp=Vue.createApp({
	   data(){
		   return {
			   no:${param.no},
			   food_vo:{},
			   image_list:[],
			   food_address:[],
			   data_list:[]
		   }
	   },
	   mounted(){
		   axios.get('../food/detail_vue.do',{
			   params:{
				   no:this.no
			   }
		   })
		   .then(res=>{
			   console.log(res.data)
			   this.food_vo=res.data.vo
			   this.food_address=res.data.aList
			   this.image_list=res.data_iList
			   this.data_list=res.data.vo.data.split(",")
			   
		   })
		   .catch(error=>{
			   console.log(error.response)
		   })
	   },
	   methods:{
		   
	   }
   }).mount(".container")
 </script>
</body>
</html>