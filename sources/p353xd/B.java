package p353xd;

import Kd.C0416t1;
import Kd.C0419u1;
import L6.b;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import S6.a;
import V9.ViewOnFocusChangeListenerC0713b;
import android.content.Intent;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import com.google.gson.Gson;
import com.hjq.toast.config.IToast;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.liveness.ui.LivenessActivity;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.bean.ConfigReq;
import com.transsnet.palmpay.send_money.bean.req.ExtendField;
import com.transsnet.palmpay.send_money.bean.req.MemberDetailReq;
import com.transsnet.palmpay.send_money.bean.resp.MemberDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.tobank.TransferToBankInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayHomeActivity;
import com.transsnet.palmpay.send_money.ui.activity.topp.TransferToPalmPayInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.TransferViaUssdActivity;
import com.transsnet.palmpay.send_money.viewmodel.BaseTransferHistoryViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankViewModel;
import com.transsnet.palmpay.util.SpanUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p140j8.f;
import p159kd.h;
import p327vd.c;
import p355xf.t;
import p369yd.p;
import p377z5.k;
import p382zb.A;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43852b;

    public /* synthetic */ B(Object obj, int i7) {
        this.f43851a = i7;
        this.f43852b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 2;
        String str = "";
        String strSubstring = null;
        Object obj = this.f43852b;
        switch (this.f43851a) {
            case 0:
                TransferToBankInputAmountActivity transferToBankInputAmountActivity = (TransferToBankInputAmountActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    TransferToBankInputAmountActivity.n(transferToBankInputAmountActivity);
                    Intent intent = transferToBankInputAmountActivity.getIntent();
                    if (intent != null) {
                        String stringExtra = intent.getStringExtra("BANK_ACCOUNT_NUMBER");
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        transferToBankInputAmountActivity.f33527f = stringExtra;
                        String stringExtra2 = intent.getStringExtra("contact_name");
                        if (stringExtra2 != null) {
                            str = stringExtra2;
                        }
                        transferToBankInputAmountActivity.f33528g = str;
                        transferToBankInputAmountActivity.f33526e = (BankInfo) intent.getParcelableExtra("BANK_CARD_INFO");
                        transferToBankInputAmountActivity.f33530j = intent.getStringExtra("core_order_source_type");
                        transferToBankInputAmountActivity.f33529i = intent.getBooleanExtra("receiveAccountNameFlag", true);
                        TransferToBankInputAmountActivity.o(transferToBankInputAmountActivity);
                    }
                    ConfigReq req = new ConfigReq();
                    req.setPayeeAccountType(6);
                    TransferToBankViewModel transferToBankViewModel = (TransferToBankViewModel) transferToBankInputAmountActivity.l();
                    transferToBankViewModel.getClass();
                    Intrinsics.checkNotNullParameter(req, "req");
                    f.s(transferToBankViewModel, new C0419u1(req, null), transferToBankViewModel.f34057g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    TransferToBankViewModel transferToBankViewModel2 = (TransferToBankViewModel) transferToBankInputAmountActivity.l();
                    BankInfo bankInfo = transferToBankInputAmountActivity.f33526e;
                    String str2 = bankInfo != null ? bankInfo.bankCode : null;
                    String str3 = transferToBankInputAmountActivity.f33527f;
                    Boolean boolValueOf = Boolean.valueOf(transferToBankInputAmountActivity.f33529i);
                    transferToBankViewModel2.getClass();
                    f.s(transferToBankViewModel2, new C0416t1(str2, str3, boolValueOf, null), transferToBankViewModel2.f34060o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 1:
                LivenessActivity livenessActivity = (LivenessActivity) obj;
                livenessActivity.getWindow().getDecorView().setBackgroundColor(livenessActivity.f23838A[livenessActivity.f23839B].intValue());
                livenessActivity.f23839B = (livenessActivity.f23839B + 1) % livenessActivity.f23838A.length;
                livenessActivity.f23858w.postDelayed(this, 200L);
                return;
            case 2:
                TransferToPalmPayHomeActivity transferToPalmPayHomeActivity = (TransferToPalmPayHomeActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    n0.p(transferToPalmPayHomeActivity.getIntent());
                    TransferToPalmPayHomeActivity.l(transferToPalmPayHomeActivity);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 3:
                TransferToPalmPayInputAmountActivity transferToPalmPayInputAmountActivity = (TransferToPalmPayInputAmountActivity) obj;
                Trace.beginSection("delayInit");
                try {
                    TransferToPalmPayInputAmountActivity.n(transferToPalmPayInputAmountActivity);
                    if (transferToPalmPayInputAmountActivity.f33614g != 5) {
                        BaseTransferHistoryViewModel baseTransferHistoryViewModel = (BaseTransferHistoryViewModel) transferToPalmPayInputAmountActivity.l();
                        String str4 = transferToPalmPayInputAmountActivity.f33611d;
                        int i10 = transferToPalmPayInputAmountActivity.f33614g;
                        Boolean bool = transferToPalmPayInputAmountActivity.f33617o;
                        C0525w c0525wF = C0525w.f();
                        ExtendField extendField = new ExtendField(null, 1, null);
                        extendField.setNeedShowAccountNo(transferToPalmPayInputAmountActivity.f33613f);
                        Unit unit = Unit.f38893a;
                        baseTransferHistoryViewModel.f(new MemberDetailReq(str4, Integer.valueOf(i10), ((Gson) c0525wF.f7166b).toJson(extendField), bool));
                    } else {
                        if (!TextUtils.isEmpty(transferToPalmPayInputAmountActivity.f33612e)) {
                            String str5 = transferToPalmPayInputAmountActivity.f33612e;
                            if ((str5 != null ? str5.length() : 0) > 10) {
                                String str6 = transferToPalmPayInputAmountActivity.f33612e;
                                if (str6 != null) {
                                    strSubstring = str6.substring(str6.length() - 10);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                }
                                transferToPalmPayInputAmountActivity.f33612e = strSubstring;
                            }
                        }
                        transferToPalmPayInputAmountActivity.f33612e = r0.a0(transferToPalmPayInputAmountActivity.f33612e);
                        MemberDetailResp memberDetailResp = new MemberDetailResp();
                        memberDetailResp.setPhone(transferToPalmPayInputAmountActivity.f33612e);
                        transferToPalmPayInputAmountActivity.t = memberDetailResp;
                        TransferToPalmPayInputAmountActivity.o(transferToPalmPayInputAmountActivity, memberDetailResp, Integer.valueOf(transferToPalmPayInputAmountActivity.f33614g), transferToPalmPayInputAmountActivity.f33615i, !TextUtils.isEmpty(transferToPalmPayInputAmountActivity.f33611d));
                    }
                    transferToPalmPayInputAmountActivity.r();
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
                WeakReference weakReference = ((k) obj).f44477b;
                IToast iToast = weakReference != null ? (IToast) weakReference.get() : null;
                if (iToast == null) {
                    return;
                }
                iToast.cancel();
                return;
            case 5:
                ((AlgorithmScheduleProgressBar) obj).f23878b = false;
                return;
            default:
                TransferViaUssdActivity transferViaUssdActivity = (TransferViaUssdActivity) obj;
                t tVar = transferViaUssdActivity.f33629a;
                Trace.beginSection("delayInit");
                try {
                    int i11 = TransferViaUssdActivity.f33628A;
                    transferViaUssdActivity.p();
                    transferViaUssdActivity.o().setHint(new SpanUtils().append(transferViaUssdActivity.getString(h.sm_select_your_bank)).setForegroundColor(transferViaUssdActivity.getColor(b.ppColorTextDisable)).setFontFamily("sans-serif").create());
                    transferViaUssdActivity.l().setHint(new SpanUtils().append("").append(transferViaUssdActivity.getString(h.sm_enter_10_digit_account_number)).setFontFamily("sans-serif").create());
                    transferViaUssdActivity.l().setInputType(2);
                    p220oa.h.r(transferViaUssdActivity.l(), new A(transferViaUssdActivity, i7), new ViewOnFocusChangeListenerC0713b(transferViaUssdActivity, 8));
                    transferViaUssdActivity.m().setTextInputListener(new p384zd.h(transferViaUssdActivity));
                    SpannableStringBuilder spannableStringBuilderCreate = new SpanUtils().append("Enter " + r0.A(1000L) + "-" + r0.A(500000000L)).setFontSize(18, true).create();
                    Intrinsics.checkNotNullExpressionValue(spannableStringBuilderCreate, "create(...)");
                    transferViaUssdActivity.m().setHintText(spannableStringBuilderCreate);
                    transferViaUssdActivity.m().setCurrencySymbol(BaseApplication.getCurrencySymbol());
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    TextView textView = (TextView) value;
                    if (textView != null) {
                        SpanUtils spanUtils = new SpanUtils();
                        IconicsDrawable iconicsDrawable = new IconicsDrawable(transferViaUssdActivity, a.pay_Phone);
                        iconicsDrawable.a(new p(transferViaUssdActivity, 4));
                        textView.setText(spanUtils.appendImage(iconicsDrawable).append("Dial USSD").create());
                    }
                    IconicsTextView iconicsTextViewO = transferViaUssdActivity.o();
                    c cVar = transferViaUssdActivity.f33641w;
                    if (iconicsTextViewO != null) {
                        iconicsTextViewO.setOnClickListener(cVar);
                    }
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    TextView textView2 = (TextView) value2;
                    if (textView2 != null) {
                        textView2.setOnClickListener(cVar);
                        break;
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
