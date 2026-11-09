package com.transsnet.palmpay.util;

import C0.G;
import N8.q0;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.StringRes;
import com.google.android.material.timepicker.TimeModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeUtils {

    @SuppressLint({"SimpleDateFormat"})
    private static final DateFormat DEFAULT_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH);
    private static final int[] ZODIAC_FLAGS = {20, 19, 21, 21, 21, 22, 23, 23, 23, 24, 23, 22};

    private TimeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean checkDateBeforeNow(int i7, int i10) {
        Calendar calendar = Calendar.getInstance();
        int i11 = calendar.get(1);
        int i12 = calendar.get(2);
        if (i7 > i11) {
            return false;
        }
        return i7 != i11 || i10 < i12 + 1;
    }

    public static long date2Millis(Date date) {
        return date.getTime();
    }

    public static String date2String(Date date) {
        return date2String(date, DEFAULT_FORMAT);
    }

    public static String getChineseWeek(String str) {
        return getChineseWeek(string2Date(str, DEFAULT_FORMAT));
    }

    public static Date getDate(long j6, long j10, int i7) {
        return millis2Date(j6 + timeSpan2Millis(j10, i7));
    }

    public static Date getDateByNow(long j6, int i7) {
        return getDate(getNowMills(), j6, i7);
    }

    public static String getFitTimeSpan(String str, String str2, int i7) {
        DateFormat dateFormat = DEFAULT_FORMAT;
        return millis2FitTimeSpan(Math.abs(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat)), i7);
    }

    public static String getFitTimeSpanByNow(String str, int i7) {
        return getFitTimeSpan(getNowString(), str, DEFAULT_FORMAT, i7);
    }

    public static String getFriendlyTimeSpanByNow(String str) {
        return getFriendlyTimeSpanByNow(str, DEFAULT_FORMAT);
    }

    public static long getMillis(long j6, long j10, int i7) {
        return j6 + timeSpan2Millis(j10, i7);
    }

    public static long getMillisByNow(long j6, int i7) {
        return getMillis(getNowMills(), j6, i7);
    }

    public static int getMonth(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        return calendar.get(2) + 1;
    }

    public static Date getNowDate() {
        return new Date();
    }

    public static long getNowMills() {
        return System.currentTimeMillis();
    }

    public static String getNowString() {
        return millis2String(System.currentTimeMillis(), DEFAULT_FORMAT);
    }

    public static int getOffsetOfTwoDays(long j6, long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        calendar2.set(10, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 86400000);
    }

    public static long getStartTimeOfThisMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 0);
        calendar.set(11, 0);
        calendar.set(13, 0);
        return q0.c(calendar, 12, 0, 14, 0);
    }

    public static long getStartTimeOfThisWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(7, 1);
        calendar.set(11, 0);
        calendar.set(13, 0);
        return q0.c(calendar, 12, 0, 14, 0);
    }

    public static long getStartTimeOfToday() {
        return getWeeOfToday();
    }

    public static String getString(long j6, long j10, int i7) {
        return getString(j6, DEFAULT_FORMAT, j10, i7);
    }

    public static String getStringByNow(long j6, int i7) {
        return getStringByNow(j6, DEFAULT_FORMAT, i7);
    }

    public static long getTimeSpan(String str, String str2, int i7) {
        return getTimeSpan(str, str2, DEFAULT_FORMAT, i7);
    }

    public static long getTimeSpanByNow(String str, int i7) {
        return getTimeSpan(getNowString(), str, DEFAULT_FORMAT, i7);
    }

    public static String getUSWeek(String str) {
        return getUSWeek(string2Date(str, DEFAULT_FORMAT));
    }

    private static long getWeeOfToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(13, 0);
        return q0.c(calendar, 12, 0, 14, 0);
    }

    public static int getWeekIndex(String str) {
        return getWeekIndex(string2Date(str, DEFAULT_FORMAT));
    }

    public static int getWeekOfMonth(String str) {
        return getWeekOfMonth(string2Date(str, DEFAULT_FORMAT));
    }

    public static int getWeekOfYear(String str) {
        return getWeekOfYear(string2Date(str, DEFAULT_FORMAT));
    }

    public static int getYear(long j6) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j6);
        return calendar.get(1);
    }

    public static boolean isCurrentMonth(long j6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return getYear(j6) == getYear(jCurrentTimeMillis) && getMonth(j6) == getMonth(jCurrentTimeMillis);
    }

    public static boolean isCurrentYear(long j6) {
        return getYear(j6) == getYear(System.currentTimeMillis());
    }

    public static boolean isLeapYear(String str) {
        return isLeapYear(string2Date(str, DEFAULT_FORMAT));
    }

    public static boolean isToday(String str) {
        return isToday(string2Millis(str, DEFAULT_FORMAT));
    }

    public static boolean isTomorrow(long j6) {
        return isToday(j6 - 86400000);
    }

    public static boolean isYesterday(String str) {
        return isYesterday(string2Millis(str, DEFAULT_FORMAT));
    }

    public static Date millis2Date(long j6) {
        return new Date(j6);
    }

    private static String millis2FitTimeSpan(long j6, int i7) {
        if (j6 < 0 || i7 <= 0) {
            return null;
        }
        int iMin = Math.min(i7, 5);
        String[] strArr = {"day", "hour", "min", "s", "ms"};
        if (j6 == 0) {
            return "0" + strArr[iMin - 1];
        }
        StringBuilder sb2 = new StringBuilder();
        int[] iArr = {86400000, 3600000, 60000, 1000, 1};
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = iArr[i10];
            if (j6 >= i11) {
                long j10 = j6 / ((long) i11);
                j6 -= ((long) i11) * j10;
                sb2.append(j10);
                sb2.append(strArr[i10]);
            }
        }
        return sb2.toString();
    }

    public static String millis2FitTimeSpanReferEarn(long j6, Context context, @StringRes int i7) {
        long jAbs = Math.abs(string2Millis(getNowString(), DEFAULT_FORMAT) - j6);
        long j10 = jAbs / 86400000;
        long j11 = jAbs - (86400000 * j10);
        long j12 = j11 / 3600000;
        long j13 = j11 - (3600000 * j12);
        long j14 = j13 / 60000;
        return context.getString(i7, Long.toString(j10), String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j12)), String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf(j14)), String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Long.valueOf((j13 - (60000 * j14)) / 1000)));
    }

    public static String millis2String(long j6) {
        return millis2String(j6, DEFAULT_FORMAT);
    }

    private static long millis2TimeSpan(long j6, int i7) {
        return j6 / ((long) i7);
    }

    public static Date string2Date(String str) {
        return string2Date(str, DEFAULT_FORMAT);
    }

    public static long string2Millis(String str) {
        return string2Millis(str, DEFAULT_FORMAT);
    }

    public static String stringForTime(long j6) {
        StringBuilder sb2 = new StringBuilder();
        Formatter formatter = new Formatter(sb2, Locale.getDefault());
        int i7 = (int) (j6 / 1000);
        int i10 = i7 % 60;
        sb2.setLength(0);
        return formatter.format("%02d:%02d", Integer.valueOf((i7 / 60) % 60), Integer.valueOf(i10)).toString();
    }

    private static long timeSpan2Millis(long j6, int i7) {
        return j6 * ((long) i7);
    }

    public static String date2String(Date date, DateFormat dateFormat) {
        return dateFormat.format(date);
    }

    public static String getChineseWeek(String str, DateFormat dateFormat) {
        return getChineseWeek(string2Date(str, dateFormat));
    }

    public static Date getDate(String str, long j6, int i7) {
        return getDate(str, DEFAULT_FORMAT, j6, i7);
    }

    public static String getFitTimeSpanByNow(String str, DateFormat dateFormat, int i7) {
        return getFitTimeSpan(getNowString(dateFormat), str, dateFormat, i7);
    }

    public static String getFriendlyTimeSpanByNow(String str, DateFormat dateFormat) {
        return getFriendlyTimeSpanByNow(string2Millis(str, dateFormat));
    }

    public static long getMillis(String str, long j6, int i7) {
        return getMillis(str, DEFAULT_FORMAT, j6, i7);
    }

    public static String getNowString(DateFormat dateFormat) {
        return millis2String(System.currentTimeMillis(), dateFormat);
    }

    public static String getString(long j6, DateFormat dateFormat, long j10, int i7) {
        return millis2String(j6 + timeSpan2Millis(j10, i7), dateFormat);
    }

    public static String getStringByNow(long j6, DateFormat dateFormat, int i7) {
        return getString(getNowMills(), dateFormat, j6, i7);
    }

    public static long getTimeSpan(String str, String str2, DateFormat dateFormat, int i7) {
        return millis2TimeSpan(Math.abs(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat)), i7);
    }

    public static long getTimeSpanByNow(String str, DateFormat dateFormat, int i7) {
        return getTimeSpan(getNowString(dateFormat), str, dateFormat, i7);
    }

    public static String getUSWeek(String str, DateFormat dateFormat) {
        return getUSWeek(string2Date(str, dateFormat));
    }

    public static int getWeekIndex(String str, DateFormat dateFormat) {
        return getWeekIndex(string2Date(str, dateFormat));
    }

    public static int getWeekOfMonth(String str, DateFormat dateFormat) {
        return getWeekOfMonth(string2Date(str, dateFormat));
    }

    public static int getWeekOfYear(String str, DateFormat dateFormat) {
        return getWeekOfYear(string2Date(str, dateFormat));
    }

    public static boolean isLeapYear(String str, DateFormat dateFormat) {
        return isLeapYear(string2Date(str, dateFormat));
    }

    public static boolean isToday(String str, DateFormat dateFormat) {
        return isToday(string2Millis(str, dateFormat));
    }

    public static boolean isYesterday(String str, DateFormat dateFormat) {
        return isYesterday(string2Millis(str, dateFormat));
    }

    public static String millis2String(long j6, DateFormat dateFormat) {
        return dateFormat.format(new Date(j6));
    }

    public static Date string2Date(String str, DateFormat dateFormat) {
        try {
            return dateFormat.parse(str);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static long string2Millis(String str, DateFormat dateFormat) {
        try {
            return dateFormat.parse(str).getTime();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static String getChineseWeek(Date date) {
        return new SimpleDateFormat("E", Locale.CHINA).format(date);
    }

    public static Date getDate(String str, DateFormat dateFormat, long j6, int i7) {
        return millis2Date(string2Millis(str, dateFormat) + timeSpan2Millis(j6, i7));
    }

    public static String getFitTimeSpan(String str, String str2, DateFormat dateFormat, int i7) {
        return millis2FitTimeSpan(Math.abs(string2Millis(str, dateFormat) - string2Millis(str2, dateFormat)), i7);
    }

    public static String getFitTimeSpanByNow(Date date, int i7) {
        return getFitTimeSpan(getNowDate(), date, i7);
    }

    public static String getFriendlyTimeSpanByNow(Date date) {
        return getFriendlyTimeSpanByNow(date.getTime());
    }

    public static long getMillis(String str, DateFormat dateFormat, long j6, int i7) {
        return string2Millis(str, dateFormat) + timeSpan2Millis(j6, i7);
    }

    public static String getString(String str, long j6, int i7) {
        return getString(str, DEFAULT_FORMAT, j6, i7);
    }

    public static long getTimeSpanByNow(Date date, int i7) {
        return getTimeSpan(new Date(), date, i7);
    }

    public static String getUSWeek(Date date) {
        return new SimpleDateFormat("EEEE", Locale.US).format(date);
    }

    public static int getWeekIndex(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(7);
    }

    public static int getWeekOfMonth(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(4);
    }

    public static int getWeekOfYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(3);
    }

    public static boolean isLeapYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return isLeapYear(calendar.get(1));
    }

    public static boolean isToday(Date date) {
        return isToday(date.getTime());
    }

    public static boolean isYesterday(Date date) {
        return isYesterday(date.getTime());
    }

    public static String getChineseWeek(long j6) {
        return getChineseWeek(new Date(j6));
    }

    public static Date getDate(Date date, long j6, int i7) {
        return millis2Date(date2Millis(date) + timeSpan2Millis(j6, i7));
    }

    public static String getFitTimeSpanByNow(long j6, int i7) {
        return getFitTimeSpan(System.currentTimeMillis(), j6, i7);
    }

    public static String getFriendlyTimeSpanByNow(long j6) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j6;
        if (jCurrentTimeMillis < 1000) {
            return "just now";
        }
        if (jCurrentTimeMillis < 60000) {
            return String.format(Locale.getDefault(), "%ds ago", Long.valueOf(jCurrentTimeMillis / 1000));
        }
        if (jCurrentTimeMillis < 3600000) {
            return String.format(Locale.getDefault(), "%dmin ago", Long.valueOf(jCurrentTimeMillis / 60000));
        }
        long weeOfToday = getWeeOfToday();
        String strMillis2String = millis2String(j6, new SimpleDateFormat("HH:mm"));
        if (j6 >= weeOfToday) {
            return G.o("Today ", strMillis2String);
        }
        if (j6 >= weeOfToday - 86400000) {
            return G.o("Yesterday ", strMillis2String);
        }
        return millis2String(j6, new SimpleDateFormat("MM-dd"));
    }

    public static long getMillis(Date date, long j6, int i7) {
        return date2Millis(date) + timeSpan2Millis(j6, i7);
    }

    public static String getString(String str, DateFormat dateFormat, long j6, int i7) {
        return millis2String(string2Millis(str, dateFormat) + timeSpan2Millis(j6, i7), dateFormat);
    }

    public static long getTimeSpan(Date date, Date date2, int i7) {
        return millis2TimeSpan(Math.abs(date2Millis(date) - date2Millis(date2)), i7);
    }

    public static long getTimeSpanByNow(long j6, int i7) {
        return getTimeSpan(System.currentTimeMillis(), j6, i7);
    }

    public static String getUSWeek(long j6) {
        return getUSWeek(new Date(j6));
    }

    public static boolean isToday(long j6) {
        long weeOfToday = getWeeOfToday();
        return j6 >= weeOfToday && j6 < weeOfToday + 86400000;
    }

    public static boolean isYesterday(long j6) {
        long weeOfToday = getWeeOfToday();
        return j6 >= weeOfToday - 86400000 && j6 < weeOfToday;
    }

    public static String getFitTimeSpan(Date date, Date date2, int i7) {
        return millis2FitTimeSpan(Math.abs(date2Millis(date) - date2Millis(date2)), i7);
    }

    public static String getString(Date date, long j6, int i7) {
        return getString(date, DEFAULT_FORMAT, j6, i7);
    }

    public static long getTimeSpan(long j6, long j10, int i7) {
        return millis2TimeSpan(Math.abs(j6 - j10), i7);
    }

    public static String getFitTimeSpan(long j6, long j10, int i7) {
        return millis2FitTimeSpan(Math.abs(j6 - j10), i7);
    }

    public static String getString(Date date, DateFormat dateFormat, long j6, int i7) {
        return millis2String(date2Millis(date) + timeSpan2Millis(j6, i7), dateFormat);
    }

    public static int getWeekIndex(long j6) {
        return getWeekIndex(millis2Date(j6));
    }

    public static int getWeekOfMonth(long j6) {
        return getWeekOfMonth(millis2Date(j6));
    }

    public static int getWeekOfYear(long j6) {
        return getWeekOfYear(millis2Date(j6));
    }

    public static boolean isLeapYear(long j6) {
        return isLeapYear(millis2Date(j6));
    }

    public static boolean isLeapYear(int i7) {
        return (i7 % 4 == 0 && i7 % 100 != 0) || i7 % 400 == 0;
    }
}
