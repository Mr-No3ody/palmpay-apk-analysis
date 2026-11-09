package p051d9;

import com.transsnet.palmpay.account.bean.ResetPinVerifyListRsp;
import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.ResetPinContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class A implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f35551b;

    public /* synthetic */ A(D d2, int i7) {
        this.f35550a = i7;
        this.f35551b = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35550a) {
            case 0:
                SmsActionRsp it = (SmsActionRsp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ResetPinContract.View view = (ResetPinContract.View) this.f35551b.f27351a;
                if (view != null) {
                    view.handleCheckSmsResult(it);
                }
                break;
            case 1:
                CommonBeanResult<ResetPinVerifyListRsp> it2 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                ResetPinContract.View view2 = (ResetPinContract.View) this.f35551b.f27351a;
                if (view2 != null) {
                    view2.handleResetPinVerifyListRsp(it2);
                }
                break;
            default:
                CommonBeanResult it3 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ResetPinContract.View view3 = (ResetPinContract.View) this.f35551b.f27351a;
                if (view3 != null) {
                    view3.handleSecurityFlow((GetSecurityFlowRsp) it3.data);
                }
                break;
        }
        return Unit.f38893a;
    }
}
