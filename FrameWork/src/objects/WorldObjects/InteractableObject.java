package objects.WorldObjects;

import sceneRender.Scene;

public class InteractableObject implements Interaction{
    int width, height, posX, posY;
    String objectPath;
    Scene scene;
    Interaction interaction;

    public InteractableObject(int width, int height, int posX, int posY, String objectPath) {
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
        this.objectPath = objectPath;

    }
}
