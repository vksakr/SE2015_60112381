
public class Professor {
	private String name;
	private Lecture lecture;
	public Professor(){
		
	}
	public Professor(String name){
		this.name = name;
	}
	public String Name() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addLecture(Lecture lecture2) {
		this.lecture = lecture2;
		
	}
	public void showLecture() {
		System.out.println(lecture.getName());
		System.out.println(lecture.getStudent().getName());
	}
}
