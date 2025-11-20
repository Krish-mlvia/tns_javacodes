package OOPs;

class Course //parent class //base class //super class
{
	String courseName="Java ";
	
	void showCourse()
	{
		System.out.println("Course :"+courseName);
	}
}
class Student extends Course //child //derived class //sub class
{
	String studentName="Amit";
	
	void showStudent()
	{
		System.out.println("Student  :"+studentName);
	}
}


public class singlelevel {

	public static void main(String[] args) {
		Student obj=new Student(); //child class
		obj.showCourse();
		obj.showStudent();

	}

}
