package main.java;

class Monitor {
    private String manufacturer;
    private int size;

    public Monitor(String manufacturer, int size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public void turnOn() {
        System.out.println(size + "인치 " + manufacturer + " 모니터를 켭니다.");
    }

    public void turnOff() {
        System.out.println(size + "인치 " + manufacturer + " 모니터를 끕니다.");
    }
}

class Computer {
    private String cpu;
    private int ram;

    public Computer(String cpu, int ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public void powerOn() {
        System.out.println(cpu + " CPU, " + ram + "GB RAM 컴퓨터를 켭니다.");
    }

    public void powerOff() {
        System.out.println("컴퓨터를 끕니다.");
    }
}

class PersonalComputer extends Computer {
    private Monitor monitor;

    public PersonalComputer(String cpu, int ram, Monitor monitor) {
        super(cpu, ram); // 부모 클래스 생성자 호출
        this.monitor = monitor;
    }

    @Override
    public void powerOn() {
        super.powerOn();   // 부모의 powerOn 호출
        monitor.turnOn();  // 모니터 켜기
        System.out.println("퍼스널 컴퓨터가 완전히 켜졌습니다.");
    }

    @Override
    public void powerOff() {
        monitor.turnOff(); // 모니터 끄기
        super.powerOff();  // 부모의 powerOff 호출
        System.out.println("퍼스널 컴퓨터가 완전히 꺼졌습니다.");
    }
}

public class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("LG", 27);
        PersonalComputer pc = new PersonalComputer("Intel i7", 16, monitor);

        pc.powerOn();
        pc.powerOff();
    }
}
