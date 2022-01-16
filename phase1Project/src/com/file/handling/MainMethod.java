package com.file.handling;

public class MainMethod {

	public static void main(String[] args) {
		
			
			// Create "main" folder if not present in current folder structure
			FileOperation.createMainFolderIfNotPresent("main");
			
			MenuOptions.printWelcomeScreen("This application", "Sasidharan");
			
			HandleOptions.handleWelcomeScreenInput();

	}

}
