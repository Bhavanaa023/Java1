import java.util.List;
import java.util.ArrayList;
class TimeTable{
    String dayOfWeek="Mon";
    String branch;
    String classSection;
    String roomNo;
    int period;
    boolean isLab=false;
    String faculty1;
    String faculty2;
    String subject1;
    String subject2;
    TimeTable(String b1,String c,String r) {
        this.branch=b1;
        this.classSection=c;
        this.roomNo=r;
    }
    public void printTimeTable() {
        System.out.println("This is Time Table for "+branch+" Section "+classSection+" at "+roomNo);
    }
}
public class B14 {
    public static void main(String[] args) {
        System.out.println("TIme Table");
        TimeTable ttA=new TimeTable("CSE","A","A203");
        TimeTable ttB=new TimeTable("CSE","B","A204");
        ttA.printTimeTable();
        ttB.printTimeTable();
        ttA.faculty1="Kuthyar";
        ttA.faculty2="Savitha";
        ttA.subject1="OOPJ";
        ttA.subject2="OS";
        System.out.println(ttA.faculty1+"-"+ttA.subject1);
        System.out.println(ttA.faculty2+"-"+ttA.subject2);
    }
}
