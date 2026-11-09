package com.palmpay.lib.ui.edit;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.widget.AppCompatEditText;
import com.alibaba.android.arouter.utils.Consts;
import com.palmpay.lib.apm.launchcounter.util.d;
import java.math.BigDecimal;
import p241q.a;

/* JADX INFO: loaded from: classes3.dex */
public class AmountEditText extends AppCompatEditText implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnTextInputListener f24354b;

    public interface OnTextInputListener {
        void OnTextInput(String str);
    }

    public AmountEditText(Context context) {
        this(context, null, a.editTextStyle);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        OnTextInputListener onTextInputListener = this.f24354b;
        if (onTextInputListener != null) {
            onTextInputListener.OnTextInput(getAmountString());
        }
        try {
            String string = getText().toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String strT = d.t(getContext(), string.replace("pt".equalsIgnoreCase(getContext().getResources().getConfiguration().getLocales().get(0).getLanguage()) ? Consts.DOT : ",", ""));
            if (string.equals(strT)) {
                return;
            }
            removeTextChangedListener(null);
            setText(strT);
            addTextChangedListener(this);
        } catch (Exception e10) {
            Log.e("AmountEditText", "afterTextChanged: ", e10);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public String getAmountString() {
        return getText().toString().replace("pt".equalsIgnoreCase(getContext().getResources().getConfiguration().getLocales().get(0).getLanguage()) ? Consts.DOT : ",", "").replace(d.s(getContext()), Consts.DOT);
    }

    public int getDecimalNumber() {
        return this.f24353a;
    }

    public double getDoubleAmount() {
        try {
            String amountString = getAmountString();
            if (TextUtils.isEmpty(amountString)) {
                return 0.0d;
            }
            return Double.parseDouble(amountString);
        } catch (Exception e10) {
            Log.e("AmountEditText", "getDouble: ", e10);
            return 0.0d;
        }
    }

    public long getLongAmount() {
        String amountString = getAmountString();
        if (TextUtils.isEmpty(amountString)) {
            return 0L;
        }
        try {
            return new BigDecimal(amountString).multiply(new BigDecimal(100)).longValue();
        } catch (Exception e10) {
            Log.e("AmountEditText", "getLong: ", e10);
            return 0L;
        }
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
            Log.e("AmountEditText", "onSelectionChanged: ", e10);
        }
    }

    @Override // android.widget.TextView, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    public void setDecimalNumber(int i7) {
        this.f24353a = i7;
        if (i7 <= 0) {
            setInputType(2);
        } else {
            setInputType(8194);
        }
    }

    public void setOnTextInputListener(OnTextInputListener onTextInputListener) {
        this.f24354b = onTextInputListener;
    }

    public AmountEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.editTextStyle);
    }

    public AmountEditText(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f24353a = 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.maxLength});
        int i10 = typedArrayObtainStyledAttributes.getInt(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        addTextChangedListener(this);
        Q6.a aVar = new Q6.a(this, 0);
        if (i10 > 0) {
            setFilters(new InputFilter[]{aVar, new InputFilter.LengthFilter(i10)});
        } else {
            setFilters(new InputFilter[]{aVar});
        }
        if (this.f24353a <= 0) {
            setInputType(2);
        } else {
            setInputType(8194);
        }
        setMaxLines(1);
        setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
    }
}
