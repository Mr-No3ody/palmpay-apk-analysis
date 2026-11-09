package com.transsnet.palmpay.credit.ui.activity.okcard;

import C9.C0158z;
import Ce.u0;
import Jb.C;
import Jb.D;
import Jb.E;
import Jb.F;
import Ya.e;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalBillActivity;
import com.transsnet.palmpay.credit.view.OcCommonBillCard;
import com.transsnet.palmpay.credit.viewmodel.OcTotalBillViewModel;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import com.transsnet.palmpay.custom_view.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p284sb.C2023v;
import p284sb.C2025x;
import p310ub.z1;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC聚合还款页", path = "/credit_score/oc_total_bill_activity")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcTotalBillActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/viewmodel/OcTotalBillViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcTotalBillActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcTotalBillActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcTotalBillActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,289:1\n260#2,10:290\n296#2:300\n260#2,10:301\n296#2:311\n260#2,10:312\n296#2:322\n260#2,10:323\n296#2:333\n*S KotlinDebug\n*F\n+ 1 OcTotalBillActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcTotalBillActivity\n*L\n164#1:290,10\n164#1:300\n191#1:301,10\n191#1:311\n218#1:312,10\n218#1:322\n244#1:323,10\n244#1:333\n*E\n"})
public final class OcTotalBillActivity extends CreditBaseMvvmActivity<OcTotalBillViewModel> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f29891r0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29892A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29893B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29894C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29895H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f29896L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f29897M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f29898Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f29899X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29900Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public OkCardMainPageRspData f29901Z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29903g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29904i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29905j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CLMainData f29906k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29908p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f29909p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public MarqueeView f29910q0;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29912w;

    public OcTotalBillActivity() {
        final int i7 = 10;
        this.f29902f = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i7) {
                    case 0:
                        int i10 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i11 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i12 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i13 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i14 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i15 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i16 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i10 = 1;
        this.f29903g = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i10) {
                    case 0:
                        int i11 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i12 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i13 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i14 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i15 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i16 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i11 = 2;
        this.f29904i = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i11) {
                    case 0:
                        int i12 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i13 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i14 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i15 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i16 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i12 = 3;
        this.f29905j = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i12) {
                    case 0:
                        int i13 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i14 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i15 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i16 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i13 = 4;
        this.f29907o = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i13) {
                    case 0:
                        int i14 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i15 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i16 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i14 = 5;
        this.f29908p = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i14) {
                    case 0:
                        int i15 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i16 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i15 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i15) {
                    case 0:
                        int i16 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i16 = 7;
        this.f29911v = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i16) {
                    case 0:
                        int i17 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i17 = 8;
        this.f29912w = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i17) {
                    case 0:
                        int i18 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i18 = 9;
        this.f29892A = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i18) {
                    case 0:
                        int i19 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i19 = 11;
        this.f29893B = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i19) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i20 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i20 = 12;
        this.f29894C = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i20) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i21 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i28 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i21 = 13;
        this.f29895H = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i21) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i22 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i28 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i29 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i22 = 14;
        this.f29896L = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i22) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i23 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i28 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i29 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i210 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i23 = 15;
        this.f29897M = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i23) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i24 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i28 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i29 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i210 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i211 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i24 = 16;
        this.f29898Q = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i24) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i25 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i28 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i29 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i210 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i211 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i212 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i25 = 17;
        this.f29899X = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i25) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i26 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i28 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i29 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i210 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i211 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i212 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i213 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
        final int i26 = 0;
        this.f29900Y = C2131j.b(new Function0(this) { // from class: ub.y1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42952b;

            {
                this.f42952b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcTotalBillActivity ocTotalBillActivity = this.f42952b;
                switch (i26) {
                    case 0:
                        int i110 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.marqueeView);
                    case 1:
                        int i111 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_left_sad);
                    case 2:
                        int i112 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.bottom_ad_ll);
                    case 3:
                        int i113 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_sad);
                    case 4:
                        int i114 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.export_more_ll);
                    case 5:
                        int i115 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_mid_sad);
                    case 6:
                        int i116 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.cash_bill_card);
                    case 7:
                        int i117 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.installment_bill_card);
                    case 8:
                        int i118 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.layoutFlexiCash);
                    case 9:
                        int i119 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutCashBillCard);
                    case 10:
                        int i27 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_bottom_right_sad);
                    case 11:
                        int i28 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.cl_total_outstanding_tv);
                    case 12:
                        int i29 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.cl_bill_title_ll);
                    case 13:
                        int i210 = OcTotalBillActivity.f29891r0;
                        return (OcCommonBillCard) ocTotalBillActivity.findViewById(e.oc_bill_card);
                    case 14:
                        int i211 = OcTotalBillActivity.f29891r0;
                        return (ConstraintLayout) ocTotalBillActivity.findViewById(e.layoutBillCard);
                    case 15:
                        int i212 = OcTotalBillActivity.f29891r0;
                        return (TextView) ocTotalBillActivity.findViewById(e.oc_total_outstanding_tv);
                    case 16:
                        int i213 = OcTotalBillActivity.f29891r0;
                        return (LinearLayout) ocTotalBillActivity.findViewById(e.oc_bill_title_ll);
                    default:
                        int i214 = OcTotalBillActivity.f29891r0;
                        return (SingleAdView) ocTotalBillActivity.findViewById(e.total_bill_top_sad);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_total_bill_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((OcTotalBillViewModel) l()).f30924e;
        if (lVar != null) {
            lVar.e(this, new C2023v(new z1(this, this, 0), 9));
        }
        l lVar2 = ((OcTotalBillViewModel) l()).f30925f;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new z1(this, this, 1), 9));
        }
        l lVar3 = ((OcTotalBillViewModel) l()).f30927i;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new z1(this, this, 2), 9));
        }
        l lVar4 = ((OcTotalBillViewModel) l()).f30926g;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new z1(this, this, 3), 9));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final TextView n() {
        Object value = this.f29893B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void o() {
        OcTotalBillViewModel ocTotalBillViewModel = (OcTotalBillViewModel) l();
        ocTotalBillViewModel.getClass();
        p140j8.f.s(ocTotalBillViewModel, new F(1, null), ocTotalBillViewModel.f30924e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        OcTotalBillViewModel ocTotalBillViewModel2 = (OcTotalBillViewModel) l();
        ocTotalBillViewModel2.getClass();
        p140j8.f.s(ocTotalBillViewModel2, new C(1, null), ocTotalBillViewModel2.f30925f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        OcTotalBillViewModel ocTotalBillViewModel3 = (OcTotalBillViewModel) l();
        ocTotalBillViewModel3.getClass();
        p140j8.f.s(ocTotalBillViewModel3, new E(1, null), ocTotalBillViewModel3.f30927i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        OcTotalBillViewModel ocTotalBillViewModel4 = (OcTotalBillViewModel) l();
        ocTotalBillViewModel4.getClass();
        p140j8.f.s(ocTotalBillViewModel4, new D(1, null), ocTotalBillViewModel4.f30926g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 327 || eventType == 328 || eventType == 358 || eventType == 359) {
            this.f29909p0 = true;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f29909p0) {
            this.f29909p0 = false;
            o();
        }
    }

    public final OcCommonBillCard p() {
        Object value = this.f29911v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OcCommonBillCard) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        o();
    }

    public final OcCommonBillCard q() {
        Object value = this.f29895H.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (OcCommonBillCard) value;
    }

    public final TextView r() {
        Object value = this.f29897M.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        org.greenrobot.eventbus.c.b().j(this);
        this.f29910q0 = (MarqueeView) findViewById(Ya.e.marquee);
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((OcCommonBillCard) value).setBackgroundResource(r.cv_shape_rect_corner_16_bg_white);
        q().setBackgroundResource(r.cv_shape_rect_corner_16_bg_white);
        p().setBackgroundResource(r.cv_shape_rect_corner_16_bg_white);
        Object value2 = this.f29912w.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((LinearLayout) value2).setBackgroundResource(r.cv_shape_rect_corner_16_bg_white);
        Object value3 = this.f29899X.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) value3);
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42947b;

            {
                this.f42947b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLMainCashLoanBill currentCashLoanBill;
                String loanNo = null;
                OcTotalBillActivity ocTotalBillActivity = this.f42947b;
                switch (i7) {
                    case 0:
                        int i10 = OcTotalBillActivity.f29891r0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                        OkCardMainPageRspData okCardMainPageRspData = ocTotalBillActivity.f29901Z;
                        postcardBuild.withString("oc_card_no", okCardMainPageRspData != null ? okCardMainPageRspData.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation();
                        break;
                    default:
                        int i11 = OcTotalBillActivity.f29891r0;
                        Bundle bundle = new Bundle();
                        CLMainData cLMainData = ocTotalBillActivity.f29906k0;
                        if (cLMainData != null && (currentCashLoanBill = cLMainData.getCurrentCashLoanBill()) != null) {
                            loanNo = currentCashLoanBill.getLoanNo();
                        }
                        bundle.putString("loanNo", loanNo);
                        d.x(bundle, "LoanOverview");
                        break;
                }
            }
        }, r());
        final int i10 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.x1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcTotalBillActivity f42947b;

            {
                this.f42947b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLMainCashLoanBill currentCashLoanBill;
                String loanNo = null;
                OcTotalBillActivity ocTotalBillActivity = this.f42947b;
                switch (i10) {
                    case 0:
                        int i11 = OcTotalBillActivity.f29891r0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
                        OkCardMainPageRspData okCardMainPageRspData = ocTotalBillActivity.f29901Z;
                        postcardBuild.withString("oc_card_no", okCardMainPageRspData != null ? okCardMainPageRspData.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation();
                        break;
                    default:
                        int i12 = OcTotalBillActivity.f29891r0;
                        Bundle bundle = new Bundle();
                        CLMainData cLMainData = ocTotalBillActivity.f29906k0;
                        if (cLMainData != null && (currentCashLoanBill = cLMainData.getCurrentCashLoanBill()) != null) {
                            loanNo = currentCashLoanBill.getLoanNo();
                        }
                        bundle.putString("loanNo", loanNo);
                        d.x(bundle, "LoanOverview");
                        break;
                }
            }
        }, n());
        Object value4 = this.f29908p.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((SingleAdView) value4).setAdListener(new C2025x(15));
        Object value5 = this.f29905j.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((SingleAdView) value5).setAdListener(new u0(this, 2));
        Object value6 = this.f29903g.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((SingleAdView) value6).setAdListener(new C0158z(this, 18));
        Object value7 = this.f29902f.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((SingleAdView) value7).setAdListener(new C2025x(16));
    }
}
