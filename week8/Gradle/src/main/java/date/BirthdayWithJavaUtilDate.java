package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class BirthdayWithJavaUtilDate implements BirthdayCalculator<Date> {

    @Override
    public Date parseDate(String str) {
        SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");

        try {
            return simpleDate.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String printMonthAndDay(Date date) {
        SimpleDateFormat monthDate = new SimpleDateFormat("MM. dd.");
            return monthDate.format(date);
    }


    @Override
    public boolean isAnniversaryToday(Date date) {

        Date today = new Date();
        return printMonthAndDay(today).equals(printMonthAndDay(date));

    }

    @Override
    public int calculateAgeInYears(Date birthday) {

        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        Date today = new Date();
        int thisYear = Integer.parseInt(year.format(today));
        int birthdayYear = Integer.parseInt(year.format(birthday));
        return thisYear - birthdayYear;

    }

    @Override
    public int calculateDaysToNextAnniversary(Date date) {
        // TODO - the number of days remaining to the next anniversary of 'date' (e.g. if tomorrow, return 1)
        SimpleDateFormat days = new SimpleDateFormat("dd");
        Date today = new Date();
        int thisMonthAndDay = Integer.parseInt(days.format(today));
        int birthdayMonthAndDay = Integer.parseInt(days.format(date));
        int temp = -thisMonthAndDay + birthdayMonthAndDay;
        if (temp < 0) {
            return temp + 365;
        } else {
            return temp;
        }

    }

    public static void main(String[] args) {
        new BirthdayWithJavaUtilDate().run();
    }

    private void run() {

        print("Birthday with java.util.Date.");
        String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

        Date birthdayDate = parseDate(birthdayStr);
        print("Your birthday: " + printMonthAndDay(birthdayDate));

        if (isAnniversaryToday(birthdayDate)) {
            int ageInYears = calculateAgeInYears(birthdayDate);
            print("Congratulations! Today is your " + ageInYears + "th birthday!");
        } else {
            int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
            print("You have to wait only " + daysLeft + " days for your next birthday.");
        }
    }

    private void print(String line) {
        System.out.println(line);
    }

    private String readInput(String message) {
        System.out.print(message + ": ");
        return input.nextLine();
    }

    private final Scanner input = new Scanner(System.in, "UTF-8");

}
