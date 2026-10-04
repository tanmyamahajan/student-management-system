import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<Student> students=new ArrayList<>();


       boolean value=true;
       while(value){
           System.out.println("Enter what you want to do(enter your choice):");
           System.out.println("1.Add student");
           System.out.println("2.View students");
           System.out.println("3.Search student");
           System.out.println("4.Update marks");
           System.out.println("5.Delete student");
           System.out.println("6.Exit");
           System.out.println("Enter a Choice");
           int choice=sc.nextInt();
           switch(choice) {

               case 1:
                   System.out.println("Enter roll no.");
                    int rollNumber=sc.nextInt();
                   String buffer=sc.nextLine();
                   System.out.println("enter name");
                   String name=sc.nextLine();
                   System.out.println("Enter marks");
                    double marks=sc.nextDouble();
                    Student s=new Student(name,rollNumber,marks);
                    students.add(s);
                   System.out.println("Student added successfully");
                   break;

               case 2:

                   if(students.isEmpty()){
                       System.out.println("No student found");
                   }else{
                       for(Student i:students){
                           i.display();
                           System.out.println(" ");
                       }
                   }
                   break;

               case 3:
                   System.out.println("Enter the roll Number you want to search");
                   int target=sc.nextInt();
                   boolean found=false;
                   for(Student i:students){
                       if(target == i.getRollNumber()){
                           found=true;
                           i.display();
                           break;
                       }
                   }
                   if(found==false){
                       System.out.println("not found");
                   }
                   break;

               case 4:
                   System.out.println("Enter the roll Number you want to update");
                   int updateRollNumber=sc.nextInt();
                   boolean updated=false;
                   for(Student i:students){
                       if(updateRollNumber == i.getRollNumber()){
                           updated=true;
                           System.out.print("Enter New Marks: ");
                           double newMarks = sc.nextDouble();
                           i.setMarks(newMarks);
                           System.out.println("marks updated");
                           break;
                       }
                   }
                   if(!updated){
                       System.out.println("not found");
                   }
                   break;

               case 5:
                   System.out.print("Enter Roll Number to delete: ");
                   int deleteRoll = sc.nextInt();
                   boolean deleted = false;

                   Iterator<Student> it = students.iterator();

                   while (it.hasNext()) {
                       Student x= it.next();

                       if (x.getRollNumber() == deleteRoll) {
                           it.remove();
                           System.out.println("Student deleted successfully!");
                           deleted = true;
                           break;
                       }
                   }

                   if (!deleted) {
                       System.out.println("Student not found.");
                   }
                   break;

               case 6:value=false;
                break;
           }
       }
    }
}