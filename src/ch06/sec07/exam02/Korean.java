package ch06.sec07.exam02;

public class Korean {
    String nation;
    String name;
    String ssn;

  public Korean(){
//        this.nation = "대한민국";
//        this.name = "홍길동";
//        this.ssn = "901022-2754312";
          this("신사임당", "901022-2754312");
          // this() 이건 생성자 호출
          // 아래 생성자를 호출함
    }




    public Korean(String name, String ssn){
        this.nation = "대한민국"; // 이렇게 바로 사용하면 this 없어도 되는데
        this.name = name;        // 이거처럼 값이 그때 그때 바뀌면 this. 를 빼먹으면 안됨

                                 // this. 은 멤버필드랑 메소드를 호출할 수 있음
        this.ssn = ssn;
    }
}
