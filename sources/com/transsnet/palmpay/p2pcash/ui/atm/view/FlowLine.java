package com.transsnet.palmpay.p2pcash.ui.atm.view;

import L6.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class FlowLine extends View {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f32981e = Color.parseColor("#202046");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f32982f = Color.parseColor("#4D202046");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f32983g = SizeUtils.dp2px(3.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f32984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f32985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f32986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f32987d;

    public FlowLine(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(SizeUtils.dp2px(1.0f));
        paint.setColor(getContext().getColor(b.ppColorDividerLine));
        paint.setPathEffect(new DashPathEffect(new float[]{SizeUtils.dp2px(4.0f), SizeUtils.dp2px(6.0f)}, 0.0f));
        if (this.f32987d == 0.0f) {
            this.f32986c = 0.0f;
            this.f32987d = height;
        }
        float f11 = width / 2.0f;
        canvas.drawLine(f11, this.f32986c, f11, this.f32987d, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(f32981e);
        paint2.setStyle(Paint.Style.FILL);
        int i7 = 0;
        while (true) {
            int size = this.f32984a.size();
            f10 = f32983g;
            if (i7 >= size) {
                break;
            }
            canvas.drawCircle(f11, ((Float) this.f32984a.get(i7)).floatValue(), f10, paint2);
            i7++;
        }
        Paint paint3 = new Paint(1);
        paint3.setColor(f32982f);
        paint3.setStyle(Paint.Style.FILL);
        for (int i10 = 0; i10 < this.f32985b.size(); i10++) {
            canvas.drawCircle(f11, ((Float) this.f32985b.get(i10)).floatValue(), f10, paint3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }

    public FlowLine(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLine(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f32984a = new ArrayList();
        this.f32985b = new ArrayList();
        this.f32986c = 0.0f;
        this.f32987d = 0.0f;
    }
}
