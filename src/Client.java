
public class Client {
    public static void main(String[]args){
        Book b=new TextBook();
        Book b1=new Magazine();
        System.out.println("------------");
        //Creating first decorator object
        BookDecorator decorator=new TransparentCover(b);
        decorator.handleBook();

        System.out.println("-------------");
        //Creating second decorator object,Thats y there is aggregation used.
        decorator=new BrownCover(b1);
        decorator.handleBook();

    }
}
