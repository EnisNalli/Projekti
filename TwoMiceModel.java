import java.util.Scanner;

public class TwoMiceModel  {
	  

	public TwoMiceModel (int mouse1Horizontal,int mouse1Vertical, int mouse2Horizontal, int mouse2Vertical, String lostGameText,  boolean truthValue) {
		
	
		
		 //this variable is so we know which one will be playing next
        int player = 0;


		//I created an infinite loop, so it keeps playing until a player is caught
        while (truthValue ) {


            // this is so the player 1 plays a.k.a mouse1
            if (player%2 == 0) {

                    //it increments the player number so the next player will play in the next while loop
                    player++;

                    //created a scanner, so I get keywords from the players
                    
                    Scanner scanner = new Scanner(System.in);

                    String scannerInput;

                    scannerInput = scanner.nextLine();

                    //made this so it tells the user who played last
                    System.out.println("mouse1 moved " + scannerInput);

                    //created this switch statement so that it gets some cases in which the player should move
                    //such as "up, down, right, left"
                    switch (scannerInput) {
                        //in the case up (this is for player jerry) if the player is already at the top he cant
                        //go further up, if he isn't he will be going up by 35 pixels
                        case "up":
                            if(mouse1Vertical < 50) {
                                System.out.println("You can't move here");

                            } else {
                                mouse1Vertical-=25;
                                // A call to repaint() calls update() which means that it will re-render all the components
                                repaint();
                            }
                            break;

                        case "down":
                            if(mouse1Vertical >500) {
                                System.out.println("You can't move here");
                            } else {
                                mouse1Vertical+=25;
                                repaint();
                            }
                            break;

                        case "left":
                            if(mouse1Horizontal < 50) {
                                System.out.println("You can't move here");
                            } else {
                                mouse1Horizontal-=25;
                                repaint();
                            }
                            break;

                        case "right":
                            if(mouse1Horizontal > 700) {
                                System.out.println("You can't move here");
                            } else {
                                mouse1Horizontal+=25;
                                repaint();
                            }
                            break;
                    }
                if(
                    // If corners touch  then mouse2 caught mouse1
                		 mouse2Horizontal == mouse1Horizontal+50 && mouse2Vertical == mouse2Vertical+50
                         || mouse2Horizontal == mouse1Horizontal + 50 && mouse2Vertical == mouse1Vertical
                         || mouse2Vertical == mouse1Vertical + 50 && mouse2Horizontal == mouse1Horizontal
                         || mouse2Horizontal == mouse1Horizontal -50 && mouse2Vertical == mouse1Vertical + 50
                         || mouse2Horizontal == mouse1Horizontal -50 && mouse2Vertical == mouse1Vertical
                         || mouse2Horizontal == mouse1Horizontal -50 && mouse2Vertical == mouse1Vertical - 50
                         || mouse2Horizontal == mouse1Horizontal && mouse2Vertical == mouse1Vertical -50
                         || mouse2Horizontal == mouse1Horizontal +50 && mouse2Vertical == mouse1Vertical -50
                         // if mouse2 is inside mouse1 then mouse2 caught mouse1

                         ||  mouse1Horizontal-50<mouse2Horizontal&&mouse2Horizontal<mouse1Horizontal+50
                         && mouse1Vertical - 50< mouse2Vertical && mouse2Vertical < mouse1Vertical + 50

                         || mouse2Horizontal- 50 < mouse1Horizontal && mouse1Horizontal< mouse1Horizontal + 50
                         && mouse2Vertical- 50 < mouse1Vertical && mouse1Vertical< mouse2Vertical + 50){
                 
                	lostGameText = "GAME OVER !!!";
                    repaint();
                    truthValue = false;
                    System.out.println(lostGameText);


                }
                    if (!truthValue) {
                        scanner.close();
                    }

            } else {

                player++;

                Scanner scanner = new Scanner(System.in);
                String player2Move;

                player2Move = scanner.nextLine();

                System.out.println("mouse2  moved " + player2Move);

                switch (player2Move) {

                    case "up":
                        if(mouse2Vertical < 50) {
                            System.out.println("You cant move here");
                        } else {
                            mouse2Vertical-=25;
                            repaint();
                        }
                        break;
                    case "down":

                        if(mouse2Vertical > 500) {
                            System.out.println("You cant move here");
                        } else {
                            mouse2Vertical+=25;
                            repaint();}
                        break;

                    case "left":
                        if(mouse2Horizontal < 50) {
                            System.out.println("You cant move here");
                        } else {
                            mouse2Horizontal-=25;
                            repaint();
                        }
                        break;

                    case "right":
                        if(mouse2Horizontal > 700) {
                            System.out.println("You cant move here");
                        } else {
                            mouse2Horizontal+=25;
                            repaint();
                        }
                        break;
                }
                if(
                    // If corners touch  then Tom caught Jerry
                		 mouse2Horizontal == mouse1Horizontal+50 && mouse2Vertical == mouse2Vertical+50
                         || mouse2Horizontal == mouse1Horizontal + 50 && mouse2Vertical == mouse1Vertical
                         || mouse2Vertical == mouse1Vertical + 50 && mouse2Horizontal == mouse1Horizontal
                         || mouse2Horizontal == mouse1Horizontal -50 && mouse2Vertical == mouse1Vertical + 50
                         || mouse2Horizontal == mouse1Horizontal -50 && mouse2Vertical == mouse1Vertical
                         || mouse2Horizontal == mouse1Horizontal - 50 && mouse2Vertical == mouse1Vertical - 50
                         || mouse2Horizontal == mouse1Horizontal && mouse2Vertical == mouse1Vertical -50
                         || mouse2Horizontal == mouse1Horizontal + 50 && mouse2Vertical == mouse1Vertical -50
                         // if mouse2 is inside mouse1 then mouse2 caught mouse1

                         ||  mouse1Horizontal-50<mouse2Horizontal&&mouse2Horizontal<mouse1Horizontal+35
                         && mouse1Vertical -50 < mouse2Vertical && mouse2Vertical < mouse1Vertical +35
                         
                         || mouse2Horizontal- 50 < mouse1Horizontal && mouse1Horizontal< mouse1Horizontal +50
                         && mouse2Vertical- 50 < mouse1Vertical && mouse1Vertical< mouse2Vertical + 50
                ){
                    lostGameText = "GAME OVER !!!";
                    repaint();
                    truthValue = false;
                    System.out.println(lostGameText);

                }

                if (!truthValue){
                    scanner.close();
                }

            }
        }	
	  }

	

	}

