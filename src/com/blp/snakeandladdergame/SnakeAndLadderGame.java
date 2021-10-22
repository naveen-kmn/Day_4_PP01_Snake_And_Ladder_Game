package com.blp.snakeandladdergame;

public class SnakeAndLadderGame
{
    static int position = 0;
    public static final int SAME_POSITION = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;

    public static void main(String[] args)
    {
        System.out.println("Starting position of the player = " + position);

        int counter = 0;

        while (position < 100)
        {
            int dice = (int) (Math.floor(Math.random()*10) %6+1);

            counter++;

            int check = (int) ((Math.random() * 10) % 3);
            switch (check)
            {
                case SAME_POSITION -> {
                    System.out.println("Player got same position");
                    break;
                }
                case LADDER ->
                        {
                        position = position + dice;
                        System.out.println("Player got ladder and Position of the player = " + position);
                        break;
                        }
                case SNAKE ->
                        {
                        position = position - dice;

                        if (position < 0)
                            {
                            position = 0;
                            System.out.println("Player got snake and Position of the player = " + position);
                            }
                        }
            }
            if ( position > 100 )
            {
                position = position - dice;
                System.out.println("Player on the same position = " +position);
            }
            if ( position == 100 )
            {
                System.out.println("Player won the game");
            }
        }
        System.out.println("Count of rolling dice = " +counter);
    }
}