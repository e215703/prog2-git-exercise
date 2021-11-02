package jp.ac.uryukyu.ie.e215703.library;

public class RentalBook {
    // フィールド（クラス変数）
    public String title;
    public int barcode;

    // コンストラクタ
    public RentalBook(String _title, int _barcode){
        this.title = _title;
        this.barcode = _barcode;
    }

    // staticなしメソッド例
    public void printSummary(){
        System.out.println("title =" + this.title + ", barcode = " + this.barcode);
    }
}
