class TimeTable{
    int year;
    String[]day={"Mon","Tues","Wed","Thurs","Fri","Sat"};
    int[]period={1,2,3,4,5,6,7};
    String[] batch={"4MW24CS","4MW23CS","","4MW22CS","4MW21CS","4MW20CS"};
    String[]subject={"OOPJ"};
    String[]faculty={"Kuthyar Sir","Chandrashekar Sir","Chitra Mam"};
    String[]sections={"A","B","C"};
    boolean isLab;
    String section;
    TimeTable(int y1,String s1){
        this.year=y1;
        this.section=s1;
    }
    public void printTimeTable(){
        String heading=year+"-"+batch[year-1];
        System.out.println(" TimeTable of Year "+heading+" Section "+section);
    }
}
public class B8 {
    public static void main(String[] args){
        TimeTable tt2A=new TimeTable(2,"A");
        TimeTable tt2B=new TimeTable(2,"B");
        tt2A.printTimeTable();
        tt2B.printTimeTable();
    }
}