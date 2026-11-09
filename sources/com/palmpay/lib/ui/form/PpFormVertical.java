package com.palmpay.lib.ui.form;

import Ed.ViewOnFocusChangeListenerC0235o;
import L6.b;
import L6.f;
import L6.g;
import L6.j;
import R3.e;
import T6.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.measurement.a;
import com.palmpay.lib.ui.form.PpFormVertical;
import com.palmpay.lib.ui.util.CustomViewSavedState;

/* JADX INFO: loaded from: classes3.dex */
public class PpFormVertical extends ConstraintLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ImageView f24400A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AppCompatEditText f24401B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final AppCompatTextView f24402C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f24403H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f24404L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f24405M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f24406Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f24410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f24411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ColorStateList f24412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f24413g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Typeface f24414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f24415j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f24416k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TextView f24417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f24418p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f24419p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnFocusChangeListener f24420q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextWatcher f24421r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public View.OnClickListener f24422s0;
    public final View t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f24423t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f24424u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f24425v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final boolean f24426v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f24427w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f24428w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f24429x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f24430y0;

    public PpFormVertical(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(PpFormVertical ppFormVertical, View view, boolean z3) {
        Resources resources;
        int i7;
        AutofillManager autofillManagerE;
        View.OnFocusChangeListener onFocusChangeListener = ppFormVertical.f24420q0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z3);
        }
        ppFormVertical.f24419p0 = z3;
        if (ppFormVertical.f24430y0 && z3 && Build.VERSION.SDK_INT >= 26 && (autofillManagerE = a.e(ppFormVertical.getContext().getSystemService(a.f()))) != null) {
            autofillManagerE.cancel();
        }
        if (ppFormVertical.f24428w0) {
            ppFormVertical.setLineColor(ppFormVertical.getResources().getColor(b.ppColorError));
        } else {
            if (z3 && ppFormVertical.f24426v0) {
                resources = ppFormVertical.getResources();
                i7 = b.ppColorTextPrimary;
            } else {
                resources = ppFormVertical.getResources();
                i7 = b.ppColorDividerLine;
            }
            ppFormVertical.setLineColor(resources.getColor(i7));
        }
        if (!z3) {
            ppFormVertical.f24400A.setVisibility(8);
            ppFormVertical.setRightIcon(ppFormVertical.f24405M);
            if (TextUtils.isEmpty(ppFormVertical.f24423t0)) {
                return;
            }
            ppFormVertical.f24424u0 = true;
            ppFormVertical.f24400A.setVisibility(8);
            ppFormVertical.f24427w.setVisibility(0);
            return;
        }
        if (ppFormVertical.f24424u0) {
            ppFormVertical.f24424u0 = false;
        }
        if (TextUtils.isEmpty(ppFormVertical.f24423t0) || !ppFormVertical.f24426v0) {
            return;
        }
        ppFormVertical.f24400A.setVisibility(0);
        if (ppFormVertical.f24416k0 != 5) {
            ppFormVertical.f24427w.setVisibility(8);
        }
    }

    public static int g(Context context, float f10) {
        if (context == null) {
            return 0;
        }
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void setLineColor(@ColorInt int i7) {
        if (i7 == 0) {
            return;
        }
        this.t.setBackgroundColor(i7);
    }

    public final void d() {
        Resources resources;
        int i7;
        this.f24428w0 = false;
        this.f24417o.setTextColor(getResources().getColor(b.ppColorTextAssist));
        if (this.f24419p0) {
            resources = getResources();
            i7 = b.ppColorTextPrimary;
        } else {
            resources = getResources();
            i7 = b.ppColorDividerLine;
        }
        setLineColor(resources.getColor(i7));
        if (TextUtils.isEmpty(this.f24410d)) {
            this.f24417o.setVisibility(8);
        } else {
            this.f24417o.setText(this.f24410d);
        }
        if (this.f24429x0) {
            this.t.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.f24430y0 = true;
        setImportantForAutofill(8);
        AppCompatEditText appCompatEditText = this.f24401B;
        if (appCompatEditText != null) {
            appCompatEditText.setImportantForAutofill(2);
            this.f24401B.setAutofillHints(new String[0]);
        }
    }

    public final void f() {
        AppCompatEditText appCompatEditText = this.f24401B;
        if (appCompatEditText == null) {
            return;
        }
        appCompatEditText.setFocusableInTouchMode(false);
        this.f24401B.setLongClickable(false);
        this.f24401B.setTextIsSelectable(false);
        c cVar = new c(0);
        this.f24401B.setCustomSelectionActionModeCallback(cVar);
        this.f24401B.setCustomInsertionActionModeCallback(cVar);
    }

    public TextView getCountryCodeTextView() {
        return this.f24418p;
    }

    public String getEditContent() {
        return this.f24401B.getText().toString().trim();
    }

    public AppCompatEditText getEditText() {
        return this.f24401B;
    }

    public TextView getHintTextView() {
        return this.f24402C;
    }

    public TextView getLabelTextView() {
        return this.f24415j;
    }

    public ImageView getLeftImg() {
        return this.f24425v;
    }

    public String getMobileNumber() {
        String editContent = getEditContent();
        return !TextUtils.isEmpty(editContent) ? editContent.replace(" ", "") : editContent;
    }

    public ImageView getRightImg() {
        return this.f24427w;
    }

    public final void h(String str) {
        this.f24428w0 = true;
        this.f24417o.setTextColor(getResources().getColor(b.ppColorError));
        setLineColor(getResources().getColor(b.ppColorError));
        this.f24417o.setText(str);
        this.f24417o.setVisibility(0);
        if (this.f24429x0) {
            this.t.setVisibility(0);
        }
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
        this.f24410d = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f24429x0) {
                this.t.setVisibility(8);
            }
            this.f24417o.setVisibility(8);
        } else {
            if (this.f24429x0) {
                this.t.setVisibility(0);
            }
            this.f24417o.setText(charSequence);
            this.f24417o.setVisibility(0);
        }
    }

    public void setBottomTextColor(@ColorInt int i7) {
        if (i7 == 0) {
            return;
        }
        this.f24417o.setTextColor(i7);
    }

    public void setCountryCodeText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f24418p.setVisibility(0);
        this.f24418p.setText(str);
    }

    public void setEditContent(String str) {
        this.f24401B.setText(str, TextView.BufferType.EDITABLE);
    }

    public void setEditInputType(int i7) {
        if (i7 == 2 || i7 == 3 || i7 == 4) {
            this.f24401B.setInputType(2);
        } else if (i7 == 5) {
            this.f24401B.setInputType(18);
        } else {
            this.f24401B.setInputType(524289);
        }
    }

    public void setEditMaxLen(int i7) {
        if (i7 == 0) {
            return;
        }
        if (this.f24416k0 == 3) {
            i7 += 2;
        }
        this.f24401B.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
    }

    public void setEditTextWatcher(TextWatcher textWatcher) {
        this.f24421r0 = textWatcher;
    }

    public void setHintText(CharSequence charSequence) {
        this.f24402C.setText(charSequence);
        this.f24402C.setVisibility(TextUtils.isEmpty(getEditContent()) ? 0 : 8);
    }

    public void setInputFilters(InputFilter[] inputFilterArr) {
        AppCompatEditText appCompatEditText = this.f24401B;
        if (appCompatEditText != null) {
            appCompatEditText.setFilters(inputFilterArr);
        }
    }

    public void setLayoutBackgroundColor(@ColorInt int i7) {
        setBackgroundColor(i7);
    }

    public void setLeftIcon(int i7) {
        if (i7 != 0) {
            this.f24425v.setVisibility(0);
            this.f24425v.setImageResource(i7);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f24420q0 = onFocusChangeListener;
    }

    public void setRightIcon(int i7) {
        if (i7 != 0) {
            this.f24427w.setVisibility(0);
            this.f24427w.setImageResource(i7);
        }
    }

    public void setRightIconClickListener(View.OnClickListener onClickListener) {
        this.f24422s0 = onClickListener;
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.f24415j.setText(charSequence);
        this.f24415j.setVisibility(0);
    }

    public PpFormVertical(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00b8 A[Catch: Exception -> 0x00bc, TRY_LEAVE, TryCatch #1 {Exception -> 0x00bc, blocks: (B:17:0x00b0, B:19:0x00b8), top: B:45:0x00b0 }] */
    public PpFormVertical(Context context, AttributeSet attributeSet, int i7) {
        String string;
        ColorStateList colorStateList;
        super(context, attributeSet, i7);
        this.f24403H = 0;
        this.f24407a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.PpFormStyle, i7, 0);
        this.f24408b = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_label_text);
        this.f24409c = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_hide_text);
        this.f24410d = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_bottom_text);
        this.f24411e = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_form_country_code_text);
        if (!typedArrayObtainStyledAttributes.hasValue(j.PpFormStyle_android_background)) {
            this.f24403H = typedArrayObtainStyledAttributes.getColor(j.PpFormStyle_form_layout_background, context.getColor(b.ppColorBackgroundLight));
        }
        this.f24404L = typedArrayObtainStyledAttributes.getResourceId(j.PpFormStyle_form_icon_edit_left, 0);
        this.f24405M = typedArrayObtainStyledAttributes.getResourceId(j.PpFormStyle_form_icon_edit_right, 0);
        this.f24406Q = typedArrayObtainStyledAttributes.getInt(j.PpFormStyle_form_edit_max_length, 0);
        this.f24416k0 = typedArrayObtainStyledAttributes.getInt(j.PpFormStyle_form_edit_input_type, 1);
        this.f24426v0 = typedArrayObtainStyledAttributes.getBoolean(j.PpFormStyle_form_edit_enable, true);
        this.f24429x0 = typedArrayObtainStyledAttributes.getBoolean(j.PpFormStyle_form_hide_bottom_line, false);
        if (typedArrayObtainStyledAttributes.hasValue(j.PpFormStyle_android_textColor) && (colorStateList = typedArrayObtainStyledAttributes.getColorStateList(j.PpFormStyle_android_textColor)) != null) {
            this.f24412f = colorStateList;
        }
        this.f24413g = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.PpFormStyle_android_textSize, context.getResources().getDimensionPixelSize(L6.c.ppEditTextSize_16));
        Typeface typefaceCreate = null;
        if (typedArrayObtainStyledAttributes.hasValue(j.PpFormStyle_android_fontFamily)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(j.PpFormStyle_android_fontFamily, 0);
            if (resourceId != 0) {
                try {
                    typefaceCreate = Y.j.a(resourceId, context);
                } catch (Exception unused) {
                    try {
                        string = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_android_fontFamily);
                        if (string != null) {
                            typefaceCreate = Typeface.create(string, 0);
                        }
                    } catch (Exception unused2) {
                    }
                }
            } else {
                string = typedArrayObtainStyledAttributes.getString(j.PpFormStyle_android_fontFamily);
                if (string != null) {
                    typefaceCreate = Typeface.create(string, 0);
                }
            }
        }
        this.f24414i = typefaceCreate;
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(context, g.lib_ui_layout_form_vertical, this);
        this.f24415j = (TextView) findViewById(f.tv_label);
        this.t = findViewById(f.iv_line);
        this.f24425v = (ImageView) findViewById(f.iv_start_icon);
        this.f24427w = (ImageView) findViewById(f.iv_end_icon);
        this.f24400A = (ImageView) findViewById(f.iv_clear);
        this.f24401B = (AppCompatEditText) findViewById(f.et_input);
        this.f24417o = (TextView) findViewById(f.tv_bottom_message);
        this.f24418p = (TextView) findViewById(f.tv_country_code);
        this.f24402C = (AppCompatTextView) findViewById(f.tv_hint);
        if (TextUtils.isEmpty(this.f24408b)) {
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.t.getLayoutParams())).topMargin = g(this.f24407a, 17.0f);
        }
        setTitle(this.f24408b);
        int i10 = this.f24403H;
        if (i10 != 0) {
            setLayoutBackgroundColor(i10);
        }
        setLeftIcon(this.f24404L);
        setRightIcon(this.f24405M);
        setEditInputType(this.f24416k0);
        setHintText(this.f24409c);
        setBottomText(this.f24410d);
        setCountryCodeText(this.f24411e);
        setEditMaxLen(this.f24406Q);
        this.f24401B.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 5));
        this.f24401B.addTextChangedListener(new e(this, 3));
        final int i11 = 0;
        this.f24400A.setOnClickListener(new View.OnClickListener(this) { // from class: T6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PpFormVertical f9029b;

            {
                this.f9029b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        PpFormVertical ppFormVertical = this.f9029b;
                        ppFormVertical.f24401B.getText().clear();
                        ppFormVertical.d();
                        break;
                    default:
                        View.OnClickListener onClickListener = this.f9029b.f24422s0;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        this.f24427w.setOnClickListener(new View.OnClickListener(this) { // from class: T6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PpFormVertical f9029b;

            {
                this.f9029b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        PpFormVertical ppFormVertical = this.f9029b;
                        ppFormVertical.f24401B.getText().clear();
                        ppFormVertical.d();
                        break;
                    default:
                        View.OnClickListener onClickListener = this.f9029b.f24422s0;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        break;
                }
            }
        });
        if (!this.f24426v0) {
            int color = getContext().getColor(b.ppColorTextNormal);
            this.f24401B.setTextColor(color);
            this.f24418p.setTextColor(color);
            this.f24415j.setTextColor(color);
        }
        this.f24401B.setEnabled(this.f24426v0);
        this.f24401B.setTextSize(0, this.f24413g);
        ColorStateList colorStateList2 = this.f24412f;
        if (colorStateList2 != null) {
            this.f24401B.setTextColor(colorStateList2);
        }
        Typeface typeface = this.f24414i;
        if (typeface != null) {
            this.f24401B.setTypeface(typeface);
        }
        if (this.f24429x0) {
            this.f24429x0 = true;
            View view = this.t;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }
}
