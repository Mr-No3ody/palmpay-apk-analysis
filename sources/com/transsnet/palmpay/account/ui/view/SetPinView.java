package com.transsnet.palmpay.account.ui.view;

import F8.d;
import F8.e;
import L6.b;
import L8.c;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.transsnet.palmpay.custom_view.PinEntryView;

/* JADX INFO: loaded from: classes3.dex */
public class SetPinView extends LinearLayout implements PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f26397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PinEntryView f26398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f26399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f26400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f26401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PinEntryView.OnPinEnteredListener f26402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f26403g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f26404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f26405j;

    public SetPinView(Context context) {
        this(context, null);
    }

    public String getPin() {
        PinEntryView pinEntryView = this.f26398b;
        return pinEntryView != null ? pinEntryView.getText().toString() : "";
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public final void onPinEntered(String str) {
        if (TextUtils.isEmpty(str) || str.length() != this.f26398b.getDigits()) {
            setError("");
        } else if (this.f26403g.getVisibility() == 0) {
            if (c.e(str) || c.d(str)) {
                this.f26399c.setTextColor(this.f26404i);
                this.f26398b.b();
                this.f26398b.setShowError(true);
            } else {
                this.f26399c.setTextColor(this.f26405j);
            }
        }
        PinEntryView.OnPinEnteredListener onPinEnteredListener = this.f26402f;
        if (onPinEnteredListener != null) {
            onPinEnteredListener.onPinEntered(str);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        this.f26398b.setEnabled(z3);
        super.setEnabled(z3);
    }

    public void setError(String str) {
        if (TextUtils.isEmpty(str)) {
            setShowError(false);
            this.f26401e.setVisibility(8);
        } else {
            setShowError(true);
            this.f26401e.setVisibility(0);
        }
        this.f26401e.setText(str);
    }

    public void setOnPinEnteredListener(PinEntryView.OnPinEnteredListener onPinEnteredListener) {
        this.f26402f = onPinEnteredListener;
    }

    public void setPin(String str) {
        PinEntryView pinEntryView = this.f26398b;
        if (pinEntryView != null) {
            pinEntryView.setText(str);
        }
    }

    public void setRulesViewVisibility(int i7) {
        this.f26403g.setVisibility(i7);
    }

    public void setShowError(boolean z3) {
        PinEntryView pinEntryView = this.f26398b;
        if (pinEntryView != null) {
            pinEntryView.setShowError(z3);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f26397a == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f26397a.setVisibility(8);
        } else {
            this.f26397a.setText(charSequence);
        }
    }

    public void setTitleColor(int i7) {
        TextView textView = this.f26397a;
        if (textView == null) {
            return;
        }
        textView.setTextColor(i7);
    }

    public SetPinView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SetPinView(Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f26404i = getContext().getResources().getColor(b.ppColorError);
        this.f26405j = getContext().getResources().getColor(b.ppColorTextNormal);
        setOrientation(1);
        View.inflate(getContext(), e.ac_layout_set_pin_view, this);
        this.f26397a = (TextView) findViewById(d.tvTitle);
        this.f26398b = (PinEntryView) findViewById(d.pinEntryView);
        this.f26399c = (TextView) findViewById(d.tvPinRules1);
        this.f26400d = (TextView) findViewById(d.tvPinRules2);
        this.f26403g = findViewById(d.viewRules);
        this.f26401e = (TextView) findViewById(d.tvError);
        this.f26398b.setOnPinEnteredListener(this);
    }
}
