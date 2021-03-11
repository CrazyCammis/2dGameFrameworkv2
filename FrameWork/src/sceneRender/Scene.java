package sceneRender;

import objects.Objects.InteractableObjects;
import objects.characters.PlayableCharacter;
import objects.items.Item;

import java.lang.reflect.Array;
import java.util.List;

public class Scene {


    private final Background sceneBackground;
    private final Array enemies;
    private final PlayableCharacter player;
    private final List<Item> items;
    private int movementSpeed;
    private  String name;
    public InteractableObjects getGoal() {
        return goal;
    }

    public void setGoal(InteractableObjects goal) {
        this.goal = goal;
    }

    public InteractableObjects goal;


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


    public Scene(Background sceneBackground, Array enemies, PlayableCharacter player, List<Item> items, String name, InteractableObjects goal) {

        this.sceneBackground = sceneBackground;
        this.enemies = enemies;
        this.player = player;
        this.items = items;
        this.name = name;
        this.goal = goal;
    }

//SPEED MOVMENT IDEA
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
