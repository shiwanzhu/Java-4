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
	System.out.printf("姓名：");
	tor.name=sc.next();
	
	System.out.printf("年龄：");
	tor.age=sc.nextInt();
	
	System.out.println("学费为");
	tor.xf=sc.nextDouble();
	
	System.out.println("薪水为");
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
