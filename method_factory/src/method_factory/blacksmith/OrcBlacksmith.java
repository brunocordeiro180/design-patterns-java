package method_factory.blacksmith;

import java.util.Map;

import method_factory.weapons.Weapon;
import method_factory.weapons.WeaponType;
import method_factory.weapons.ElfWeapon;

public class OrcBlacksmith implements Blacksmith {
	  private static final Map<WeaponType, ElfWeapon> ELFARSENAL = null;

	public Weapon manufactureWeapon(WeaponType weaponType) {
	    return ELFARSENAL.get(weaponType);
	  }
	}
