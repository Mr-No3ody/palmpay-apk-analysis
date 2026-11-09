package p141j9;

import Pa.n0;
import Pa.r0;
import Rd.H;
import com.transsnet.palmpay.airtime.bean.QueryAirtimeV2Rsp;
import com.transsnet.palmpay.airtime.bean.req.GroupPurchaseReq;
import com.transsnet.palmpay.airtime.bean.rsp.GroupPurchaseItem;
import com.transsnet.palmpay.airtime.ui.TopupAirtimeActivity;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TopupAirtimeActivity f38368a;

    public D(TopupAirtimeActivity topupAirtimeActivity) {
        this.f38368a = topupAirtimeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        GroupPurchaseItem item = (GroupPurchaseItem) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = TopupAirtimeActivity.f26495x0;
        TopupAirtimeActivity topupAirtimeActivity = this.f38368a;
        H h7 = (H) topupAirtimeActivity.f27334c;
        String phoneNumber = (h7 == null || (modelMobileWithIconInputLayout = h7.f8066g) == null) ? null : modelMobileWithIconInputLayout.getPhoneNumber();
        GroupPurchaseReq groupPurchaseReq = new GroupPurchaseReq();
        groupPurchaseReq.setActivityId(item.getActivityId());
        groupPurchaseReq.setGroupNumber(item.getGroupNumber());
        groupPurchaseReq.setPhone(r0.v0(r0.L0(phoneNumber)));
        QueryAirtimeV2Rsp.DataBean dataBean = topupAirtimeActivity.f26505Z;
        groupPurchaseReq.setBillerId(dataBean != null ? dataBean.getNetwork() : null);
        QueryAirtimeV2Rsp.DataBean dataBean2 = topupAirtimeActivity.f26505Z;
        groupPurchaseReq.setBillerName(dataBean2 != null ? dataBean2.getName() : null);
        topupAirtimeActivity.q(groupPurchaseReq, true);
        n0.g().k(new ClickEvent("AirtimeGoupPurchaseSaleItemClick").add("activityId", item.getActivityId()));
        return Unit.f38893a;
    }
}
