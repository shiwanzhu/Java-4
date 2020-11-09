班级：计G202  
学号：2020322089  
姓名：石琬竹

# Java-4
Java实验项目

# 阅读程序  

## 一、实验目的
1.掌握Java中抽象类和抽象方法的定义

2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法

3.了解异常的使用方法，并在程序中根据输入情况做异常处理


## 二、实验过程  
1.打开eclipse 创建Java项目 Doctor

2.在Java项目中 创建1个包doctor

3.在student包中分别创建Manage接口，Tmanage接口，Doctor类，Sdoctor类

4.在Manage学生接口中定义了缴纳学费、查学费的方法

5.在Tmanage教师接口包括发放薪水和查询薪水的方法

5.在Doctor类中继承manage接口，定义姓名，性别，年龄，学费，薪水的属性，用if else语句计算税率并输出

6.在Sdoctor类中定义继承manage接口，定义姓名，性别，年龄，学费，薪水的属性，使用scanner进行自定义输入

7.在Sdoctor类中使用try catch对年龄进行异常处理，如果年龄为int的其他类型，则结束进程


## 三、核心方法  
1.方法一
```
public interface Manage {
	//缴纳学费查询学费接口
	public abstract void Sudentjf(double f);
	public abstract void Sudentcf();
	
	public String getStudentf();
```
2.方法二
```
public interface Tmanage {	
	//发放薪水查询薪水接口
	public abstract void Teacherfx(double f);
	public abstract void Teachercx();
	
	public String getTeacherx();
```
3.方法三
```   
public Doctor() {}
	public void manage(double f) {
		this.xf=f;
		}
	public void Tmanage(double f) {
		this.xs=f;
		
	}
```
4.方法四
```
 	public static void main(String args[]) {
			Doctor heihei=new Doctor("嘿嘿 ","男",25,5000,6000);
			if(heihei.xs<5000) {
				System.out.printf(name);
				System.out.printf("  性别："+sex);
				System.out.println("  年龄："+age);
				System.out.println("学费为"+xf);
				System.out.println("年薪水为"+xs*2);
				
				
			}
			else {
				System.out.printf(name);
				System.out.printf("  性别："+sex);
				System.out.println("  年龄："+age);
				System.out.println("学费为"+xf);
				System.out.println("年薪水为"+(xs-(xs-5000)*0.03*2));
			}
```
5.方法五
```
public String toString() {
		return this.id+" "+this.name+" "+this.sex+" ";
	}
```
6.方法六
```
public static void main(String args[]) { 
	Doctor tor=new Doctor();
	Scanner sc=new Scanner(System.in);
		
	}

```
7.方法七
```

System.out.printf("姓名：");
	tor.name=sc.next();
	
	System.out.printf("性别：");
	tor.sex=sc.next();
	
	System.out.printf("年龄：");
	tor.age=sc.nextInt();
	
	System.out.println("学费为");
	tor.xf=sc.nextDouble();
	
	System.out.println("薪水为");
	tor.xs=sc.nextDouble();

```

8.方法八
```

try {
		int age=sc.nextInt();
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		sc.close();
	}

```


## 四、实验结果  
```
Doctor：
嘿嘿   性别：男  年龄：25
学费为5000.0
年薪水为5940.0
哈哈   性别:女  年龄：24
学费为5000.0
年薪水为8000.0

Sdoctor：
姓名：嘿嘿
性别：男
年龄：25（输入的不为int类型，则结束进程）
学费为5000
年薪水为5940.0
```

## 五、实验感想  
通过本次实验，我基本掌握Java中抽象类和抽象方法的定义，Java中接口的定义，接口的定义形式以及接口的实现方法，了解了异常的使用方法，
在这过程中遇到的一些问题，通过查询课本和上网搜索解决了，也要感谢同学和的老师帮助，让我顺利的完成了这次试验，同时也让发现了自己对一些基础的知识掌握不够，要夯实基础，才能做的更加完美。
