
public class Cours {
	private int id;
	private String name;
	private int categoryId;
	private String instructorName;
	
	
	
	public Cours(int id, String name, int categoryId, String instructorName) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.instructorName = instructorName;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public String getInstructorName() {
		return instructorName;
	}



	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	
	
	

}
