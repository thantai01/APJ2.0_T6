package demo;

public class Student extends Person{
    private String className;
    private String address;

    public Student(String className, String address,String name, int age) {
        this.className = className;
        this.address = address;
        setName(name);
        setAge(age);
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void saySth() {
        System.out.println("Hi sir!!");
    }

}
