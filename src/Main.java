public class Main {
    public static void main(String[] args) {
        fighter f1=new fighter("Muhammet Ali",10,120,100,55);
        fighter f2=new fighter("Mike Tyson",10,120,100,50);

        match match=new match(f1,f2,50,100);
        match.basla();

    }
}