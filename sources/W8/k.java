package W8;

import Pa.n0;
import android.text.TextUtils;
import com.transsnet.palmpay.account.bean.LogInReq;
import com.transsnet.palmpay.account.bean.rsp.PreCheckPhoneRsp;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithPswFragment;
import com.transsnet.palmpay.core.callback.Argument2Callback;
import com.transsnet.palmpay.custom_view.PinEntryView;
import com.transsnet.palmpay.util.KeyboardUtils;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1623u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Argument2Callback, PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogInWithPswFragment f10589a;

    public /* synthetic */ k(LogInWithPswFragment logInWithPswFragment) {
        this.f10589a = logInWithPswFragment;
    }

    @Override // com.transsnet.palmpay.core.callback.Argument2Callback
    public void invoke(Object obj, Object obj2) {
        LogInActivity logInActivityV;
        LogInActivity logInActivityV2;
        PreCheckPhoneRsp preCheckPhoneRsp;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i7 = LogInWithPswFragment.f26216p;
        boolean zIsEmpty = TextUtils.isEmpty((String) obj);
        LogInWithPswFragment logInWithPswFragment = this.f10589a;
        if ((zIsEmpty && (!zBooleanValue || (logInActivityV2 = logInWithPswFragment.v()) == null || (preCheckPhoneRsp = logInActivityV2.t) == null || preCheckPhoneRsp.needNameVerify)) || (logInActivityV = logInWithPswFragment.v()) == null) {
            return;
        }
        logInActivityV.v();
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String pin) {
        int i7 = LogInWithPswFragment.f26216p;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (TextUtils.isEmpty(pin) || pin.length() != L8.c.f5561b) {
            return;
        }
        LogInWithPswFragment logInWithPswFragment = this.f10589a;
        KeyboardUtils.hideSoftInput(logInWithPswFragment.getActivity());
        LogInActivity logInActivityV = logInWithPswFragment.v();
        if (logInActivityV != null) {
            logInActivityV.z(pin);
            LogInReq logInReq = logInActivityV.f25888b;
            if (logInReq != null) {
                logInReq.pinType = 10;
            }
            n0.g().m("PalmPayLogin_VerifyType", "VerifyType", "password");
            Integer numB = L8.a.b(logInWithPswFragment.v(), logInWithPswFragment.f26217j, logInWithPswFragment.getArguments());
            if (numB == null) {
                logInActivityV.v();
                return;
            }
            C1623u c1623u = (C1623u) logInWithPswFragment.f27328i;
            if (c1623u != null) {
                LogInActivity logInActivityV2 = logInWithPswFragment.v();
                c1623u.checkPassword(pin, logInActivityV2 != null ? logInActivityV2.f25879B : null, numB.intValue());
            }
        }
    }
}
