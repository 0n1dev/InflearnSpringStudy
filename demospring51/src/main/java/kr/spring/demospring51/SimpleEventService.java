package kr.spring.demospring51;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService {

    @TimeCheck
    @Override
    public void createEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created");
    }

    @TimeCheck
    @Override
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Publish");
    }

    @Override
    public void deleteEvent() {
        System.out.println("Deleted");
    }
}
