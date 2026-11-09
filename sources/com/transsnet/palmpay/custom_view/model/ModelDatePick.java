package com.transsnet.palmpay.custom_view.model;

import Ad.L;
import F6.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.custom_view.x;
import com.transsnet.palmpay.util.TimeUtils;
import dc.a;
import dc.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class ModelDatePick extends BaseModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f31499A = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleDateFormat f31500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WheelView f31501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WheelView f31502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WheelView f31503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31504g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f31505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f31506j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31508p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Date f31509v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Date f31510w;

    public ModelDatePick(Context context) {
        this(context, null);
    }

    public static void d(ModelDatePick modelDatePick, int i7) {
        int startYear = i7 + modelDatePick.getStartYear();
        modelDatePick.f31507o = startYear;
        ArrayList arrayListH = modelDatePick.h(startYear);
        if (arrayListH.size() != modelDatePick.f31503f.getWheelCount()) {
            modelDatePick.f31502e.setWheelData(arrayListH);
        }
        modelDatePick.e();
        modelDatePick.f31504g.setText(modelDatePick.getDateString());
    }

    public static int g(Date date, int i7) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(i7);
    }

    private int getEndMonth() {
        return g(this.f31510w, 2) + 1;
    }

    private int getEndYear() {
        return g(this.f31510w, 1);
    }

    private int getStartMonth() {
        return g(this.f31509v, 2) + 1;
    }

    private int getStartYear() {
        return g(this.f31509v, 1);
    }

    private b getWheelViewStyle() {
        b bVar = new b();
        bVar.f35864a = 0;
        bVar.f35866c = this.f31417a.getResources().getColor(L6.b.ppColorTextDisable);
        bVar.f35867d = this.f31417a.getResources().getColor(L6.b.ppColorTextPrimary);
        bVar.f35865b = this.f31417a.getResources().getColor(L6.b.ppColorPrimary);
        return bVar;
    }

    private List<String> getYears() {
        ArrayList arrayList = new ArrayList();
        for (int startYear = getStartYear(); startYear <= getEndYear(); startYear++) {
            arrayList.add(String.valueOf(startYear));
        }
        return arrayList;
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final void b(Context context, AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvModelDatePick);
        int i10 = typedArrayObtainStyledAttributes.getInt(x.CvModelDatePick_cv_start_year, 1970);
        int i11 = typedArrayObtainStyledAttributes.getInt(x.CvModelDatePick_cv_end_year, 2070);
        this.f31509v = TimeUtils.string2Date(i10 + "-01-01 00:00:00");
        this.f31510w = TimeUtils.string2Date(i11 + "-12-31 23:59:59");
        typedArrayObtainStyledAttributes.recycle();
        a(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, t.cv_model_date_pick, this);
        this.f31501d = (WheelView) findViewById(s.cmdp_wheel_year);
        this.f31502e = (WheelView) findViewById(s.cmdp_wheel_month);
        this.f31503f = (WheelView) findViewById(s.cmdp_wheel_day);
        this.f31504g = (TextView) findViewById(s.cmdp_title_tv);
        this.f31505i = (ImageView) findViewById(s.cmdp_close_iv);
        this.f31506j = (Button) findViewById(s.cmdp_confirm_btn);
        n();
        m();
        l();
        return this;
    }

    public final void e() {
        if (f(this.f31507o, this.f31508p).size() != this.f31503f.getWheelCount()) {
            this.f31503f.setWheelData(f(this.f31507o, this.f31508p));
        }
    }

    public final ArrayList f(int i7, int i10) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        int iG = 1;
        calendar.set(1, i7);
        calendar.set(2, i10 - 1);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i7 == getStartYear() && i10 == getStartMonth()) {
            iG = g(this.f31509v, 5);
        }
        if (i7 == getEndYear() && i10 == getEndMonth()) {
            actualMaximum = g(this.f31510w, 5);
        }
        while (iG <= actualMaximum) {
            if (iG < 10) {
                arrayList.add("0" + iG);
            } else {
                arrayList.add(String.valueOf(iG));
            }
            iG++;
        }
        return arrayList;
    }

    public Calendar getDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1, this.f31507o);
        try {
            String str = (String) this.f31502e.getSelectionItem();
            String str2 = (String) this.f31503f.getSelectionItem();
            calendar.set(2, Integer.parseInt(str) - 1);
            calendar.set(5, Integer.parseInt(str2));
            return calendar;
        } catch (NumberFormatException e10) {
            d.c("ModelDatePick", "getDate: ", e10);
            return calendar;
        }
    }

    public String getDateString() {
        return TimeUtils.date2String(getDate().getTime(), new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH));
    }

    public final ArrayList h(int i7) {
        ArrayList arrayList = new ArrayList();
        int endMonth = i7 == getEndYear() ? getEndMonth() : 12;
        for (int startMonth = i7 == getStartYear() ? getStartMonth() : 1; startMonth <= endMonth; startMonth++) {
            if (startMonth < 10) {
                arrayList.add("0" + startMonth);
            } else {
                arrayList.add(String.valueOf(startMonth));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[PHI: r4
      0x0034: PHI (r4v8 int) = (r4v3 int), (r4v11 int) binds: [B:23:0x004b, B:15:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final void i(int i7, int i10, int i11) {
        int iG;
        if (i7 > getEndYear()) {
            this.f31507o = getEndYear();
        } else if (i7 < getStartYear()) {
            this.f31507o = getStartYear();
        } else {
            this.f31507o = i7;
        }
        if (i7 == getStartYear()) {
            int startMonth = getStartMonth();
            if (i10 < startMonth) {
                i10 = startMonth;
            }
            this.f31508p = i10;
            iG = g(this.f31509v, 5);
            if (i11 < iG) {
                i11 = iG;
            }
        } else if (i7 == getEndYear()) {
            int endMonth = getEndMonth();
            if (i10 > endMonth) {
                i10 = endMonth;
            }
            this.f31508p = i10;
            iG = g(this.f31510w, 5);
            if (i11 > iG) {
                i11 = iG;
            }
        } else {
            this.f31508p = i10;
        }
        int i12 = this.f31507o;
        int i13 = this.f31508p;
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(1, i12);
        calendar.set(2, i13 - 1);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i11 < actualMaximum) {
            this.t = i11;
        } else {
            this.t = actualMaximum;
        }
        n();
        m();
        l();
        this.f31504g.setText(getDateString());
    }

    public final void j(Calendar calendar, Calendar calendar2) {
        try {
            Date date = new Date();
            date.setTime(calendar.getTimeInMillis());
            Date date2 = new Date();
            date2.setTime(calendar2.getTimeInMillis());
            k(date, date2);
        } catch (Exception e10) {
            d.c("ModelDatePick", "setStartEndDate2: ", e10);
        }
    }

    public final void k(Date date, Date date2) {
        if (date == null || date2 == null || date2.before(date)) {
            return;
        }
        this.f31509v = date;
        this.f31510w = date2;
        this.f31507o = getStartYear();
        this.f31508p = getStartMonth();
        this.t = g(this.f31509v, 5);
        d.h("ModelDatePick", 3, "setStartEndDate: " + this.f31507o + " " + this.f31508p + " " + this.t);
        d.h("ModelDatePick", 3, "setEndEndDate: " + getEndYear() + " " + getEndMonth() + " " + g(this.f31510w, 5));
        i(this.f31507o, this.f31508p, this.t);
    }

    public final void l() {
        this.f31503f.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f31503f.setWheelSize(3);
        this.f31503f.setSkin(a.f35861b);
        this.f31503f.setWheelData(f(this.f31507o, this.f31508p));
        WheelView wheelView = this.f31503f;
        int i7 = this.t;
        int i10 = 0;
        if (wheelView != null) {
            for (int i11 = 0; i11 < this.f31503f.getWheelCount(); i11++) {
                try {
                    if (Integer.parseInt((String) this.f31503f.getItemAtPosition(i11)) == i7) {
                        d.h("ModelDatePick", 3, "convertDayToIndex: day:" + i7 + " index:" + i11);
                        i10 = i11;
                        break;
                    }
                    continue;
                } catch (Exception e10) {
                    d.c("ModelDatePick", "convertDayToIndex: ", e10);
                }
            }
        }
        wheelView.setSelection(i10);
        this.f31503f.setStyle(getWheelViewStyle());
        this.f31503f.setOnWheelItemSelectedListener(new Vb.b(this, 2));
    }

    public final void m() {
        this.f31502e.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f31502e.setWheelSize(3);
        this.f31502e.setSkin(a.f35861b);
        this.f31502e.setWheelData(h(this.f31507o));
        WheelView wheelView = this.f31502e;
        int i7 = this.f31508p;
        int i10 = 0;
        if (wheelView != null) {
            for (int i11 = 0; i11 < this.f31502e.getWheelCount(); i11++) {
                try {
                    if (Integer.parseInt((String) this.f31502e.getItemAtPosition(i11)) == i7) {
                        d.h("ModelDatePick", 3, "convertMothToIndex: month:" + i7 + " index:" + i11);
                        i10 = i11;
                        break;
                    }
                    continue;
                } catch (Exception e10) {
                    d.c("ModelDatePick", "convertMothToIndex: ", e10);
                }
            }
        }
        wheelView.setSelection(i10);
        this.f31502e.setStyle(getWheelViewStyle());
        this.f31502e.setOnWheelItemSelectedListener(new Vb.b(this, 1));
    }

    public final void n() {
        this.f31501d.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f31501d.setWheelSize(3);
        this.f31501d.setSkin(a.f35861b);
        this.f31501d.setWheelData(getYears());
        int startYear = this.f31507o - getStartYear();
        WheelView wheelView = this.f31501d;
        if (startYear < 0) {
            startYear = 0;
        }
        wheelView.setSelection(startYear);
        this.f31501d.setStyle(getWheelViewStyle());
        this.f31501d.setOnWheelItemSelectedListener(new Vb.b(this, 0));
    }

    public void setDate(String str) {
        Date dateString2Date = TimeUtils.string2Date(str, this.f31500c);
        if (dateString2Date == null) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateString2Date);
        setDate(calendar);
    }

    public ModelDatePick(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ModelDatePick(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31500c = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        this.t = 1;
    }

    public void setDate(Calendar calendar) {
        if (calendar == null) {
            return;
        }
        i(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }
}
