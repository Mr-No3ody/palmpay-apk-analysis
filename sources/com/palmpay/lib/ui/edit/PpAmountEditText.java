package com.palmpay.lib.ui.edit;

import Ed.ViewOnFocusChangeListenerC0235o;
import L6.b;
import L6.c;
import L6.f;
import L6.g;
import L6.h;
import L6.j;
import N8.C0457a;
import Nc.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.mikepenz.iconics.view.IconicsImageView;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public class PpAmountEditText extends ConstraintLayout {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f24355q0 = b.ppColorTextPrimary;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f24356r0 = b.ppColorDividerLine;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f24357A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f24358B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f24359C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f24360H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CharSequence f24361L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final CharSequence f24362M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public OnTextInputListener f24363Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AmountEditText f24366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f24367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f24368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f24369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f24370g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f24371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IconicsImageView f24372j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public OnErrorVisibilityChangeListener f24373k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f24374o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f24375p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View.OnFocusChangeListener f24376p0;
    public final TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Group f24377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f24378w;

    public interface OnErrorVisibilityChangeListener {
        void onErrorVisibilityChanged(boolean z3);
    }

    public interface OnTextInputListener {
        void OnTextInput(String str);
    }

    public PpAmountEditText(Context context) {
        this(context, null);
    }

    public final void c(boolean z3) {
        OnErrorVisibilityChangeListener onErrorVisibilityChangeListener;
        if (this.f24357A) {
            boolean z8 = (this.f24368e.getVisibility() == 0) != z3;
            this.f24368e.setVisibility(z3 ? 0 : 8);
            if (!z8 || (onErrorVisibilityChangeListener = this.f24373k0) == null) {
                return;
            }
            onErrorVisibilityChangeListener.onErrorVisibilityChanged(z3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        AmountEditText amountEditText = this.f24366c;
        if (amountEditText != null) {
            amountEditText.clearFocus();
        }
        ImageView imageView = this.f24374o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void d(boolean z3) {
        this.f24359C = z3;
        IconicsImageView iconicsImageView = this.f24372j;
        if (iconicsImageView != null) {
            iconicsImageView.setVisibility(z3 ? 0 : 8);
        }
        e(false);
    }

    public final void e(boolean z3) {
        if (this.f24359C || !z3) {
            this.f24374o.setVisibility(8);
        } else if (TextUtils.isEmpty(getAmountString())) {
            this.f24374o.setVisibility(8);
        } else {
            this.f24374o.setVisibility(0);
        }
    }

    public final void f(boolean z3) {
        int i7 = f24356r0;
        int i10 = this.f24364a;
        if (z3) {
            e(true);
            if (this.f24359C) {
                this.f24370g.setTextColor(this.f24365b);
                this.f24375p.setBackgroundColor(getResources().getColor(i7));
            } else {
                this.f24370g.setTextColor(i10);
                this.f24375p.setBackgroundColor(getResources().getColor(f24355q0));
            }
        } else {
            this.f24374o.setVisibility(8);
            this.f24370g.setTextColor(i10);
            this.f24375p.setBackgroundColor(getResources().getColor(i7));
        }
        this.f24367d.setVisibility(TextUtils.isEmpty(this.f24366c.getAmountString()) ? 0 : 8);
    }

    public String getAmountString() {
        AmountEditText amountEditText = this.f24366c;
        return amountEditText != null ? amountEditText.getAmountString() : "";
    }

    public double getDoubleAmount() {
        AmountEditText amountEditText = this.f24366c;
        if (amountEditText != null) {
            return amountEditText.getDoubleAmount();
        }
        return 0.0d;
    }

    public long getLongAmount() {
        String amountString = getAmountString();
        if (TextUtils.isEmpty(amountString)) {
            return 0L;
        }
        try {
            return new BigDecimal(amountString).multiply(new BigDecimal(100)).longValue();
        } catch (Exception e10) {
            Log.e("PpAmountEditText", "getLongAmount: ", e10);
            return 0L;
        }
    }

    public void setActionButtonListener(View.OnClickListener onClickListener) {
        TextView textView = this.f24371i;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setAmount(String str) {
        AmountEditText amountEditText = this.f24366c;
        if (amountEditText != null) {
            amountEditText.setText(str);
        }
    }

    public void setButtonText(CharSequence charSequence) {
        TextView textView = this.f24371i;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setCurrencySymbol(String str) {
        TextView textView;
        if (TextUtils.isEmpty(str) || (textView = this.f24369f) == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        this.f24358B = z3;
        this.f24366c.setEnabled(z3);
        if (z3) {
            this.f24366c.setFocusable(true);
            this.f24366c.setFocusableInTouchMode(true);
            this.f24366c.setTextColor(getContext().getColor(b.ppColorTextPrimary));
        } else {
            this.f24366c.setFocusable(false);
            this.f24366c.setFocusableInTouchMode(false);
            this.f24366c.setTextColor(getContext().getColor(b.ppColorTextNormal));
        }
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (this.f24357A) {
            if (TextUtils.isEmpty(charSequence)) {
                c(false);
                this.f24375p.setBackgroundColor(getResources().getColor(f24356r0));
            } else {
                c(true);
                this.f24368e.setText(charSequence);
                this.f24375p.setBackgroundColor(getResources().getColor(b.ppColorError));
            }
        }
    }

    public void setHintText(CharSequence charSequence) {
        this.f24361L = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f24367d.setText(this.f24361L);
    }

    public void setOnErrorVisibilityChangeListener(@Nullable OnErrorVisibilityChangeListener onErrorVisibilityChangeListener) {
        this.f24373k0 = onErrorVisibilityChangeListener;
        if (onErrorVisibilityChangeListener != null) {
            onErrorVisibilityChangeListener.onErrorVisibilityChanged(this.f24368e.getVisibility() == 0);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f24376p0 = onFocusChangeListener;
    }

    public void setTextInputListener(OnTextInputListener onTextInputListener) {
        this.f24363Q = onTextInputListener;
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f24370g;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public PpAmountEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PpAmountEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.ppAmountEditText, i7, 0);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(j.ppAmountEditText_am_edit_show_error_text, true);
        this.f24357A = z3;
        this.f24358B = typedArrayObtainStyledAttributes.getBoolean(j.ppAmountEditText_am_edit_enable, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(j.ppAmountEditText_am_edit_show_title, true);
        this.f24360H = typedArrayObtainStyledAttributes.getBoolean(j.ppAmountEditText_am_edit_show_amount_tip, false);
        this.f24359C = typedArrayObtainStyledAttributes.getBoolean(j.ppAmountEditText_am_edit_show_lock, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(j.ppAmountEditText_am_edit_show_currency, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppAmountEditText_am_edit_text_size, context.getResources().getDimensionPixelSize(c.ppAmountEditTextSize));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppAmountEditText_am_edit_hint_text_size, context.getResources().getDimensionPixelSize(c.ppAmountEditTextSize));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppAmountEditText_am_edit_error_text_size, context.getResources().getDimensionPixelSize(c.ppAmountEditErrorTextSize));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.ppAmountEditText_am_edit_vertical_margin, context.getResources().getDimensionPixelSize(c.ppAmountEditVerticalMargin));
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(j.ppAmountEditText_am_edit_show_button, true);
        this.f24364a = typedArrayObtainStyledAttributes.getColor(j.ppAmountEditText_am_edit_title_normal_color, context.getColor(b.ppColorTextPrimary));
        this.f24365b = typedArrayObtainStyledAttributes.getColor(j.ppAmountEditText_am_edit_title_focus_color, context.getColor(b.ppColorTextPrimary));
        this.f24361L = typedArrayObtainStyledAttributes.getText(j.ppAmountEditText_am_edit_hint);
        CharSequence text = typedArrayObtainStyledAttributes.getText(j.ppAmountEditText_am_edit_title);
        this.f24362M = text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(j.ppAmountEditText_am_edit_btn_text);
        this.f24378w = text2;
        if (TextUtils.isEmpty(text2)) {
            this.f24378w = context.getResources().getString(h.lib_ui_pay);
        }
        if (TextUtils.isEmpty(text)) {
            this.f24362M = context.getResources().getString(h.lib_ui_amount);
        }
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.lib_ui_layout_amount_edit_text, this);
        this.f24366c = (AmountEditText) findViewById(f.edit_amount);
        this.f24367d = (TextView) findViewById(f.tv_hint);
        this.f24368e = (TextView) findViewById(f.tv_error);
        this.f24369f = (TextView) findViewById(f.tv_symbol);
        this.f24372j = (IconicsImageView) findViewById(f.iv_lock);
        this.f24374o = (ImageView) findViewById(f.iv_close);
        this.f24370g = (TextView) findViewById(f.tv_title);
        this.f24375p = findViewById(f.view_divider);
        this.f24371i = (TextView) findViewById(f.tv_action);
        this.t = (TextView) findViewById(f.amount_tip);
        this.f24377v = (Group) findViewById(f.group_tip);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f24375p.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize4;
        this.f24375p.setLayoutParams(layoutParams);
        if (!z8) {
            this.f24370g.setVisibility(8);
        } else {
            setTitle(this.f24362M);
        }
        if (z11) {
            this.f24371i.setVisibility(0);
        } else {
            this.f24371i.setVisibility(8);
        }
        if (!z3) {
            this.f24368e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f24361L)) {
            this.f24367d.setText(this.f24361L);
        }
        this.f24372j.setVisibility(this.f24359C ? 0 : 8);
        this.f24369f.setVisibility(z10 ? 0 : 8);
        setEnabled(this.f24358B);
        this.f24366c.setTextSize(0, dimensionPixelSize);
        this.f24367d.setTextSize(0, dimensionPixelSize2);
        this.f24368e.setTextSize(0, dimensionPixelSize3);
        this.f24366c.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 3));
        this.f24366c.setOnTextInputListener(new C0457a(this, 11));
        setButtonText(this.f24378w);
        this.f24374o.setOnClickListener(new x(this, 15));
        f(this.f24366c.isFocused());
    }
}
