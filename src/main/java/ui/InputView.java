package ui;

import dto.InputDto;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String INSERT_NAMES = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private static final String INSERT_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";
    private static final String INSERT_RESULTS = "실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)";

    public static InputDto askInput() {
        InputDto inputDto = new InputDto();

        System.out.println(INSERT_NAMES);
        inputDto.setNames(scanner.nextLine());
        System.out.println(INSERT_RESULTS);
        inputDto.setResults(scanner.nextLine());
        System.out.println(INSERT_LADDER_HEIGHT);
        inputDto.setLadderHeight(scanner.nextInt());

        return inputDto;
    }
}
