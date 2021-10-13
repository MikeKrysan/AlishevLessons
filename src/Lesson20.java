public class Lesson20 {
    public static void main(String[] args) {

        Human1 h1 = new Human1("Bob", 40);
        Human1 h2 = new Human1("Tom", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human1 h3 = new Human1("Rob", 50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();


    }
}


class Human1 {
    private String name;
    private int age;
    private static int countPeople;

    public Human1(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }


    public void setName(String name) { this.name = name;}
    public void setAge(int age){ this.age = age;}

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }

}