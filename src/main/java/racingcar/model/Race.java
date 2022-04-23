package racingcar.model;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Race {
	private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private List<Car> carList = new ArrayList<>();

	public void inputCarNames() {
		System.out.println(INPUT_CAR_NAME);
		String carNames = Console.readLine();
		String[] carArray = carNames.split(",");
		for (String car : carArray) {
			carList.add(new Car(car));
		}
	}

	public void racing() {
		for (Car car : carList) {
			car.advance(Randoms.pickNumberInRange(0, 9));
		}
		printStatus();
	}

	private void printStatus() {
		for (Car car : carList) {
			System.out.println(car.getCarName() + " : " + repeatString(car.getDistance()));
		}
		System.out.println();
	}

	private static String repeatString(int distance) {
		return new String(new char[distance]).replace("\0", "-");
	}
}
