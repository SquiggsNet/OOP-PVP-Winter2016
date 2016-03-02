
public class Student extends GameCharacter{

	//properties
	private int studentType;
	private int studySkill;
	private int analyticsSkill;
	private int penmanshipSkill;
	private int hatArmour = 0;
	private int topArmour = 0;
	private int bottomArmour = 0;
	private int studentBonus;
	private int studentProgress;
	private int bonusPoints;
	
	public Student(String sName, int sType, int sStudy, int sAnalitics, int sPenmanship)
	{
		this.setName(sName);
		this.setStudentType(sType);
		this.setStudySkill(sStudy);
		this.setAnalyticsSkill(sAnalitics);
		this.setPenmanshipSkill(sPenmanship);
		
	}
	
	public Student(){
		
	}
	
	public int getStudySkill() {
		return studySkill;
	}
	public void setStudySkill(int studySkill) {
		this.studySkill = studySkill;
	}
	public int getAnalyticsSkill() {
		return analyticsSkill;
	}
	public void setAnalyticsSkill(int analyticsSkill) {
		this.analyticsSkill = analyticsSkill;
	}
	public int getPenmanshipSkill() {
		return penmanshipSkill;
	}
	public void setPenmanshipSkill(int penmanshipSkill) {
		this.penmanshipSkill = penmanshipSkill;
	}

	public int getStudentBonus() {
		return studentBonus;
	}
	public void setStudentBonus(int studentBonus) {
		this.studentBonus = studentBonus;
	}
	public int getStudentProgress() {
		return studentProgress;
	}
	public void setStudentProgress(int studentProgress) {
		this.studentProgress = studentProgress;
	}
	public int getBonusPoints() {
		return bonusPoints;
	}
	public void setBonusPoints(int bonusPoints) {
		this.bonusPoints = bonusPoints;
	}
	public int getStudentType() {
		return studentType;
	}
	public void setStudentType(int studentType) {
		this.studentType = studentType;
	}
	@Override
	public double CalcWrite() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double CalcDefend() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getHatArmour() {
		return hatArmour;
	}

	public void setHatArmour(int hatArmour) {
		this.hatArmour = hatArmour;
	}

	public int getTopArmour() {
		return topArmour;
	}

	public void setTopArmour(int topArmour) {
		this.topArmour = topArmour;
	}

	public int getBottomArmour() {
		return bottomArmour;
	}

	public void setBottomArmour(int bottomArmour) {
		this.bottomArmour = bottomArmour;
	}


	
	
}
