package com.transsnet.palmpay.custom_view;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public class StateListTextView extends TextView {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f31128i = {R.attr.state_selected, R.attr.state_enabled};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f31129j = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f31130o = {-16842910};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f31131p = {R.attr.state_enabled};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StateListDrawable f31132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f31136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f31138g;

    public StateListTextView(Context context) {
        super(context);
        b(null, 0);
    }

    public final GradientDrawable a(int i7) {
        float f10 = this.f31134c;
        int i10 = this.f31136e;
        int i11 = this.f31133b;
        int i12 = this.f31135d;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setCornerRadius(f10);
        if (i12 == 0) {
            gradientDrawable.setColor(i7);
            return gradientDrawable;
        }
        if (i12 == 1) {
            gradientDrawable.setColor(0);
            gradientDrawable.setStroke(i11, i10);
            return gradientDrawable;
        }
        if (i12 == 2) {
            gradientDrawable.setColor(i7);
            gradientDrawable.setStroke(i11, i10);
        }
        return gradientDrawable;
    }

    public final void b(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.StateListTextView, i7, 0);
        this.f31133b = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.StateListTextView_sl_strokeWidth, 1);
        this.f31134c = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.StateListTextView_sl_corners, 0);
        this.f31135d = typedArrayObtainStyledAttributes.getInt(x.StateListTextView_sl_paintStyle, 0);
        this.f31136e = typedArrayObtainStyledAttributes.getColor(x.StateListTextView_sl_strokeColor, -16777216);
        this.f31137f = typedArrayObtainStyledAttributes.getColor(x.StateListTextView_sl_rippleColor, -256);
        this.f31138g = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.StateListTextView_sl_rippleRadius, 0);
        this.f31132a = new StateListDrawable();
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_disableBackground);
        int[] iArr = f31130o;
        if (zHasValue) {
            this.f31132a.addState(iArr, typedArrayObtainStyledAttributes.getDrawable(x.StateListTextView_sl_disableBackground));
        } else if (typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_disableBackgroundColor)) {
            this.f31132a.addState(iArr, a(typedArrayObtainStyledAttributes.getColor(x.StateListTextView_sl_disableBackgroundColor, -16711936)));
        }
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_pressedBackground);
        int[] iArr2 = f31129j;
        if (zHasValue2) {
            this.f31132a.addState(iArr2, typedArrayObtainStyledAttributes.getDrawable(x.StateListTextView_sl_pressedBackground));
        } else if (typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_pressedBackgroundColor)) {
            this.f31132a.addState(iArr2, a(typedArrayObtainStyledAttributes.getColor(x.StateListTextView_sl_pressedBackgroundColor, -16711936)));
        }
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_selectedBackground);
        int[] iArr3 = f31128i;
        if (zHasValue3) {
            this.f31132a.addState(iArr3, typedArrayObtainStyledAttributes.getDrawable(x.StateListTextView_sl_selectedBackground));
        } else if (typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_selectedBackgroundColor)) {
            this.f31132a.addState(iArr3, a(typedArrayObtainStyledAttributes.getColor(x.StateListTextView_sl_selectedBackgroundColor, -16711936)));
        }
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_normalBackground);
        int[] iArr4 = f31131p;
        if (zHasValue4) {
            this.f31132a.addState(iArr4, typedArrayObtainStyledAttributes.getDrawable(x.StateListTextView_sl_normalBackground));
        } else if (typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_normalBackgroundColor)) {
            this.f31132a.addState(iArr4, a(typedArrayObtainStyledAttributes.getColor(x.StateListTextView_sl_normalBackgroundColor, -16711936)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(x.StateListTextView_sl_rippleColor)) {
            RippleDrawable rippleDrawable = (RippleDrawable) getContext().getResources().getDrawable(r.cv_ripple_bg);
            rippleDrawable.setColor(ColorStateList.valueOf(this.f31137f));
            rippleDrawable.setDrawableByLayerId(R.id.content, this.f31132a);
            rippleDrawable.setDrawableByLayerId(R.id.mask, this.f31132a);
            int i10 = this.f31138g;
            if (i10 > 0) {
                rippleDrawable.setRadius(i10);
            }
            setBackground(rippleDrawable);
        } else {
            setBackground(this.f31132a);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public StateListTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet, 0);
    }

    public StateListTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        b(attributeSet, i7);
    }
}
