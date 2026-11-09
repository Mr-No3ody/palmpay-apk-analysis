package com.transsnet.mtn.sdk.ui.view.avloading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.alibaba.android.arouter.utils.Consts;
import oh.a;
import oh.b;
import p349x8.e;
import p349x8.f;

/* JADX INFO: loaded from: classes3.dex */
public class AVLoadingIndicatorView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f25742w = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f25743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C8.a f25747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C8.a f25748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25749g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25751j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25752o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f25753p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f25754v;

    public AVLoadingIndicatorView(Context context) {
        super(context);
        this.f25743a = -1L;
        this.f25744b = false;
        this.f25745c = false;
        this.f25746d = false;
        this.f25747e = new C8.a(this, 0);
        this.f25748f = new C8.a(this, 1);
        b(context, null, 0, 0);
    }

    public final void a() {
        this.f25746d = true;
        removeCallbacks(this.f25748f);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j6 = this.f25743a;
        long j10 = jCurrentTimeMillis - j6;
        if (j10 >= 100 || j6 == -1) {
            setVisibility(8);
        } else {
            if (this.f25744b) {
                return;
            }
            postDelayed(this.f25747e, 100 - j10);
            this.f25744b = true;
        }
    }

    public final void b(Context context, AttributeSet attributeSet, int i7, int i10) {
        this.f25749g = 24;
        this.f25750i = 48;
        this.f25751j = 24;
        this.f25752o = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.AVLoadingIndicatorView, i7, i10);
        this.f25749g = typedArrayObtainStyledAttributes.getDimensionPixelSize(f.AVLoadingIndicatorView_minWidth, this.f25749g);
        this.f25750i = typedArrayObtainStyledAttributes.getDimensionPixelSize(f.AVLoadingIndicatorView_maxWidth, this.f25750i);
        this.f25751j = typedArrayObtainStyledAttributes.getDimensionPixelSize(f.AVLoadingIndicatorView_minHeight, this.f25751j);
        this.f25752o = typedArrayObtainStyledAttributes.getDimensionPixelSize(f.AVLoadingIndicatorView_maxHeight, this.f25752o);
        String string = typedArrayObtainStyledAttributes.getString(f.AVLoadingIndicatorView_indicatorName);
        this.t = typedArrayObtainStyledAttributes.getColor(f.AVLoadingIndicatorView_indicatorColor, -1);
        setIndicator(string);
        if (this.f25753p == null) {
            setIndicator(f25742w);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        b bVar = this.f25753p;
        if (bVar != null) {
            bVar.setHotspot(f10, f11);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f25753p;
        if (bVar == null || !bVar.isStateful()) {
            return;
        }
        this.f25753p.setState(drawableState);
    }

    public b getIndicator() {
        return this.f25753p;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int paddingLeft = getPaddingLeft() + getScrollX();
        int paddingTop = getPaddingTop() + getScrollY();
        invalidate(bounds.left + paddingLeft, bounds.top + paddingTop, bounds.right + paddingLeft, bounds.bottom + paddingTop);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            if (this.f25753p != null) {
                this.f25754v = true;
            }
            postInvalidate();
        }
        removeCallbacks(this.f25747e);
        removeCallbacks(this.f25748f);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        b bVar = this.f25753p;
        if (bVar != null) {
            bVar.stop();
            this.f25754v = false;
        }
        postInvalidate();
        super.onDetachedFromWindow();
        removeCallbacks(this.f25747e);
        removeCallbacks(this.f25748f);
    }

    @Override // android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b bVar = this.f25753p;
        if (bVar != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            bVar.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.f25754v) {
                bVar.start();
                this.f25754v = false;
            }
        }
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i7, int i10) {
        int iMax;
        int iMax2;
        try {
            b bVar = this.f25753p;
            if (bVar != null) {
                iMax2 = Math.max(this.f25749g, Math.min(this.f25750i, bVar.getIntrinsicWidth()));
                iMax = Math.max(this.f25751j, Math.min(this.f25752o, bVar.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            int[] drawableState = getDrawableState();
            b bVar2 = this.f25753p;
            if (bVar2 != null && bVar2.isStateful()) {
                this.f25753p.setState(drawableState);
            }
            setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + iMax2, i7, 0), View.resolveSizeAndState(getPaddingBottom() + getPaddingTop() + iMax, i10, 0));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int i13;
        int paddingLeft = i7 - (getPaddingLeft() + getPaddingRight());
        int paddingBottom = i10 - (getPaddingBottom() + getPaddingTop());
        b bVar = this.f25753p;
        if (bVar != null) {
            float intrinsicWidth = bVar.getIntrinsicWidth() / this.f25753p.getIntrinsicHeight();
            float f10 = paddingLeft;
            float f11 = paddingBottom;
            float f12 = f10 / f11;
            int i14 = 0;
            if (intrinsicWidth == f12) {
                i13 = 0;
            } else if (f12 > intrinsicWidth) {
                int i15 = (int) (f11 * intrinsicWidth);
                int i16 = (paddingLeft - i15) / 2;
                i14 = i16;
                paddingLeft = i15 + i16;
                i13 = 0;
            } else {
                int i17 = (int) ((1.0f / intrinsicWidth) * f10);
                int i18 = (paddingBottom - i17) / 2;
                int i19 = i17 + i18;
                i13 = i18;
                paddingBottom = i19;
            }
            this.f25753p.setBounds(i14, i13, paddingLeft, paddingBottom);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (i7 == 8 || i7 == 4) {
            b bVar = this.f25753p;
            if (bVar != null) {
                bVar.stop();
                this.f25754v = false;
            }
            postInvalidate();
            return;
        }
        if (getVisibility() != 0) {
            return;
        }
        if (this.f25753p != null) {
            this.f25754v = true;
        }
        postInvalidate();
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!str.contains(Consts.DOT)) {
            sb2.append(getClass().getPackage().getName());
            sb2.append(".indicators.");
        }
        sb2.append(str);
        try {
            setIndicator((b) Class.forName(sb2.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e("AVLoadingIndicatorView", "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e10) {
            e = e10;
            e.printStackTrace();
        } catch (InstantiationException e11) {
            e = e11;
            e.printStackTrace();
        }
    }

    public void setIndicatorColor(int i7) {
        this.t = i7;
        this.f25753p.setColor(i7);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (getVisibility() != i7) {
            super.setVisibility(i7);
            if (i7 == 8 || i7 == 4) {
                b bVar = this.f25753p;
                if (bVar != null) {
                    bVar.stop();
                    this.f25754v = false;
                }
                postInvalidate();
                return;
            }
            if (getVisibility() != 0) {
                return;
            }
            if (this.f25753p != null) {
                this.f25754v = true;
            }
            postInvalidate();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f25753p || super.verifyDrawable(drawable);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25743a = -1L;
        this.f25744b = false;
        this.f25745c = false;
        this.f25746d = false;
        this.f25747e = new C8.a(this, 0);
        this.f25748f = new C8.a(this, 1);
        b(context, attributeSet, 0, e.AVLoadingIndicatorView);
    }

    public void setIndicator(b bVar) {
        b bVar2 = this.f25753p;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.setCallback(null);
                unscheduleDrawable(this.f25753p);
            }
            this.f25753p = bVar;
            setIndicatorColor(this.t);
            if (bVar != null) {
                bVar.setCallback(this);
            }
            postInvalidate();
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f25743a = -1L;
        this.f25744b = false;
        this.f25745c = false;
        this.f25746d = false;
        this.f25747e = new C8.a(this, 0);
        this.f25748f = new C8.a(this, 1);
        b(context, attributeSet, i7, e.AVLoadingIndicatorView);
    }
}
