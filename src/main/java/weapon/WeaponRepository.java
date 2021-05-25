package weapon;

import java.util.ArrayList;
import java.util.List;

public class WeaponRepository {

    private List<Weapon> weaponList = new ArrayList<>();

    void addWeapon(String weaponName, WeaponType weaponType, int damage){
        Weapon weapon = new Weapon(weaponName,weaponType,damage);
        weaponList.add(weapon);
    }

    List<Weapon> showAllWeapons(){
        for (Weapon weapon : weaponList) {
            System.out.println(weapon);
        }
        return weaponList;
    }

    Weapon editWeapon(int number,String name,WeaponType weaponType,int damage){
        Weapon weapon = weaponList.get(number);
        weapon.setWeaponName(name);
        weapon.setWeaponType(weaponType);
        weapon.setDamage(damage);
        weaponList.set(number,weapon);
        return weapon;
    }

}
