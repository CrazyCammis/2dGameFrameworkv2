package objects.characters;

import objects.items.Equippable;

public class Enemy extends Characters{
    public Enemy(int hp, int width, int height, String name, String modelPath, Equippable weapon, int posX, int posY) {
        super(hp, width, height, name, modelPath, weapon, posX, posY);
    }
}
