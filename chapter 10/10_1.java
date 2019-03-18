/*********************************************************************************
* (The Time class) Design a class named Time. The class contains:                *
* ■ The data fields hour, minute, and second that represent a time.              *
* ■ A no-arg constructor that creates a Time object for the current time. (The   *
*   values of the data fields will represent the current time.)                  *
* ■ A constructor that constructs a Time object with a specified elapsed time    *
*   since midnight, January 1, 1970, in milliseconds. (The values of the data    *
*   fields will represent this time.)                                            *
* ■ A constructor that constructs a Time object with the specified hour, minute, *
*   and second.                                                                  *
* ■ Three getter methods for the data fields hour, minute, and second,           *
*   respectively.                                                                *
* ■ A method named setTime(long elapseTime) that sets a new time                 *
*   for the object using the elapsed time. For example, if the elapsed time is   *
*   555550000 milliseconds, the hour is 10, the minute is 19, and the second is  *
*   10.                                                                          *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write         *
* a test program that creates two Time objects (using new Time() and new         *
* Time(555550000)) and displays their hour, minute, and second in the format     *
* hour:minute:second.                                                            *
* (Hint: The first two constructors will extract the hour, minute, and second    *
* from the elapsed time. For the no-arg constructor, the current time can be     *
* obtained using System.currentTimeMillis(), as shown in Listing 2.7,            *
* ShowCurrentTime.java.)                                                         *
*********************************************************************************/
public class Main {
	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);

		System.out.println(time1.getHour() + ":" + time1.getMinute() + 
			":" + time1. getSecond());
		System.out.println(time2.getHour() + ":" + time2.getMinute() + 
			":" + time2. getSecond());
	}
/************************************************
*                      Time                     *
*-----------------------------------------------*
* -hour: long                                   *
* -minute: long                                 *
* -second: long                                 *
* Time()                                        *
* Time(elapseTime: long)                        *
* Time(hour: long, minute: long, second: long)  *
* getHour(): long                               *
* getMinute(): long                             *
* getSecond(): long                             *
* setTime(elapseTime: long)                     *
************************************************/

public class Time {
	private long hour;
	private long minute;
	private long second;

	Time() {
		this(0);	
	}

	Time(long elapseTime) {
		setTime(elapseTime);
	}

	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	public void setTime(long elapseTime) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		second = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		minute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		hour = totalHours % 24;

		if (elapseTime > 0) {
			totalSeconds = elapseTime / 1000;
			second = totalSeconds % 60;
			totalMinutes = totalSeconds / 60;
			minute = totalMinutes % 60;
			totalHours = totalMinutes / 60;
			hour = totalHours % 24;
		}
	}
}
}