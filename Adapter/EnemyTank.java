package Adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker {

	Random generator = new Random();

	@Override
	public void fireWeapon() {
		// TODO Auto-generated method stub
		int attackDamage = generator.nextInt(10) + 1;

		System.out.println("Enemy Tank Does " + attackDamage + " Damage");

	}

	@Override
	public void driverForward() {
		// TODO Auto-generated method stub
		 int movement = generator.nextInt(5) + 1;
		 System.out.println("Enemy Tank moves " + movement + " spaces");


	}

	@Override
	public void assignDriver(String driverName) {
		// TODO Auto-generated method stub
		 System.out.println(driverName + " is driving the tank");


	}

}
