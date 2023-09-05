package HW3.Part2.Task2;

public class USPlugAdapter {
    private final ElectricSocket socket;
    /**
     *
     * @param socket - розетка
     */
    public USPlugAdapter(ElectricSocket socket) {
        this.socket = socket;
    }

    /**
     *
     * @param voltage - напряжение
     */
    public void adapterVoltage(int voltage){
        int newVolt = voltage * 2; //Пример конвертации напряжения для адаптера

        this.socket.supplyElectricity(newVolt);
    }
}
