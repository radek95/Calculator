package com.javafee.controller;

import java.awt.EventQueue;

import com.javafee.model.Addition;
import com.javafee.view.CalculatorFrame;

/**
 * <i>Action</i> class with actions methods connecting view with business logic.
 * Use control() method to initialize form.
 * 
 * @author radek95
 * @version 0.1
 */
public class Action {

	private CalculatorFrame calculatorFrame;

	private StringBuilder firstVariable = new StringBuilder("");
	private StringBuilder secondVariable = new StringBuilder("");

	private Boolean isBtnSignClicked = false;
	private String sign = "";

	/**
	 * Control method which initialize CalculatorFrame.
	 */
	public void control() {
		initializeCalculatorFrame();
	}

	/**
	 * InitializeCalculatorFrame method which initialize new CalculatorFrame.
	 * 
	 * @exception Exception
	 */
	private void initializeCalculatorFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorFrame = new CalculatorFrame();
					calculatorFrame.setVisible(true);

					calculatorFrame.getBtn0()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn0().getText()));
					calculatorFrame.getBtn1()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn1().getText()));
					calculatorFrame.getBtn2()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn2().getText()));
					calculatorFrame.getBtn3()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn3().getText()));
					calculatorFrame.getBtn4()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn4().getText()));
					calculatorFrame.getBtn5()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn5().getText()));
					calculatorFrame.getBtn6()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn6().getText()));
					calculatorFrame.getBtn7()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn7().getText()));
					calculatorFrame.getBtn8()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn8().getText()));
					calculatorFrame.getBtn9()
							.addActionListener(e -> onClickBtnNumber(calculatorFrame.getBtn9().getText()));

					calculatorFrame.getBtnPlusSign().addActionListener(e -> onClickBtnSign(Constans.PLUS_SIGN));
					calculatorFrame.getBtnMinusSign().addActionListener(e -> onClickBtnSign(Constans.MINUS_SIGN));
					calculatorFrame.getBtnMultiplicationSign()
							.addActionListener(e -> onClickBtnSign(Constans.MULTIPLICATION_SIGN));
					calculatorFrame.getBtnDivisionSign().addActionListener(e -> onClickBtnSign(Constans.DIVISION_SIGN));
					
					calculatorFrame.getBtnEqualSign().addActionListener(e -> onClickBtnEqual());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void reloadTextFieldResult(String text) {
		calculatorFrame.getTextFieldResult().setText(text);
	}

	private void clearTextFieldResult() {
		calculatorFrame.getTextFieldResult().setText("");
	}

	private void onClickBtnNumber(String currentNumber) {
		if (!isBtnSignClicked) {
			firstVariable.append(currentNumber);
			this.reloadTextFieldResult(firstVariable.toString());
		} else {
			secondVariable.append(currentNumber);
			this.reloadTextFieldResult(secondVariable.toString());
		}
	}

	private void onClickBtnSign(String sign) {
		isBtnSignClicked = true;
		this.sign = sign;
		clearTextFieldResult();
	}
	
	private void onClickBtnEqual() {
		// try {
		Double result = null;
		switch (sign) {
		case Constans.PLUS_SIGN:
			result = new Addition().calculate(firstVariable.toString(), secondVariable.toString());
			break;

		case Constans.MINUS_SIGN:
			// result = new Substraction().calculate(firstVariable, secondVariable);
			break;

		case Constans.MULTIPLICATION_SIGN:
			// result = new Multiplication().calculate(firstVariable, secondVariable);
			break;

		case Constans.DIVISION_SIGN:
			// result = new Division().calculate(firstVariable, secondVariable);
			break;

		default:
			break;
		}
		reloadTextFieldResult(result.toString());
		// } catch (NoSuchCalculationException e) {
		// e.prinStackTrace();
		// }
	}
}