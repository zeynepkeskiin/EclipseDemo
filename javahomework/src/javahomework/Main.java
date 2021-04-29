package javahomework;


public class Main {

	public static void main(String[] args) {
		System.out.println("Kodlama.io Sitesi");
        Course course1 = new Course (1,"Java Kursu ", "Engin Demiro� ","Zeynep Keskin");
        Course course2= new Course(2, "C# Kursu ","Engin Demiro� " ,"Zeynep Keskin");
        Course course3= new Course(3, "Programlamaya Giri� ", "Engin Demiro� ", "Zeynep Keskin");
        
        
        Course[]courses= {course1,course2,course3};
      
        for (Course course : courses) {
        	System.out.println("Kurs Ad�: " + course.name +"| "+ "��retmen Ad�: "+ course.teacher + "| " +"��renci Ad�: "+ course.student);
			
		}
     
        System.out.println("**********************************");
        Category category1= new Category(1,"Java","Engin Demiro�","Zeynep Keskin");
        Category category2= new Category(2,"C#","Engin Demiro�","Zeynep Keskin");
        Category category3= new Category(3,"Programlama","Engin Demiro�","Zeynep Keskin");
        Category [] categories= {category1,category2,category3};
        for (Category category : categories) {
        	System.out.println("Kategori Ad�: " + category.name );
			
		}
        
        System.out.println("**********************************");
        CourseManager courseManager= new CourseManager();
        courseManager.addToCourse(course1);
        courseManager.addToCourse(course2);
        courseManager.addToCourse(course3);
        System.out.println("**********************************");
        courseManager.deleteToCourse(course1);
        courseManager.deleteToCourse(course2);
        courseManager.deleteToCourse(course3);
        
        
        
	}

}
