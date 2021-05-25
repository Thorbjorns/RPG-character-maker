package weapon;

import java.util.List;

public class WeaponService {
    private WeaponRepository weaponRepository = new WeaponRepository();

    public void addWeapon(String weaponName, WeaponType weaponType, int damage){
        weaponRepository.addWeapon(weaponName,weaponType,damage);
    }

    public List<Weapon> showAllWeapons(){
        return weaponRepository.showAllWeapons();
    }

   public Weapon editWeapon(int number,String name,WeaponType weaponType,int damage){
        return weaponRepository.editWeapon(number,name,weaponType,damage);
   }
}
