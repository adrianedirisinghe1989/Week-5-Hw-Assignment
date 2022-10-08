package com.promineotech;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.Log("FirstString");
		System.out.println();
		logger.Error("SecoundString");
		System.out.println();
		
		Logger spacedLogger = new SpacedLogger();
		spacedLogger.Log("ThirdString\n");
		System.out.println();
		spacedLogger.Error("FourthString\n");
		System.out.println();
		
		
	}

}
