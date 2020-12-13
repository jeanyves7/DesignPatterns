package Adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

	EnemyRobot theRobot;

	public EnemyRobotAdapter(EnemyRobot newRobot) {

		theRobot = newRobot;

	}

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		theRobot.smashWithHands();

	}

	@Override
	public void driverForward() {
		// TODO Auto-generated method stub
		theRobot.walkForward();
	}

	@Override
	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
		theRobot.reactToHuman(driverName);

	}

}
