package com.transsnet.palmpay.p2pcash.ui.atm.view;

import Sc.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class P2PDashLine extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33001a;

    public P2PDashLine(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(getHeight());
        paint.setColor(this.f33001a);
        paint.setPathEffect(new DashPathEffect(new float[]{SizeUtils.dp2px(4.0f), SizeUtils.dp2px(5.0f)}, 0.0f));
        canvas.drawLine(0.0f, getHeight() / 2.0f, getWidth(), getHeight() / 2.0f, paint);
    }

    public P2PDashLine(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public P2PDashLine(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.P2PDashLine);
        this.f33001a = typedArrayObtainStyledAttributes.getColor(f.P2PDashLine_p2p_dash_color, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
