
package labguide3_3;

import java.util.Scanner;

public class LabGuide3_3 {

    public static char machineChoice()
    {
        char choice=' ';	//random choice
	int	num;
        
	num = (int )(Math. random() * 3 + 1);
        System.out.println("number is "+num);
	switch(num)
	{
	case 1:
		choice = 'p';
		break;
	case 2:
		choice = 'r';
		break;
	case 3:
		choice = 's';
	}	
	return choice;
    }
    public static void main(String[] args) {
        char	machine,	//the machine's choice: p, r, or, s
		player;		//the player's choice
	int	result;	//Win, lose, or tie
	int	score = 0, point=0;	//score of the player

        Scanner sc = new Scanner(System.in);
	System.out.println("\nChoose (p)aper, (r)ock, (s)cissors or (q)uit: ");
	player = sc.next().charAt(0);

	while(player != 'q')
	{
		machine = machineChoice();

		if(machine == player)
		{
			System.out.println("it\'s a tie! ");
			point = 0;
		}
		else
			if(machine == 'p')
			{
				System.out.println("The machine chooses paper. ");

				switch(player)
				{
				case 'r':
					System.out.println("Paper covers Rock. ");
					point = -1;
					break;
				case 's':
					System.out.println("Scissors cuts Paper. ");
					point = 1;
				}
			}
			else
				if(machine == 'r')
				{
					System.out.println("The machine chooses rock. ");
					switch(player)
					{
					case 'p':
						System.out.println("Paper covers Rock. ");
						point = 1;
						break;
					case 's':
						System.out.println("Rock breaks Scissors. ");
						point = -1;
					}
				}

				else
					if(machine == 's')
					{
						System.out.println("The machine chooses scissors. ");
						switch(player)
						{
						case 'p':
							System.out.println("Scissors cuts Paper. ");
							point = -1;
							break;
						case 'r': 
							System.out.println("Rock breaks Scissors. ");
							point = 1;
						}
					}

					if (point == 1)
						System.out.println("You Win! ");
					else if (point == -1)
						System.out.println("You Lose! ");
					
					score += point;
					System.out.printf("Your score: %d\n", score);

					System.out.println("\nChoose (p)aper, (r)ock, (s)cissors or (q)uit: ");
					player = sc.next().charAt(0);
	}
	
    }
    
}
