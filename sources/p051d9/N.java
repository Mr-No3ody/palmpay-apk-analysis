package p051d9;

import com.transsnet.palmpay.account.bean.ChangeTempPinRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.SetNewPswContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class N implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f35568b;

    public /* synthetic */ N(P p3, int i7) {
        this.f35567a = i7;
        this.f35568b = p3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35567a) {
            case 0:
                CommonBeanResult<ChangeTempPinRsp> it = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                SetNewPswContract.View view = (SetNewPswContract.View) this.f35568b.f27351a;
                if (view != null) {
                    view.handleResetTempPasswordResult(it);
                }
                break;
            default:
                CommonResult it2 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                SetNewPswContract.View view2 = (SetNewPswContract.View) this.f35568b.f27351a;
                if (view2 != null) {
                    view2.handleResetPasswordResult(it2);
                }
                break;
        }
        return Unit.f38893a;
    }
}
