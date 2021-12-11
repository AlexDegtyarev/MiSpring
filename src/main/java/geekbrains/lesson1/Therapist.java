package geekbrains.lesson1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("therapist")
public class Therapist implements Doctor {
    @Value("15")
    private int officeNumber;

    @Override
    public int getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public void refferalDoctor() {
        System.out.println("Пациент получил направление к терапевту в кабинет №" + getOfficeNumber());
    }
}
