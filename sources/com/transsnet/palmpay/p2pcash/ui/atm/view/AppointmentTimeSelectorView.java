package com.transsnet.palmpay.p2pcash.ui.atm.view;

import N8.q0;
import Sc.c;
import Xc.b;
import Xc.d;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.u;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AppointmentTimeSelectorView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f32956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f32957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f32959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f32960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Calendar f32961g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SelectDateListener f32962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SelectTimeQuantumListener f32963j;

    public interface SelectDateListener {
        void onSelect(long j6);
    }

    public interface SelectTimeQuantumListener {
        void onSelect(long j6, long j10);
    }

    public AppointmentTimeSelectorView(@NonNull Context context) {
        this(context, null);
    }

    public final void a() {
        String string;
        String string2;
        this.f32957c.removeAllViews();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f32959e;
            if (i7 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i7);
            TimeItemView timeItemView = new TimeItemView(this.f32955a);
            Calendar calendar = this.f32961g;
            if (calendar != null) {
                long j6 = this.f32958d;
                long timeInMillis = calendar.getTimeInMillis();
                int i10 = dVar.f11118a;
                int i11 = dVar.f11119b;
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(timeInMillis);
                calendar2.set(11, i10);
                calendar2.set(12, 0);
                timeItemView.f33067e = q0.c(calendar2, 13, 0, 14, 0);
                calendar2.set(11, i11);
                timeItemView.f33068f = calendar2.getTimeInMillis();
                timeItemView.setEnable(j6 < timeItemView.f33067e - 600000);
                if (i10 <= 12) {
                    string = u.g(i10, "am");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10 - 12);
                    sb2.append("pm");
                    string = sb2.toString();
                }
                if (i11 <= 12) {
                    string2 = u.g(i11, "am");
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i11 - 12);
                    sb3.append("pm");
                    string2 = sb3.toString();
                }
                timeItemView.f33063a.setText(string + "~" + string2);
                timeItemView.f33064b.setVisibility(dVar.f11120c ? 0 : 8);
                timeItemView.setListener(new b(this));
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i7 == arrayList.size() - 1) {
                layoutParams.bottomMargin = 0;
            } else {
                layoutParams.bottomMargin = SizeUtils.dp2px(16.0f);
            }
            this.f32957c.addView(timeItemView, layoutParams);
            i7++;
        }
    }

    public void setSelectDateListener(SelectDateListener selectDateListener) {
        this.f32962i = selectDateListener;
    }

    public void setSelectTimeQuantumListener(SelectTimeQuantumListener selectTimeQuantumListener) {
        this.f32963j = selectTimeQuantumListener;
    }

    public void setTimeQuantum(List<d> list) {
        ArrayList arrayList = this.f32959e;
        arrayList.clear();
        arrayList.addAll(list);
        a();
    }

    public AppointmentTimeSelectorView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppointmentTimeSelectorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32959e = new ArrayList();
        this.f32960f = new ArrayList();
        this.f32955a = context;
        View.inflate(context, c.p2p_appointment_time_selector_layout, this);
        this.f32956b = (LinearLayout) findViewById(Sc.b.p2p_date_v);
        this.f32957c = (LinearLayout) findViewById(Sc.b.p2p_time_quantum_v);
    }
}
