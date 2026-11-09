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
import androidx.appcompat.widget.AppCompatEditText;
import com.alibaba.android.arouter.utils.Consts;
import com.transsnet.palmpay.custom_view.utils.CvUtils;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes4.dex */
public class AmountEditText extends AppCompatEditText implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnTextInputListener f30941b;

    public interface OnTextInputListener {
        void OnTextInput(String str);
    }

    public AmountEditText(Context context) {
        this(context, null, p241q.a.editTextStyle);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        OnTextInputListener onTextInputListener = this.f30941b;
        if (onTextInputListener != null) {
            onTextInputListener.OnTextInput(getString());
        }
        try {
            String string = getText().toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String formatAmountString = CvUtils.getFormatAmountString(getContext(), string.replace(CvUtils.getThousandsSeparators(getContext()), ""));
            if (string.equals(formatAmountString)) {
                return;
            }
            removeTextChangedListener(null);
            setText(formatAmountString);
            addTextChangedListener(this);
        } catch (Exception e10) {
            F6.d.c("AmountEditText", "afterTextChanged: ", e10);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public int getDecimalNumber() {
        return this.f30940a;
    }

    public double getDouble() {
        try {
            String string = getString();
            if (TextUtils.isEmpty(string)) {
                return 0.0d;
            }
            return Double.parseDouble(string);
        } catch (Exception e10) {
            F6.d.c("AmountEditText", "getDouble: ", e10);
            return 0.0d;
        }
    }

    public long getLong() {
        String string = getString();
        if (TextUtils.isEmpty(string)) {
            return 0L;
        }
        try {
            return new BigDecimal(string).multiply(new BigDecimal(100)).longValue();
        } catch (Exception e10) {
            F6.d.c("AmountEditText", "getLong: ", e10);
            return 0L;
        }
    }

    public String getString() {
        return getText().toString().replace(CvUtils.getThousandsSeparators(getContext()), "").replace(CvUtils.getDecimalPoint(getContext()), Consts.DOT);
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
            F6.d.c("AmountEditText", "onSelectionChanged: ", e10);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public void setDecimalNumber(int i7) {
        this.f30940a = i7;
        if (i7 <= 0) {
            setInputType(2);
        } else {
            setInputType(8194);
        }
    }

    public void setOnTextInputListener(OnTextInputListener onTextInputListener) {
        this.f30941b = onTextInputListener;
    }

    public AmountEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p241q.a.editTextStyle);
    }

    public AmountEditText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f30940a = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.cv_AmountEditText);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxLength});
        int i10 = typedArrayObtainStyledAttributes2.getInt(0, -1);
        typedArrayObtainStyledAttributes2.recycle();
        this.f30940a = typedArrayObtainStyledAttributes.getInt(x.cv_AmountEditText_cv_decimalNumber, 2);
        typedArrayObtainStyledAttributes.recycle();
        addTextChangedListener(this);
        Q6.a aVar = new Q6.a(this, 1);
        if (i10 > 0) {
            setFilters(new InputFilter[]{aVar, new InputFilter.LengthFilter(i10)});
        } else {
            setFilters(new InputFilter[]{aVar});
        }
        if (this.f30940a <= 0) {
            setInputType(2);
        } else {
            setInputType(8194);
        }
        setMaxLines(1);
        setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
    }
}
