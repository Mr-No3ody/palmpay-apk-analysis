package com.transsnet.palmpay.ui.activity.detail;

import Ac.e;
import Ac.f;
import Bc.r;
import O6.c;
import Pa.F;
import Pa.r0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.adjust.sdk.network.ErrorCodes;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.main.export.bean.req.QueryRefundBillDetailReq;
import com.transsnet.palmpay.main.export.bean.rsp.OrderRefundDataBean;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p052da.ViewOnClickListenerC1649v;
import p059e1.a;
import p071ef.b;
import p160ke.g;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/refund_billdetail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/detail/RefundStatementDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRefundStatementDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefundStatementDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/detail/RefundStatementDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
public final class RefundStatementDetailActivity extends BaseMvvmActivity<BaseViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34733f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f34736e;

    public static final void m(RefundStatementDetailActivity refundStatementDetailActivity, String str) {
        refundStatementDetailActivity.getClass();
        c cVar = new c(refundStatementDetailActivity);
        cVar.e(k.core_title_error_info);
        cVar.f6598d = str;
        cVar.d(k.core_try_again, new ViewOnClickListenerC1649v(refundStatementDetailActivity, 26));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34734c)) {
            this.f34734c = getQueryParameter("orderNo");
        }
        if (TextUtils.isEmpty(this.f34735d)) {
            this.f34735d = getQueryParameter("extra_data");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_refund_bill_detail, (ViewGroup) null, false);
        int i7 = e.layoutResultInfoList;
        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = e.modelResultHeader;
            OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) a.m(i7, viewInflate);
            if (orderResultHeaderModel != null) {
                i7 = e.modelResultReceipt;
                if (((OrderResultViewReceiptModel) a.m(i7, viewInflate)) != null) {
                    i7 = e.scrollView;
                    if (((NestedScrollView) a.m(i7, viewInflate)) != null) {
                        i7 = e.titleBar;
                        if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                            r rVar = new r((LinearLayout) viewInflate, linearLayout, orderResultHeaderModel, 1);
                            this.f34736e = rVar;
                            return rVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void n() {
        if (TransType.TRANS_TYPE_REFUND_2.equals(this.f34735d)) {
            ActivityUtils.startActivity(F.a(this, "arouter://coreImpl/rn_host?rn_module_name=RefundDetail&orderNo=" + this.f34734c));
            finish();
            return;
        }
        if (TransType.TRANS_TYPE_CHARGE_BACK.equals(this.f34735d) || TransType.TRANS_TYPE_NIBSS_CHARGE_BACK.equals(this.f34735d)) {
            showLoadingDialog(true);
            ((IApiMainService) Cc.a.f1353a.f39520b).queryChargeBackOrderDetail(this.f34734c).k(p298tf.f.f42629b).i(b.a()).subscribe(new g(this, 0));
            return;
        }
        QueryRefundBillDetailReq queryRefundBillDetailReq = new QueryRefundBillDetailReq();
        queryRefundBillDetailReq.setOrderNo(this.f34734c);
        queryRefundBillDetailReq.setMemberId(BaseApplication.getInstance().getUser().getMemberId());
        showLoadingDialog(true);
        ((IApiMainService) Cc.a.f1353a.f39520b).getRefundDetail(queryRefundBillDetailReq).k(p298tf.f.f42629b).i(b.a()).subscribe(new g(this, 1));
    }

    public final void o(OrderRefundDataBean orderRefundDataBean) {
        RefundStatementDetailActivity refundStatementDetailActivity;
        LinearLayout orderStatusLayout;
        r rVar = this.f34736e;
        if (rVar != null) {
            rVar.f827d.d(com.transsnet.palmpay.custom_view.r.cv_bill_refund);
        }
        if (TransType.TRANS_TYPE_CHARGE_BACK.equals(this.f34735d)) {
            r rVar2 = this.f34736e;
            if (rVar2 != null) {
                rVar2.f827d.o(getString(k.core_to, orderRefundDataBean.paymentType));
            }
        } else {
            r rVar3 = this.f34736e;
            if (rVar3 != null) {
                rVar3.f827d.o(getString(k.core_from_s1, orderRefundDataBean.paymentType));
            }
        }
        r rVar4 = this.f34736e;
        if (rVar4 != null) {
            rVar4.f827d.c(r0.B(orderRefundDataBean.amount, false));
        }
        r rVar5 = this.f34736e;
        if (rVar5 != null) {
            refundStatementDetailActivity = this;
            rVar5.f827d.l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(OrderResultHeaderModel.f31610A, refundStatementDetailActivity, orderRefundDataBean.statusDesc, 0.0f, 4, null));
        } else {
            refundStatementDetailActivity = this;
        }
        r rVar6 = refundStatementDetailActivity.f34736e;
        if (rVar6 != null) {
            rVar6.f827d.k(orderRefundDataBean.statusDesc);
        }
        r rVar7 = refundStatementDetailActivity.f34736e;
        if (rVar7 == null || (orderStatusLayout = rVar7.f827d.getOrderStatusLayout()) == null) {
            return;
        }
        orderStatusLayout.setOnClickListener(new p160ke.f(this, orderRefundDataBean));
    }

    public final void p(OrderRefundDataBean orderRefundDataBean) {
        r rVar;
        r rVar2;
        r rVar3 = this.f34736e;
        if (rVar3 != null) {
            rVar3.f826c.addView(new OrderResultItemModel(this, k.core_receipt_transaction_type, getString(k.core_refund)));
        }
        int i7 = orderRefundDataBean.loyaltyPoint;
        Integer numValueOf = Integer.valueOf(i7);
        if (i7 <= 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            r rVar4 = this.f34736e;
            if (rVar4 != null) {
                rVar4.f826c.addView(new OrderResultItemModel(this, k.core_points_refund, r0.x0(iIntValue)));
            }
        }
        r rVar5 = this.f34736e;
        if (rVar5 != null) {
            rVar5.f826c.addView(new OrderResultItemModel(this, k.core_receive_method, orderRefundDataBean.recieveMethod));
        }
        r rVar6 = this.f34736e;
        if (rVar6 != null) {
            rVar6.f826c.addView(new OrderResultItemModel(this, ErrorCodes.MALFORMED_URL_EXCEPTION, k.core_reference_no_2, orderRefundDataBean.orderNo));
        }
        if (!Intrinsics.c(r0.Q(orderRefundDataBean.createTime), r0.Q(orderRefundDataBean.complateTime)) && (rVar2 = this.f34736e) != null) {
            rVar2.f826c.addView(new OrderResultItemModel(this, k.core_transaction_date_1, r0.Q(orderRefundDataBean.createTime)));
        }
        r rVar7 = this.f34736e;
        if (rVar7 != null) {
            rVar7.f826c.addView(new OrderResultItemModel(this, k.core_completion_time, r0.Q(orderRefundDataBean.complateTime)));
        }
        if (TextUtils.isEmpty(orderRefundDataBean.preTransType) || TextUtils.isEmpty(orderRefundDataBean.preOrderNo) || (rVar = this.f34736e) == null) {
            return;
        }
        LinearLayout linearLayout = rVar.f826c;
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, 1004, k.core_original_transaction, getString(k.core_view));
        orderResultItemModel.setOnClickListener(new p160ke.f(orderRefundDataBean, this));
        linearLayout.addView(orderResultItemModel);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), true);
    }
}
