package com.blp.snakeandladdergame;

public class SnakeAndLadderGame
{
    private static int position ;
    private static final int NO_PLAY_POSITION = 0;
    private static final int LADDER = 1;
    private static final int SNAKE = 2;
    private static int counter ;

    public static void main(String[] args)
    {
        System.out.println("Starting position of the player = " + position);

        SnakeAndLadderGame game = new SnakeAndLadderGame ();
        game.startGame();
    }
    private void startGame() {
        counter = 0; position = 0;

        while (position < 100)
        {
            int dice = rollDice();
            int check = positionLadderSnake();
            switch (check)
            {
                case NO_PLAY_POSITION ->
                        {
                            System.out.println("Player got same position");
                        }
                case LADDER ->
                        {
                            position = position + dice;
                            System.out.println("Player got ladder and position is = " + position);
                        }
                case SNAKE ->
                        {
                            position = position - dice;
                            if (position < 0)
                                {
                                    position = 0;
                                    System.out.println("Player got snake and position is = " + position);
                                }
                        }
            }

            if ( position > 100 )
            {
                position = position - dice;
                System.out.println("Player on the same position = " + position);
            }
            if ( position == 100 )
            {
                checkWinner();
            }
        }
        System.out.println("Count of rolling dice = " + counter);
    }
    private int rollDice()
    {
        counter++;
        return (int) (Math.floor(Math.random() * 10) % 6 + 1);
    }

    private int positionLadderSnake()
    {
        return (int) ((Math.random() * 10) % 3);
    }

    private void checkWinner()
    {
        if ( counter % 2 == 0 )
        {
            System.out.println("Player 2 won the game");
        }
        else
        {
            System.out.println("Player 1 won the game");
        }
    }
}