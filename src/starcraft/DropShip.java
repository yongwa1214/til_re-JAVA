package starcraft;


import java.util.Arrays;

// 수송기
// 8개의 지상유닛을 태울 수 있다.
public class DropShip extends FlyingUnit{
    protected GroundUnit[] units = new GroundUnit[8];
    protected int loadedIndex = 0;

    // 유닛 하나를 태운다. 메소드명 load
    // 태웠으면 return true, 못 태웠으면 return false

    public boolean load(GroundUnit gu){
       if(units.length == loadedIndex){
           return false;
       }
        // 후위 연산은 증가 전의 값을 반환한 후 1이 증가하는 방식이다.
        // 이제 진짜 이해함 일단 실행 다하고 내보낸 뒤에 +1하는거임
       units[loadedIndex++]= gu;

       return true;
    }
    // 유닛 하나를 떨군다. 메소드명 unload

    public GroundUnit unload(){
        if(loadedIndex == 0){
            return null;
        }


        // units.length가 8이니까 방번호는 -1이어야겠지 제발...
        GroundUnit unloadGu = units[--loadedIndex] ;
        units[loadedIndex] = null;
        return unloadGu;

    }


}
