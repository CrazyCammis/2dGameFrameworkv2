package sceneRender;

import objects.characters.PlayableCharacter;
import objects.items.Item;
import sceneRender.Background;

import java.lang.reflect.Array;
import java.util.List;

public class Scene {


    private final Background sceneBackground;
    private final Array enemies;
    private final PlayableCharacter player;
    private final List<Item> items;
    private int movementSpeed;


    public Background getSceneBackground() {
        return sceneBackground;
    }

    public Array getEnemies() {
        return enemies;
    }

    public PlayableCharacter getPlayer() {
        return player;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }


    public Scene(Background sceneBackground, Array enemies, PlayableCharacter player, List<Item> items, int movementSpeed) {

        this.sceneBackground = sceneBackground;
        this.enemies = enemies;
        this.player = player;
        this.items = items;
        this.movementSpeed = movementSpeed;
    }


    //moves it to the left or right with a speed of 2
    private void move(String key) {


        switch (key) {
            case "D":
                this.getPlayer().setPosY(player.getPosY() + getMovementSpeed());
                break;


            case "A":
                this.getPlayer().setPosY(player.getPosY() - getMovementSpeed());
                break;

            default:
            break;
        }
    }
}
