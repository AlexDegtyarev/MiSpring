package geekbrains.lesson1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("patient")
public class Patient implements IPatient {
    @Value("Иван")
    private String namePatient;

    @Override
    public String getNamePatient() {
        return namePatient;
    }

    @Override
    public void appointment() {
        System.out.println("Пациент " + namePatient + " пришел записаться на прием к врачу в регистратуру");
    }
}
