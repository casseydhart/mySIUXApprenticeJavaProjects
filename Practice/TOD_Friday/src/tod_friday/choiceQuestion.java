package tod_friday;

import javax.swing.JOptionPane;
public class choiceQuestion {

	public static void main(String[] args) {

				getFeeling(0);
		        getFeeling(1);
		        getFeeling(2);
		        getFeeling(3);
		        getFeeling(4);
		    }    
		    public static void getFeeling(int feeling1) {
		    
		    JOptionPane.showMessageDialog(null, "Welcome to Class Tech Titan");
		    String name;

		    // Get the user's name.
		    name = JOptionPane.showInputDialog("What is your name? ");

		    // Display message
		    JOptionPane.showMessageDialog(null, "Good Morning, " +name);
		    
		    //Multiple choice question
		    
		     {
		             String[] Feeling1={"A","B","C","D","E"};
		            String question = JOptionPane.showInputDialog("How are you feeling today?     "
		            + "A. Anxious         B. Prepared and Ready"
		             + "     C. Fearful          D. Tired       "
		             + "E. None of these ");
		            int getFeeling;
		             switch (feeling1) {
		             case 0 :
		                 JOptionPane.showMessageDialog(null,"Remember " + name + ", There is no reason to be anxious. Your mind will answer most questions if you learn to relax and wait for the answer -William S. Burroughs");

		 

		         break;

		 

		      case 1 :
		          JOptionPane.showMessageDialog(null, "Congrats "+ name +  ", Proper Preparation Prevents Poor Performance.-James Baker");

		 

		         break;

		 

		      case 2 :
		          JOptionPane.showMessageDialog(null, "I understand "+ name +  ", I learned that courage was not the absence of fear, but the triumph over it. The brave man is not he who does not feel afraid, but he who conquers that fear -Nelson Mandela");

		 

		         break;

		 

		      case 3:
		          JOptionPane.showMessageDialog(null, "Remember "+ name +  ", No matter how tired you feel, no matter how much you want to quit, no matter what obstacles are in your way, keep moving toward the vision you have for your future. – Jon Gordon");

		 

		         break;

		 

		      case 4 :
		          JOptionPane.showMessageDialog(null, "Congrats "+ name +  ", Education is the most powerful weapon which you can use to change the world.- Nelson Mandela");

		 

		         break;
		             }
		             JOptionPane.showMessageDialog(null, "Good Bye " + name);
		       
		             }
		     }
		    }
	}

}
