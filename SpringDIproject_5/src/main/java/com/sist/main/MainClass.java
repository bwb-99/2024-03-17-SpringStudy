package com.sist.main;
/*
 * 	XML / Annotation => 클래스를 모아서 관리
 * 	=> 클래스 등록시
 * 	   --------- 1) 기능을 가지고 있는 클래스 (컴포넌트)
 * 										   | 컨테이너 (스프링)
 * 	                DAO / Manager / Service / Model
 * 					 VO (DTO,Bean) => 사용자 데이터형 (X)
 *	   클래스 등록
 *	   <bean id="" class=""> : 메모리 할당후에 저장
 *      => singleton : 한개의 메모리로 재사용
 *      => 여러개 생성 : prototype => 복제해서 새로운 메모리 생성
 *         <bean id="" class="" scope="prototype">
 *          		  => Object clone()
 *      => <bean id="" class="">=> 기본 디폴트 생성자 호출
 *      => id는 클래스를 찾기 위한 구분자 => 반드시 중복없이 설정
 *      => 컨테이너안에 저장
 *         ====== 스프링에서 지원
 *         		  BeanFactory : core(DI, 객체 생성 / 객체 소멸)
 *         			   |
 *         		  ApplicationContext : +ADP , 국제화
 *         		  ------------------ XML로 등록된 경우
 *                AnnotationConfigApplicationContext
 *                ---------------------------------- 자바로 설정(보안)
 *                  | 5번전 이상에서 많이 권장
 *                  	|
 *               webApplicationContext : +MVC (WEB) => Controller
 *               									   ----------
 *               									    DispatcherServlet
 *               										 | 처리 메소드 찾기
 *               										   ------------
 *               										    @RequestMapping
 *               											 => GET/POST동시
 *               											@GetMapping
 *               											@ PostMapping
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
