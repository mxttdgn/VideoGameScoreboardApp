/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videogamescoreboard;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class VideoGameScoreBoard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        Game gameObj = new Game();
        Game gameObj2= gameObj
        return gameObj;
        
       
        int choice;
        do {
            printMenu();
            choice = getUserChoice("Enter your choice: ");
        }while(choice <0 || choice>8);
            System.out.println("---");

            switch (choice) {
                case 1:
                    listGames();
                    break;
                case 2:
                    listStudents();
                    break;
                case 3:
                    showStudentReport();
                    break;
                case 4:
                    showTopNForGame();
                    break;
                case 5:
                    showupdateStudentScore();
                    break;
                case 6:
                    showgameStats();
                    break;
                case 7:
                    showNewStudents();
                    break;
                case 8:
                    showsaveData();
                  
            }
    } 



            
          private static void printMenu() {
        System.out.println("==== Video Game Scoreboard ====");
        System.out.println("1) List games");
        System.out.println("2) List students");
        System.out.println("3) Show student report");
        System.out.println("4) Show top N for a game");
        System.out.println("5) Update student score");
        System.out.println("6) Game stats (min/max/avg)");
        System.out.println("7) Save data");
        System.out.println("8) Add a new student");
        System.out.println("0) Exit");




    }
    
}
