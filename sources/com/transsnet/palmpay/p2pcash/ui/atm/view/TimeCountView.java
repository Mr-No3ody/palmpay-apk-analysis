package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.b;
import Sc.c;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.google.android.material.timepicker.TimeModel;

/* JADX INFO: loaded from: classes4.dex */
public class TimeCountView extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f33051o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f33053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f33054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressLineView f33055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f33056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f33057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f33058g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f33059i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final He.a f33060j;

    public TimeCountView(@NonNull Context context) {
        this(context, null);
    }

    public static void a(TimeCountView timeCountView, int i7, int i10, int i11) {
        timeCountView.f33052a.setText(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i7)));
        timeCountView.f33053b.setText(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i10)));
        timeCountView.f33054c.setText(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProgress(int i7) {
        this.f33055d.setProgress(i7);
    }

    public TimeCountView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeCountView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f33060j = new He.a(this);
        View.inflate(context, c.p2p_time_count_vie_layout, this);
        this.f33052a = (TextView) findViewById(b.p2p_hour);
        this.f33053b = (TextView) findViewById(b.p2p_minute);
        this.f33054c = (TextView) findViewById(b.p2p_second);
        this.f33055d = (ProgressLineView) findViewById(b.p2p_progress);
        CardView cardView = (CardView) findViewById(b.p2p_shadow);
        if (Build.VERSION.SDK_INT >= 28) {
            cardView.setVisibility(0);
            cardView.setOutlineSpotShadowColor(Color.parseColor("#265D2D89"));
            cardView.setOutlineAmbientShadowColor(Color.parseColor("#265D2D89"));
            return;
        }
        cardView.setVisibility(8);
    }
}
