package control.legacy;

import control.Speaker;
import control.Tv;

public class Test {
    public static void main(String[] args) {
        // 내가 genelecwoofer가 아닌 martenwoofer를 사용하고 싶으면
        // harmanspeaker에 가서 genelecwoofer를 mw로 바꿔야함
        // 결정권자는 HS
        // 그러니까 코드를 수정해야한다는게 중요함 (단점)
        Speaker speaker = new HarmanSpeaker();
        speaker.speakerSound();

        Speaker speaker2 = new JBLSpeaker();
        speaker2.speakerSound();

        System.out.println("---------------");
        Tv tv = new SamsungTv();

        tv.sound();
    }
}
