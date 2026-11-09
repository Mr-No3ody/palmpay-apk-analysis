package com.transsnet.palmpay.credit.view;

import Gb.C0284g;
import Gb.C0285h;
import Ya.e;
import Ya.f;
import Ya.g;
import Ya.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;

/* JADX INFO: loaded from: classes4.dex */
public class FeeCalculateView extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f30739p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f30741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SwitchCompat f30742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f30743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f30744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f30745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f30746g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f30747i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f30748j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f30749o;

    public FeeCalculateView(@NonNull Context context) {
        this(context, null);
    }

    public FeeCalculateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeeCalculateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f30740a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.FeeCalculateView);
        this.f30748j = typedArrayObtainStyledAttributes.getInt(h.FeeCalculateView_cs_fee_calculate_view_mode, 0);
        this.f30749o = typedArrayObtainStyledAttributes.getString(h.FeeCalculateView_cs_fee_calculate_name);
        typedArrayObtainStyledAttributes.getBoolean(h.FeeCalculateView_cs_fee_calculate_select, false);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, f.cs_fee_calculate_view_layout, this);
        this.f30741b = (TextView) findViewById(e.cs_name);
        this.f30742c = (SwitchCompat) findViewById(e.cs_switch);
        this.f30743d = (TextView) findViewById(e.cs_normal_txt);
        this.f30744e = (ImageView) findViewById(e.cs_exchange);
        this.f30745f = (TextView) findViewById(e.cs_point_txt);
        this.f30746g = (ImageView) findViewById(e.cs_arrow);
        this.f30747i = (TextView) findViewById(e.cs_select_txt);
        this.f30741b.setText(this.f30749o);
        int i10 = this.f30748j;
        if (i10 == 0) {
            new C0284g(this);
            this.f30743d.setVisibility(0);
            this.f30743d.setTextColor(Color.parseColor("#202046"));
            return;
        }
        if (i10 == 1) {
            new C0284g(this);
            this.f30743d.setVisibility(0);
            this.f30743d.setTextColor(Color.parseColor("#FFAA0C"));
            this.f30742c.setVisibility(0);
            this.f30743d.setText("");
            this.f30742c.setChecked(false);
            return;
        }
        if (i10 == 2) {
            new C0284g(this);
            this.f30747i.setVisibility(0);
            this.f30746g.setVisibility(0);
            this.f30747i.setText(this.f30740a.getString(g.cs_str_select));
            this.f30747i.setTextColor(Color.parseColor("#646970"));
            return;
        }
        if (i10 == 3) {
            new C0285h(this);
            return;
        }
        if (i10 != 4) {
            return;
        }
        new C0284g(this);
        this.f30743d.setVisibility(0);
        this.f30743d.setTextColor(Color.parseColor("#FFAA0C"));
        this.f30742c.setVisibility(0);
        this.f30743d.setText("");
        this.f30742c.setChecked(false);
    }
}
