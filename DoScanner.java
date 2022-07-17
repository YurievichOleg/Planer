package Planer;

/** Класс DoScanner отвечает за создание сканера, для записи из терминала */

import java.util.Scanner;

public class DoScanner {
    static Scanner doScanner =new Scanner(System.in);

    public static String writeText(){
        System.out.println("Сделайте запись в терминале:");
        String text = doScanner.nextLine();
        return text;
    }

    public void endDoScanner(){
        doScanner.close();
    }

    
}
