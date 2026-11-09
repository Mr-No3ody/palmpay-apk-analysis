package com.palmpay.lib.ui.calendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class WeekBar extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f24164a;

    public WeekBar(Context context) {
        super(context);
        if ("com.palmpay.lib.ui.calendar.WeekBar".equals(getClass().getName())) {
            LayoutInflater.from(context).inflate(L6.g.lib_ui_layout_calendar_week_bar, (ViewGroup) this, true);
        }
    }

    public final void a(int i7) {
        String str;
        if ("com.palmpay.lib.ui.calendar.WeekBar".equalsIgnoreCase(getClass().getName())) {
            int i10 = 0;
            while (i10 < getChildCount()) {
                TextView textView = (TextView) getChildAt(i10);
                String[] stringArray = getContext().getResources().getStringArray(this.f24164a.f24244M0);
                if (i7 == 1) {
                    str = stringArray[i10];
                } else {
                    if (i7 == 2) {
                        str = stringArray[i10 == 6 ? 0 : i10 + 1];
                    } else {
                        str = stringArray[i10 != 0 ? i10 - 1 : 6];
                    }
                }
                textView.setText(str);
                i10++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        p pVar = this.f24164a;
        super.onMeasure(i7, pVar != null ? View.MeasureSpec.makeMeasureSpec(pVar.i0, 1073741824) : View.MeasureSpec.makeMeasureSpec(s.e(getContext(), 40.0f), 1073741824));
    }

    public void setTextColor(int i7) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((TextView) getChildAt(i10)).setTextColor(i7);
        }
    }

    public void setTextSize(int i7) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((TextView) getChildAt(i10)).setTextSize(0, i7);
        }
    }

    public void setup(p pVar) {
        this.f24164a = pVar;
        if ("com.palmpay.lib.ui.calendar.WeekBar".equalsIgnoreCase(getClass().getName())) {
            setTextSize(this.f24164a.f24248P);
            setTextColor(pVar.f24271h);
            setBackgroundColor(pVar.f24243M);
            setPadding(pVar.f24301x, 0, pVar.f24303y, 0);
        }
    }
}
