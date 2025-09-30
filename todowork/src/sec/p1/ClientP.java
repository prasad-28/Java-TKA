package sec.p1;

public class ClientP {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setId (-1012002002);
		p1.setId(212121);
		//p1.setName("mani");
		p1.setName(" ");
		p1.setAge (-27);
		p1.setAge(37);
		
		System.out.println(p1.getId() + " " + p1.getName() + " "+ p1.getAge());
	}
}
