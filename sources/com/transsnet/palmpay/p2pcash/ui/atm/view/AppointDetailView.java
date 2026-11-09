package com.transsnet.palmpay.p2pcash.ui.atm.view;

import C9.ViewOnClickListenerC0150q;
import Sc.b;
import Sc.c;
import Sc.d;
import Sc.e;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.g;
import androidx.camera.video.u;
import java.util.Calendar;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public class AppointDetailView extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f32944o = Color.parseColor("#202046");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f32945p = Color.parseColor("#C0C3C8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f32946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f32947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f32948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f32951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32952g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f32953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f32954j;

    public AppointDetailView(@NonNull Context context) {
        this(context, null);
    }

    private void setBookingCode(CharSequence charSequence) {
        this.f32952g.setText(charSequence);
    }

    private void setInfo(String str) {
        this.f32954j.setText(str);
    }

    public final void a() {
        this.f32948c.setImageResource(d.p2p_z);
        TextView textView = this.f32949d;
        int i7 = f32944o;
        textView.setTextColor(i7);
        this.f32952g.setTextColor(i7);
        this.f32953i.setVisibility(0);
    }

    public final void b(int i7, long j6, long j10, long j11, boolean z3, String str) {
        String strG;
        String strG2;
        String strM = g.m(j6, j10);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        int i10 = calendar.get(11);
        calendar.setTimeInMillis(j11);
        int i11 = calendar.get(11);
        if (i10 <= 12) {
            strG = u.g(i10, "am");
        } else {
            strG = (i10 - 12) + "pm";
        }
        if (i11 <= 12) {
            strG2 = u.g(i11, "am");
        } else {
            strG2 = (i11 - 12) + "pm";
        }
        this.f32949d.setText(u.n(strM, " ", strG, "-", strG2));
        this.f32953i.setOnClickListener(new ViewOnClickListenerC0150q(str, 4));
        if (TextUtils.isEmpty(str)) {
            this.f32950e.setVisibility(8);
            this.f32951f.setVisibility(8);
            this.f32954j.setVisibility(8);
        } else {
            this.f32950e.setVisibility(0);
            this.f32951f.setVisibility(0);
            this.f32954j.setVisibility(0);
        }
        if (i7 == 1) {
            this.f32947b.setVisibility(8);
            a();
            return;
        }
        Context context = this.f32946a;
        if (i7 == 2) {
            if (z3) {
                this.f32947b.setVisibility(0);
            } else {
                this.f32947b.setVisibility(8);
            }
            a();
            setBookingCode(str);
            setInfo(context.getString(e.p2p_str_please_provide_this_code_at_______));
            return;
        }
        if (i7 == 3) {
            this.f32947b.setVisibility(8);
            a();
            setBookingCode(str);
            setInfo(context.getString(e.p2p_str_checked));
            return;
        }
        int i12 = f32945p;
        if (i7 == 4) {
            this.f32947b.setVisibility(8);
            this.f32948c.setImageResource(d.p2p_z_grey);
            this.f32949d.setTextColor(i12);
            this.f32952g.setTextColor(i12);
            this.f32953i.setVisibility(8);
            if (str != null) {
                SpannableString spannableString = new SpannableString(str);
                spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
                setBookingCode(spannableString);
            }
            setInfo(context.getString(e.p2p_str_checked));
            return;
        }
        if (i7 != 5) {
            return;
        }
        this.f32947b.setVisibility(8);
        this.f32948c.setImageResource(d.p2p_z_grey);
        this.f32949d.setTextColor(i12);
        this.f32952g.setTextColor(i12);
        this.f32953i.setVisibility(8);
        if (str != null) {
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
            setBookingCode(spannableString2);
        }
        setInfo(context.getString(k.core_cancelled));
    }

    public AppointDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppointDetailView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32946a = context;
        View.inflate(context, c.p2p_appoint_detail_view_layout, this);
        this.f32947b = findViewById(b.p2p_missed_symbol);
        this.f32948c = (ImageView) findViewById(b.p2p_z);
        this.f32949d = (TextView) findViewById(b.p2p_time);
        this.f32950e = (TextView) findViewById(b.p2p_booking_code_label);
        this.f32951f = findViewById(b.p2p_booking_code_module);
        this.f32952g = (TextView) findViewById(b.p2p_code);
        this.f32953i = (ImageView) findViewById(b.p2p_copy);
        this.f32954j = (TextView) findViewById(b.p2p_info);
    }
}
