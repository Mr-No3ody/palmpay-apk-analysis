package com.transsnet.palmpay.core.viewmodel;

import C0.G;
import Ja.RunnableC0336i;
import Pa.r0;
import Ua.m0;
import Ua.n0;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.perf.util.Constants;
import com.transsnet.palmpay.core.bean.rsp.SmsChannelRsp;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.custom_view.dialog.o;
import com.transsnet.palmpay.custom_view.dialog.p;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.t;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.RegexUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p025ba.d;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p298tf.f;

/* JADX INFO: loaded from: classes3.dex */
public class OneTimeCodeV4View extends ConstraintLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static int f28480B = 60000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public CompleteCallback f28481A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0336i f28482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PinEntryView f28483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f28484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f28485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f28486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f28487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28488g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnSendCodeListener f28489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p103gf.a f28490j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28491o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f28492p;
    public List t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f28493v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f28494w;

    public OneTimeCodeV4View(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendOtcButtonStateInternal(final boolean enable) {
        if (this.f28484c != null) {
            if (enable) {
                this.f28486e.removeCallbacks(this.f28482a);
                this.f28486e.setText("");
            }
            this.f28484c.setEnabled(enable);
            if (enable) {
                l();
            } else {
                View view = this.f28485d;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            this.f28484c.setVisibility(enable ? 0 : 8);
            OnSendCodeListener onSendCodeListener = this.f28489i;
            if (onSendCodeListener != null) {
                onSendCodeListener.onButtonVisibilityChange(this.f28484c, enable ? 0 : 8);
            }
        }
    }

    public final void d() {
        this.f28486e.setVisibility(8);
        this.f28485d.setVisibility(4);
        this.f28484c.setVisibility(4);
        OnSendCodeListener onSendCodeListener = this.f28489i;
        if (onSendCodeListener != null) {
            onSendCodeListener.onButtonVisibilityChange(this.f28484c, 4);
        }
    }

    public final SmsChannelRsp e(int i7) {
        List list = this.t;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (SmsChannelRsp smsChannelRsp : this.t) {
            if (smsChannelRsp.type == i7) {
                return smsChannelRsp;
            }
        }
        return null;
    }

    public final String f(int i7, SubscriptionInfo subscriptionInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getContext().getString(k.core_ussd));
        if (subscriptionInfo == null) {
            return sb2.toString();
        }
        String number = subscriptionInfo.getNumber();
        if (i7 > 0) {
            sb2.append(i7);
        }
        if (!TextUtils.isEmpty(number)) {
            u.w(sb2, "(", number, ")");
        }
        return sb2.toString();
    }

    public final void g(int i7, String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            if (z3) {
                k();
            }
        } else {
            if (z3) {
                j(true);
                this.f28485d.setVisibility(8);
            }
            ((PayApiService) p324va.c.f43141a.f14621b).getSmsChannel(str, i7).k(f.f42629b).i(p071ef.b.a()).subscribe(new n0(this, z3, 1));
        }
    }

    public String getEmail() {
        SmsChannelRsp smsChannelRspE = e(3);
        return smsChannelRspE != null ? smsChannelRspE.sender : "";
    }

    public OnSendCodeListener getSendCodeListener() {
        return this.f28489i;
    }

    public final void h() {
        if (this.f28493v) {
            return;
        }
        TextView textView = this.f28486e;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.f28486e;
            RunnableC0336i runnableC0336i = this.f28482a;
            textView2.removeCallbacks(runnableC0336i);
            this.f28486e.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            this.f28486e.post(runnableC0336i);
        }
        TextView textView3 = this.f28487f;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public final void i(int i7) {
        this.f28493v = true;
        if (i7 <= 0) {
            i7 = f28480B;
        }
        f28480B = i7;
        TextView textView = this.f28486e;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.f28486e;
            RunnableC0336i runnableC0336i = this.f28482a;
            textView2.removeCallbacks(runnableC0336i);
            this.f28486e.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            this.f28486e.post(runnableC0336i);
        }
    }

    public final void j(boolean z3) {
        CompleteCallback completeCallback = this.f28481A;
        if (completeCallback != null) {
            completeCallback.onComplete(Boolean.valueOf(z3));
        }
    }

    public final void k() {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int[] iArr = null;
        try {
            activeSubscriptionInfoList = SubscriptionManager.from(getContext()).getActiveSubscriptionInfoList();
        } catch (Exception unused) {
            activeSubscriptionInfoList = null;
        }
        List list = this.t;
        if (list == null || list.isEmpty()) {
            arrayList.add(getContext().getString(k.core_voice_call));
            arrayList2.add(1);
            arrayList3.add(Integer.valueOf(d.core_voice_call));
        } else {
            if (e(4) != null && PhoneUtils.isSimCardReady()) {
                if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.isEmpty()) {
                    arrayList.add(f(-1, null));
                    arrayList2.add(Integer.valueOf(Constants.MAX_URL_LENGTH));
                    arrayList3.add(Integer.valueOf(r.cv_ussd));
                } else if (activeSubscriptionInfoList.size() == 1) {
                    arrayList.add(f(-1, activeSubscriptionInfoList.get(0)));
                    arrayList2.add(Integer.valueOf(activeSubscriptionInfoList.get(0).getSubscriptionId() + Constants.MAX_URL_LENGTH));
                    arrayList3.add(Integer.valueOf(r.cv_ussd));
                } else {
                    Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                    int i7 = 1;
                    while (it.hasNext()) {
                        arrayList.add(f(i7, it.next()));
                        arrayList2.add(Integer.valueOf(activeSubscriptionInfoList.get(0).getSubscriptionId() + Constants.MAX_URL_LENGTH));
                        arrayList3.add(Integer.valueOf(r.cv_ussd));
                        i7++;
                    }
                }
            }
            if (e(1) != null) {
                arrayList.add(getContext().getString(k.core_voice_call));
                arrayList2.add(1);
                arrayList3.add(Integer.valueOf(d.core_voice_call));
            }
            SmsChannelRsp smsChannelRspE = e(3);
            boolean z3 = smsChannelRspE != null && RegexUtils.isEmailMasked(smsChannelRspE.sender);
            if (smsChannelRspE != null && (z3 || RegexUtils.isEmail(smsChannelRspE.sender))) {
                String strC0 = smsChannelRspE.sender;
                if (!z3) {
                    strC0 = r0.C0(strC0);
                }
                arrayList.add(getContext().getString(k.core_email) + "(" + strC0 + ")");
                arrayList2.add(3);
                arrayList3.add(Integer.valueOf(r.cv_email_blue));
            }
            if (e(2) != null) {
                arrayList.add(getContext().getString(k.core_whatsapp));
                arrayList2.add(2);
                arrayList3.add(Integer.valueOf(r.cv_whatsapp));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList3.size() > 0) {
            iArr = new int[arrayList3.size()];
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                iArr[i10] = ((Integer) arrayList3.get(i10)).intValue();
            }
        }
        KeyboardUtils.hideSoftInput(this);
        p pVar = new p(getContext());
        pVar.b(k.core_get_code_via_other_methods);
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new String[arrayList.size()]);
        m0 m0Var = new m0(this, arrayList2, 1);
        Context context = pVar.getContext();
        pVar.setSingleChoiceItems(new o(context, t.cv_layout_dialog_single_choice_item, charSequenceArr, context, iArr, -1), -1, m0Var);
        pVar.show();
    }

    public final void l() {
        if (this.f28485d != null) {
            List list = this.t;
            if (list == null || list.size() < 1) {
                this.f28485d.setVisibility(8);
            } else {
                this.f28485d.setVisibility(0);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = view instanceof TextView ? ((TextView) view).getText().toString() : "";
        int id2 = view.getId();
        if (e.textViewSendSms == id2) {
            h();
            OnSendCodeListener onSendCodeListener = this.f28489i;
            if (onSendCodeListener != null) {
                onSendCodeListener.onSend(this.f28494w, 1, null);
            }
        } else if (e.tvVoiceCall == id2) {
            h();
            OnSendCodeListener onSendCodeListener2 = this.f28489i;
            if (onSendCodeListener2 != null) {
                onSendCodeListener2.onSend(1, 1, null);
            }
        } else if (e.tvWhatsapp == id2) {
            h();
            OnSendCodeListener onSendCodeListener3 = this.f28489i;
            if (onSendCodeListener3 != null) {
                onSendCodeListener3.onSend(2, 1, null);
            }
        } else if (e.tvEmail == id2) {
            h();
            OnSendCodeListener onSendCodeListener4 = this.f28489i;
            if (onSendCodeListener4 != null) {
                onSendCodeListener4.onSend(3, 1, null);
            }
        } else if (e.tvUSSD == id2) {
            h();
            OnSendCodeListener onSendCodeListener5 = this.f28489i;
            if (onSendCodeListener5 != null) {
                onSendCodeListener5.onSend(4, 1, null);
            }
        } else if (e.llOthers == id2 || e.tv2 == id2) {
            List list = this.t;
            if (list == null || list.isEmpty()) {
                g(this.f28492p, this.f28491o, true);
            } else {
                k();
            }
        }
        Pa.n0.g().k((ClickEvent) G.f("registration_verification_code_page_element_click", "element_name", string));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103gf.a aVar = this.f28490j;
        if (aVar != null) {
            aVar.dispose();
            this.f28490j = null;
        }
    }

    public void setCode(String code) {
        PinEntryView pinEntryView;
        if (TextUtils.isEmpty(code) || !TextUtils.isDigitsOnly(code) || (pinEntryView = this.f28483b) == null || code.equalsIgnoreCase(pinEntryView.getText().toString())) {
            return;
        }
        this.f28483b.setText(code);
    }

    public void setCodeEnteredListener(PinEntryView.OnPinEnteredListener listener) {
        PinEntryView pinEntryView = this.f28483b;
        if (pinEntryView != null) {
            pinEntryView.setOnPinEnteredListener(listener);
        }
    }

    public void setDefaultOtpType(int type) {
        this.f28494w = type;
        this.f28484c.setText(type == 3 ? k.core_send_code : k.core_send_sms);
    }

    public void setLoadingCallback(CompleteCallback<Boolean> mLoadingCallback) {
        this.f28481A = mLoadingCallback;
    }

    public void setMobileNumber(String mobile) {
        this.f28491o = mobile;
        this.f28492p = 99;
        g(99, mobile, false);
    }

    public void setSendCodeListener(OnSendCodeListener listener) {
        this.f28489i = listener;
    }

    public void setSendOtcButtonState(final boolean enable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            setSendOtcButtonStateInternal(enable);
        } else {
            post(new D.b(this, enable, 7));
        }
    }

    public void setSmsMessageV2(boolean smsMessageV2) {
        this.f28493v = smsMessageV2;
    }

    public OneTimeCodeV4View(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OneTimeCodeV4View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f28488g = true;
        this.f28492p = 99;
        this.f28493v = false;
        this.f28494w = 0;
        View.inflate(context, g.core_layout_one_time_code_v4_view, this);
        f28480B = 60000;
        RunnableC0336i runnableC0336i = new RunnableC0336i(5);
        runnableC0336i.f4657b = new WeakReference(this);
        this.f28482a = runnableC0336i;
        this.f28490j = new p103gf.a();
        this.f28483b = (PinEntryView) findViewById(e.smsCodeView);
        this.f28484c = (TextView) findViewById(e.textViewSendSms);
        this.f28486e = (TextView) findViewById(e.tvTime);
        this.f28485d = findViewById(e.llOthers);
        this.f28487f = (TextView) findViewById(e.tvInputError);
        this.f28484c.setOnClickListener(this);
        findViewById(e.tv2).setOnClickListener(this);
    }
}
