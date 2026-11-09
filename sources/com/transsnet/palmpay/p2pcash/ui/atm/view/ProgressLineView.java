package com.transsnet.palmpay.p2pcash.ui.atm.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class ProgressLineView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33043a;

    public ProgressLineView(Context context) {
        super(context);
        this.f33043a = 20;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStrokeWidth(getHeight());
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#BD9ADA"));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAlpha(125);
        canvas.drawLine(getHeight() / 2.0f, getHeight() / 2.0f, getWidth() - (getHeight() / 2.0f), getHeight() / 2.0f, paint);
        float fMax = Math.max(((getWidth() * this.f33043a) / 100.0f) - (getHeight() / 2.0f), getHeight() / 2.0f);
        paint.setAlpha(255);
        paint.setShader(new LinearGradient(getHeight() / 2.0f, getHeight() / 2.0f, fMax, getHeight() / 2.0f, Color.parseColor("#7826FF"), Color.parseColor("#9B26FF"), Shader.TileMode.CLAMP));
        canvas.drawLine(getHeight() / 2.0f, getHeight() / 2.0f, fMax, getHeight() / 2.0f, paint);
    }

    public void setProgress(int i7) {
        this.f33043a = i7;
        invalidate();
    }

    public ProgressLineView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33043a = 20;
    }

    public ProgressLineView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f33043a = 20;
    }
}
