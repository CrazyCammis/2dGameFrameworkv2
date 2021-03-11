package objects.items;

public class InteractableItem extends Item {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //-------------------------------------------------------------------------------------//
    public InteractableItem(int posX, int posY, String imageFile, String name) {
        super(posX, posY, imageFile);
        this.name = name;
    }
}
