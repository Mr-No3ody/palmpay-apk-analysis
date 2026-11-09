package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class PatternLockView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f31049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f31050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1552j[] f31051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f31053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Paint f31054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Paint f31055g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1552j f31057j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public UnlockListener f31058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f31059p;

    public interface UnlockListener {
        void drawOver(int[] iArr);
    }

    public PatternLockView(Context context) {
        super(context);
        this.f31051c = new C1552j[9];
        this.f31053e = new int[9];
        this.f31057j = new C1552j();
        b();
    }

    public static int a(int i7, int i10) {
        int[] iArr = {0, 2};
        int[] iArr2 = {0, 8};
        int[] iArr3 = {0, 6};
        int[] iArr4 = {1, 7};
        int[] iArr5 = {2, 6};
        int[] iArr6 = {2, 8};
        int[] iArr7 = {3, 5};
        int[] iArr8 = {6, 8};
        int i11 = iArr[0];
        if ((i11 == i7 && iArr[1] == i10) || (iArr[1] == i7 && i11 == i10)) {
            return 1;
        }
        int i12 = iArr2[0];
        if (i12 == i7 && iArr2[1] == i10) {
            return 4;
        }
        if (iArr2[1] == i7 && i12 == i10) {
            return 4;
        }
        int i13 = iArr3[0];
        if ((i13 == i7 && iArr3[1] == i10) || (iArr3[1] == i7 && i13 == i10)) {
            return 3;
        }
        int i14 = iArr4[0];
        if (i14 == i7 && iArr4[1] == i10) {
            return 4;
        }
        if (iArr4[1] == i7 && i14 == i10) {
            return 4;
        }
        int i15 = iArr5[0];
        if (i15 == i7 && iArr5[1] == i10) {
            return 4;
        }
        if (iArr5[1] == i7 && i15 == i10) {
            return 4;
        }
        int i16 = iArr6[0];
        if ((i16 == i7 && iArr6[1] == i10) || (iArr6[1] == i7 && i16 == i10)) {
            return 5;
        }
        int i17 = iArr7[0];
        if (i17 == i7 && iArr7[1] == i10) {
            return 4;
        }
        if (iArr7[1] == i7 && i17 == i10) {
            return 4;
        }
        int i18 = iArr8[0];
        return ((i18 == i7 && iArr8[1] == i10) || (iArr8[1] == i7 && i18 == i10)) ? 7 : -1;
    }

    private int getLastPwNumber() {
        int i7 = 0;
        while (true) {
            int[] iArr = this.f31053e;
            if (i7 >= iArr.length) {
                return -1;
            }
            if (iArr[i7] == -1 && i7 > 0) {
                return iArr[i7 - 1];
            }
            i7++;
        }
    }

    public final void b() {
        Paint paint = new Paint();
        this.f31054f = paint;
        paint.setAntiAlias(true);
        this.f31054f.setColor(getContext().getColor(L6.b.ppColorPrimary));
        Paint paint2 = this.f31054f;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f31055g = paint3;
        paint3.setAntiAlias(true);
        this.f31055g.setColor(getContext().getColor(L6.b.ppColorPrimary));
        this.f31055g.setStyle(style);
        for (int i7 = 0; i7 < 9; i7++) {
            this.f31053e[i7] = -1;
        }
    }

    public final void c() {
        for (int i7 = 0; i7 < 9; i7++) {
            C1552j c1552j = new C1552j();
            this.f31051c[i7] = c1552j;
            c1552j.f31388c = false;
            int i10 = i7 % 3;
            if (i10 == 0) {
                c1552j.f31386a = this.f31049a * 0.5f;
            } else if (i10 == 1) {
                c1552j.f31386a = this.f31049a * 1.5f;
            } else if (i10 == 2) {
                c1552j.f31386a = this.f31049a * 2.5f;
            }
            int i11 = i7 / 3;
            if (i11 == 0) {
                c1552j.f31387b = this.f31050b * 0.5f;
            } else if (i11 == 1) {
                c1552j.f31387b = this.f31050b * 1.5f;
            } else if (i11 == 2) {
                c1552j.f31387b = this.f31050b * 2.5f;
            }
        }
    }

    public int[] getDrawedPwd() {
        return this.f31053e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iDp2px = SizeUtils.dp2px(1.5f);
        int iDp2px2 = SizeUtils.dp2px(5.0f);
        int iDp2px3 = SizeUtils.dp2px(0.8f);
        int iDp2px4 = SizeUtils.dp2px(1.6f);
        for (int i7 = 0; i7 < 9; i7++) {
            this.f31055g.setStrokeWidth(iDp2px3);
            this.f31055g.setStyle(Paint.Style.FILL);
            C1552j[] c1552jArr = this.f31051c;
            C1552j c1552j = c1552jArr[i7];
            float f10 = c1552j.f31386a;
            float f11 = iDp2px2;
            float f12 = c1552j.f31387b;
            float f13 = f12 + f11;
            float f14 = iDp2px;
            canvas.drawRoundRect(f10 - f11, f12 - f11, f10 + f11, f13, f14, f14, this.f31055g);
            this.f31055g.setStyle(Paint.Style.STROKE);
            C1552j c1552j2 = c1552jArr[i7];
            canvas.drawCircle(c1552j2.f31386a, c1552j2.f31387b, this.f31052d, this.f31055g);
            this.f31055g.setStrokeWidth(iDp2px4);
            int i10 = this.f31056i;
            int[] iArr = this.f31053e;
            int i11 = i10 > 0 ? iArr[i10 - 1] : -1;
            if (i11 != -1) {
                C1552j c1552j3 = c1552jArr[i11];
                float f15 = c1552j3.f31386a;
                float f16 = c1552j3.f31387b;
                C1552j c1552j4 = this.f31057j;
                canvas.drawLine(f15, f16, c1552j4.f31386a, c1552j4.f31387b, this.f31055g);
            }
            if (this.f31056i > 1) {
                int i12 = 0;
                while (i12 < this.f31056i - 1) {
                    C1552j c1552j5 = c1552jArr[iArr[i12]];
                    float f17 = c1552j5.f31386a;
                    float f18 = c1552j5.f31387b;
                    i12++;
                    C1552j c1552j6 = c1552jArr[iArr[i12]];
                    canvas.drawLine(f17, f18, c1552j6.f31386a, c1552j6.f31387b, this.f31055g);
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(300, size) : 300;
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 != 1073741824) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(size, size2) : size;
        }
        setMeasuredDimension(size, size2);
        float f10 = size / 3.0f;
        this.f31049a = f10;
        float f11 = size2 / 3.0f;
        this.f31050b = f11;
        this.f31052d = f11 > f10 ? f10 / 4.0f : f11 / 4.0f;
        c();
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7 = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f31056i = 0;
            return true;
        }
        int[] iArr = this.f31053e;
        if (action == 1) {
            UnlockListener unlockListener = this.f31058o;
            if (unlockListener != null) {
                unlockListener.drawOver(iArr);
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 : iArr) {
                stringBuffer.append(i10 + ",");
            }
            F6.d.h("UnlockView", 4, "drawingPwd:" + stringBuffer.toString());
            c();
            for (int i11 = 0; i11 < 9; i11++) {
                this.f31053e[i11] = -1;
            }
            this.f31056i = 0;
            invalidate();
            return true;
        }
        if (action == 2) {
            this.f31059p = motionEvent.getX();
            float y8 = motionEvent.getY();
            float f10 = this.f31059p;
            C1552j[] c1552jArr = this.f31051c;
            if (this.f31056i < 9) {
                C1552j c1552j = this.f31057j;
                c1552j.f31386a = f10;
                c1552j.f31387b = y8;
                while (true) {
                    try {
                        if (i7 >= c1552jArr.length) {
                            i7 = -1;
                            break;
                        }
                        float f11 = f10;
                        if (Math.sqrt(Math.pow(Math.abs(y8 - c1552jArr[i7].f31387b), 2.0d) + Math.pow(Math.abs(f10 - c1552jArr[i7].f31386a), 2.0d)) < this.f31052d) {
                            break;
                        }
                        i7++;
                        f10 = f11;
                    } catch (Exception e10) {
                        F6.d.c("UnlockView", "dealPosition: ", e10);
                    }
                }
                if (i7 != -1) {
                    if (!c1552jArr[i7].f31388c) {
                        int iA = a(getLastPwNumber(), i7);
                        if (iA != -1) {
                            C1552j c1552j2 = c1552jArr[iA];
                            if (!c1552j2.f31388c) {
                                int i12 = this.f31056i;
                                iArr[i12] = iA;
                                this.f31056i = i12 + 1;
                                c1552j2.f31388c = true;
                            }
                        }
                        int i13 = this.f31056i;
                        iArr[i13] = i7;
                        this.f31056i = i13 + 1;
                        F6.d.h("UnlockView", 2, "nowTouched " + i7 + "  ,drawedNumber = " + this.f31056i);
                    }
                    c1552jArr[i7].f31388c = true;
                }
                invalidate();
            }
        }
        return true;
    }

    public void setUnlockListener(UnlockListener unlockListener) {
        this.f31058o = unlockListener;
    }

    public PatternLockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31051c = new C1552j[9];
        this.f31053e = new int[9];
        this.f31057j = new C1552j();
        b();
    }

    public PatternLockView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31051c = new C1552j[9];
        this.f31053e = new int[9];
        this.f31057j = new C1552j();
        b();
    }
}
