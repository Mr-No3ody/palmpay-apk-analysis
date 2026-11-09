package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.b;
import Sc.c;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class StatusItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f33049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f33050b;

    public StatusItemView(@NonNull Context context) {
        this(context, null);
    }

    public float getLocationY() {
        Paint.FontMetrics fontMetrics = this.f33049a.getPaint().getFontMetrics();
        float y8 = getY();
        float f10 = fontMetrics.ascent;
        return ((fontMetrics.descent - f10) / 2.0f) + (f10 - fontMetrics.top) + y8;
    }

    public StatusItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatusItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        View.inflate(context, c.p2p_statua_item_view_layout, this);
        this.f33049a = (TextView) findViewById(b.p2p_main);
        this.f33050b = (TextView) findViewById(b.p2p_sub);
    }
}
