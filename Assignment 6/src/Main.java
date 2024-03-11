/*
 * Adler G Luders
 * COP 3337
 * Assignment 6
 * 9 March 2024
 */

import java.util.*;
import java.lang.*;

public class Main {

  private static String[] arrString;
  private static int month;
  private static int date;
  private static int year;
  private static boolean isLeapYear;

  public static boolean leapYearCheck(int yr) {
    if ((yr % 4 == 0 && yr % 100 != 0) || (yr % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * @param args
   * @throws MonthException
   * @throws DayException
   * @throws YearException
   */
  public static void main(String args[]) throws MonthException, DayException, YearException {
    Scanner scan = new Scanner(System.in);
    String userDate;
    String finalMonth = "";

    isLeapYear = leapYearCheck(year);

    System.out.print("Enter date in MM/DD/YYYY format: ");
    userDate = scan.nextLine();

    arrString = userDate.split("/", 3);

    try {
      month = Integer.parseInt(arrString[0]);
      date = Integer.parseInt(arrString[1]);
      year = Integer.parseInt(arrString[2]);
    } catch (NumberFormatException e) {

      System.out.println("Please enter the date again with a valid month integer input");
    }

    if (month < 1 || month > 12) {
      throw new MonthException("Invalid Month Entry");
    } else {

      switch (month) {
        case 12:
          finalMonth = "Decemeber";
          break;
        case 11:
          finalMonth = "Novemeber";
          break;
        case 10:
          finalMonth = "October";
          break;
        case 9:
          finalMonth = "September";
          break;
        case 8:
          finalMonth = "August";
          break;
        case 7:
          finalMonth = "July";
          break;
        case 6:
          finalMonth = "June";
          break;
        case 5:
          finalMonth = "May";
          break;
        case 4:
          finalMonth = "April";
          break;
        case 3:
          finalMonth = "March";
          break;
        case 2:
          finalMonth = "February";
          break;
        case 1:
          finalMonth = "January";
          break;
        default:
          finalMonth = "Invalid Month";
          break;
      }
    }

    if (date < 0 || date > 31) {
      throw new DayException("Invalid date entry");
    }

    if (year > 3000 || year < 1000) {
      throw new YearException("Invalid Year entry");
    }

    System.out.println(finalMonth + " " + date + "," + year);
    scan.close();
  }
}

/**
 * MonthException
 */
class MonthException extends Exception {
  public MonthException(String err) {
    super(err);
  }
}

/**
 * DayException
 */
class DayException extends Exception {
  public DayException(String err) {
    super(err);
  }

}

/**
 * YearException
 */
class YearException extends Exception {
  public YearException(String err) {
    super(err);
  }

}