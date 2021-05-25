package character;

import weapon.Weapon;

public class Character {

    private String name;
    private int age;
    private Race race;
    private Weapon weapon;

    public Character(String name, int age, Race race, Weapon weapon) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", race=" + race +
                ", weapon=" + weapon +
                '}';
    }
}
