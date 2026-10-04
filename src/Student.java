public class Student{
    private int rollNumber;
    private String name;
    private double marks;

    public Student(String name,int rollNumber,double marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setMarks(double marks){
        this.marks=marks;
    }
    public double getMarks(){
        return marks;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public void display(){
        System.out.println("Name:"+ getName());
        System.out.println("RollNumber:"+ getRollNumber());
        System.out.println("Marks:"+ getMarks());

    }
}

