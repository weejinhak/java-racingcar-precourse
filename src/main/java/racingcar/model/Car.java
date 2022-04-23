package racingcar.model;

public class Car {
	public static final int BOUNDARY_VALUE = 4;
	public static final int DISTANCE = 1;

	private final String carName;
	private int distance;

	public Car(String carName) {
		this.carName = carName;
		this.distance = 0;
	}

	public void advance(int randomNumber) {
		if (randomNumber >= BOUNDARY_VALUE) {
			this.distance += DISTANCE;
		}
	}

	public int getDistance() {
		return this.distance;
	}

	public String getCarName() {
		return this.carName;
	}
}
