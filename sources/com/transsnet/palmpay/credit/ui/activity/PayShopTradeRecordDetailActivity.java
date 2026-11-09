package com.transsnet.palmpay.credit.ui.activity;

import C0.G;
import L6.b;
import Pa.i0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopTradeRecordDetailActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.PayShopPaymentViewModel;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p141j9.s;
import p220oa.h;
import p284sb.I;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/PayShopTradeRecordDetailActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/PayShopPaymentViewModel;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(message = "使用RN的CommonDetail")
@SourceDebugExtension({"SMAP\nPayShopTradeRecordDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayShopTradeRecordDetailActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopTradeRecordDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,551:1\n171#2,12:552\n215#2:564\n*S KotlinDebug\n*F\n+ 1 PayShopTradeRecordDetailActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopTradeRecordDetailActivity\n*L\n116#1:552,12\n116#1:564\n*E\n"})
public final class PayShopTradeRecordDetailActivity extends CreditBaseMvvmActivity<PayShopPaymentViewModel> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f28752w = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28754g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28755i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28756j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28757o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28758p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public QueryOrderDetailRsp f28759v;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str) {
            context.startActivity(G.e(context, "context", context, PayShopTradeRecordDetailActivity.class).putExtra("orderId", str));
        }

        private a() {
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str, int i7) {
            context.startActivity(G.e(context, "context", context, PayShopTradeRecordDetailActivity.class).putExtra("orderId", str).putExtra("orderType", i7));
        }
    }

    static {
        new a(null);
    }

    public PayShopTradeRecordDetailActivity() {
        final int i7 = 0;
        this.f28753f = C2131j.b(new Function0(this) { // from class: sb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42122b;

            {
                this.f42122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42122b;
                switch (i7) {
                    case 0:
                        int i10 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultViewReceiptModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_view_receipt);
                    case 1:
                        int i11 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultCustomerServiceModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 2:
                        int i12 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_container_middle);
                    case 3:
                        int i13 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_fee_detail);
                    case 4:
                        int i14 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultHeaderModel) payShopTradeRecordDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i15 = PayShopTradeRecordDetailActivity.f28752w;
                        return (PpTitleBar) payShopTradeRecordDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i10 = 1;
        this.f28754g = C2131j.b(new Function0(this) { // from class: sb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42122b;

            {
                this.f42122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42122b;
                switch (i10) {
                    case 0:
                        int i11 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultViewReceiptModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_view_receipt);
                    case 1:
                        int i12 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultCustomerServiceModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 2:
                        int i13 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_container_middle);
                    case 3:
                        int i14 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_fee_detail);
                    case 4:
                        int i15 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultHeaderModel) payShopTradeRecordDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i16 = PayShopTradeRecordDetailActivity.f28752w;
                        return (PpTitleBar) payShopTradeRecordDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i11 = 2;
        this.f28755i = C2131j.b(new Function0(this) { // from class: sb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42122b;

            {
                this.f42122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42122b;
                switch (i11) {
                    case 0:
                        int i12 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultViewReceiptModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_view_receipt);
                    case 1:
                        int i13 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultCustomerServiceModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 2:
                        int i14 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_container_middle);
                    case 3:
                        int i15 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_fee_detail);
                    case 4:
                        int i16 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultHeaderModel) payShopTradeRecordDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i17 = PayShopTradeRecordDetailActivity.f28752w;
                        return (PpTitleBar) payShopTradeRecordDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i12 = 3;
        this.f28756j = C2131j.b(new Function0(this) { // from class: sb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42122b;

            {
                this.f42122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42122b;
                switch (i12) {
                    case 0:
                        int i13 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultViewReceiptModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_view_receipt);
                    case 1:
                        int i14 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultCustomerServiceModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 2:
                        int i15 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_container_middle);
                    case 3:
                        int i16 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_fee_detail);
                    case 4:
                        int i17 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultHeaderModel) payShopTradeRecordDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i18 = PayShopTradeRecordDetailActivity.f28752w;
                        return (PpTitleBar) payShopTradeRecordDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i13 = 4;
        this.f28757o = C2131j.b(new Function0(this) { // from class: sb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42122b;

            {
                this.f42122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42122b;
                switch (i13) {
                    case 0:
                        int i14 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultViewReceiptModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_view_receipt);
                    case 1:
                        int i15 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultCustomerServiceModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 2:
                        int i16 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_container_middle);
                    case 3:
                        int i17 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_fee_detail);
                    case 4:
                        int i18 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultHeaderModel) payShopTradeRecordDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i19 = PayShopTradeRecordDetailActivity.f28752w;
                        return (PpTitleBar) payShopTradeRecordDetailActivity.findViewById(e.title_bar);
                }
            }
        });
        final int i14 = 5;
        this.f28758p = C2131j.b(new Function0(this) { // from class: sb.G

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42122b;

            {
                this.f42122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42122b;
                switch (i14) {
                    case 0:
                        int i15 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultViewReceiptModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_view_receipt);
                    case 1:
                        int i16 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultCustomerServiceModel) payShopTradeRecordDetailActivity.findViewById(e.model_order_result_customer_service);
                    case 2:
                        int i17 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_container_middle);
                    case 3:
                        int i18 = PayShopTradeRecordDetailActivity.f28752w;
                        return (LinearLayout) payShopTradeRecordDetailActivity.findViewById(e.ll_fee_detail);
                    case 4:
                        int i19 = PayShopTradeRecordDetailActivity.f28752w;
                        return (OrderResultHeaderModel) payShopTradeRecordDetailActivity.findViewById(e.orlm_heaer);
                    default:
                        int i110 = PayShopTradeRecordDetailActivity.f28752w;
                        return (PpTitleBar) payShopTradeRecordDetailActivity.findViewById(e.title_bar);
                }
            }
        });
    }

    public static void n(PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity, String str, String str2, int i7) {
        payShopTradeRecordDetailActivity.getClass();
        OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(payShopTradeRecordDetailActivity, str, str2);
        orderResultAmountStyle1.b(8);
        payShopTradeRecordDetailActivity.p().addView(orderResultAmountStyle1);
    }

    public static OrderResultItemModel o(PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity, String str, CharSequence charSequence) {
        payShopTradeRecordDetailActivity.getClass();
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(payShopTradeRecordDetailActivity, 1002, str, charSequence);
        Object value = payShopTradeRecordDetailActivity.f28755i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).addView(orderResultItemModel);
        return orderResultItemModel;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_trade_record_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((PayShopPaymentViewModel) l()).f30704e;
        if (lVar != null) {
            lVar.e(this, new s(new p141j9.t(this, this, 16), (char) 0, false));
        }
    }

    public final LinearLayout p() {
        Object value = this.f28756j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("orderId");
        this.t = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.t = getQueryParameter("orderId");
        }
        if (TextUtils.isEmpty(this.t)) {
            return;
        }
        showLoadingDialog(true);
        ((PayShopPaymentViewModel) l()).d(this.t);
    }

    public final OrderResultHeaderModel q() {
        Object value = this.f28757o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultHeaderModel) value;
    }

    public final void r() {
        if (this.f28759v != null) {
            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
            QueryOrderDetailRsp queryOrderDetailRsp = this.f28759v;
            if (queryOrderDetailRsp != null) {
                orderInfoForCustomerService.paymentType = getString(g.cs_pay_shop_label);
                Long l5 = queryOrderDetailRsp.orderSuccessTime;
                orderInfoForCustomerService.time = l5 != null ? l5.longValue() : 0L;
                Long l6 = queryOrderDetailRsp.payAmount;
                orderInfoForCustomerService.amount = l6 != null ? l6.longValue() : 0L;
                orderInfoForCustomerService.orderNumber = queryOrderDetailRsp.orderNo;
                orderInfoForCustomerService.orderStatus = queryOrderDetailRsp.orderStatusDesc;
                BillProcessDetail billProcessDetail = queryOrderDetailRsp.orderStatusInfo;
                if (billProcessDetail != null) {
                    orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
                }
                orderInfoForCustomerService.transType = TransType.TRANS_TYPE_PAY_SHOP;
            }
            i0.M(this, orderInfoForCustomerService);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
        t tVar = this.f28758p;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setRightImageView2Icon(S6.a.pay_CustomerService);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i7 = 0;
        ((PpTitleBar) value2).setRightImageView2ClickListener(new View.OnClickListener(this) { // from class: sb.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42124b;

            {
                this.f42124b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42124b;
                switch (i7) {
                    case 0:
                        int i10 = PayShopTradeRecordDetailActivity.f28752w;
                        payShopTradeRecordDetailActivity.r();
                        break;
                    case 1:
                        int i11 = PayShopTradeRecordDetailActivity.f28752w;
                        payShopTradeRecordDetailActivity.onBackPressed();
                        break;
                    default:
                        int i12 = PayShopTradeRecordDetailActivity.f28752w;
                        if (!BaseApplication.isAO()) {
                            QueryOrderDetailRsp queryOrderDetailRsp = payShopTradeRecordDetailActivity.f28759v;
                            if (queryOrderDetailRsp != null) {
                                ARouter.getInstance().build("/credit_score/trans_receipt").withString("orderId", queryOrderDetailRsp.orderNo).navigation();
                            }
                        } else {
                            N9.f fVar = new N9.f();
                            QueryOrderDetailRsp queryOrderDetailRsp2 = payShopTradeRecordDetailActivity.f28759v;
                            if (queryOrderDetailRsp2 != null) {
                                fVar.f6270a = queryOrderDetailRsp2.orderNo;
                                fVar.f6271b = queryOrderDetailRsp2.payeeMerchantName;
                                fVar.f6272c = "";
                                fVar.f6273d = queryOrderDetailRsp2.orderSuccessTime;
                                fVar.f6274e = queryOrderDetailRsp2.payAmount;
                                fVar.f6275f = queryOrderDetailRsp2.paymentTypeDesc;
                                fVar.f6276g = queryOrderDetailRsp2.payTypeDesc;
                                fVar.f6277h = queryOrderDetailRsp2.payerName;
                                fVar.f6278i = "";
                                fVar.f6279j = i0.n(r0.w0(BaseApplication.getInstance().getUser().getPhoneNumber()), false);
                                fVar.f6283n = queryOrderDetailRsp2.orderStatusDesc;
                            }
                            fVar.a(payShopTradeRecordDetailActivity);
                        }
                        break;
                }
            }
        });
        ARouter.getInstance().inject(this);
        Object value3 = this.f28754g.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((OrderResultCustomerServiceModel) value3).setOnCustomerServiceModelListener(new I(this));
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 1;
        ((PpTitleBar) value4).setBackButtonClickListener(new View.OnClickListener(this) { // from class: sb.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42124b;

            {
                this.f42124b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42124b;
                switch (i10) {
                    case 0:
                        int i11 = PayShopTradeRecordDetailActivity.f28752w;
                        payShopTradeRecordDetailActivity.r();
                        break;
                    case 1:
                        int i12 = PayShopTradeRecordDetailActivity.f28752w;
                        payShopTradeRecordDetailActivity.onBackPressed();
                        break;
                    default:
                        int i13 = PayShopTradeRecordDetailActivity.f28752w;
                        if (!BaseApplication.isAO()) {
                            QueryOrderDetailRsp queryOrderDetailRsp = payShopTradeRecordDetailActivity.f28759v;
                            if (queryOrderDetailRsp != null) {
                                ARouter.getInstance().build("/credit_score/trans_receipt").withString("orderId", queryOrderDetailRsp.orderNo).navigation();
                            }
                        } else {
                            N9.f fVar = new N9.f();
                            QueryOrderDetailRsp queryOrderDetailRsp2 = payShopTradeRecordDetailActivity.f28759v;
                            if (queryOrderDetailRsp2 != null) {
                                fVar.f6270a = queryOrderDetailRsp2.orderNo;
                                fVar.f6271b = queryOrderDetailRsp2.payeeMerchantName;
                                fVar.f6272c = "";
                                fVar.f6273d = queryOrderDetailRsp2.orderSuccessTime;
                                fVar.f6274e = queryOrderDetailRsp2.payAmount;
                                fVar.f6275f = queryOrderDetailRsp2.paymentTypeDesc;
                                fVar.f6276g = queryOrderDetailRsp2.payTypeDesc;
                                fVar.f6277h = queryOrderDetailRsp2.payerName;
                                fVar.f6278i = "";
                                fVar.f6279j = i0.n(r0.w0(BaseApplication.getInstance().getUser().getPhoneNumber()), false);
                                fVar.f6283n = queryOrderDetailRsp2.orderStatusDesc;
                            }
                            fVar.a(payShopTradeRecordDetailActivity);
                        }
                        break;
                }
            }
        });
        Object value5 = this.f28753f.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: sb.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopTradeRecordDetailActivity f42124b;

            {
                this.f42124b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PayShopTradeRecordDetailActivity payShopTradeRecordDetailActivity = this.f42124b;
                switch (i11) {
                    case 0:
                        int i12 = PayShopTradeRecordDetailActivity.f28752w;
                        payShopTradeRecordDetailActivity.r();
                        break;
                    case 1:
                        int i13 = PayShopTradeRecordDetailActivity.f28752w;
                        payShopTradeRecordDetailActivity.onBackPressed();
                        break;
                    default:
                        int i14 = PayShopTradeRecordDetailActivity.f28752w;
                        if (!BaseApplication.isAO()) {
                            QueryOrderDetailRsp queryOrderDetailRsp = payShopTradeRecordDetailActivity.f28759v;
                            if (queryOrderDetailRsp != null) {
                                ARouter.getInstance().build("/credit_score/trans_receipt").withString("orderId", queryOrderDetailRsp.orderNo).navigation();
                            }
                        } else {
                            N9.f fVar = new N9.f();
                            QueryOrderDetailRsp queryOrderDetailRsp2 = payShopTradeRecordDetailActivity.f28759v;
                            if (queryOrderDetailRsp2 != null) {
                                fVar.f6270a = queryOrderDetailRsp2.orderNo;
                                fVar.f6271b = queryOrderDetailRsp2.payeeMerchantName;
                                fVar.f6272c = "";
                                fVar.f6273d = queryOrderDetailRsp2.orderSuccessTime;
                                fVar.f6274e = queryOrderDetailRsp2.payAmount;
                                fVar.f6275f = queryOrderDetailRsp2.paymentTypeDesc;
                                fVar.f6276g = queryOrderDetailRsp2.payTypeDesc;
                                fVar.f6277h = queryOrderDetailRsp2.payerName;
                                fVar.f6278i = "";
                                fVar.f6279j = i0.n(r0.w0(BaseApplication.getInstance().getUser().getPhoneNumber()), false);
                                fVar.f6283n = queryOrderDetailRsp2.orderStatusDesc;
                            }
                            fVar.a(payShopTradeRecordDetailActivity);
                        }
                        break;
                }
            }
        }, (OrderResultViewReceiptModel) value5);
    }
}
