
public class Main {

	public static void main(String[] args) {
		
		Cours cours1=new Cours(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)",1,"Engin Demirog");
		
		Cours cours2=new Cours(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",2,"Engin Demirog");
		
		Category category1= new Category();
		
		  category1.setId(1);
	      category1.setName("C#");
	        

	    Category category2= new Category();
			
	      category2.setId(2);
		  category2.setName("Java");
		  
		  

	    Cours[] Courses = {cours1, cours2};
		  
		for (Cours cours :Courses) {
		 System.out.println(cours.getName()+ cours.getInstructorName());
		}
		  
		Category[] Categories = {category1, category2};
		  
		 for (Category category :Categories) {
			 System.out.println(category.getName());
		 }
		  
		 
		CoursManager coursManager =new CoursManager();
		coursManager.addCours(cours2);

		
		  
		        
	}

}
