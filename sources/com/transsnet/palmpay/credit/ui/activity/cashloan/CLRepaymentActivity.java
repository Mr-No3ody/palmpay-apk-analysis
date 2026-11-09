package com.transsnet.palmpay.credit.ui.activity.cashloan;

import C0.G;
import Ed.ViewOnFocusChangeListenerC0235o;
import Pa.C0525w;
import Pa.r0;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import Za.b;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.Gson;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.bean.other.CLRepayExtensionBean;
import com.transsnet.palmpay.credit.bean.req.CLCurrentBillReq;
import com.transsnet.palmpay.credit.bean.req.CLRepayOrderReq;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillData;
import com.transsnet.palmpay.credit.bean.resp.CLCurrentBillResp;
import com.transsnet.palmpay.credit.bean.resp.CLExtendPlanData;
import com.transsnet.palmpay.credit.bean.resp.OcRepayExitConfig;
import com.transsnet.palmpay.credit.bean.resp.OcRepayExitData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.activity.cashloan.CLRepaymentActivity;
import com.transsnet.palmpay.credit.ui.dialog.CLInterestDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLRepayExitDialog;
import com.transsnet.palmpay.credit.ui.dialog.OcRepayExitMarketingDialog;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import df.i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p054dd.n;
import p220oa.h;
import p221ob.c;
import p285sc.x;
import p294tb.V;
import p294tb.W;
import p294tb.X;
import p355xf.C2131j;
import p355xf.t;
import p368yb.Y;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit还款试算页", path = "/credit_score/cl_repayment_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/cashloan/CLRepaymentActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLRepaymentActivity extends b {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f29036w0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29037A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29038B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29039C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29040H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f29041L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f29042M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f29043Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f29044X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f29045Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29050g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29052j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public CLCurrentBillData f29053k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29055p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CLExtendPlanData f29056p0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Y f29060t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public OcRepayExitData f29061u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29062v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public String f29063v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29064w;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Long f29046Z = 0L;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f29057q0 = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f29058r0 = "cl_all_current_bill";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList f29059s0 = new ArrayList();

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

    public CLRepaymentActivity() {
        final int i7 = 0;
        this.f29047d = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i7) {
                    case 0:
                        int i10 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i11 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i12 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i13 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i14 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i15 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i16 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i10 = 17;
        this.f29048e = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i10) {
                    case 0:
                        int i11 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i12 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i13 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i14 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i15 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i16 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i11 = 1;
        this.f29049f = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i11) {
                    case 0:
                        int i12 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i13 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i14 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i15 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i16 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i12 = 2;
        this.f29050g = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i12) {
                    case 0:
                        int i13 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i14 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i15 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i16 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i13 = 3;
        this.f29051i = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i13) {
                    case 0:
                        int i14 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i15 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i16 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i14 = 4;
        this.f29052j = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i14) {
                    case 0:
                        int i15 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i16 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i15 = 5;
        this.f29054o = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i15) {
                    case 0:
                        int i16 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i16 = 6;
        this.f29055p = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i16) {
                    case 0:
                        int i17 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i17 = 7;
        this.t = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i17) {
                    case 0:
                        int i18 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i18 = 8;
        this.f29062v = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i18) {
                    case 0:
                        int i19 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i19 = 9;
        this.f29064w = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i19) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i20 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i20 = 10;
        this.f29037A = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i20) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i21 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i28 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i21 = 11;
        this.f29038B = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i21) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i22 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i28 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i29 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i22 = 12;
        this.f29039C = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i22) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i23 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i28 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i29 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i210 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i23 = 13;
        this.f29040H = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i23) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i24 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i28 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i29 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i210 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i211 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i24 = 14;
        this.f29041L = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i24) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i25 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i28 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i29 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i210 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i211 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i212 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i25 = 15;
        this.f29042M = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i25) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i26 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i28 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i29 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i210 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i211 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i212 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i213 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
        final int i26 = 16;
        this.f29043Q = C2131j.b(new Function0(this) { // from class: tb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42431b;

            {
                this.f42431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLRepaymentActivity cLRepaymentActivity = this.f42431b;
                switch (i26) {
                    case 0:
                        int i110 = CLRepaymentActivity.f29036w0;
                        return (DigitalKeyboardView) cLRepaymentActivity.findViewById(e.cl_repayment_dkv);
                    case 1:
                        int i111 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_extend_bt);
                    case 2:
                        int i112 = CLRepaymentActivity.f29036w0;
                        return (Button) cLRepaymentActivity.findViewById(e.cl_repayment_next_bt);
                    case 3:
                        int i113 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.penalty_amount_tv);
                    case 4:
                        int i114 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.service_fee_amount_tv);
                    case 5:
                        int i115 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_tv);
                    case 6:
                        int i116 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.interest_title_tv);
                    case 7:
                        int i117 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.principal_amount_tv);
                    case 8:
                        int i118 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_all_amount_tv);
                    case 9:
                        int i119 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_min_amount_tv);
                    case 10:
                        int i27 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.repay_input_tips_tv);
                    case 11:
                        int i28 = CLRepaymentActivity.f29036w0;
                        return cLRepaymentActivity.findViewById(e.repayment_input_divider_view);
                    case 12:
                        int i29 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.clear_input_tv);
                    case 13:
                        int i210 = CLRepaymentActivity.f29036w0;
                        return (AmountEditText) cLRepaymentActivity.findViewById(e.repay_input_et);
                    case 14:
                        int i211 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.bw_symbol_tv);
                    case 15:
                        int i212 = CLRepaymentActivity.f29036w0;
                        return (RecyclerView) cLRepaymentActivity.findViewById(e.coupon_rv);
                    case 16:
                        int i213 = CLRepaymentActivity.f29036w0;
                        return (PpTitleBar) cLRepaymentActivity.findViewById(e.cl_repayment_mtb);
                    default:
                        int i214 = CLRepaymentActivity.f29036w0;
                        return (TextView) cLRepaymentActivity.findViewById(e.extend_date_tv);
                }
            }
        });
    }

    public static final void u(TextView textView, boolean z3) {
        if (z3) {
            textView.setTextColor(textView.getContext().getColor(p.cv_color_ffffff));
            textView.setBackgroundResource(d.cs_cl_repay_amount_item_checked);
        } else {
            textView.setTextColor(textView.getContext().getColor(L6.b.ppColorTextPrimary));
            textView.setBackgroundResource(d.cs_cl_repay_amount_item_normal);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_cl_repayment_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        Long unpaidAmount;
        Long unpaidAmount2;
        AmountEditText amountEditTextQ = q();
        long jLongValue = 0;
        long j6 = amountEditTextQ != null ? amountEditTextQ.getLong() : 0L;
        CLCurrentBillData cLCurrentBillData = this.f29053k0;
        if (j6 > ((cLCurrentBillData == null || (unpaidAmount2 = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount2.longValue())) {
            CLCurrentBillData cLCurrentBillData2 = this.f29053k0;
            if (cLCurrentBillData2 != null && (unpaidAmount = cLCurrentBillData2.getUnpaidAmount()) != null) {
                jLongValue = unpaidAmount.longValue();
            }
            ToastUtils.showLong(u.i(jLongValue, "max repaid amount is "), new Object[0]);
            return;
        }
        w(false);
        CLCurrentBillData cLCurrentBillData3 = this.f29053k0;
        CLRepayExtensionBean cLRepayExtensionBean = new CLRepayExtensionBean(cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null, Boolean.valueOf(Intrinsics.c(this.f29058r0, "cl_repay_all_loan")));
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        AmountEditText amountEditTextQ2 = q();
        iApiCreditServiceH.clCreateRepayOrder(new CLRepayOrderReq(Long.valueOf(amountEditTextQ2 != null ? amountEditTextQ2.getLong() : 0L), "", 0L, 2, ((Gson) C0525w.f().f7166b).toJson(cLRepayExtensionBean), TextUtils.isEmpty(this.f29063v0) ? null : this.f29063v0)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new X(this, 0));
    }

    public final Button n() {
        Object value = this.f29049f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    public final DigitalKeyboardView o() {
        Object value = this.f29047d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DigitalKeyboardView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        OcRepayExitData ocRepayExitData = this.f29061u0;
        if (ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false) {
            v();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
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

    public final TextView p() {
        Object value = this.f29062v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        showLoadingDialog(true);
        p221ob.a aVar = c.f40268a;
        df.d<CLCurrentBillResp> dVarClGetCurrentBillDetail = G.h(aVar).clGetCurrentBillDetail(new CLCurrentBillReq(this.f29046Z, this.f29044X, this.f29045Y));
        i iVar = p298tf.f.f42629b;
        dVarClGetCurrentBillDetail.k(iVar).i(p071ef.b.a()).subscribe(new X(this, 1));
        aVar.getInstance().getClass();
        c.a().getExitData("CASH_LOAN").k(iVar).i(p071ef.b.a()).subscribe(new X(this, 2));
    }

    public final AmountEditText q() {
        return (AmountEditText) this.f29040H.getValue();
    }

    public final TextView r() {
        Object value = this.f29037A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView s() {
        Object value = this.f29064w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        initStatusBar(getColor(Ya.b.cs_color_status_bar_color));
        org.greenrobot.eventbus.c.b().j(this);
        getIntent().getStringExtra("cl_repayment_apply_id");
        this.f29044X = getIntent().getStringExtra("cl_repayment_loan_no");
        this.f29045Y = getIntent().getStringExtra("cl_repayment_card_no");
        this.f29063v0 = getIntent().getStringExtra("cl_repayment_loan_product");
        String stringExtra = getIntent().getStringExtra("cl_repayment_bill_id");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f29046Z = Long.valueOf(stringExtra != null ? Long.parseLong(stringExtra) : 0L);
        }
        String stringExtra2 = getIntent().getStringExtra("cl_repay_scope_flag");
        if (stringExtra2 == null) {
            stringExtra2 = "cl_all_current_bill";
        }
        this.f29058r0 = stringExtra2;
        this.f29060t0 = new Y(this, this.f29059s0);
        t tVar = this.f29042M;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this, 0, true));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setAdapter(this.f29060t0);
        Object value3 = this.f29041L.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(BaseApplication.getCurrencySymbol());
        AmountEditText amountEditTextQ = q();
        if (amountEditTextQ != null) {
            amountEditTextQ.setShowSoftInputOnFocus(false);
        }
        o().setActionText(getString(k.core_confirm));
        o().setActionButtonEnable(false);
        t tVar2 = this.f29050g;
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((Button) value4).setEnabled(false);
        s().setText(getString(g.cs_cl_min_amount, r0.B(this.f29057q0, true)));
        w(false);
        Object value5 = this.f29043Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ImageView backImageView = ((PpTitleBar) value5).getBackImageView();
        Intrinsics.checkNotNullExpressionValue(backImageView, "getBackImageView(...)");
        final int i7 = 0;
        h.l(new View.OnClickListener(this) { // from class: tb.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42433b;

            {
                this.f42433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidAmount;
                CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                switch (i7) {
                    case 0:
                        OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            cLRepaymentActivity.finish();
                        } else {
                            cLRepaymentActivity.v();
                        }
                        break;
                    case 1:
                        int i10 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ2 = cLRepaymentActivity.q();
                        if (amountEditTextQ2 != null) {
                            amountEditTextQ2.setText((CharSequence) null);
                        }
                        break;
                    case 2:
                        int i11 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ3 = cLRepaymentActivity.q();
                        if (amountEditTextQ3 != null) {
                            CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                            amountEditTextQ3.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                        break;
                    case 3:
                        int i12 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ4 = cLRepaymentActivity.q();
                        if (amountEditTextQ4 != null) {
                            amountEditTextQ4.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                        break;
                    case 4:
                        int i13 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.w(true);
                        break;
                    case 5:
                        int i14 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.m();
                        break;
                    case 6:
                        int i15 = CLRepaymentActivity.f29036w0;
                        CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                        new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                        break;
                    default:
                        int i16 = CLRepaymentActivity.f29036w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                        break;
                }
            }
        }, backImageView);
        o().setDigitalKeyboardClickListener(new p294tb.Y(this));
        Object value6 = this.f29039C.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        final int i10 = 1;
        h.l(new View.OnClickListener(this) { // from class: tb.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42433b;

            {
                this.f42433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidAmount;
                CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                switch (i10) {
                    case 0:
                        OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            cLRepaymentActivity.finish();
                        } else {
                            cLRepaymentActivity.v();
                        }
                        break;
                    case 1:
                        int i11 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ2 = cLRepaymentActivity.q();
                        if (amountEditTextQ2 != null) {
                            amountEditTextQ2.setText((CharSequence) null);
                        }
                        break;
                    case 2:
                        int i12 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ3 = cLRepaymentActivity.q();
                        if (amountEditTextQ3 != null) {
                            CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                            amountEditTextQ3.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                        break;
                    case 3:
                        int i13 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ4 = cLRepaymentActivity.q();
                        if (amountEditTextQ4 != null) {
                            amountEditTextQ4.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                        break;
                    case 4:
                        int i14 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.w(true);
                        break;
                    case 5:
                        int i15 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.m();
                        break;
                    case 6:
                        int i16 = CLRepaymentActivity.f29036w0;
                        CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                        new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                        break;
                    default:
                        int i17 = CLRepaymentActivity.f29036w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                        break;
                }
            }
        }, (TextView) value6);
        final int i11 = 2;
        h.l(new View.OnClickListener(this) { // from class: tb.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42433b;

            {
                this.f42433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidAmount;
                CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                switch (i11) {
                    case 0:
                        OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            cLRepaymentActivity.finish();
                        } else {
                            cLRepaymentActivity.v();
                        }
                        break;
                    case 1:
                        int i12 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ2 = cLRepaymentActivity.q();
                        if (amountEditTextQ2 != null) {
                            amountEditTextQ2.setText((CharSequence) null);
                        }
                        break;
                    case 2:
                        int i13 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ3 = cLRepaymentActivity.q();
                        if (amountEditTextQ3 != null) {
                            CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                            amountEditTextQ3.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                        break;
                    case 3:
                        int i14 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ4 = cLRepaymentActivity.q();
                        if (amountEditTextQ4 != null) {
                            amountEditTextQ4.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                        break;
                    case 4:
                        int i15 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.w(true);
                        break;
                    case 5:
                        int i16 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.m();
                        break;
                    case 6:
                        int i17 = CLRepaymentActivity.f29036w0;
                        CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                        new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                        break;
                    default:
                        int i18 = CLRepaymentActivity.f29036w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                        break;
                }
            }
        }, p());
        final int i12 = 3;
        h.l(new View.OnClickListener(this) { // from class: tb.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42433b;

            {
                this.f42433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidAmount;
                CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                switch (i12) {
                    case 0:
                        OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            cLRepaymentActivity.finish();
                        } else {
                            cLRepaymentActivity.v();
                        }
                        break;
                    case 1:
                        int i13 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ2 = cLRepaymentActivity.q();
                        if (amountEditTextQ2 != null) {
                            amountEditTextQ2.setText((CharSequence) null);
                        }
                        break;
                    case 2:
                        int i14 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ3 = cLRepaymentActivity.q();
                        if (amountEditTextQ3 != null) {
                            CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                            amountEditTextQ3.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                        break;
                    case 3:
                        int i15 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ4 = cLRepaymentActivity.q();
                        if (amountEditTextQ4 != null) {
                            amountEditTextQ4.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                        break;
                    case 4:
                        int i16 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.w(true);
                        break;
                    case 5:
                        int i17 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.m();
                        break;
                    case 6:
                        int i18 = CLRepaymentActivity.f29036w0;
                        CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                        new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                        break;
                    default:
                        int i19 = CLRepaymentActivity.f29036w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                        break;
                }
            }
        }, s());
        AmountEditText amountEditTextQ2 = q();
        if (amountEditTextQ2 != null) {
            amountEditTextQ2.setOnTextInputListener(new p287se.d(this, 10));
        }
        AmountEditText amountEditTextQ3 = q();
        if (amountEditTextQ3 != null) {
            amountEditTextQ3.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 22));
        }
        AmountEditText amountEditTextQ4 = q();
        if (amountEditTextQ4 != null) {
            final int i13 = 4;
            h.l(new View.OnClickListener(this) { // from class: tb.U

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLRepaymentActivity f42433b;

                {
                    this.f42433b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Long unpaidAmount;
                    CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                    switch (i13) {
                        case 0:
                            OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                            if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                                cLRepaymentActivity.finish();
                            } else {
                                cLRepaymentActivity.v();
                            }
                            break;
                        case 1:
                            int i14 = CLRepaymentActivity.f29036w0;
                            AmountEditText amountEditTextQ5 = cLRepaymentActivity.q();
                            if (amountEditTextQ5 != null) {
                                amountEditTextQ5.setText((CharSequence) null);
                            }
                            break;
                        case 2:
                            int i15 = CLRepaymentActivity.f29036w0;
                            AmountEditText amountEditTextQ6 = cLRepaymentActivity.q();
                            if (amountEditTextQ6 != null) {
                                CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                                amountEditTextQ6.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                            }
                            CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                            CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                            break;
                        case 3:
                            int i16 = CLRepaymentActivity.f29036w0;
                            AmountEditText amountEditTextQ7 = cLRepaymentActivity.q();
                            if (amountEditTextQ7 != null) {
                                amountEditTextQ7.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                            }
                            CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                            CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                            break;
                        case 4:
                            int i17 = CLRepaymentActivity.f29036w0;
                            cLRepaymentActivity.w(true);
                            break;
                        case 5:
                            int i18 = CLRepaymentActivity.f29036w0;
                            cLRepaymentActivity.m();
                            break;
                        case 6:
                            int i19 = CLRepaymentActivity.f29036w0;
                            CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                            new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                            break;
                        default:
                            int i110 = CLRepaymentActivity.f29036w0;
                            Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                            CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                            postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                            break;
                    }
                }
            }, amountEditTextQ4);
        }
        Object value7 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        final int i14 = 5;
        h.l(new View.OnClickListener(this) { // from class: tb.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42433b;

            {
                this.f42433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidAmount;
                CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                switch (i14) {
                    case 0:
                        OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            cLRepaymentActivity.finish();
                        } else {
                            cLRepaymentActivity.v();
                        }
                        break;
                    case 1:
                        int i15 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ5 = cLRepaymentActivity.q();
                        if (amountEditTextQ5 != null) {
                            amountEditTextQ5.setText((CharSequence) null);
                        }
                        break;
                    case 2:
                        int i16 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ6 = cLRepaymentActivity.q();
                        if (amountEditTextQ6 != null) {
                            CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                            amountEditTextQ6.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                        break;
                    case 3:
                        int i17 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ7 = cLRepaymentActivity.q();
                        if (amountEditTextQ7 != null) {
                            amountEditTextQ7.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                        break;
                    case 4:
                        int i18 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.w(true);
                        break;
                    case 5:
                        int i19 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.m();
                        break;
                    case 6:
                        int i110 = CLRepaymentActivity.f29036w0;
                        CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                        new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                        break;
                    default:
                        int i111 = CLRepaymentActivity.f29036w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                        break;
                }
            }
        }, (Button) value7);
        Object value8 = this.f29055p.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i15 = 6;
        h.l(new View.OnClickListener(this) { // from class: tb.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42433b;

            {
                this.f42433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidAmount;
                CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                switch (i15) {
                    case 0:
                        OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            cLRepaymentActivity.finish();
                        } else {
                            cLRepaymentActivity.v();
                        }
                        break;
                    case 1:
                        int i16 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ5 = cLRepaymentActivity.q();
                        if (amountEditTextQ5 != null) {
                            amountEditTextQ5.setText((CharSequence) null);
                        }
                        break;
                    case 2:
                        int i17 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ6 = cLRepaymentActivity.q();
                        if (amountEditTextQ6 != null) {
                            CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                            amountEditTextQ6.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                        break;
                    case 3:
                        int i18 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ7 = cLRepaymentActivity.q();
                        if (amountEditTextQ7 != null) {
                            amountEditTextQ7.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                        break;
                    case 4:
                        int i19 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.w(true);
                        break;
                    case 5:
                        int i110 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.m();
                        break;
                    case 6:
                        int i111 = CLRepaymentActivity.f29036w0;
                        CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                        new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                        break;
                    default:
                        int i112 = CLRepaymentActivity.f29036w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                        break;
                }
            }
        }, (TextView) value8);
        final int i16 = 7;
        h.l(new View.OnClickListener(this) { // from class: tb.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLRepaymentActivity f42433b;

            {
                this.f42433b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidAmount;
                CLRepaymentActivity cLRepaymentActivity = this.f42433b;
                switch (i16) {
                    case 0:
                        OcRepayExitData ocRepayExitData = cLRepaymentActivity.f29061u0;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            cLRepaymentActivity.finish();
                        } else {
                            cLRepaymentActivity.v();
                        }
                        break;
                    case 1:
                        int i17 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ5 = cLRepaymentActivity.q();
                        if (amountEditTextQ5 != null) {
                            amountEditTextQ5.setText((CharSequence) null);
                        }
                        break;
                    case 2:
                        int i18 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ6 = cLRepaymentActivity.q();
                        if (amountEditTextQ6 != null) {
                            CLCurrentBillData cLCurrentBillData = cLRepaymentActivity.f29053k0;
                            amountEditTextQ6.setText(new SpannableStringBuilder(r0.A((cLCurrentBillData == null || (unpaidAmount = cLCurrentBillData.getUnpaidAmount()) == null) ? 0L : unpaidAmount.longValue())));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), true);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), false);
                        break;
                    case 3:
                        int i19 = CLRepaymentActivity.f29036w0;
                        AmountEditText amountEditTextQ7 = cLRepaymentActivity.q();
                        if (amountEditTextQ7 != null) {
                            amountEditTextQ7.setText(new SpannableStringBuilder(r0.A(cLRepaymentActivity.f29057q0)));
                        }
                        CLRepaymentActivity.u(cLRepaymentActivity.p(), false);
                        CLRepaymentActivity.u(cLRepaymentActivity.s(), true);
                        break;
                    case 4:
                        int i110 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.w(true);
                        break;
                    case 5:
                        int i111 = CLRepaymentActivity.f29036w0;
                        cLRepaymentActivity.m();
                        break;
                    case 6:
                        int i112 = CLRepaymentActivity.f29036w0;
                        CLCurrentBillData cLCurrentBillData2 = cLRepaymentActivity.f29053k0;
                        new CLInterestDialog(cLRepaymentActivity, cLCurrentBillData2 != null ? cLCurrentBillData2.getInterestPrompt() : null).show();
                        break;
                    default:
                        int i113 = CLRepaymentActivity.f29036w0;
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_repayment_extend_activity");
                        CLCurrentBillData cLCurrentBillData3 = cLRepaymentActivity.f29053k0;
                        postcardBuild.withString("cl_extend_loan_no", cLCurrentBillData3 != null ? cLCurrentBillData3.getLoanNo() : null).withString("loanProduct", "OK_CARD").navigation();
                        break;
                }
            }
        }, n());
    }

    public final View t() {
        Object value = this.f29038B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    public final void v() {
        OcRepayExitConfig config;
        Long creditLimit;
        OcRepayExitData ocRepayExitData = this.f29061u0;
        Integer type = ocRepayExitData != null ? ocRepayExitData.getType() : null;
        if (type != null && type.intValue() == 1) {
            OcRepayExitMarketingDialog ocRepayExitMarketingDialog = new OcRepayExitMarketingDialog(this);
            ocRepayExitMarketingDialog.setRepayNowListener(new V(ocRepayExitMarketingDialog, 0));
            ocRepayExitMarketingDialog.setStopDiscountListener(new n(29, this, ocRepayExitMarketingDialog));
            ocRepayExitMarketingDialog.show();
            return;
        }
        if (type == null || type.intValue() != 2) {
            finish();
            return;
        }
        if (DateUtils.isToday(SPUtils.getInstance().getLong("cl_show_exit_dialog_date", 0L))) {
            finish();
            return;
        }
        OcRepayExitData ocRepayExitData2 = this.f29061u0;
        CLRepayExitDialog cLRepayExitDialog = new CLRepayExitDialog(this, Long.valueOf((ocRepayExitData2 == null || (config = ocRepayExitData2.getConfig()) == null || (creditLimit = config.getCreditLimit()) == null) ? 100000L : creditLimit.longValue()));
        cLRepayExitDialog.setRepayNowListener(new x(cLRepayExitDialog, 11));
        cLRepayExitDialog.setStopDiscountListener(new W(0, this, cLRepayExitDialog));
        cLRepayExitDialog.show();
        SPUtils.getInstance().put("cl_show_exit_dialog_date", System.currentTimeMillis());
    }

    public final void w(boolean z3) {
        if (z3) {
            o().setVisibility(0);
        } else {
            o().setVisibility(8);
        }
    }
}
