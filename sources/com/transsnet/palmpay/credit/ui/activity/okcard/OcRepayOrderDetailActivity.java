package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import Pa.r0;
import Ya.e;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.credit.bean.req.OcOrderDetailReq;
import com.transsnet.palmpay.credit.bean.resp.OcOrderDetailData;
import com.transsnet.palmpay.credit.bean.resp.OcOrderDetailResp;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayOrderDetailActivity;
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
import p025ba.k;
import p294tb.C2055q;
import p310ub.h1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC还款订单详情页", path = "/credit_score/oc_repay_order_detail_activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayOrderDetailActivity;", "LZa/d;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepayOrderDetailActivity extends Za.d implements CompleteCallback<File> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f29803Y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f29804A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RelativeLayout f29805B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f29806C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public LinearLayout f29807H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f29808L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f29809M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f29810Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public OcOrderDetailResp f29811X;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29815g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29816i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29817j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29819p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29821w;

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

    public OcRepayOrderDetailActivity() {
        final int i7 = 0;
        this.f29812d = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i11 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i12 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i13 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i14 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i15 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i16 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i10 = 3;
        this.f29813e = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i12 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i13 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i14 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i15 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i16 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i11 = 4;
        this.f29814f = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i11) {
                    case 0:
                        int i12 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i13 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i14 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i15 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i16 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i12 = 5;
        this.f29815g = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i12) {
                    case 0:
                        int i13 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i14 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i15 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i16 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i13 = 6;
        this.f29816i = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i13) {
                    case 0:
                        int i14 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i15 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i16 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i113 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i14 = 7;
        this.f29817j = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i14) {
                    case 0:
                        int i15 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i16 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i113 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i114 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i15 = 8;
        this.f29818o = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i15) {
                    case 0:
                        int i16 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i113 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i114 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i115 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i16 = 9;
        this.f29819p = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i16) {
                    case 0:
                        int i17 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i113 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i114 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i115 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i116 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i17 = 10;
        this.t = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i17) {
                    case 0:
                        int i18 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i113 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i114 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i115 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i116 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i117 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i18 = 1;
        this.f29820v = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i18) {
                    case 0:
                        int i19 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i113 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i114 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i115 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i116 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i117 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i118 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
        final int i19 = 2;
        this.f29821w = C2131j.b(new Function0(this) { // from class: ub.f1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42851b;

            {
                this.f42851b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42851b;
                switch (i19) {
                    case 0:
                        int i110 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_create_time);
                    case 1:
                        int i111 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelAmountList) ocRepayOrderDetailActivity.findViewById(e.lite_ard_amount_list);
                    case 2:
                        int i112 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelBillDetailTitle) ocRepayOrderDetailActivity.findViewById(e.lite_ard_title_area);
                    case 3:
                        int i113 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_posted_time);
                    case 4:
                        int i114 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_palmpay_order_number);
                    case 5:
                        int i115 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.lite_ard_order_number);
                    case 6:
                        int i116 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.installment_plan_tv);
                    case 7:
                        int i117 = OcRepayOrderDetailActivity.f29803Y;
                        return (TextView) ocRepayOrderDetailActivity.findViewById(e.payment_plan_content_tv);
                    case 8:
                        int i118 = OcRepayOrderDetailActivity.f29803Y;
                        return (ConstraintLayout) ocRepayOrderDetailActivity.findViewById(e.payment_plan_cl);
                    case 9:
                        int i119 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_item_payment_method);
                    default:
                        int i20 = OcRepayOrderDetailActivity.f29803Y;
                        return (ModelTitleContentImg) ocRepayOrderDetailActivity.findViewById(e.lite_ard_bill_type);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repay_order_detail_layout;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String str = this.f29808L;
        if (str == null) {
            q().f31471i.setImageResource(r.cv_ok_card_icon);
            q().f31466c.setText(getString(k.core_oc_cl_repay));
            o().f31588d.setText(getString(Ya.g.cs_oc_cl_init_repayment));
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 3248) {
                if (iHashCode != 3340) {
                    if (iHashCode == 3341 && str.equals(TransType.TRANS_TYPE_CL_REPAY)) {
                        q().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
                        q().f31466c.setText(getString(k.core_cl_repay));
                        o().f31588d.setText(getString(Ya.g.cs_cl_init_repayment));
                    } else {
                        q().f31471i.setImageResource(r.cv_ok_card_icon);
                        q().f31466c.setText(getString(k.core_oc_cl_repay));
                        o().f31588d.setText(getString(Ya.g.cs_oc_cl_init_repayment));
                    }
                } else if (str.equals(TransType.TRANS_TYPE_CL_BORROW)) {
                    q().f31471i.setImageResource(r.cv_cl_cash_loan_icon);
                    q().f31466c.setText(getString(k.core_cl_borrow));
                    o().f31588d.setText(getString(Ya.g.cs_cl_init_borrow));
                } else {
                    q().f31471i.setImageResource(r.cv_ok_card_icon);
                    q().f31466c.setText(getString(k.core_oc_cl_repay));
                    o().f31588d.setText(getString(Ya.g.cs_oc_cl_init_repayment));
                }
            } else if (str.equals(TransType.TRANS_TYPE_OK_CARD)) {
                q().f31471i.setImageResource(r.cv_ok_card_icon);
                q().f31466c.setText(getString(k.core_oc_repay));
                o().f31588d.setText(getString(Ya.g.cs_oc_init_repayment));
            } else {
                q().f31471i.setImageResource(r.cv_ok_card_icon);
                q().f31466c.setText(getString(k.core_oc_cl_repay));
                o().f31588d.setText(getString(Ya.g.cs_oc_cl_init_repayment));
            }
        }
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).getOcOrderDetail(new OcOrderDetailReq(this.f29809M, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2055q(this, 24));
    }

    public final ModelAmountList n() {
        Object value = this.f29820v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelAmountList) value;
    }

    public final ModelTitleContentImg o() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelTitleContentImg) value;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        File[] objects = fileArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        q().t.setVisibility(0);
        ARouter.getInstance().build("/coreImpl/receipt_share_page").withSerializable("extra_data", objects[0]).navigation();
    }

    public final ModelTitleContentImg p() {
        Object value = this.f29819p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelTitleContentImg) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final ModelBillDetailTitle q() {
        Object value = this.f29821w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ModelBillDetailTitle) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f29808L = getQueryParameter("orderType");
        this.f29809M = getQueryParameter("orderNo");
        this.f29810Q = getQueryParameter("oc_order_detail_card_no");
        n().f31440w.f31454c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f29804A = (TextView) findViewById(s.atubd_contact_service_tv);
        this.f29805B = (RelativeLayout) findViewById(s.atubd_contact_service_area);
        this.f29806C = (TextView) findViewById(s.atubd_error_reason_tv);
        LinearLayout linearLayout = (LinearLayout) findViewById(Ya.e.layoutViewFlexiBills);
        this.f29807H = linearLayout;
        if (linearLayout != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: ub.g1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcRepayOrderDetailActivity f42857b;

                {
                    this.f42857b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OcOrderDetailData data;
                    OcOrderDetailData data2;
                    OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42857b;
                    switch (i7) {
                        case 0:
                            OcOrderDetailResp ocOrderDetailResp = ocRepayOrderDetailActivity.f29811X;
                            if (ocOrderDetailResp != null && (data = ocOrderDetailResp.getData()) != null) {
                                Integer settleStatus = data.getSettleStatus();
                                if (settleStatus == null || settleStatus.intValue() != 0) {
                                    Integer settleStatus2 = data.getSettleStatus();
                                    if (settleStatus2 != null && settleStatus2.intValue() == 1) {
                                        Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_bill_activity").withString("oc_card_no", ocRepayOrderDetailActivity.f29810Q);
                                        Long billId = data.getBillId();
                                        postcardWithString.withLong("oc_bill_id", billId != null ? billId.longValue() : 0L).withLong("oc_future_repayment_date", 0L).navigation(ocRepayOrderDetailActivity);
                                    }
                                } else {
                                    Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_bill_detail_activity");
                                    Long billId2 = data.getBillId();
                                    postcardBuild.withLong("oc_bill_id", billId2 != null ? billId2.longValue() : 0L).withString("oc_card_no", data.getCardNo()).withLong("oc_future_repayment_date", 0L).navigation(ocRepayOrderDetailActivity);
                                }
                                break;
                            }
                            break;
                        case 1:
                            int i10 = OcRepayOrderDetailActivity.f29803Y;
                            ocRepayOrderDetailActivity.q().t.setVisibility(4);
                            r0.L1(ocRepayOrderDetailActivity.f29809M, ocRepayOrderDetailActivity, ocRepayOrderDetailActivity.q(), ocRepayOrderDetailActivity.findViewById(e.scrollView));
                            break;
                        default:
                            int i11 = OcRepayOrderDetailActivity.f29803Y;
                            Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_offline_installment_detail_activity");
                            OcOrderDetailResp ocOrderDetailResp2 = ocRepayOrderDetailActivity.f29811X;
                            postcardBuild2.withString("oc_installment_order_id", (ocOrderDetailResp2 == null || (data2 = ocOrderDetailResp2.getData()) == null) ? null : data2.getInstallmentOrderNo()).navigation();
                            break;
                    }
                }
            }, linearLayout);
        }
        TextView textView = this.f29804A;
        if (textView != null) {
            p220oa.h.l(new h1(0), textView);
        }
        q().t.setVisibility(8);
        ImageView mDownloadIv = q().t;
        Intrinsics.checkNotNullExpressionValue(mDownloadIv, "mDownloadIv");
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.g1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42857b;

            {
                this.f42857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcOrderDetailData data;
                OcOrderDetailData data2;
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42857b;
                switch (i10) {
                    case 0:
                        OcOrderDetailResp ocOrderDetailResp = ocRepayOrderDetailActivity.f29811X;
                        if (ocOrderDetailResp != null && (data = ocOrderDetailResp.getData()) != null) {
                            Integer settleStatus = data.getSettleStatus();
                            if (settleStatus == null || settleStatus.intValue() != 0) {
                                Integer settleStatus2 = data.getSettleStatus();
                                if (settleStatus2 != null && settleStatus2.intValue() == 1) {
                                    Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_bill_activity").withString("oc_card_no", ocRepayOrderDetailActivity.f29810Q);
                                    Long billId = data.getBillId();
                                    postcardWithString.withLong("oc_bill_id", billId != null ? billId.longValue() : 0L).withLong("oc_future_repayment_date", 0L).navigation(ocRepayOrderDetailActivity);
                                }
                            } else {
                                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_bill_detail_activity");
                                Long billId2 = data.getBillId();
                                postcardBuild.withLong("oc_bill_id", billId2 != null ? billId2.longValue() : 0L).withString("oc_card_no", data.getCardNo()).withLong("oc_future_repayment_date", 0L).navigation(ocRepayOrderDetailActivity);
                            }
                            break;
                        }
                        break;
                    case 1:
                        int i11 = OcRepayOrderDetailActivity.f29803Y;
                        ocRepayOrderDetailActivity.q().t.setVisibility(4);
                        r0.L1(ocRepayOrderDetailActivity.f29809M, ocRepayOrderDetailActivity, ocRepayOrderDetailActivity.q(), ocRepayOrderDetailActivity.findViewById(e.scrollView));
                        break;
                    default:
                        int i12 = OcRepayOrderDetailActivity.f29803Y;
                        Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_offline_installment_detail_activity");
                        OcOrderDetailResp ocOrderDetailResp2 = ocRepayOrderDetailActivity.f29811X;
                        postcardBuild2.withString("oc_installment_order_id", (ocOrderDetailResp2 == null || (data2 = ocOrderDetailResp2.getData()) == null) ? null : data2.getInstallmentOrderNo()).navigation();
                        break;
                }
            }
        }, mDownloadIv);
        n().e(false);
        Object value = this.f29816i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        final int i11 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.g1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayOrderDetailActivity f42857b;

            {
                this.f42857b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcOrderDetailData data;
                OcOrderDetailData data2;
                OcRepayOrderDetailActivity ocRepayOrderDetailActivity = this.f42857b;
                switch (i11) {
                    case 0:
                        OcOrderDetailResp ocOrderDetailResp = ocRepayOrderDetailActivity.f29811X;
                        if (ocOrderDetailResp != null && (data = ocOrderDetailResp.getData()) != null) {
                            Integer settleStatus = data.getSettleStatus();
                            if (settleStatus == null || settleStatus.intValue() != 0) {
                                Integer settleStatus2 = data.getSettleStatus();
                                if (settleStatus2 != null && settleStatus2.intValue() == 1) {
                                    Postcard postcardWithString = ARouter.getInstance().build("/credit_score/oc_bill_activity").withString("oc_card_no", ocRepayOrderDetailActivity.f29810Q);
                                    Long billId = data.getBillId();
                                    postcardWithString.withLong("oc_bill_id", billId != null ? billId.longValue() : 0L).withLong("oc_future_repayment_date", 0L).navigation(ocRepayOrderDetailActivity);
                                }
                            } else {
                                Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_bill_detail_activity");
                                Long billId2 = data.getBillId();
                                postcardBuild.withLong("oc_bill_id", billId2 != null ? billId2.longValue() : 0L).withString("oc_card_no", data.getCardNo()).withLong("oc_future_repayment_date", 0L).navigation(ocRepayOrderDetailActivity);
                            }
                            break;
                        }
                        break;
                    case 1:
                        int i12 = OcRepayOrderDetailActivity.f29803Y;
                        ocRepayOrderDetailActivity.q().t.setVisibility(4);
                        r0.L1(ocRepayOrderDetailActivity.f29809M, ocRepayOrderDetailActivity, ocRepayOrderDetailActivity.q(), ocRepayOrderDetailActivity.findViewById(e.scrollView));
                        break;
                    default:
                        int i13 = OcRepayOrderDetailActivity.f29803Y;
                        Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/oc_offline_installment_detail_activity");
                        OcOrderDetailResp ocOrderDetailResp2 = ocRepayOrderDetailActivity.f29811X;
                        postcardBuild2.withString("oc_installment_order_id", (ocOrderDetailResp2 == null || (data2 = ocOrderDetailResp2.getData()) == null) ? null : data2.getInstallmentOrderNo()).navigation();
                        break;
                }
            }
        }, (TextView) value);
    }
}
