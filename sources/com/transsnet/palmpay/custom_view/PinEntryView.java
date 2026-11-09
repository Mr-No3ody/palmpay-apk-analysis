package com.transsnet.palmpay.custom_view;

import V9.ViewOnFocusChangeListenerC0713b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;

/* JADX INFO: loaded from: classes4.dex */
public class PinEntryView extends LinearLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f31060A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f31061B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f31062C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f31063H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public EditText f31064L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public View.OnFocusChangeListener f31065M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public OnPinEnteredListener f31066Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f31067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f31069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f31070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f31072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f31073g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f31074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f31075j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f31076k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f31077o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f31078p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f31079p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f31080q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f31081r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ImageView f31082s0;
    public final int t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Object f31083t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f31084u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f31085v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Runnable f31086v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f31087w;

    public class DigitView extends AppCompatTextView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Paint f31088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Paint f31089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f31090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f31091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f31092e;

        public DigitView(Context context) {
            int color;
            super(context, null, 0);
            Paint paint = new Paint();
            this.f31088a = paint;
            Paint.Style style = Paint.Style.FILL;
            paint.setStyle(style);
            paint.setColor(PinEntryView.this.f31062C);
            Paint paint2 = new Paint(1);
            this.f31089b = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(PinEntryView.this.f31077o);
            paint2.setColor(PinEntryView.this.f31078p);
            Paint paint3 = new Paint(1);
            this.f31090c = paint3;
            paint3.setStyle(style);
            try {
                color = PinEntryView.this.f31071e != 0 ? getResources().getColor(PinEntryView.this.f31071e) : -1;
            } catch (Exception unused) {
            }
            paint3.setColor(color);
            if (isInEditMode()) {
                setText("●");
            }
            setLayerType(1, paint2);
        }

        @Override // android.widget.TextView, android.view.View
        public final void onDraw(Canvas canvas) {
            int color;
            Canvas canvas2;
            PinEntryView pinEntryView = PinEntryView.this;
            Paint paint = this.f31090c;
            try {
                color = pinEntryView.f31071e != 0 ? getResources().getColor(pinEntryView.f31071e) : -1;
            } catch (Exception unused) {
            }
            paint.setColor(color);
            paint.setStyle(Paint.Style.FILL);
            if (pinEntryView.f31085v > 0) {
                RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
                float f10 = pinEntryView.f31085v;
                canvas.drawRoundRect(rectF, f10, f10, paint);
                canvas2 = canvas;
            } else {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                canvas2 = canvas;
            }
            super.onDraw(canvas2);
            if (isSelected() || !pinEntryView.f31076k0) {
                canvas2.drawRect(0.0f, getHeight() - pinEntryView.f31061B, getWidth(), getHeight(), this.f31088a);
            }
            boolean z3 = pinEntryView.f31079p0;
            Paint paint2 = this.f31089b;
            if (z3) {
                paint2.setColor(getResources().getColor(L6.b.ppColorError));
            } else {
                int i7 = pinEntryView.f31078p;
                if (isSelected()) {
                    i7 = pinEntryView.t;
                }
                paint2.setColor(i7);
            }
            if (pinEntryView.f31072f != 0) {
                if (pinEntryView.f31085v <= 0) {
                    canvas2.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint2);
                    return;
                }
                float f11 = pinEntryView.f31077o / 2;
                RectF rectF2 = new RectF(f11, f11, getWidth() - (pinEntryView.f31077o / 2), getHeight() - (pinEntryView.f31077o / 2));
                float f12 = pinEntryView.f31085v;
                canvas2.drawRoundRect(rectF2, f12, f12, paint2);
                return;
            }
            paint2.setColor(pinEntryView.f31078p);
            if (pinEntryView.f31085v <= 0) {
                if (this.f31092e) {
                    canvas2.drawRect(new Rect(0, 0, getWidth(), getHeight()), paint2);
                    return;
                } else {
                    canvas2.drawRect(new Rect(0, 0, getWidth() * 2, getHeight()), paint2);
                    return;
                }
            }
            float f13 = pinEntryView.f31077o / 2;
            RectF rectF3 = new RectF(f13, f13, getWidth() - (pinEntryView.f31077o / 2), getHeight() - (pinEntryView.f31077o / 2));
            if (this.f31091d) {
                RectF rectF4 = new RectF(rectF3);
                float f14 = rectF4.right;
                float f15 = pinEntryView.f31085v;
                rectF4.right = f14 + f15;
                canvas2.drawRoundRect(rectF4, f15, f15, paint2);
                return;
            }
            if (!this.f31092e) {
                int i10 = pinEntryView.f31077o / 2;
                canvas2.drawRect(new Rect(i10, i10, getWidth() * 2, getHeight() - (pinEntryView.f31077o / 2)), paint2);
                return;
            }
            RectF rectF5 = new RectF(rectF3);
            float f16 = rectF5.left;
            float f17 = pinEntryView.f31085v;
            rectF5.left = f16 - f17;
            canvas2.drawRoundRect(rectF5, f17, f17, paint2);
            float f18 = rectF3.left;
            canvas2.drawLine(f18, rectF3.top, f18, rectF3.bottom, paint2);
        }
    }

    public interface OnPinEnteredListener {
        void onPinEntered(String str);
    }

    public interface OnPinHideStateChangeListener {
        void onHideStateChanged(PinEntryView pinEntryView, boolean z3);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1554l();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f31094a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeString(this.f31094a);
        }
    }

    public PinEntryView(Context context) {
        this(context, null);
    }

    public final void a() {
        boolean z3;
        int i7 = 0;
        while (true) {
            int i10 = this.f31067a;
            z3 = this.f31080q0;
            if (i7 >= i10) {
                break;
            }
            DigitView digitView = new DigitView(getContext());
            digitView.setWidth(this.f31069c);
            digitView.setHeight(this.f31070d);
            digitView.setTextColor(this.f31074i);
            digitView.setTextSize(0, this.f31073g);
            digitView.setTypeface(Typeface.create("sans-serif-medium", 0));
            digitView.setGravity(17);
            digitView.setElevation(this.f31075j);
            digitView.f31091d = i7 == 0;
            digitView.f31092e = i7 == this.f31067a - 1;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i7 < this.f31067a - 1) {
                layoutParams.rightMargin = this.f31072f;
            }
            if (i7 == 0 && z3) {
                layoutParams.leftMargin = (this.f31072f * 2) + this.f31087w;
            }
            addView(digitView, layoutParams);
            i7++;
        }
        if (z3) {
            if (this.f31082s0 == null) {
                this.f31082s0 = new ImageView(getContext());
            }
            this.f31082s0.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f31082s0.setOnClickListener(new ViewOnClickListenerC1533v(this, 18));
            this.f31082s0.setImageResource(this.f31081r0 ? r.cv_hide_psw : r.cv_show_psw);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            layoutParams2.leftMargin = this.f31072f * 2;
            addView(this.f31082s0, layoutParams2);
        }
        EditText editText = new EditText(getContext());
        this.f31064L = editText;
        editText.setEnabled(isEnabled());
        this.f31064L.setBackgroundColor(getResources().getColor(R.color.transparent));
        this.f31064L.setTextColor(getResources().getColor(R.color.transparent));
        this.f31064L.setCursorVisible(false);
        this.f31064L.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.f31067a)});
        this.f31064L.setInputType(this.f31068b);
        this.f31064L.setImeOptions(268435462);
        EditText editText2 = this.f31064L;
        if (editText2 != null) {
            editText2.setShowSoftInputOnFocus(!this.f31084u0);
        }
        this.f31064L.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0713b(this, 3));
        this.f31064L.addTextChangedListener(new C1553k(this));
        addView(this.f31064L, new LinearLayout.LayoutParams(1, 1));
    }

    public final void b() {
        this.f31064L.setText("");
    }

    public final void c() {
        try {
            EditText editText = this.f31064L;
            if (editText != null) {
                editText.requestFocus();
                if (!this.f31084u0) {
                    ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f31064L, 0);
                    return;
                }
                Runnable runnable = this.f31086v0;
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void d(boolean z3) {
        if (this.f31081r0 == z3) {
            return;
        }
        this.f31081r0 = z3;
        ImageView imageView = this.f31082s0;
        if (imageView != null) {
            imageView.setImageResource(z3 ? r.cv_hide_psw : r.cv_show_psw);
        }
        EditText editText = this.f31064L;
        if (editText != null) {
            e(editText.getEditableText());
        }
    }

    public final void e(Editable editable) {
        int length = TextUtils.isEmpty(editable) ? 0 : editable.length();
        for (int i7 = 0; i7 < this.f31067a; i7++) {
            if (length > i7) {
                String strValueOf = this.f31063H;
                if (strValueOf == null || strValueOf.isEmpty() || !this.f31081r0) {
                    strValueOf = String.valueOf(editable.charAt(i7));
                }
                ((TextView) getChildAt(i7)).setText(strValueOf);
            } else {
                ((TextView) getChildAt(i7)).setText("");
            }
        }
    }

    public int getAccentColor() {
        return this.f31062C;
    }

    public boolean getAccentRequiresFocus() {
        return this.f31076k0;
    }

    public int getAccentType() {
        return this.f31060A;
    }

    public int getAccentWidth() {
        return this.f31061B;
    }

    public int getDigitBackground() {
        return this.f31071e;
    }

    public int getDigitElevation() {
        return this.f31075j;
    }

    public int getDigitHeight() {
        return this.f31070d;
    }

    public int getDigitSpacing() {
        return this.f31072f;
    }

    public int getDigitTextColor() {
        return this.f31074i;
    }

    public int getDigitTextSize() {
        return this.f31073g;
    }

    public int getDigitWidth() {
        return this.f31069c;
    }

    public int getDigits() {
        return this.f31067a;
    }

    public EditText getEditText() {
        return this.f31064L;
    }

    public int getInputType() {
        return this.f31068b;
    }

    public String getMask() {
        return this.f31063H;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f31065M;
    }

    public OnPinEnteredListener getOnPinEnteredListener() {
        return this.f31066Q;
    }

    public Editable getText() {
        return this.f31064L.getText();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        try {
            this.f31064L.setText(savedState.f31094a);
            this.f31064L.setSelection(savedState.f31094a.length());
        } catch (Exception e10) {
            F6.d.c("PinEntryView", "onRestoreInstanceState: ", e10);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f31094a = this.f31064L.getText().toString();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        c();
        return true;
    }

    public void setDigitHeight(int i7) {
        this.f31070d = i7;
    }

    public void setDigitSpacing(int i7) {
        this.f31072f = i7;
    }

    public void setDigitWidth(int i7) {
        this.f31069c = i7;
    }

    public void setDigits(int i7) {
        this.f31067a = i7;
        removeAllViews();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        EditText editText = this.f31064L;
        if (editText != null) {
            editText.setEnabled(z3);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f31065M = onFocusChangeListener;
    }

    public void setOnPinEnteredListener(OnPinEnteredListener onPinEnteredListener) {
        this.f31066Q = onPinEnteredListener;
    }

    public void setOnShowCustomKeyboardListener(Runnable runnable) {
        this.f31086v0 = runnable;
    }

    public void setShowError(boolean z3) {
        this.f31079p0 = z3;
    }

    public void setText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            int length = charSequence.length();
            int i7 = this.f31067a;
            if (length > i7) {
                charSequence = charSequence.subSequence(0, i7);
            }
        }
        this.f31064L.setText(charSequence);
    }

    public void setUseCustomKeyboard(boolean z3) {
        this.f31084u0 = z3;
        EditText editText = this.f31064L;
        if (editText == null) {
            return;
        }
        editText.setShowSoftInputOnFocus(!z3);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public PinEntryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinEntryView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31063H = "*";
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.PinEntryView);
        this.f31067a = typedArrayObtainStyledAttributes.getInt(x.PinEntryView_numDigits, 4);
        this.f31068b = typedArrayObtainStyledAttributes.getInt(x.PinEntryView_pinInputType, 2);
        this.f31060A = typedArrayObtainStyledAttributes.getInt(x.PinEntryView_accentType, 0);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f31069c = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_digitWidth, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
        this.f31070d = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_digitHeight, (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
        this.f31072f = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_digitSpacing, (int) TypedValue.applyDimension(1, 20.0f, displayMetrics));
        this.f31073g = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_digitTextSize, (int) TypedValue.applyDimension(2, 15.0f, displayMetrics));
        this.f31061B = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_accentWidth, (int) TypedValue.applyDimension(1, 3.0f, displayMetrics));
        this.f31085v = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_digitRadius, 0);
        this.f31087w = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_leftMargin, (int) TypedValue.applyDimension(1, 20.0f, displayMetrics));
        this.f31075j = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_digitElevation, 0);
        Resources.Theme theme = getContext().getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.windowBackground, typedValue, true);
        this.f31071e = typedArrayObtainStyledAttributes.getResourceId(x.PinEntryView_digitBackground, typedValue.resourceId);
        theme.resolveAttribute(R.attr.textColorPrimary, new TypedValue(), true);
        this.f31074i = typedArrayObtainStyledAttributes.getColor(x.PinEntryView_digitTextColor, -16777216);
        this.f31078p = typedArrayObtainStyledAttributes.getColor(x.PinEntryView_digitStrokeColor, -16777216);
        this.t = typedArrayObtainStyledAttributes.getColor(x.PinEntryView_digitSelectStrokeColor, -16776961);
        this.f31077o = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.PinEntryView_digitStrokeWidth, 0);
        TypedValue typedValue2 = new TypedValue();
        theme.resolveAttribute(p241q.a.colorAccent, typedValue2, true);
        this.f31062C = typedArrayObtainStyledAttributes.getColor(x.PinEntryView_pinAccentColor, typedValue2.resourceId > 0 ? getResources().getColor(typedValue2.resourceId) : typedValue2.data);
        String string = typedArrayObtainStyledAttributes.getString(x.PinEntryView_mask);
        if (string != null) {
            this.f31063H = string;
        }
        this.f31076k0 = typedArrayObtainStyledAttributes.getBoolean(x.PinEntryView_accentRequiresFocus, true);
        this.f31080q0 = typedArrayObtainStyledAttributes.getBoolean(x.PinEntryView_showHideButton, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f31081r0 = true;
        setVerticalGravity(1);
        a();
    }
}
