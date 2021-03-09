package objects.characters;

import objects.items.Equippable;

public class Enemy {
    int hp, width, height;
    String name, modelPath;
    //int dmg;
    Equippable weapon;

    public Enemy(int hp, int width, int height, String name, String modelPath, Equippable weapon) {
        this.hp = hp;
        this.width = width;
        this.height = height;
        this.name = name;
        this.modelPath = modelPath;
        this.weapon = weapon;
    }
}
