package doctor;

public  class Doctor implements Manage{
	public static String name;
	public static String sex;
	public static int age;
	public static double xf;
	public static double xs;
	
	public Doctor(String name,String sex,int age,int xf,int xs) {
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.xf=xf;
		this.xs=xs;
	}
	public Doctor() {}
	public void manage(double f) {
		this.xf=f;
		}
	public void Tmanage(double f) {
		this.xs=f;
		
	}

	
		/*public static void main(String args[]) {
			Doctor heihei=new Doctor("�ٺ� ","��",25,5000,6000);
			if(heihei.xs<5000) {
				System.out.printf(name);
				System.out.printf("  �Ա�"+sex);
				System.out.println("  ���䣺"+age);
				System.out.println("ѧ��Ϊ"+xf);
				System.out.println("��нˮΪ"+xs*2);
				
				
			}
			else {
				System.out.printf(name);
				System.out.printf("  �Ա�"+sex);
				System.out.println("  ���䣺"+age);
				System.out.println("ѧ��Ϊ"+xf);
				System.out.println("��нˮΪ"+(xs-(xs-5000)*0.03*2));
			}
			
			Doctor haha=new Doctor("���� ","Ů",24,5000,4000);
			if(haha.xs<5000) {
				System.out.printf(name);
				System.out.printf("  �Ա�:"+sex);
				System.out.println("  ���䣺"+age);
				System.out.println("ѧ��Ϊ"+xf);
				System.out.println("��нˮΪ"+xs*2);
			}
			else {
				System.out.printf(name);
				System.out.printf("  �Ա�:"+sex);
				System.out.println("  ���䣺"+age);
				System.out.println("ѧ��Ϊ"+xf);
				System.out.println("��нˮΪ"+(xs-(xs-5000)*0.03*2));
		
			}
			
			
			
		}*/
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
	
	


