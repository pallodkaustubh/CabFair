package service;

public class cab_mananger {

	public double mini(double km) {

		double fare = km * 10;
		double servicecharge = 0.05;
		double BillAmt = fare + fare * servicecharge;
		return BillAmt;
	}

	public double prime(double km) {
		double fare = km * 20;
		double servicecharge = 0.1;
		double BillAmt = fare + fare * servicecharge;
		return BillAmt;
	}

	public double micro(double km) {
		double fare = km * 15;
		double servicecharge = 0.08;
		double BillAmt = fare + fare * servicecharge;
		return BillAmt;
	}
}
