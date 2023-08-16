package newJava;
import java.util.Scanner;
public class SpaceCarftIsro {
	    @SuppressWarnings("unused")
		private int frwb_bckwrd_Est_West; // East/West
	    @SuppressWarnings("unused")
		private int frwb_bckwrd_Nrth_south; // North/South
	    @SuppressWarnings("unused")
		private int go_up_down; // Up/Down
	    @SuppressWarnings("unused")
		private String direction; // N, S, E, W, Up, Down
	    
	    public SpaceCarftIsro(int initialX, int initialY, int initialZ, String initialDirection) {
	    	frwb_bckwrd_Est_West = initialX;
	    	frwb_bckwrd_Nrth_south = initialY;
	    	go_up_down = initialZ;
	        direction = initialDirection;
	    }
	    // moving  forward 
	    public void moveForward() {
	        switch (direction) {
	            case "N":
	            	frwb_bckwrd_Nrth_south++;
	                break;
	            case "S":
	            	frwb_bckwrd_Nrth_south--;
	                break;
	            case "E":
	            	frwb_bckwrd_Est_West++;
	                break;
	            case "W":
	            	frwb_bckwrd_Est_West--;
	                break;
	            case "U":
	            	go_up_down++;
	                break;
	            case "D":
	            	go_up_down--;
	                break;
	        }
	    }
	    
	    //moving backward 
	    public void moveBackward() {
	        switch (direction) {
	            case "N":
	            	frwb_bckwrd_Nrth_south--;
	                break;
	            case "S":
	            	frwb_bckwrd_Nrth_south++;
	                break;
	            case "E":
	            	frwb_bckwrd_Est_West--;
	                break;
	            case "W":
	            	frwb_bckwrd_Est_West++;
	                break;
	            case "U":
	            	go_up_down--;
	                break;
	            case "D":
	            	go_up_down++;
	                break;
	        }
	    }
	    
	    // for left moving 
	    
	    public void turnLeft() {
	        switch (direction) {
	            case "N":
	                direction = "W";
	                break;
	            case "S":
	                direction = "E";
	                break;
	            case "E" :
	                direction = "N";
	                break;
	            case "W":
	                direction = "S";
	                break;
	            case "U":
	               direction="N";
	               break;    
	        }
	    }
      
	    // for right moving 
	    
	    
	    public void turnRight() {
	        switch (direction) {
	            case "N":
	                direction = "E";
	                break;
	            case "S":
	                direction = "W";
	                break;
	            case "E":
	                direction = "S";
	                break;
	            case "W":
	                direction = "N";
	                break;
	             case "D":
	                direction="S";
	                break;   

	        }
	    }
	    // for turnUp
	    public void turnUp() {
	        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
	            direction = "U";
	        }
	    }
	  // for turnUp 
	    public void turnDown() {
	        if (direction.equals("N") || direction.equals("S") || direction.equals("E") || direction.equals("W")) {
	            direction = "D";
	        }
	    }
	    
	    public void executeCommands(char[] commands) {
	        for (char command : commands) {
	            switch (command) {
	                case 'f':
	                    moveForward();
	                    break;
	                case 'b':
	                    moveBackward();
	                    break;
	                case 'l':
	                    turnLeft();
	                    break;
	                case 'r':
	                    turnRight();
	                    break;
	                case 'u':
	                    turnUp();
	                    break;
	                case 'd':
	                    turnDown();
	                    break;
	                default:
	                    // Handle invalid command or do nothing
	            }
	        }
	    }
	   /* this function define to fetch the data of private member */ 
	    public int get_value_EW() {
	        return frwb_bckwrd_Est_West;
	    }

	    public int get_value_NS() {
	        return frwb_bckwrd_Nrth_south;
	    }

	    public int get_UP_Down() {
	        return go_up_down;
	    }

	    public String getDirection() {
	        return direction;
	    }
	    
	    // main function 
	    public static void main(String[] args) {
	    	SpaceCarftIsro craft = new SpaceCarftIsro(0, 0, 0, "N");
	    	@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
	    	String commnds=sc.nextLine();
	    	 char[] instructios = commnds.toCharArray();
	    	
	        craft.executeCommands(instructios);
	        //fetching the final Position .
	        System.out.println("Final Position: (" + craft.get_value_EW() + ", " + craft.get_value_NS() + ", " + craft.get_UP_Down() + ")");
	        //fetching the final Direction 
	        System.out.println("Final Direction: " + craft.getDirection());
	    }
	}


