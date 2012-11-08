package com.zajacmp3.zipper;

import java.io.IOException;

public class Filehandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 3){
			System.out.println("To few arguments... Why I am writing this in english?");
		}
		else{
			if(args[2].equalsIgnoreCase("zip")){
				try {
					Zipper.zipper(args);
				} catch (IOException e) {
					System.out.println("Error sending data to zipper");
					e.printStackTrace();
				}
			}
			else if(args[2].equalsIgnoreCase("unzip")){
				Unzipper unzipper = new Unzipper();
				try {
					unzipper.unzip(args);
				} catch (IOException e) {
					System.out.println("Error sending data to unzipper");
					e.printStackTrace();
				}
			}
			else{
				System.out.println("Unknown option is wrong - use 'zip' or 'unzip'");
			}
		}
	}

}
