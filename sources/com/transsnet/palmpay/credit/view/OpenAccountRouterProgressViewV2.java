package com.transsnet.palmpay.credit.view;

import C0.G;
import F6.d;
import Ya.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.credit.bean.req.OcRouterDetail;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class OpenAccountRouterProgressViewV2 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f30844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f30845g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f30846i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bitmap f30847j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f30848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f30849p;

    public OpenAccountRouterProgressViewV2(Context context) {
        this(context, null);
    }

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final int b(int i7) {
        return getContext().getColor(i7);
    }

    public final void c(int i7, List list) {
        d.h("OpenAccountRouterProgressViewV2", 3, G.m(i7, "setRouteInfo >>> currentIndex="));
        if (list != null && !list.isEmpty() && TextUtils.equals(((OcRouterDetail) list.get(0)).getRoutePath(), "oc_permission_router")) {
            list = list.subList(1, list.size());
        }
        this.f30848o = list;
        this.f30849p = i7;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        List list = this.f30848o;
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (this.f30849p < 0) {
            this.f30849p = 0;
        }
        if (this.f30849p > this.f30848o.size() - 1) {
            this.f30849p = this.f30848o.size() - 1;
        }
        while (i7 < this.f30848o.size()) {
            if (i7 <= this.f30849p) {
                this.f30844f.setColor(b(b.cs_cl_route_circleDone));
            } else {
                this.f30844f.setColor(b(b.cs_cl_route_circleNormal));
            }
            this.f30844f.setStyle(Paint.Style.STROKE);
            int i10 = this.f30842d;
            int i11 = this.f30843e;
            float f10 = (this.f30841c * i7) + (i11 * 2 * i7) + i10 + i11;
            float f11 = this.f30840b / 2.0f;
            canvas.drawCircle(f10, f11, (a(getContext(), 2.0f) / 2.0f) + i11, this.f30844f);
            if (i7 <= this.f30849p) {
                this.f30844f.setColor(b(b.cs_cl_route_circleBgDone));
            } else {
                this.f30844f.setColor(b(b.cs_cl_route_circleBgNormal));
            }
            this.f30844f.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f10, f11, this.f30843e, this.f30844f);
            float fA = a(getContext(), 1.0f);
            int i12 = this.f30842d;
            int i13 = i7 + 1;
            int i14 = this.f30843e;
            int i15 = this.f30841c;
            float f12 = (i7 * i15) + (i14 * 2 * i13) + i12 + fA;
            int i16 = this.f30840b;
            float f13 = i16 / 2.0f;
            float f14 = ((i15 * i13) + (((i14 * 2) * i13) + i12)) - fA;
            float f15 = i16 / 2.0f;
            if (i7 < this.f30849p) {
                canvas2 = canvas;
                canvas2.drawLine(f12, f13, f14, f15, this.f30845g);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(f12, f13, f14, f15, this.f30846i);
            }
            if (i7 == this.f30848o.size() - 1) {
                float fA2 = a(getContext(), 22.0f);
                canvas2.drawBitmap(this.f30847j, (this.f30842d + this.f30839a) - fA2, (this.f30840b - fA2) / 2.0f, (Paint) null);
            }
            i7 = i13;
            canvas = canvas2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int size = View.MeasureSpec.getSize(i7);
        View.MeasureSpec.getSize(i10);
        this.f30839a = size - (this.f30842d * 2);
        this.f30840b = a(getContext(), 25.0f);
        this.f30841c = (this.f30839a - (((this.f30848o.size() + 1) * this.f30843e) * 2)) / (this.f30848o.isEmpty() ? 1 : this.f30848o.size());
        d.h("OpenAccountRouterProgressViewV2", 3, "totalWidth=" + this.f30839a);
        d.h("OpenAccountRouterProgressViewV2", 3, "lineWidth=" + this.f30841c);
        setMeasuredDimension(size, this.f30840b);
    }

    public OpenAccountRouterProgressViewV2(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OpenAccountRouterProgressViewV2(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f30839a = 0;
        this.f30840b = 0;
        this.f30841c = 0;
        this.f30842d = 0;
        this.f30843e = 0;
        this.f30847j = null;
        this.f30848o = new ArrayList();
        this.f30849p = 0;
        d.h("OpenAccountRouterProgressViewV2", 3, "init >>>>>>");
        this.f30842d = a(getContext(), 2.0f);
        this.f30843e = a(getContext(), 8.8f) / 2;
        this.f30847j = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), Ya.d.cs_oc_router_gift_icon_new), a(getContext(), 22.0f), a(getContext(), 22.0f), true);
        Paint paint = new Paint();
        this.f30846i = paint;
        paint.setAntiAlias(true);
        this.f30846i.setColor(b(b.cs_cl_route_lineNormal));
        this.f30846i.setStrokeWidth(a(getContext(), 1.0f));
        Paint paint2 = this.f30846i;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        float fA = a(getContext(), 4.0f);
        this.f30846i.setPathEffect(new DashPathEffect(new float[]{fA, fA}, 0.0f));
        Paint paint3 = new Paint();
        this.f30845g = paint3;
        paint3.setAntiAlias(true);
        this.f30845g.setColor(b(b.cs_cl_route_lineDone));
        this.f30845g.setStrokeWidth(a(getContext(), 1.0f));
        this.f30845g.setStyle(style);
        Paint paint4 = new Paint();
        this.f30844f = paint4;
        paint4.setAntiAlias(true);
        this.f30844f.setColor(b(b.cs_cl_route_circleDone));
        this.f30844f.setStrokeWidth(a(getContext(), 1.2f));
        this.f30844f.setStyle(style);
    }
}
