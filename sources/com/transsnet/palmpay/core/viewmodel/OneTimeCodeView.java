package com.transsnet.palmpay.core.viewmodel;

import Ja.RunnableC0336i;
import Pa.r0;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.lang.ref.WeakReference;
import p025ba.e;
import p025ba.g;
import p025ba.k;

/* JADX INFO: loaded from: classes3.dex */
public class OneTimeCodeView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0336i f28507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC0336i f28508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PinEntryView f28509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f28510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f28511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f28512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f28513g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f28514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f28515j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public OnSendCodeListener f28516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f28517p;

    public OneTimeCodeView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendOtcButtonStateInternal(final boolean enable) {
        TextView textView = this.f28510d;
        if (textView != null) {
            if (enable) {
                textView.removeCallbacks(this.f28507a);
                this.f28510d.setText(this.f28515j ? k.core_resend : k.core_send_code);
            }
            this.f28510d.setEnabled(enable);
        }
        setSendVoiceVisibility(this.f28515j ? 0 : 4);
        setSendVoiceButtonStateInternal(enable);
    }

    private void setSendVoiceButtonStateInternal(final boolean enable) {
        View view = this.f28514i;
        if (view != null) {
            view.setEnabled(enable);
            this.f28514i.setAlpha(enable ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        KeyboardUtils.hideSoftInput(this);
        c cVar = this.f28517p;
        if (cVar != null) {
            cVar.d();
        }
    }

    public final void c() {
        TextView textView = this.f28510d;
        if (textView != null) {
            RunnableC0336i runnableC0336i = this.f28507a;
            textView.removeCallbacks(runnableC0336i);
            this.f28510d.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            this.f28510d.post(runnableC0336i);
        }
    }

    public EditText getCodeEditText() {
        PinEntryView pinEntryView = this.f28509c;
        if (pinEntryView != null) {
            return pinEntryView.getEditText();
        }
        return null;
    }

    public OnSendCodeListener getSendCodeListener() {
        return this.f28516o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (e.textViewSendSms == view.getId()) {
            c();
            OnSendCodeListener onSendCodeListener = this.f28516o;
            if (onSendCodeListener != null) {
                onSendCodeListener.onSend(0, 0, null);
                return;
            }
            return;
        }
        if (e.viewSendVoiceCode == view.getId()) {
            c();
            OnSendCodeListener onSendCodeListener2 = this.f28516o;
            if (onSendCodeListener2 != null) {
                onSendCodeListener2.onSend(1, 0, null);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        PinEntryView pinEntryView = this.f28509c;
        if (pinEntryView != null) {
            pinEntryView.setOnShowCustomKeyboardListener(null);
            this.f28509c.setUseCustomKeyboard(false);
        }
        c cVar = this.f28517p;
        if (cVar != null) {
            cVar.e();
            this.f28517p = null;
        }
    }

    public void setCode(String code) {
        PinEntryView pinEntryView;
        if (TextUtils.isEmpty(code) || !TextUtils.isDigitsOnly(code) || (pinEntryView = this.f28509c) == null) {
            return;
        }
        pinEntryView.setText(code);
    }

    public void setCodeEnteredListener(PinEntryView.OnPinEnteredListener listener) {
        PinEntryView pinEntryView = this.f28509c;
        if (pinEntryView != null) {
            pinEntryView.setOnPinEnteredListener(listener);
        }
    }

    public void setError(String error) {
        TextView textView = this.f28512f;
        if (textView != null) {
            textView.setText(error);
            if (TextUtils.isEmpty(error)) {
                this.f28511e.setVisibility(4);
            } else {
                this.f28511e.setVisibility(0);
                this.f28512f.postDelayed(this.f28508b, 2000L);
            }
        }
    }

    public void setMobileNumber(String number) {
        TextView textView;
        if (TextUtils.isEmpty(number) || (textView = this.f28513g) == null) {
            return;
        }
        textView.setText(getResources().getString(k.core_msg_send_voice_code, r0.D0(number)));
    }

    public void setSendCodeListener(OnSendCodeListener listener) {
        this.f28516o = listener;
    }

    public void setSendOtcButtonState(final boolean enable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            setSendOtcButtonStateInternal(enable);
        } else {
            post(new D.b(this, enable, 9));
        }
    }

    public void setSendVoiceVisibility(int visibility) {
        TextView textView = this.f28513g;
        if (textView != null) {
            textView.setVisibility(visibility);
        }
        View view = this.f28514i;
        if (view != null) {
            view.setVisibility(visibility);
        }
    }

    public OneTimeCodeView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OneTimeCodeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(1);
        View.inflate(context, g.core_layout_one_time_code_view, this);
        RunnableC0336i runnableC0336i = new RunnableC0336i(7);
        runnableC0336i.f4657b = new WeakReference(this);
        this.f28507a = runnableC0336i;
        RunnableC0336i runnableC0336i2 = new RunnableC0336i(6);
        runnableC0336i2.f4657b = new WeakReference(this);
        this.f28508b = runnableC0336i2;
        this.f28509c = (PinEntryView) findViewById(e.smsCodeView);
        this.f28510d = (TextView) findViewById(e.textViewSendSms);
        this.f28511e = findViewById(e.viewError);
        this.f28512f = (TextView) findViewById(e.textViewError);
        this.f28514i = findViewById(e.viewSendVoiceCode);
        this.f28513g = (TextView) findViewById(e.textViewMessage);
        setSendVoiceVisibility(this.f28515j ? 0 : 4);
        this.f28510d.setOnClickListener(this);
        this.f28514i.setOnClickListener(this);
    }
}
