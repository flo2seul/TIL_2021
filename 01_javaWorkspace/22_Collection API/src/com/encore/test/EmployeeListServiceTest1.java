package com.encore.test;

import com.encore.service.impl.EmployeeListServiceImpl;
import com.encore.vo.Engineer;
import com.encore.vo.Manager;

public class EmployeeListServiceTest1 {

	public static void main(String[] args) {
		//1. Service ������ ��ü�� �ϳ� �޾ƿ´�..
				EmployeeListServiceImpl service = EmployeeListServiceImpl.getInstance();
				
				//2. method�� ���� ȣ��..
				System.out.println("======================== 1. add ================================== ");
				Manager m1 = new Manager("111", "��ȣ��", "��赿", 500,"���ߺ�");
				Manager m2 =new Manager("222", "�̼���", "���ǵ�", 400, "������");
				Manager m3 =new Manager("333", "������","��赿", 600, "���ߺ�");
				
				Engineer eg1 = new Engineer("444","����ö","�Ŵ�浿", 450, "Python", 200);
				Engineer eg2 =new Engineer("555","�̻��","���׿�", 500, "JS", 300);
				
			
				


	}

}