import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClinicPatient {


    public static void main(String[] args) {

        RegistraturaService clinic = new RegistraturaService();
        clinic.addPatient(new Patient(1, "����", "������","����������", "��.������� 22-108","36740283",123,"������"));
        clinic.addPatient(new Patient(1, "������", "����","���������", "��.��������� 1899-5899","173140283",1123,"������"));
        clinic.addPatient(new Patient(1, "�������", "����","���������", "��.������� 2-83","017-302-33-83",351755,"������"));
        clinic.addPatient(new Patient(1, "�������", "����","�������", "��.������� 2-83","017-302-33-83",3517436,"����� �������"));
        clinic.addPatient(new Patient(1, "�������", "��������","���������", "��.������� 15-15","332-26-77",35176,"��������� � ����������"));
        clinic.addPatient(new Patient(1, "�����", "�������","����������", "���.������� 69","29740283",23123,"������"));
        clinic.addPatient(new Patient(1, "������", "������","����������", "���. ������ ������ 13","65724722",9843123,"������"));
        clinic.addPatient(new Patient(1, "�������", "������","������������", "��.������������� 17-18","999-888-666",35176,"�������"));
        clinic.addPatient(new Patient(1, "����", "��������","���������", "��.������ 12-723","211-11-21",12517436,"����� �������"));
        clinic.addPatient(new Patient(1, "������", "������-����","����������", "��.�������� 1-1","211-11-12",351754,"��������� � ����������"));

        System.out.println("\n\nPatientes with card range between 1100 - 351755 ");
        ArrayList<Patient> listCardid = clinic.selectPatientFromDiapazonByCardnumber(1100,351755);

        System.out.println("\n\nPatients who have diagnoz - ��������� � ����������");
        ArrayList<Patient> listDiagnoz = clinic.selectPatientByDiagnoz("��������� � ����������");
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