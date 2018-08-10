package com.dez.apps.jfx.console;

public class JFXConsole 
{
	public static void main(String... args)
	{
		JFXConsole test = new JFXConsole();
		
		test.initConsole();
	}
	
	public void initConsole()
	{
		System.out.println("Initializing Console: " + this.getClass().getName());
	}
}
