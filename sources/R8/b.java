package R8;

import Ab.D;
import N8.r;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.req.CheckPinTouchWithOrderReq;
import com.transsnet.palmpay.account.ui.activity.AuthenticationActivity;
import com.transsnet.palmpay.account.ui.fragment.auth.AuthPinFragment;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.security.utils.SecurityUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AuthPinFragment f7936a;

    public b(AuthPinFragment authPinFragment) {
        this.f7936a = authPinFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public final void onPinEntered(String str) {
        if (str == null || str.length() != 4) {
            return;
        }
        AuthPinFragment authPinFragment = this.f7936a;
        AuthenticationActivity authenticationActivity = (AuthenticationActivity) authPinFragment.getActivity();
        if (authenticationActivity == null || TextUtils.isEmpty(authenticationActivity.f25831b)) {
            (authPinFragment.f26099v ? G8.a.t().checkTransferPin(SecurityUtils.a(str)) : G8.a.t().checkPin(SecurityUtils.a(str))).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new r(authPinFragment, 2, str, false));
            return;
        }
        String str2 = authenticationActivity.f25831b;
        CheckPinTouchWithOrderReq checkPinTouchWithOrderReq = new CheckPinTouchWithOrderReq();
        checkPinTouchWithOrderReq.orderNo = str2;
        checkPinTouchWithOrderReq.payPinOrTouch = SecurityUtils.a(str);
        checkPinTouchWithOrderReq.payPinOrTouchFlag = "0";
        G8.a.t().checkPinTouchWithOrder(checkPinTouchWithOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(authPinFragment, 25));
    }
}
