/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author klyme
 */
public class Prime {

public static boolean isPrime(int number)
{
    if(number<1)
        return false;
    else
        for(int i=2;i<number;i++){
            if(number%i == 0)
                return false;
        }
    return true;
}
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*100)+1;
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isPrime(number));
        
        System.out.println(randomNumber);
        System.out.println(isPrime(randomNumber));
    }
    
}
