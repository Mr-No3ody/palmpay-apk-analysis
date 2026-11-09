package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {R.attr.colorBackground};
    private static final CardViewImpl IMPL = new b();
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    public CardView(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return IMPL.getBackgroundColor(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.getElevation(this.mCardViewDelegate);
    }

    @Px
    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @Px
    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @Px
    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @Px
    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.getMaxElevation(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.getRadius(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        CardViewImpl cardViewImpl = IMPL;
        if (cardViewImpl instanceof b) {
            super.onMeasure(i7, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.getMinWidth(this.mCardViewDelegate)), View.MeasureSpec.getSize(i7)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.getMinHeight(this.mCardViewDelegate)), View.MeasureSpec.getSize(i10)), mode2);
        }
        super.onMeasure(i7, i10);
    }

    public void setCardBackgroundColor(@ColorInt int i7) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, ColorStateList.valueOf(i7));
    }

    public void setCardElevation(float f10) {
        IMPL.setElevation(this.mCardViewDelegate, f10);
    }

    public void setContentPadding(int i7, int i10, int i11, int i12) {
        this.mContentPadding.set(i7, i10, i11, i12);
        IMPL.updatePadding(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f10) {
        IMPL.setMaxElevation(this.mCardViewDelegate, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        this.mUserSetMinHeight = i7;
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        this.mUserSetMinWidth = i7;
        super.setMinimumWidth(i7);
    }

    @Override // android.view.View
    public void setPadding(int i7, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i7, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z3) {
        if (z3 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z3;
            IMPL.onPreventCornerOverlapChanged(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f10) {
        IMPL.setRadius(this.mCardViewDelegate, f10);
    }

    public void setUseCompatPadding(boolean z3) {
        if (this.mCompatPadding != z3) {
            this.mCompatPadding = z3;
            IMPL.onCompatPaddingChanged(this.mCardViewDelegate);
        }
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, L.a.cardViewStyle);
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, colorStateList);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i7);
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        a aVar = new a(this);
        this.mCardViewDelegate = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L.d.CardView, i7, L.c.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(L.d.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(L.d.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(L.b.cardview_light_background);
            } else {
                color = getResources().getColor(L.b.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(L.d.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(L.d.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(L.d.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(L.d.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(L.d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(L.d.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(L.d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(L.d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(L.d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(L.d.CardView_contentPaddingBottom, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(L.d.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(L.d.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.initialize(aVar, context, colorStateList, dimension, dimension2, f10);
    }
}
