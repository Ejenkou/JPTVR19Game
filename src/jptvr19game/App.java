/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run() {
        System.out.println("Привет");
        System.out.println("Программа загадала число, угадай его!:");
        Random random = new Random();
        int attempt = 0;
        do{
            int myNumber = random.nextInt(5 - 0 + 1) + 0;
            Scanner scanner = new Scanner(System.in);
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber ){
                System.out.println("Ты выйграл");
                System.out.println("Число:" + myNumber);
            }else{
                if (attempt > 1) {
                System.out.println("Ты проиграл! Было выдумано:"
                    + myNumber);
                break;
                }else{
                    System.out.println("Попробуй еще раз!");
                }
                attempt++;
                
                
                
            
        }
        }while(true);   
    
        
    }
            
    

         }
