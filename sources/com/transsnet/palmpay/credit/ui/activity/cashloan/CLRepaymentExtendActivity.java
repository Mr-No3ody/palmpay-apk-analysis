package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import F6.d;
import Pa.C0525w;
import Ya.e;
import Ya.f;
import Za.b;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.other.CLRepayExtensionBean;
import com.transsnet.palmpay.credit.bean.req.CLRepayOrderReq;
import com.transsnet.palmpay.credit.bean.resp.CLExtendPlanData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentExtendActivity;
import com.transsnet.palmpay.credit.view.RepayStampDutyView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p220oa.h;
import p284sb.A;
import p294tb.C2039b0;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit展期还款试算页", path = "/credit_score/cl_repayment_extend_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepaymentExtendActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentExtendActivity extends b {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f29065L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29066A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f29067B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f29068C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CLExtendPlanData f29069H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29073g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29075j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29076o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29077p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29078v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29079w;

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

    public CLRepaymentExtendActivity() {
        final int i7 = 0;
        this.f29070d = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i11 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i12 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i13 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i14 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i15 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i16 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i10 = 5;
        this.f29071e = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i12 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i13 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i14 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i15 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i16 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i11 = 6;
        this.f29072f = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i11) {
                    case 0:
                        int i12 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i13 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i14 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i15 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i16 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i12 = 7;
        this.f29073g = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i12) {
                    case 0:
                        int i13 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i14 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i15 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i16 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i13 = 8;
        this.f29074i = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i13) {
                    case 0:
                        int i14 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i15 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i16 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i14 = 9;
        this.f29075j = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i14) {
                    case 0:
                        int i15 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i16 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i114 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i15 = 10;
        this.f29076o = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i15) {
                    case 0:
                        int i16 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i114 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i115 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i16 = 11;
        this.f29077p = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i16) {
                    case 0:
                        int i17 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i114 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i115 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i116 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i17 = 1;
        this.t = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i17) {
                    case 0:
                        int i18 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i114 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i115 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i116 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i117 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i18 = 2;
        this.f29078v = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i18) {
                    case 0:
                        int i19 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i114 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i115 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i116 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i117 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i118 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i19 = 3;
        this.f29079w = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i19) {
                    case 0:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i114 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i115 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i116 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i117 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i118 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i119 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i20 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
        final int i20 = 4;
        this.f29066A = C2131j.b(new Function0(this) { // from class: tb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42443b;

            {
                this.f42443b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42443b;
                switch (i20) {
                    case 0:
                        int i110 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_agreement_tv);
                    case 1:
                        int i111 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_amount_tv);
                    case 2:
                        int i112 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.currency_tv);
                    case 3:
                        int i113 = CLRepaymentExtendActivity.f29065L;
                        return (PpTitleBar) cLRepaymentExtendActivity.findViewById(e.oc_extend_mbt);
                    case 4:
                        int i114 = CLRepaymentExtendActivity.f29065L;
                        return (RepayStampDutyView) cLRepaymentExtendActivity.findViewById(e.repayStampDutyView);
                    case 5:
                        int i115 = CLRepaymentExtendActivity.f29065L;
                        return (Button) cLRepaymentExtendActivity.findViewById(e.oc_extend_bt);
                    case 6:
                        int i116 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_repayment_date_tv);
                    case 7:
                        int i117 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_service_fee_content_tv);
                    case 8:
                        int i118 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.over_interest_content_tv);
                    case 9:
                        int i119 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_fee_tv);
                    case 10:
                        int i21 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.extend_penalty_tv);
                    default:
                        int i22 = CLRepaymentExtendActivity.f29065L;
                        return (TextView) cLRepaymentExtendActivity.findViewById(e.principal_amount_tv);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_repayment_extend_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (event.getEventType()) {
            case MessageEvent.EVENT_CL_REPAYMENT_SUCCESS /* 358 */:
            case MessageEvent.EVENT_CL_REPAYMENT_PENDING /* 359 */:
            case MessageEvent.EVENT_CL_REPAYMENT_FAILED /* 360 */:
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).clGetExtendPlan(this.f29067B).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2039b0(this, 1));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        c.b().j(this);
        this.f29067B = getIntent().getStringExtra("cl_extend_loan_no");
        this.f29068C = getIntent().getStringExtra("loanProduct");
        Object value = this.f29078v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(BaseApplication.getCurrencySymbol());
        t tVar = this.f29070d;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).getPaint().setFlags(8);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).getPaint().setAntiAlias(true);
        Object value4 = this.f29079w.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((PpTitleBar) value4).setRightImageView2ClickListener(new A(12));
        Object value5 = this.f29071e.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42447b;

            {
                this.f42447b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42447b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepaymentExtendActivity.f29065L;
                        cLRepaymentExtendActivity.showLoadingDialog(true);
                        CLExtendPlanData cLExtendPlanData = cLRepaymentExtendActivity.f29069H;
                        CLRepayExtensionBean cLRepayExtensionBean = new CLRepayExtensionBean(cLExtendPlanData != null ? cLExtendPlanData.getLoanNo() : null, null);
                        IApiCreditService iApiCreditServiceH = G.h(p221ob.c.f40268a);
                        CLExtendPlanData cLExtendPlanData2 = cLRepaymentExtendActivity.f29069H;
                        iApiCreditServiceH.clCreateRepayOrder(new CLRepayOrderReq(cLExtendPlanData2 != null ? cLExtendPlanData2.getTotalAmount() : null, "", 0L, 26, ((Gson) C0525w.f().f7166b).toJson(cLRepayExtensionBean), null, 32, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2039b0(cLRepaymentExtendActivity, 0));
                        break;
                    default:
                        String str = TextUtils.isEmpty(cLRepaymentExtendActivity.f29068C) ? "OK_CARD" : cLRepaymentExtendActivity.f29068C;
                        String str2 = cLRepaymentExtendActivity.f29067B;
                        d.h("LoanAgreementHelper", 3, G.p("gotoLoanAgreement >>> loanProduct=", str, ", loanNo=", str2));
                        Bundle bundle = new Bundle();
                        bundle.putString("loanProduct", str);
                        bundle.putString("loanNo", str2);
                        bundle.putStringArray("tabTitles", new String[]{"Loan Agreement", "Direct Debit Mandate"});
                        bundle.putStringArray("agreementTypes", new String[]{"EXTENSION_CONTRACT", "DEDUCTION_AGREEMENT"});
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AgreementCommonPage");
                        break;
                }
            }
        }, (Button) value5);
        Object value6 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentExtendActivity f42447b;

            {
                this.f42447b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CLRepaymentExtendActivity cLRepaymentExtendActivity = this.f42447b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepaymentExtendActivity.f29065L;
                        cLRepaymentExtendActivity.showLoadingDialog(true);
                        CLExtendPlanData cLExtendPlanData = cLRepaymentExtendActivity.f29069H;
                        CLRepayExtensionBean cLRepayExtensionBean = new CLRepayExtensionBean(cLExtendPlanData != null ? cLExtendPlanData.getLoanNo() : null, null);
                        IApiCreditService iApiCreditServiceH = G.h(p221ob.c.f40268a);
                        CLExtendPlanData cLExtendPlanData2 = cLRepaymentExtendActivity.f29069H;
                        iApiCreditServiceH.clCreateRepayOrder(new CLRepayOrderReq(cLExtendPlanData2 != null ? cLExtendPlanData2.getTotalAmount() : null, "", 0L, 26, ((Gson) C0525w.f().f7166b).toJson(cLRepayExtensionBean), null, 32, null)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2039b0(cLRepaymentExtendActivity, 0));
                        break;
                    default:
                        String str = TextUtils.isEmpty(cLRepaymentExtendActivity.f29068C) ? "OK_CARD" : cLRepaymentExtendActivity.f29068C;
                        String str2 = cLRepaymentExtendActivity.f29067B;
                        d.h("LoanAgreementHelper", 3, G.p("gotoLoanAgreement >>> loanProduct=", str, ", loanNo=", str2));
                        Bundle bundle = new Bundle();
                        bundle.putString("loanProduct", str);
                        bundle.putString("loanNo", str2);
                        bundle.putStringArray("tabTitles", new String[]{"Loan Agreement", "Direct Debit Mandate"});
                        bundle.putStringArray("agreementTypes", new String[]{"EXTENSION_CONTRACT", "DEDUCTION_AGREEMENT"});
                        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AgreementCommonPage");
                        break;
                }
            }
        }, (TextView) value6);
    }
}
