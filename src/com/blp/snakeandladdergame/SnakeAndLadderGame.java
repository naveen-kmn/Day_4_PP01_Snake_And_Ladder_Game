package com.blp.snakeandladdergame;

public class SnakeAndLadderGame
{
        public static void main(String[] args)
        {
            int position = 0;
            System.out.println("Position of player = " + position);

            int dice = (int) ((Math.random()*10)%7);
            System.out.println("Dice number = " + dice);
        }
    }
