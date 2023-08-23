

package HW3.Part1;

public class Person implements Observer{
    String name;
    int age;

    /**
     *
     * @param name - имя Person
     * @param age - возраст Person
     *
     * Конструктор класса Person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Getters and Setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void introduce(){
        System.out.println("Имя - " + name);
        System.out.println("Возраст - " + age);
    }

    @Override
    public void update() {
        System.out.println(name + " " + "доступен товар для заказа");
    }
}
