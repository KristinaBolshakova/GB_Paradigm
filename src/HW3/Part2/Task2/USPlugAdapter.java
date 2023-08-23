package HW3.Part2.Task2;

public class USPlugAdapter {
    private final ElectricSocket socket;

    public USPlugAdapter(ElectricSocket socket) {
        this.socket = socket;
    }

    public void adapterVoltage(int voltage){
        int newVolt = voltage * 2;

        this.socket.supplyElectricity(newVolt);
    }
}
