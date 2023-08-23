//Адаптер:
//Создайте класс ElectricSocket, который имеет метод supply_electricity(voltage).
// Реализуйте класс USPlugAdapter, который адаптирует розетку стандарта США к европейскому стандарту.
// Создайте объекты и продемонстрируйте передачу электроэнергии через адаптер.

package HW3.Part2.Task2;

public class Main {
    public static void main(String[] args) {
        // Подача электроэнергии через обычную розетку
        ElectricSocket electricSocket = new ElectricSocket();
        electricSocket.supplyElectricity(220); // Подача электроэнергии с напряжением 220 Вольт

        // Использование адаптера для подачи электроэнергии через розетка евростандарта
        USPlugAdapter usPlugAdapter = new USPlugAdapter(electricSocket);
        usPlugAdapter.adapterVoltage(110); // Подача электроэнергии с напряжением 110 Вольт

    }
}
