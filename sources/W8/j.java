package W8;

import I8.u;
import Pa.n0;
import android.os.Bundle;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPinFragment;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.security.utils.SecurityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1623u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements PinEntryView.OnPinEnteredListener, Argument2Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogInWithPinFragment f10588a;

    public /* synthetic */ j(LogInWithPinFragment logInWithPinFragment) {
        this.f10588a = logInWithPinFragment;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        LogInActivity logInActivityU;
        LogInActivity logInActivityU2;
        PreCheckPhoneRsp preCheckPhoneRsp;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i7 = LogInWithPinFragment.f26213p;
        boolean zIsEmpty = TextUtils.isEmpty((String) obj);
        LogInWithPinFragment logInWithPinFragment = this.f10588a;
        if ((zIsEmpty && (!zBooleanValue || (logInActivityU2 = logInWithPinFragment.u()) == null || (preCheckPhoneRsp = logInActivityU2.t) == null || preCheckPhoneRsp.needNameVerify)) || (logInActivityU = logInWithPinFragment.u()) == null) {
            return;
        }
        logInActivityU.v();
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String pin) {
        int i7 = LogInWithPinFragment.f26213p;
        Intrinsics.checkNotNullParameter(pin, "pin");
        LogInWithPinFragment logInWithPinFragment = this.f10588a;
        u uVar = logInWithPinFragment.f26215o;
        if (uVar != null) {
            p220oa.h.s(uVar.f4234o, false);
        }
        if (TextUtils.isEmpty(pin) || pin.length() != L8.c.f5560a) {
            return;
        }
        KeyboardUtils.hideSoftInput(logInWithPinFragment.getActivity());
        n0.g().m("PalmPayLogin_VerifyType", "VerifyType", "pin");
        LogInActivity logInActivityU = logInWithPinFragment.u();
        if (logInActivityU != null) {
            logInActivityU.y(pin);
            LogInReq logInReq = logInActivityU.f25888b;
            if (logInReq != null) {
                logInReq.pinType = 1;
            }
            Integer numB = L8.a.b(logInWithPinFragment.u(), logInWithPinFragment.f26214j, new Bundle());
            if (numB == null) {
                logInActivityU.v();
                return;
            }
            C1623u c1623u = (C1623u) logInWithPinFragment.f27328i;
            if (c1623u != null) {
                String strA = SecurityUtils.a(pin);
                LogInActivity logInActivityU2 = logInWithPinFragment.u();
                c1623u.checkPin(strA, logInActivityU2 != null ? logInActivityU2.f25879B : null, numB.intValue());
            }
        }
    }
}
