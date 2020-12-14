package subway.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {
    private static final List<Station> stations = new ArrayList<>();

    public static List<Station> stations() {
        return Collections.unmodifiableList(stations);
    }

    public static void addStation(Station station) {
        if(lengthStationName(station.getName())&&duplicateStationName(stations,station.getName())) {
            stations.add(station);
        }
    }
    public void initializeAddStation(String[] station){
        for(int i=0;i<station.length;i++){
            stations.add(new Station(station[i]));
        }
    }

    public static boolean deleteStation(String name) {
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }
    public static boolean lengthStationName(String name){
        if(name.length()<2){
            System.out.println("[ERROR] 역 이름이 2자 미만 입니다.");
            return false;
        }

        return true;
    }
    public static boolean duplicateStationName(List<Station> stations,String tmpSaveName){
        for(int i=0;i<stations.size();i++){
            if(stations.get(i).getName().equals(tmpSaveName)){
                System.out.println("[ERROR] 역 이름이 중복됩니다.");
                return false;
            }
        }
        return true;
    }
    public boolean containStationName(String tmpSaveName){
        System.out.println(tmpSaveName);
        for(int i=0;i<stations.size();i++){
           if(stations.get(i).getName().equals(tmpSaveName)){
               System.out.println(tmpSaveName);
               return true;
           }
        }

        System.out.println("[ERROR] 등록할 역이 존재하지 않습니다.");
        return false;
    }
    public static void print(){
        for(int i=0;i<stations.size();i++){
            System.out.println(stations.get(i).getName());
        }
    }
}
