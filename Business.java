
public class Business {
	
/*	private Student studyStudent = new Student();
	private Student sleepyStudent = new Student();
	private Student keenerStudent = new Student();*/
	
	
	
	
	
	
	
	private Student studentObj = new Student();
	
	public void createNewStudent(String sName, int sStudy, int sAnalytics, int sPenmanship){
	
		studentObj.setName(sName);
		studentObj.setStudySkill(sStudy);
		studentObj.setAnalyticsSkill(sAnalytics);
		studentObj.setPenmanshipSkill(sPenmanship);
	}
	
	public Student getStudent(){
		return this.studentObj;
	}

	/*public Student getStudyStudent() {
		return this.studyStudent;
	}

	public void setStudyStudent(Student studyStudent) {
		this.studyStudent = studyStudent;
	}*/
}
