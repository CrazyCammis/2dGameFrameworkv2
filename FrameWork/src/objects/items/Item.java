package objects.items;

public abstract class Item {

    private final int x, y;
    private String imageFile;

    public Item(int x, int y, String imageFile){
        this.x = x;
        this.y = y;
        this.imageFile = imageFile;
    }
}