package com.transsnet.palmpay.core.viewmodel;

import Ad.L;
import F6.d;
import Ua.W;
import Ua.X;
import Ua.Y;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.custom_view.wheelview.widget.WheelView;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class ModelDayPick extends BaseModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f28323A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WheelView f28324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WheelView f28325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WheelView f28326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f28328g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Button f28329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f28330j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f28331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f28332p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f28333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28334w;

    public ModelDayPick(Context context) {
        super(context);
    }

    public static void d(ModelDayPick modelDayPick) {
        if (TextUtils.isEmpty(modelDayPick.f28333v) || TextUtils.isEmpty(modelDayPick.f28334w)) {
            return;
        }
        try {
            int i7 = Integer.parseInt(modelDayPick.f28333v);
            int i10 = Integer.parseInt(modelDayPick.f28334w);
            Calendar calendar = Calendar.getInstance();
            calendar.set(1, i7);
            calendar.set(2, i10 - 1);
            int actualMaximum = calendar.getActualMaximum(5);
            ArrayList arrayList = new ArrayList();
            for (int i11 = 1; i11 <= actualMaximum; i11++) {
                if (i11 < 10) {
                    arrayList.add("0" + i11);
                } else {
                    arrayList.add("" + i11);
                }
            }
            modelDayPick.f28332p = arrayList;
            modelDayPick.f28325d.setWheelData(arrayList);
            modelDayPick.f28325d.f();
        } catch (NumberFormatException e10) {
            d.c("ModelDayPick", e10.getMessage());
        }
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View.inflate(context, g.core_model_day_pick, this);
        this.f28331o = new ArrayList();
        this.f28330j = new ArrayList();
        this.f28332p = new ArrayList();
        Date nowDate = TimeUtils.getNowDate();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(nowDate);
        int i7 = calendar.get(1);
        for (int i10 = i7 - 120; i10 < i7 + 1; i10++) {
            this.f28331o.add(i10 + "");
        }
        for (int i11 = 1; i11 < 13; i11++) {
            if (i11 < 10) {
                this.f28330j.add("0" + i11);
            } else {
                this.f28330j.add("" + i11);
            }
        }
        for (int i12 = 1; i12 < 31; i12++) {
            if (i12 < 10) {
                this.f28332p.add("0" + i12);
            } else {
                this.f28332p.add("" + i12);
            }
        }
        this.f28324c = (WheelView) findViewById(e.mdp_wheel_right);
        this.f28326e = (WheelView) findViewById(e.mdp_wheel_middle);
        this.f28325d = (WheelView) findViewById(e.mdp_wheel_left);
        this.f28327f = (TextView) findViewById(e.mdp_title_tv);
        this.f28328g = (ImageView) findViewById(e.mdp_close_iv);
        this.f28329i = (Button) findViewById(e.mdp_confirm_btn);
        dc.b bVar = new dc.b();
        bVar.f35864a = 0;
        bVar.f35866c = Color.parseColor("#95a1ab");
        bVar.f35867d = this.f31417a.getResources().getColor(L6.b.ppColorPrimary);
        bVar.f35868e = 18;
        bVar.f35869f = 23;
        bVar.f35865b = this.f31417a.getResources().getColor(L6.b.ppColorPrimary);
        this.f28324c.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f28324c.setWheelSize(3);
        WheelView wheelView = this.f28324c;
        dc.a aVar = dc.a.f35861b;
        wheelView.setSkin(aVar);
        this.f28324c.setWheelData(this.f28331o);
        this.f28324c.setSelection(HomeDialogState.PRIORITY_HIGHEST);
        this.f28324c.setStyle(bVar);
        this.f28326e.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f28326e.setWheelSize(3);
        this.f28326e.setSkin(aVar);
        this.f28326e.setWheelData(this.f28330j);
        this.f28326e.setSelection(1);
        this.f28326e.setStyle(bVar);
        this.f28325d.setWheelAdapter(new L(this.f31417a, 2, false));
        this.f28325d.setWheelSize(3);
        this.f28325d.setSkin(aVar);
        this.f28325d.setWheelData(this.f28332p);
        this.f28325d.setSelection(1);
        this.f28325d.setStyle(bVar);
        this.f28326e.setOnWheelItemSelectedListener(new W(this));
        this.f28324c.setOnWheelItemSelectedListener(new X(this));
        this.f28325d.setOnWheelItemSelectedListener(new Y(this));
        return this;
    }

    public final int e(String str) {
        if (this.f28330j != null && !TextUtils.isEmpty(str)) {
            for (int i7 = 0; i7 < this.f28330j.size(); i7++) {
                if (str.equals(this.f28330j.get(i7))) {
                    return i7;
                }
            }
        }
        return 0;
    }

    public final int f(String str) {
        if (this.f28331o != null && !TextUtils.isEmpty(str)) {
            for (int i7 = 0; i7 < this.f28331o.size(); i7++) {
                if (str.equals(this.f28331o.get(i7))) {
                    return i7;
                }
            }
        }
        return 0;
    }

    public final void g() {
        String str = this.f28323A + "-" + this.f28334w + "-" + this.f28333v;
        this.t = str;
        this.f28327f.setText(str);
    }

    public String getNowPickDate() {
        return this.t;
    }

    public int getNowPickDay() {
        try {
            return Integer.parseInt(this.f28323A);
        } catch (NumberFormatException e10) {
            d.c("ModelDayPick", e10.getMessage());
            return 0;
        }
    }

    public int getNowPickMonth() {
        try {
            return Integer.parseInt(this.f28334w);
        } catch (NumberFormatException e10) {
            d.c("ModelDayPick", e10.getMessage());
            return 0;
        }
    }

    public int getNowPickYear() {
        try {
            return Integer.parseInt(this.f28333v);
        } catch (NumberFormatException e10) {
            d.c("ModelDayPick", e10.getMessage());
            return 0;
        }
    }

    public ModelDayPick(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ModelDayPick(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
