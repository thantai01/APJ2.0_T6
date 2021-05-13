package demo;

public class Teacher extends Person implements Comparable<Teacher>{
    private String workPlace;
    private int salary;

    public Teacher(String workPlace, int salary, String name, int age) {
        this.workPlace = workPlace;
        this.salary = salary;
        setName(name);
        setAge(age);
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void saySth() {
        System.out.println(" Hello every body!!!");
    }

    @Override
    public int compareTo(Teacher o) {
        return 0;
    }
}
