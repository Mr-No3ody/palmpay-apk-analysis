package com.transsnet.palmpay.custom_view.indexrecycleview;

import B5.c;
import Sb.a;
import Sb.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.SectionIndexer;
import androidx.annotation.ColorRes;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
public class IndexFastScrollRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31360A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f31361B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f31362C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f31363H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f31364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureDetector f31365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f31366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f31368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31370g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31372j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f31374p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f31375v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f31376w;

    public IndexFastScrollRecyclerView(Context context) {
        super(context);
        this.f31364a = null;
        this.f31365b = null;
        this.f31366c = true;
        this.f31367d = 12;
        this.f31368e = 20.0f;
        this.f31369f = 5.0f;
        this.f31370g = 5;
        this.f31371i = 5;
        this.f31372j = 0.6f;
        this.f31373o = 2;
        this.f31374p = -16777216;
        this.t = -16777216;
        this.f31375v = -1;
        this.f31376w = -16777216;
        this.f31360A = 50;
        this.f31361B = -16777216;
        this.f31362C = -1;
        this.f31363H = 0.4f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes;
        a aVar = new a();
        aVar.f8850i = -1;
        aVar.f8851j = false;
        aVar.f8852k = null;
        aVar.f8853l = null;
        aVar.f8854m = null;
        aVar.f8858q = true;
        aVar.f8860s = null;
        Boolean bool = Boolean.TRUE;
        aVar.t = bool;
        aVar.f8861u = Boolean.FALSE;
        aVar.f8862v = bool;
        aVar.f8841G = null;
        aVar.f8856o = this.f31367d;
        float f10 = this.f31368e;
        float f11 = this.f31369f;
        aVar.f8857p = this.f31370g;
        aVar.f8836B = this.f31360A;
        aVar.f8837C = this.f31361B;
        aVar.f8838D = this.f31362C;
        aVar.f8839E = (int) (this.f31363H * 255.0f);
        aVar.f8864x = this.f31374p;
        aVar.f8863w = this.f31373o;
        aVar.f8859r = this.f31371i;
        aVar.f8865y = this.t;
        aVar.f8866z = this.f31375v;
        aVar.f8835A = this.f31376w;
        aVar.f8840F = (int) (this.f31372j * 255.0f);
        float f12 = context.getResources().getDisplayMetrics().density;
        aVar.f8846e = f12;
        aVar.f8847f = context.getResources().getDisplayMetrics().scaledDensity;
        aVar.f8852k = this;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter instanceof SectionIndexer) {
            adapter.registerAdapterDataObserver(aVar);
            SectionIndexer sectionIndexer = (SectionIndexer) adapter;
            aVar.f8853l = sectionIndexer;
            aVar.f8854m = (String[]) sectionIndexer.getSections();
        }
        aVar.f8842a = f10 * f12;
        aVar.f8845d = aVar.f8857p * f12;
        float f13 = f11 * f12;
        aVar.f8843b = f13;
        aVar.f8844c = f13;
        this.f31364a = aVar;
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.IndexFastScrollRecyclerView, 0, 0)) == null) {
            return;
        }
        try {
            this.f31367d = typedArrayObtainStyledAttributes.getInt(x.IndexFastScrollRecyclerView_setIndexTextSize, this.f31367d);
            this.f31368e = typedArrayObtainStyledAttributes.getFloat(x.IndexFastScrollRecyclerView_setIndexbarWidth, this.f31368e);
            this.f31369f = typedArrayObtainStyledAttributes.getFloat(x.IndexFastScrollRecyclerView_setIndexbarMargin, this.f31369f);
            this.f31370g = typedArrayObtainStyledAttributes.getInt(x.IndexFastScrollRecyclerView_setPreviewPadding, this.f31370g);
            this.f31371i = typedArrayObtainStyledAttributes.getInt(x.IndexFastScrollRecyclerView_setIndexBarCornerRadius, this.f31371i);
            this.f31372j = typedArrayObtainStyledAttributes.getFloat(x.IndexFastScrollRecyclerView_setIndexBarTransparentValue, this.f31372j);
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarColor)) {
                this.t = Color.parseColor(typedArrayObtainStyledAttributes.getString(x.IndexFastScrollRecyclerView_setIndexBarColor));
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarTextColor)) {
                this.f31375v = Color.parseColor(typedArrayObtainStyledAttributes.getString(x.IndexFastScrollRecyclerView_setIndexBarTextColor));
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarHighlightTextColor)) {
                this.f31376w = Color.parseColor(typedArrayObtainStyledAttributes.getString(x.IndexFastScrollRecyclerView_setIndexBarHighlightTextColor));
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarColorRes)) {
                this.t = typedArrayObtainStyledAttributes.getColor(x.IndexFastScrollRecyclerView_setIndexBarColorRes, this.t);
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarTextColorRes)) {
                this.f31375v = typedArrayObtainStyledAttributes.getColor(x.IndexFastScrollRecyclerView_setIndexBarTextColorRes, this.f31375v);
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarHighlightTextColorRes)) {
                this.f31376w = typedArrayObtainStyledAttributes.getColor(x.IndexFastScrollRecyclerView_setIndexBarHighlightTextColor, this.f31376w);
            }
            this.f31360A = typedArrayObtainStyledAttributes.getInt(x.IndexFastScrollRecyclerView_setPreviewTextSize, this.f31360A);
            this.f31363H = typedArrayObtainStyledAttributes.getFloat(x.IndexFastScrollRecyclerView_setPreviewTransparentValue, this.f31363H);
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setPreviewColor)) {
                this.f31361B = Color.parseColor(typedArrayObtainStyledAttributes.getString(x.IndexFastScrollRecyclerView_setPreviewColor));
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setPreviewTextColor)) {
                this.f31362C = Color.parseColor(typedArrayObtainStyledAttributes.getString(x.IndexFastScrollRecyclerView_setPreviewTextColor));
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarStrokeWidth)) {
                this.f31373o = typedArrayObtainStyledAttributes.getInt(x.IndexFastScrollRecyclerView_setIndexBarStrokeWidth, this.f31373o);
            }
            if (typedArrayObtainStyledAttributes.hasValue(x.IndexFastScrollRecyclerView_setIndexBarStrokeColor)) {
                this.f31374p = Color.parseColor(typedArrayObtainStyledAttributes.getString(x.IndexFastScrollRecyclerView_setIndexBarStrokeColor));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        a aVar = this.f31364a;
        if (aVar == null || !aVar.t.booleanValue()) {
            return;
        }
        Paint paint = new Paint();
        paint.setColor(aVar.f8865y);
        paint.setAlpha(aVar.f8840F);
        paint.setAntiAlias(true);
        RectF rectF = aVar.f8855n;
        float f10 = aVar.f8859r;
        float f11 = aVar.f8846e;
        float f12 = f10 * f11;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        if (aVar.f8862v.booleanValue()) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(aVar.f8864x);
            paint.setStrokeWidth(aVar.f8863w);
            RectF rectF2 = aVar.f8855n;
            float f13 = aVar.f8859r * f11;
            canvas.drawRoundRect(rectF2, f13, f13, paint);
        }
        String[] strArr = aVar.f8854m;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        boolean z3 = aVar.f8858q;
        float f14 = aVar.f8847f;
        if (z3 && (i7 = aVar.f8850i) >= 0 && strArr[i7] != "") {
            Paint paint2 = new Paint();
            paint2.setColor(aVar.f8837C);
            paint2.setAlpha(aVar.f8839E);
            paint2.setAntiAlias(true);
            paint2.setShadowLayer(3.0f, 0.0f, 0.0f, Color.argb(64, 0, 0, 0));
            Paint paint3 = new Paint();
            paint3.setColor(aVar.f8838D);
            paint3.setAntiAlias(true);
            paint3.setTextSize(aVar.f8836B * f14);
            paint3.setTypeface(aVar.f8860s);
            float fMeasureText = paint3.measureText(aVar.f8854m[aVar.f8850i]);
            float f15 = aVar.f8845d * 2.0f;
            float fMax = Math.max((paint3.descent() + f15) - paint3.ascent(), f15 + fMeasureText);
            float f16 = (aVar.f8848g - fMax) / 2.0f;
            float f17 = (aVar.f8849h - fMax) / 2.0f;
            RectF rectF3 = new RectF(f16, f17, f16 + fMax, f17 + fMax);
            float f18 = fMax / 2.0f;
            canvas.drawRoundRect(rectF3, f18, f18, paint2);
            canvas.drawText(aVar.f8854m[aVar.f8850i], (((fMax - fMeasureText) / 2.0f) + rectF3.left) - 1.0f, (((fMax - (paint3.descent() - paint3.ascent())) / 2.0f) + rectF3.top) - paint3.ascent(), paint3);
            IndexFastScrollRecyclerView indexFastScrollRecyclerView = aVar.f8852k;
            if (indexFastScrollRecyclerView != null) {
                c cVar = aVar.f8841G;
                if (cVar != null) {
                    indexFastScrollRecyclerView.removeCallbacks(cVar);
                }
                c cVar2 = new c(aVar, 21);
                aVar.f8841G = cVar2;
                indexFastScrollRecyclerView.postDelayed(cVar2, 300L);
            }
        }
        Paint paint4 = new Paint();
        paint4.setColor(aVar.f8866z);
        paint4.setAntiAlias(true);
        paint4.setTextSize(aVar.f8856o * f14);
        paint4.setTypeface(aVar.f8860s);
        float fHeight = (aVar.f8855n.height() - (aVar.f8843b * 2.0f)) / aVar.f8854m.length;
        float fDescent = (fHeight - (paint4.descent() - paint4.ascent())) / 2.0f;
        for (int i10 = 0; i10 < aVar.f8854m.length; i10++) {
            if (aVar.f8861u.booleanValue()) {
                int i11 = aVar.f8850i;
                if (i11 <= -1 || i10 != i11) {
                    paint4.setTypeface(aVar.f8860s);
                    paint4.setTextSize(aVar.f8856o * f14);
                    paint4.setColor(aVar.f8866z);
                } else {
                    paint4.setTypeface(Typeface.create(aVar.f8860s, 1));
                    paint4.setTextSize((aVar.f8856o + 3) * f14);
                    paint4.setColor(aVar.f8835A);
                }
                float fMeasureText2 = (aVar.f8842a - paint4.measureText(aVar.f8854m[i10])) / 2.0f;
                String str = aVar.f8854m[i10];
                RectF rectF4 = aVar.f8855n;
                canvas.drawText(str, rectF4.left + fMeasureText2, (((i10 * fHeight) + (rectF4.top + aVar.f8843b)) + fDescent) - paint4.ascent(), paint4);
            } else {
                float fMeasureText3 = (aVar.f8842a - paint4.measureText(aVar.f8854m[i10])) / 2.0f;
                String str2 = aVar.f8854m[i10];
                RectF rectF5 = aVar.f8855n;
                canvas.drawText(str2, rectF5.left + fMeasureText3, (((i10 * fHeight) + (rectF5.top + aVar.f8843b)) + fDescent) - paint4.ascent(), paint4);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f31366c && (aVar = this.f31364a) != null && aVar.a(motionEvent.getX(), motionEvent.getY())) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        a aVar = this.f31364a;
        if (aVar != null) {
            aVar.f8848g = i7;
            aVar.f8849h = i10;
            float f10 = i7 - aVar.f8844c;
            float f11 = f10 - aVar.f8842a;
            float f12 = aVar.f8843b;
            aVar.f8855n = new RectF(f11, f12, f10, i10 - f12);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31366c) {
            a aVar = this.f31364a;
            if (aVar != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2 && aVar.f8851j) {
                            if (aVar.a(motionEvent.getX(), motionEvent.getY())) {
                                aVar.f8850i = aVar.b(motionEvent.getY());
                                aVar.c();
                            }
                            return true;
                        }
                    } else if (aVar.f8851j) {
                        aVar.f8851j = false;
                        aVar.f8850i = -1;
                    }
                } else if (aVar.a(motionEvent.getX(), motionEvent.getY())) {
                    aVar.f8851j = true;
                    aVar.f8850i = aVar.b(motionEvent.getY());
                    aVar.c();
                    return true;
                }
            }
            if (this.f31365b == null) {
                this.f31365b = new GestureDetector(getContext(), new b());
            }
            this.f31365b.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        a aVar = this.f31364a;
        if (aVar == null || !(adapter instanceof SectionIndexer)) {
            return;
        }
        adapter.registerAdapterDataObserver(aVar);
        SectionIndexer sectionIndexer = (SectionIndexer) adapter;
        aVar.f8853l = sectionIndexer;
        aVar.f8854m = (String[]) sectionIndexer.getSections();
    }

    public void setIndexBarColor(String str) {
        this.f31364a.f8865y = Color.parseColor(str);
    }

    public void setIndexBarCornerRadius(int i7) {
        this.f31364a.f8859r = i7;
    }

    public void setIndexBarHighLightTextVisibility(boolean z3) {
        this.f31364a.f8861u = Boolean.valueOf(z3);
    }

    public void setIndexBarStrokeColor(String str) {
        this.f31364a.f8864x = Color.parseColor(str);
    }

    public void setIndexBarStrokeVisibility(boolean z3) {
        this.f31364a.f8862v = Boolean.valueOf(z3);
    }

    public void setIndexBarStrokeWidth(int i7) {
        this.f31364a.f8863w = i7;
    }

    public void setIndexBarTextColor(String str) {
        this.f31364a.f8866z = Color.parseColor(str);
    }

    public void setIndexBarTransparentValue(float f10) {
        this.f31364a.f8840F = (int) (f10 * 255.0f);
    }

    public void setIndexBarVisibility(boolean z3) {
        this.f31364a.t = Boolean.valueOf(z3);
        this.f31366c = z3;
    }

    public void setIndexTextSize(int i7) {
        this.f31364a.f8856o = i7;
    }

    public void setIndexbarHighLightTextColor(String str) {
        this.f31364a.f8835A = Color.parseColor(str);
    }

    public void setIndexbarMargin(float f10) {
        a aVar = this.f31364a;
        aVar.f8843b = f10;
        aVar.f8844c = f10;
    }

    public void setIndexbarWidth(float f10) {
        this.f31364a.f8842a = f10;
    }

    public void setPreviewColor(@ColorRes int i7) {
        this.f31364a.f8837C = getContext().getResources().getColor(i7);
    }

    public void setPreviewPadding(int i7) {
        this.f31364a.f8857p = i7;
    }

    public void setPreviewTextColor(@ColorRes int i7) {
        this.f31364a.f8838D = getContext().getResources().getColor(i7);
    }

    public void setPreviewTextSize(int i7) {
        this.f31364a.f8836B = i7;
    }

    public void setPreviewTransparentValue(float f10) {
        this.f31364a.f8839E = (int) (f10 * 255.0f);
    }

    public void setPreviewVisibility(boolean z3) {
        this.f31364a.f8858q = z3;
    }

    public void setTypeface(Typeface typeface) {
        this.f31364a.f8860s = typeface;
    }

    public void setIndexBarColor(@ColorRes int i7) {
        this.f31364a.f8865y = getContext().getResources().getColor(i7);
    }

    public void setIndexBarTextColor(@ColorRes int i7) {
        this.f31364a.f8866z = getContext().getResources().getColor(i7);
    }

    public void setIndexbarHighLightTextColor(@ColorRes int i7) {
        this.f31364a.f8835A = getContext().getResources().getColor(i7);
    }

    public void setPreviewColor(String str) {
        this.f31364a.f8837C = Color.parseColor(str);
    }

    public void setPreviewTextColor(String str) {
        this.f31364a.f8838D = Color.parseColor(str);
    }

    public IndexFastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31364a = null;
        this.f31365b = null;
        this.f31366c = true;
        this.f31367d = 12;
        this.f31368e = 20.0f;
        this.f31369f = 5.0f;
        this.f31370g = 5;
        this.f31371i = 5;
        this.f31372j = 0.6f;
        this.f31373o = 2;
        this.f31374p = -16777216;
        this.t = -16777216;
        this.f31375v = -1;
        this.f31376w = -16777216;
        this.f31360A = 50;
        this.f31361B = -16777216;
        this.f31362C = -1;
        this.f31363H = 0.4f;
        a(context, attributeSet);
    }

    public IndexFastScrollRecyclerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31364a = null;
        this.f31365b = null;
        this.f31366c = true;
        this.f31367d = 12;
        this.f31368e = 20.0f;
        this.f31369f = 5.0f;
        this.f31370g = 5;
        this.f31371i = 5;
        this.f31372j = 0.6f;
        this.f31373o = 2;
        this.f31374p = -16777216;
        this.t = -16777216;
        this.f31375v = -1;
        this.f31376w = -16777216;
        this.f31360A = 50;
        this.f31361B = -16777216;
        this.f31362C = -1;
        this.f31363H = 0.4f;
        a(context, attributeSet);
    }
}
