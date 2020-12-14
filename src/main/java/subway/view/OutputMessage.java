package subway.view;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class OutputMessage {
    static Scanner scanner=new Scanner(System.in);

    public OutputMessage(){

    }
    private final String MAIN_DISPLAY_MESSAGE="## 메인 화면";
    private final String MAIN_MANAGE_STATION="1. 역 관리";
    private final String MAIN_MANAGE_LINE="2. 노선 관리";
    private final String MAIN_MANAGE_IN_LINE="3. 구간 관리";
    private final String MAIN_QUIT="Q. 종료";

    private static final String MENU_BACK="B. 돌아가기";

    private static final String STATION_MANAGE_MESSAGE="## 역 관리 화면";
    private static final String STATION_MANAGE_REGISTRATION="1. 역 등록";
    private static final String STATION_MANAGE_DELETE="2. 역 삭제";
    private static final String STATION_MANAGE_SEARCH="3. 역 조회";

    public static void manageLineMessage(){
        System.out.println(LINE_MANAGE_MESSAGE);
        System.out.println(LINE_MANAGE_REGISTRATION);
        System.out.println(LINE_MANAGE_DELETE);
        System.out.println(LINE_MANAGE_SEARCH);
        System.out.println(MENU_BACK);

    }
    private static final String LINE_MANAGE_MESSAGE="## 노선 관리 화면";
    private static final String LINE_MANAGE_REGISTRATION="1. 노선 등록";
    private static final String LINE_MANAGE_DELETE="2. 노선 삭제";
    private static final String LINE_MANAGE_SEARCH="3. 노선 조회";

    private static final String IN_LINE_MANAGE_MESSAGE="## 구간 관리 화면";
    private static final String IN_LINE_MANAGE_REGISTRATION="1. 구간 등록";
    private static final String IN_LINE_MANAGE_DELETE="2. 구간 삭제";

    private static final String CHOICE_FUNCTION_MESSAGE="## 원하는 기능을 선택하세요";
    private static final String WRITE_STATION_NAME="## 등록할 역 이름을 입력하세요";
    private static final String WRITE_LINE_NAME="## 등록할 노선의 이름을 입력하세요";

    private static final String WRITE_UP_STATION_NAME="## 등록할 노선의 상행 종점역 이름을 입력하세요";
    private static final String WRITE_DOWN_STATION_NAME="## 등록할 노선의 하행 종점역 이름을 입력하세요";

    public String registerLineUpStation(){
        System.out.println(WRITE_UP_STATION_NAME);
        return scanner.nextLine();
    }
    public String registerLineDownStation(){
        System.out.println(WRITE_DOWN_STATION_NAME);
        return scanner.nextLine();
    }
    public static String registerLineName(){
        System.out.println(WRITE_LINE_NAME);
        return scanner.nextLine();
    }
    public void mainOutputMessage(){
        System.out.println(MAIN_DISPLAY_MESSAGE);
        System.out.println(MAIN_MANAGE_STATION);
        System.out.println(MAIN_MANAGE_LINE);
        System.out.println(MAIN_MANAGE_IN_LINE);
        System.out.println(MAIN_QUIT);
        System.out.println();
    }
    public static String choiceOutputMessage(){
        System.out.println(CHOICE_FUNCTION_MESSAGE);
        return scanner.nextLine();
    }
    public static void choiceStationOutputMessage(){
        System.out.println(STATION_MANAGE_MESSAGE);
        System.out.println(STATION_MANAGE_REGISTRATION);
        System.out.println(STATION_MANAGE_DELETE);
        System.out.println(STATION_MANAGE_SEARCH);
        System.out.println(MENU_BACK);
        System.out.println();

    }
    public static String registerStationName(){
        System.out.println(WRITE_STATION_NAME);
        return scanner.nextLine();
    }

}
