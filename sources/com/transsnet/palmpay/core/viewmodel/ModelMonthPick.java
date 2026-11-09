package com.transsnet.palmpay.core.viewmodel;

import Ad.L;
import F6.d;
import Pa.r0;
import Ua.C0616a0;
import Ua.C0618b0;
import Ua.Z;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class ModelMonthPick extends BaseModel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WheelView f28373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WheelView f28374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f28375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f28376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f28377g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f28378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f28379j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28380o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28381p;
    public String t;

    public ModelMonthPick(Context context) {
        super(context);
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_month_pick, this);
        d(20, 100);
        this.f28373c = (WheelView) findViewById(e.cmdp_wheel_right);
        this.f28374d = (WheelView) findViewById(e.cmdp_wheel_left_);
        this.f28375e = (TextView) findViewById(e.cmdp_title_tv);
        this.f28376f = (ImageView) findViewById(e.cmdp_close_iv);
        this.f28377g = (Button) findViewById(e.cmdp_confirm_btn);
        dc.b bVar = new dc.b();
        bVar.f35864a = 0;
        bVar.f35866c = Color.parseColor("#95a1ab");
        bVar.f35867d = this.f31417a.getResources().getColor(L6.b.ppColorPrimary);
        bVar.f35868e = 18;
        bVar.f35869f = 23;
        bVar.f35865b = this.f31417a.getResources().getColor(L6.b.ppColorPrimary);
        this.f28373c.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f28373c.setWheelSize(3);
        WheelView wheelView = this.f28373c;
        dc.a aVar = dc.a.f35861b;
        wheelView.setSkin(aVar);
        this.f28373c.setWheelData(this.f28379j);
        this.f28373c.setSelection(1);
        this.f28373c.setStyle(bVar);
        this.f28374d.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f28374d.setWheelSize(3);
        this.f28374d.setSkin(aVar);
        this.f28374d.setWheelData(this.f28378i);
        this.f28374d.setSelection(1);
        this.f28374d.setStyle(bVar);
        this.f28374d.setOnWheelItemSelectedListener(new Z(this));
        this.f28373c.setOnWheelItemSelectedListener(new C0616a0(this));
        return this;
    }

    public final void d(int i7, int i10) {
        this.f28379j = new ArrayList();
        this.f28378i = new ArrayList();
        Date nowDate = TimeUtils.getNowDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        int i11 = calendar.get(1);
        for (int i12 = i11 - i7; i12 < i11 + i10; i12++) {
            this.f28379j.add(i12 + "");
        }
        for (int i13 = 1; i13 < 13; i13++) {
            if (i13 < 10) {
                this.f28378i.add("0" + i13);
            } else {
                this.f28378i.add("" + i13);
            }
        }
    }

    public final void e() {
        String str = this.t + "/" + this.f28381p;
        this.f28380o = str;
        this.f28375e.setText(str);
    }

    public final void f(int i7, int i10) {
        d(i7, i10);
        this.f28373c.setWheelData(this.f28379j);
        this.f28373c.setSelection(1);
        this.f28373c.f();
        this.f28374d.setWheelData(this.f28378i);
        this.f28374d.setSelection(1);
        this.f28374d.f();
    }

    public final void g(int i7, int i10) {
        this.f28378i.clear();
        while (i7 <= i10) {
            if (i7 < 10) {
                this.f28378i.add("0" + i7);
            } else {
                this.f28378i.add("" + i7);
            }
            i7++;
        }
        this.f28374d.setWheelData(this.f28378i);
        this.f28374d.setSelection(1);
        this.f28374d.f();
    }

    public String getNowPickDate() {
        return this.f28380o;
    }

    public int getNowPickMonth() {
        try {
            return Integer.parseInt(this.t);
        } catch (NumberFormatException e10) {
            d.c("ModelMonthPick", e10.getMessage());
            return 0;
        }
    }

    public int getNowPickYear() {
        try {
            return Integer.parseInt(this.f28381p);
        } catch (NumberFormatException e10) {
            d.c("ModelMonthPick", e10.getMessage());
            return 0;
        }
    }

    public void setModelFromNow(boolean timeFromNow) {
        if (!timeFromNow) {
            d(20, 100);
            this.f28373c.setWheelData(this.f28379j);
            this.f28373c.setSelection(1);
            this.f28374d.setWheelData(this.f28378i);
            this.f28374d.setSelection(1);
            return;
        }
        d(0, 100);
        this.f28373c.setWheelData(this.f28379j);
        this.f28373c.setSelection(1);
        this.f28374d.setWheelData(this.f28378i);
        this.f28374d.setSelection(1);
        int iH0 = r0.h0(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (int i7 = 1; i7 < iH0; i7++) {
            if (i7 < 10) {
                arrayList.add("0" + i7);
            } else {
                arrayList.add("" + i7);
            }
        }
        this.f28378i.removeAll(arrayList);
        this.f28374d.f();
        this.f28373c.setOnWheelItemSelectedListener(new C0618b0(this, arrayList));
    }

    public ModelMonthPick(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelMonthPick(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
