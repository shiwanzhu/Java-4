package doctor;

public interface Manage {
	//缴纳学费查询学费接口
	public abstract void Sudentjf(double f);
	public abstract void Sudentcf();
	
	public String getStudentf();
	
public interface Tmanage {	
	//发放薪水查询薪水接口
	public abstract void Teacherfx(double f);
	public abstract void Teachercx();
	
	public String getTeacherx();
	

	

	

}}
