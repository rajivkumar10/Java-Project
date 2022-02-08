package designpatterns;

import java.util.ArrayList;
import java.util.List;

interface Subject {
    void attach(Observer observer);
    void detach(Observer obeserver);
    void notifyUpdate(Message message);
}

interface Observer {
    void update(Message message);
}

class Message {
    private String message;
    public Message(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}


class MessagePublisher implements Subject {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer obeserver) {
        observerList.remove(obeserver);
    }

    @Override
    public void notifyUpdate(Message message) {
        for(Observer observer : observerList) {
            observer.update(message);
        }
    }
}

class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Subscriber One: " + message.getMessage());
    }
}
class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Subscriber Two: " + message.getMessage());
    }
}

public class ObserverPattern {
    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();
        MessageSubscriberOne subscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo subscriberTwo = new MessageSubscriberTwo();
        publisher.attach(subscriberOne);
        publisher.attach(subscriberTwo);
        publisher.notifyUpdate(new Message("Hello Subscribers"));
        publisher.detach(subscriberOne);
        publisher.notifyUpdate(new Message("Second message"));
    }
}
