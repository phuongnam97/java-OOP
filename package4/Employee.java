package package4;

public class Employee {

    private long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private long birthday;
    private double workinghours;
    private double salaryperhour;
    private long joineddate;
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setBirthday(long birthday) {
        this.birthday = birthday;
    }

    public double getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(double workinghours) {
        this.workinghours = workinghours;
    }

    public double getSalaryperhour() {
        return salaryperhour;
    }

    public void setSalaryperhour(double salaryperhour) {
        this.salaryperhour = salaryperhour;
    }

    public long getJoineddate() {
        return joineddate;
    }

    public void setJoineddate(long joineddate) {
        this.joineddate = joineddate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Employee() {
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                ", workinghours=" + workinghours +
                ", salaryperhour=" + salaryperhour +
                ", joinedday=" + joineddate +
                ", status=" + status +
                '}';
    }
}
