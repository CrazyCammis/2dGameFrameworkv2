package objects.Objects;

import sceneRender.Scene;

public class InteractableObjects implements Interaction{
    int width, height, posX, posY;
    String objectPath;
    Scene scene;
    Interaction interaction;

    public InteractableObjects(int width, int height, int posX, int posY, String objectPath, Scene scene, Interaction interaction) {
        this.width = width;
        this.height = height;
        this.posX = posX;
        this.posY = posY;
        this.objectPath = objectPath;
        this.scene = scene;
        this.interaction = interaction;
    }
}
