import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClinicPatient {


    public static void main(String[] args) {

        RegistraturaService clinic = new RegistraturaService();
        clinic.addPatient(new Patient(1, "Шпак", "Сергей","Михайлович", "ул.Лобанка 22-108","36740283",123,"здоров"));
        clinic.addPatient(new Patient(1, "Шпаков", "Иван","Федорович", "ул.Китайская 1899-5899","173140283",1123,"здоров"));
        clinic.addPatient(new Patient(1, "Иванова", "Анна","Федоровна", "пр.Пушкина 2-83","017-302-33-83",351755,"здоров"));
        clinic.addPatient(new Patient(1, "Иванова", "Алла","Юоьевна", "пр.Пушкина 2-83","017-302-33-83",3517436,"почти здорова"));
        clinic.addPatient(new Patient(1, "Скучная", "Жозефина","Юлиановна", "ул.Веселая 15-15","332-26-77",35176,"нуждается в наблюдении"));
        clinic.addPatient(new Patient(1, "Юбкин", "Гавриил","Михайлович", "пос.Голубки 69","29740283",23123,"здоров"));
        clinic.addPatient(new Patient(1, "Брюшко", "Дориан","Эдмундович", "пос. Дивнфе дороги 13","65724722",9843123,"здоров"));
        clinic.addPatient(new Patient(1, "Хлебная", "Галина","Анифантьевна", "ул.Вашингтонская 17-18","999-888-666",35176,"здорова"));
        clinic.addPatient(new Patient(1, "Зюзя", "Алевтина","Макаровна", "пр.Кремля 12-723","211-11-21",12517436,"почти здорова"));
        clinic.addPatient(new Patient(1, "Юсупов", "Султан-Оглы","Равшатович", "пр.Задесная 1-1","211-11-12",351754,"нуждается в наблюдении"));

        System.out.println("\n\nPatientes with card range between 1100 - 351755 ");
        ArrayList<Patient> listCardid = clinic.selectPatientFromDiapazonByCardnumber(1100,351755);

        System.out.println("\n\nPatients who have diagnoz - нуждается в наблюдении");
        ArrayList<Patient> listDiagnoz = clinic.selectPatientByDiagnoz("нуждается в наблюдении");
    }
}


class Patient{
    int id;
    String familyName;
    String name;
    String surname;
    String adress;
    String phoneNumber;
    int cardNumber;
    String diagnos;

    public int getId() {
        return id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getDiagnos() {
        return diagnos;
    }

    public Patient(int id, String familyName, String name, String surname, String adress, String phoneNumber, int cardNumber, String diagnos) {
        this.id = id;
        this.familyName = familyName;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.diagnos = diagnos;
    }

    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", familyName='" + familyName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cardNumber=" + cardNumber +
                ", diagnos='" + diagnos + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }
}

class RegistraturaService{

    private ArrayList<Patient> patientsList = new ArrayList<>();

    void addPatient (Patient patient){
        patientsList.add(patient);
    }

    public ArrayList<Patient> selectPatientFromDiapazonByCardnumber(int cardDiapazonBegin, int cardDiapazonEnd){
        ArrayList<Patient> selectedByCardnumber = new ArrayList<>(patientsList);
        for(Patient pat : selectedByCardnumber){
            if (pat.getCardNumber()<=cardDiapazonEnd && pat.getCardNumber()>=cardDiapazonBegin){
                //patientsList.add(pat);
                System.out.println(pat);
            }
        }
        return patientsList;
    }

    public ArrayList<Patient> selectPatientByDiagnoz(String lookDiagnoz){
        ArrayList<Patient> selectedByDiapazon = new ArrayList<>(patientsList);
        for(Patient pat : selectedByDiapazon){
            if (pat.getDiagnos()==lookDiagnoz){
                System.out.println(pat);
            }
        }
        return  patientsList;
    }
}