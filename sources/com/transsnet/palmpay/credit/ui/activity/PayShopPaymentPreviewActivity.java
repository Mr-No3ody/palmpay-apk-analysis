package com.transsnet.palmpay.credit.ui.activity;

import N8.q0;
import Pa.C0525w;
import Pa.i0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.DefaultPayMethodReq;
import com.transsnet.palmpay.core.bean.req.PreviewPayInfoV2Req;
import com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.core.viewmodel.ModelFreeFeeItem;
import com.transsnet.palmpay.core.viewmodel.ModelItemFee;
import com.transsnet.palmpay.core.viewmodel.ModelNewEarlyRefundItem;
import com.transsnet.palmpay.core.viewmodel.ModelUsePointsWithSwitch;
import com.transsnet.palmpay.core.viewmodel.PreviewTitleView;
import com.transsnet.palmpay.credit.bean.PayShopOrderCreateBean;
import com.transsnet.palmpay.credit.ui.activity.PayShopPaymentPreviewActivity;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated(message = "已废弃,使用 CashierPayShopPreviewActivity")
@Route(path = "/credit_score/pay_shop_payment_preview")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/PayShopPaymentPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CorePaymentPreviewActivity;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PayShopPaymentPreviewActivity extends CorePaymentPreviewActivity {

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public static final /* synthetic */ int f28727X0 = 0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final t f28728N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final t f28729O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final t f28730P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final t f28731Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final t f28732R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final t f28733S0;
    public final t T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final t f28734U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final t f28735V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final t f28736W0;

    public PayShopPaymentPreviewActivity() {
        final int i7 = 0;
        this.f28728N0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i7) {
                    case 0:
                        int i10 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i11 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i12 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i13 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i14 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i15 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i16 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i10 = 1;
        this.f28729O0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i10) {
                    case 0:
                        int i11 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i12 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i13 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i14 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i15 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i16 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i11 = 2;
        this.f28730P0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i11) {
                    case 0:
                        int i12 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i13 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i14 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i15 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i16 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i12 = 3;
        this.f28731Q0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i12) {
                    case 0:
                        int i13 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i14 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i15 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i16 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i112 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i13 = 4;
        this.f28732R0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i13) {
                    case 0:
                        int i14 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i15 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i16 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i112 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i113 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i14 = 5;
        this.f28733S0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i14) {
                    case 0:
                        int i15 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i16 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i112 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i113 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i114 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i15 = 6;
        this.T0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i15) {
                    case 0:
                        int i16 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i112 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i113 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i114 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i115 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i16 = 7;
        this.f28734U0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i16) {
                    case 0:
                        int i17 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i112 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i113 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i114 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i115 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i116 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i17 = 8;
        this.f28735V0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i17) {
                    case 0:
                        int i18 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i112 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i113 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i114 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i115 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i116 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i117 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
        final int i18 = 9;
        this.f28736W0 = C2131j.b(new Function0(this) { // from class: sb.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopPaymentPreviewActivity f42193b;

            {
                this.f42193b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String stringExtra;
                PayShopPaymentPreviewActivity payShopPaymentPreviewActivity = this.f42193b;
                switch (i18) {
                    case 0:
                        int i19 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelNewEarlyRefundItem) payShopPaymentPreviewActivity.findViewById(e.itemEarlyRefund);
                    case 1:
                        int i110 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.payeeFeeDescTv);
                    case 2:
                        int i111 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelUsePointsWithSwitch) payShopPaymentPreviewActivity.findViewById(e.itemPointToUse);
                    case 3:
                        int i112 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelFreeFeeItem) payShopPaymentPreviewActivity.findViewById(e.itemFreeFee);
                    case 4:
                        int i113 = PayShopPaymentPreviewActivity.f28727X0;
                        return (TextView) payShopPaymentPreviewActivity.findViewById(e.tvZeroFeeTips);
                    case 5:
                        int i114 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAmount);
                    case 6:
                        int i115 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountName);
                    case 7:
                        int i116 = PayShopPaymentPreviewActivity.f28727X0;
                        return (ModelItemFee) payShopPaymentPreviewActivity.findViewById(e.itemAccountNo);
                    case 8:
                        int i117 = PayShopPaymentPreviewActivity.f28727X0;
                        return (PreviewTitleView) payShopPaymentPreviewActivity.findViewById(e.previewTitle);
                    default:
                        int i118 = PayShopPaymentPreviewActivity.f28727X0;
                        C0525w c0525wF = C0525w.f();
                        Intent intent = payShopPaymentPreviewActivity.getIntent();
                        if (intent == null || (stringExtra = intent.getStringExtra("KEY_DATA")) == null) {
                            stringExtra = "";
                        }
                        new PayShopOrderCreateBean(null, null, null, 0, null, null, null, 0L, 0L, null, null, 2047, null);
                        c0525wF.getClass();
                        return (PayShopOrderCreateBean) C0525w.d(stringExtra, PayShopOrderCreateBean.class);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: B */
    public final boolean getF27555F0() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void L() {
        M(3);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity
    public final void Q(PreviewPayInfoV2Req params) {
        String str;
        Intrinsics.checkNotNullParameter(params, "params");
        params.calculationExtInfo = this.f27782H;
        PayShopOrderCreateBean payShopOrderCreateBeanF0 = f0();
        Integer numValueOf = payShopOrderCreateBeanF0 != null ? Integer.valueOf(payShopOrderCreateBeanF0.businessType) : null;
        if (numValueOf != null && numValueOf.intValue() == 13) {
            str = "4";
        } else {
            str = (numValueOf != null && numValueOf.intValue() == 5) ? "1" : "3";
        }
        params.payeeAccountType = str;
    }

    public final PayShopOrderCreateBean f0() {
        return (PayShopOrderCreateBean) this.f28736W0.getValue();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_pay_shop_preview;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.ui.mvp.contract.SelectPaymentContract$IView
    /* JADX INFO: renamed from: getTransType */
    public final String getF27551B0() {
        return TransType.TRANS_TYPE_PAY_SHOP;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        String strD0;
        super.initData();
        Object value = this.f28735V0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PreviewTitleView previewTitleView = (PreviewTitleView) value;
        int i7 = g.cs_send_to_name_format;
        PayShopOrderCreateBean payShopOrderCreateBeanF0 = f0();
        if (TextUtils.isEmpty(payShopOrderCreateBeanF0 != null ? payShopOrderCreateBeanF0.payeeMerchantName : null)) {
            PayShopOrderCreateBean payShopOrderCreateBeanF1 = f0();
            strD0 = r0.D0(r0.w0(payShopOrderCreateBeanF1 != null ? payShopOrderCreateBeanF1.payeeMobileNo : null));
        } else {
            PayShopOrderCreateBean payShopOrderCreateBeanF2 = f0();
            String str = payShopOrderCreateBeanF2 != null ? payShopOrderCreateBeanF2.payeeMerchantName : null;
            PayShopOrderCreateBean payShopOrderCreateBeanF3 = f0();
            strD0 = q0.l(str, " (", r0.D0(r0.w0(payShopOrderCreateBeanF3 != null ? payShopOrderCreateBeanF3.payeeMobileNo : null)), ")");
        }
        previewTitleView.d(getString(i7, strD0));
        Object value2 = this.f28734U0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ModelItemFee modelItemFee = (ModelItemFee) value2;
        PayShopOrderCreateBean payShopOrderCreateBeanF4 = f0();
        String strY = r0.Y(payShopOrderCreateBeanF4 != null ? payShopOrderCreateBeanF4.payeeMobileNo : null);
        PayShopOrderCreateBean payShopOrderCreateBeanF5 = f0();
        if (!TextUtils.isEmpty(payShopOrderCreateBeanF5 != null ? payShopOrderCreateBeanF5.accountNo : null)) {
            PayShopOrderCreateBean payShopOrderCreateBeanF6 = f0();
            if (payShopOrderCreateBeanF6 == null || 10 != payShopOrderCreateBeanF6.businessType) {
                PayShopOrderCreateBean payShopOrderCreateBeanF7 = f0();
                strY = i0.o(payShopOrderCreateBeanF7 != null ? payShopOrderCreateBeanF7.accountNo : null);
            } else {
                PayShopOrderCreateBean payShopOrderCreateBeanF8 = f0();
                strY = i0.E(payShopOrderCreateBeanF8 != null ? payShopOrderCreateBeanF8.accountNo : null);
            }
        }
        Intrinsics.e(strY);
        modelItemFee.setContent(strY);
        t tVar = this.T0;
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ModelItemFee modelItemFee2 = (ModelItemFee) value3;
        PayShopOrderCreateBean payShopOrderCreateBeanF9 = f0();
        h.s(modelItemFee2, !TextUtils.isEmpty(payShopOrderCreateBeanF9 != null ? payShopOrderCreateBeanF9.payeeMerchantName : null));
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ModelItemFee modelItemFee3 = (ModelItemFee) value4;
        PayShopOrderCreateBean payShopOrderCreateBeanF10 = f0();
        modelItemFee3.setContent(payShopOrderCreateBeanF10 != null ? payShopOrderCreateBeanF10.payeeMerchantName : null);
        Object value5 = this.f28733S0.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ModelItemFee modelItemFee4 = (ModelItemFee) value5;
        PayShopOrderCreateBean payShopOrderCreateBeanF11 = f0();
        modelItemFee4.setContent(r0.B(payShopOrderCreateBeanF11 != null ? payShopOrderCreateBeanF11.amount : 0L, false));
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final void o(DefaultPayMethodReq defaultPayMethodReq) {
        defaultPayMethodReq.calculationExtInfo = this.f27782H;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final int p() {
        Object value = this.f28728N0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return ((ModelNewEarlyRefundItem) value).f28391j ? 1 : 0;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final ModelApplyOkCard s() {
        return null;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    /* JADX INFO: renamed from: t */
    public final String getF27552C0() {
        return "68";
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final String u() {
        PayShopOrderCreateBean payShopOrderCreateBeanF0 = f0();
        if (payShopOrderCreateBeanF0 != null && payShopOrderCreateBeanF0.businessType == 13) {
            return "4";
        }
        PayShopOrderCreateBean payShopOrderCreateBeanF1 = f0();
        return (payShopOrderCreateBeanF1 == null || payShopOrderCreateBeanF1.businessType != 5) ? "1" : "3";
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    @Override // com.transsnet.palmpay.core.ui.activity.CorePaymentPreviewActivity, com.transsnet.palmpay.core.ui.mvp.contract.CorePaymentPreviewContract.View
    public final void updatePreviewInfo(String str, PreviewPayInfoResp.DataBean dataBean) {
        boolean z3;
        super.updatePreviewInfo(str, dataBean);
        t tVar = this.f28732R0;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.s((TextView) value, !TextUtils.isEmpty(dataBean != null ? dataBean.zeroFeeTips : null));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(dataBean != null ? dataBean.zeroFeeTips : null);
        t tVar2 = this.f28731Q0;
        Object value3 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.s((ModelFreeFeeItem) value3, this.f27790e != null && "COUNT".equals(dataBean != null ? dataBean.couponType : null));
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((ModelFreeFeeItem) value4).setCoupon(this.f27790e);
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((ModelFreeFeeItem) value5).setCouponDeductAmount(dataBean != null ? dataBean.couponAmount : 0L);
        t tVar3 = this.f28729O0;
        Object value6 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        TextView textView = (TextView) value6;
        if ((dataBean != null ? dataBean.payeeFee : 0L) > 0) {
            z3 = true;
        } else {
            if ((dataBean != null ? dataBean.payeeVat : 0L) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        h.s(textView, z3);
        Object value7 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((TextView) value7).setText(getString(g.cs_confirm_receive_amount_desc, r0.B(dataBean != null ? dataBean.payeeFee : 0L, false), r0.B(dataBean != null ? dataBean.payeeVat : 0L, false)));
        t tVar4 = this.f28728N0;
        Object value8 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        h.s((ModelNewEarlyRefundItem) value8, dataBean != null ? dataBean.earlyRefundEnable : false);
        Object value9 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
        ((ModelNewEarlyRefundItem) value9).setData(dataBean != null ? dataBean.earlyRefund : null);
        t tVar5 = this.f28730P0;
        Object value10 = tVar5.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        h.s((ModelUsePointsWithSwitch) value10, (dataBean != null ? dataBean.deductionPoint : 0) > 0);
        Object value11 = tVar5.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        ((ModelUsePointsWithSwitch) value11).f(dataBean != null ? dataBean.deductionPoint : 0L, r0.A(dataBean != null ? dataBean.deductionPointAmount : 0L));
        Object value12 = tVar5.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        ((ModelUsePointsWithSwitch) value12).d(dataBean != null ? dataBean.usePoint : false);
    }

    @Override // com.transsnet.palmpay.core.ui.activity.AbstractActivityC1479m
    public final String w() {
        String str;
        PayShopOrderCreateBean payShopOrderCreateBeanF0 = f0();
        return (payShopOrderCreateBeanF0 == null || (str = payShopOrderCreateBeanF0.remark) == null) ? "" : str;
    }
}
