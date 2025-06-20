package control.legacy;

import control.GenelecWoofer;
import control.Speaker;
import control.Woofer;

public class HarmanSpeaker implements Speaker {

    private Woofer woofer;

    public HarmanSpeaker(){
        // 이건 has a관계
        this.woofer = new GenelecWoofer();
    }

    // HarmanSpeaker가 객체화 된다면 GenelecWoofer를 사용할 수 있도록 해주세요.
    // GenelecWoofer의 주소값을 담아
    // HarmanSpeaker speaker = new HarmanSpeaker();

    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑음");
        woofer.baseSound();
    }
}
