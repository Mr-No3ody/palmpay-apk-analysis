package com.transsnet.palmpay.credit.ui.activity.okcard;

import Ab.l;
import C0.G;
import C9.C0155w;
import Eb.n;
import Ed.ViewOnFocusChangeListenerC0235o;
import O6.c;
import O6.d;
import Pa.C0525w;
import Pa.r0;
import Wf.AbstractC0780y;
import Ya.e;
import Ya.g;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.api.Service;
import com.google.gson.Gson;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.credit.bean.ApplyProtoContent;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.other.OcRepayExtensionBean;
import com.transsnet.palmpay.credit.bean.req.CLFamilyAndFriendPayReq;
import com.transsnet.palmpay.credit.bean.req.OcOrderReq;
import com.transsnet.palmpay.credit.bean.resp.OcRepayExitConfig;
import com.transsnet.palmpay.credit.bean.resp.OcRepayExitData;
import com.transsnet.palmpay.credit.bean.resp.PalmPayCardBillDetailReq;
import com.transsnet.palmpay.credit.bean.rsp.OcCurBillData;
import com.transsnet.palmpay.credit.bean.rsp.PalmPayCardBillData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcRepayActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcRepayExitDialog;
import com.transsnet.palmpay.credit.ui.dialog.OcRepayExitMarketingDialog;
import com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog;
import com.transsnet.palmpay.credit.view.RepayStampDutyView;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p071ef.b;
import p284sb.A;
import p294tb.V;
import p294tb.W;
import p298tf.f;
import p310ub.T0;
import p310ub.X0;
import p355xf.C2131j;
import p355xf.t;
import p368yb.Y;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC还款试算页", path = "/credit_score/oc_repay_activity")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayActivity;", "LZa/b;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcRepayActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcRepayActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1403:1\n255#2:1404\n1#3:1405\n*S KotlinDebug\n*F\n+ 1 OcRepayActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcRepayActivity\n*L\n557#1:1404\n*E\n"})
public final class OcRepayActivity extends Za.b {

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final /* synthetic */ int f29705v1 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f29706A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f29707A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f29708B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final t f29709B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f29710C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final t f29711C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final t f29712D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final t f29713E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final t f29714F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final t f29715G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f29716H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final t f29717H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final t f29718I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final t f29719J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final t f29720K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f29721L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final t f29722L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f29723M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final t f29724M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final t f29725N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final t f29726O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final t f29727P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f29728Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final t f29729Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final t f29730R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final t f29731S0;
    public final t T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final t f29732U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final t f29733V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final t f29734W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f29735X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final t f29736X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f29737Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final t f29738Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f29739Z;
    public final t Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final t f29740a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final t f29741b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f29742c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29743d;
    public long d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29744e;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public String f29745e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29746f;
    public long f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29747g;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public OcCurBillData f29748g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public PalmPayCardBillData f29749h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29750i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public String f29751i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29752j;
    public Boolean j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f29753k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public String f29754k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public String f29755l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Integer f29756m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final ArrayList f29757n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29758o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Y f29759o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29760p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f29761p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public OcRepayExitData f29762p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f29763q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final long f29764q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f29765r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public WaiverInfo f29766r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f29767s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public WaiverInfo f29768s1;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f29769t0;
    public n t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f29770u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f29771u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f29772v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f29773v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f29774w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f29775w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f29776x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f29777y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f29778z0;

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

    public OcRepayActivity() {
        final int i7 = 0;
        this.f29743d = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i11 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i12 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i13 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i14 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i15 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i16 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i17 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i18 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i19 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i22 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i24 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i25 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i27 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i10 = 2;
        this.f29744e = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i12 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i13 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i14 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i15 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i16 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i17 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i18 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i19 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i110 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i22 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i24 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i25 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i27 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i11 = 14;
        this.f29746f = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i11) {
                    case 0:
                        int i12 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i13 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i14 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i15 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i16 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i17 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i18 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i19 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i111 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i22 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i24 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i25 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i27 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i12 = 26;
        this.f29747g = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i12) {
                    case 0:
                        int i13 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i14 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i15 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i16 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i17 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i18 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i19 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i110 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i112 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i22 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i24 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i25 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i27 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i13 = 8;
        this.f29750i = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i13) {
                    case 0:
                        int i14 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i15 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i16 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i17 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i18 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i19 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i20 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i22 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i23 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i24 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i25 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i26 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i27 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i31 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i34 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i35 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i37 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i40 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i41 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i42 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i43 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i14 = 20;
        this.f29752j = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i14) {
                    case 0:
                        int i15 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i16 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i17 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i18 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i19 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i110 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i20 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i22 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i23 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i24 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i25 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i26 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i27 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i31 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i34 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i35 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i37 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i40 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i41 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i42 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i43 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i15 = 29;
        C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i15) {
                    case 0:
                        int i16 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i17 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i18 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i19 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i110 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i111 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i20 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i22 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i23 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i24 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i25 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i26 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i27 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i31 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i34 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i35 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i37 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i40 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i41 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i42 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i43 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        this.f29758o = C2131j.b(new T0(this, 0));
        this.f29760p = C2131j.b(new T0(this, 1));
        this.t = C2131j.b(new T0(this, 2));
        final int i16 = 11;
        this.f29772v = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i16) {
                    case 0:
                        int i17 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i18 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i19 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i113 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i114 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i115 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i22 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i24 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i25 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i27 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i17 = 22;
        this.f29774w = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i17) {
                    case 0:
                        int i18 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i19 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i110 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i112 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i113 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i114 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i116 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i22 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i24 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i25 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i27 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i18 = 3;
        this.f29706A = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i18) {
                    case 0:
                        int i19 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i111 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i112 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i113 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i114 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i20 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i22 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i23 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i24 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i25 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i26 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i27 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i31 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i34 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i35 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i37 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i40 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i41 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i42 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i43 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i19 = 14;
        this.f29708B = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i19) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i20 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i21 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i22 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i23 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i24 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i25 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i26 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i27 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i31 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i34 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i35 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i37 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i40 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i41 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i42 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i43 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i20 = 25;
        this.f29710C = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i20) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i21 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i22 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i24 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i25 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i26 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i27 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i28 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i31 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i34 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i35 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i37 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i40 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i41 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i42 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i43 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        this.f29716H = C2131j.b(new T0(this, 3));
        this.f29721L = C2131j.b(new T0(this, 4));
        this.f29723M = C2131j.b(new T0(this, 6));
        this.f29728Q = C2131j.b(new T0(this, 10));
        final int i21 = 1;
        C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i21) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i22 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i24 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i25 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i26 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i27 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i211 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i22 = 3;
        this.f29735X = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i22) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i23 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i24 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i25 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i27 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i28 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i210 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i23 = 4;
        this.f29737Y = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i23) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i24 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i25 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i26 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i27 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i28 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i29 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i211 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i213 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i24 = 5;
        this.f29739Z = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i24) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i25 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i27 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i29 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i214 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i25 = 6;
        this.f29753k0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i25) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i26 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i27 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i28 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i210 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i211 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i213 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i214 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i26 = 7;
        this.f29761p0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i26) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i27 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i29 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i211 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i212 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i214 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i215 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i216 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i27 = 8;
        this.f29763q0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i27) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i28 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i210 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i212 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i214 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i28 = 9;
        this.f29765r0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i28) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i29 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i211 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i213 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i214 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i215 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i216 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i217 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i218 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i29 = 10;
        this.f29767s0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i29) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i30 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i32 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i34 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i39 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i30 = 12;
        this.f29769t0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i30) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i31 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i32 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i33 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i34 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i35 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i37 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i39 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i310 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i31 = 13;
        this.f29770u0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i31) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i32 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i34 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i36 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i38 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i310 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i311 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i32 = 15;
        this.f29773v0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i32) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i33 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i34 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i35 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i37 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i39 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i311 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i312 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i33 = 16;
        this.f29775w0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i33) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i34 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i36 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i38 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i310 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i313 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i34 = 17;
        this.f29776x0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i34) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i35 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i37 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i39 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i312 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i313 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i314 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i35 = 18;
        this.f29777y0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i35) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i36 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i38 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i310 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i312 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i314 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i315 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i36 = 19;
        C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i36) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i37 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i39 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i313 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i314 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i315 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i316 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i37 = 20;
        C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i37) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i38 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i310 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i312 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i314 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i315 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i316 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i317 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i38 = 21;
        this.f29778z0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i38) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i39 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i311 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i312 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i313 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i314 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i317 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i318 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i39 = 23;
        this.f29707A0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i39) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i314 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i316 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i317 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i318 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i319 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i40 = 24;
        this.f29709B0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i40) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i314 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i316 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i317 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i318 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i319 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i41 = 25;
        this.f29711C0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i41) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i314 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i316 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i317 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i318 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i319 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i42 = 27;
        this.f29712D0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i42) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i314 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i316 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i317 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i318 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i319 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i43 = 28;
        this.f29713E0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i43) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i314 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i316 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i317 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i318 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i319 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i44 = 29;
        this.f29714F0 = C2131j.b(new Function0(this) { // from class: ub.R0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42786b;

            {
                this.f42786b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42786b;
                switch (i44) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvFamilyAndFriendsPay);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.expend_detail_cl);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (Button) ocRepayActivity.findViewById(e.oc_repay_bt);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_right_amount_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.expend_tips_img);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.mini_repayment_ctv);
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_repayment_ll);
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.extend_ll);
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_service_fee_tv);
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_service_fee_ll);
                    case 10:
                        int i210 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_interest_tv);
                    case 11:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.spread_first_tv);
                    case 12:
                        int i212 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.oc_interest_title_ll);
                    case 13:
                        int i213 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_day_tv);
                    case 14:
                        int i214 = OcRepayActivity.f29705v1;
                        return (SingleAdView) ocRepayActivity.findViewById(e.oc_repay_bt_sav);
                    case 15:
                        int i215 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.multi_faq_img);
                    case 16:
                        int i216 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.overdue_title_tv);
                    case 17:
                        int i217 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.overdue_item_ll);
                    case 18:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_pay_amount_tv);
                    case 19:
                        int i219 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.direct_repayment_detail_ll);
                    case 20:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.full_immediately_tv);
                    case 21:
                        int i311 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.min_amount_warn_tv);
                    case 22:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.spread_method_ll);
                    case 23:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_currency_tv);
                    case 24:
                        int i314 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.oc_input_bg_view);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.repay_min_amount_tv);
                    case 26:
                        int i316 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.expend_proto_divider_view);
                    case 27:
                        int i317 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_all_tv);
                    case 28:
                        int i318 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.clear_input_img);
                    default:
                        int i319 = OcRepayActivity.f29705v1;
                        return (AmountEditText) ocRepayActivity.findViewById(e.oc_repayment_input_et);
                }
            }
        });
        final int i45 = 0;
        this.f29715G0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i45) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i46 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i47 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i48 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i49 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i46 = 1;
        this.f29717H0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i46) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i47 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i48 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i49 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i410 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i47 = 2;
        C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i47) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i48 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i49 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i411 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i48 = 4;
        this.f29718I0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i48) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i49 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i412 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i49 = 5;
        C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i49) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i50 = 6;
        this.f29719J0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i50) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i51 = 7;
        this.f29720K0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i51) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i52 = 9;
        this.f29722L0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i52) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i53 = 10;
        this.f29724M0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i53) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i54 = 11;
        this.f29725N0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i54) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i55 = 12;
        this.f29726O0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i55) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i56 = 13;
        this.f29727P0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i56) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i57 = 15;
        this.f29729Q0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i57) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i58 = 16;
        this.f29730R0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i58) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i59 = 17;
        this.f29731S0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i59) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i60 = 18;
        this.T0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i60) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i61 = 19;
        this.f29732U0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i61) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i62 = 21;
        this.f29733V0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i62) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i63 = 22;
        this.f29734W0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i63) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i64 = 23;
        this.f29736X0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i64) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i65 = 24;
        this.f29738Y0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i65) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i66 = 26;
        this.Z0 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i66) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i67 = 27;
        this.f29740a1 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i67) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        final int i68 = 28;
        this.f29741b1 = C2131j.b(new Function0(this) { // from class: ub.S0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42790b;

            {
                this.f42790b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcRepayActivity ocRepayActivity = this.f42790b;
                switch (i68) {
                    case 0:
                        int i110 = OcRepayActivity.f29705v1;
                        return (ConstraintLayout) ocRepayActivity.findViewById(e.direct_input_cl);
                    case 1:
                        int i111 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.direct_amount_tv);
                    case 2:
                        int i112 = OcRepayActivity.f29705v1;
                        return (CheckedTextView) ocRepayActivity.findViewById(e.direct_repayment_ctv);
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.expend_tips_tv);
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        return (RecyclerView) ocRepayActivity.findViewById(e.coupon_rv);
                    case 5:
                        int i115 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.repay_coupon_ll);
                    case 6:
                        int i210 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.server_img);
                    case 7:
                        int i211 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_day_tv);
                    case 8:
                        int i212 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_expend_proto_tv);
                    case 9:
                        int i213 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.repay_back_siv);
                    case 10:
                        int i214 = OcRepayActivity.f29705v1;
                        return (RepayStampDutyView) ocRepayActivity.findViewById(e.repayStampDutyView);
                    case 11:
                        int i215 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.layoutOcRepayTitleBar);
                    case 12:
                        int i216 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivOcWaiverHeaderBg);
                    case 13:
                        int i217 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.includeOcWaiverHeader);
                    case 14:
                        int i218 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.extend_fee_tv);
                    case 15:
                        int i219 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderTitle);
                    case 16:
                        int i310 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvWaiverHeaderSummary);
                    case 17:
                        int i311 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.layoutWaiverSummaryBubble);
                    case 18:
                        int i312 = OcRepayActivity.f29705v1;
                        return (ImageView) ocRepayActivity.findViewById(e.ivWaiverCardArt);
                    case 19:
                        int i313 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.oc_repay_title);
                    case 20:
                        int i314 = OcRepayActivity.f29705v1;
                        return (CheckBox) ocRepayActivity.findViewById(e.oc_expend_proto_cb);
                    case 21:
                        int i315 = OcRepayActivity.f29705v1;
                        return ocRepayActivity.findViewById(e.rowOcWaiverDiscount);
                    case 22:
                        int i316 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDiscountAmount);
                    case 23:
                        int i317 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.llOcWaiverCountdown);
                    case 24:
                        int i318 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverDays);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.init_payment_content_tv);
                    case 26:
                        int i410 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverHour);
                    case 27:
                        int i411 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverMinute);
                    case 28:
                        int i412 = OcRepayActivity.f29705v1;
                        return (TextView) ocRepayActivity.findViewById(e.tvOcWaiverSecond);
                    default:
                        int i413 = OcRepayActivity.f29705v1;
                        return (LinearLayout) ocRepayActivity.findViewById(e.expend_proto_ll);
                }
            }
        });
        this.j1 = Boolean.FALSE;
        this.f29754k1 = "2";
        this.f29755l1 = "oc_repay_outstanding_current";
        this.f29756m1 = 2;
        this.f29757n1 = new ArrayList();
        this.f29764q1 = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
    }

    public static void E(TextView textView, boolean z3) {
        if (z3) {
            textView.setTextColor(textView.getContext().getColor(p.cv_color_ffffff));
            textView.setBackgroundResource(Ya.d.cs_oc_all_txt_bg_checked);
        } else {
            textView.setTextColor(textView.getContext().getColor(L6.b.ppColorTextPrimary));
            textView.setBackgroundResource(Ya.d.cs_oc_all_txt_bg);
        }
    }

    public final ConstraintLayout A() {
        Object value = this.f29774w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    public final void B() {
        n nVar = this.t1;
        if (nVar != null) {
            nVar.b();
        }
        this.t1 = null;
        this.f29768s1 = null;
        Object value = this.f29726O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ImageView) value).setVisibility(8);
        Object value2 = this.f29727P0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((View) value2).setVisibility(8);
        Object value3 = this.f29725N0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((LinearLayout) value3).setBackgroundColor(getColor(L6.b.ppColorBackgroundLight));
        Object value4 = this.f29733V0.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((View) value4).setVisibility(8);
        Object value5 = this.f29736X0.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((LinearLayout) value5).setVisibility(8);
        Object value6 = this.f29743d.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setVisibility(0);
        Object value7 = this.f29746f.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((SingleAdView) value7).setVisibility(0);
        w().setText(Ya.g.cs_cl_repayment_amount);
        w().setVisibility(0);
        v().setText(p116hb.f.cs_repay_now);
    }

    public final void C(long j6) {
        Object value = this.f29738Y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        TextView textView = (TextView) value;
        Object value2 = this.Z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        TextView textView2 = (TextView) value2;
        Object value3 = this.f29740a1.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        TextView textView3 = (TextView) value3;
        Object value4 = this.f29741b1.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        Eb.a.e(this, textView, textView2, textView3, (TextView) value4, j6);
    }

    public final WaiverInfo D() {
        Long validUntil;
        Long validUntil2;
        OcCurBillData ocCurBillData = this.f29748g1;
        WaiverInfo waiverInfo = ocCurBillData != null ? ocCurBillData.getWaiverInfo() : null;
        if (waiverInfo != null) {
            if (Intrinsics.c(waiverInfo.getWaiverEnable(), Boolean.TRUE) && (validUntil2 = waiverInfo.getValidUntil()) != null && validUntil2.longValue() > System.currentTimeMillis()) {
                return waiverInfo;
            }
            return null;
        }
        WaiverInfo waiverInfo2 = this.f29766r1;
        if (waiverInfo2 != null && Intrinsics.c(waiverInfo2.getWaiverEnable(), Boolean.TRUE) && (validUntil = waiverInfo2.getValidUntil()) != null && validUntil.longValue() > System.currentTimeMillis()) {
            return waiverInfo2;
        }
        return null;
    }

    public final void F() {
        OcRepayExitConfig config;
        Long creditLimit;
        OcRepayExitData ocRepayExitData = this.f29762p1;
        Integer type = ocRepayExitData != null ? ocRepayExitData.getType() : null;
        if (type != null && type.intValue() == 4) {
            OcRepayExitMarketingDialog ocRepayExitMarketingDialog = new OcRepayExitMarketingDialog(this);
            ocRepayExitMarketingDialog.setRepayNowListener(new V(ocRepayExitMarketingDialog, 1));
            ocRepayExitMarketingDialog.setStopDiscountListener(new W(5, this, ocRepayExitMarketingDialog));
            ocRepayExitMarketingDialog.show();
            return;
        }
        if (type == null || type.intValue() != 3) {
            finish();
            return;
        }
        if (DateUtils.isToday(SPUtils.getInstance().getLong("oc_show_exit_dialog_date", 0L))) {
            finish();
            return;
        }
        OcRepayExitData ocRepayExitData2 = this.f29762p1;
        final OcRepayExitDialog ocRepayExitDialog = new OcRepayExitDialog(this, Long.valueOf((ocRepayExitData2 == null || (config = ocRepayExitData2.getConfig()) == null || (creditLimit = config.getCreditLimit()) == null) ? 30000L : creditLimit.longValue()));
        final int i7 = 0;
        ocRepayExitDialog.setRepayNowListener(new View.OnClickListener(this) { // from class: ub.U0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42796b;

            {
                this.f42796b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcRepayExitDialog ocRepayExitDialog2 = ocRepayExitDialog;
                OcRepayActivity ocRepayActivity = this.f42796b;
                switch (i7) {
                    case 0:
                        int i10 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        } else {
                            ocRepayActivity.n();
                        }
                        ocRepayExitDialog2.dismiss();
                        break;
                    default:
                        int i11 = OcRepayActivity.f29705v1;
                        ocRepayActivity.finish();
                        ocRepayExitDialog2.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        ocRepayExitDialog.setStopDiscountListener(new View.OnClickListener(this) { // from class: ub.U0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42796b;

            {
                this.f42796b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OcRepayExitDialog ocRepayExitDialog2 = ocRepayExitDialog;
                OcRepayActivity ocRepayActivity = this.f42796b;
                switch (i10) {
                    case 0:
                        int i11 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        } else {
                            ocRepayActivity.n();
                        }
                        ocRepayExitDialog2.dismiss();
                        break;
                    default:
                        int i12 = OcRepayActivity.f29705v1;
                        ocRepayActivity.finish();
                        ocRepayExitDialog2.dismiss();
                        break;
                }
            }
        });
        ocRepayExitDialog.show();
        SPUtils.getInstance().put("oc_show_exit_dialog_date", System.currentTimeMillis());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_repay_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        m();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            getWindow().setStatusBarContrastEnforced(false);
            getWindow().setNavigationBarContrastEnforced(false);
        }
        getWindow().clearFlags(67108864);
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (i7 >= 35) {
            initStatusBar(0, false);
            return;
        }
        getWindow().getDecorView().setSystemUiVisibility(1280);
        initStatusBar(0, false);
        BarUtils.setStatusBarLightMode((Activity) this, false);
    }

    public final void n() {
        String orderNo;
        F6.d.h(this.TAG, 3, "createOrder >>>");
        showLoadingDialog(true);
        OcCurBillData ocCurBillData = this.f29748g1;
        if (ocCurBillData == null || (orderNo = ocCurBillData.getOrderNo()) == null) {
            orderNo = "";
        }
        OcRepayExtensionBean ocRepayExtensionBean = new OcRepayExtensionBean(orderNo, Boolean.valueOf(Intrinsics.c(this.f29755l1, "oc_repay_all")));
        Long lValueOf = Long.valueOf(x().getLong());
        String str = this.f29742c1;
        String strValueOf = String.valueOf(this.d1);
        String str2 = this.f29754k1;
        OcOrderReq ocOrderReq = new OcOrderReq(lValueOf, str, strValueOf, TransType.TRANS_TYPE_OK_CARD, str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null, ((Gson) C0525w.f().f7166b).toJson(ocRepayExtensionBean), this.f29751i1);
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().createOcOrderV2(ocOrderReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new X0(this, 0));
    }

    public final void o() {
        v().setEnabled(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        OcRepayExitData ocRepayExitData = this.f29762p1;
        if (ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false) {
            F();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        n nVar = this.t1;
        if (nVar != null) {
            nVar.b();
        }
        this.t1 = null;
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        switch (event.getEventType()) {
            case MessageEvent.EVENT_OC_REPAY_SUCCESS /* 327 */:
            case MessageEvent.EVENT_OC_REPAY_PENDING /* 328 */:
            case MessageEvent.EVENT_OC_REPAY_FAILED /* 329 */:
                finish();
                break;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        m();
    }

    public final void p() {
        v().setEnabled(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (Intrinsics.c(this.f29751i1, "PALMPAY_CARD")) {
            F6.d.h(this.TAG, 3, "queryPalmPayCardBillDetail >>>");
            showLoadingDialog(true);
            PalmPayCardBillDetailReq palmPayCardBillDetailReq = new PalmPayCardBillDetailReq(null, Long.valueOf(this.d1), this.j1, 1, null);
            p221ob.c.f40268a.getInstance().getClass();
            p221ob.c.a().queryPalmPayCardBillDetail(palmPayCardBillDetailReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new X0(this, 3));
        } else {
            F6.d.h(this.TAG, 3, "queryFlexiBillDetail >>>");
            showLoadingDialog(true);
            G.h(p221ob.c.f40268a).getRepayBillDetail(this.f29742c1, Long.valueOf(this.d1), this.f29745e1, Boolean.valueOf(Intrinsics.c(this.f29755l1, "oc_repay_all")), this.f29756m1).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new X0(this, 2));
        }
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().getExitData("OK_CARD").k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new X0(this, 1));
    }

    public final ImageView q() {
        Object value = this.f29713E0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final LinearLayout r() {
        Object value = this.f29761p0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final TextView s() {
        Object value = this.f29760p.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f29742c1 = getIntent().getStringExtra(RepayRemindDialog.OC_REPAY_CARD_NO);
        this.d1 = getIntent().getLongExtra("oc_repay_bill_id", 0L);
        this.f29745e1 = getIntent().getStringExtra("oc_repay_order_no");
        String stringExtra = getIntent().getStringExtra("oc_repay_operate_type");
        if (stringExtra == null) {
            stringExtra = "2";
        }
        this.f29754k1 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("oc_all_repay_scope_type");
        if (stringExtra2 == null) {
            stringExtra2 = "oc_repay_outstanding_current";
        }
        this.f29755l1 = stringExtra2;
        this.f29756m1 = Integer.valueOf(getIntent().getIntExtra("oc_repay_query_ins_type", 2));
        this.f29751i1 = getIntent().getStringExtra("loanProduct");
        int length = 0;
        this.j1 = Boolean.valueOf(getIntent().getBooleanExtra("billedFlag", false));
        Serializable serializableExtra = getIntent().getSerializableExtra("oc_repay_waiver_info");
        this.f29766r1 = serializableExtra instanceof WaiverInfo ? (WaiverInfo) serializableExtra : null;
        F6.d.h(this.TAG, 3, G.p("mCardNo=", this.f29742c1, ", mLoanProduct=", this.f29751i1));
        this.f29759o1 = new Y(this, this.f29757n1);
        t tVar = this.f29718I0;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new LinearLayoutManager(this, 0, true));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setAdapter(this.f29759o1);
        Object value3 = this.f29707A0.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(BaseApplication.getCurrencySymbol());
        s().getPaint().setFlags(8);
        s().getPaint().setAntiAlias(true);
        ArrayList arrayList = new ArrayList();
        ApplyProtoContent applyProtoContent = new ApplyProtoContent(0, "I've read and consented\n");
        ApplyProtoContent applyProtoContent2 = new ApplyProtoContent(1, "Minimum Repayment Terms & conditions");
        ApplyProtoContent applyProtoContent3 = new ApplyProtoContent(1, ", ");
        ApplyProtoContent applyProtoContent4 = new ApplyProtoContent(2, "Privacy Policy");
        arrayList.add(applyProtoContent);
        arrayList.add(applyProtoContent2);
        arrayList.add(applyProtoContent3);
        arrayList.add(applyProtoContent4);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            ApplyProtoContent applyProtoContent5 = (ApplyProtoContent) next;
            spannableStringBuilder.append((CharSequence) applyProtoContent5.content);
            Integer num = applyProtoContent5.clickType;
            if (num == null || num.intValue() != 0) {
                spannableStringBuilder.setSpan(new C0155w(6, this, applyProtoContent5), length, spannableStringBuilder.length(), 33);
            }
            length = spannableStringBuilder.length() - 1;
        }
        t tVar2 = this.f29750i;
        Object value4 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((TextView) value4).setText(spannableStringBuilder);
        Object value5 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setHighlightColor(getColor(p.transparent));
        Object value6 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setMovementMethod(LinkMovementMethod.getInstance());
        boolean zIsDarkMode = isDarkMode();
        t tVar3 = this.f29722L0;
        if (zIsDarkMode) {
            Object value7 = tVar3.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((ImageView) value7).setImageTintList(androidx.core.content.d.c(Ya.b.cs_color_amount, this));
        }
        Object value8 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
        final int i7 = 0;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i10 = 4;
                int i11 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i7) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i12 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i12, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i13 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i13, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i11);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i14 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i15 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i10));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i16 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i17 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i18 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i19 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i10);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, (ImageView) value8);
        boolean zIsDarkMode2 = isDarkMode();
        t tVar4 = this.f29719J0;
        if (zIsDarkMode2) {
            Object value9 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
            ((ImageView) value9).setImageTintList(androidx.core.content.d.c(Ya.b.cs_color_amount, this));
        }
        Object value10 = tVar4.getValue();
        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
        p220oa.h.l(new A(28), (ImageView) value10);
        final int i10 = 5;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i11 = 4;
                int i12 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i10) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i13 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i13, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i14 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i14, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i12);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i15 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i16 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i11));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i17 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i18 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i19 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i110 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i11);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, q());
        final int i11 = 6;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i12 = 4;
                int i13 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i11) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i14 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i14, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i15 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i15, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i13);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i16 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i17 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i12));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i18 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i19 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i110 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i111 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i12);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, u());
        final int i12 = 7;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i13 = 4;
                int i14 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i12) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i15 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i15, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i16 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i16, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i14);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i17 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i18 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i13));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i19 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i110 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i111 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i112 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i13);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, z());
        x().setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 26));
        final int i13 = 8;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i14 = 4;
                int i15 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i13) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i16 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i16, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i17 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i17, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i15);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i18 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i19 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i14));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i110 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i111 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i112 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i113 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i14);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, v());
        Object value11 = this.f29753k0.getValue();
        Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
        final int i14 = 9;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i15 = 4;
                int i16 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i14) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i17 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i17, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i18 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i18, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i16);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i19 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i110 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i15));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i111 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i112 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i113 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i114 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i15);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, (LinearLayout) value11);
        Object value12 = this.f29737Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
        final int i15 = 10;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i16 = 4;
                int i17 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i15) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i18 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i18, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i19 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i19, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i17);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i110 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i111 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i16));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i112 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i113 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i114 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i115 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i16);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, (ImageView) value12);
        Object value13 = this.f29723M.getValue();
        Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
        final int i16 = 11;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i17 = 4;
                int i18 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i16) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i19 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i19, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i110 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i110, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i18);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i111 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i112 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i17));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i113 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i114 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i115 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i116 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i17);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, (TextView) value13);
        x().setOnTextInputListener(new p287se.d(this, 16));
        p220oa.h.l(new A(27), y());
        Object value14 = this.f29758o.getValue();
        Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
        final int i17 = 1;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i18 = 4;
                int i19 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i17) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i110 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i110, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i111 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i111, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i19);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i112 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i113 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i18));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i114 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i115 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i116 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i117 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i18);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, (TextView) value14);
        final int i18 = 2;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i19 = 4;
                int i110 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i18) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i111 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i111, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i112 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i112, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i110);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i113 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i114 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i19));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i115 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i116 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i117 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i118 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i19);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, s());
        final int i19 = 3;
        p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepayActivity f42800b;

            {
                this.f42800b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Long unpaidPrincipal;
                Long spreadThreshold;
                Long unpaidPrincipal2;
                Long spreadThreshold2;
                Double extensionDownPaymentRatio;
                long jLongValue = 0;
                String string = "";
                int i110 = 4;
                int i111 = 3;
                OcRepayActivity ocRepayActivity = this.f42800b;
                switch (i19) {
                    case 0:
                        OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                        if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                            ocRepayActivity.finish();
                        } else {
                            ocRepayActivity.F();
                        }
                        break;
                    case 1:
                        if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                            F f10 = new F();
                            c cVar = new c(ocRepayActivity);
                            cVar.f6605k = false;
                            cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                            cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                            String string2 = ocRepayActivity.getString(k.core_ok1);
                            l lVar = new l(f10, 6);
                            cVar.f6600f = string2;
                            cVar.f6602h = lVar;
                            d dVarA = cVar.a();
                            f10.f38951a = dVarA;
                            dVarA.show();
                            break;
                        }
                        break;
                    case 2:
                        OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                        Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                        if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                            int i112 = g.cs_oc_bill_ins_unavailable_max_reason;
                            OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                            String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                            OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                            if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal2.longValue();
                            }
                            string = ocRepayActivity.getString(i112, strB, r0.B(jLongValue, true));
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                            string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                        } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                            int i113 = g.cs_oc_bill_ins_unavailable_mix_reason;
                            OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                            String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                            OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                            if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                jLongValue = unpaidPrincipal.longValue();
                            }
                            string = ocRepayActivity.getString(i113, strB2, r0.B(jLongValue, true));
                        }
                        Intrinsics.e(string);
                        if (!TextUtils.isEmpty(string)) {
                            F f11 = new F();
                            c cVar2 = new c(ocRepayActivity);
                            cVar2.f6605k = false;
                            cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                            cVar2.f6606l = 8388611;
                            cVar2.f6598d = string;
                            String string3 = ocRepayActivity.getString(k.core_got_it);
                            l lVar2 = new l(f11, i111);
                            cVar2.f6600f = string3;
                            cVar2.f6602h = lVar2;
                            d dVarA2 = cVar2.a();
                            f11.f38951a = dVarA2;
                            dVarA2.show();
                        }
                        break;
                    case 3:
                        int i114 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                        break;
                    case 4:
                        int i115 = OcRepayActivity.f29705v1;
                        ocRepayActivity.showLoadingDialog(true);
                        CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                        p221ob.c.f40268a.getInstance().getClass();
                        p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i110));
                        break;
                    case 5:
                        if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                            ocRepayActivity.x().setText("");
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        }
                        break;
                    case 6:
                        int i116 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                        OcRepayActivity.E(ocRepayActivity.u(), true);
                        OcRepayActivity.E(ocRepayActivity.z(), false);
                        break;
                    case 7:
                        int i117 = OcRepayActivity.f29705v1;
                        ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                        OcRepayActivity.E(ocRepayActivity.u(), false);
                        OcRepayActivity.E(ocRepayActivity.z(), true);
                        break;
                    case 8:
                        int i118 = OcRepayActivity.f29705v1;
                        WaiverInfo waiverInfoD = ocRepayActivity.D();
                        if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                            ocRepayActivity.n();
                        } else {
                            ocRepayActivity.o();
                            ocRepayActivity.showLoadingDialog(true);
                            AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                        }
                        break;
                    case 9:
                        int i119 = OcRepayActivity.f29705v1;
                        ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                        break;
                    case 10:
                        int i20 = OcRepayActivity.f29705v1;
                        F f12 = new F();
                        c cVar3 = new c(ocRepayActivity);
                        cVar3.f6605k = false;
                        cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                        cVar3.f6606l = 8388611;
                        cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                        String string4 = ocRepayActivity.getString(k.core_got_it);
                        l lVar3 = new l(f12, i110);
                        cVar3.f6600f = string4;
                        cVar3.f6602h = lVar3;
                        d dVarA3 = cVar3.a();
                        f12.f38951a = dVarA3;
                        dVarA3.show();
                        break;
                    default:
                        int i21 = OcRepayActivity.f29705v1;
                        DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                        F f13 = new F();
                        c cVar4 = new c(ocRepayActivity);
                        cVar4.f6605k = false;
                        cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                        cVar4.f6606l = 8388611;
                        int i22 = g.cs_initial_payment_total_amount;
                        OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                        cVar4.f6598d = ocRepayActivity.getString(i22, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                        String string5 = ocRepayActivity.getString(k.core_got_it);
                        l lVar4 = new l(f13, 5);
                        cVar4.f6600f = string5;
                        cVar4.f6602h = lVar4;
                        d dVarA4 = cVar4.a();
                        f13.f38951a = dVarA4;
                        dVarA4.show();
                        break;
                }
            }
        }, A());
        Object value15 = this.f29752j.getValue();
        Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
        ((CheckBox) value15).setOnCheckedChangeListener(new A8.g(this, 17));
        Object value16 = this.f29746f.getValue();
        Intrinsics.checkNotNullExpressionValue(value16, "getValue(...)");
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) value16);
        Object value17 = this.f29743d.getValue();
        Intrinsics.checkNotNullExpressionValue(value17, "getValue(...)");
        TextView textView = (TextView) value17;
        if (textView != null) {
            final int i20 = 4;
            p220oa.h.l(new View.OnClickListener(this) { // from class: ub.V0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcRepayActivity f42800b;

                {
                    this.f42800b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Long unpaidPrincipal;
                    Long spreadThreshold;
                    Long unpaidPrincipal2;
                    Long spreadThreshold2;
                    Double extensionDownPaymentRatio;
                    long jLongValue = 0;
                    String string = "";
                    int i110 = 4;
                    int i111 = 3;
                    OcRepayActivity ocRepayActivity = this.f42800b;
                    switch (i20) {
                        case 0:
                            OcRepayExitData ocRepayExitData = ocRepayActivity.f29762p1;
                            if (!(ocRepayExitData != null ? Intrinsics.c(ocRepayExitData.getNeedPop(), Boolean.TRUE) : false)) {
                                ocRepayActivity.finish();
                            } else {
                                ocRepayActivity.F();
                            }
                            break;
                        case 1:
                            if (ocRepayActivity.d1 == 0 && TextUtils.isEmpty(ocRepayActivity.f29745e1)) {
                                F f10 = new F();
                                c cVar = new c(ocRepayActivity);
                                cVar.f6605k = false;
                                cVar.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_settle_priority_title));
                                cVar.f6598d = ocRepayActivity.getString(g.cs_oc_settle_priority_content);
                                String string2 = ocRepayActivity.getString(k.core_ok1);
                                l lVar = new l(f10, 6);
                                cVar.f6600f = string2;
                                cVar.f6602h = lVar;
                                d dVarA = cVar.a();
                                f10.f38951a = dVarA;
                                dVarA.show();
                                break;
                            }
                            break;
                        case 2:
                            OcCurBillData ocCurBillData = ocRepayActivity.f29748g1;
                            Integer spreadPromptType = ocCurBillData != null ? ocCurBillData.getSpreadPromptType() : null;
                            if (spreadPromptType != null && spreadPromptType.intValue() == 1) {
                                int i112 = g.cs_oc_bill_ins_unavailable_max_reason;
                                OcCurBillData ocCurBillData2 = ocRepayActivity.f29748g1;
                                String strB = r0.B((ocCurBillData2 == null || (spreadThreshold2 = ocCurBillData2.getSpreadThreshold()) == null) ? 0L : spreadThreshold2.longValue(), true);
                                OcCurBillData ocCurBillData3 = ocRepayActivity.f29748g1;
                                if (ocCurBillData3 != null && (unpaidPrincipal2 = ocCurBillData3.getUnpaidPrincipal()) != null) {
                                    jLongValue = unpaidPrincipal2.longValue();
                                }
                                string = ocRepayActivity.getString(i112, strB, r0.B(jLongValue, true));
                            } else if (spreadPromptType != null && spreadPromptType.intValue() == 2) {
                                string = ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_unpaid_reason);
                            } else if (spreadPromptType != null && spreadPromptType.intValue() == 3) {
                                int i113 = g.cs_oc_bill_ins_unavailable_mix_reason;
                                OcCurBillData ocCurBillData4 = ocRepayActivity.f29748g1;
                                String strB2 = r0.B((ocCurBillData4 == null || (spreadThreshold = ocCurBillData4.getSpreadThreshold()) == null) ? 0L : spreadThreshold.longValue(), true);
                                OcCurBillData ocCurBillData5 = ocRepayActivity.f29748g1;
                                if (ocCurBillData5 != null && (unpaidPrincipal = ocCurBillData5.getUnpaidPrincipal()) != null) {
                                    jLongValue = unpaidPrincipal.longValue();
                                }
                                string = ocRepayActivity.getString(i113, strB2, r0.B(jLongValue, true));
                            }
                            Intrinsics.e(string);
                            if (!TextUtils.isEmpty(string)) {
                                F f11 = new F();
                                c cVar2 = new c(ocRepayActivity);
                                cVar2.f6605k = false;
                                cVar2.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_bill_ins_unavailable_dialog_title));
                                cVar2.f6606l = 8388611;
                                cVar2.f6598d = string;
                                String string3 = ocRepayActivity.getString(k.core_got_it);
                                l lVar2 = new l(f11, i111);
                                cVar2.f6600f = string3;
                                cVar2.f6602h = lVar2;
                                d dVarA2 = cVar2.a();
                                f11.f38951a = dVarA2;
                                dVarA2.show();
                            }
                            break;
                        case 3:
                            int i114 = OcRepayActivity.f29705v1;
                            ARouter.getInstance().build("/credit_score/oc_install_repay_activity").withString(RepayRemindDialog.OC_REPAY_CARD_NO, ocRepayActivity.f29742c1).withLong("oc_repay_bill_id", ocRepayActivity.d1).navigation(ocRepayActivity);
                            break;
                        case 4:
                            int i115 = OcRepayActivity.f29705v1;
                            ocRepayActivity.showLoadingDialog(true);
                            CLFamilyAndFriendPayReq cLFamilyAndFriendPayReq = new CLFamilyAndFriendPayReq("single", ocRepayActivity.f29742c1);
                            p221ob.c.f40268a.getInstance().getClass();
                            p221ob.c.a().queryOutstanding(cLFamilyAndFriendPayReq).k(f.f42629b).i(b.a()).subscribe(new X0(ocRepayActivity, i110));
                            break;
                        case 5:
                            if (TextUtils.isEmpty(ocRepayActivity.f29745e1) && ocRepayActivity.f1 > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM && !Intrinsics.c(ocRepayActivity.f29755l1, "oc_repay_all")) {
                                ocRepayActivity.x().setText("");
                                OcRepayActivity.E(ocRepayActivity.u(), false);
                                OcRepayActivity.E(ocRepayActivity.z(), false);
                                break;
                            }
                            break;
                        case 6:
                            int i116 = OcRepayActivity.f29705v1;
                            ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(ocRepayActivity.f1)));
                            OcRepayActivity.E(ocRepayActivity.u(), true);
                            OcRepayActivity.E(ocRepayActivity.z(), false);
                            break;
                        case 7:
                            int i117 = OcRepayActivity.f29705v1;
                            ocRepayActivity.x().setText(new SpannableStringBuilder(r0.A(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM)));
                            OcRepayActivity.E(ocRepayActivity.u(), false);
                            OcRepayActivity.E(ocRepayActivity.z(), true);
                            break;
                        case 8:
                            int i118 = OcRepayActivity.f29705v1;
                            WaiverInfo waiverInfoD = ocRepayActivity.D();
                            if (!Intrinsics.c(waiverInfoD != null ? waiverInfoD.getWaiverType() : null, WaiverInfo.TYPE_FULL)) {
                                ocRepayActivity.n();
                            } else {
                                ocRepayActivity.o();
                                ocRepayActivity.showLoadingDialog(true);
                                AbstractC0780y.m(androidx.lifecycle.V.f(ocRepayActivity), null, null, new Z0(ocRepayActivity, null), 3);
                            }
                            break;
                        case 9:
                            int i119 = OcRepayActivity.f29705v1;
                            ARouter.getInstance().build("/credit_score/oc_repay_extend_activity").withLong("oc_extend_bill_id", ocRepayActivity.d1).withString("oc_repay_operate_type", TransType.TRANS_TYPE_REPAY_CASH_LOAN).navigation();
                            break;
                        case 10:
                            int i21 = OcRepayActivity.f29705v1;
                            F f12 = new F();
                            c cVar3 = new c(ocRepayActivity);
                            cVar3.f6605k = false;
                            cVar3.f6596b = d.f(ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_title));
                            cVar3.f6606l = 8388611;
                            cVar3.f6598d = ocRepayActivity.getString(g.cs_oc_min_repayment_dialog_content);
                            String string4 = ocRepayActivity.getString(k.core_got_it);
                            l lVar3 = new l(f12, i110);
                            cVar3.f6600f = string4;
                            cVar3.f6602h = lVar3;
                            d dVarA3 = cVar3.a();
                            f12.f38951a = dVarA3;
                            dVarA3.show();
                            break;
                        default:
                            int i22 = OcRepayActivity.f29705v1;
                            DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                            F f13 = new F();
                            c cVar4 = new c(ocRepayActivity);
                            cVar4.f6605k = false;
                            cVar4.f6596b = d.f(ocRepayActivity.getString(g.cs_initial_dialog_title));
                            cVar4.f6606l = 8388611;
                            int i23 = g.cs_initial_payment_total_amount;
                            OcCurBillData ocCurBillData6 = ocRepayActivity.f29748g1;
                            cVar4.f6598d = ocRepayActivity.getString(i23, decimalFormat.format((ocCurBillData6 == null || (extensionDownPaymentRatio = ocCurBillData6.getExtensionDownPaymentRatio()) == null) ? 0.0d : extensionDownPaymentRatio.doubleValue()));
                            String string5 = ocRepayActivity.getString(k.core_got_it);
                            l lVar4 = new l(f13, 5);
                            cVar4.f6600f = string5;
                            cVar4.f6602h = lVar4;
                            d dVarA4 = cVar4.a();
                            f13.f38951a = dVarA4;
                            dVarA4.show();
                            break;
                    }
                }
            }, textView);
        }
        org.greenrobot.eventbus.c.b().j(this);
    }

    public final TextView t() {
        Object value = this.f29778z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView u() {
        Object value = this.f29712D0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final Button v() {
        Object value = this.f29744e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }

    public final TextView w() {
        Object value = this.f29732U0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final AmountEditText x() {
        Object value = this.f29714F0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AmountEditText) value;
    }

    public final TextView y() {
        Object value = this.f29770u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView z() {
        Object value = this.f29711C0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }
}
