package HW3.Part1;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();

        Person person1 = new Person("Andrey", 20);
        Person person2 = new Person("Dmitriy", 15);
        Person person3 = new Person("Kris", 30);

        notificationSystem.add(person1);
        notificationSystem.add(person2);
        notificationSystem.add(person3);

        notificationSystem.notifyObservers();

        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
}
