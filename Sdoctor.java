package doctor;

import java.util.Scanner;

public class Sdoctor implements Manage{
	public  String name;
	public  String sex;
	public int age;
	public double xf;
	public double xs;
	
	public static void main(String args[]) { 
	Doctor tor=new Doctor();
	Scanner sc=new Scanner(System.in);
	System.out.printf("������");
	tor.name=sc.next();
	
	System.out.printf("���䣺");
	tor.age=sc.nextInt();
	
	System.out.println("ѧ��Ϊ");
	tor.xf=sc.nextDouble();
	
	System.out.println("нˮΪ");
	tor.xs=sc.nextDouble();
	
	try {
		int age=sc.nextInt();
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		sc.close();
	}
	
	}

	@Override
	public void Sudentjf(double f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sudentcf() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getStudentf() {
		// TODO Auto-generated method stub
		return null;
	}

}
