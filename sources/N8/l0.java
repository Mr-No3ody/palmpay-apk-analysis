package N8;

import com.transsnet.palmpay.account.bean.rsp.CheckSecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.bean.rsp.SecurityVerifyMethodRsp;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VerifyAccountActivity f6236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CommonBeanResult f6237c;

    public /* synthetic */ l0(VerifyAccountActivity verifyAccountActivity, CommonBeanResult commonBeanResult, int i7) {
        this.f6235a = i7;
        this.f6236b = verifyAccountActivity;
        this.f6237c = commonBeanResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6235a) {
            case 0:
                int i7 = p025ba.k.core_opps;
                String str = ((SecurityVerifyMethodRsp) this.f6237c.data).errorMsg;
                int i10 = p025ba.k.core_confirm;
                VerifyAccountActivity verifyAccountActivity = this.f6236b;
                io.fastkv.n.O(verifyAccountActivity, 0, Integer.valueOf(i7), null, null, null, null, str, Integer.valueOf(i10), null, new k0(verifyAccountActivity, 0), null, null, null, null, true, 0, 8305277);
                break;
            case 1:
                Integer numValueOf = Integer.valueOf(p025ba.k.core_opps);
                String respMsg = this.f6237c.getRespMsg();
                Integer numValueOf2 = Integer.valueOf(p025ba.k.core_confirm);
                VerifyAccountActivity verifyAccountActivity2 = this.f6236b;
                io.fastkv.n.O(verifyAccountActivity2, 0, numValueOf, null, null, null, null, respMsg, numValueOf2, null, null, null, null, null, null, false, 0, 8388221).setOnDismissListener(new n0(verifyAccountActivity2, 0));
                break;
            case 2:
                Integer numValueOf3 = Integer.valueOf(p025ba.k.core_opps);
                String respMsg2 = this.f6237c.getRespMsg();
                Integer numValueOf4 = Integer.valueOf(p025ba.k.core_confirm);
                VerifyAccountActivity verifyAccountActivity3 = this.f6236b;
                io.fastkv.n.O(verifyAccountActivity3, 0, numValueOf3, null, null, null, null, respMsg2, numValueOf4, null, null, null, null, null, null, false, 0, 8388221).setOnDismissListener(new n0(verifyAccountActivity3, 1));
                break;
            default:
                Integer numValueOf5 = Integer.valueOf(p025ba.k.core_opps);
                CommonBeanResult commonBeanResult = this.f6237c;
                String str2 = ((CheckSecurityVerifyMethodRsp) commonBeanResult.data).errorMsg;
                Integer numValueOf6 = Integer.valueOf(p025ba.k.core_confirm);
                VerifyAccountActivity verifyAccountActivity4 = this.f6236b;
                io.fastkv.n.O(verifyAccountActivity4, 0, numValueOf5, null, null, null, null, str2, numValueOf6, null, new C9.V(1, commonBeanResult, verifyAccountActivity4), null, null, null, null, false, 0, 8387197).setOnDismissListener(new o0(commonBeanResult, verifyAccountActivity4));
                break;
        }
        return Unit.f38893a;
    }

    public l0(CommonBeanResult commonBeanResult, VerifyAccountActivity verifyAccountActivity) {
        this.f6235a = 0;
        this.f6237c = commonBeanResult;
        this.f6236b = verifyAccountActivity;
    }
}
