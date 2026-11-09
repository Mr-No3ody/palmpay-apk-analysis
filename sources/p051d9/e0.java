package p051d9;

import com.transsnet.palmpay.account.bean.SmsActionRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.SignUpStepOtcContract;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f35610b;

    public /* synthetic */ e0(i0 i0Var, int i7) {
        this.f35609a = i7;
        this.f35610b = i0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35609a) {
            case 0:
                ToastUtils.showLong((String) obj, new Object[0]);
                SignUpStepOtcContract.View view = (SignUpStepOtcContract.View) this.f35610b.f27351a;
                if (view != null) {
                    view.updateSendSmsButton(true);
                }
                break;
            case 1:
                SmsActionRsp it = (SmsActionRsp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean zIsSuccess = it.isSuccess();
                i0 i0Var = this.f35610b;
                if (zIsSuccess) {
                    SignUpStepOtcContract.View view2 = (SignUpStepOtcContract.View) i0Var.f27351a;
                    if (view2 != null) {
                        view2.onSmsTokenReceived(it.data);
                    }
                } else {
                    SignUpStepOtcContract.View view3 = (SignUpStepOtcContract.View) i0Var.f27351a;
                    if (view3 != null) {
                        view3.onGetSmsTokenFail(it.getRespMsg());
                    }
                }
                break;
            default:
                String str = (String) obj;
                SignUpStepOtcContract.View view4 = (SignUpStepOtcContract.View) this.f35610b.f27351a;
                if (view4 != null) {
                    view4.onGetSmsTokenFail(str);
                }
                break;
        }
        return Unit.f38893a;
    }
}
