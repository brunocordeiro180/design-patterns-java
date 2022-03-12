import java.util.Scanner;

public class EnemyShipTesting {
	public static void main(String[] args) {
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip enemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		String typeOfShip = "";
		
		System.out.println("What type of Ship? (U / R)");
		
		if(userInput.hasNextLine()) {
			typeOfShip = userInput.nextLine();
			enemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if(enemy != null) {
			doStuffEnemy(enemy);
		}
	}
	
	public static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}
}
