package La;

import com.transsnet.palmpay.account.bean.rsp.IdIdentityListRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView;
import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import com.transsnet.palmpay.teller.bean.WAECOperatorResp;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p051d9.C1628z;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5570c;

    public /* synthetic */ D(Object obj, boolean z3, int i7) {
        this.f5568a = i7;
        this.f5570c = obj;
        this.f5569b = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SelectPaymentContract$IView selectPaymentContract$IView;
        PalmPayLevelUpTier3Contract.View view;
        boolean z3 = this.f5569b;
        Object obj2 = this.f5570c;
        switch (this.f5568a) {
            case 0:
                CommonBeanResult it = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                OkCardPreCreditInfoRsp okCardPreCreditInfoRsp = (OkCardPreCreditInfoRsp) it.data;
                if (okCardPreCreditInfoRsp != null) {
                    F f10 = (F) obj2;
                    f10.f5572d = okCardPreCreditInfoRsp;
                    SelectPaymentContract$IView selectPaymentContract$IView2 = (SelectPaymentContract$IView) f10.f27351a;
                    if (selectPaymentContract$IView2 != null) {
                        selectPaymentContract$IView2.handleOkCardPreCreditInfo(okCardPreCreditInfoRsp);
                    }
                    if (!((OkCardPreCreditInfoRsp) it.data).okCardPreCreditFlag && z3 && (selectPaymentContract$IView = (SelectPaymentContract$IView) f10.f27351a) != null) {
                        selectPaymentContract$IView.setDefaultMethod(null);
                    }
                }
                return Unit.f38893a;
            case 1:
                WAECOperatorResp rsp = (WAECOperatorResp) obj;
                int i7 = WaecHomeActivity.f34237Q;
                Intrinsics.checkNotNullParameter(rsp, "rsp");
                List<WAECOperatorBean> data = rsp.getData();
                WaecHomeActivity waecHomeActivity = (WaecHomeActivity) obj2;
                waecHomeActivity.f34248v = data;
                if (z3) {
                    PickMobileNetWorkDialog pickMobileNetWorkDialog = waecHomeActivity.f34242L;
                    if (pickMobileNetWorkDialog == null) {
                        Intrinsics.n("selectNetWorkDialog");
                        throw null;
                    }
                    pickMobileNetWorkDialog.setDatas(data);
                    PickMobileNetWorkDialog pickMobileNetWorkDialog2 = waecHomeActivity.f34242L;
                    if (pickMobileNetWorkDialog2 == null) {
                        Intrinsics.n("selectNetWorkDialog");
                        throw null;
                    }
                    pickMobileNetWorkDialog2.show();
                } else {
                    waecHomeActivity.t(waecHomeActivity.f34239B);
                }
                return Unit.f38893a;
            default:
                CommonListResultV2<IdIdentityListRsp> response = (CommonListResultV2) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                C1628z c1628z = (C1628z) obj2;
                if (response.isSuccess()) {
                    PalmPayLevelUpTier3Contract.View view2 = (PalmPayLevelUpTier3Contract.View) c1628z.f27351a;
                    if (view2 != null) {
                        view2.handleIdIdentityListRsp(response, z3);
                    }
                } else if (z3 && (view = (PalmPayLevelUpTier3Contract.View) c1628z.f27351a) != null) {
                    view.showRetryIdentityListDialog(response.getRespMsg());
                }
                return Unit.f38893a;
        }
    }
}
