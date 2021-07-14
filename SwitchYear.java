package handson2;

import java.util.Scanner;

public class SwitchYear {

	int date = 0, month = 0, year = 0;

	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		date = sc.nextInt();
		System.out.println("Enter month");
		month = sc.nextInt();
		System.out.println("Enter year");
		year = sc.nextInt();

		System.out.println(" " + date + " " + month + " " + year);

		switch (year) {
		case 1990:
		case 1991:
		case 1992:
		case 1993:
		case 1994:
			System.out.println("You're born in early 90's");
			break;
		case 1995:
		case 1996:
		case 1997:
		case 1998:
		case 1999:
			System.out.println("You're norn in late 90's");
			break;
		case 2000:
		case 2001:
		case 2002:
		case 2003:
		case 2004:
		case 2005:
		case 2006:
		case 2007:
		case 2008:
		case 2009:
			System.out.println("You're born in new decade");
			break;
		case 2011:
		case 2012:
		case 2013:
		case 2014:
		case 2015:
		case 2016:
		case 2017:
		case 2018:
		case 2019:
		case 2020:
		case 2021:
			System.out.println("You're recently born");
		default:
			if (year > 2021 || year < 1990)
				System.out.println("Invalid year");
		}
	}

	public static void main(String[] args) {
		SwitchYear year = new SwitchYear();
		year.display();
	}

}
