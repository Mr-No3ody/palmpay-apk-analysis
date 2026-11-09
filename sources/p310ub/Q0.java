package p310ub;

import C0.G;
import android.view.View;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.req.SignInstallmentWithdrawReq;
import com.transsnet.palmpay.credit.bean.rsp.OcRepaidListDetail;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepaidListActivity;
import com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialogListener;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p221ob.c;
import p298tf.f;
import p382zb.C2164g;

/* JADX INFO: loaded from: classes4.dex */
public final class Q0 implements OnRvItemClickListener, AgentAutoRepaymentDialogListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f42784a;

    public /* synthetic */ Q0(Object obj) {
        this.f42784a = obj;
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialogListener
    public void onConfirm() {
        int i7 = CLMainFragment.j1;
        G.h(c.f40268a).signInstallmentLoanWithdrawPreCheck(new SignInstallmentWithdrawReq(1)).k(f.f42629b).i(b.a()).subscribe(new C2164g((CLMainFragment) this.f42784a, 2));
    }

    @Override // com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener
    public void onItemClick(View itemView, int i7) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        ArrayList arrayList = ((OcRepaidListActivity) this.f42784a).f29699g;
        if (arrayList == null) {
            Intrinsics.n("mData");
            throw null;
        }
        Object obj = arrayList.get(i7);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ARouter.getInstance().build("/credit_score/oc_repay_order_detail_activity").withString("orderType", TransType.TRANS_TYPE_OK_CARD).withString("orderNo", ((OcRepaidListDetail) obj).getPayId()).navigation();
    }

    @Override // com.transsnet.palmpay.credit.ui.dialog.AgentAutoRepaymentDialogListener
    public void onCancel() {
    }
}
