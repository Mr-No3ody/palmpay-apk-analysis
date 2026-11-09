package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ab.l;
import C0.G;
import Pa.i0;
import Ya.e;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.credit.bean.resp.TopUpOrderDetailRsp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailInPalmPayActivity;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p025ba.k;
import p294tb.C2055q;
import p310ub.l1;
import p310ub.m1;
import p310ub.n1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC在PalmPay还款订单详情页", path = "/credit_score/oc_repay_order_detail_in_palmpay_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayOrderDetailInPalmPayActivity;", "LZa/d;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcRepayOrderDetailInPalmPayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcRepayOrderDetailInPalmPayActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayOrderDetailInPalmPayActivity\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,647:1\n48#2:648\n*S KotlinDebug\n*F\n+ 1 OcRepayOrderDetailInPalmPayActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayOrderDetailInPalmPayActivity\n*L\n365#1:648\n*E\n"})
public final class OcRepayOrderDetailInPalmPayActivity extends Za.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f29822o = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29826g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29828j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public OcRepayOrderDetailInPalmPayActivity() {
        final int i7 = 0;
        this.f29823d = C2131j.b(new Function0(this) { // from class: ub.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailInPalmPayActivity f42867b;

            {
                this.f42867b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity = this.f42867b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultCustomerServiceModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.customer_service_card);
                    case 1:
                        int i11 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i12 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_fee_detail);
                    default:
                        int i13 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultHeaderModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.orlm_heaer);
                }
            }
        });
        final int i10 = 1;
        this.f29824e = C2131j.b(new Function0(this) { // from class: ub.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailInPalmPayActivity f42867b;

            {
                this.f42867b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity = this.f42867b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultCustomerServiceModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.customer_service_card);
                    case 1:
                        int i12 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i13 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_fee_detail);
                    default:
                        int i14 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultHeaderModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.orlm_heaer);
                }
            }
        });
        final int i11 = 2;
        this.f29825f = C2131j.b(new Function0(this) { // from class: ub.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailInPalmPayActivity f42867b;

            {
                this.f42867b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity = this.f42867b;
                switch (i11) {
                    case 0:
                        int i12 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultCustomerServiceModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.customer_service_card);
                    case 1:
                        int i13 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i14 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_fee_detail);
                    default:
                        int i15 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultHeaderModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.orlm_heaer);
                }
            }
        });
        final int i12 = 3;
        this.f29826g = C2131j.b(new Function0(this) { // from class: ub.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailInPalmPayActivity f42867b;

            {
                this.f42867b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailInPalmPayActivity ocRepayOrderDetailInPalmPayActivity = this.f42867b;
                switch (i12) {
                    case 0:
                        int i13 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultCustomerServiceModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.customer_service_card);
                    case 1:
                        int i14 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_container_middle);
                    case 2:
                        int i15 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (LinearLayout) ocRepayOrderDetailInPalmPayActivity.findViewById(e.ll_fee_detail);
                    default:
                        int i16 = OcRepayOrderDetailInPalmPayActivity.f29822o;
                        return (OrderResultHeaderModel) ocRepayOrderDetailInPalmPayActivity.findViewById(e.orlm_heaer);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repay_order_detail_in_palmpay_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        F6.d.h(this.TAG, 3, G.o("initData >>> orderType=", this.f29827i));
        String str = this.f29827i;
        if (Intrinsics.c(str, TransType.TRANS_TYPE_AUTO_DEDUCT)) {
            showLoadingDialog(true);
            G.h(p221ob.c.f40268a).getAutoDeductOrderDetail(this.f29828j).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new l1(this));
        } else {
            if (!Intrinsics.c(str, TransType.TRANS_TYPE_MERCHANT_DISBURSEMENT)) {
                showLoadingDialog(true);
                G.h(p221ob.c.f40268a).getOcRepayResult(this.f29828j, this.f29827i).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new m1(this));
                return;
            }
            String str2 = this.f29828j;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            showLoadingDialog(true);
            ((IApiMainService) Cc.a.f1353a.f39520b).getMerchantDisburseOrderDetail(str2).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 25));
        }
    }

    @Override // com.transsnet.palmpay.core.base.h, com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), true);
    }

    public final OrderResultAmountStyle1 n(String str, CharSequence charSequence, boolean z3, View.OnClickListener onClickListener) {
        OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(this, str, charSequence);
        orderResultAmountStyle1.b(z3 ? 0 : 8);
        if (z3) {
            orderResultAmountStyle1.a(Ya.d.cs_oc_spread_repay_tips);
        }
        if (onClickListener != null && z3) {
            p220oa.h.l(onClickListener, orderResultAmountStyle1.getAmountItemKeyTv());
            p220oa.h.l(onClickListener, orderResultAmountStyle1.getAmountItemTipsIv());
        }
        s().addView(orderResultAmountStyle1);
        return orderResultAmountStyle1;
    }

    public final String o(int i7) {
        if (i7 == 2) {
            return getString(k.core_successful);
        }
        return (3 > i7 || i7 >= 6) ? getString(k.core_pending) : getString(k.core_failed);
    }

    public final OrderResultItemModel p(CharSequence charSequence, int i7, String str) {
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, i7, str, charSequence);
        if (i7 == 1003) {
            orderResultItemModel.setOnCopyListener(new p184m8.b(17));
        }
        r().addView(orderResultItemModel);
        return orderResultItemModel;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final OrderResultItemModel q(CharSequence charSequence, int i7, String str) {
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, i7, str, charSequence);
        if (i7 == 1003) {
            orderResultItemModel.setOnCopyListener(new p184m8.b(18));
        }
        s().addView(orderResultItemModel);
        return orderResultItemModel;
    }

    public final LinearLayout r() {
        Object value = this.f29824e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final LinearLayout s() {
        Object value = this.f29825f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        this.f29827i = getQueryParameter("orderType");
        this.f29828j = getQueryParameter("orderNo");
        getQueryParameter("oc_order_detail_card_no");
        Object value = this.f29823d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) value;
        Boolean bool = Boolean.TRUE;
        orderResultCustomerServiceModel.c();
        orderResultCustomerServiceModel.d(bool);
        orderResultCustomerServiceModel.setOnCustomerServiceModelListener(new n1());
    }

    public final OrderResultHeaderModel t() {
        Object value = this.f29826g.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OrderResultHeaderModel) value;
    }

    public final String u(TopUpOrderDetailRsp.DataBean dataBean) {
        int i7 = dataBean.payType;
        if (i7 == 1) {
            String string = getString(k.core_palmpay_payment_balance);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (i7 != 2) {
            return "";
        }
        String strH = i0.h(dataBean.bankName, dataBean.bankCard);
        if (strH != null) {
            if (TextUtils.isEmpty(strH)) {
                strH = null;
            }
            if (strH != null) {
                return strH;
            }
        }
        String string2 = getString(k.core_bank_card);
        Intrinsics.checkNotNullExpressionValue(string2, "run(...)");
        return string2;
    }

    public final String v() {
        String str = this.f29827i;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 3248) {
                if (iHashCode != 3340) {
                    if (iHashCode == 3341 && str.equals(TransType.TRANS_TYPE_CL_REPAY)) {
                        String string = getString(Ya.g.cs_cl_init_repayment);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        return string;
                    }
                } else if (str.equals(TransType.TRANS_TYPE_CL_BORROW)) {
                    String string2 = getString(Ya.g.cs_cl_init_borrow);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                }
            } else if (str.equals(TransType.TRANS_TYPE_OK_CARD)) {
                String string3 = getString(Ya.g.cs_oc_init_repayment);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            }
        }
        String string4 = getString(Ya.g.cs_oc_cl_init_repayment);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        return string4;
    }

    public final void w(String str) {
        F6.d.h(this.TAG, 3, G.o("showStampDutyDialog >>> stampDutyText=", str));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        F f10 = new F();
        O6.c cVar = new O6.c(this);
        cVar.f6596b = O6.d.f(getString(Ya.g.cs_cl_stamp_duty_dialog_title));
        cVar.f6598d = str;
        String string = getString(Ya.g.cs_got_it);
        l lVar = new l(f10, 8);
        cVar.f6600f = string;
        cVar.f6602h = lVar;
        O6.d dVarA = cVar.a();
        f10.f38951a = dVarA;
        dVarA.show();
    }
}
