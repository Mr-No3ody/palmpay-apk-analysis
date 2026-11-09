package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import Ja.RunnableC0336i;
import Pa.n0;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.PinEntryView;
import java.lang.ref.WeakReference;
import p025ba.e;
import p025ba.g;

/* JADX INFO: loaded from: classes3.dex */
public class OneTimeCodeSimpleView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f28440o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0336i f28441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PinEntryView f28442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f28443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f28444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f28445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f28446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28447g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnSendCodeListener f28448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p103gf.a f28449j;

    public OneTimeCodeSimpleView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendOtcButtonStateInternal(final boolean enable) {
        if (this.f28443c != null) {
            if (enable) {
                this.f28445e.removeCallbacks(this.f28441a);
                this.f28445e.setText("");
            }
            this.f28443c.setEnabled(enable);
            this.f28443c.setVisibility(enable ? 0 : 8);
            OnSendCodeListener onSendCodeListener = this.f28448i;
            if (onSendCodeListener != null) {
                onSendCodeListener.onButtonVisibilityChange(this.f28443c, enable ? 0 : 8);
            }
        }
    }

    public final void b() {
        TextView textView = this.f28445e;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.f28445e;
            RunnableC0336i runnableC0336i = this.f28441a;
            textView2.removeCallbacks(runnableC0336i);
            this.f28445e.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            this.f28445e.post(runnableC0336i);
        }
        TextView textView3 = this.f28446f;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public OnSendCodeListener getSendCodeListener() {
        return this.f28448i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = view instanceof TextView ? ((TextView) view).getText().toString() : "";
        if (e.textViewSendSms == view.getId()) {
            b();
            OnSendCodeListener onSendCodeListener = this.f28448i;
            if (onSendCodeListener != null) {
                onSendCodeListener.onSend(0, 1, null);
            }
        }
        n0.g().k((ClickEvent) G.f("registration_verification_code_page_element_click", "element_name", string));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103gf.a aVar = this.f28449j;
        if (aVar != null) {
            aVar.dispose();
            this.f28449j = null;
        }
    }

    public void setCode(String code) {
        PinEntryView pinEntryView;
        if (TextUtils.isEmpty(code) || !TextUtils.isDigitsOnly(code) || (pinEntryView = this.f28442b) == null) {
            return;
        }
        pinEntryView.setText(code);
    }

    public void setCodeEnteredListener(PinEntryView.OnPinEnteredListener listener) {
        PinEntryView pinEntryView = this.f28442b;
        if (pinEntryView != null) {
            pinEntryView.setOnPinEnteredListener(listener);
        }
    }

    public void setSendCodeListener(OnSendCodeListener listener) {
        this.f28448i = listener;
    }

    public void setSendOtcButtonState(final boolean enable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            setSendOtcButtonStateInternal(enable);
        } else {
            post(new D.b(this, enable, 4));
        }
    }

    public OneTimeCodeSimpleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OneTimeCodeSimpleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f28447g = true;
        setOrientation(1);
        View.inflate(context, g.core_layout_one_time_code_v3_view, this);
        RunnableC0336i runnableC0336i = new RunnableC0336i(2);
        runnableC0336i.f4657b = new WeakReference(this);
        this.f28441a = runnableC0336i;
        this.f28449j = new p103gf.a();
        this.f28442b = (PinEntryView) findViewById(e.smsCodeView);
        this.f28443c = (TextView) findViewById(e.textViewSendSms);
        this.f28445e = (TextView) findViewById(e.tvTime);
        this.f28444d = (LinearLayout) findViewById(e.llOthers);
        this.f28446f = (TextView) findViewById(e.tvInputError);
        this.f28443c.setOnClickListener(this);
        this.f28444d.setVisibility(8);
    }
}
