package com.Date11sept;

public class FileMainClass {
	public static void main(String[] args) {
		//FileOpreation.fileWiter("Text.txt");
		//FileOpreation.fileRead("Text.txt");
		FileOpreation.countLines("Text.txt");
		FileOpreation.copyFile("Text.txt", "Copy.txt");
		FileOpreation.fileRead("Copy.txt");
	}
}
