package src;

public class Student extends Person { //Colocando a herança
    //Atributos
    private int registration;
    private String course;

    //Métodos
    public void cancelRegistration() {
        System.out.println("A matrícula será cancelada.");
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }









}
