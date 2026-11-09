package p256qe;

import Pa.i0;
import Pa.r0;
import Z4.e;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.main.export.bean.rsp.GetPointFlowRsp;
import com.transsnet.palmpay.ui.activity.points.PointStatementDetailActivity;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PointStatementDetailActivity f41520f;

    public a(PointStatementDetailActivity pointStatementDetailActivity) {
        this.f41520f = pointStatementDetailActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41520f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
        this.f41520f.showLoadingDialog(false);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<GetPointFlowRsp.DataBean.ListBean> list;
        String str;
        GetPointFlowRsp getPointFlowRsp = (GetPointFlowRsp) obj;
        PointStatementDetailActivity pointStatementDetailActivity = this.f41520f;
        pointStatementDetailActivity.showLoadingDialog(false);
        if (!getPointFlowRsp.isSuccess()) {
            ToastUtils.showLong(getPointFlowRsp.getRespMsg());
            return;
        }
        GetPointFlowRsp.DataBean dataBean = getPointFlowRsp.data;
        if (dataBean == null || (list = dataBean.list) == null || list.isEmpty()) {
            return;
        }
        pointStatementDetailActivity.f34815p = getPointFlowRsp.data.list.get(0);
        if (i0.W(pointStatementDetailActivity)) {
            pointStatementDetailActivity.f34810f.j(pointStatementDetailActivity.f34815p.loyaltyOrderId);
            pointStatementDetailActivity.f34810f.g(pointStatementDetailActivity.getString(k.core_reference_no_2));
            pointStatementDetailActivity.f34810f.m(ErrorCodes.MALFORMED_URL_EXCEPTION);
            String str2 = pointStatementDetailActivity.f34815p.payId;
            if (str2 == null || str2.isEmpty()) {
                pointStatementDetailActivity.f34813j.setVisibility(8);
            } else {
                pointStatementDetailActivity.f34813j.g(pointStatementDetailActivity.getString(k.core_original_transaction));
                pointStatementDetailActivity.f34813j.j(pointStatementDetailActivity.f34815p.payId);
            }
            pointStatementDetailActivity.f34812i.g("Issued Time");
            OrderResultItemModel orderResultItemModel = pointStatementDetailActivity.f34812i;
            GetPointFlowRsp.DataBean.ListBean listBean = pointStatementDetailActivity.f34815p;
            long j6 = listBean.obtainTime;
            if (j6 <= 0) {
                j6 = listBean.createTime;
            }
            orderResultItemModel.j(r0.Q(j6));
            pointStatementDetailActivity.f34814o.g("Earned Time");
            OrderResultItemModel orderResultItemModel2 = pointStatementDetailActivity.f34814o;
            GetPointFlowRsp.DataBean.ListBean listBean2 = pointStatementDetailActivity.f34815p;
            long j10 = listBean2.claimTime;
            if (j10 <= 0) {
                j10 = listBean2.createTime;
            }
            orderResultItemModel2.j(r0.Q(j10));
            pointStatementDetailActivity.f34807c.f31443c.setText(pointStatementDetailActivity.getString(k.core_type));
            pointStatementDetailActivity.f34808d.g("Transaction type");
            pointStatementDetailActivity.f34808d.j(pointStatementDetailActivity.f34815p.outOrderType);
            if ("C".equalsIgnoreCase(pointStatementDetailActivity.f34815p.dcType)) {
                pointStatementDetailActivity.f34806b.f31467d.setText("+" + r0.x0(pointStatementDetailActivity.f34815p.drCrAmount));
                pointStatementDetailActivity.f34807c.f31444d.setText(k.core_points_earned);
            } else {
                pointStatementDetailActivity.f34806b.f31467d.setText("-" + r0.x0(pointStatementDetailActivity.f34815p.drCrAmount));
                pointStatementDetailActivity.f34807c.f31444d.setText(k.core_points_used);
            }
            if ("Redeem".equalsIgnoreCase(pointStatementDetailActivity.f34815p.businessType)) {
                pointStatementDetailActivity.f34807c.f31444d.setText(k.core_points_used);
            } else if ("Award".equalsIgnoreCase(pointStatementDetailActivity.f34815p.businessType)) {
                pointStatementDetailActivity.f34807c.f31444d.setText(k.core_points_earned);
            } else if ("Refund".equalsIgnoreCase(pointStatementDetailActivity.f34815p.businessType) || "Award Refund".equalsIgnoreCase(pointStatementDetailActivity.f34815p.businessType) || (!TextUtils.isEmpty(pointStatementDetailActivity.f34815p.businessType) && pointStatementDetailActivity.f34815p.businessType.contains("Refund"))) {
                pointStatementDetailActivity.f34807c.f31444d.setText(k.core_points_refund);
            } else if ("Expire".equalsIgnoreCase(pointStatementDetailActivity.f34815p.businessType)) {
                pointStatementDetailActivity.f34807c.f31444d.setText(k.core_points_expired);
                pointStatementDetailActivity.f34814o.setVisibility(8);
            }
            pointStatementDetailActivity.f34806b.f31468e.setText(k.core_completed);
            if (("Redeem".equalsIgnoreCase(pointStatementDetailActivity.f34815p.businessType) || "Award".equalsIgnoreCase(pointStatementDetailActivity.f34815p.businessType) || pointStatementDetailActivity.f34815p.businessType.contains("Refund")) && (str = pointStatementDetailActivity.f34815p.transOrderType) != null && !str.isEmpty()) {
                pointStatementDetailActivity.f34809e.setVisibility(0);
            }
            if (pointStatementDetailActivity.f34815p.expireTime > 0) {
                pointStatementDetailActivity.f34811g.setVisibility(0);
                pointStatementDetailActivity.f34811g.g(pointStatementDetailActivity.getString(k.core_expired_data));
                pointStatementDetailActivity.f34811g.j(r0.Q(pointStatementDetailActivity.f34815p.expireTime));
            }
        }
    }
}
