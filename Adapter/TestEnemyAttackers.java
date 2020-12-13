package Adapter;

public class TestEnemyAttackers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EnemyTank rx7Tank = new EnemyTank();
		
		EnemyRobot fredTheRobot = new EnemyRobot();
		
		EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
		
		System.out.println("The Robot");
		
		fredTheRobot.reactToHuman("Paul");
		fredTheRobot.walkForward();
		fredTheRobot.smashWithHands();
		System.out.println();
		
		System.out.println("The Enemy Tank");
		
		rx7Tank.assignDriver("Frank");
		rx7Tank.driverForward();;
		rx7Tank.fireWeapon();
		System.out.println();
		
		System.out.println("The Robot with Adapter");
		
		robotAdapter.assignDriver("Mark");
		robotAdapter.driverForward();
		robotAdapter.fireWeapon();

	}

}
