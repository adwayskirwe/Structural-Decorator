
public class TransparentCover extends BookDecorator {
    //In constructor accept the object whose functionality we want to add.!

    public TransparentCover(Book b){
        currBook=b;
    }
    public void handleBook(){
        System.out.println("Putting on the transparent cover");//Adding additonal functionality before
        currBook.handleBook();
    }
}
