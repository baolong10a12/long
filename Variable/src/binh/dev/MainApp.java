package binh.dev;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 9;
        Person p = new Person();
        p.name = "Person 1";
        
        p.nameSchool = "HaNoi UNI";
        
        Person p2 = new Person();
        p2.name = "Person";
        
        p2.nameSchool = "DaNang UNI";
        
        
        System.out.println(p.name);
        System.out.println(p.nameSchool);
        
        System.out.println(p2.name);
        System.out.println(p2.nameSchool);
        
        System.out.println(Person.nameSchool);
        
        final double PI = 3.14;
	}

}
