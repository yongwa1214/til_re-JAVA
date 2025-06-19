package starcraft;

public abstract class Unit {
    // 상속관계에서는 접근 시켜주는게 protected
    protected int x; // 좌표 x
    protected int y; // 좌표 y


    // 이동

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void stop(){
        System.out.println("현재 위치에 정지한다.");
    }


}
