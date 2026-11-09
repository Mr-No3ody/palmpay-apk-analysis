package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.d;
import androidx.core.view.C1050b;
import androidx.core.view.N;
import com.google.android.material.R;
import com.google.android.material.resources.MaterialResources;
import java.util.Arrays;
import p045d3.k;

/* JADX INFO: loaded from: classes2.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.OnRotateListener {
    private static final float EPSILON = 0.001f;
    private static final int INITIAL_CAPACITY = 12;
    private static final String VALUE_PLACEHOLDER = "";
    private final int clockHandPadding;
    private final ClockHandView clockHandView;
    private final int clockSize;
    private float currentHandRotation;
    private final int[] gradientColors;
    private final float[] gradientPositions;
    private final int minimumHeight;
    private final int minimumWidth;
    private final RectF scratch;
    private final Rect scratchLineBounds;
    private final ColorStateList textColor;
    private final SparseArray<TextView> textViewPool;
    private final Rect textViewRect;
    private final C1050b valueAccessibilityDelegate;
    private String[] values;

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    private void findIntersectingTextView() {
        RectF currentSelectorBox = this.clockHandView.getCurrentSelectorBox();
        TextView selectedTextView = getSelectedTextView(currentSelectorBox);
        for (int i7 = 0; i7 < this.textViewPool.size(); i7++) {
            TextView textView = this.textViewPool.get(i7);
            if (textView != null) {
                textView.setSelected(textView == selectedTextView);
                textView.getPaint().setShader(getGradientForTextView(currentSelectorBox, textView));
                textView.invalidate();
            }
        }
    }

    @Nullable
    private RadialGradient getGradientForTextView(RectF rectF, TextView textView) {
        textView.getHitRect(this.textViewRect);
        this.scratch.set(this.textViewRect);
        textView.getLineBounds(0, this.scratchLineBounds);
        RectF rectF2 = this.scratch;
        Rect rect = this.scratchLineBounds;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.scratch)) {
            return new RadialGradient(rectF.centerX() - this.scratch.left, rectF.centerY() - this.scratch.top, rectF.width() * 0.5f, this.gradientColors, this.gradientPositions, Shader.TileMode.CLAMP);
        }
        return null;
    }

    @Nullable
    private TextView getSelectedTextView(RectF rectF) {
        float f10 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i7 = 0; i7 < this.textViewPool.size(); i7++) {
            TextView textView2 = this.textViewPool.get(i7);
            if (textView2 != null) {
                textView2.getHitRect(this.textViewRect);
                this.scratch.set(this.textViewRect);
                this.scratch.union(rectF);
                float fHeight = this.scratch.height() * this.scratch.width();
                if (fHeight < f10) {
                    textView = textView2;
                    f10 = fHeight;
                }
            }
        }
        return textView;
    }

    private static float max3(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void updateTextViews(@StringRes int i7) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.textViewPool.size();
        boolean z3 = false;
        for (int i10 = 0; i10 < Math.max(this.values.length, size); i10++) {
            TextView textView = this.textViewPool.get(i10);
            if (i10 >= this.values.length) {
                removeView(textView);
                this.textViewPool.remove(i10);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.textViewPool.put(i10, textView);
                    addView(textView);
                }
                textView.setText(this.values[i10]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i10));
                int i11 = (i10 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i11));
                if (i11 > 1) {
                    z3 = true;
                }
                N.q(textView, this.valueAccessibilityDelegate);
                textView.setTextColor(this.textColor);
                if (i7 != 0) {
                    textView.setContentDescription(getResources().getString(i7, this.values[i10]));
                }
            }
        }
        this.clockHandView.setMultiLevel(z3);
    }

    public int getCurrentLevel() {
        return this.clockHandView.getCurrentLevel();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) Sd.b.c(1, this.values.length, 1, false).f8871b);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i7, int i10, int i11, int i12) {
        super.onLayout(z3, i7, i10, i11, i12);
        findIntersectingTextView();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax3 = (int) (this.clockSize / max3(this.minimumHeight / displayMetrics.heightPixels, this.minimumWidth / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824);
        setMeasuredDimension(iMax3, iMax3);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float f10, boolean z3) {
        if (Math.abs(this.currentHandRotation - f10) > EPSILON) {
            this.currentHandRotation = f10;
            findIntersectingTextView();
        }
    }

    public void setCurrentLevel(int i7) {
        this.clockHandView.setCurrentLevel(i7);
    }

    public void setHandRotation(@FloatRange(from = 0.0d, to = 360.0d) float f10) {
        this.clockHandView.setHandRotation(f10);
        findIntersectingTextView();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void setRadius(int i7) {
        if (i7 != getRadius()) {
            super.setRadius(i7);
            this.clockHandView.setCircleRadius(getRadius());
        }
    }

    public void setValues(String[] strArr, @StringRes int i7) {
        this.values = strArr;
        updateTextViews(i7);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void updateLayoutParams() {
        super.updateLayoutParams();
        for (int i7 = 0; i7 < this.textViewPool.size(); i7++) {
            this.textViewPool.get(i7).setVisibility(0);
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.textViewRect = new Rect();
        this.scratch = new RectF();
        this.scratchLineBounds = new Rect();
        this.textViewPool = new SparseArray<>();
        this.gradientPositions = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i7, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.textColor = colorStateList;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.clockHandView = clockHandView;
        this.clockHandPadding = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_selected}, colorStateList.getDefaultColor());
        this.gradientColors = new int[]{colorForState, colorForState, colorStateList.getDefaultColor()};
        clockHandView.addOnRotateListener(this);
        int defaultColor = d.c(R.color.material_timepicker_clockface, context).getDefaultColor();
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.timepicker.ClockFaceView.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (!ClockFaceView.this.isShown()) {
                    return true;
                }
                ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                ClockFaceView.this.setRadius(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.clockHandView.getSelectorRadius()) - ClockFaceView.this.clockHandPadding);
                return true;
            }
        });
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.valueAccessibilityDelegate = new C1050b() { // from class: com.google.android.material.timepicker.ClockFaceView.2
            @Override // androidx.core.view.C1050b
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull p074f0.d dVar) {
                super.onInitializeAccessibilityNodeInfo(view, dVar);
                int iIntValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
                if (iIntValue > 0) {
                    dVar.f36360a.setTraversalAfter((View) ClockFaceView.this.textViewPool.get(iIntValue - 1));
                }
                dVar.n(k.h(0, 1, iIntValue, 1, false, view.isSelected()));
                dVar.l(true);
                dVar.b(p074f0.c.f36345g);
            }

            @Override // androidx.core.view.C1050b
            public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
                if (i10 != 16) {
                    return super.performAccessibilityAction(view, i10, bundle);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.textViewRect);
                float fCenterX = ClockFaceView.this.textViewRect.centerX();
                float fCenterY = ClockFaceView.this.textViewRect.centerY();
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
                ClockFaceView.this.clockHandView.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
                return true;
            }
        };
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        setValues(strArr, 0);
        this.minimumHeight = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.minimumWidth = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.clockSize = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
