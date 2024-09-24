class Human{
    public void job(){
    System.out.println("Working professional");
    }
}
class Teacher extends Human{
    public void job(){
    System.out.println("Teacher");
    }
}
class Doctor extends Human{
    public void job(){
    System.out.println("Doctor");
    }
}
public class B7{
    public static void main(String[] args){
    Human anu=new Human();
    Teacher bhanu=new Teacher();
    Doctor chandru=new Doctor();
    Human suresh=new Doctor();
    anu.job();
    bhanu.job();
    chandru.job();
    suresh.job();
    }
}