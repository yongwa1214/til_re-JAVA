package starcraft;

public abstract class FlyingUnit extends Unit {
    // 추상메소드는 반드시 오버라이딩 해야한다.

    @Override
    public void move(int x, int y){
        System.out.println("공중으로 이동한다");
        super.move(x, y);
    }




}
