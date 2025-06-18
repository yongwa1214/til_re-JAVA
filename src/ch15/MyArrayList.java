package ch15;

import java.util.Arrays;

public class MyArrayList {
    private String[] arr = new String[0];

    public int size(){

        return this.arr.length;

    }
    //
    public void add(String s){
        String[] temp = new String[size() + 1];
        // temp[temp.length-1] = s;
        temp[size()] = s;

        // 기존값 복사

        for(int i = 0; i < size(); i++){
            temp[i] = arr[i];
        }
        this.arr = temp;
    }


    public void add(int index, String item){
        String[] temp = new String[size() + 1];
        temp[index] = item;
        for(int i =0; i<size(); i ++){
            temp[i < index ? i : i +1] = arr[i];

        }
        this.arr = temp;
    }

/*
    public void add(int index, String s ){
        String[] temp = new String[size() + 1];
        temp[index] = s;

        for(int i = 0; i < index; i++){
            temp[i]= this.arr[i];
        }

        int addNew = index+1;
        // int etc = index;
        for(int i = addNew; i < temp.length; i++){
            temp[i]= this.arr[index++];

        }
        this.arr = temp;
    }
*/

    public String remove(){

        String[] temp = new String[size() - 1];
        String etc = this.arr[temp.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
        return etc;
    }

    public String remove(int index){
        String[] temp = new String[size() - 1];
        String etc = this.arr[index];

        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[i < index ? i : i + 1];
        }

        arr = temp;
        return etc;
    }

    // 점검용
    public void checkValues(){
        System.out.println(Arrays.toString(this.arr));
    }

    public String get(int index){
        return arr[index];
    }
}
