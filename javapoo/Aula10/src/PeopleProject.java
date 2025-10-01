package src;

public class PeopleProject {
    public static void main(String[] args) {
        //Programa Principal
        Person p1 = new Person();
        Student p2 = new Student();
        Teacher p3 = new Teacher();

        p1.setName("Lucas");
   

        p1.setAge(17);
        p1.setSex("M");


        System.out.println(p1.toString());

    }
}
