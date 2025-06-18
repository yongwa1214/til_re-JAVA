package ch07.sec07.poly;

public class Chihuahua extends Dog{
    @Override
    public void crying() {
        System.out.println("아르르르ㅏㄹ칽!으릌릌ㄹ!!!");
    }

    @Override
    public void jump(){
        System.out.print("치와와 ");
        super.jump();
    }
}
