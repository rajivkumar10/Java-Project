package designpatterns;

@FunctionalInterface
interface ICommand {
    void execute();
}

class Fan {
    public void start() {
        System.out.println("Fan started");
    }
    public void stop() {
        System.out.println("Fan stopped");
    }
}

class Light {
    public void on() {
        System.out.println("Light on");
    }
    public void off() {
        System.out.println("Light off");
    }
}

class FanStartCommand implements ICommand {
    Fan fan;
    public FanStartCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.start();
    }
}
class FanStopCommand implements ICommand {
    Fan fan;
    public FanStopCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.stop();
    }
}

class LightOnCommand implements ICommand {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}

class LightOffCommand implements ICommand {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}

class Remote {
    ICommand iCommand;
    public void setCommand(ICommand command) {
        this.iCommand = command;
    }
    public void buttonPressed() {
        iCommand.execute();
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        Remote remote = new Remote();
        Fan fan = new Fan();
        Light light = new Light();

        remote.setCommand(new FanStartCommand(fan));
        remote.buttonPressed();

        remote.setCommand(new LightOnCommand(light));
        remote.buttonPressed();

    }
}
