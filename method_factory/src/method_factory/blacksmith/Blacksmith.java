package method_factory.blacksmith;

import method_factory.weapons.Weapon;
import method_factory.weapons.WeaponType;

public interface Blacksmith {
	Weapon manufactureWeapon(WeaponType weaponType);
}
