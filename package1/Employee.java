package package1;

public class Employee {
    private long id;
    private String name;
    private long birthday;
    private String phone;
    private String email;
    private String address;
    private double workinghours;
    private double salaryperhour;
    private long joineddate;
    private int status;

    public Employee(String name, String email) {
        this.id = System.currentTimeMillis();
        this.name = name;
        this.email = email;
    }

    public Employee() {
    }

    public void setId(long id){
        this.id = id;
    }

    public long getId(){
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthday(long birthday){
        this.birthday = birthday;
    }

    public long getBirthday() {
        return birthday;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setJoineddate(long joineddate) {
        this.joineddate = joineddate;
    }

    public long getJoineddate() {
        return joineddate;
    }

    public void setSalaryperhour(double salaryperhour) {
        this.salaryperhour = salaryperhour;
    }

    public double getSalaryperhour() {
        return salaryperhour;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setWorkinghours(double workinghours) {
        this.workinghours = workinghours;
    }

    public double getWorkinghours() {
        return workinghours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", workinghours=" + workinghours +
                ", salaryperhour=" + salaryperhour +
                ", joineddate=" + joineddate +
                ", status=" + status +
                '}';
    }


}

