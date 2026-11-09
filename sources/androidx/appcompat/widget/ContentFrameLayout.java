package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({p192n.c.f39800a})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f12642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f12643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f12644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f12645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f12646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f12647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f12648g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnAttachListener f12649i;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f12646e == null) {
            this.f12646e = new TypedValue();
        }
        return this.f12646e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f12647f == null) {
            this.f12647f = new TypedValue();
        }
        return this.f12647f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f12644c == null) {
            this.f12644c = new TypedValue();
        }
        return this.f12644c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f12645d == null) {
            this.f12645d = new TypedValue();
        }
        return this.f12645d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f12642a == null) {
            this.f12642a = new TypedValue();
        }
        return this.f12642a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f12643b == null) {
            this.f12643b = new TypedValue();
        }
        return this.f12643b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OnAttachListener onAttachListener = this.f12649i;
        if (onAttachListener != null) {
            onAttachListener.onAttachedFromWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OnAttachListener onAttachListener = this.f12649i;
        if (onAttachListener != null) {
            onAttachListener.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int iMakeMeasureSpec;
        boolean z3;
        int iMakeMeasureSpec2;
        int i11;
        int i12;
        float fraction;
        int i13;
        int i14;
        float fraction2;
        int i15;
        int i16;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z8 = true;
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f12648g;
        if (mode != Integer.MIN_VALUE) {
            iMakeMeasureSpec = i7;
            z3 = false;
        } else {
            TypedValue typedValue = z10 ? this.f12645d : this.f12644c;
            if (typedValue == null || (i15 = typedValue.type) == 0) {
                iMakeMeasureSpec = i7;
                z3 = false;
            } else {
                if (i15 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i15 == 6) {
                        int i17 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i17, i17);
                    } else {
                        i16 = 0;
                    }
                    if (i16 > 0) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                        z3 = true;
                    } else {
                        iMakeMeasureSpec = i7;
                        z3 = false;
                    }
                }
                i16 = (int) fraction3;
                if (i16 > 0) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.left + rect.right), View.MeasureSpec.getSize(i7)), 1073741824);
                    z3 = true;
                } else {
                    iMakeMeasureSpec = i7;
                    z3 = false;
                }
            }
        }
        if (mode2 != Integer.MIN_VALUE) {
            iMakeMeasureSpec2 = i10;
        } else {
            TypedValue typedValue2 = z10 ? this.f12646e : this.f12647f;
            if (typedValue2 == null || (i13 = typedValue2.type) == 0) {
                iMakeMeasureSpec2 = i10;
            } else {
                if (i13 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i13 == 6) {
                        int i18 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i18, i18);
                    } else {
                        i14 = 0;
                    }
                    if (i14 > 0) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                    } else {
                        iMakeMeasureSpec2 = i10;
                    }
                }
                i14 = (int) fraction2;
                if (i14 > 0) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min(i14 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                } else {
                    iMakeMeasureSpec2 = i10;
                }
            }
        }
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z3 || mode != Integer.MIN_VALUE) {
            z8 = false;
        } else {
            TypedValue typedValue3 = z10 ? this.f12643b : this.f12642a;
            if (typedValue3 == null || (i11 = typedValue3.type) == 0) {
                z8 = false;
            } else {
                if (i11 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i11 == 6) {
                        int i19 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i19, i19);
                    } else {
                        i12 = 0;
                    }
                    if (i12 > 0) {
                        i12 -= rect.left + rect.right;
                    }
                    if (measuredWidth < i12) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else {
                        z8 = false;
                    }
                }
                i12 = (int) fraction;
                if (i12 > 0) {
                    i12 -= rect.left + rect.right;
                }
                if (measuredWidth < i12) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else {
                    z8 = false;
                }
            }
        }
        if (z8) {
            super.onMeasure(iMakeMeasureSpec3, iMakeMeasureSpec2);
        }
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.f12649i = onAttachListener;
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f12648g = new Rect();
    }
}
