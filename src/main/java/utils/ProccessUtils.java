package utils;

import java.util.Scanner;

public class ProccessUtils {

    private static ProccessUtils proccessUtils;
    public Scanner input;

    private ProccessUtils(){
        input = new Scanner(System.in);
    }

    public static ProccessUtils getProccessUtilsInstance(){
        if(proccessUtils==null){
            proccessUtils=new ProccessUtils();
        }
        return proccessUtils;
    }
}
