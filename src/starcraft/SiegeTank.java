package starcraft;

public class SiegeTank extends GroundUnit{
    //값이 없으면 false
    private boolean siegeMode;

    public void toggleSiegeMode(){
        // 이 메소드를 호출할 때마다 siegeMode의 값이 true > false > true > false
        siegeMode = !siegeMode;
    }
}
