package com.transsnet.palmpay.credit.ui.fragment.cashloan;

import Ab.g;
import Ab.k;
import C0.G;
import F6.d;
import N8.q0;
import Pa.AbstractC0511h;
import Pa.C0510g;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.api.Service;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.widget.DigitalKeyboardView;
import com.transsnet.palmpay.credit.bean.BorrowAllDiscountConfig;
import com.transsnet.palmpay.credit.bean.CLBorrowAllDiscountInfo;
import com.transsnet.palmpay.credit.bean.req.CLBorrowAllDiscountConfigReq;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLMultipleRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowData;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.ui.dialog.CLCouponDialog;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.dialog.LoadingDialog;
import com.transsnet.palmpay.custom_view.dialog.n;
import com.transsnet.palmpay.custom_view.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.sufficientlysecure.htmltextview.h;
import p071ef.b;
import p116hb.e;
import p221ob.c;
import p298tf.f;
import p351xb.y;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/cashloan/CLBorrowBaseFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLBorrowBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLBorrowBaseFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/cashloan/CLBorrowBaseFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,917:1\n774#2:918\n865#2,2:919\n*S KotlinDebug\n*F\n+ 1 CLBorrowBaseFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/cashloan/CLBorrowBaseFragment\n*L\n451#1:918\n451#1:919,2\n*E\n"})
public abstract class CLBorrowBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public static final /* synthetic */ int f30503H1 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30504A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f30505A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public int f30506A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30507B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final t f30508B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public int f30509B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30510C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final t f30511C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public int f30512C1;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final t f30513D0;
    public boolean D1;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final t f30514E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public boolean f30515E1;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final t f30516F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public boolean f30517F1;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final t f30518G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public boolean f30519G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30520H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final t f30521H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final t f30522I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final t f30523J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final t f30524K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30525L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final t f30526L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30527M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final t f30528M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final t f30529N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final t f30530O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final t f30531P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f30532Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final t f30533Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final t f30534R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final t f30535S0;
    public final t T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final t f30536U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final t f30537V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final t f30538W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f30539X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final t f30540X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f30541Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public final t f30542Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f30543Z;
    public final t Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final t f30544a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final t f30545b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final t f30546c1;
    public final t d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final t f30547e1;
    public final t f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final t f30548g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final t f30549h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30550i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final t f30551i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30552j;
    public final t j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f30553k0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public CLCanBorrowData f30555l1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30558o;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public int f30559o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30560p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f30561p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public CLRepaymentPlanData f30562p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f30563q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public CLRepaymentPlanData f30564q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f30565r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public final ArrayList f30566r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f30567s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public y f30568s1;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f30569t0;
    public boolean t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f30570u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public CLMultipleRepaymentPlanData f30571u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30572v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f30573v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public final HashMap f30574v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30575w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f30576w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public CLBorrowAllDiscountInfo f30577w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f30578x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public BorrowAllDiscountConfig f30579x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f30580y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public int f30581y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f30582z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public final ArrayList f30583z1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public int f30554k1 = 7;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public int f30556m1 = -1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public final ArrayList f30557n1 = new ArrayList();

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

    public CLBorrowBaseFragment() {
        final int i7 = 10;
        this.f30550i = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i7) {
                    case 0:
                        int i10 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i11 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i12 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i13 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i14 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i15 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i16 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i10 = 2;
        this.f30552j = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i10) {
                    case 0:
                        int i11 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i12 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i13 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i14 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i15 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i16 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i11 = 14;
        this.f30558o = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i11) {
                    case 0:
                        int i12 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i13 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i14 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i15 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i16 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i12 = 26;
        this.f30560p = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i12) {
                    case 0:
                        int i13 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i14 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i15 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i16 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i13 = 8;
        this.t = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i13) {
                    case 0:
                        int i14 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i15 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i16 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i14 = 20;
        this.f30572v = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i14) {
                    case 0:
                        int i15 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i16 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i15 = 27;
        this.f30575w = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i15) {
                    case 0:
                        int i16 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i16 = 28;
        this.f30504A = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i16) {
                    case 0:
                        int i17 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i17 = 29;
        this.f30507B = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i17) {
                    case 0:
                        int i18 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i18 = 0;
        this.f30510C = C2131j.b(new Function0(this) { // from class: Ab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f117b;

            {
                this.f117b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f117b;
                switch (i18) {
                    case 0:
                        int i19 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_before_tv);
                    case 1:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_date_tv);
                    case 2:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_increase_loan_time_tv);
                    case 3:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_installment_count_rv);
                    default:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_bw_days_tv);
                }
            }
        });
        final int i19 = 21;
        this.f30520H = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i19) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i20 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i20 = 2;
        this.f30525L = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i20) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i21 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i21 = 13;
        this.f30527M = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i21) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i22 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i22 = 24;
        this.f30532Q = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i22) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i23 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i40 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i41 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i42 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i43 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i23 = 1;
        this.f30539X = C2131j.b(new Function0(this) { // from class: Ab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f117b;

            {
                this.f117b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f117b;
                switch (i23) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_before_tv);
                    case 1:
                        int i24 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_date_tv);
                    case 2:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_increase_loan_time_tv);
                    case 3:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_installment_count_rv);
                    default:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_bw_days_tv);
                }
            }
        });
        final int i24 = 2;
        this.f30541Y = C2131j.b(new Function0(this) { // from class: Ab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f117b;

            {
                this.f117b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f117b;
                switch (i24) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_before_tv);
                    case 1:
                        int i25 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_date_tv);
                    case 2:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_increase_loan_time_tv);
                    case 3:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_installment_count_rv);
                    default:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_bw_days_tv);
                }
            }
        });
        final int i25 = 3;
        this.f30543Z = C2131j.b(new Function0(this) { // from class: Ab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f117b;

            {
                this.f117b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f117b;
                switch (i25) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_before_tv);
                    case 1:
                        int i26 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_date_tv);
                    case 2:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_increase_loan_time_tv);
                    case 3:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_installment_count_rv);
                    default:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_bw_days_tv);
                }
            }
        });
        final int i26 = 4;
        this.f30553k0 = C2131j.b(new Function0(this) { // from class: Ab.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f117b;

            {
                this.f117b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f117b;
                switch (i26) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_before_tv);
                    case 1:
                        int i27 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_date_tv);
                    case 2:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_increase_loan_time_tv);
                    case 3:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_installment_count_rv);
                    default:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_bw_days_tv);
                }
            }
        });
        final int i27 = 0;
        this.f30561p0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i27) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i28 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i28 = 1;
        this.f30563q0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i28) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i29 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i29 = 3;
        this.f30565r0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i29) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i30 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i30 = 4;
        this.f30567s0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i30) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i31 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i31 = 5;
        this.f30569t0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i31) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i32 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i32 = 6;
        this.f30570u0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i32) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i33 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i33 = 7;
        this.f30573v0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i33) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i34 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i34 = 8;
        this.f30576w0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i34) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i35 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i35 = 9;
        this.f30578x0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i35) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i36 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i36 = 11;
        this.f30580y0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i36) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i37 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i37 = 12;
        this.f30582z0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i37) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i38 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i38 = 13;
        this.f30505A0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i38) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i39 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i39 = 15;
        this.f30508B0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i39) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i40 = 16;
        this.f30511C0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i40) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i41 = 17;
        this.f30513D0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i41) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i42 = 18;
        this.f30514E0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i42) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i43 = 19;
        this.f30516F0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i43) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i44 = 20;
        this.f30518G0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i44) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i45 = 22;
        this.f30521H0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i45) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i46 = 23;
        this.f30522I0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i46) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i47 = 24;
        this.f30523J0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i47) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i48 = 25;
        this.f30524K0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i48) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i49 = 27;
        this.f30526L0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i49) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i50 = 28;
        this.f30528M0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i50) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i51 = 29;
        this.f30529N0 = C2131j.b(new Function0(this) { // from class: Ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f113b;

            {
                this.f113b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f113b;
                switch (i51) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cl_bw_date_cl);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_ll);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (Button) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_next_bt);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_before_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_short_fee_now_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cur_plan_content_tv);
                    case 6:
                        int i116 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvInterestOffInfo);
                    case 7:
                        int i117 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_plan_cl);
                    case 8:
                        int i118 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_tv);
                    case 9:
                        int i119 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_repayment_date_title_tv);
                    case 10:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (DigitalKeyboardView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_borrow_dkv);
                    case 11:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_increase_loan_time_tv);
                    case 12:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_installment_count_rv);
                    case 13:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_bw_days_tv);
                    case 14:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.loan_agreement_tv);
                    case 15:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_choose_title_tv);
                    case 16:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cl_bw_date_cl);
                    case 17:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_ll);
                    case 18:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_content_tv);
                    case 19:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_short_cash_plan_title_tv);
                    case 20:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.short_cash_method_ll);
                    case 21:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_multiple_install_fee_now_tv);
                    case 22:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_content_tv);
                    case 23:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_ins_plan_title_tv);
                    case 24:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_method_ll);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_select_repayment_ll);
                    case 26:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_receive_account_tv);
                    case 27:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_before_tv);
                    case 28:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_fee_now_tv);
                    default:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cur_plan_content_tv);
                }
            }
        });
        final int i52 = 0;
        this.f30530O0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i52) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i53 = 1;
        this.f30531P0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i53) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i54 = 3;
        this.f30533Q0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i54) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i55 = 4;
        this.f30534R0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i55) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i56 = 5;
        this.f30535S0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i56) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i57 = 6;
        this.T0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i57) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i58 = 7;
        this.f30536U0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i58) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i59 = 9;
        this.f30537V0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i59) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i60 = 10;
        this.f30538W0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i60) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i61 = 11;
        this.f30540X0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i61) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i62 = 12;
        this.f30542Y0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i62) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i63 = 14;
        this.Z0 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i63) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i64 = 15;
        this.f30544a1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i64) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i65 = 16;
        this.f30545b1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i65) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i66 = 17;
        this.f30546c1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i66) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i67 = 18;
        this.d1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i67) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i68 = 19;
        this.f30547e1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i68) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i69 = 21;
        this.f1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i69) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i70 = 22;
        this.f30548g1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i70) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i71 = 23;
        this.f30549h1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i71) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i72 = 25;
        this.f30551i1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i72) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        final int i73 = 26;
        this.j1 = C2131j.b(new Function0(this) { // from class: Ab.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLBorrowBaseFragment f115b;

            {
                this.f115b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLBorrowBaseFragment cLBorrowBaseFragment = this.f115b;
                switch (i73) {
                    case 0:
                        int i110 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvSingleInterestOffInfo);
                    case 1:
                        int i111 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_plan_cl);
                    case 2:
                        int i112 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_cur_plan_content_tv);
                    case 3:
                        int i113 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.first_repayment_date_tv);
                    case 4:
                        int i114 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_tv);
                    case 5:
                        int i115 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.repayment_date_title_tv);
                    case 6:
                        int i210 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.increase_loan_time_tv);
                    case 7:
                        int i211 = CLBorrowBaseFragment.f30503H1;
                        return (RecyclerView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.installment_count_rv);
                    case 8:
                        int i212 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.receive_account_ll);
                    case 9:
                        int i213 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_days_tv);
                    case 10:
                        int i214 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.choose_title_tv);
                    case 11:
                        int i215 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_bw_date_cl);
                    case 12:
                        int i216 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.select_repayment_ll);
                    case 13:
                        int i217 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_repayment_plan_cl);
                    case 14:
                        int i218 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_stamp_duty);
                    case 15:
                        int i219 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_management_fee);
                    case 16:
                        int i310 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tv_received_amount);
                    case 17:
                        int i311 = CLBorrowBaseFragment.f30503H1;
                        return (ConstraintLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.cl_stamp_duty);
                    case 18:
                        int i312 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_amount_tips_tv);
                    case 19:
                        int i313 = CLBorrowBaseFragment.f30503H1;
                        return cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_divider_view);
                    case 20:
                        int i314 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_end_img);
                    case 21:
                        int i315 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.tvBorrowAll);
                    case 22:
                        int i316 = CLBorrowBaseFragment.f30503H1;
                        return (AmountEditText) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_input_amount_et);
                    case 23:
                        int i317 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.bw_symbol_tv);
                    case 24:
                        int i318 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.multiple_first_repayment_date_tv);
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i319 = CLBorrowBaseFragment.f30503H1;
                        return (ImageView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.ivTriangle);
                    case 26:
                        int i410 = CLBorrowBaseFragment.f30503H1;
                        return (RoundedTextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.rtvBorrowAllDiscountInfo);
                    case 27:
                        int i411 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_content_tv);
                    case 28:
                        int i412 = CLBorrowBaseFragment.f30503H1;
                        return (TextView) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_title_tv);
                    default:
                        int i413 = CLBorrowBaseFragment.f30503H1;
                        return (LinearLayout) cLBorrowBaseFragment.f27318b.findViewById(Ya.e.coupon_ll);
                }
            }
        });
        new ArrayList();
        this.f30559o1 = -1;
        this.f30566r1 = new ArrayList();
        this.f30574v1 = new HashMap();
        this.f30581y1 = -1;
        this.f30583z1 = new ArrayList();
        this.f30506A1 = -1;
        this.f30509B1 = -1;
        this.f30512C1 = -1;
        this.f30517F1 = true;
    }

    public final DigitalKeyboardView A() {
        Object value = this.f30550i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (DigitalKeyboardView) value;
    }

    public final ConstraintLayout B() {
        Object value = this.f30540X0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    public final TextView C() {
        Object value = this.f30575w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final ImageView D() {
        Object value = this.f30572v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final LinearLayout E() {
        Object value = this.f30507B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final TextView F() {
        Object value = this.f30526L0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView G() {
        Object value = this.f30510C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView H() {
        Object value = this.f30565r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView I() {
        Object value = this.T0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final RecyclerView J() {
        Object value = this.f30536U0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final TextView K() {
        Object value = this.f30558o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView L() {
        Object value = this.f30541Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final RecyclerView M() {
        Object value = this.f30543Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final LinearLayout N() {
        Object value = this.f30524K0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final TextView O() {
        Object value = this.f30514E0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView P() {
        Object value = this.f30580y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final RecyclerView Q() {
        Object value = this.f30582z0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final LinearLayout R() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final ArrayList S() {
        int i7 = this.f30506A1;
        ArrayList arrayList = this.f30566r1;
        return (i7 != -1 || this.f30509B1 == 2) ? arrayList : this.f30583z1;
    }

    public final TextView T() {
        Object value = this.f30534R0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final RoundedTextView U() {
        Object value = this.j1.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RoundedTextView) value;
    }

    public final int V() {
        if (this.f30506A1 == -1) {
            return this.f30509B1 == 2 ? this.f30559o1 : this.f30581y1;
        }
        return this.f30559o1;
    }

    public final LinearLayout W() {
        Object value = this.f30542Y0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final CLRepaymentPlanData X() {
        if (this.f30506A1 == -1) {
            return this.f30509B1 == 2 ? this.f30562p1 : this.f30564q1;
        }
        return this.f30562p1;
    }

    public final TextView Y() {
        Object value = this.f30570u0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView Z() {
        Object value = this.f30530O0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void a0(boolean z3) {
        if (getContext() != null) {
            CLCanBorrowData cLCanBorrowData = this.f30555l1;
            if (cLCanBorrowData != null ? Intrinsics.c(cLCanBorrowData.can, Boolean.FALSE) : false) {
                x().setEnabled(false);
                z().setEnabled(false);
            } else {
                x().setEnabled(z3);
                z().setClickable(z3);
            }
        }
    }

    public final void b0() {
        ArrayList arrayList = this.f30557n1;
        if (arrayList == null || arrayList.isEmpty()) {
            showLoadingDialog(true);
            G.h(c.f40268a).getBorrowCoupon(X()).k(f.f42629b).i(b.a()).subscribe(new g(this, 2));
            return;
        }
        Context context = getContext();
        if (context != null) {
            CLCouponDialog cLCouponDialog = new CLCouponDialog(context, arrayList, this.f30556m1);
            cLCouponDialog.setConfirmListener(new A8.c(1, this, cLCouponDialog));
            cLCouponDialog.show();
        }
    }

    public final void c0() {
        CLBorrowCouponData coupon;
        Long actualDiscountAmount;
        Context context = getContext();
        if (context != null) {
            CLRepaymentPlanData cLRepaymentPlanDataX = X();
            if ((cLRepaymentPlanDataX != null ? cLRepaymentPlanDataX.getCoupon() : null) != null) {
                C().setTextColor(context.getColor(L6.b.ppColorTextPrimary));
                D().setVisibility(0);
                TextView textViewC = C();
                int i7 = Ya.g.cs_use_coupons_content;
                CLRepaymentPlanData cLRepaymentPlanDataX2 = X();
                textViewC.setText(getString(i7, r0.B((cLRepaymentPlanDataX2 == null || (coupon = cLRepaymentPlanDataX2.getCoupon()) == null || (actualDiscountAmount = coupon.getActualDiscountAmount()) == null) ? 0L : actualDiscountAmount.longValue(), true)));
                E().setVisibility(0);
                return;
            }
            ArrayList arrayList = this.f30557n1;
            if (arrayList == null || arrayList.isEmpty()) {
                C().setTextColor(context.getColor(Ya.b.cs_cl_bw_no_coupon_txt_color));
                D().setVisibility(8);
                C().setText(getString(Ya.g.cs_unavailable_coupons));
                E().setVisibility(8);
                return;
            }
            C().setTextColor(context.getColor(L6.b.ppColorTextPrimary));
            D().setVisibility(0);
            C().setText(getString(Ya.g.cs_available_coupons, Integer.valueOf(arrayList.size())));
            E().setVisibility(0);
        }
    }

    public final void d0(boolean z3) {
        if (z3) {
            z().setVisibility(8);
            A().setVisibility(0);
        } else {
            z().setVisibility(0);
            A().setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:69:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x017a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0196  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01df  */
    public void e0() {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        Long interestSum;
        Long interestSum2;
        Long interestSum3;
        Integer reductionWay;
        Integer productSubId;
        Long interestSum4;
        Long originInterestSum;
        Long interestSum5;
        Long originInterestSum2;
        Long interestSum6;
        Long originInterestSum3;
        CLBorrowAllDiscountInfo cLBorrowAllDiscountInfo;
        if (getContext() != null) {
            CLRepaymentPlanData cLRepaymentPlanDataX = X();
            int iV = V();
            Object value = this.f30560p.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setText(cLRepaymentPlanDataX != null ? cLRepaymentPlanDataX.getLoanAccount() : null);
            t tVar = this.f30520H;
            t tVar2 = this.f30567s0;
            t tVar3 = this.f30528M0;
            String str = this.f27317a;
            int i7 = 0;
            if (iV < 0 || iV >= this.f30566r1.size()) {
                d.h(str, 3, "updateRepaymentView >>> 2");
                F().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                TextView textViewF = F();
                if (cLRepaymentPlanDataX != null || (interestSum3 = cLRepaymentPlanDataX.getInterestSum()) == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = interestSum3.longValue();
                }
                textViewF.setText(r0.B(jLongValue, false));
                Object value2 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((TextView) value2).setText("");
                TextView textViewH = H();
                if (cLRepaymentPlanDataX != null || (interestSum2 = cLRepaymentPlanDataX.getInterestSum()) == null) {
                    jLongValue2 = 0;
                } else {
                    jLongValue2 = interestSum2.longValue();
                }
                textViewH.setText(r0.B(jLongValue2, false));
                H().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                Object value3 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((TextView) value3).setText("");
                TextView textViewG = G();
                if (cLRepaymentPlanDataX != null || (interestSum = cLRepaymentPlanDataX.getInterestSum()) == null) {
                    jLongValue3 = 0;
                } else {
                    jLongValue3 = interestSum.longValue();
                }
                textViewG.setText(r0.B(jLongValue3, false));
                G().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                Object value4 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((TextView) value4).setText("");
            } else {
                if ((cLRepaymentPlanDataX != null ? cLRepaymentPlanDataX.getCoupon() : null) != null || ((cLBorrowAllDiscountInfo = this.f30577w1) != null && cLBorrowAllDiscountInfo.ifBorrowAll)) {
                    if (Intrinsics.c(cLRepaymentPlanDataX != null ? cLRepaymentPlanDataX.getInterestSum() : null, cLRepaymentPlanDataX != null ? cLRepaymentPlanDataX.getOriginInterestSum() : null)) {
                        d.h(str, 3, "updateRepaymentView >>> 2");
                        F().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                        TextView textViewF2 = F();
                        if (cLRepaymentPlanDataX != null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = 0;
                        }
                        textViewF2.setText(r0.B(jLongValue, false));
                        Object value5 = tVar3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        ((TextView) value5).setText("");
                        TextView textViewH2 = H();
                        if (cLRepaymentPlanDataX != null) {
                            jLongValue2 = 0;
                        } else {
                            jLongValue2 = 0;
                        }
                        textViewH2.setText(r0.B(jLongValue2, false));
                        H().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                        Object value6 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                        ((TextView) value6).setText("");
                        TextView textViewG2 = G();
                        if (cLRepaymentPlanDataX != null) {
                            jLongValue3 = 0;
                        } else {
                            jLongValue3 = 0;
                        }
                        textViewG2.setText(r0.B(jLongValue3, false));
                        G().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                        Object value7 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                        ((TextView) value7).setText("");
                    } else {
                        d.h(str, 3, "updateRepaymentView >>> 1");
                        F().setText(r0.B((cLRepaymentPlanDataX == null || (originInterestSum3 = cLRepaymentPlanDataX.getOriginInterestSum()) == null) ? 0L : originInterestSum3.longValue(), false));
                        F().getPaint().setFlags(16);
                        Object value8 = tVar3.getValue();
                        Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                        ((TextView) value8).setText(r0.B((cLRepaymentPlanDataX == null || (interestSum6 = cLRepaymentPlanDataX.getInterestSum()) == null) ? 0L : interestSum6.longValue(), false));
                        H().setText(r0.B((cLRepaymentPlanDataX == null || (originInterestSum2 = cLRepaymentPlanDataX.getOriginInterestSum()) == null) ? 0L : originInterestSum2.longValue(), false));
                        H().getPaint().setFlags(16);
                        Object value9 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                        ((TextView) value9).setText(r0.B((cLRepaymentPlanDataX == null || (interestSum5 = cLRepaymentPlanDataX.getInterestSum()) == null) ? 0L : interestSum5.longValue(), false));
                        G().setText(r0.B((cLRepaymentPlanDataX == null || (originInterestSum = cLRepaymentPlanDataX.getOriginInterestSum()) == null) ? 0L : originInterestSum.longValue(), false));
                        G().getPaint().setFlags(16);
                        Object value10 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                        ((TextView) value10).setText(r0.B((cLRepaymentPlanDataX == null || (interestSum4 = cLRepaymentPlanDataX.getInterestSum()) == null) ? 0L : interestSum4.longValue(), false));
                    }
                } else {
                    d.h(str, 3, "updateRepaymentView >>> 2");
                    F().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                    TextView textViewF3 = F();
                    if (cLRepaymentPlanDataX != null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = 0;
                    }
                    textViewF3.setText(r0.B(jLongValue, false));
                    Object value11 = tVar3.getValue();
                    Intrinsics.checkNotNullExpressionValue(value11, "getValue(...)");
                    ((TextView) value11).setText("");
                    TextView textViewH3 = H();
                    if (cLRepaymentPlanDataX != null) {
                        jLongValue2 = 0;
                    } else {
                        jLongValue2 = 0;
                    }
                    textViewH3.setText(r0.B(jLongValue2, false));
                    H().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                    Object value12 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value12, "getValue(...)");
                    ((TextView) value12).setText("");
                    TextView textViewG3 = G();
                    if (cLRepaymentPlanDataX != null) {
                        jLongValue3 = 0;
                    } else {
                        jLongValue3 = 0;
                    }
                    textViewG3.setText(r0.B(jLongValue3, false));
                    G().getPaint().setFlags(F().getPaint().getFlags() & (-17));
                    Object value13 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value13, "getValue(...)");
                    ((TextView) value13).setText("");
                }
            }
            c0();
            BorrowAllDiscountConfig borrowAllDiscountConfig = this.f30579x1;
            t tVar4 = this.f30551i1;
            if (borrowAllDiscountConfig == null || !borrowAllDiscountConfig.ifMatchTag || cLRepaymentPlanDataX == null || (reductionWay = cLRepaymentPlanDataX.getReductionWay()) == null || reductionWay.intValue() != 2) {
                d.h(str, 3, "updateRepaymentView >>> 4");
                Y().setVisibility(8);
                Z().setVisibility(8);
                v().setVisibility((!this.f30517F1 || TextUtils.isEmpty(v().getText().toString())) ? 8 : 0);
                U().setVisibility(8);
                Object value14 = tVar4.getValue();
                Intrinsics.checkNotNullExpressionValue(value14, "getValue(...)");
                ((ImageView) value14).setVisibility(8);
                return;
            }
            d.h(str, 3, "updateRepaymentView >>> 3");
            Long discountInterestSum = cLRepaymentPlanDataX.getDiscountInterestSum();
            String strZ0 = r0.z0(r0.B(discountInterestSum != null ? discountInterestSum.longValue() : 0L, true));
            C0510g c0510g = AbstractC0511h.f7089a;
            RoundedTextView roundedTextViewU = U();
            int i10 = Ya.g.cs_borrow_all_save_interest;
            BorrowAllDiscountConfig borrowAllDiscountConfig2 = this.f30579x1;
            String string = getString(i10, q0.j(r0.z0(r0.w1(String.valueOf(borrowAllDiscountConfig2 != null ? Double.valueOf(borrowAllDiscountConfig2.discountRatio) : null), "100").toPlainString()), "%"));
            BorrowAllDiscountConfig borrowAllDiscountConfig3 = this.f30579x1;
            c0510g.richText(roundedTextViewU, string, q0.j(r0.z0(r0.w1(String.valueOf(borrowAllDiscountConfig3 != null ? Double.valueOf(borrowAllDiscountConfig3.discountRatio) : null), "100").toPlainString()), "%"), new ForegroundColorSpan(requireContext().getColor(p.cv_color_b87900)));
            U().setVisibility(this.D1 ? 8 : 0);
            Object value15 = tVar4.getValue();
            Intrinsics.checkNotNullExpressionValue(value15, "getValue(...)");
            ((ImageView) value15).setVisibility(this.D1 ? 8 : 0);
            Y().setVisibility((!this.D1 || this.f30554k1 == 2) ? 8 : 0);
            Z().setVisibility((!this.D1 || this.f30554k1 == 2) ? 8 : 0);
            Y().setText(getString(Ya.g.cs_saved_interest, strZ0));
            Z().setText(getString(Ya.g.cs_saved_interest, strZ0));
            if (this.D1) {
                c0510g.richText(v(), getString(Ya.g.cs_saving_interest_by_fully_borrowing, strZ0), strZ0, new ForegroundColorSpan(requireContext().getColor(p.cv_color_b87900)));
                v().setCompoundDrawablesWithIntrinsicBounds(Ya.d.cs_icon_saving_amount, 0, 0, 0);
            }
            TextView textViewV = v();
            if ((!this.D1 || ((productSubId = cLRepaymentPlanDataX.getProductSubId()) != null && productSubId.intValue() == 2)) && (!this.f30517F1 || TextUtils.isEmpty(v().getText().toString()))) {
                i7 = 8;
            }
            textViewV.setVisibility(i7);
        }
    }

    public final void f0() {
        G.h(c.f40268a).clBorrowUseCoupon(X()).k(f.f42629b).i(b.a()).subscribe(new g(this, 3));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Ya.f.cs_cl_cash_bw_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final LoadingDialog i() {
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = new n(context);
        nVar.f31290d = Integer.valueOf(e.cs_cash_loading);
        return nVar.a();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        String string = getString(Ya.g.cl_borrow_pop_ad_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView.show$default(new InterstitialAdView(string, 0, new k(0), new h(9)), getContext(), null, 2, null);
        showLoadingDialog(true);
        G.h(c.f40268a).canBorrow(Integer.valueOf(this.f30554k1)).k(f.f42629b).i(b.a()).subscribe(new g(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.getEventType();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        a0(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        a0(true);
    }

    public abstract void t();

    public final void u() {
        List<Integer> list;
        if (this.f30579x1 != null || this.f30515E1) {
            e0();
            return;
        }
        this.f30515E1 = true;
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        Integer productSubId = null;
        if (X() == null) {
            CLCanBorrowData cLCanBorrowData = this.f30555l1;
            if (cLCanBorrowData != null && (list = cLCanBorrowData.productSubIdList) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    int iIntValue = ((Number) obj).intValue();
                    if (iIntValue == 1 || iIntValue == 3) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    productSubId = (Integer) CollectionsKt.F(arrayList);
                }
            }
        } else {
            CLRepaymentPlanData cLRepaymentPlanDataX = X();
            if (cLRepaymentPlanDataX != null) {
                productSubId = cLRepaymentPlanDataX.getProductSubId();
            }
        }
        iApiCreditServiceH.getBorrowAllDiscountConfig(new CLBorrowAllDiscountConfigReq(productSubId)).k(f.f42629b).i(b.a()).subscribe(new g(this, 1));
    }

    public final TextView v() {
        Object value = this.d1.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView w() {
        Object value = this.f30537V0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final AmountEditText x() {
        Object value = this.f30548g1.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AmountEditText) value;
    }

    public final View y() {
        Object value = this.f30547e1.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (View) value;
    }

    public final Button z() {
        Object value = this.f30552j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Button) value;
    }
}
