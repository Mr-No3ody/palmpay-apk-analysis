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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import com.google.firebase.perf.util.Constants;
import com.transsnet.palmpay.core.bean.rsp.SmsChannelRsp;
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
import com.wang.avi.AVLoadingIndicatorView;
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
public class OneTimeCodeV3View extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static int f28465B = 60000;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f28466A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RunnableC0336i f28467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PinEntryView f28468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f28469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f28470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f28471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f28472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AVLoadingIndicatorView f28473g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f28474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public OnSendCodeListener f28475j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p103gf.a f28476o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28477p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f28478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f28479w;

    public OneTimeCodeV3View(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendOtcButtonStateInternal(final boolean enable) {
        if (this.f28469c != null) {
            if (enable) {
                this.f28471e.removeCallbacks(this.f28467a);
                this.f28471e.setText("");
            }
            this.f28469c.setEnabled(enable);
            this.f28470d.setVisibility(enable ? 0 : 8);
            this.f28469c.setVisibility(enable ? 0 : 8);
            OnSendCodeListener onSendCodeListener = this.f28475j;
            if (onSendCodeListener != null) {
                onSendCodeListener.onButtonVisibilityChange(this.f28469c, enable ? 0 : 8);
            }
        }
    }

    public final SmsChannelRsp b(int i7) {
        List list = this.f28478v;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (SmsChannelRsp smsChannelRsp : this.f28478v) {
            if (smsChannelRsp.type == i7) {
                return smsChannelRsp;
            }
        }
        return null;
    }

    public final String c(int i7, SubscriptionInfo subscriptionInfo) {
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

    public final void d(int i7, String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            if (z3) {
                g();
            }
        } else {
            if (z3) {
                this.f28473g.setVisibility(0);
                this.f28470d.setVisibility(8);
            }
            ((PayApiService) p324va.c.f43141a.f14621b).getSmsChannel(str, i7).k(f.f42629b).i(p071ef.b.a()).subscribe(new n0(this, z3, 0));
        }
    }

    public final void e() {
        if (this.f28479w) {
            return;
        }
        TextView textView = this.f28471e;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.f28471e;
            RunnableC0336i runnableC0336i = this.f28467a;
            textView2.removeCallbacks(runnableC0336i);
            this.f28471e.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            this.f28471e.post(runnableC0336i);
        }
        TextView textView3 = this.f28472f;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
    }

    public final void f(int i7) {
        this.f28479w = true;
        if (i7 <= 0) {
            i7 = f28465B;
        }
        f28465B = i7;
        TextView textView = this.f28471e;
        if (textView != null) {
            textView.setVisibility(0);
            TextView textView2 = this.f28471e;
            RunnableC0336i runnableC0336i = this.f28467a;
            textView2.removeCallbacks(runnableC0336i);
            this.f28471e.setTag(Long.valueOf(SystemClock.elapsedRealtime()));
            setSendOtcButtonStateInternal(false);
            this.f28471e.post(runnableC0336i);
        }
    }

    public final void g() {
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
        List list = this.f28478v;
        if (list == null || list.isEmpty()) {
            arrayList.add(getContext().getString(k.core_voice_call));
            arrayList2.add(1);
            arrayList3.add(Integer.valueOf(d.core_voice_call));
        } else {
            if (b(4) != null && PhoneUtils.isSimCardReady()) {
                if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.isEmpty()) {
                    arrayList.add(c(-1, null));
                    arrayList2.add(Integer.valueOf(Constants.MAX_URL_LENGTH));
                    arrayList3.add(Integer.valueOf(r.cv_ussd));
                } else if (activeSubscriptionInfoList.size() == 1) {
                    arrayList.add(c(-1, activeSubscriptionInfoList.get(0)));
                    arrayList2.add(Integer.valueOf(activeSubscriptionInfoList.get(0).getSubscriptionId() + Constants.MAX_URL_LENGTH));
                    arrayList3.add(Integer.valueOf(r.cv_ussd));
                } else {
                    Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                    int i7 = 1;
                    while (it.hasNext()) {
                        arrayList.add(c(i7, it.next()));
                        arrayList2.add(Integer.valueOf(activeSubscriptionInfoList.get(0).getSubscriptionId() + Constants.MAX_URL_LENGTH));
                        arrayList3.add(Integer.valueOf(r.cv_ussd));
                        i7++;
                    }
                }
            }
            if (b(1) != null) {
                arrayList.add(getContext().getString(k.core_voice_call));
                arrayList2.add(1);
                arrayList3.add(Integer.valueOf(d.core_voice_call));
            }
            SmsChannelRsp smsChannelRspB = b(3);
            boolean z3 = smsChannelRspB != null && RegexUtils.isEmailMasked(smsChannelRspB.sender);
            if (smsChannelRspB != null && (z3 || RegexUtils.isEmail(smsChannelRspB.sender))) {
                String strC0 = smsChannelRspB.sender;
                if (!z3) {
                    strC0 = r0.C0(strC0);
                }
                arrayList.add(getContext().getString(k.core_email) + "(" + strC0 + ")");
                arrayList2.add(3);
                arrayList3.add(Integer.valueOf(r.cv_email_blue));
            }
            if (b(2) != null) {
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
        m0 m0Var = new m0(this, arrayList2, 0);
        Context context = pVar.getContext();
        pVar.setSingleChoiceItems(new o(context, t.cv_layout_dialog_single_choice_item, charSequenceArr, context, iArr, -1), -1, m0Var);
        pVar.show();
    }

    public String getEmail() {
        SmsChannelRsp smsChannelRspB = b(3);
        return smsChannelRspB != null ? smsChannelRspB.sender : "";
    }

    public OnSendCodeListener getSendCodeListener() {
        return this.f28475j;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String string = view instanceof TextView ? ((TextView) view).getText().toString() : "";
        int id2 = view.getId();
        if (e.textViewSendSms == id2) {
            e();
            OnSendCodeListener onSendCodeListener = this.f28475j;
            if (onSendCodeListener != null) {
                onSendCodeListener.onSend(this.f28466A, 1, null);
            }
        } else if (e.tvVoiceCall == id2) {
            e();
            OnSendCodeListener onSendCodeListener2 = this.f28475j;
            if (onSendCodeListener2 != null) {
                onSendCodeListener2.onSend(1, 1, null);
            }
        } else if (e.tvWhatsapp == id2) {
            e();
            OnSendCodeListener onSendCodeListener3 = this.f28475j;
            if (onSendCodeListener3 != null) {
                onSendCodeListener3.onSend(2, 1, null);
            }
        } else if (e.tvEmail == id2) {
            e();
            OnSendCodeListener onSendCodeListener4 = this.f28475j;
            if (onSendCodeListener4 != null) {
                onSendCodeListener4.onSend(3, 1, null);
            }
        } else if (e.tvUSSD == id2) {
            e();
            OnSendCodeListener onSendCodeListener5 = this.f28475j;
            if (onSendCodeListener5 != null) {
                onSendCodeListener5.onSend(4, 1, null);
            }
        } else if (e.llOthers == id2) {
            List list = this.f28478v;
            if (list == null || list.isEmpty()) {
                d(this.t, this.f28477p, true);
            } else {
                g();
            }
        }
        Pa.n0.g().k((ClickEvent) G.f("registration_verification_code_page_element_click", "element_name", string));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p103gf.a aVar = this.f28476o;
        if (aVar != null) {
            aVar.dispose();
            this.f28476o = null;
        }
    }

    public void setCode(String code) {
        PinEntryView pinEntryView;
        if (TextUtils.isEmpty(code) || !TextUtils.isDigitsOnly(code) || (pinEntryView = this.f28468b) == null) {
            return;
        }
        pinEntryView.setText(code);
    }

    public void setCodeEnteredListener(PinEntryView.OnPinEnteredListener listener) {
        PinEntryView pinEntryView = this.f28468b;
        if (pinEntryView != null) {
            pinEntryView.setOnPinEnteredListener(listener);
        }
    }

    public void setDefaultOtpType(int type) {
        this.f28466A = type;
        this.f28469c.setText(type == 3 ? k.core_send_code : k.core_send_sms);
    }

    public void setMobileNumber(String mobile) {
        this.f28477p = mobile;
        this.t = 99;
        d(99, mobile, false);
    }

    public void setSendCodeListener(OnSendCodeListener listener) {
        this.f28475j = listener;
    }

    public void setSendOtcButtonState(final boolean enable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            setSendOtcButtonStateInternal(enable);
        } else {
            post(new D.b(this, enable, 6));
        }
    }

    public void setSmsMessageV2(boolean smsMessageV2) {
        this.f28479w = smsMessageV2;
    }

    public OneTimeCodeV3View(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OneTimeCodeV3View(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f28474i = true;
        this.t = 99;
        this.f28479w = false;
        this.f28466A = 0;
        setOrientation(1);
        View.inflate(context, g.core_layout_one_time_code_v3_view, this);
        f28465B = 60000;
        RunnableC0336i runnableC0336i = new RunnableC0336i(4);
        runnableC0336i.f4657b = new WeakReference(this);
        this.f28467a = runnableC0336i;
        this.f28476o = new p103gf.a();
        this.f28468b = (PinEntryView) findViewById(e.smsCodeView);
        this.f28469c = (TextView) findViewById(e.textViewSendSms);
        this.f28471e = (TextView) findViewById(e.tvTime);
        this.f28470d = (LinearLayout) findViewById(e.llOthers);
        this.f28473g = (AVLoadingIndicatorView) findViewById(e.loadingView);
        this.f28472f = (TextView) findViewById(e.tvInputError);
        this.f28469c.setOnClickListener(this);
        this.f28470d.setOnClickListener(this);
    }
}
