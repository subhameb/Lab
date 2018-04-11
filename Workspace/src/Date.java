import java.io.*;
import java.util.*;
public class Date 
{
	int day;
	int month;
	int year;
Date(int day,int month,int year)
{
	this.day=day;
	this.month=month;
	this.year=year;
}
public void displayDate()
{
	System.out.println("Date of joining is :" +day+"/"+month+"/" +year);
}
}

