package com.google.android.material.datepicker;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
class DateStrings {
    private DateStrings() {
    }

    public static p058e0.a getDateRangeString(@Nullable Long l5, @Nullable Long l6, @Nullable SimpleDateFormat simpleDateFormat) {
        if (l5 == null && l6 == null) {
            return new p058e0.a(null, null);
        }
        if (l5 == null) {
            return new p058e0.a(null, getDateString(l6.longValue(), simpleDateFormat));
        }
        if (l6 == null) {
            return new p058e0.a(getDateString(l5.longValue(), simpleDateFormat), null);
        }
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(l5.longValue());
        Calendar utcCalendar2 = UtcDates.getUtcCalendar();
        utcCalendar2.setTimeInMillis(l6.longValue());
        if (simpleDateFormat != null) {
            return new p058e0.a(simpleDateFormat.format(new Date(l5.longValue())), simpleDateFormat.format(new Date(l6.longValue())));
        }
        if (utcCalendar.get(1) == utcCalendar2.get(1)) {
            return utcCalendar.get(1) == todayCalendar.get(1) ? new p058e0.a(getMonthDay(l5.longValue(), Locale.getDefault()), getMonthDay(l6.longValue(), Locale.getDefault())) : new p058e0.a(getMonthDay(l5.longValue(), Locale.getDefault()), getYearMonthDay(l6.longValue(), Locale.getDefault()));
        }
        return new p058e0.a(getYearMonthDay(l5.longValue(), Locale.getDefault()), getYearMonthDay(l6.longValue(), Locale.getDefault()));
    }

    public static String getDateString(long j6) {
        return getDateString(j6, null);
    }

    public static String getDayContentDescription(Context context, long j6, boolean z3, boolean z8, boolean z10) {
        String optionalYearMonthDayOfWeekDay = getOptionalYearMonthDayOfWeekDay(j6);
        if (z3) {
            optionalYearMonthDayOfWeekDay = String.format(context.getString(R.string.mtrl_picker_today_description), optionalYearMonthDayOfWeekDay);
        }
        if (z8) {
            return String.format(context.getString(R.string.mtrl_picker_start_date_description), optionalYearMonthDayOfWeekDay);
        }
        return z10 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), optionalYearMonthDayOfWeekDay) : optionalYearMonthDayOfWeekDay;
    }

    public static String getMonthDay(long j6) {
        return getMonthDay(j6, Locale.getDefault());
    }

    public static String getMonthDayOfWeekDay(long j6) {
        return getMonthDayOfWeekDay(j6, Locale.getDefault());
    }

    public static String getOptionalYearMonthDayOfWeekDay(long j6) {
        return isDateWithinCurrentYear(j6) ? getMonthDayOfWeekDay(j6) : getYearMonthDayOfWeekDay(j6);
    }

    public static String getYearContentDescription(Context context, int i7) {
        return UtcDates.getTodayCalendar().get(1) == i7 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i7)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i7));
    }

    public static String getYearMonth(long j6) {
        return UtcDates.getYearMonthFormat(Locale.getDefault()).format(new Date(j6));
    }

    public static String getYearMonthDay(long j6) {
        return getYearMonthDay(j6, Locale.getDefault());
    }

    public static String getYearMonthDayOfWeekDay(long j6) {
        return getYearMonthDayOfWeekDay(j6, Locale.getDefault());
    }

    private static boolean isDateWithinCurrentYear(long j6) {
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        utcCalendar.setTimeInMillis(j6);
        return todayCalendar.get(1) == utcCalendar.get(1);
    }

    public static String getDateString(long j6, @Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j6));
        }
        return isDateWithinCurrentYear(j6) ? getMonthDay(j6) : getYearMonthDay(j6);
    }

    public static String getMonthDay(long j6, Locale locale) {
        return UtcDates.getAbbrMonthDayFormat(locale).format(new Date(j6));
    }

    public static String getMonthDayOfWeekDay(long j6, Locale locale) {
        return UtcDates.getMonthWeekdayDayFormat(locale).format(new Date(j6));
    }

    public static String getYearMonthDay(long j6, Locale locale) {
        return UtcDates.getYearAbbrMonthDayFormat(locale).format(new Date(j6));
    }

    public static String getYearMonthDayOfWeekDay(long j6, Locale locale) {
        return UtcDates.getYearMonthWeekdayDayFormat(locale).format(new Date(j6));
    }

    public static p058e0.a getDateRangeString(@Nullable Long l5, @Nullable Long l6) {
        return getDateRangeString(l5, l6, null);
    }
}
