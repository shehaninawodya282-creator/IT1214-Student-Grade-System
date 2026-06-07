class Student{
	String studentId;
	String name;
	int marks;
	
	Student(String studentId,String name,int marks){
		this.studentId=studentId;
		this.name=name;
		this.marks=marks;
	}
	public  String getStudentId(){
		return studentId;
	}
	public String getName(){
		return name;
	}
	public int getMarks(){
		return marks;
	}
	 public String toString() {
        return "ID: " + studentId + ", Name: " + name + ", Marks: " + marks;
    }
}
