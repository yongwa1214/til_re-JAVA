package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        System.out.println(args.length);

        for(String item:args){
            System.out.println(item);
        }
        System.out.println("");
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }

}
