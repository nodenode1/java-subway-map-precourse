package subway;

import subway.domain.Station;
import subway.domain.StationRepository;
import subway.view.OutputMessage;

import java.util.Arrays;
import java.util.function.Consumer;

public enum StationFunctionChoice {

    ADD_STATION("1", choiceKey->ControlStation.addStation()),
    DELETE_STATION("2",choiceKey-> ControlStation.deleteStation()),
    LOOK_STATION("3",choiceKey->ControlStation.lookStation()),
    BACK("B",chocieKey->ControlStation.back());
    private String choiceKey;
    private Consumer<String> handlerFunction;
    StationFunctionChoice(String choiceKey,Consumer<String> handlerFunction){
        this.choiceKey=choiceKey;
        this.handlerFunction=handlerFunction;
    }
    public void doingFunction(String name){
        handlerFunction.accept(name);
    }
    public String getChoiceKey(){
        return choiceKey;
    }
    public static StationFunctionChoice stationFunctionDecide(String choiceKey){
       return Arrays.stream(values()).filter(value -> value.choiceKey.equals(choiceKey)).findFirst().get();

    }
}
