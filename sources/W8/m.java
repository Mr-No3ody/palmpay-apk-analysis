package W8;

import Bc.C0107d;
import Pa.r0;
import android.text.TextUtils;
import com.transsnet.palmpay.account.ui.activity.LogInActivity;
import com.transsnet.palmpay.account.ui.fragment.login.LogInWithRiskControlSmsFragment;
import com.transsnet.palmpay.core.listener.OnSendCodeListener;
import com.transsnet.palmpay.core.viewmodel.OneTimeCodeV3View;
import com.transsnet.palmpay.custom_view.PinEntryView;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1623u;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m implements OnSendCodeListener, PinEntryView.OnPinEnteredListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LogInWithRiskControlSmsFragment f10592a;

    public /* synthetic */ m(LogInWithRiskControlSmsFragment logInWithRiskControlSmsFragment) {
        this.f10592a = logInWithRiskControlSmsFragment;
    }

    @Override // com.transsnet.palmpay.custom_view.PinEntryView.OnPinEnteredListener
    public void onPinEntered(String code) {
        int i7 = LogInWithRiskControlSmsFragment.t;
        Intrinsics.checkNotNullParameter(code, "code");
        if (TextUtils.isEmpty(code) || code.length() < 4) {
            return;
        }
        LogInWithRiskControlSmsFragment logInWithRiskControlSmsFragment = this.f10592a;
        C1623u c1623u = (C1623u) logInWithRiskControlSmsFragment.f27328i;
        if (c1623u != null) {
            LogInActivity logInActivityV = logInWithRiskControlSmsFragment.v();
            String str = logInActivityV != null ? logInActivityV.f25879B : "";
            C0107d c0107d = logInWithRiskControlSmsFragment.f26221p;
            c1623u.checkSmsCode(str, c0107d != null ? ((OneTimeCodeV3View) c0107d.f683e).getEmail() : null, code, 13);
        }
    }

    @Override // com.transsnet.palmpay.core.listener.OnSendCodeListener
    public void onSend(int i7, int i10, String str) {
        LogInWithRiskControlSmsFragment logInWithRiskControlSmsFragment = this.f10592a;
        logInWithRiskControlSmsFragment.f26220o = i10;
        if (i7 == 4 && !TextUtils.isEmpty(str)) {
            Intrinsics.e(str);
            logInWithRiskControlSmsFragment.f26219j = str;
            if (r0.j(logInWithRiskControlSmsFragment.v(), logInWithRiskControlSmsFragment.f26220o, logInWithRiskControlSmsFragment.f26219j, 740, logInWithRiskControlSmsFragment)) {
                logInWithRiskControlSmsFragment.showLoadingDialog(true);
                return;
            }
            return;
        }
        C1623u c1623u = (C1623u) logInWithRiskControlSmsFragment.f27328i;
        if (c1623u != null) {
            LogInActivity logInActivityV = logInWithRiskControlSmsFragment.v();
            String str2 = logInActivityV != null ? logInActivityV.f25879B : "";
            C0107d c0107d = logInWithRiskControlSmsFragment.f26221p;
            c1623u.getSmsCode(str2, c0107d != null ? ((OneTimeCodeV3View) c0107d.f683e).getEmail() : null, i7, 13);
        }
    }
}
