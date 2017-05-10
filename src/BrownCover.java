
public class BrownCover extends BookDecorator {

    public BrownCover(Book b){
        currBook=b;
    }
    public void handleBook(){
        currBook.handleBook();
        System.out.println("Putting on brown cover");//Adding functionality afterwards
    }
}
