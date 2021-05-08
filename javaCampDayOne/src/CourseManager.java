
public class CourseManager {
	
	//Purpose is to simulate "Önceki Ders" button, category and instructor preference buttons.
	
	public void previousCourse(Course courses) {
		System.out.println(courses.name + " kursunda önceki derse geçtiniz.");
	}
	
	
	public void categoryButton(Category categories) {
		System.out.println("Kurs kategorisi seçildi.");
	}
	
	public void instructPreference(Course courses) {
		System.out.println("Eğitmen seçildi: " + courses.instructorName);
	}

}
