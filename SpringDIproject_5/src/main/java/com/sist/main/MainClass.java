package com.sist.main;
/*
 * 	XML / Annotation => Ŭ������ ��Ƽ� ����
 * 	=> Ŭ���� ��Ͻ�
 * 	   --------- 1) ����� ������ �ִ� Ŭ���� (������Ʈ)
 * 										   | �����̳� (������)
 * 	                DAO / Manager / Service / Model
 * 					 VO (DTO,Bean) => ����� �������� (X)
 *	   Ŭ���� ���
 *	   <bean id="" class=""> : �޸� �Ҵ��Ŀ� ����
 *      => singleton : �Ѱ��� �޸𸮷� ����
 *      => ������ ���� : prototype => �����ؼ� ���ο� �޸� ����
 *         <bean id="" class="" scope="prototype">
 *          		  => Object clone()
 *      => <bean id="" class="">=> �⺻ ����Ʈ ������ ȣ��
 *      => id�� Ŭ������ ã�� ���� ������ => �ݵ�� �ߺ����� ����
 *      => �����̳ʾȿ� ����
 *         ====== ���������� ����
 *         		  BeanFactory : core(DI, ��ü ���� / ��ü �Ҹ�)
 *         			   |
 *         		  ApplicationContext : +ADP , ����ȭ
 *         		  ------------------ XML�� ��ϵ� ���
 *                AnnotationConfigApplicationContext
 *                ---------------------------------- �ڹٷ� ����(����)
 *                  | 5���� �̻󿡼� ���� ����
 *                  	|
 *               webApplicationContext : +MVC (WEB) => Controller
 *               									   ----------
 *               									    DispatcherServlet
 *               										 | ó�� �޼ҵ� ã��
 *               										   ------------
 *               										    @RequestMapping
 *               											 => GET/POST����
 *               											@GetMapping
 *               											@ PostMapping
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
