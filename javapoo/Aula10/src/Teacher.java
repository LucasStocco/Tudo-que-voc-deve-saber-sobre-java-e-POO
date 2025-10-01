package src;

public class Teacher extends Person {
    //Atributos
    private String specialty;
    private float salary;

    //Métodos
    public void receiveAReise(float increase) {
        this.salary += increase;
    }

    //Métodos Especiais
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



}
