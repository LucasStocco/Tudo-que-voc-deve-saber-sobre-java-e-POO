package src;

public class Person {
    //Atributos
    private String name;
    private Integer age;
    private String sex;

    //Método Interno
    public void haveABirthday() {
        this.age ++;
    }
    
    //Métodos Especiais
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.sex = name;
    }

    public Integer getAge() {
        return age;
        
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pessoa{");
        stringBuilder.append("nome=");
        stringBuilder.append(name);
        stringBuilder.append(", idade=");
        stringBuilder.append(age);
        stringBuilder.append(", sexo=");
        stringBuilder.append(sex);
        return stringBuilder.toString();
    }


















}
