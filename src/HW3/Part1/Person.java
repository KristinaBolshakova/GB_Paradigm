//ООП Концепции:
//Создайте класс Person, который имеет атрибуты name, age и метод introduce(),
// выводящий информацию о человеке.
// Создайте несколько объектов этого класса и вызовите метод introduce() для каждого из них.

package HW3.Part1;

public class Person implements Observer{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
