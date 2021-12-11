package geekbrains.lesson1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("registry")
public class Registry {
    IPatient patient;
    Doctor doctor;

    @Autowired
    public void setPatient(IPatient patient) {
        this.patient = patient;
    }

    @Autowired
    @Qualifier("therapist")
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void searchCardAndRef() {
        patient.appointment();
        System.out.println("Регистратура ищет карточку пациента " + patient.getNamePatient());
        doctor.refferalDoctor();
    }
}
