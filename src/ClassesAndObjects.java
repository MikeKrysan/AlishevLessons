public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-1);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());




    }
}

class Person{
    private String name;
    private int age;

    public void setName(String username){
       if(username.isEmpty()){
            System.out.println("Ты ввел пустое имя");
        }   else{
            name = username;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userage){
        if(userage<0){
            System.out.println("Возраст должен быть положитеным");
        } else {
            age = userage;
        }
    }

    public int getAge(){
        return age;
    }



    void speak(){
        for(int i = 0; i<3; i++){
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");

        }
    }

}