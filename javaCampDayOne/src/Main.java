
public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category("Tümü");
		Category category2 = new Category("Programlama");
		
		Category[] categories = {category1, category2}; //categories array
		System.out.println("Kategoriler:");
		
		for(Category category :categories) {
			System.out.println(category.categoryName);
		}
		
		System.out.println("--------------"); //for getting outputs in a cleaner look
		
		CourseManager courseManager = new CourseManager();
		for(Category aCategory : categories) {
			courseManager.categoryButton(aCategory);
		}
		
		
		
		System.out.println("--------------"); //for getting outputs in a cleaner look
		
		
		Course course1 = new Course(
				"Yazılım Geliştirici Yetiştirme Kampı (C# - Angular)",
				82482443,
				"Engin Demiroğ",
				73
				);
		
		Course course2 = new Course(
				"Yazılım Geliştirici Yetiştirme Kampı (Java - React)",
				3494894,
				"Engin Demiroğ",
				98
				);
		
		Course course3 = new Course(
				"Programlamaya Giriş İçin Temel Kurs",
				3930404,
				"Engin Demiroğ",
				90
				);
		
		Course[] courses = {course1, course2, course3}; //Course Array
		
		for(Course course : courses) {
			System.out.println("-" + course.name);
		
		}
		
		System.out.println("--------------");
		
		System.out.println("//Aşağıdaki satır iş sınıfına bir örnek olarak \noluşturulmuştur.");
		
		
		
		courseManager.previousCourse(course1);
		
		
		
		System.out.println("--------------"); //for getting outputs in a cleaner look
		
		courseManager.instructPreference(course3);
		
		
		
		
		

	}

}
