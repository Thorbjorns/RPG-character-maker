package weapon;

public class Weapon {
    private String weaponName;
    private WeaponType weaponType;
    private int damage;

    public Weapon(String weaponName, WeaponType weaponType, int damage) {
        this.weaponName = weaponName;
        this.weaponType = weaponType;
        this.damage = damage;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "weaponName='" + weaponName + '\'' +
                ", weaponType=" + weaponType +
                ", damage=" + damage +
                '}';
    }
}
