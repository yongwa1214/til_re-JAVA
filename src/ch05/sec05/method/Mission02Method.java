package ch05.sec05.method;

public class Mission02Method {
    public static void main(String[] args) {
        String ext = getExt("sadf.sadf.jpg") ; // "jpg"리턴
        String ext2 = getExt("sad22f.selkg2o1ih.jpeg");
        System.out.println(ext);
        System.out.println(ext2);
    }
    public static String getExt(String file){
       int idx = file.lastIndexOf(".");
       String ext = file.substring(idx+1);
        return ext;
    }
}
