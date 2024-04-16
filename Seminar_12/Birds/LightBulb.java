package Seminar_12.Birds;

class LightBulb implements TurnOnOf {

    @Override
    public void turnOn() {
        System.out.println("Прибор включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Прибор выключен");
    }

}

class Switch {
    private TurnOnOf bulb;

    public Switch(TurnOnOf bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        // Работа с выключателем
        bulb.turnOn();
    }
}