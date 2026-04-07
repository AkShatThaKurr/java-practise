/*
Question: Implement Multiple Interfaces

Q. Write a Java program to demonstrate multiple interfaces in a single class.

Requirements:

Create two interfaces:
Camera with a method clickPhoto()
MusicPlayer with a method playMusic()
Create a class SmartPhone that implements both interfaces.
In the main method, create an object of SmartPhone and call both methods.

Expected Output Example:

Photo clicked with SmartPhone
Playing music on SmartPhone
 */

package PractiseQuestions._01_OOPs;

import java.util.Scanner;

public class Q10 {
    public interface Camera {
        void clickPhoto();
    }

    public interface MusicPlayer {
        void playMusic();
    }

    static class SmartPhone implements Camera, MusicPlayer {
        @Override
        public void clickPhoto() {
            System.out.println("Photo clicked with Smartphone camera");
        }

        @Override
        public void playMusic() {
            System.out.println("Playing music on Smartphone speaker");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartPhone myPhone = new SmartPhone();
        System.out.println("Choose: 1-> Click photo  2-> Play music");
        int choice = sc.nextInt();
        if(choice==1){
            myPhone.clickPhoto();
        }
        else if(choice==2){
            myPhone.playMusic();
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();

    }
}
