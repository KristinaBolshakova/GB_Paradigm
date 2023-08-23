//Шаблон Наблюдатель:
//Реализуйте паттерн Наблюдатель на языке Python (сделала на Java) для системы уведомлений.
// Создайте класс NotificationSystem (наблюдаемый объект),
// который будет иметь методы для добавления наблюдателей и уведомления о событиях.
// Создайте несколько наблюдателей, реагирующих на уведомления.

package HW3.Part1;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem implements Observable{
    private final List<Observer> observers = new ArrayList<>();

    /**
     *
     * @param observer - наблюдатель
     * метод добавления
     */
    public void add(Observer observer) {
        observers.add(observer);
    }

    //метод удаления
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    //метод оповещения
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
