package p160ke;

import Ea.a;
import Pa.F;
import android.text.TextUtils;
import android.view.View;
import com.transsnet.palmpay.core.ui.dialog.BillDetailProcessDialog;
import com.transsnet.palmpay.main.export.bean.rsp.OrderRefundDataBean;
import com.transsnet.palmpay.ui.activity.detail.RefundStatementDetailActivity;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38756a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OrderRefundDataBean f38757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RefundStatementDetailActivity f38758c;

    public /* synthetic */ f(OrderRefundDataBean orderRefundDataBean, RefundStatementDetailActivity refundStatementDetailActivity) {
        this.f38757b = orderRefundDataBean;
        this.f38758c = refundStatementDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RefundStatementDetailActivity refundStatementDetailActivity = this.f38758c;
        OrderRefundDataBean orderRefundDataBean = this.f38757b;
        switch (this.f38756a) {
            case 0:
                int i7 = RefundStatementDetailActivity.f34733f;
                BillDetailProcessDialog billDetailProcessDialog = new BillDetailProcessDialog(refundStatementDetailActivity);
                billDetailProcessDialog.show();
                billDetailProcessDialog.fillData(orderRefundDataBean.orderStatusInfo);
                break;
            default:
                int i10 = RefundStatementDetailActivity.f34733f;
                if (!TextUtils.isEmpty(orderRefundDataBean.jumpUrl)) {
                    ActivityUtils.startActivity(F.a(refundStatementDetailActivity, orderRefundDataBean.jumpUrl));
                } else {
                    a.e(orderRefundDataBean.preTransType, orderRefundDataBean.preOrderNo, "");
                }
                break;
        }
    }

    public /* synthetic */ f(RefundStatementDetailActivity refundStatementDetailActivity, OrderRefundDataBean orderRefundDataBean) {
        this.f38758c = refundStatementDetailActivity;
        this.f38757b = orderRefundDataBean;
    }
}
