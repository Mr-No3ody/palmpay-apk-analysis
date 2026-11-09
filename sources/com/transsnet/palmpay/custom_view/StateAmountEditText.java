package com.transsnet.palmpay.custom_view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import com.alibaba.android.arouter.utils.Consts;
import com.transsnet.palmpay.custom_view.utils.CvUtils;

/* JADX INFO: loaded from: classes4.dex */
public class StateAmountEditText extends CompatStateEditText implements TextWatcher {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f31125j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f31126o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnTextInputListener f31127p;

    public interface OnTextInputListener {
        void OnTextInput(String str);
    }

    public StateAmountEditText(Context context) {
        this(context, null, p241q.a.editTextStyle);
    }

    private String getStringInternal() {
        String string = getText().toString();
        return TextUtils.isEmpty(this.f31125j) ? string.replace(CvUtils.getThousandsSeparators(getContext()), "").replace(" ", "") : string.replace(CvUtils.getThousandsSeparators(getContext()), "").replace(this.f31125j, "").replace(" ", "");
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        OnTextInputListener onTextInputListener = this.f31127p;
        if (onTextInputListener != null) {
            onTextInputListener.OnTextInput(getString());
        }
        try {
            String string = getText().toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String strB = b(getStringInternal());
            if (string.equals(strB)) {
                return;
            }
            removeTextChangedListener(this);
            setText(strB);
            addTextChangedListener(this);
        } catch (Exception e10) {
            F6.d.c("StateAmountEditText", e10.getMessage());
        }
    }

    public final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(this.f31125j)) {
            return CvUtils.getFormatAmountString(getContext(), str);
        }
        return this.f31125j + " " + CvUtils.getFormatAmountString(getContext(), str);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getString()) && getDouble() > 0.0d;
    }

    public int getDecimalNumber() {
        return this.f31126o;
    }

    public double getDouble() {
        try {
            String string = getString();
            if (TextUtils.isEmpty(string)) {
                return 0.0d;
            }
            return Double.parseDouble(string);
        } catch (Exception e10) {
            F6.d.c("StateAmountEditText", "getDouble: ", e10);
            return 0.0d;
        }
    }

    public long getLongAmount() {
        return (long) (getDouble() * 100.0d);
    }

    public String getString() {
        return getStringInternal().replace(CvUtils.getDecimalPoint(getContext()), Consts.DOT);
    }

    @Override // com.transsnet.palmpay.custom_view.CompatStateEditText, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        addTextChangedListener(this);
    }

    @Override // com.transsnet.palmpay.custom_view.CompatStateEditText, androidx.appcompat.widget.AppCompatEditText, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeTextChangedListener(this);
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        try {
            int length = getText().toString().length();
            if (i10 < length) {
                setSelection(length);
            }
        } catch (Exception e10) {
            F6.d.c("StateAmountEditText", "onSelectionChanged: ", e10);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public void setCurrency(String str) {
        this.f31125j = str;
    }

    public void setDecimalNumber(int i7) {
        this.f31126o = i7;
    }

    public void setHintText(int i7) {
        setHintText(getContext().getString(i7));
    }

    public void setOnTextInputListener(OnTextInputListener onTextInputListener) {
        this.f31127p = onTextInputListener;
    }

    public StateAmountEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.editTextStyle);
    }

    public void setHintText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.f31125j)) {
            setHint(str);
            return;
        }
        if (!str.contains(this.f31125j)) {
            str = androidx.camera.camera2.internal.F.d(new StringBuilder(), this.f31125j, " ", str);
        }
        setHint(str);
    }

    public StateAmountEditText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f31126o = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.cv_AmountEditText);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxLength});
        int i10 = typedArrayObtainStyledAttributes2.getInt(0, -1);
        typedArrayObtainStyledAttributes2.recycle();
        this.f31126o = typedArrayObtainStyledAttributes.getInt(x.cv_AmountEditText_cv_decimalNumber, 2);
        typedArrayObtainStyledAttributes.recycle();
        Q6.a aVar = new Q6.a(this, 2);
        if (i10 > 0) {
            setFilters(new InputFilter[]{aVar, new InputFilter.LengthFilter(i10)});
        } else {
            setFilters(new InputFilter[]{aVar});
        }
        setInputType(8194);
        setMaxLines(1);
        setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
    }
}
