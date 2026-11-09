package p382zb;

import Pa.n0;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.ui.fragment.OcBillFragment;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecord;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.adapter.ReferEarnInviteesRVAdapter$ReferEarnInviteesOnclickInterface;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p352xc.a;
import p383zc.m;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements OnRvItemClickListener, ReferEarnInviteesRVAdapter$ReferEarnInviteesOnclickInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44528a;

    public /* synthetic */ I(Object obj) {
        this.f44528a = obj;
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.adapter.ReferEarnInviteesRVAdapter$ReferEarnInviteesOnclickInterface
    public void inviteesClick(ReferEarnRecord data) {
        Intrinsics.checkNotNullParameter(data, "data");
        n0.g().m("refer_earn_page_element_click", "Remind", "");
        ReferEarnHomePageActivity referEarnHomePageActivity = ((a) this.f44528a).f43836a;
        if (referEarnHomePageActivity != null) {
            String phone = data.phone;
            Intrinsics.checkNotNullParameter(phone, "phone");
            ((m) referEarnHomePageActivity.f27350a).queryReferEarnSms(phone);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ArrayList arrayList = ((OcBillFragment) this.f44528a).f30378D0;
        if (arrayList == null) {
            Intrinsics.n("mInstalmentListData");
            throw null;
        }
        Object obj = arrayList.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        OcRepaidListDetail ocRepaidListDetail = (OcRepaidListDetail) obj;
        Integer operationType = ocRepaidListDetail.getOperationType();
        if (operationType != null && operationType.intValue() == 9) {
            return;
        }
        Integer installmentType = ocRepaidListDetail.getInstallmentType();
        if (installmentType != null && installmentType.intValue() == 1) {
            ARouter.getInstance().build("/credit_score/oc_offline_installment_detail_activity").withString("oc_installment_order_id", ocRepaidListDetail.getInstallmentOrderNo()).navigation();
        } else {
            ARouter.getInstance().build("/credit_score/oc_bill_installment_activity").withString("oc_bill_installment_order_id", ocRepaidListDetail.getInstallmentOrderNo()).navigation();
        }
    }
}
