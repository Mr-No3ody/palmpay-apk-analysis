package com.transsnet.palmpay.cash_in.ui.activity;

import C0.G;
import C9.C0137d;
import C9.C0138e;
import C9.C0139f;
import L6.b;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import S6.a;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.cash_in.bean.response.BindBankCardDetail;
import com.transsnet.palmpay.cash_in.ui.activity.BindBankCardResultActivity;
import com.transsnet.palmpay.cash_in.ui.view.BindBankCardProgressModel;
import com.transsnet.palmpay.cash_in.ui.viewmodel.BindBankCardViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.BillProcessTitleData1;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p025ba.k;
import p042cg.e;
import p042cg.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cash_in_out/bind_bank_card_result")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/BindBankCardResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/BindBankCardViewModel;", "<init>", "()V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindBankCardResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindBankCardResultActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/BindBankCardResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,310:1\n1#2:311\n115#3,8:312\n145#3:320\n*S KotlinDebug\n*F\n+ 1 BindBankCardResultActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/BindBankCardResultActivity\n*L\n190#1:312,8\n190#1:320\n*E\n"})
public final class BindBankCardResultActivity extends BaseMvvmActivity<BindBankCardViewModel> {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PayByOrderResp.DataBean f26795g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BindBankCardDetail f26798o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Long f26796i = 0L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f26797j = 0L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f26799p = 100;

    public BindBankCardResultActivity() {
        final int i7 = 0;
        this.f26791c = C2131j.b(new Function0(this) { // from class: C9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardResultActivity f1294b;

            {
                this.f1294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardResultActivity bindBankCardResultActivity = this.f1294b;
                switch (i7) {
                    case 0:
                        int i10 = BindBankCardResultActivity.t;
                        return bindBankCardResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 1:
                        int i11 = BindBankCardResultActivity.t;
                        return (LinearLayout) bindBankCardResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 2:
                        int i12 = BindBankCardResultActivity.t;
                        return (BindBankCardProgressModel) bindBankCardResultActivity.findViewById(p366y9.b.v_progress);
                    default:
                        int i13 = BindBankCardResultActivity.t;
                        return (TransactionResultHeaderModel) bindBankCardResultActivity.findViewById(p366y9.b.header_view);
                }
            }
        });
        final int i10 = 1;
        this.f26792d = C2131j.b(new Function0(this) { // from class: C9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardResultActivity f1294b;

            {
                this.f1294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardResultActivity bindBankCardResultActivity = this.f1294b;
                switch (i10) {
                    case 0:
                        int i11 = BindBankCardResultActivity.t;
                        return bindBankCardResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 1:
                        int i12 = BindBankCardResultActivity.t;
                        return (LinearLayout) bindBankCardResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 2:
                        int i13 = BindBankCardResultActivity.t;
                        return (BindBankCardProgressModel) bindBankCardResultActivity.findViewById(p366y9.b.v_progress);
                    default:
                        int i14 = BindBankCardResultActivity.t;
                        return (TransactionResultHeaderModel) bindBankCardResultActivity.findViewById(p366y9.b.header_view);
                }
            }
        });
        final int i11 = 2;
        this.f26793e = C2131j.b(new Function0(this) { // from class: C9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardResultActivity f1294b;

            {
                this.f1294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardResultActivity bindBankCardResultActivity = this.f1294b;
                switch (i11) {
                    case 0:
                        int i12 = BindBankCardResultActivity.t;
                        return bindBankCardResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 1:
                        int i13 = BindBankCardResultActivity.t;
                        return (LinearLayout) bindBankCardResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 2:
                        int i14 = BindBankCardResultActivity.t;
                        return (BindBankCardProgressModel) bindBankCardResultActivity.findViewById(p366y9.b.v_progress);
                    default:
                        int i15 = BindBankCardResultActivity.t;
                        return (TransactionResultHeaderModel) bindBankCardResultActivity.findViewById(p366y9.b.header_view);
                }
            }
        });
        final int i12 = 3;
        this.f26794f = C2131j.b(new Function0(this) { // from class: C9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardResultActivity f1294b;

            {
                this.f1294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BindBankCardResultActivity bindBankCardResultActivity = this.f1294b;
                switch (i12) {
                    case 0:
                        int i13 = BindBankCardResultActivity.t;
                        return bindBankCardResultActivity.findViewById(p366y9.b.result_two_btn_view);
                    case 1:
                        int i14 = BindBankCardResultActivity.t;
                        return (LinearLayout) bindBankCardResultActivity.findViewById(p366y9.b.ll_order_info);
                    case 2:
                        int i15 = BindBankCardResultActivity.t;
                        return (BindBankCardProgressModel) bindBankCardResultActivity.findViewById(p366y9.b.v_progress);
                    default:
                        int i16 = BindBankCardResultActivity.t;
                        return (TransactionResultHeaderModel) bindBankCardResultActivity.findViewById(p366y9.b.header_view);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.ci_activity_bind_bank_card_result;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        o();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    public final TransactionResultHeaderModel m() {
        Object value = this.f26794f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TransactionResultHeaderModel) value;
    }

    public final void n() {
        Long l5 = this.f26796i;
        if (l5 == null || l5.longValue() != 1) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_REFRESH_BANK_CARD_LIST));
            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.bankcard.BankCardAndAccountActivity");
            if (activityIsActivityExistsInStack != null) {
                ActivityUtils.finishToActivity(activityIsActivityExistsInStack, false);
                return;
            } else {
                i0.H(null);
                return;
            }
        }
        Long l6 = this.f26797j;
        if (l6 != null && l6.longValue() == 2) {
            Activity activityIsActivityExistsInStack2 = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity");
            if (activityIsActivityExistsInStack2 != null) {
                ActivityUtils.finishToActivity(activityIsActivityExistsInStack2, true);
                return;
            }
            return;
        }
        PayByOrderResp.DataBean dataBean = this.f26795g;
        if (Intrinsics.c(dataBean != null ? Integer.valueOf(dataBean.payStatus) : null, 1)) {
            org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_ADD_NEW_BANK_CARD, String.valueOf(this.f26796i)));
        }
        Activity activityIsActivityExistsInStack3 = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.core.ui.activity.AddBankCardAccountActivity");
        if (activityIsActivityExistsInStack3 != null) {
            ActivityUtils.finishToActivity(activityIsActivityExistsInStack3, false);
        }
    }

    public final void o() {
        List<BillProcessTitleData1> list;
        PayByOrderResp.DataBean dataBean = this.f26795g;
        if (dataBean != null) {
            Object value = this.f26791c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            h.s((View) value, true);
            C0525w c0525wF = C0525w.f();
            String str = dataBean.orderData;
            c0525wF.getClass();
            this.f26798o = (BindBankCardDetail) C0525w.d(str, BindBankCardDetail.class);
            int i7 = dataBean.payStatus;
            if (i7 == 1) {
                m().e(getString(k.core_successful));
                m().g(TransactionResultHeaderModel.a.successIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
            } else if (i7 == 2) {
                m().e(getString(k.core_failed));
                m().g(TransactionResultHeaderModel.a.failIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
            } else {
                m().e(getString(k.core_processing));
                m().g(TransactionResultHeaderModel.a.processingIcon$default(TransactionResultHeaderModel.f31650j, this, 0.0f, 2, null));
                CoroutineScope coroutineScopeH = V.h(l());
                f fVar = I.f10809a;
                AbstractC0780y.m(coroutineScopeH, e.f19009c, null, new C0137d(this, null), 2);
                long j6 = this.f26799p;
                if (j6 < 5000) {
                    this.f26799p = j6 + ((long) 1500);
                }
                Unit unit = Unit.f38893a;
            }
            BindBankCardDetail bindBankCardDetail = this.f26798o;
            if (bindBankCardDetail != null) {
                BillProcessDetail billProcessDetail = bindBankCardDetail.orderStatusInfo;
                if (billProcessDetail != null && billProcessDetail.showProcessBar && (list = billProcessDetail.tips) != null) {
                    List<BillProcessTitleData1> list2 = list.size() > 0 ? list : null;
                    if (list2 != null) {
                        t tVar = this.f26793e;
                        Object value2 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        h.C((BindBankCardProgressModel) value2);
                        Object value3 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        BindBankCardProgressModel bindBankCardProgressModel = (BindBankCardProgressModel) value3;
                        PayByOrderResp.DataBean dataBean2 = this.f26795g;
                        bindBankCardProgressModel.a((dataBean2 != null ? Integer.valueOf(dataBean2.payStatus) : 0).intValue(), list2);
                    }
                }
                t tVar2 = this.f26792d;
                Object value4 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((LinearLayout) value4).removeAllViews();
                OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, 1002, getString(k.core_card_number), bindBankCardDetail.bankCardNo);
                orderResultItemModel.setMinimumHeight(0);
                orderResultItemModel.setPadding(ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(12.0f), ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(12.0f));
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((LinearLayout) value5).addView(orderResultItemModel);
                Object value6 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                TextView textView = new TextView(this);
                textView.setText(G.i("View Detail").appendImage(r.cv_purple_arrow_right_bold).create());
                textView.setGravity(17);
                textView.setTextColor(getColor(b.ppColorPrimary));
                textView.setTextSize(12.0f);
                textView.setLayoutParams(new LinearLayout.LayoutParams(-1, ScreenUtils.dip2px(42.0f)));
                textView.setOnClickListener(new A8.b(bindBankCardDetail, 20));
                ((LinearLayout) value6).addView(textView);
            }
            TransactionResultHeaderModel transactionResultHeaderModelM = m();
            BindBankCardDetail bindBankCardDetail2 = this.f26798o;
            transactionResultHeaderModelM.c(r0.B(bindBankCardDetail2 != null ? bindBankCardDetail2.payAmount : 0L, true));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        n();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((BindBankCardViewModel) l()).f27095e;
        if (lVar != null) {
            lVar.e(this, new C0138e(new C0139f(this, 0)));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        View viewFindViewById = findViewById(p366y9.b.title_bar);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        PpTitleBar ppTitleBar = (PpTitleBar) viewFindViewById;
        ImageView backImageView = ppTitleBar.getBackImageView();
        Intrinsics.checkNotNullExpressionValue(backImageView, "getBackImageView(...)");
        h.c(backImageView);
        ppTitleBar.setRightImageView1Icon(a.pay_CustomerService);
        final int i7 = 0;
        ppTitleBar.setRightImageView1ClickListener(new View.OnClickListener(this) { // from class: C9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BindBankCardResultActivity f1292b;

            {
                this.f1292b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BindBankCardResultActivity bindBankCardResultActivity = this.f1292b;
                switch (i7) {
                    case 0:
                        BindBankCardDetail bindBankCardDetail = bindBankCardResultActivity.f26798o;
                        if (bindBankCardDetail != null) {
                            OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                            orderInfoForCustomerService.paymentType = bindBankCardResultActivity.getString(p366y9.d.ci_withdraw_agent_label);
                            orderInfoForCustomerService.time = bindBankCardDetail.updateTime;
                            orderInfoForCustomerService.amount = bindBankCardDetail.payAmount;
                            orderInfoForCustomerService.fee = bindBankCardDetail.payFee;
                            orderInfoForCustomerService.orderNumber = bindBankCardDetail.orderId;
                            orderInfoForCustomerService.orderStatus = bindBankCardDetail.orderStatusDesc;
                            BillProcessDetail billProcessDetail = bindBankCardDetail.orderStatusInfo;
                            if (billProcessDetail != null) {
                                orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
                            }
                            orderInfoForCustomerService.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
                            i0.M(bindBankCardResultActivity, orderInfoForCustomerService);
                        }
                        break;
                    default:
                        int i10 = BindBankCardResultActivity.t;
                        bindBankCardResultActivity.n();
                        break;
                }
            }
        });
        View viewFindViewById2 = findViewById(p366y9.b.result_right_btn);
        if (viewFindViewById2 != null) {
            final int i10 = 1;
            viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: C9.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BindBankCardResultActivity f1292b;

                {
                    this.f1292b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BindBankCardResultActivity bindBankCardResultActivity = this.f1292b;
                    switch (i10) {
                        case 0:
                            BindBankCardDetail bindBankCardDetail = bindBankCardResultActivity.f26798o;
                            if (bindBankCardDetail != null) {
                                OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
                                orderInfoForCustomerService.paymentType = bindBankCardResultActivity.getString(p366y9.d.ci_withdraw_agent_label);
                                orderInfoForCustomerService.time = bindBankCardDetail.updateTime;
                                orderInfoForCustomerService.amount = bindBankCardDetail.payAmount;
                                orderInfoForCustomerService.fee = bindBankCardDetail.payFee;
                                orderInfoForCustomerService.orderNumber = bindBankCardDetail.orderId;
                                orderInfoForCustomerService.orderStatus = bindBankCardDetail.orderStatusDesc;
                                BillProcessDetail billProcessDetail = bindBankCardDetail.orderStatusInfo;
                                if (billProcessDetail != null) {
                                    orderInfoForCustomerService.faqUrl = billProcessDetail.faqLink;
                                }
                                orderInfoForCustomerService.transType = TransType.TRANS_TYPE_BIND_BANK_CARD;
                                i0.M(bindBankCardResultActivity, orderInfoForCustomerService);
                            }
                            break;
                        default:
                            int i11 = BindBankCardResultActivity.t;
                            bindBankCardResultActivity.n();
                            break;
                    }
                }
            });
        }
    }
}
