package control.IoC;


import control.*;

public class TvFactory {
    //싱글톤으로 만들어주세요.

    //외부에서 객체 생성 불가능
    private TvFactory(){

    }

    //이건 객체 딱 하나만 생성할 수 있음
    // 몇번을 생성해도 다 같은 객체의 주소값을 지님


    private static TvFactory tvFactory = null;

    public static TvFactory getInstance(){
        if(tvFactory == null){
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    public Tv factory(String speakerName, String wooferName){
        // 삼성 tv 객체화 하려면 뭐가 필요함? 스피커의 주소값 필요
        // 스피커가 객체화 하려면 뭐가 필요함? 우퍼의 주소값 필요

        Woofer woofer = switch(wooferName){
            case"marten" -> new MartenWoofer();
            case"genelec" -> new GenelecWoofer();
            default -> null;
        };

        Speaker speaker = switch(speakerName){
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };
        return new SamsungTv(speaker);
    }
}
