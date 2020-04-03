/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelviewcontroller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
	
	private view theView;
	private model theModel;
	
	public controller(view theView, model theModel)
	{
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
		//this.theView.multCalculationListener(new CalculateListener());
	}
	class CalculateListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int fistNumber, secondNumber = 0;
			//int fistNumber1, secondNumber1 = 0;
			
			try {
				fistNumber = theView.getFistNumber();
				secondNumber =theView.getSecondNumber();
				//fistNumber1 = theView.getFistNumber1();
				//secondNumber1 =theView.getSecondNumber1();
				
				theModel.addTwoNumbers(fistNumber, secondNumber);
				//theModel.multTwoNumbers(fistNumber1, secondNumber1);
				theView.setCalcSolution(theModel.getCalculationValue());
				//theView.setCalcSolution1(theModel.getCalculationValue1());
			}
			
			catch(NumberFormatException ex)
			{
				theView.displayErrorMessage("You need to enter 2 Integers");
			}
		}
	}

}