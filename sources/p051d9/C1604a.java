package p051d9;

import com.transsnet.palmpay.account.bean.SendSmsNewV2Rsp;
import com.transsnet.palmpay.account.bean.rsp.CheckPinRsp;
import com.transsnet.palmpay.account.bean.rsp.GetSecurityFlowRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.ChangeMobileContract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1604a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1612i f35591b;

    public /* synthetic */ C1604a(C1612i c1612i, int i7) {
        this.f35590a = i7;
        this.f35591b = c1612i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35590a) {
            case 0:
                CommonBeanResult<CheckPinRsp> it = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ChangeMobileContract.View view = (ChangeMobileContract.View) this.f35591b.f27351a;
                if (view != null) {
                    view.handleCheckPinRsp(it);
                }
                break;
            case 1:
                SendSmsNewV2Rsp it2 = (SendSmsNewV2Rsp) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                C1612i c1612i = this.f35591b;
                ChangeMobileContract.View view2 = (ChangeMobileContract.View) c1612i.f27351a;
                if (view2 != null) {
                    view2.showLoadingView(false);
                }
                ChangeMobileContract.View view3 = (ChangeMobileContract.View) c1612i.f27351a;
                if (view3 != null) {
                    view3.handSendSmsMessageResult(it2);
                }
                break;
            case 2:
                String str = (String) obj;
                C1612i c1612i2 = this.f35591b;
                ChangeMobileContract.View view4 = (ChangeMobileContract.View) c1612i2.f27351a;
                if (view4 != null) {
                    view4.showLoadingView(false);
                }
                ToastUtils.showLong(str, new Object[0]);
                ChangeMobileContract.View view5 = (ChangeMobileContract.View) c1612i2.f27351a;
                if (view5 != null) {
                    view5.handSendSmsMessageResult(null);
                }
                break;
            case 3:
                CommonResult it3 = (CommonResult) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                C1612i c1612i3 = this.f35591b;
                ChangeMobileContract.View view6 = (ChangeMobileContract.View) c1612i3.f27351a;
                if (view6 != null) {
                    view6.showLoadingView(false);
                }
                if ("CFRONT_700008".equalsIgnoreCase(it3.getRespCode())) {
                    ToastUtils.showLong(it3.getRespMsg(), new Object[0]);
                } else {
                    ChangeMobileContract.View view7 = (ChangeMobileContract.View) c1612i3.f27351a;
                    if (view7 != null) {
                        view7.handChangeNumberResult(it3);
                    }
                }
                break;
            case 4:
                String str2 = (String) obj;
                ChangeMobileContract.View view8 = (ChangeMobileContract.View) this.f35591b.f27351a;
                if (view8 != null) {
                    view8.showLoadingView(false);
                }
                ToastUtils.showLong(str2, new Object[0]);
                break;
            case 5:
                String str3 = (String) obj;
                ChangeMobileContract.View view9 = (ChangeMobileContract.View) this.f35591b.f27351a;
                if (view9 != null) {
                    view9.handSendMessageResult(null);
                }
                ToastUtils.showLong(str3, new Object[0]);
                break;
            case 6:
                String str4 = (String) obj;
                ChangeMobileContract.View view10 = (ChangeMobileContract.View) this.f35591b.f27351a;
                if (view10 != null) {
                    view10.showLoadingView(false);
                }
                ToastUtils.showLong(str4, new Object[0]);
                break;
            default:
                CommonBeanResult it4 = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                ChangeMobileContract.View view11 = (ChangeMobileContract.View) this.f35591b.f27351a;
                if (view11 != null) {
                    view11.handleSecurityFlowResult((GetSecurityFlowRsp) it4.data);
                }
                break;
        }
        return Unit.f38893a;
    }
}
