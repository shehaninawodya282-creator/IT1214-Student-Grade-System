import java.util.ArrayList;
import java.util.Scanner;

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
class Teacher{
	 ArrayList<Student> arr = new ArrayList<>();
     Scanner sc=new Scanner(System.in);
	
	public void addStudent(){
		System.out.println("Student Id :");
		String studentId = sc.nextLine();
		System.out.println("Student name :");
		String name = sc.nextLine();
		System.out.println("Student marks :");
		int marks = sc.nextInt();
		
		arr.add(new Student(studentId,name,marks));
	}
	public  void displayStudent(){
		for (Student s : arr) {
                System.out.println(s);
            }
	}
	public void searchById(){
		System.out.println("Enter Student Id to search :");
		String studentId = sc.nextLine();
		for (Student s : arr) {
			if (s.getStudentId().equals(studentId)) {
				System.out.println("Student found: " + s);
				return;
			}
			}
		System.out.println("Student not found.");

	}
	public void calculateAverage(){
		int total = 0;
		for (Student s : arr) {
			total += s.getMarks();
			}
		double avg=total/arr.size();
		System.out.println("Average marks :" + avg);
	}
}
 class Main{
	public static void main(String args[]){
		ArrayList<Student> arr=new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		Teacher teacher = new Teacher();
		
		 while (true) {
            System.out.println("-- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search by ID");
            System.out.println("4. Calculate Average");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    teacher.addStudent();
                    break;
                case 2:
                    teacher.displayStudent();
                    break;
                case 3:
                    teacher.searchById();
                    break;
                case 4:
                    teacher.calculateAverage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
	}
}
}
		
