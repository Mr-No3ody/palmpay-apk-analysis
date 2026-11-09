package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.b;
import Sc.c;
import Sc.d;
import Uc.I0;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class TimeItemView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f33061i = Color.parseColor("#202046");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f33062j = Color.parseColor("#C0C3C8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f33064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f33065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Listener f33066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f33067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f33068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33069g;

    public interface Listener {
        void onSelect(long j6, long j10);
    }

    public TimeItemView(@NonNull Context context) {
        this(context, null);
    }

    public void setEnable(boolean z3) {
        this.f33069g = z3;
        if (z3) {
            this.f33063a.setTextColor(f33061i);
            this.f33065c.setImageResource(d.p2p_unselect_img);
        } else {
            this.f33063a.setTextColor(f33062j);
            this.f33065c.setImageResource(d.p2p_unselect_light_img);
        }
    }

    public void setListener(Listener listener) {
        this.f33066d = listener;
    }

    public TimeItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f33069g = true;
        View.inflate(context, c.p2p_time_item_view_layout, this);
        this.f33063a = (TextView) findViewById(b.p2p_time_quantum_tx);
        this.f33064b = findViewById(b.p2p_busy_label);
        this.f33065c = (ImageView) findViewById(b.p2p_selector);
        setOnClickListener(new I0(this, 25));
    }
}
