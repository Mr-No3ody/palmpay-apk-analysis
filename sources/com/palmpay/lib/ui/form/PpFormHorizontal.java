package com.palmpay.lib.ui.form;

import Ed.ViewOnFocusChangeListenerC0235o;
import L6.b;
import L6.f;
import L6.g;
import L6.j;
import R3.e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.form.PpFormHorizontal;

/* JADX INFO: loaded from: classes3.dex */
public class PpFormHorizontal extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f24379A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f24380B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public View.OnFocusChangeListener f24381C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextWatcher f24382H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public View.OnClickListener f24383L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f24384M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f24385Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f24389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f24390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f24391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f24392g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f24393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f24394j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f24395k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ImageView f24396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AppCompatEditText f24397p;
    public final int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f24398v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f24399w;

    public PpFormHorizontal(Context context) {
        this(context, null);
    }

    public static void c(PpFormHorizontal ppFormHorizontal) {
        Resources resources;
        int i7;
        ppFormHorizontal.f24397p.getText().clear();
        if (ppFormHorizontal.f24380B) {
            resources = ppFormHorizontal.getResources();
            i7 = b.ppColorTextPrimary;
        } else {
            resources = ppFormHorizontal.getResources();
            i7 = b.ppColorDividerLine;
        }
        ppFormHorizontal.setLineColor(resources.getColor(i7));
        ppFormHorizontal.f24390e.setVisibility(8);
    }

    public static /* synthetic */ void d(PpFormHorizontal ppFormHorizontal, View view, boolean z3) {
        Resources resources;
        int i7;
        View.OnFocusChangeListener onFocusChangeListener = ppFormHorizontal.f24381C;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z3);
        }
        ppFormHorizontal.f24380B = z3;
        if (z3 && ppFormHorizontal.f24395k0) {
            resources = ppFormHorizontal.getResources();
            i7 = b.ppColorTextPrimary;
        } else {
            resources = ppFormHorizontal.getResources();
            i7 = b.ppColorDividerLine;
        }
        ppFormHorizontal.setLineColor(resources.getColor(i7));
        if (z3) {
            if (ppFormHorizontal.f24385Q) {
                ppFormHorizontal.f24385Q = false;
            }
            if (TextUtils.isEmpty(ppFormHorizontal.f24384M) || !ppFormHorizontal.f24395k0) {
                return;
            }
            ppFormHorizontal.f24396o.setVisibility(0);
            ppFormHorizontal.f24394j.setVisibility(8);
            return;
        }
        ppFormHorizontal.f24396o.setVisibility(8);
        ppFormHorizontal.setRightIcon(ppFormHorizontal.f24398v);
        if (TextUtils.isEmpty(ppFormHorizontal.f24384M)) {
            return;
        }
        ppFormHorizontal.f24385Q = true;
        ppFormHorizontal.f24396o.setVisibility(8);
        ppFormHorizontal.f24394j.setVisibility(0);
    }

    private void setLineColor(@ColorInt int i7) {
        if (i7 == 0) {
            return;
        }
        this.f24393i.setBackgroundColor(i7);
    }

    public String getEditContent() {
        return this.f24397p.getText().toString().trim();
    }

    public void setBottomTextColor(@ColorInt int i7) {
        if (i7 == 0) {
            return;
        }
        this.f24390e.setTextColor(i7);
    }

    public void setCountryCodeText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24391f.setVisibility(0);
        this.f24391f.setText(str);
    }

    public void setEditContent(String str) {
        this.f24397p.setText(str, TextView.BufferType.EDITABLE);
    }

    public void setEditInputType(int i7) {
        this.f24397p.setInputType(i7);
    }

    public void setEditMaxLen(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f24379A == 3) {
            i7 += 2;
        }
        this.f24397p.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
    }

    public void setEditTextWatcher(TextWatcher textWatcher) {
        this.f24382H = textWatcher;
    }

    public void setHintText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new TypefaceSpan("sans-serif"), 0, str.length(), 33);
        this.f24397p.setHint(spannableString);
    }

    public void setLayoutBackgroundColor(@ColorInt int i7) {
        this.f24392g.setBackgroundColor(i7);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f24381C = onFocusChangeListener;
    }

    public void setRightIcon(int i7) {
        if (i7 != 0) {
            this.f24394j.setVisibility(0);
            this.f24394j.setImageResource(i7);
        }
    }

    public void setRightIconClickListener(View.OnClickListener onClickListener) {
        this.f24383L = onClickListener;
    }

    public void setTitle(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24389d.setText(str);
        this.f24389d.setVisibility(0);
    }

    public PpFormHorizontal(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PpFormHorizontal(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.PpFormStyle, i7, 0);
        this.f24386a = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_label_text);
        this.f24387b = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_hide_text);
        typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_bottom_text);
        this.f24388c = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_country_code_text);
        this.t = typedArrayObtainStyledAttributes.getColor(j.PpFormStyle_form_layout_background, context.getColor(b.ppColorBackgroundLight));
        this.f24398v = typedArrayObtainStyledAttributes.getResourceId(j.PpFormStyle_form_icon_edit_right, 0);
        this.f24399w = typedArrayObtainStyledAttributes.getInt(j.PpFormStyle_form_edit_max_length, 0);
        this.f24379A = typedArrayObtainStyledAttributes.getInt(j.PpFormStyle_form_edit_input_type, 1);
        this.f24395k0 = typedArrayObtainStyledAttributes.getBoolean(j.PpFormStyle_form_edit_enable, true);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.lib_ui_layout_form_horizontal, this);
        this.f24392g = (ConstraintLayout) findViewById(f.root_view);
        this.f24389d = (TextView) findViewById(f.tv_label);
        this.f24392g = (ConstraintLayout) findViewById(f.root_view);
        this.f24393i = findViewById(f.iv_line);
        this.f24394j = (ImageView) findViewById(f.iv_end_icon);
        this.f24396o = (ImageView) findViewById(f.iv_clear);
        this.f24397p = (AppCompatEditText) findViewById(f.et_input);
        this.f24390e = (TextView) findViewById(f.tv_error_message);
        this.f24391f = (TextView) findViewById(f.tv_country_code);
        this.f24397p.setEnabled(this.f24395k0);
        setTitle(this.f24386a);
        setLayoutBackgroundColor(this.t);
        setRightIcon(this.f24398v);
        setHintText(this.f24387b);
        setEditInputType(this.f24379A);
        setCountryCodeText(this.f24388c);
        setEditMaxLen(this.f24399w);
        this.f24397p.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 4));
        this.f24397p.addTextChangedListener(new e(this, 2));
        final int i10 = 0;
        this.f24396o.setOnClickListener(new View.OnClickListener(this) { // from class: T6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PpFormHorizontal f9027b;

            {
                this.f9027b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        PpFormHorizontal.c(this.f9027b);
                        break;
                    default:
                        this.f9027b.f24383L.onClick(view);
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f24394j.setOnClickListener(new View.OnClickListener(this) { // from class: T6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PpFormHorizontal f9027b;

            {
                this.f9027b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        PpFormHorizontal.c(this.f9027b);
                        break;
                    default:
                        this.f9027b.f24383L.onClick(view);
                        break;
                }
            }
        });
        if (!this.f24395k0) {
            int color = getResources().getColor(b.ppColorTextNormal);
            this.f24397p.setTextColor(color);
            this.f24391f.setTextColor(color);
            this.f24389d.setTextColor(color);
        }
        this.f24397p.setEnabled(this.f24395k0);
    }
}
