package com.promineotech;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		
		for(int i =0; i< log.length(); i++) {
			System.out.print(log.charAt(i)+ " ");
		}
		
	
		
		
		
		
	}

	@Override
	public void Error(String error) {
		StringBuilder result = new StringBuilder();
		for(int i =0; i< error.length(); i++) {
			result.append(error.charAt(i)+  " ");
		}
		System.out.println("ERROR:"+ result.toString());
	}

}
