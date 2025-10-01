public class StringComparison {
    public static void main(String[] args) {
        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;

            }
            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true; //Comparaão de referência
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }

                Person person = (Person) obj;
                return age == person.age && name.equals(person.name);
            } 
        }
    }
}
