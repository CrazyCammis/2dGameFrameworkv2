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
    public InteractableItem(int x, int y, String imageFile, String name) {
        super(x, y, imageFile);
        this.name = name;
    }
}
