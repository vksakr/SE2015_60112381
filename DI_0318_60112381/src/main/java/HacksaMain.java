import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HacksaMain {
	public static void main(String[] args){

		//Professor professor = new Professor("choi");
		//Lecture  lecture1 = new Lecture("소프트웨어 공학");
		
		ApplicationContext factory = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		
		Professor professor = (Professor)factory.getBean("professor");
		Lecture lecture2 = (Lecture)factory.getBean("lecture2");
		Student student2 = (Student)factory.getBean("student2");
		
		professor.addLecture(lecture2);
		lecture2.addStudent(student2);
		professor.showLecture();
	}

}
