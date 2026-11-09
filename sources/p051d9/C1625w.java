package p051d9;

import com.transsnet.palmpay.account.bean.rsp.LatestBillerOrderDetailRsp;
import com.transsnet.palmpay.account.bean.rsp.QueryAddressFromBillRsp;
import com.transsnet.palmpay.account.ui.mvp.contract.PalmPayLevelUpTier3Contract;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: d9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1625w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1628z f35666b;

    public /* synthetic */ C1625w(C1628z c1628z, int i7) {
        this.f35665a = i7;
        this.f35666b = c1628z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PalmPayLevelUpTier3Contract.View view;
        CommonBeanResult<QueryAddressFromBillRsp> response = (CommonBeanResult) obj;
        switch (this.f35665a) {
            case 0:
                Intrinsics.checkNotNullParameter(response, "response");
                PalmPayLevelUpTier3Contract.View view2 = (PalmPayLevelUpTier3Contract.View) this.f35666b.f27351a;
                if (view2 != null) {
                    view2.handleQueryAddressFromBill(response);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.isSuccess() && (view = (PalmPayLevelUpTier3Contract.View) this.f35666b.f27351a) != null) {
                    view.handleLatestBillOrder((LatestBillerOrderDetailRsp) response.data);
                }
                break;
        }
        return Unit.f38893a;
    }
}
