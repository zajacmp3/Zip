package com.zajacmp3.zipper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


class Zipper {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void zipper(String[] args) throws IOException {
	
		File outputfile = new File(args[1]+"zip.zip");
		File inputfile = new File(args[0]);
		FileOutputStream fout = new FileOutputStream(outputfile);
		ZipOutputStream zout = new ZipOutputStream(fout);
		
		FileInputStream fin = new FileInputStream(inputfile);
		zout.putNextEntry(new ZipEntry(inputfile.getName()));
		
		byte[] buffer = new byte[1024];
		int lenght;
		while((lenght = fin.read(buffer)) >0){
			System.out.println("writing...");
			zout.write(buffer, 0, lenght);
		}
		zout.closeEntry();
		fin.close();
		zout.close();
		fout.close();
		System.out.println("FUCK YEAH");
	}

}
