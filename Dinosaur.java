/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinosaur;

import java.util.Scanner;

public class Dinosaur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a number:");
        a = inp.nextInt();
        System.out.println("Enter b number:");
        b = inp.nextInt();
        System.out.println("Enter c number");
        c = inp.nextInt();
        if (a > b && a > c) {
            System.out.println(a + "is the highest");
            if (b > c) {
                System.out.println(b + " is the mid");
                System.out.println(c + "is the lowest ");
            }
            
            else {
                System.out.println(c + "is the mid");
                System.out.println(b + "is the lowest ");
            }
        }
            if (b > a && b > c) {
                System.out.println(c + "is the highest");
                if (a > c) {
                    System.out.println(a + " is the mid");
                    System.out.println(c + "is the lowest ");
                }
                else {
                    System.out.println(c + "is the mid");
                    System.out.println(a + "is the lowest ");
                }
            }
          if (c > b && c > a) {
                    System.out.println(c + "is the highest");
                    if (a > b) {
                        System.out.println(a + " is the mid");
                        System.out.println(b + "is the lowest ");
                    }
                    else {
                        System.out.println(b + "is the mid");
                        System.out.println(a + "is the lowest ");
                    }
          }

                }

            }
        }
    }

}
