package com.company;
import java.util.Random;
import java.util.Scanner;

public class _15_RockPaperScissors {
    public static void main(String[] args) {
        Scanner gs = new Scanner(System.in);
        short usersPoints=0;
        short systemPoints=0;
        for (int i = 1; i <= 3; i++) {
        System.out.print("Enter Rock(1),Papaer(2),Scissors(3): ");
        byte usersChoice = gs.nextByte();
        int systemChoice = generateRandomeNumber(1, 3);
        System.out.println("System's Choice: " + systemChoice);
            if (usersChoice == systemChoice) {
                System.out.println("DWAR!");
            }
            if (usersChoice == 1 && systemChoice == 2 || usersChoice == 3 && systemChoice == 2 || usersChoice == 1 && systemChoice == 3) {
                System.out.println("USER WINS!");
                usersPoints++;
            } else if (usersChoice == 2 && systemChoice == 1 || usersChoice == 2 && systemChoice == 3 || usersChoice == 3 && systemChoice == 1) {
                System.out.println("SYSTEM WINS!");
                systemPoints++;
            }
        }
        System.out.println("/-----------FINAL-RESULT-----------/");
        if(usersPoints>systemPoints){
            System.out.println("/-------------You Won!-------------/");
        } else if (systemPoints>usersPoints) {
            System.out.println("/-----------System  Won!-----------/");
        }else {
            System.out.println("/-----------Final  DWAR!-----------/");
        }
        System.out.print("/----------------------------------/");
    }

    private static byte generateRandomeNumber(int i, int j ) {
        Random random = new Random();
        return (byte) (random.nextInt(j - i + 1) + i);
    }
}
