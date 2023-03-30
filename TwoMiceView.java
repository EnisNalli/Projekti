

	import javax.swing.*;
	import java.awt.*;
	import java.util.Scanner;

	public class TwoMiceView extends  JPanel{
	    //these variables are for the positions of mouse1 and mouse 2

	    public TwoMiceView(int mouse1Horizontal,int mouse1Vertical, int mouse2Horizontal, int mouse2Vertical, String lostGameText,  boolean truthValue) {



	        //here I'm creating the object JFrame to create a frame and draw on it
	        JFrame frame = new JFrame();
	        //setting a title
	        frame.setTitle("TwoMice");
	        //setting the size of the frame
	        frame.setSize(800+13,600+35);
	        //making the frame show
	        frame.setVisible(true);
	        //this makes it, so it knows from where to draw it in this case
	        // from this class if I wanted to access another class id use the object which it initializes the class
	        frame.getContentPane().add(this);

	    }
	       
	  

	        public void paint(int mouse1Horizontal,int mouse1Vertical, int mouse2Horizontal, int mouse2Vertical, String lostGameText,  boolean truthValue,Graphics g) {
	        	
	            super.paint(g);
	            g.setColor(new Color(0,0,0));
	            g.fillRect(0,0,800,600);
	            
	            g.setColor(new Color(64,64,64));
	            g.fillRect(25,25,750,550);

	            g.setColor(new Color(190,190,190));
	            g.fillOval(mouse1Horizontal, mouse1Vertical, 50,50);
	            g.setColor(new Color(32,32,32));
	            g.drawString("M1",mouse1Horizontal+17, mouse1Vertical+30);
	            

	            g.setColor(new Color(128,128,128));
	            g.fillOval(mouse2Horizontal, mouse2Vertical, 50,50);
	            g.setColor(new Color(240,240,240));
	            g.drawString("M2",mouse2Horizontal+17, mouse2Vertical+30);
	            
	            if (lostGameText.equals("GAME OVER !!!")) {
	                g.setColor(Color.red);
	                g.drawString(lostGameText, 350,40);
	            } else {
	                g.setColor(new Color(240,240,240));
	                g.drawString("GameOn---", 350 , 40);
	                this.repaint();
	            }
	        }

	       

	    }
