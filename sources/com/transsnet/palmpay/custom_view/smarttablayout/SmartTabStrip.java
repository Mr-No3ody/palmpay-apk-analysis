package com.transsnet.palmpay.custom_view.smarttablayout;

import C0.G;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.x;

/* JADX INFO: loaded from: classes4.dex */
class SmartTabStrip extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f31675A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Paint f31676B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final float f31677C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final d f31678H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f31679L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f31680M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f31681Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Paint f31686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f31687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f31688g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f31689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f31690j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f31691k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f31692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f31693p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Xb.c f31694p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SmartTabLayout.TabColorizer f31695q0;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f31696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Paint f31697w;

    public SmartTabStrip(Context context, AttributeSet attributeSet) {
        char c6;
        int[] intArray;
        int[] intArray2;
        Xb.c cVar;
        super(context);
        this.f31687f = new RectF();
        setWillNotDraw(false);
        float f10 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i7 = typedValue.data;
        float f11 = 0.0f * f10;
        int iArgb = Color.argb(38, Color.red(i7), Color.green(i7), Color.blue(i7));
        int i10 = (int) f11;
        int iArgb2 = Color.argb(38, Color.red(i7), Color.green(i7), Color.blue(i7));
        int iArgb3 = Color.argb(32, Color.red(i7), Color.green(i7), Color.blue(i7));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.stl_SmartTabLayout);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.stl_SmartTabLayout_stl_indicatorAlwaysInCenter, false);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(x.stl_SmartTabLayout_stl_indicatorWithoutPadding, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(x.stl_SmartTabLayout_stl_indicatorInFront, false);
        int i11 = typedArrayObtainStyledAttributes.getInt(x.stl_SmartTabLayout_stl_indicatorInterpolation, 0);
        int i12 = typedArrayObtainStyledAttributes.getInt(x.stl_SmartTabLayout_stl_indicatorGravity, 0);
        int color = typedArrayObtainStyledAttributes.getColor(x.stl_SmartTabLayout_stl_indicatorColor, -13388315);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(x.stl_SmartTabLayout_stl_indicatorColors, -1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.stl_SmartTabLayout_stl_indicatorThickness, (int) (8.0f * f10));
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(x.stl_SmartTabLayout_stl_indicatorWidth, -1);
        float dimension = typedArrayObtainStyledAttributes.getDimension(x.stl_SmartTabLayout_stl_indicatorCornerRadius, f11);
        int color2 = typedArrayObtainStyledAttributes.getColor(x.stl_SmartTabLayout_stl_overlineColor, iArgb);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.stl_SmartTabLayout_stl_overlineThickness, i10);
        int color3 = typedArrayObtainStyledAttributes.getColor(x.stl_SmartTabLayout_stl_underlineColor, iArgb2);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.stl_SmartTabLayout_stl_underlineThickness, (int) (2.0f * f10));
        int color4 = typedArrayObtainStyledAttributes.getColor(x.stl_SmartTabLayout_stl_dividerColor, iArgb3);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(x.stl_SmartTabLayout_stl_dividerColors, -1);
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.stl_SmartTabLayout_stl_dividerThickness, (int) (f10 * 1.0f));
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(x.stl_SmartTabLayout_stl_drawDecorationAfterTab, false);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId == -1) {
            c6 = 0;
            intArray = new int[]{color};
        } else {
            c6 = 0;
            intArray = getResources().getIntArray(resourceId);
        }
        if (resourceId2 == -1) {
            intArray2 = new int[1];
            intArray2[c6] = color4;
        } else {
            intArray2 = getResources().getIntArray(resourceId2);
        }
        d dVar = new d();
        this.f31678H = dVar;
        dVar.f31704a = intArray;
        dVar.f31705b = intArray2;
        this.f31682a = dimensionPixelSize2;
        this.f31683b = color2;
        this.f31684c = dimensionPixelSize3;
        this.f31685d = color3;
        this.f31686e = new Paint(1);
        this.f31689i = z3;
        this.f31688g = z8;
        this.f31690j = z10;
        this.f31692o = dimensionPixelSize;
        this.f31693p = layoutDimension;
        this.f31697w = new Paint(1);
        this.f31696v = dimension;
        this.t = i12;
        this.f31677C = 0.5f;
        Paint paint = new Paint(1);
        this.f31676B = paint;
        paint.setStrokeWidth(dimensionPixelSize4);
        this.f31675A = dimensionPixelSize4;
        this.f31679L = z11;
        if (i11 == 0) {
            cVar = Xb.c.f11110a;
        } else {
            if (i11 != 1) {
                Xb.b bVar = Xb.c.f11110a;
                throw new IllegalArgumentException(G.m(i11, "Unknown id: "));
            }
            cVar = Xb.c.f11111b;
        }
        this.f31694p0 = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0165  */
    /* JADX WARN: Code duplicated, block: B:44:0x016a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0177  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Code duplicated, block: B:50:0x018b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0191  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ac  */
    public final void a(Canvas canvas) {
        Canvas canvas2;
        d dVar;
        float f10;
        float f11;
        int i7;
        int i10;
        float f12;
        float f13;
        int i11;
        int i12;
        float f14;
        float f15;
        float f16;
        float f17;
        Paint paint;
        RectF rectF;
        float f18;
        int i13;
        int height = getHeight();
        int width = getWidth();
        int childCount = getChildCount();
        SmartTabLayout.TabColorizer tabColorizer = this.f31695q0;
        d dVar2 = this.f31678H;
        SmartTabLayout.TabColorizer tabColorizer2 = tabColorizer != null ? tabColorizer : dVar2;
        boolean zP = D3.a.p(this);
        int i14 = this.f31685d;
        int i15 = this.f31684c;
        int i16 = this.f31683b;
        int i17 = this.f31682a;
        Paint paint2 = this.f31686e;
        boolean z3 = this.f31690j;
        if (z3) {
            if (i17 <= 0) {
                i13 = 0;
            } else {
                paint2.setColor(i16);
                i13 = 0;
                canvas.drawRect(0, 0.0f, width, i17, paint2);
            }
            if (i15 <= 0) {
                canvas2 = canvas;
            } else {
                paint2.setColor(i14);
                canvas2 = canvas;
                canvas2.drawRect(i13, height - i15, width, height, paint2);
            }
        } else {
            i17 = i17;
            z3 = z3;
            childCount = childCount;
            canvas2 = canvas;
        }
        if (childCount > 0) {
            f10 = 0.0f;
            View childAt = getChildAt(this.f31681Q);
            f11 = 1.0f;
            boolean z8 = this.f31688g;
            int iG = D3.a.g(childAt, z8);
            int iD = D3.a.d(childAt, z8);
            if (zP) {
                i10 = iG;
            } else {
                i10 = iD;
                iD = iG;
            }
            int indicatorColor = tabColorizer2.getIndicatorColor(this.f31681Q);
            int i18 = this.f31692o;
            dVar = dVar2;
            float f19 = i18;
            if (this.f31691k0 > 0.0f) {
                f12 = f19;
                if (this.f31681Q < getChildCount() - 1) {
                    int indicatorColor2 = tabColorizer2.getIndicatorColor(this.f31681Q + 1);
                    if (indicatorColor != indicatorColor2) {
                        float f20 = this.f31691k0;
                        float f21 = 1.0f - f20;
                        indicatorColor = Color.rgb((int) ((Color.red(indicatorColor) * f21) + (Color.red(indicatorColor2) * f20)), (int) ((Color.green(indicatorColor) * f21) + (Color.green(indicatorColor2) * f20)), (int) ((Color.blue(indicatorColor) * f21) + (Color.blue(indicatorColor2) * f20)));
                    }
                    float fA = this.f31694p0.a(this.f31691k0);
                    float fB = this.f31694p0.b(this.f31691k0);
                    float fC = this.f31694p0.c(this.f31691k0);
                    View childAt2 = getChildAt(this.f31681Q + 1);
                    int iG2 = D3.a.g(childAt2, z8);
                    int iD2 = D3.a.d(childAt2, z8);
                    if (zP) {
                        iD = (int) (((1.0f - fB) * iD) + (iD2 * fB));
                        i10 = (int) (((1.0f - fA) * i10) + (iG2 * fA));
                    } else {
                        i10 = (int) (((1.0f - fB) * i10) + (iD2 * fB));
                        iD = (int) (((1.0f - fA) * iD) + (iG2 * fA));
                    }
                    f13 = f12 * fC;
                }
                if (i18 > 0 && (i11 = this.f31693p) != 0) {
                    i12 = this.t;
                    if (i12 != 1) {
                        f14 = 2.0f;
                        if (i12 != 2) {
                            f15 = height - (f12 / 2.0f);
                        } else {
                            f15 = height / 2.0f;
                        }
                    } else {
                        f14 = 2.0f;
                        f15 = f12 / 2.0f;
                    }
                    float f22 = f13 / f14;
                    f16 = f15 - f22;
                    f17 = f15 + f22;
                    paint = this.f31697w;
                    paint.setColor(indicatorColor);
                    rectF = this.f31687f;
                    if (i11 == -1) {
                        rectF.set(iD, f16, i10, f17);
                    } else {
                        float fAbs = (Math.abs(iD - i10) - i11) / f14;
                        rectF.set(iD + fAbs, f16, i10 - fAbs, f17);
                    }
                    f18 = this.f31696v;
                    if (f18 > 0.0f) {
                        canvas2.drawRoundRect(rectF, f18, f18, paint);
                    } else {
                        canvas2.drawRect(rectF, paint);
                    }
                }
            } else {
                f12 = f19;
            }
            f13 = f12;
            indicatorColor = indicatorColor;
            if (i18 > 0) {
                i12 = this.t;
                if (i12 != 1) {
                    f14 = 2.0f;
                    if (i12 != 2) {
                        f15 = height - (f12 / 2.0f);
                    } else {
                        f15 = height / 2.0f;
                    }
                } else {
                    f14 = 2.0f;
                    f15 = f12 / 2.0f;
                }
                float f23 = f13 / f14;
                f16 = f15 - f23;
                f17 = f15 + f23;
                paint = this.f31697w;
                paint.setColor(indicatorColor);
                rectF = this.f31687f;
                if (i11 == -1) {
                    rectF.set(iD, f16, i10, f17);
                } else {
                    float fAbs2 = (Math.abs(iD - i10) - i11) / f14;
                    rectF.set(iD + fAbs2, f16, i10 - fAbs2, f17);
                }
                f18 = this.f31696v;
                if (f18 > 0.0f) {
                    canvas2.drawRoundRect(rectF, f18, f18, paint);
                } else {
                    canvas2.drawRect(rectF, paint);
                }
            }
        } else {
            dVar = dVar2;
            f10 = 0.0f;
            f11 = 1.0f;
        }
        if (z3) {
            f10 = f10;
            f11 = f11;
        } else {
            int i19 = i17;
            if (i19 <= 0) {
                i7 = 0;
            } else {
                paint2.setColor(i16);
                i7 = 0;
                canvas2.drawRect(0, 0.0f, width, i19, paint2);
            }
            int width2 = getWidth();
            if (i15 > 0) {
                paint2.setColor(i14);
                canvas.drawRect(i7, height - i15, width2, height, paint2);
            }
        }
        if (this.f31675A <= 0) {
            return;
        }
        int iMin = (int) (Math.min(Math.max(f10, this.f31677C), f11) * height);
        SmartTabLayout.TabColorizer tabColorizer3 = this.f31695q0;
        SmartTabLayout.TabColorizer tabColorizer4 = tabColorizer3 != null ? tabColorizer3 : dVar;
        int i20 = (height - iMin) / 2;
        int i21 = i20 + iMin;
        boolean zP2 = D3.a.p(this);
        for (int i22 = 0; i22 < childCount - 1; i22++) {
            View childAt3 = getChildAt(i22);
            int iD3 = D3.a.d(childAt3, false);
            int iE = D3.a.e(childAt3);
            int i23 = zP2 ? iD3 - iE : iD3 + iE;
            Paint paint3 = this.f31676B;
            paint3.setColor(tabColorizer4.getDividerColor(i22));
            float f24 = i23;
            canvas.drawLine(f24, i20, f24, i21, paint3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f31679L) {
            a(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f31679L) {
            return;
        }
        a(canvas);
    }
}
