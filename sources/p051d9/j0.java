package p051d9;

import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f35625b;

    public /* synthetic */ j0(n0 n0Var, int i7) {
        this.f35624a = i7;
        this.f35625b = n0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35624a) {
            case 0:
                CommonBeanResult<CheckPinRsp> it = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                VerifyAccountContract.View view = (VerifyAccountContract.View) this.f35625b.f27351a;
                if (view != null) {
                    view.handCheckPinResult(it);
                }
                break;
            case 1:
                ToastUtils.showLong((String) obj, new Object[0]);
                VerifyAccountContract.View view2 = (VerifyAccountContract.View) this.f35625b.f27351a;
                if (view2 != null) {
                    view2.updateSendSmsButton(true);
                }
                break;
            case 2:
                SmsActionRsp it2 = (SmsActionRsp) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean zIsSuccess = it2.isSuccess();
                n0 n0Var = this.f35625b;
                if (zIsSuccess) {
                    VerifyAccountContract.View view3 = (VerifyAccountContract.View) n0Var.f27351a;
                    if (view3 != null) {
                        view3.onSmsTokenReceived(it2.data);
                    }
                } else {
                    VerifyAccountContract.View view4 = (VerifyAccountContract.View) n0Var.f27351a;
                    if (view4 != null) {
                        view4.onGetSmsTokenFail(it2.getRespMsg());
                    }
                }
                break;
            default:
                String str = (String) obj;
                VerifyAccountContract.View view5 = (VerifyAccountContract.View) this.f35625b.f27351a;
                if (view5 != null) {
                    view5.onGetSmsTokenFail(str);
                }
                break;
        }
        return Unit.f38893a;
    }
}
