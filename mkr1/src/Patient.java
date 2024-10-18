
public class Patient {

    int id;
    String name;
    String address;
    long phoneNumber;
    long medId;
    String diagnosis;

    public Patient(int id, String name, String address, long phoneNumber, long medId, String diagnosis) {
        setId(id);
        setName(name);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setMedId(medId);
        setDiagnosis(diagnosis);
    }

    public void call() {
        System.out.println("Calling patient " + name + " with medical card id " +
                medId + " by the number " + phoneNumber);
    }

    public void show(int i) {
        switch (i) {
            case 1:
                System.out.println(id);
                break;
            case 2:
                System.out.println(name);
                break;
            case 3:
                System.out.println(address);
                break;
            case 4:
               System.out.println(phoneNumber);
               break;
            case 5:
               System.out.println(medId);
               break;
            case 6:
               System.out.println(diagnosis);
               break;
            case 7:
                System.out.println(toString());
                break;
            default:
                System.out.println("Please enter a valid number");
                break;
        }
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", medId=" + medId +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getMedId() {
        return medId;
    }

    public void setMedId(long medId) {
        this.medId = medId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
