public class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public void sayHello(){
            System.out.println("Hello, " + name);
        }

    public static void main(String[] args) {
        Person person = new Person("Sebastian");

        System.out.println(person.getName());
        person.sayHello();
        person.setName("Mecha-Sebastian");
        System.out.println(person.getName());
        person.sayHello();
    }
}
