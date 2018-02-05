package com.javafee.controller;

import java.awt.EventQueue;

import com.javafee.view.CalculatorFrame;

public class Action {
	
	private CalculatorFrame calculatorFrame;
	
	public void control() {
		initializeCalculatorFrame();
	}

	private void initializeCalculatorFrame() {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						calculatorFrame = new CalculatorFrame();
						calculatorFrame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});

}
}