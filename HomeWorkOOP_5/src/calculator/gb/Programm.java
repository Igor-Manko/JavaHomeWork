package calculator.gb;


public class Programm {
    public static void main(String[] args) {
        Presenter first = new Presenter(new SumModel(),new View());
        Presenter first1 = new Presenter(new SubModel(),new View());
        Presenter first2 = new Presenter(new MultiModel(),new View());
        Presenter first3 = new Presenter(new DivModel(),new View());
        //first.startOperation();
        //first1.startOperation();
        //first2.startOperation();
        first3.startOperation();

    }
}
