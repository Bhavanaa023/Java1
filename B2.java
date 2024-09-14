class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;}
    public void raiseSalary(double percent){
        if(percent>0){
            double increment=salary*percent/100;
            salary=salary+increment;
        System.out.println("New Salary: " +salary);}
        else{
            System.out.println("Salary: "+salary);}}
    public void getEmpDetails(){
        System.out.println(name+" "+id+" "+salary);}}
public class B2{
    public static void main(String[] args){
        Employee emp1=new Employee(1,"Bhavana",5000);
        emp1.getEmpDetails();
        emp1.raiseSalary(10);
        emp1.getEmpDetails();
        }
    }