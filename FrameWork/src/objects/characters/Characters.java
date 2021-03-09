package objects.characters;

import objects.items.Equippable;

public abstract class Characters {
    int hp, width, height;
    String name, modelPath;
    //int dmg;
    Equippable weapon;

    public Characters(int hp, int width, int height, String name, String modelPath, Equippable weapon) {
        this.hp = hp;
        this.width = width;
        this.height = height;
        this.name = name;
        this.modelPath = modelPath;
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelPath() {
        return modelPath;
    }

    public void setModelPath(String modelPath) {
        this.modelPath = modelPath;
    }

    public Equippable getWeapon() {
        return weapon;
    }

    public void setWeapon(Equippable weapon) {
        this.weapon = weapon;
    }
}
