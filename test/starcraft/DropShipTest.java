package starcraft;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class DropShipTest {
    // 영향 안 미침
    DropShip dropShip = new DropShip();

    @Test
    @DisplayName(("드랍십에 마린 3마리 태우기"))
    public void test1(){
        DropShip dropShip = new DropShip();

        final int createdUnitCound = 3;
        for(int i =0; i<createdUnitCound; i++){
            dropShip.load(new Marine());
        }
        int loadedCount = 0;
        for(GroundUnit unit: dropShip.units){
            if(unit !=null){
                ++loadedCount;
            }
            System.out.printf("%d. %s\n", loadedCount,unit);
        }
        System.out.println("loadedCount:" + loadedCount);
        // 첫번째 인자는 기대하는 값 expected value
        // 두번째 인자는 실제처리된 값 actual value
        assertEquals(createdUnitCound,loadedCount); // 옆 하얀챵 test 왼쪽에 초록 체크가 뜨면 성공
        assertEquals(createdUnitCound,dropShip.loadedIndex);
    }

    @Test
    @DisplayName("가득 태웠다가 2명 떨구기")
    public void test2(){
        DropShip dropShip = new DropShip();
        for(int i = 0; i< dropShip.units.length; i++){
            dropShip.load(new Marine());
        }
        for(GroundUnit gu: dropShip.units){
            assertNotNull(gu);
        }

        boolean result = dropShip.load(new Marine());
        assertEquals(false, result);


        // 1명 떨구기
        GroundUnit gu = dropShip.unload();
        assertNotNull(gu);
        assertNull(dropShip.units[dropShip.units.length-1]);
        assertEquals(7, dropShip.loadedIndex);


        // 2명 떨구기
        GroundUnit gu2 = dropShip.unload();
        assertNotNull(gu2);
        assertNull(dropShip.units[dropShip.units.length-2]);
        assertEquals(6, dropShip.loadedIndex);


        assertNotEquals(gu, gu2);
    }

    @Test
    @DisplayName("한명도 태우지 않고 unload 시키기")
    public void test3(){
        GroundUnit gu = dropShip.unload();
        assertNull(gu);

        assertEquals(0, dropShip.loadedIndex);
    }
  
}