package com.transsnet.palmpay.custom_view;

import Ed.ViewOnTouchListenerC0223c;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import com.transsnet.palmpay.util.SizeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class TitleEditView extends LinearLayout implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f31151y0 = SizeUtils.dp2px(36.0f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CharSequence f31152A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final CharSequence f31153B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CharSequence f31154C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f31155H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f31156L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f31157M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f31158Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AppCompatEditText f31165g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f31166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f31167j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f31168k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnTextInputListener f31169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final View f31170p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f31171p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f31172q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f31173r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Drawable f31174s0;
    public final TextView t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f31175t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TextWatcher f31176u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f31177v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public View.OnClickListener f31178v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f31179w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public CallBack f31180w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final androidx.customview.widget.e f31181x0;

    public interface CallBack {
        void onFocusChange(View view, boolean z3);
    }

    public interface OnTextInputListener {
        void OnTextInput(String str);
    }

    public TitleEditView(Context context) {
        this(context, null);
    }

    public void a(Context context) {
        View.inflate(context, t.cv_layout_title_input, this);
    }

    public final void b(TextView textView) {
        if (textView == null) {
            return;
        }
        String string = textView.getText().toString();
        textView.setText(C0.G.i("* ").setForegroundColor(this.f31159a).append(string).setForegroundColor(textView.getTextColors().getDefaultColor()).create());
    }

    public final void c(EditText editText) {
        if (editText == null) {
            return;
        }
        if (!this.f31172q0 || !editText.isFocused()) {
            editText.setCompoundDrawables(this.f31174s0, null, this.f31173r0, null);
            return;
        }
        try {
            Drawable drawable = editText.getContext().getDrawable(r.cv_circle_gray_cross);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            String string = editText.getEditableText().toString();
            Drawable drawable2 = this.f31174s0;
            if (TextUtils.isEmpty(string)) {
                drawable = this.f31173r0;
            }
            editText.setCompoundDrawables(drawable2, null, drawable, null);
        } catch (Exception e10) {
            F6.d.c("TitleEditView", "updateDrawableRight: ", e10);
        }
    }

    public void d(CharSequence charSequence) {
        if (this.f31171p0) {
            if (TextUtils.isEmpty(charSequence)) {
                this.f31170p.setVisibility(8);
                if (this.f31165g.getBackground() != null) {
                    this.f31165g.getBackground().setColorFilter(null);
                    return;
                }
                return;
            }
            if (this.f31165g.getBackground() != null) {
                this.f31165g.getBackground().mutate().setColorFilter(getContext().getColor(L6.b.ppColorError), PorterDuff.Mode.SRC_ATOP);
            }
            this.f31170p.setVisibility(0);
            this.t.setText(charSequence);
        }
    }

    public final void e(int i7) {
        this.f31167j.setVisibility(i7);
        if (TextUtils.isEmpty(this.f31153B)) {
            return;
        }
        if (i7 == 0) {
            this.f31165g.setHintTextColor(0);
        } else {
            this.f31165g.setHintTextColor(this.f31163e);
        }
    }

    public final void f(int i7) {
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText == null) {
            return;
        }
        int i10 = this.f31155H;
        if (1 == i10 || i10 == 131072) {
            appCompatEditText.setFilters(new InputFilter[]{new Tb.c(i7, 0), new Tb.b()});
        } else {
            appCompatEditText.setFilters(new InputFilter[]{new Tb.c(i7, 0)});
        }
    }

    public String getEditText() {
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText == null) {
            return "";
        }
        String string = appCompatEditText.getText().toString();
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        return this.f31156L == 5 ? string.replace(" ", "") : string;
    }

    public EditText getEditTextView() {
        return this.f31165g;
    }

    public CharSequence getHint() {
        TextView textView = this.f31167j;
        return textView != null ? textView.getText() : "";
    }

    public int getMaxLength() {
        return this.f31175t0;
    }

    public CharSequence getTitle() {
        TextView textView = this.f31166i;
        return textView != null ? textView.getText() : "";
    }

    public TextView getTitleView() {
        return this.f31166i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.removeCallbacks(this.f31181x0);
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z3) {
        TextView textView = this.f31166i;
        setTitle(this.f31152A);
        if (!this.f31179w) {
            textView.setVisibility(0);
            return;
        }
        if (!TextUtils.isEmpty(this.f31165g.getText())) {
            e(8);
            textView.setVisibility(0);
            return;
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        int i7 = f31151y0;
        if (!z3) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f, i7);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new AccelerateInterpolator());
            animatorSet.addListener(new L(this, 1));
            animatorSet.start();
            return;
        }
        float f10 = i7;
        textView.setTranslationY(f10);
        float translationY = textView.getTranslationY();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, translationY, translationY - f10);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        animatorSet2.setInterpolator(new AccelerateInterpolator());
        animatorSet2.setDuration(200L);
        animatorSet2.addListener(new L(this, 0));
        animatorSet2.start();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31157M) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCallBack(CallBack callBack) {
        this.f31180w0 = callBack;
    }

    public void setCursorVisible(boolean z3) {
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.setCursorVisible(z3);
        }
    }

    public void setDesc(String str) {
        TextView textView = this.f31177v;
        if (textView != null) {
            textView.setVisibility(0);
            this.f31177v.setText(str);
        }
    }

    public void setDrawableLeft(Drawable drawable) {
        this.f31174s0 = drawable;
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.setCompoundDrawables(drawable, null, this.f31173r0, null);
        }
    }

    public void setDrawableRight(Drawable drawable) {
        this.f31173r0 = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.setCompoundDrawables(this.f31174s0, null, this.f31173r0, null);
        }
    }

    public void setDrawableRightClickListener(View.OnClickListener onClickListener) {
        this.f31178v0 = onClickListener;
    }

    public void setEditText(String str) {
        if (str == null) {
            str = "";
        }
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.setText(str);
            try {
                if (!TextUtils.isEmpty(str)) {
                    AppCompatEditText appCompatEditText2 = this.f31165g;
                    appCompatEditText2.setSelection(appCompatEditText2.getText().length());
                }
            } catch (Exception e10) {
                F6.d.c("TitleEditView", "setEditText: ", e10);
            }
        }
        TextView textView = this.f31166i;
        if (textView == null || this.f31167j == null || this.f31165g == null) {
            return;
        }
        if (!this.f31179w) {
            textView.setVisibility(0);
            e(8);
        } else if (!TextUtils.isEmpty(str) || this.f31165g.isFocused()) {
            this.f31166i.setVisibility(0);
            e(8);
        } else {
            this.f31166i.setVisibility(4);
            e(0);
        }
    }

    public void setEdittextBackGround(Drawable drawable) {
        this.f31165g.setBackground(drawable);
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        this.f31157M = z3;
        if (z3) {
            this.f31165g.setFocusable(true);
            this.f31165g.setFocusableInTouchMode(true);
            this.f31165g.setCursorVisible(true);
        } else {
            this.f31165g.setFocusable(false);
            this.f31165g.setFocusableInTouchMode(false);
            this.f31165g.setCursorVisible(false);
        }
        this.f31165g.setEnabled(z3);
        setTitle(this.f31152A);
    }

    public void setError(@Nullable CharSequence charSequence) {
        this.f31154C = charSequence;
        d(charSequence);
        this.f31154C = "";
        TextView textView = this.t;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(L6.b.ppColorError));
        }
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i7) {
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.setGravity(i7);
        }
    }

    public void setHint(CharSequence charSequence) {
        TextView textView = this.f31167j;
        if (textView != null) {
            textView.setText(charSequence);
            e(TextUtils.isEmpty(this.f31165g.getText()) ? 0 : 8);
            if (this.f31158Q) {
                b(this.f31167j);
            }
        }
    }

    public void setInfo(@Nullable CharSequence charSequence) {
        setError(charSequence);
        TextView textView = this.t;
        if (textView != null) {
            textView.setTextColor(getResources().getColor(L6.b.ppColorTextNormal));
        }
    }

    public void setInputFilter(InputFilter[] inputFilterArr) {
        this.f31165g.setFilters(inputFilterArr);
    }

    public void setInputType(int i7) {
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.setInputType(i7);
        }
    }

    public void setMaxLength(int i7) {
        if (i7 != this.f31175t0) {
            f(i7);
        }
        this.f31175t0 = i7;
    }

    public void setOnTextInputListener(OnTextInputListener onTextInputListener) {
        this.f31169o = onTextInputListener;
    }

    public void setRequired(boolean z3) {
        this.f31158Q = z3;
    }

    public void setShowClearButton(boolean z3) {
        this.f31172q0 = z3;
        c(this.f31165g);
    }

    public void setTextColor(int i7) {
        AppCompatEditText appCompatEditText = this.f31165g;
        if (appCompatEditText != null) {
            appCompatEditText.setTextColor(i7);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f31166i;
        if (textView != null) {
            this.f31152A = charSequence;
            textView.setText(charSequence);
            TextView textView2 = this.f31166i;
            boolean zHasFocus = this.f31165g.hasFocus();
            boolean z3 = this.f31168k0;
            int i7 = this.f31162d;
            if (!z3) {
                if (!this.f31157M) {
                    i7 = this.f31161c;
                } else if (zHasFocus) {
                    i7 = this.f31160b;
                }
            }
            textView2.setTextColor(i7);
            if (this.f31158Q) {
                b(this.f31166i);
            }
            if (TextUtils.isEmpty(this.f31153B)) {
                setHint(this.f31152A);
            }
        }
    }

    public TitleEditView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleEditView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31163e = 0;
        this.f31164f = 0;
        this.f31179w = true;
        this.f31175t0 = 50;
        this.f31181x0 = new androidx.customview.widget.e(this, 22);
        K k2 = new K(this);
        this.f31159a = getContext().getResources().getColor(L6.b.ppColorError);
        this.f31162d = getContext().getResources().getColor(L6.b.ppColorTextPrimary);
        this.f31160b = getContext().getResources().getColor(L6.b.ppColorPrimary);
        int color = getContext().getResources().getColor(L6.b.ppColorTextDisable);
        this.f31161c = color;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, x.CvTitleEditView, i7, 0);
        this.f31152A = typedArrayObtainStyledAttributes.getText(x.CvTitleEditView_cv_te_title);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(x.CvTitleEditView_cv_te_text_size, SizeUtils.dp2px(14.0f));
        int i10 = typedArrayObtainStyledAttributes.getInt(x.CvTitleEditView_cv_te_title_color, 0);
        int i11 = typedArrayObtainStyledAttributes.getInt(x.CvTitleEditView_cv_te_hint_color, color);
        this.f31163e = i11;
        int i12 = typedArrayObtainStyledAttributes.getInt(x.CvTitleEditView_cv_te_no_focus_title_color, 0);
        this.f31164f = i12;
        if (i10 != 0) {
            this.f31162d = i10;
        }
        if (typedArrayObtainStyledAttributes.hasValue(x.CvTitleEditView_cv_te_no_focus_title_color)) {
            this.f31161c = i12;
        }
        CharSequence text = typedArrayObtainStyledAttributes.getText(x.CvTitleEditView_cv_te_hint);
        this.f31153B = text;
        int i13 = typedArrayObtainStyledAttributes.getInt(x.CvTitleEditView_cv_te_inputType, 0);
        this.f31156L = i13;
        if (i13 == 0 || i13 == 5) {
            this.f31155H = 2;
        } else if (i13 == 1) {
            this.f31155H = 18;
        } else if (i13 == 2) {
            this.f31155H = 524289;
        } else if (i13 == 3) {
            this.f31155H = 131072;
        } else if (i13 == 4) {
            this.f31155H = 32;
        } else if (i13 == 6) {
            this.f31155H = -100;
        }
        this.f31158Q = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_required, false);
        this.f31168k0 = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_always_show_title_color, false);
        this.f31175t0 = typedArrayObtainStyledAttributes.getInteger(x.CvTitleEditView_cv_max_length, Integer.MAX_VALUE);
        this.f31157M = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_enable, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_set_same_text_size, false);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_error_text, true);
        this.f31171p0 = z8;
        this.f31172q0 = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_show_clear_button, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(x.CvTitleEditView_cv_te_collapse, true);
        this.f31179w = z10;
        this.f31173r0 = typedArrayObtainStyledAttributes.getDrawable(x.CvTitleEditView_cv_te_drawable_right);
        setOrientation(1);
        a(context);
        TextView textView = (TextView) findViewById(s.cvTextViewHint);
        this.f31167j = textView;
        textView.setTextColor(i11);
        this.f31166i = (TextView) findViewById(s.cvTextViewTitle);
        this.f31170p = findViewById(s.viewError);
        this.t = (TextView) findViewById(s.textViewErrorText);
        this.f31177v = (TextView) findViewById(s.tvBillerviewDesc);
        this.f31165g = (AppCompatEditText) findViewById(s.cvEditTextInput);
        if (!z8) {
            this.f31170p.setVisibility(8);
        }
        int i14 = this.f31155H;
        if (i14 != -100) {
            this.f31165g.setInputType(i14);
        }
        this.f31165g.setSupportBackgroundTintList(getResources().getColorStateList(p.cv_edit_underline_color));
        this.f31165g.setOnFocusChangeListener(this);
        if (i14 == 131072) {
            this.f31165g.setHorizontallyScrolling(false);
            this.f31165g.setSingleLine(false);
        }
        setTitle(this.f31152A);
        if (TextUtils.isEmpty(text)) {
            setHint(this.f31152A);
        } else {
            setHint(text);
            if (!text.equals(this.f31152A)) {
                this.f31165g.setHintTextColor(0);
                this.f31165g.setHint(text);
            }
        }
        f(this.f31175t0);
        if (i14 == 131072) {
            AppCompatEditText appCompatEditText = this.f31165g;
            appCompatEditText.setPadding(appCompatEditText.getPaddingLeft(), SizeUtils.dp2px(3.0f) + this.f31165g.getPaddingTop(), this.f31165g.getPaddingRight(), SizeUtils.dp2px(3.0f) + this.f31165g.getPaddingBottom());
        }
        this.f31165g.addTextChangedListener(k2);
        setEnabled(this.f31157M);
        this.f31165g.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 5));
        Drawable drawable = this.f31173r0;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f31173r0.getIntrinsicHeight());
            this.f31165g.setCompoundDrawables(this.f31174s0, null, this.f31173r0, null);
        }
        if (!z10) {
            e(8);
            this.f31166i.setVisibility(0);
            this.f31165g.setHint(text);
        }
        if (typedArrayObtainStyledAttributes.hasValue(x.CvTitleEditView_cv_te_text_color)) {
            this.f31165g.setTextColor(typedArrayObtainStyledAttributes.getColor(x.CvTitleEditView_cv_te_text_color, -16777216));
        }
        float f10 = dimensionPixelSize;
        this.f31165g.setTextSize(0, f10);
        if (z3) {
            this.f31167j.setTextSize(0, f10);
        }
        if (!z10) {
            this.f31165g.setHintTextColor(i11);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
