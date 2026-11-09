package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.R;
import com.google.android.material.timepicker.TimeModel;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class MonthAdapter extends BaseAdapter {
    private static final int NO_DAY_NUMBER = -1;
    final CalendarConstraints calendarConstraints;
    CalendarStyle calendarStyle;
    final DateSelector<?> dateSelector;

    @Nullable
    final DayViewDecorator dayViewDecorator;
    final Month month;
    private Collection<Long> previouslySelectedDates;
    static final int MAXIMUM_WEEKS = UtcDates.getUtcCalendar().getMaximum(4);
    private static final int MAXIMUM_GRID_CELLS = (UtcDates.getUtcCalendar().getMaximum(7) + UtcDates.getUtcCalendar().getMaximum(5)) - 1;

    public MonthAdapter(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, @Nullable DayViewDecorator dayViewDecorator) {
        this.month = month;
        this.dateSelector = dateSelector;
        this.calendarConstraints = calendarConstraints;
        this.dayViewDecorator = dayViewDecorator;
        this.previouslySelectedDates = dateSelector.getSelectedDays();
    }

    private String getDayContentDescription(Context context, long j6) {
        return DateStrings.getDayContentDescription(context, j6, isToday(j6), isStartOfRange(j6), isEndOfRange(j6));
    }

    private void initializeStyles(Context context) {
        if (this.calendarStyle == null) {
            this.calendarStyle = new CalendarStyle(context);
        }
    }

    private boolean isSelected(long j6) {
        Iterator<Long> it = this.dateSelector.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (UtcDates.canonicalYearMonthDay(j6) == UtcDates.canonicalYearMonthDay(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean isToday(long j6) {
        return UtcDates.getTodayCalendar().getTimeInMillis() == j6;
    }

    private void updateSelectedState(@Nullable TextView textView, long j6, int i7) {
        boolean zIsSelected;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String dayContentDescription = getDayContentDescription(context, j6);
        textView.setContentDescription(dayContentDescription);
        boolean zIsValid = this.calendarConstraints.getDateValidator().isValid(j6);
        if (zIsValid) {
            textView.setEnabled(true);
            zIsSelected = isSelected(j6);
            textView.setSelected(zIsSelected);
            if (zIsSelected) {
                calendarItemStyle = this.calendarStyle.selectedDay;
            } else {
                calendarItemStyle = isToday(j6) ? this.calendarStyle.todayDay : this.calendarStyle.day;
            }
        } else {
            zIsSelected = false;
            textView.setEnabled(false);
            calendarItemStyle = this.calendarStyle.invalidDay;
        }
        boolean z3 = zIsSelected;
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator == null || i7 == -1) {
            calendarItemStyle.styleItem(textView);
            return;
        }
        Month month = this.month;
        int i10 = month.year;
        int i11 = month.month;
        calendarItemStyle.styleItem(textView, dayViewDecorator.getBackgroundColor(context, i10, i11, i7, zIsValid, z3), this.dayViewDecorator.getTextColor(context, i10, i11, i7, zIsValid, z3));
        textView.setCompoundDrawables(this.dayViewDecorator.getCompoundDrawableLeft(context, i10, i11, i7, zIsValid, z3), this.dayViewDecorator.getCompoundDrawableTop(context, i10, i11, i7, zIsValid, z3), this.dayViewDecorator.getCompoundDrawableRight(context, i10, i11, i7, zIsValid, z3), this.dayViewDecorator.getCompoundDrawableBottom(context, i10, i11, i7, zIsValid, z3));
        textView.setContentDescription(this.dayViewDecorator.getContentDescription(context, i10, i11, i7, zIsValid, z3, dayContentDescription));
    }

    private void updateSelectedStateForDate(MaterialCalendarGridView materialCalendarGridView, long j6) {
        if (Month.create(j6).equals(this.month)) {
            int dayOfMonth = this.month.getDayOfMonth(j6);
            updateSelectedState((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().dayToPosition(dayOfMonth) - materialCalendarGridView.getFirstVisiblePosition()), j6, dayOfMonth);
        }
    }

    public int dayToPosition(int i7) {
        return firstPositionInMonth() + (i7 - 1);
    }

    public int firstPositionInMonth() {
        return this.month.daysFromStartOfWeekToFirstOfMonth(this.calendarConstraints.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return MAXIMUM_GRID_CELLS;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i7) {
        return i7 / this.month.daysInWeek;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @VisibleForTesting
    public boolean isEndOfRange(long j6) {
        Iterator<p058e0.a> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Object obj = it.next().f35984b;
            if (obj != null && ((Long) obj).longValue() == j6) {
                return true;
            }
        }
        return false;
    }

    public boolean isFirstInRow(int i7) {
        return i7 % this.month.daysInWeek == 0;
    }

    public boolean isLastInRow(int i7) {
        return (i7 + 1) % this.month.daysInWeek == 0;
    }

    @VisibleForTesting
    public boolean isStartOfRange(long j6) {
        Iterator<p058e0.a> it = this.dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Object obj = it.next().f35983a;
            if (obj != null && ((Long) obj).longValue() == j6) {
                return true;
            }
        }
        return false;
    }

    public int lastPositionInMonth() {
        return (firstPositionInMonth() + this.month.daysInMonth) - 1;
    }

    public int positionToDay(int i7) {
        return (i7 - firstPositionInMonth()) + 1;
    }

    public void updateSelectedStates(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.previouslySelectedDates.iterator();
        while (it.hasNext()) {
            updateSelectedStateForDate(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.dateSelector;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                updateSelectedStateForDate(materialCalendarGridView, it2.next().longValue());
            }
            this.previouslySelectedDates = this.dateSelector.getSelectedDays();
        }
    }

    public boolean withinMonth(int i7) {
        return i7 >= firstPositionInMonth() && i7 <= lastPositionInMonth();
    }

    @Override // android.widget.Adapter
    @Nullable
    public Long getItem(int i7) {
        if (i7 < firstPositionInMonth() || i7 > lastPositionInMonth()) {
            return null;
        }
        return Long.valueOf(this.month.getDay(positionToDay(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0054  */
    @Override // android.widget.Adapter
    @NonNull
    public TextView getView(int i7, @Nullable View view, @NonNull ViewGroup viewGroup) {
        int i10;
        initializeStyles(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iFirstPositionInMonth = i7 - firstPositionInMonth();
        if (iFirstPositionInMonth >= 0) {
            Month month = this.month;
            if (iFirstPositionInMonth >= month.daysInMonth) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i10 = -1;
            } else {
                i10 = iFirstPositionInMonth + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(i10)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
            i10 = -1;
        }
        Long item = getItem(i7);
        if (item == null) {
            return textView;
        }
        updateSelectedState(textView, item.longValue(), i10);
        return textView;
    }
}
