package com.bridgelabz.tictoctoe;

import java.util.Scanner;

public class TicTocToe {
    static char playerchooseletter;
    static char computerchooseletter;

    //UC1
    static char chararray[] = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};

    //UC2
    void chooseXO(char chooseLetter){
        if(chooseLetter == 'x'){
            playerchooseletter = 'x';
            System.out.println("player choosen the letter: "+playerchooseletter);
            computerchooseletter ='o';
            System.out.println("Computer choosen the letter: "+computerchooseletter);
        }else {
            playerchooseletter = 'o';
            System.out.println("player choosen the letter: "+playerchooseletter);
            computerchooseletter ='x';
            System.out.println("Computer choosen the letter: "+computerchooseletter);
        }
       // return chooseLetter;
    }

    //UC3
    void display(char[] arr){
        System.out.println("| "+arr[1]+" | "+arr[2]+" | "+arr[3]+" |");
        System.out.println("-------------");
        System.out.println("| "+arr[4]+" | "+arr[5]+" | "+arr[6]+" |");
        System.out.println("-------------");
        System.out.println("| "+arr[7]+" | "+arr[8]+" | "+arr[9]+" |");
    }
    //void placing(int index,char letter,int indexCom,char computerLetter,char arr[]){

    //UC4
        void placing(int index,char letter,char arr[]){
        TicTocToe obj = new TicTocToe();
        arr[index]=letter;
       // arr[indexCom]=computerLetter;
        obj.display(chararray);
    }

    //UC5
    void disiredSpace() {
        for (int i = 1; i <= 9; i++) {
            if (chararray[i]==' '){
                System.out.println(" The free index available :"+i);
            }
        }
    }
    void tossToPlayFirst(){

    }
    public static void main(String[] args) {
        //char chararray[] = {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
        TicTocToe obj = new TicTocToe();
        Scanner scan = new Scanner(System.in);
        System.out.println("Player choose a letter from x or o :");
                char chooseletter = scan.next().charAt(0);
               // char computerChooseLetter=obj
                obj.chooseXO(chooseletter);
                obj.display(chararray);
        System.out.println("Choose the index");
        int playerIndex = scan.nextInt();
        int computerIndex = (int) (Math.random() * 10) % 9;
        System.out.println("Player value : "+playerIndex);
        System.out.println("Computer value : "+computerIndex);
      //  obj.placing(playerIndex,playerchooseletter,computerIndex,computerchooseletter,chararray);
        obj.placing(playerIndex,playerchooseletter,chararray);;
        obj.placing(computerIndex,computerchooseletter,chararray);
        System.out.println("");
        obj.disiredSpace();

    }
}
