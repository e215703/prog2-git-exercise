import jp.ac.uryukyu.ie.e215703.library.*;

public class Main {
    public static void main(String[] args){
        //貸し出し図書の準備
        RentalBook book1 = new RentalBook("何故ルートビアは美味いのか", 123);
        System.out.println(book1.title);
        book1.printSummary();

        RentalBook book2 = new RentalBook("ルートビアの歴史", 456);
        book2.printSummary();

        //顧客の準備
        Member teacher = new Member(945734, "naltoma");
        System.out.println(teacher.getName());

        //貸出の例
        RentalLog log = new RentalLog(teacher, book1);
        log.getRentalEndPlan();
    }    
}