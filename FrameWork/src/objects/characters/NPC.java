package objects.characters;

import objects.items.Equippable;

public class NPC extends Characters{
    public NPC(int hp, int width, int height, String name, String modelPath, Equippable weapon, int posX, int posY) {
        super(hp, width, height, name, modelPath, weapon, posX, posY);
    }
}
