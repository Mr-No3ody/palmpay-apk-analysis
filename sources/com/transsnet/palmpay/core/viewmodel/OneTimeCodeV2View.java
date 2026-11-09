package com.transsnet.palmpay.core.viewmodel;

import Ab.D;
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
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.PinEntryView;
import java.lang.ref.WeakReference;
import p025ba.e;
import p025ba.g;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public class OneTimeCodeV2View extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f28450B = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f28451A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0336i f28452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PinEntryView f28453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f28454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f28455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f28456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f28457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f28458g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f28459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f28460j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public OnSendCodeListener f28462p;
    public p103gf.a t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f28463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f28464w;

    public OneTimeCodeV2View(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendOtcButtonStateInternal(final boolean enable) {
        if (this.f28454c != null) {
            if (enable) {
                this.f28459i.removeCallbacks(this.f28452a);
                this.f28459i.setText("");
            }
            this.f28454c.setEnabled(enable);
            this.f28460j.setVisibility(enable ? 0 : 8);
        }
        setSendVoiceVisibility(this.f28461o ? 0 : 8);
        setSendVoiceButtonStateInternal(enable);
    }

    private void setSendVoiceButtonStateInternal(final boolean enable) {
        TextView textView = this.f28455d;
        if (textView != null) {
            textView.setEnabled(enable);
        }
    }

    public final void b() {
        TextView textView = this.f28459i;
        if (textView != null) {
            RunnableC0336i runnableC0336i = this.f28452a;
            textView.removeCallbacks(runnableC0336i);
            this.f28459i.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            this.f28459i.post(runnableC0336i);
        }
    }

    public final void c() {
        if (this.f28463v) {
            this.f28458g.setVisibility(0);
        } else {
            this.f28458g.setVisibility(8);
        }
    }

    public String getEmail() {
        return this.f28464w;
    }

    public OnSendCodeListener getSendCodeListener() {
        return this.f28462p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = view instanceof TextView ? ((TextView) view).getText().toString() : "";
        int id2 = view.getId();
        if (e.textViewSendSms == id2) {
            b();
            OnSendCodeListener onSendCodeListener = this.f28462p;
            if (onSendCodeListener != null) {
                onSendCodeListener.onSend(0, 0, null);
            }
        } else if (e.tvVoiceCall == id2) {
            b();
            OnSendCodeListener onSendCodeListener2 = this.f28462p;
            if (onSendCodeListener2 != null) {
                onSendCodeListener2.onSend(1, 0, null);
            }
        } else if (e.tvWhatsapp == id2) {
            b();
            OnSendCodeListener onSendCodeListener3 = this.f28462p;
            if (onSendCodeListener3 != null) {
                onSendCodeListener3.onSend(2, 0, null);
            }
        } else if (e.tvEmail == id2) {
            b();
            OnSendCodeListener onSendCodeListener4 = this.f28462p;
            if (onSendCodeListener4 != null) {
                onSendCodeListener4.onSend(3, 0, null);
            }
        } else if (e.tvUSSD == id2) {
            b();
            OnSendCodeListener onSendCodeListener5 = this.f28462p;
            if (onSendCodeListener5 != null) {
                onSendCodeListener5.onSend(4, 0, null);
            }
        }
        n0.g().k((ClickEvent) G.f("registration_verification_code_page_element_click", "element_name", string));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103gf.a aVar = this.t;
        if (aVar != null) {
            aVar.dispose();
            this.t = null;
        }
    }

    public void setCodeEnteredListener(PinEntryView.OnPinEnteredListener listener) {
        PinEntryView pinEntryView = this.f28453b;
        if (pinEntryView != null) {
            pinEntryView.setOnPinEnteredListener(listener);
        }
    }

    public void setMobileNumber(String number) {
        this.f28451A = number;
    }

    public void setSendCodeListener(OnSendCodeListener listener) {
        this.f28462p = listener;
    }

    public void setSendOtcButtonState(final boolean enable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            setSendOtcButtonStateInternal(enable);
        } else {
            post(new D.b(this, enable, 5));
        }
    }

    public void setSendVoiceVisibility(int visibility) {
        TextView textView = this.f28455d;
        if (textView != null) {
            textView.setVisibility(visibility);
        }
    }

    public OneTimeCodeV2View(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OneTimeCodeV2View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f28463v = false;
        this.f28464w = "";
        setOrientation(1);
        View.inflate(context, g.core_layout_one_time_code_v2_view, this);
        RunnableC0336i runnableC0336i = new RunnableC0336i(3);
        runnableC0336i.f4657b = new WeakReference(this);
        this.f28452a = runnableC0336i;
        this.t = new p103gf.a();
        this.f28453b = (PinEntryView) findViewById(e.smsCodeView);
        this.f28454c = (TextView) findViewById(e.textViewSendSms);
        this.f28459i = (TextView) findViewById(e.tvTime);
        this.f28460j = findViewById(e.buttonContainer);
        this.f28456e = (TextView) findViewById(e.tvWhatsapp);
        this.f28457f = (TextView) findViewById(e.tvUSSD);
        this.f28458g = (TextView) findViewById(e.tvEmail);
        this.f28455d = (TextView) findViewById(e.tvVoiceCall);
        setSendVoiceVisibility(this.f28461o ? 0 : 4);
        this.f28454c.setOnClickListener(this);
        this.f28455d.setOnClickListener(this);
        this.f28458g.setOnClickListener(this);
        this.f28456e.setVisibility(8);
        c();
        String phoneNumber = this.f28451A;
        phoneNumber = TextUtils.isEmpty(phoneNumber) ? BaseApplication.getInstance().getUser().getPhoneNumber() : phoneNumber;
        if (TextUtils.isEmpty(phoneNumber)) {
            this.f28463v = false;
            c();
        } else {
            ((PayApiService) p324va.c.f43141a.f14621b).queryMemberEmail(phoneNumber).k(f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 28));
        }
    }
}
