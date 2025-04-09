let listApp=Vue.createApp({
    	 data(){
    		 return {
    			 food_list:[],
    			 curpage:1,
    			 totalpage:0,
    			 startPage:0,
    			 endPage:0,
    			 type:'한식'
    		 }
    	 },
    	 mounted(){
    		 // 시작과 동시에 한페이지 읽기
    		 this.dataRecv()
    	 },
    	 // updated
    	 // Vue의 멤버함수 
    	 methods:{
    		prev(){
    			this.curpage=this.startPage-1
    			this.dataRecv()
    		},
    		next(){
    			this.curpage=this.endPage+1
    			this.dataRecv()
    		},
    		pageChange(page){
    			this.curpage=page
    			this.dataRecv()
    		},
    		range(start,end){
    			let arr=[]
    			let len=end-start
    			for(let i=0;i<=len;i++)
    			{
    				arr[i]=start
    				start++;
    			}
    			return arr;
    		},
    		food(type){
    			this.type=type
    			this.curpage=1
    			this.dataRecv()
    		},
    		dataRecv(){
    			//let _this=this
    			axios.get("http://localhost:8080/web/food/list_vue.do",{
    				params:{
    					page:this.curpage,
    					type:this.type
    				}
    			}).then(response=>{
    				console.log(response.data)
    				this.food_list=response.data.list
    				this.type=response.data.type
    				this.curpage=response.data.curpage
    				this.totalpage=response.data.totalpage
    				this.startPage=response.data.startPage
    				this.endPage=response.data.endPage
    			}).catch(function(error){
    				console.log(error.response)
    			})
    		}
    	 }
    	 // watch / computed / components
     }).mount(".container")