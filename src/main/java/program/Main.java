package program;

import weapon.WeaponRepository;
import weapon.WeaponService;
import weapon.WeaponType;

public class Main {
    public static void main(String[] args) {
        WeaponRepository weaponRepository = new WeaponRepository();
        WeaponService weaponService = new WeaponService();

        weaponService.addWeapon("Miecz", WeaponType.SWORD,20);
        weaponService.showAllWeapons();
        weaponService.editWeapon(0,"Siekiera",WeaponType.AXE,30);
        weaponService.addWeapon("Miecz", WeaponType.SWORD,20);
        weaponService.showAllWeapons();
    }
}
