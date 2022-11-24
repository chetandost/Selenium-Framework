package ExceptionHandling;

import java.io.FileInputStream;


import java.io.IOException;

import java.sql.SQLException;

import java.io.FileNotFoundException;

public class F {

		public static void m() throws IOException,ArrayIndexOutOfBoundsException{
			FileInputStream fis=new FileInputStream("D:/Chetan/Sample.txt");
			System.out.println("chetan");
		}
		public static void  m1()throws SQLException{
			System.out.println("chetu");
			
		}
		public static void main(String[]args) throws Exception{
			m();
			m1();
		}}