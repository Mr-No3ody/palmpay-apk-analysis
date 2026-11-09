package Ja;

import Pa.r0;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.UssdDialBean;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.ReportUssdRespondReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.ui.dialog.UssdDialingDialog;
import com.transsnet.palmpay.core.ui.fragment.verify.CheckUssdAirtimeSharePinFragment;
import com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class K implements UssdDialingDialog.OnUssdDialingListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CheckUssdAirtimeSharePinFragment f4633a;

    public K(CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment) {
        this.f4633a = checkUssdAirtimeSharePinFragment;
    }

    @Override // com.transsnet.palmpay.core.ui.dialog.UssdDialingDialog.OnUssdDialingListener
    public final void onCountdownCompleted() {
        CheckUssdAirtimeSharePinFragment.z(this.f4633a);
    }

    @Override // com.transsnet.palmpay.core.ui.dialog.UssdDialingDialog.OnUssdDialingListener
    public final void onCountdownStart() {
        final CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment = this.f4633a;
        UssdDialBean ussdDialBean = checkUssdAirtimeSharePinFragment.f28038C;
        if (ussdDialBean != null) {
            Integer num = ussdDialBean.subscriptionId;
            if ((num != null ? num.intValue() : 0) > 0 && !TextUtils.isEmpty(ussdDialBean.ussdCode)) {
                androidx.fragment.app.E eRequireActivity = checkUssdAirtimeSharePinFragment.requireActivity();
                Integer num2 = ussdDialBean.subscriptionId;
                r0.j(eRequireActivity, num2 != null ? num2.intValue() : 0, ussdDialBean.ussdCode, MessageEvent.EVENT_NOTIFICATION_ARRIVE, new UssdUtils$UssdResponseCallback() { // from class: Ja.J
                    @Override // com.transsnet.palmpay.core.util.UssdUtils$UssdResponseCallback
                    public final void onReceiveUssdResponse(boolean z3, String str, CharSequence charSequence, int i7) {
                        String string = charSequence.toString();
                        CheckUssdAirtimeSharePinFragment.a aVar = CheckUssdAirtimeSharePinFragment.f28035L;
                        CheckUssdAirtimeSharePinFragment checkUssdAirtimeSharePinFragment2 = checkUssdAirtimeSharePinFragment;
                        if (ActivityUtils.isValidActivityContext(checkUssdAirtimeSharePinFragment2.requireActivity())) {
                            PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                            ReportUssdRespondReq reportUssdRespondReq = new ReportUssdRespondReq();
                            PayByOrderResp.DataBean dataBean = checkUssdAirtimeSharePinFragment2.f28036A;
                            if (dataBean != null) {
                                reportUssdRespondReq.transactionId = dataBean.channelTransactionId;
                            }
                            UssdDialBean ussdDialBean2 = checkUssdAirtimeSharePinFragment2.f28038C;
                            if (ussdDialBean2 != null) {
                                reportUssdRespondReq.code = ussdDialBean2.billerName;
                            }
                            reportUssdRespondReq.ussdMsg = string;
                            payApiService.reportUssdRespond(reportUssdRespondReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new I(checkUssdAirtimeSharePinFragment2, 1));
                        }
                    }
                });
            }
        }
    }
}
