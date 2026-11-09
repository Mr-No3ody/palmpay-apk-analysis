package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class PatternLockResultView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f31041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Re.n[] f31043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f31044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f31045g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Paint f31046i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f31047j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f31048o;

    public PatternLockResultView(Context context) {
        super(context);
        this.f31043e = new Re.n[9];
        this.f31048o = getContext().getColor(L6.b.ppColorTextDisable);
        a();
    }

    public final void a() {
        getViewTreeObserver().addOnGlobalLayoutListener(new Be.c(this, 10));
        int color = getContext().getColor(L6.b.ppColorTextPrimary);
        Paint paint = new Paint();
        this.f31045g = paint;
        paint.setAntiAlias(true);
        this.f31045g.setColor(color);
        Paint paint2 = this.f31045g;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f31046i = paint3;
        paint3.setAntiAlias(true);
        this.f31046i.setColor(color);
        this.f31046i.setStyle(style);
        b();
    }

    public final void b() {
        this.f31047j = new int[9];
        for (int i7 = 0; i7 < 9; i7++) {
            this.f31047j[i7] = -1;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Re.n[] nVarArr;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            nVarArr = this.f31043e;
            if (i10 >= 9) {
                break;
            }
            int i11 = this.f31047j[0];
            int i12 = this.f31048o;
            if (i11 == -1) {
                this.f31045g.setColor(i12);
            } else {
                this.f31045g.setColor(i12);
            }
            Re.n nVar = nVarArr[i10];
            canvas.drawCircle(nVar.f8589a, nVar.f8590b, this.f31044f, this.f31045g);
            i10++;
        }
        while (true) {
            int[] iArr = this.f31047j;
            if (i7 >= iArr.length) {
                super.onDraw(canvas);
                return;
            }
            int i13 = iArr[i7];
            if (i13 != -1) {
                this.f31046i.setStyle(Paint.Style.FILL);
                Re.n nVar2 = nVarArr[i13];
                canvas.drawPoint(nVar2.f8589a, nVar2.f8590b, this.f31046i);
                this.f31046i.setStrokeWidth(3.0f);
                Re.n nVar3 = nVarArr[i13];
                canvas.drawCircle(nVar3.f8589a, nVar3.f8590b, this.f31044f, this.f31046i);
            }
            i7++;
        }
    }

    public void setNumbers(int[] iArr) {
        b();
        invalidate();
        int length = iArr.length;
        int[] iArr2 = this.f31047j;
        int length2 = length < iArr2.length ? iArr.length : iArr2.length;
        for (int i7 = 0; i7 < length2; i7++) {
            this.f31047j[i7] = iArr[i7];
        }
        invalidate();
    }

    public PatternLockResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31043e = new Re.n[9];
        this.f31048o = getContext().getColor(L6.b.ppColorTextDisable);
        a();
    }

    public PatternLockResultView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31043e = new Re.n[9];
        this.f31048o = getContext().getColor(L6.b.ppColorTextDisable);
        a();
    }
}
