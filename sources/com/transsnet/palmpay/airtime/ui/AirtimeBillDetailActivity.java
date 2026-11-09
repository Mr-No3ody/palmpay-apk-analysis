package com.transsnet.palmpay.airtime.ui;

import L6.b;
import Pd.c;
import Pd.d;
import Rd.I;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeDownTimeOrderDetailViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.custom_view.model.OrderDetailInfoListModel;
import com.transsnet.palmpay.custom_view.model.OrderResultCopyToken;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.teller.ui.view.ModelPointClaimItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.C1897b;
import p025ba.k;
import p054dd.q;
import p059e1.a;
import p140j8.f;
import p141j9.C1795c;
import p141j9.C1796d;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "话费/Bill Detail", path = "/airtime/billdetail")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/AirtimeBillDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/AirTimeDownTimeOrderDetailViewModel;", "LRd/I;", "<init>", "()V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAirtimeBillDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirtimeBillDetailActivity.kt\ncom/transsnet/palmpay/airtime/ui/AirtimeBillDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n260#2,10:552\n296#2:562\n260#2,10:563\n296#2:573\n260#2,10:574\n296#2:584\n1#3:585\n*S KotlinDebug\n*F\n+ 1 AirtimeBillDetailActivity.kt\ncom/transsnet/palmpay/airtime/ui/AirtimeBillDetailActivity\n*L\n130#1:552,10\n130#1:562\n144#1:563,10\n144#1:573\n155#1:574,10\n155#1:584\n*E\n"})
public final class AirtimeBillDetailActivity extends BaseMvvmVBActivity<AirTimeDownTimeOrderDetailViewModel, I> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f26454i = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ModelPointClaimItem f26455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f26456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26457f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AirtimeDetailData f26458g;

    public static final OrderInfoForCustomerService n(AirtimeBillDetailActivity airtimeBillDetailActivity) {
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        AirtimeDetailData airtimeDetailData = airtimeBillDetailActivity.f26458g;
        if (airtimeDetailData != null) {
            orderInfoForCustomerService.paymentType = Intrinsics.c(airtimeDetailData.getTransType(), "04") ? airtimeBillDetailActivity.getString(k.core_top_up_airtime) : airtimeBillDetailActivity.getString(k.core_daily_flash_sales);
            Long updateTime = airtimeDetailData.getUpdateTime();
            orderInfoForCustomerService.time = updateTime != null ? updateTime.longValue() : 0L;
            Long payAmount = airtimeDetailData.getPayAmount();
            orderInfoForCustomerService.amount = payAmount != null ? payAmount.longValue() : 0L;
            Long payFee = airtimeDetailData.getPayFee();
            orderInfoForCustomerService.fee = payFee != null ? payFee.longValue() : 0L;
            orderInfoForCustomerService.orderNumber = airtimeDetailData.getOrderNo();
            orderInfoForCustomerService.orderStatus = airtimeDetailData.getOrderStatusDesc();
            Long taxFee = airtimeDetailData.getTaxFee();
            orderInfoForCustomerService.vat = taxFee != null ? taxFee.longValue() : 0L;
            Long loyaltyPoint = airtimeDetailData.getLoyaltyPoint();
            orderInfoForCustomerService.pointsUsed = loyaltyPoint != null ? loyaltyPoint.longValue() : 0L;
            Long returnPoint = airtimeDetailData.getReturnPoint();
            orderInfoForCustomerService.pointsEarned = returnPoint != null ? returnPoint.longValue() : 0L;
            BillProcessDetail orderStatusInfo = airtimeDetailData.getOrderStatusInfo();
            orderInfoForCustomerService.faqUrl = orderStatusInfo != null ? orderStatusInfo.faqLink : null;
            BillProcessDetail orderStatusInfo2 = airtimeDetailData.getOrderStatusInfo();
            orderInfoForCustomerService.feedbackLink = orderStatusInfo2 != null ? orderStatusInfo2.feedbackLink : null;
            orderInfoForCustomerService.transType = airtimeDetailData.getTransType();
            orderInfoForCustomerService.paymentMethod = airtimeBillDetailActivity.f26457f;
        }
        return orderInfoForCustomerService;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f26456e)) {
            this.f26456e = getQueryParameter("orderNo");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_airtime_activity_top_up_bill_detail, (ViewGroup) null, false);
        int i7 = c.layout_result_amount_list;
        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = c.layout_result_info_list;
            OrderDetailInfoListModel orderDetailInfoListModel = (OrderDetailInfoListModel) a.m(i7, viewInflate);
            if (orderDetailInfoListModel != null) {
                i7 = c.layout_result_token_copy;
                OrderResultCopyToken orderResultCopyToken = (OrderResultCopyToken) a.m(i7, viewInflate);
                if (orderResultCopyToken != null) {
                    i7 = c.model_order_result_customer_service;
                    OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) a.m(i7, viewInflate);
                    if (orderResultCustomerServiceModel != null) {
                        i7 = c.model_order_result_header;
                        OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) a.m(i7, viewInflate);
                        if (orderResultHeaderModel != null) {
                            i7 = c.model_order_result_view_receipt;
                            OrderResultViewReceiptModel orderResultViewReceiptModel = (OrderResultViewReceiptModel) a.m(i7, viewInflate);
                            if (orderResultViewReceiptModel != null) {
                                i7 = c.scrollView;
                                if (((NestedScrollView) a.m(i7, viewInflate)) != null) {
                                    i7 = c.stub_result_reward;
                                    ViewStub viewStub = (ViewStub) a.m(i7, viewInflate);
                                    if (viewStub != null) {
                                        i7 = c.titleBar;
                                        if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                                            i7 = c.tv_apply_refund;
                                            TextView textView = (TextView) a.m(i7, viewInflate);
                                            if (textView != null) {
                                                I i10 = new I((LinearLayout) viewInflate, linearLayout, orderDetailInfoListModel, orderResultCopyToken, orderResultCustomerServiceModel, orderResultHeaderModel, orderResultViewReceiptModel, viewStub, textView);
                                                Intrinsics.checkNotNullExpressionValue(i10, "inflate(...)");
                                                return i10;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        AirTimeDownTimeOrderDetailViewModel airTimeDownTimeOrderDetailViewModel = (AirTimeDownTimeOrderDetailViewModel) l();
        String str = this.f26456e;
        airTimeDownTimeOrderDetailViewModel.getClass();
        f.s(airTimeDownTimeOrderDetailViewModel, new C1897b(str, null), airTimeDownTimeOrderDetailViewModel.f26605f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        l lVar = ((AirTimeDownTimeOrderDetailViewModel) l()).f26605f;
        if (lVar != null) {
            lVar.e(this, new q(new C1795c(this, this, 0), 5));
        }
        l lVar2 = ((AirTimeDownTimeOrderDetailViewModel) l()).f26604e;
        if (lVar2 != null) {
            lVar2.e(this, new q(new C1795c(this, this, 1), 5));
        }
        l lVar3 = ((AirTimeDownTimeOrderDetailViewModel) l()).f26606g;
        if (lVar3 != null) {
            lVar3.e(this, new q(new C1795c(this, this, 2), 5));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundDark), !isDarkMode());
        I i7 = (I) this.f27334c;
        if (i7 != null) {
            i7.f8077e.setOnCustomerServiceModelListener(new C1796d(this));
        }
    }
}
