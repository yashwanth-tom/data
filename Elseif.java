/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elseif;
import java.util.Scanner;
public class Elseif {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=inp.nextInt();
        if (a%2==0 && a%3==0){
            System.out.println(a+"is a even number and divisible by 3");
        }
       else if (a%2 !=0 && a%3==0){
            System.out.println(a+"is a odd number and divisible by 3");
       }
        else if (a%2 ==0 && a%3 !=0){
            System.out.println(a+"is a even number and not divisible by 3");
       }
        else{
            System.out.println(a+"is a odd number and not divisible by 3 ");
        }
        
        
        
    }
    
}
