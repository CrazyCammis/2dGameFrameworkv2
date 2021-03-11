package objects.items;

public abstract class Item {

    private final int posX, posY;
    private String imageFile;

    public Item(int posX, int posY, String imageFile){
        this.posX = posX;
        this.posY = posY;
        this.imageFile = imageFile;
    }



    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
}