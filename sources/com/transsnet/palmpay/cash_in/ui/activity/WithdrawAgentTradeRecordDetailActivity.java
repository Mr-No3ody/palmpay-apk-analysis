package com.transsnet.palmpay.cash_in.ui.activity;

import C0.G;
import C9.C0138e;
import C9.Q;
import C9.S;
import L6.b;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawAgentTradeRecordDetailActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawDetailViewModel;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cash_in_out/detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/WithdrawAgentTradeRecordDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawDetailViewModel;", "<init>", "()V", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(message = "使用RN的CommonDetail")
@SourceDebugExtension({"SMAP\nWithdrawAgentTradeRecordDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawAgentTradeRecordDetailActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawAgentTradeRecordDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,551:1\n171#2,12:552\n215#2:564\n*S KotlinDebug\n*F\n+ 1 WithdrawAgentTradeRecordDetailActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/WithdrawAgentTradeRecordDetailActivity\n*L\n116#1:552,12\n116#1:564\n*E\n"})
public final class WithdrawAgentTradeRecordDetailActivity extends BaseMvvmActivity<WithdrawDetailViewModel> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f26924p = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26929g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26931j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public QueryOrderDetailRsp f26932o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str) {
            context.startActivity(G.e(context, "context", context, WithdrawAgentTradeRecordDetailActivity.class).putExtra("orderId", str));
        }

        private a() {
        }

        @JvmStatic
        public final void startActivity(@NotNull Context context, @Nullable String str, int i7) {
            context.startActivity(G.e(context, "context", context, WithdrawAgentTradeRecordDetailActivity.class).putExtra("orderId", str).putExtra("orderType", i7));
        }
    }

    static {
        new a(null);
    }

    public WithdrawAgentTradeRecordDetailActivity() {
        final int i7 = 0;
        this.f26925c = C2131j.b(new Function0(this) { // from class: C9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1273b;

            {
                this.f1273b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1273b;
                switch (i7) {
                    case 0:
                        int i10 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultViewReceiptModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_view_receipt);
                    case 1:
                        int i11 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultCustomerServiceModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_customer_service);
                    case 2:
                        int i12 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_container_middle);
                    case 3:
                        int i13 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_fee_detail);
                    case 4:
                        int i14 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultHeaderModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.orlm_heaer);
                    default:
                        int i15 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (PpTitleBar) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i10 = 1;
        this.f26926d = C2131j.b(new Function0(this) { // from class: C9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1273b;

            {
                this.f1273b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1273b;
                switch (i10) {
                    case 0:
                        int i11 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultViewReceiptModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_view_receipt);
                    case 1:
                        int i12 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultCustomerServiceModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_customer_service);
                    case 2:
                        int i13 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_container_middle);
                    case 3:
                        int i14 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_fee_detail);
                    case 4:
                        int i15 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultHeaderModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.orlm_heaer);
                    default:
                        int i16 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (PpTitleBar) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i11 = 2;
        this.f26927e = C2131j.b(new Function0(this) { // from class: C9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1273b;

            {
                this.f1273b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1273b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultViewReceiptModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_view_receipt);
                    case 1:
                        int i13 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultCustomerServiceModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_customer_service);
                    case 2:
                        int i14 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_container_middle);
                    case 3:
                        int i15 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_fee_detail);
                    case 4:
                        int i16 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultHeaderModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.orlm_heaer);
                    default:
                        int i17 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (PpTitleBar) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i12 = 3;
        this.f26928f = C2131j.b(new Function0(this) { // from class: C9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1273b;

            {
                this.f1273b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1273b;
                switch (i12) {
                    case 0:
                        int i13 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultViewReceiptModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_view_receipt);
                    case 1:
                        int i14 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultCustomerServiceModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_customer_service);
                    case 2:
                        int i15 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_container_middle);
                    case 3:
                        int i16 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_fee_detail);
                    case 4:
                        int i17 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultHeaderModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.orlm_heaer);
                    default:
                        int i18 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (PpTitleBar) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i13 = 4;
        this.f26929g = C2131j.b(new Function0(this) { // from class: C9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1273b;

            {
                this.f1273b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1273b;
                switch (i13) {
                    case 0:
                        int i14 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultViewReceiptModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_view_receipt);
                    case 1:
                        int i15 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultCustomerServiceModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_customer_service);
                    case 2:
                        int i16 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_container_middle);
                    case 3:
                        int i17 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_fee_detail);
                    case 4:
                        int i18 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultHeaderModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.orlm_heaer);
                    default:
                        int i19 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (PpTitleBar) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
        final int i14 = 5;
        this.f26930i = C2131j.b(new Function0(this) { // from class: C9.P

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1273b;

            {
                this.f1273b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1273b;
                switch (i14) {
                    case 0:
                        int i15 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultViewReceiptModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_view_receipt);
                    case 1:
                        int i16 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultCustomerServiceModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.model_order_result_customer_service);
                    case 2:
                        int i17 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_container_middle);
                    case 3:
                        int i18 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (LinearLayout) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.ll_fee_detail);
                    case 4:
                        int i19 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (OrderResultHeaderModel) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.orlm_heaer);
                    default:
                        int i110 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        return (PpTitleBar) withdrawAgentTradeRecordDetailActivity.findViewById(p366y9.b.title_bar);
                }
            }
        });
    }

    public static void m(WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity, String str, String str2, int i7) {
        withdrawAgentTradeRecordDetailActivity.getClass();
        OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(withdrawAgentTradeRecordDetailActivity, str, str2);
        orderResultAmountStyle1.b(8);
        withdrawAgentTradeRecordDetailActivity.o().addView(orderResultAmountStyle1);
    }

    public static OrderResultItemModel n(WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity, String str, CharSequence charSequence) {
        withdrawAgentTradeRecordDetailActivity.getClass();
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(withdrawAgentTradeRecordDetailActivity, 1002, str, charSequence);
        Object value = withdrawAgentTradeRecordDetailActivity.f26927e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).addView(orderResultItemModel);
        return orderResultItemModel;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_trade_record_detail_activity;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((WithdrawDetailViewModel) l()).f27106f;
        if (lVar != null) {
            lVar.e(this, new C0138e(new Q(0, this, this)));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this), true);
    }

    public final LinearLayout o() {
        Object value = this.f26928f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final OrderResultHeaderModel p() {
        Object value = this.f26929g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultHeaderModel) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("orderId");
        this.f26931j = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f26931j = getQueryParameter("orderId");
        }
        if (TextUtils.isEmpty(this.f26931j)) {
            return;
        }
        showLoadingDialog(true);
        ((WithdrawDetailViewModel) l()).d(this.f26931j);
    }

    public final void q() {
        if (this.f26932o != null) {
            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
            QueryOrderDetailRsp queryOrderDetailRsp = this.f26932o;
            if (queryOrderDetailRsp != null) {
                orderInfoForCustomerService.paymentType = getString(d.ci_withdraw_agent_label);
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
                orderInfoForCustomerService.transType = TransType.TRANS_TYPE_WITHDRAW_TO_AGENT;
            }
            i0.M(this, orderInfoForCustomerService);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        t tVar = this.f26930i;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setRightImageView1Icon(S6.a.pay_CustomerService);
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        final int i7 = 0;
        ((PpTitleBar) value2).setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: C9.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1271b;

            {
                this.f1271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1271b;
                switch (i7) {
                    case 0:
                        int i10 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        withdrawAgentTradeRecordDetailActivity.q();
                        break;
                    case 1:
                        int i11 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        withdrawAgentTradeRecordDetailActivity.onBackPressed();
                        break;
                    default:
                        int i12 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        if (!BaseApplication.isAO()) {
                            QueryOrderDetailRsp queryOrderDetailRsp = withdrawAgentTradeRecordDetailActivity.f26932o;
                            if (queryOrderDetailRsp != null) {
                                ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", TransType.TRANS_TYPE_WITHDRAW_TO_AGENT).withString("orderId", queryOrderDetailRsp.orderNo).navigation();
                            }
                        } else {
                            N9.f fVar = new N9.f();
                            QueryOrderDetailRsp queryOrderDetailRsp2 = withdrawAgentTradeRecordDetailActivity.f26932o;
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
                            fVar.a(withdrawAgentTradeRecordDetailActivity);
                        }
                        break;
                }
            }
        });
        ARouter.getInstance().inject(this);
        Object value3 = this.f26926d.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((OrderResultCustomerServiceModel) value3).setOnCustomerServiceModelListener(new S(this));
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        final int i10 = 1;
        ((PpTitleBar) value4).setBackButtonClickListener(new View.OnClickListener(this) { // from class: C9.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1271b;

            {
                this.f1271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1271b;
                switch (i10) {
                    case 0:
                        int i11 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        withdrawAgentTradeRecordDetailActivity.q();
                        break;
                    case 1:
                        int i12 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        withdrawAgentTradeRecordDetailActivity.onBackPressed();
                        break;
                    default:
                        int i13 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        if (!BaseApplication.isAO()) {
                            QueryOrderDetailRsp queryOrderDetailRsp = withdrawAgentTradeRecordDetailActivity.f26932o;
                            if (queryOrderDetailRsp != null) {
                                ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", TransType.TRANS_TYPE_WITHDRAW_TO_AGENT).withString("orderId", queryOrderDetailRsp.orderNo).navigation();
                            }
                        } else {
                            N9.f fVar = new N9.f();
                            QueryOrderDetailRsp queryOrderDetailRsp2 = withdrawAgentTradeRecordDetailActivity.f26932o;
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
                            fVar.a(withdrawAgentTradeRecordDetailActivity);
                        }
                        break;
                }
            }
        });
        Object value5 = this.f26925c.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i11 = 2;
        ((OrderResultViewReceiptModel) value5).setOnClickListener(new View.OnClickListener(this) { // from class: C9.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawAgentTradeRecordDetailActivity f1271b;

            {
                this.f1271b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WithdrawAgentTradeRecordDetailActivity withdrawAgentTradeRecordDetailActivity = this.f1271b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        withdrawAgentTradeRecordDetailActivity.q();
                        break;
                    case 1:
                        int i13 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        withdrawAgentTradeRecordDetailActivity.onBackPressed();
                        break;
                    default:
                        int i14 = WithdrawAgentTradeRecordDetailActivity.f26924p;
                        if (!BaseApplication.isAO()) {
                            QueryOrderDetailRsp queryOrderDetailRsp = withdrawAgentTradeRecordDetailActivity.f26932o;
                            if (queryOrderDetailRsp != null) {
                                ARouter.getInstance().build("/cash_in_out/trans_receipt").withString("transType", TransType.TRANS_TYPE_WITHDRAW_TO_AGENT).withString("orderId", queryOrderDetailRsp.orderNo).navigation();
                            }
                        } else {
                            N9.f fVar = new N9.f();
                            QueryOrderDetailRsp queryOrderDetailRsp2 = withdrawAgentTradeRecordDetailActivity.f26932o;
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
                            fVar.a(withdrawAgentTradeRecordDetailActivity);
                        }
                        break;
                }
            }
        });
    }
}
