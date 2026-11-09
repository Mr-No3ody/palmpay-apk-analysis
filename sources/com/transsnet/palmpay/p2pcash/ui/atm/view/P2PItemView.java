package com.transsnet.palmpay.p2pcash.ui.atm.view;

import L6.b;
import Sc.c;
import Wc.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.transsnet.palmpay.custom_view.r;

/* JADX INFO: loaded from: classes4.dex */
public class P2PItemView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f33016f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f33018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f33020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CardView f33021e;

    public P2PItemView(@NonNull Context context) {
        this(context, null);
    }

    public void setAction(Runnable runnable) {
        this.f33020d.setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_ArrowCenterRight, null, getContext().getColor(b.ppColorTextPrimary), 24.0f));
        this.f33020d.setVisibility(0);
        setOnClickListener(new g(runnable, 3));
    }

    public void setCopy(Runnable runnable) {
        this.f33020d.setImageResource(r.cv_copy_1);
        this.f33020d.setVisibility(0);
        this.f33020d.setOnClickListener(new g(runnable, 2));
    }

    public void setName(String str) {
        this.f33017a.setText(str);
    }

    public void setTips(Runnable runnable) {
        this.f33019c.setVisibility(0);
        this.f33019c.setOnClickListener(new g(runnable, 4));
    }

    public void setValue(String str) {
        this.f33018b.setText(str);
    }

    public P2PItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        View.inflate(context, c.p2p_item_layout, this);
        this.f33017a = (TextView) findViewById(Sc.b.p2p_name);
        this.f33018b = (TextView) findViewById(Sc.b.p2p_value);
        this.f33019c = (ImageView) findViewById(Sc.b.p2p_tips_img);
        this.f33020d = (ImageView) findViewById(Sc.b.p2p_right_img);
        this.f33021e = (CardView) findViewById(Sc.b.p2p_refund_label);
    }
}
