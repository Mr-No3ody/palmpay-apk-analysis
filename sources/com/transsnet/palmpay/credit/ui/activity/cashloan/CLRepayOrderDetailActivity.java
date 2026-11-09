package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import Pa.r0;
import Ya.e;
import Ya.f;
import Za.d;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.credit.bean.req.OcOrderDetailReq;
import com.transsnet.palmpay.credit.bean.resp.CLOrderDetailData;
import com.transsnet.palmpay.credit.bean.resp.CLOrderDetailResp;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepayOrderDetailActivity;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.s;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p071ef.b;
import p220oa.h;
import p221ob.c;
import p284sb.A;
import p294tb.C2055q;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit还款订单详情页", path = "/credit_score/cl_repay_order_detail_activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepayOrderDetailActivity;", "LZa/d;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepayOrderDetailActivity extends d implements CompleteCallback<File> {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f29020M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f29021A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f29022B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f29023C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f29024H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public CLOrderDetailResp f29025L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29029g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29031j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29033p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f29034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f29035w;

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

    public CLRepayOrderDetailActivity() {
        final int i7 = 0;
        this.f29026d = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i11 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i12 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i13 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i14 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i15 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i16 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i10 = 1;
        this.f29027e = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i12 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i13 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i14 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i15 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i16 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i11 = 2;
        this.f29028f = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i11) {
                    case 0:
                        int i12 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i13 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i14 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i15 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i16 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i110 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i12 = 3;
        this.f29029g = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i12) {
                    case 0:
                        int i13 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i14 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i15 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i16 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i110 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i111 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i13 = 4;
        this.f29030i = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i13) {
                    case 0:
                        int i14 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i15 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i16 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i110 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i111 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i112 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i14 = 5;
        this.f29031j = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i14) {
                    case 0:
                        int i15 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i16 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i110 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i111 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i112 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i113 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i15 = 6;
        this.f29032o = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i15) {
                    case 0:
                        int i16 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i110 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i111 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i112 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i113 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i114 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i16 = 7;
        this.f29033p = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i16) {
                    case 0:
                        int i17 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i110 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i111 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i112 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i113 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i114 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i115 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
        final int i17 = 8;
        this.t = C2131j.b(new Function0(this) { // from class: tb.Q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42427b;

            {
                this.f42427b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42427b;
                switch (i17) {
                    case 0:
                        int i18 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i19 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 2:
                        int i110 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 3:
                        int i111 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 4:
                        int i112 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    case 5:
                        int i113 = CLRepayOrderDetailActivity.f29020M;
                        return (TextView) cLRepayOrderDetailActivity.findViewById(e.view_loan_tv);
                    case 6:
                        int i114 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelTitleContentImg) cLRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                    case 7:
                        int i115 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelAmountList) cLRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    default:
                        int i116 = CLRepayOrderDetailActivity.f29020M;
                        return (ModelBillDetailTitle) cLRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_repay_order_detail_layout;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[REMOVE] */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String str = this.f29022B;
        if (str == null) {
            p().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 3248) {
                if (iHashCode != 3340) {
                    if (iHashCode == 3341 && str.equals(TransType.TRANS_TYPE_CL_REPAY)) {
                        p().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
                    } else {
                        p().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
                    }
                } else if (str.equals(TransType.TRANS_TYPE_CL_BORROW)) {
                    p().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
                } else {
                    p().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
                }
            } else if (str.equals(TransType.TRANS_TYPE_OK_CARD)) {
                p().f31471i.setImageResource(r.cv_ok_card_icon);
            } else {
                p().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
            }
        }
        showLoadingDialog(true);
        G.h(c.f40268a).getCLOrderDetail(new OcOrderDetailReq(this.f29023C, this.f29024H)).k(p298tf.f.f42629b).i(b.a()).subscribe(new C2055q(this, 3));
    }

    public final ModelAmountList n() {
        Object value = this.f29033p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelAmountList) value;
    }

    public final ModelTitleContentImg o() {
        Object value = this.f29030i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelTitleContentImg) value;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] objects = fileArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        p().t.setVisibility(0);
        ARouter.getInstance().build("/coreImpl/receipt_share_page").withSerializable("extra_data", objects[0]).navigation();
    }

    public final ModelBillDetailTitle p() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelBillDetailTitle) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f29022B = getQueryParameter("orderType");
        this.f29023C = getQueryParameter("orderNo");
        this.f29024H = getQueryParameter("oc_order_detail_card_no");
        n().f31440w.f31454c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f29034v = (TextView) findViewById(s.atubd_contact_service_tv);
        this.f29035w = (RelativeLayout) findViewById(s.atubd_contact_service_area);
        this.f29021A = (TextView) findViewById(s.atubd_error_reason_tv);
        TextView textView = this.f29034v;
        if (textView != null) {
            textView.setTextColor(getColor(Ya.b.cs_cl_main_color));
        }
        TextView textView2 = this.f29034v;
        if (textView2 != null) {
            h.l(new A(11), textView2);
        }
        p().f31474p.setBackgroundColor(getColor(Ya.b.cs_cl_main_color));
        p().t.setVisibility(8);
        ImageView mDownloadIv = p().t;
        Intrinsics.checkNotNullExpressionValue(mDownloadIv, "mDownloadIv");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42429b;

            {
                this.f42429b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLOrderDetailData data;
                CLOrderDetailData data2;
                CLOrderDetailData data3;
                CLOrderDetailData data4;
                CLOrderDetailData data5;
                CLOrderDetailData data6;
                Integer largeLoanTerm;
                int iIntValue = 0;
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42429b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepayOrderDetailActivity.f29020M;
                        cLRepayOrderDetailActivity.p().t.setVisibility(4);
                        r0.L1(cLRepayOrderDetailActivity.f29023C, cLRepayOrderDetailActivity, cLRepayOrderDetailActivity.p(), cLRepayOrderDetailActivity.findViewById(e.scrollView));
                        break;
                    default:
                        CLOrderDetailResp cLOrderDetailResp = cLRepayOrderDetailActivity.f29025L;
                        if (cLOrderDetailResp != null && (data6 = cLOrderDetailResp.getData()) != null && (largeLoanTerm = data6.getLargeLoanTerm()) != null) {
                            iIntValue = largeLoanTerm.intValue();
                        }
                        String loanProduct = null;
                        if (iIntValue <= 1) {
                            Bundle bundle = new Bundle();
                            CLOrderDetailResp cLOrderDetailResp2 = cLRepayOrderDetailActivity.f29025L;
                            bundle.putString("billId", String.valueOf((cLOrderDetailResp2 == null || (data4 = cLOrderDetailResp2.getData()) == null) ? null : data4.getBillId()));
                            CLOrderDetailResp cLOrderDetailResp3 = cLRepayOrderDetailActivity.f29025L;
                            bundle.putString("accountType", (cLOrderDetailResp3 == null || (data3 = cLOrderDetailResp3.getData()) == null) ? null : data3.getAccountType());
                            CLOrderDetailResp cLOrderDetailResp4 = cLRepayOrderDetailActivity.f29025L;
                            bundle.putString("cardNo", (cLOrderDetailResp4 == null || (data2 = cLOrderDetailResp4.getData()) == null) ? null : data2.getCardNo());
                            CLOrderDetailResp cLOrderDetailResp5 = cLRepayOrderDetailActivity.f29025L;
                            if (cLOrderDetailResp5 != null && (data = cLOrderDetailResp5.getData()) != null) {
                                loanProduct = data.getLoanProduct();
                            }
                            bundle.putString("loanProduct", loanProduct);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOutstandingBill");
                        } else {
                            Bundle bundle2 = new Bundle();
                            CLOrderDetailResp cLOrderDetailResp6 = cLRepayOrderDetailActivity.f29025L;
                            if (cLOrderDetailResp6 != null && (data5 = cLOrderDetailResp6.getData()) != null) {
                                loanProduct = data5.getLoanNo();
                            }
                            bundle2.putString("loanNo", loanProduct);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanOverview");
                        }
                        break;
                }
            }
        }, mDownloadIv);
        n().e(false);
        Object value = this.f29031j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepayOrderDetailActivity f42429b;

            {
                this.f42429b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLOrderDetailData data;
                CLOrderDetailData data2;
                CLOrderDetailData data3;
                CLOrderDetailData data4;
                CLOrderDetailData data5;
                CLOrderDetailData data6;
                Integer largeLoanTerm;
                int iIntValue = 0;
                CLRepayOrderDetailActivity cLRepayOrderDetailActivity = this.f42429b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepayOrderDetailActivity.f29020M;
                        cLRepayOrderDetailActivity.p().t.setVisibility(4);
                        r0.L1(cLRepayOrderDetailActivity.f29023C, cLRepayOrderDetailActivity, cLRepayOrderDetailActivity.p(), cLRepayOrderDetailActivity.findViewById(e.scrollView));
                        break;
                    default:
                        CLOrderDetailResp cLOrderDetailResp = cLRepayOrderDetailActivity.f29025L;
                        if (cLOrderDetailResp != null && (data6 = cLOrderDetailResp.getData()) != null && (largeLoanTerm = data6.getLargeLoanTerm()) != null) {
                            iIntValue = largeLoanTerm.intValue();
                        }
                        String loanProduct = null;
                        if (iIntValue <= 1) {
                            Bundle bundle = new Bundle();
                            CLOrderDetailResp cLOrderDetailResp2 = cLRepayOrderDetailActivity.f29025L;
                            bundle.putString("billId", String.valueOf((cLOrderDetailResp2 == null || (data4 = cLOrderDetailResp2.getData()) == null) ? null : data4.getBillId()));
                            CLOrderDetailResp cLOrderDetailResp3 = cLRepayOrderDetailActivity.f29025L;
                            bundle.putString("accountType", (cLOrderDetailResp3 == null || (data3 = cLOrderDetailResp3.getData()) == null) ? null : data3.getAccountType());
                            CLOrderDetailResp cLOrderDetailResp4 = cLRepayOrderDetailActivity.f29025L;
                            bundle.putString("cardNo", (cLOrderDetailResp4 == null || (data2 = cLOrderDetailResp4.getData()) == null) ? null : data2.getCardNo());
                            CLOrderDetailResp cLOrderDetailResp5 = cLRepayOrderDetailActivity.f29025L;
                            if (cLOrderDetailResp5 != null && (data = cLOrderDetailResp5.getData()) != null) {
                                loanProduct = data.getLoanProduct();
                            }
                            bundle.putString("loanProduct", loanProduct);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LoanOutstandingBill");
                        } else {
                            Bundle bundle2 = new Bundle();
                            CLOrderDetailResp cLOrderDetailResp6 = cLRepayOrderDetailActivity.f29025L;
                            if (cLOrderDetailResp6 != null && (data5 = cLOrderDetailResp6.getData()) != null) {
                                loanProduct = data5.getLoanNo();
                            }
                            bundle2.putString("loanNo", loanProduct);
                            com.palmpay.lib.apm.launchcounter.util.d.x(bundle2, "LoanOverview");
                        }
                        break;
                }
            }
        }, (TextView) value);
    }
}
