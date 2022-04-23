package racingcar.model;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Race {
	private static final String INPUT_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private List<Car> carList = new ArrayList<>();
	public void inputCarNames() {
		System.out.println(INPUT_CAR_NAME);
		String carNames = Console.readLine();
		String[] carArray = carNames.split(",");
		for(String car : carArray){
			carList.add(new Car(car));
		}
	}
}
