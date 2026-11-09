package com.transsnet.palmpay.custom_view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes4.dex */
public class RoundedTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f31120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f31121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f31122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D f31124f;

    public RoundedTextView(Context context) {
        this(context, null);
    }

    public final void b() {
        int measuredHeight = this.f31119a;
        if (measuredHeight == -1) {
            measuredHeight = getMeasuredHeight() / 2;
        }
        float f10 = measuredHeight;
        ColorStateList textColors = this.f31121c;
        if (textColors == null) {
            textColors = getTextColors();
        }
        int i7 = this.f31120b;
        if (this.f31124f == null) {
            this.f31124f = new D();
        }
        D d2 = this.f31124f;
        ColorStateList colorStateList = this.f31122d;
        d2.f30995a = textColors;
        d2.f30996b = colorStateList;
        d2.f30997c = i7;
        d2.setCornerRadius(f10);
        d2.a();
        setBackgroundDrawable(this.f31124f);
        c();
    }

    public final void c() {
        int textSize = ((int) getTextSize()) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        if (paddingLeft == textSize && paddingRight == textSize) {
            return;
        }
        setPadding(textSize, paddingTop, textSize, paddingBottom);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        if (getMeasuredHeight() <= 0 || this.f31123e) {
            return;
        }
        this.f31123e = true;
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        super.onTextChanged(charSequence, i7, i10, i11);
        c();
    }

    public void setRoundedBackgroundColor(int i7) {
        ColorStateList colorStateList = this.f31122d;
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : -1;
        this.f31122d = ColorStateList.valueOf(i7);
        if (!this.f31123e || defaultColor == i7) {
            return;
        }
        b();
    }

    public void setRoundedBorderColor(int i7) {
        ColorStateList colorStateList = this.f31121c;
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : -1;
        this.f31121c = ColorStateList.valueOf(i7);
        if (!this.f31123e || defaultColor == i7) {
            return;
        }
        b();
    }

    public void setRoundedBorderWidth(int i7) {
        int i10 = this.f31120b;
        this.f31120b = i7;
        if (!this.f31123e || i10 == i7) {
            return;
        }
        b();
    }

    public void setRoundedCornerRadius(int i7) {
        int i10 = this.f31119a;
        this.f31119a = i7;
        if (!this.f31123e || i10 == i7) {
            return;
        }
        b();
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        int currentTextColor = getCurrentTextColor();
        super.setTextColor(i7);
        if (!this.f31123e || currentTextColor == i7) {
            return;
        }
        b();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f10) {
        float textSize = getTextSize();
        super.setTextSize(f10);
        if (!this.f31123e || textSize == f10) {
            return;
        }
        b();
    }

    public RoundedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.RoundedTextView, i7, 0);
        this.f31119a = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.RoundedTextView_rtv_corner_radius, -1);
        this.f31120b = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.RoundedTextView_rtv_border_width, 0);
        this.f31121c = typedArrayObtainStyledAttributes.getColorStateList(x.RoundedTextView_rtv_border_color);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(x.RoundedTextView_rtv_background_color);
        this.f31122d = colorStateList;
        if (colorStateList == null) {
            this.f31122d = ColorStateList.valueOf(-1);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
