package com.palmpay.lib.ui.form;

import Ed.ViewOnFocusChangeListenerC0235o;
import L6.b;
import L6.c;
import L6.f;
import L6.g;
import L6.j;
import Z4.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.typeface.IIcon;
import com.palmpay.lib.ui.form.PpPhoneEditText;
import com.palmpay.lib.ui.util.CustomViewSavedState;
import p059e1.a;

/* JADX INFO: loaded from: classes3.dex */
public class PpPhoneEditText extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AppCompatEditText f24431A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AppCompatTextView f24432B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f24433C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f24434H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f24435L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f24436M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f24437Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f24440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ColorStateList f24442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f24443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f24444g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f24445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f24446j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f24447k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f24448o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f24449p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View.OnFocusChangeListener f24450p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public TextWatcher f24451q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public View.OnClickListener f24452r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public String f24453s0;
    public final ImageView t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f24454t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final boolean f24455u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f24456v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f24457v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f24458w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final boolean f24459w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f24460x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f24461y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final int f24462z0;

    public PpPhoneEditText(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(PpPhoneEditText ppPhoneEditText, View view, boolean z3) {
        View.OnFocusChangeListener onFocusChangeListener = ppPhoneEditText.f24450p0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z3);
        }
        ppPhoneEditText.f24447k0 = z3;
        if (ppPhoneEditText.f24457v0) {
            ppPhoneEditText.setLineColor(ppPhoneEditText.getResources().getColor(b.ppColorError));
        } else {
            ppPhoneEditText.setLineColor((z3 && ppPhoneEditText.f24455u0) ? ppPhoneEditText.getResources().getColor(b.ppColorTextPrimary) : ppPhoneEditText.getLineColor());
        }
        if (!z3) {
            ppPhoneEditText.f24458w.setVisibility(8);
            if (!TextUtils.isEmpty(ppPhoneEditText.f24453s0)) {
                ppPhoneEditText.f24454t0 = true;
                ppPhoneEditText.f24458w.setVisibility(8);
            }
            if (ppPhoneEditText.f24457v0 || !TextUtils.isEmpty(ppPhoneEditText.f24440c)) {
                return;
            }
            ppPhoneEditText.f24449p.setVisibility(4);
            return;
        }
        if (ppPhoneEditText.f24454t0) {
            ppPhoneEditText.f24454t0 = false;
        }
        if (!TextUtils.isEmpty(ppPhoneEditText.f24453s0) && ppPhoneEditText.f24455u0) {
            ppPhoneEditText.f24458w.setVisibility(0);
        }
        if (TextUtils.isEmpty(ppPhoneEditText.f24440c) && ppPhoneEditText.f24459w0 && !ppPhoneEditText.f24457v0) {
            return;
        }
        ppPhoneEditText.f24449p.setVisibility(0);
    }

    public static void d(PpPhoneEditText ppPhoneEditText) {
        ppPhoneEditText.f24431A.getText().clear();
        ppPhoneEditText.f24457v0 = false;
        ppPhoneEditText.f24446j.setTextColor(ppPhoneEditText.getResources().getColor(b.ppColorTextAssist));
        ppPhoneEditText.setLineColor(ppPhoneEditText.getLineColor());
        if (TextUtils.isEmpty(ppPhoneEditText.f24440c)) {
            e.K(ppPhoneEditText.f24446j, false);
        } else {
            ppPhoneEditText.f24446j.setText(ppPhoneEditText.f24440c);
        }
        if (ppPhoneEditText.f24459w0) {
            if (TextUtils.isEmpty(ppPhoneEditText.f24440c)) {
                ppPhoneEditText.f24449p.setVisibility(4);
            } else {
                ppPhoneEditText.f24449p.setVisibility(0);
            }
        }
    }

    public static int e(Context context, float f10) {
        if (context == null) {
            return 0;
        }
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private int getLineColor() {
        return this.f24447k0 ? getContext().getColor(b.ppColorTextPrimary) : getContext().getColor(this.f24461y0 == 2 ? b.ppColorDividerLineDark : b.ppColorDividerLine);
    }

    private void setLineColor(@ColorInt int i7) {
        if (i7 == 0) {
            return;
        }
        this.f24449p.setBackgroundColor(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void f(String str) {
        this.f24457v0 = true;
        int color = getResources().getColor(b.ppColorError);
        this.f24446j.setTextColor(color);
        this.f24446j.setText(str);
        e.K(this.f24446j, true);
        setLineColor(color);
        this.f24449p.setVisibility(0);
    }

    public TextView getCountryCodeTextView() {
        return this.f24448o;
    }

    public String getEditContent() {
        return this.f24431A.getText().toString().trim();
    }

    public AppCompatEditText getEditText() {
        return this.f24431A;
    }

    public TextView getHintTextView() {
        return this.f24432B;
    }

    public TextView getLabelTextView() {
        return this.f24444g;
    }

    public ImageView getLeftImg() {
        return this.t;
    }

    public String getMobileNumber() {
        String editContent = getEditContent();
        return !TextUtils.isEmpty(editContent) ? editContent.replace(" ", "") : editContent;
    }

    public ImageView getRightImg() {
        return this.f24456v;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CustomViewSavedState customViewSavedState = (CustomViewSavedState) parcelable;
        super.onRestoreInstanceState(customViewSavedState.getSuperState());
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).restoreHierarchyState(customViewSavedState.f24633a);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        CustomViewSavedState customViewSavedState = new CustomViewSavedState(super.onSaveInstanceState());
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            getChildAt(i7).saveHierarchyState(customViewSavedState.f24633a);
        }
        return customViewSavedState;
    }

    public void setBottomText(CharSequence charSequence) {
        this.f24440c = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f24459w0) {
                this.f24449p.setVisibility(4);
            }
            e.K(this.f24446j, false);
        } else {
            if (this.f24459w0) {
                this.f24449p.setVisibility(0);
            }
            this.f24446j.setText(charSequence);
            e.K(this.f24446j, true);
        }
    }

    public void setBottomTextColor(@ColorInt int i7) {
        if (i7 == 0) {
            return;
        }
        this.f24446j.setTextColor(i7);
    }

    public void setCountryCodeText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24448o.setVisibility(0);
        this.f24448o.setText(str);
    }

    public void setEditContent(String str) {
        this.f24431A.setText(str, TextView.BufferType.EDITABLE);
    }

    public void setEditInputType(int i7) {
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            this.f24431A.setInputType(2);
        } else if (i7 == 5) {
            this.f24431A.setInputType(18);
        } else {
            this.f24431A.setInputType(524289);
        }
    }

    public void setEditMaxLen(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f24437Q == 3) {
            i7 += 2;
        }
        this.f24431A.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
    }

    public void setEditTextWatcher(TextWatcher textWatcher) {
        this.f24451q0 = textWatcher;
    }

    public void setHintText(CharSequence charSequence) {
        this.f24432B.setText(charSequence);
        this.f24432B.setVisibility(TextUtils.isEmpty(getEditContent()) ? 0 : 4);
    }

    public void setInputFilters(InputFilter[] inputFilterArr) {
        AppCompatEditText appCompatEditText = this.f24431A;
        if (appCompatEditText != null) {
            appCompatEditText.setFilters(inputFilterArr);
        }
    }

    public void setLayoutBackgroundColor(@ColorInt int i7) {
        setBackgroundColor(i7);
    }

    public void setLeftIcon(int i7) {
        if (i7 != 0) {
            this.t.setVisibility(0);
            this.t.setImageResource(i7);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f24450p0 = onFocusChangeListener;
    }

    public void setRightIcon(@DrawableRes int i7) {
        if (i7 != 0) {
            this.f24456v.setVisibility(0);
            this.f24456v.setImageResource(i7);
            e.H(this.f24432B);
        }
    }

    public void setRightIconClickListener(View.OnClickListener onClickListener) {
        this.f24452r0 = onClickListener;
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f24444g.setVisibility(8);
            e.F(this.f24432B, Integer.valueOf(e(getContext(), 16.0f)), null);
        } else {
            this.f24444g.setText(charSequence);
            this.f24444g.setVisibility(0);
            e.F(this.f24432B, Integer.valueOf(e(getContext(), 41.0f)), null);
        }
    }

    public PpPhoneEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PpPhoneEditText(Context context, AttributeSet attributeSet, int i7) {
        ColorStateList colorStateList;
        int color;
        super(context, attributeSet, i7);
        this.f24433C = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.PpFormStyle, i7, 0);
        this.f24438a = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_label_text);
        this.f24439b = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_hide_text);
        this.f24440c = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_bottom_text);
        this.f24441d = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_country_code_text);
        boolean z3 = true;
        this.f24461y0 = typedArrayObtainStyledAttributes.getInt(j.PpFormStyle_form_style, 1);
        if (!typedArrayObtainStyledAttributes.hasValue(j.PpFormStyle_android_background)) {
            int i10 = j.PpFormStyle_form_layout_background;
            if (this.f24461y0 == 2) {
                color = context.getColor(b.ppColorBackgroundDark);
            } else {
                color = context.getColor(b.ppColorBackgroundLight);
            }
            this.f24433C = typedArrayObtainStyledAttributes.getColor(i10, color);
        }
        this.f24434H = typedArrayObtainStyledAttributes.getResourceId(j.PpFormStyle_form_icon_edit_left, 0);
        this.f24435L = typedArrayObtainStyledAttributes.getResourceId(j.PpFormStyle_form_icon_edit_right, 0);
        this.f24436M = typedArrayObtainStyledAttributes.getInt(j.PpFormStyle_form_edit_max_length, 0);
        this.f24437Q = 3;
        this.f24462z0 = typedArrayObtainStyledAttributes.getInt(j.PpFormStyle_form_icon_style, 1);
        this.f24455u0 = typedArrayObtainStyledAttributes.getBoolean(j.PpFormStyle_form_edit_enable, true);
        this.f24459w0 = typedArrayObtainStyledAttributes.getBoolean(j.PpFormStyle_form_hide_bottom_line, this.f24461y0 == 2);
        this.f24460x0 = typedArrayObtainStyledAttributes.getBoolean(j.PpFormStyle_form_hide_arrow_icon, false);
        if (typedArrayObtainStyledAttributes.hasValue(j.PpFormStyle_android_textColor) && (colorStateList = typedArrayObtainStyledAttributes.getColorStateList(j.PpFormStyle_android_textColor)) != null) {
            this.f24442e = colorStateList;
        }
        this.f24443f = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.PpFormStyle_android_textSize, context.getResources().getDimensionPixelSize(c.ppEditTextSize_16));
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.lib_ui_layout_form_phone_edit, this);
        this.f24444g = (TextView) findViewById(f.tv_label);
        this.f24445i = (ImageView) findViewById(f.iv_arrow_down);
        this.f24449p = findViewById(f.iv_line);
        this.t = (ImageView) findViewById(f.iv_start_icon);
        this.f24456v = (ImageView) findViewById(f.iv_end_icon);
        this.f24458w = (ImageView) findViewById(f.iv_clear);
        this.f24431A = (AppCompatEditText) findViewById(f.et_input);
        this.f24446j = (TextView) findViewById(f.tv_bottom_message);
        this.f24448o = (TextView) findViewById(f.tv_country_code);
        this.f24432B = (AppCompatTextView) findViewById(f.tv_hint);
        setTitle(this.f24438a);
        int i11 = this.f24433C;
        if (i11 != 0) {
            setLayoutBackgroundColor(i11);
        }
        setLeftIcon(this.f24434H);
        setRightIcon(this.f24435L);
        setEditInputType(this.f24437Q);
        setHintText(this.f24439b);
        setBottomText(this.f24440c);
        setCountryCodeText(this.f24441d);
        setEditMaxLen(this.f24436M);
        setLineColor(getLineColor());
        this.f24431A.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 6));
        this.f24431A.addTextChangedListener(new R3.e(this, 4));
        final int i12 = 0;
        this.f24458w.setOnClickListener(new View.OnClickListener(this) { // from class: T6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PpPhoneEditText f9032b;

            {
                this.f9032b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        PpPhoneEditText.d(this.f9032b);
                        break;
                    default:
                        View.OnClickListener onClickListener = this.f9032b.f24452r0;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f24456v.setOnClickListener(new View.OnClickListener(this) { // from class: T6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PpPhoneEditText f9032b;

            {
                this.f9032b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        PpPhoneEditText.d(this.f9032b);
                        break;
                    default:
                        View.OnClickListener onClickListener = this.f9032b.f24452r0;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        break;
                }
            }
        });
        if (!this.f24455u0) {
            int color2 = getContext().getColor(b.ppColorTextNormal);
            this.f24431A.setTextColor(color2);
            this.f24448o.setTextColor(color2);
            this.f24444g.setTextColor(color2);
            this.f24432B.setTextColor(color2);
        }
        this.f24431A.setEnabled(this.f24455u0);
        this.f24431A.setTextSize(0, this.f24443f);
        ColorStateList colorStateList2 = this.f24442e;
        if (colorStateList2 != null) {
            this.f24431A.setTextColor(colorStateList2);
        }
        if (this.f24459w0) {
            this.f24459w0 = true;
            View view = this.f24449p;
            if (view != null) {
                view.setVisibility(4);
            }
        }
        if (this.f24445i != null) {
            this.f24445i.setVisibility(this.f24460x0 || (this.t.getVisibility() != 0 && this.f24448o.getVisibility() != 0) ? 8 : 0);
        }
        if (this.f24462z0 == 2) {
            this.t.getLayoutParams().width = e(getContext(), 32.0f);
            this.t.getLayoutParams().height = e(getContext(), 32.0f);
        }
        if (this.f24448o.getVisibility() == 0) {
            this.f24448o.setPadding(this.t.getVisibility() == 0 ? e(getContext(), 8.0f) : 0, 0, 0, 0);
        }
        if (this.f24448o.getVisibility() != 0 && this.t.getVisibility() != 0) {
            z3 = false;
        }
        e.F(this.f24432B, null, Integer.valueOf(z3 ? e(getContext(), 8.0f) : 0));
    }

    public void setRightIcon(Drawable drawable) {
        this.f24456v.setVisibility(0);
        this.f24456v.setImageDrawable(drawable);
        e.H(this.f24432B);
    }

    public void setRightIcon(IIcon iIcon) {
        this.f24456v.setVisibility(0);
        this.f24456v.setImageDrawable(a.h(getContext(), iIcon, null, getContext().getColor(b.ppColorTextAssist), 24.0f));
        e.H(this.f24432B);
    }
}
