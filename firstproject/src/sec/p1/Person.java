package sec.p1;

public class Person {
	private int id;
	String name;
  private int age;
   public int getAge() {
	return age;
   }
   public void setAge(int age) {
	   if (age>0)
	this.age = age;
   }
   public int getId() {
	return id;
   }
   public void setId(int id) {
	   if(id>0)
	this.id = id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   
}
