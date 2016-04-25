/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode.test;

/**
 * Getting the UPC (specific type of Barcode) exercise
 * @author Gelen
 */
import java.util.*; //(input step 1)
public class BarcodeTest {
	
	public static void main(String[] args) {
		
		int firstnum, firstgroup, secondgroup, checkdigit;
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		int n1r, n2r, n3r, n4r, n5r, n6r, n7r, n8r, n9r, n10r;
		
		//(input step 2)
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first (single) digit:");
		firstnum = input.nextInt();
		
		System.out.print("Enter first group of five digits:");
		firstgroup = input.nextInt();
		
		System.out.print("Enter second group of five digits:");
		secondgroup = input.nextInt();
		/*-------------------------------------------------------
		 * GET EVERY INTEGER FROM 'FIRST GROUP' INPUT
		 *------------------------------------------------------*/
		
		/* Get First number:
		 * n1 (First number) = All five numbers divided by 10000 (10000 because it consists of 5 numbers.)
		 * n1r (Remainder of First number)= The decimal value of all five numbers divided by 10000.
		 */
		n1 = firstgroup / 10000;
		n1r = firstgroup % 10000;
		/* Get Second number:
		 * n2 (Second number) = All n1r numbers divided by 1000 (1000 because it consists of 4 numbers.)
		 * n2r (Remainder of Second number) = The decimal value of all 4 numbers divided by 1000.
		 */	
		n2 = n1r / 1000;
		n2r = n1r % 1000;	
		/* Get Third number:
		 * n3 (Third number) = All n2r numbers divided by 100 (100 because it consists of 3 numbers.)
		 * n3r (Remainder of Third number) = The decimal value of all 3 numbers divided by 100.
		 */			
		n3 = n2r / 100;
		n3r = n2r % 100;			
		/* Get Fourth number:
		 * n4 (Fourth number) = All n3r numbers divided by 10 (10 because it consists of 2 numbers.)
		 * n4r (Remainder of Fourth number) = The decimal value of all 2 numbers divided by 10.
		 */		
		n4 = n3r / 10;
		n4r = n3r % 10;	
		/* Get Fifth number:
		 * n5 (Fifth number) = All n4r numbers divided by 1 (1 because it consists of 1 number.)
		 * n5r (Remainder of Fifth number) = The decimal value of 1 number divided by 1.
		 */			
		n5 = n4r / 1;
		n5r = n4r % 1;
		
		/*-------------------------------------------------------
		 * GET EVERY INTEGER FROM 'SECOND GROUP' INPUT
		 *------------------------------------------------------*/
		n6 = secondgroup / 10000;
		n6r = secondgroup % 10000;
		
		n7 = n6r / 1000;
		n7r = n6r % 1000;
		
		n8 = n7r / 100;
		n8r = n7r % 100;			
		n9 = n8r / 10;
		n9r = n8r % 10;		
		
		n10 = n9r / 1;
		n10r = n9r % 1;
		checkdigit = 9 - (((((firstnum + n2 + n4 + n6 + n8 + n10)*3) + (n1 + n3 + n5 + n7 + n9)) - 1) % 10) ;
		System.out.println("Check digit: " + checkdigit);
		}
	
	}