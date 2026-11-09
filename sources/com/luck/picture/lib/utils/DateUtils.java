package com.luck.picture.lib.utils;

import N8.q0;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.camera.video.u;
import com.luck.picture.lib.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class DateUtils {

    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat SF = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM");

    @SuppressLint({"SimpleDateFormat"})
    private static final SimpleDateFormat SDF_YEAR = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String cdTime(long j6, long j10) {
        long j11 = j10 - j6;
        if (j11 > 1000) {
            return q0.n(new StringBuilder(), "秒", j11 / 1000);
        }
        return j11 + "毫秒";
    }

    public static int dateDiffer(long j6) {
        try {
            return (int) Math.abs(getCurrentTimeMillis() - j6);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static String formatDurationTime(long j6) {
        String str = j6 < 0 ? "-" : "";
        long jAbs = Math.abs(j6) / 1000;
        long j10 = jAbs % 60;
        long j11 = (jAbs / 60) % 60;
        long j12 = jAbs / 3600;
        return j12 > 0 ? String.format(Locale.getDefault(), "%s%d:%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11), Long.valueOf(j10)) : String.format(Locale.getDefault(), "%s%02d:%02d", str, Long.valueOf(j11), Long.valueOf(j10));
    }

    public static String getCreateFileName(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbS = u.s(str);
        sbS.append(SF.format(Long.valueOf(jCurrentTimeMillis)));
        return sbS.toString();
    }

    public static long getCurrentTimeMillis() {
        String string = ValueOf.toString(Long.valueOf(System.currentTimeMillis()));
        if (string.length() > 10) {
            string = string.substring(0, 10);
        }
        return ValueOf.toLong(string);
    }

    public static String getDataFormat(Context context, long j6) {
        if (String.valueOf(j6).length() <= 10) {
            j6 *= 1000;
        }
        if (isThisWeek(j6)) {
            return context.getString(R.string.ps_current_week);
        }
        return isThisMonth(j6) ? context.getString(R.string.ps_current_month) : SDF.format(Long.valueOf(j6));
    }

    public static String getYearDataFormat(long j6) {
        if (String.valueOf(j6).length() <= 10) {
            j6 *= 1000;
        }
        return SDF_YEAR.format(Long.valueOf(j6));
    }

    public static boolean isThisMonth(long j6) {
        Date date = new Date(j6);
        SimpleDateFormat simpleDateFormat = SDF;
        return simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date()));
    }

    private static boolean isThisWeek(long j6) {
        Calendar calendar = Calendar.getInstance();
        int i7 = calendar.get(3);
        calendar.setTime(new Date(j6));
        return calendar.get(3) == i7;
    }

    public static long millisecondToSecond(long j6) {
        return (j6 / 1000) * 1000;
    }

    public static String getCreateFileName() {
        return SF.format(Long.valueOf(System.currentTimeMillis()));
    }
}
