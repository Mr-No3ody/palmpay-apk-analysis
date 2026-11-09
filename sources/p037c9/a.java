package p037c9;

import C0.G;
import Pa.g0;
import android.view.View;
import com.transsnet.palmpay.account.bean.req.CheckSecurityVerifyMethodReq;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.fragment.verify.VerifyAccountFaceFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountFaceFragment f18876b;

    public /* synthetic */ a(VerifyAccountFaceFragment verifyAccountFaceFragment, int i7) {
        this.f18875a = i7;
        this.f18876b = verifyAccountFaceFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strQ = null;
        switch (this.f18875a) {
            case 0:
                VerifyAccountFaceFragment verifyAccountFaceFragment = this.f18876b;
                if (verifyAccountFaceFragment.f26310v) {
                    CheckSecurityVerifyMethodReq checkSecurityVerifyMethodReq = new CheckSecurityVerifyMethodReq();
                    checkSecurityVerifyMethodReq.flowId = verifyAccountFaceFragment.f26306j;
                    checkSecurityVerifyMethodReq.verifyMethod = 5;
                    HashMap<String, Object> verifyParams = new HashMap<>();
                    checkSecurityVerifyMethodReq.verifyParams = verifyParams;
                    Intrinsics.checkNotNullExpressionValue(verifyParams, "verifyParams");
                    verifyParams.put("faceToken", null);
                    HashMap<String, Object> verifyParams2 = checkSecurityVerifyMethodReq.verifyParams;
                    Intrinsics.checkNotNullExpressionValue(verifyParams2, "verifyParams");
                    verifyParams2.put("other", Boolean.TRUE);
                    VerifyAccountActivity verifyAccountActivityW = verifyAccountFaceFragment.w();
                    if (verifyAccountActivityW != null) {
                        verifyAccountActivityW.p(checkSecurityVerifyMethodReq);
                    }
                }
                break;
            default:
                int i7 = VerifyAccountFaceFragment.f26307w;
                VerifyAccountFaceFragment verifyAccountFaceFragment2 = this.f18876b;
                if (BaseApplication.hasLogin()) {
                    strQ = G.A();
                } else {
                    VerifyAccountActivity verifyAccountActivityW2 = verifyAccountFaceFragment2.w();
                    if (verifyAccountActivityW2 != null) {
                        strQ = verifyAccountActivityW2.q();
                    }
                }
                g0.f(g0.f7080h.getInstance(), verifyAccountFaceFragment2, verifyAccountFaceFragment2.t, verifyAccountFaceFragment2, verifyAccountFaceFragment2.f26308o, strQ, true);
                break;
        }
    }
}
