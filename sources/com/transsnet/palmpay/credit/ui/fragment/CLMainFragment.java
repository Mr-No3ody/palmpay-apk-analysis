package com.transsnet.palmpay.credit.ui.fragment;

import A8.c;
import Ab.r;
import C0.G;
import Jb.C0342a;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ya.b;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.network.ErrorCodes;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.api.Service;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmFragment;
import com.transsnet.palmpay.credit.bean.req.CLPermissionInfo;
import com.transsnet.palmpay.credit.bean.req.PermissionReq;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanCardInfo;
import com.transsnet.palmpay.credit.bean.resp.InstallmentLoanMainPageData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCashLoanBill;
import com.transsnet.palmpay.credit.bean.rsp.CLMainConfig;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.ProductSubs;
import com.transsnet.palmpay.credit.bean.rsp.TopTipsData;
import com.transsnet.palmpay.credit.ui.dialog.CLTemporaryAmountDialog;
import com.transsnet.palmpay.credit.ui.fragment.CLMainFragment;
import com.transsnet.palmpay.credit.ui.view.BorrowCLInfoView2;
import com.transsnet.palmpay.credit.ui.view.OneTouchBorrowView2;
import com.transsnet.palmpay.credit.view.CLMultipleCashProductView;
import com.transsnet.palmpay.credit.view.InstallmentLoanView;
import com.transsnet.palmpay.credit.viewmodel.CLMainViewModel;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.F;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p129ib.m;
import p141j9.C1807o;
import p220oa.h;
import p284sb.C2025x;
import p294tb.C2058u;
import p310ub.C2102t0;
import p310ub.h1;
import p355xf.C2131j;
import p355xf.o;
import p355xf.q;
import p355xf.t;
import p368yb.B;
import p382zb.C2164g;
import p382zb.C2165h;
import p382zb.C2166i;
import p382zb.C2167j;
import p382zb.ViewOnClickListenerC2163f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/CLMainFragment;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/CLMainViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "LoanProductChangeListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCLMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CLMainFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/CLMainFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,2109:1\n115#2,8:2110\n145#2:2118\n37#3:2119\n36#3,3:2120\n37#3:2123\n36#3,3:2124\n37#3:2127\n36#3,3:2128\n*S KotlinDebug\n*F\n+ 1 CLMainFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/CLMainFragment\n*L\n1651#1:2110,8\n1651#1:2118\n354#1:2119\n354#1:2120,3\n362#1:2123\n362#1:2124,3\n370#1:2127\n370#1:2128,3\n*E\n"})
public final class CLMainFragment extends CreditBaseMvvmFragment<CLMainViewModel> {
    public static final /* synthetic */ int j1 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30238A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final t f30239A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30240B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final t f30241B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30242C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final t f30243C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final t f30244D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final t f30245E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final t f30246F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final t f30247G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30248H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final t f30249H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final t f30250I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final t f30251J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final t f30252K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30253L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final t f30254L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30255M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public final t f30256M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final t f30257N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final t f30258O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public final t f30259P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f30260Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final t f30261Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final t f30262R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public final t f30263S0;
    public final t T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public final t f30264U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final t f30265V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public CLMainData f30266W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f30267X;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public InstallmentLoanMainPageData f30268X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f30269Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public CLMainCashLoanBill f30270Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f30271Z;
    public ProductSubs Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public ProductSubs f30272a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public ProductSubs f30273b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public ProductSubs f30274c1;
    public final HashMap d1 = new HashMap();

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public final ArrayList f30275e1 = new ArrayList();
    public ProductSubs f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public B f30276g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public C2058u f30277h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public CLTemporaryAmountDialog f30278i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30279j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f30280k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30282p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f30283p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f30284q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f30285r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f30286s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f30287t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f30288u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30289v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f30290v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30291w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f30292w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f30293x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f30294y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f30295z0;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/CLMainFragment$LoanProductChangeListener;", "", "onLoanProductChange", "", "productType", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface LoanProductChangeListener {
        void onLoanProductChange(@NotNull String productType);
    }

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

    public CLMainFragment() {
        final int i7 = 0;
        this.f30279j = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i7) {
                    case 0:
                        int i10 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i11 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i12 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i13 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i14 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i15 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i16 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i17 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i18 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i19 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i20 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i21 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i22 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i23 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i24 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i25 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i26 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i27 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i28 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i29 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i10 = 2;
        this.f30281o = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i10) {
                    case 0:
                        int i11 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i12 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i13 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i14 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i15 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i16 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i17 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i18 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i19 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i110 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i20 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i21 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i22 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i23 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i24 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i25 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i26 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i27 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i28 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i29 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i11 = 14;
        this.f30282p = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i11) {
                    case 0:
                        int i12 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i13 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i14 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i15 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i16 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i17 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i18 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i19 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i110 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i111 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i20 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i21 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i22 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i23 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i24 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i25 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i26 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i27 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i28 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i29 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i12 = 26;
        this.t = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i12) {
                    case 0:
                        int i13 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i14 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i15 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i16 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i17 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i18 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i19 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i110 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i111 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i112 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i20 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i21 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i22 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i23 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i24 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i25 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i26 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i27 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i28 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i29 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i13 = 8;
        this.f30289v = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i13) {
                    case 0:
                        int i14 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i15 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i16 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i17 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i18 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i19 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i20 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i21 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i22 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i23 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i24 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i25 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i26 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i27 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i28 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i29 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i14 = 9;
        this.f30291w = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i14) {
                    case 0:
                        int i15 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i16 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i17 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i18 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i19 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i110 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i20 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i21 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i22 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i23 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i24 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i25 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i26 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i27 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i28 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i29 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i15 = 10;
        this.f30238A = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i15) {
                    case 0:
                        int i16 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i17 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i18 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i19 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i110 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i111 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i20 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i21 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i22 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i23 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i24 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i25 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i26 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i27 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i28 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i29 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i16 = 11;
        this.f30240B = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i16) {
                    case 0:
                        int i17 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i18 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i19 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i110 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i111 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i112 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i20 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i21 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i22 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i23 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i24 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i25 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i26 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i27 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i28 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i29 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i17 = 12;
        this.f30242C = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i17) {
                    case 0:
                        int i18 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i19 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i110 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i111 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i112 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i113 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i20 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i21 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i22 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i23 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i24 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i25 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i26 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i27 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i28 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i29 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i18 = 13;
        this.f30248H = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i18) {
                    case 0:
                        int i19 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i110 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i111 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i112 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i113 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i114 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i20 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i21 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i22 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i23 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i24 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i25 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i26 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i27 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i28 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i29 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i19 = 11;
        this.f30253L = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i19) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i20 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i21 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i22 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i23 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i24 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i25 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i26 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i27 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i28 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i29 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i20 = 22;
        this.f30255M = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i20) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i21 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i22 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i23 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i24 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i25 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i26 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i27 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i28 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i29 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i210 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i21 = 3;
        this.f30260Q = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i21) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i22 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i23 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i24 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i25 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i26 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i27 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i28 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i29 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i210 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i211 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i22 = 14;
        this.f30267X = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i22) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i23 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i24 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i25 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i26 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i27 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i28 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i29 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i210 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i211 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i212 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i23 = 15;
        this.f30269Y = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i23) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i24 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i25 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i26 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i27 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i28 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i29 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i210 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i211 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i212 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i213 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i24 = 16;
        this.f30271Z = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i24) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i25 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i26 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i27 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i28 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i29 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i210 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i211 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i212 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i213 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i214 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i25 = 17;
        this.f30280k0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i25) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i26 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i27 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i28 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i29 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i26 = 18;
        this.f30283p0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i26) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i27 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i28 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i29 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i210 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i211 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i212 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i213 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i214 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i215 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i216 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i27 = 19;
        this.f30284q0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i27) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i28 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i29 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i210 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i211 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i212 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i213 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i214 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i215 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i216 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i217 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i30 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i31 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i32 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i33 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i28 = 1;
        this.f30285r0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i28) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i29 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i210 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i211 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i212 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i213 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i214 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i215 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i216 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i217 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i218 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i29 = 3;
        this.f30286s0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i29) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i30 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i31 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i32 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i33 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i34 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i35 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i36 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i37 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i38 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i39 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i30 = 4;
        this.f30287t0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i30) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i31 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i32 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i33 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i34 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i35 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i36 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i37 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i38 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i39 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i310 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i31 = 5;
        this.f30288u0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i31) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i32 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i33 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i34 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i35 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i36 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i37 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i38 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i39 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i310 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i311 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i32 = 6;
        this.f30290v0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i32) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i33 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i34 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i35 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i36 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i37 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i38 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i39 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i310 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i311 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i312 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i33 = 7;
        this.f30292w0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i33) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i34 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i35 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i36 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i37 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i38 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i39 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i310 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i311 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i312 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i34 = 8;
        this.f30293x0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i34) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i35 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i36 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i37 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i38 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i39 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i310 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i311 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i312 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i313 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i314 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i35 = 9;
        this.f30294y0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i35) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i36 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i37 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i38 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i39 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i310 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i311 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i312 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i313 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i314 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i315 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i36 = 10;
        this.f30295z0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i36) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i37 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i38 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i39 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i310 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i311 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i312 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i313 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i314 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i315 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i316 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i37 = 12;
        this.f30239A0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i37) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i38 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i39 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i310 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i311 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i312 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i313 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i314 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i315 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i316 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i317 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i38 = 13;
        this.f30241B0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i38) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i39 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i310 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i311 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i312 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i313 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i314 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i315 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i316 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i317 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i318 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i39 = 15;
        this.f30243C0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i39) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i40 = 16;
        this.f30244D0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i40) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i41 = 17;
        this.f30245E0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i41) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i42 = 18;
        this.f30246F0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i42) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i43 = 19;
        this.f30247G0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i43) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i44 = 20;
        this.f30249H0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i44) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i45 = 21;
        this.f30250I0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i45) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i46 = 23;
        this.f30251J0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i46) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i47 = 24;
        this.f30252K0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i47) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i48 = 25;
        this.f30254L0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i48) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i49 = 27;
        this.f30256M0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i49) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i50 = 28;
        this.f30257N0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i50) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i51 = 29;
        this.f30258O0 = C2131j.b(new Function0(this) { // from class: zb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44573b;

            {
                this.f44573b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44573b;
                switch (i51) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_main_sav);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.forzen_tag_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(e.cl_menu_rv);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvSingleCashAvailableAmount);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvSingleRepayLoanTitle);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (ConstraintLayout) view6.findViewById(e.top_acc_ll);
                        }
                        return null;
                    case 6:
                        int i116 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.cl_pay_detail_tv);
                        }
                        return null;
                    case 7:
                        int i117 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (TextView) view8.findViewById(e.cs_cl_main_repayment_detail_tv);
                        }
                        return null;
                    case 8:
                        int i118 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (ConstraintLayout) view9.findViewById(e.cs_cl_main_payoff_layout);
                        }
                        return null;
                    case 9:
                        int i119 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.multiple_tips_tv);
                        }
                        return null;
                    case 10:
                        int i210 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (TextView) view11.findViewById(e.extend_label_tv);
                        }
                        return null;
                    case 11:
                        int i211 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.tv_fixed_amount);
                        }
                        return null;
                    case 12:
                        int i212 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (Button) view13.findViewById(e.cl_bill_repay_bt);
                        }
                        return null;
                    case 13:
                        int i213 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_repay_bt_sav);
                        }
                        return null;
                    case 14:
                        int i214 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_upgrade);
                        }
                        return null;
                    case 15:
                        int i215 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_repayment_left_days_tips);
                        }
                        return null;
                    case 16:
                        int i216 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.cl_repayment_left_days_tv);
                        }
                        return null;
                    case 17:
                        int i217 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_date);
                        }
                        return null;
                    case 18:
                        int i218 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.cl_bill_amount_tv);
                        }
                        return null;
                    case 19:
                        int i219 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.extended_tag_tv);
                        }
                        return null;
                    case 20:
                        int i310 = CLMainFragment.j1;
                        View view21 = cLMainFragment.f27318b;
                        if (view21 != null) {
                            return (TextView) view21.findViewById(e.cur_cleared_tv);
                        }
                        return null;
                    case 21:
                        int i311 = CLMainFragment.j1;
                        View view22 = cLMainFragment.f27318b;
                        if (view22 != null) {
                            return (TextView) view22.findViewById(e.bill_title_tv);
                        }
                        return null;
                    case 22:
                        int i312 = CLMainFragment.j1;
                        View view23 = cLMainFragment.f27318b;
                        if (view23 != null) {
                            return (TextView) view23.findViewById(e.tv_temporary_amount_expired);
                        }
                        return null;
                    case 23:
                        int i313 = CLMainFragment.j1;
                        View view24 = cLMainFragment.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvSingleRepayLoan);
                        }
                        return null;
                    case 24:
                        int i314 = CLMainFragment.j1;
                        View view25 = cLMainFragment.f27318b;
                        if (view25 != null) {
                            return (ConstraintLayout) view25.findViewById(e.bill_ll);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        int i315 = CLMainFragment.j1;
                        View view26 = cLMainFragment.f27318b;
                        if (view26 != null) {
                            return (ConstraintLayout) view26.findViewById(e.layoutBill);
                        }
                        return null;
                    case 26:
                        int i316 = CLMainFragment.j1;
                        View view27 = cLMainFragment.f27318b;
                        if (view27 != null) {
                            return (ConstraintLayout) view27.findViewById(e.loan_home_upgrade_layout);
                        }
                        return null;
                    case 27:
                        int i317 = CLMainFragment.j1;
                        View view28 = cLMainFragment.f27318b;
                        if (view28 != null) {
                            return (InstallmentLoanView) view28.findViewById(e.installmentLoanView);
                        }
                        return null;
                    case 28:
                        int i318 = CLMainFragment.j1;
                        View view29 = cLMainFragment.f27318b;
                        if (view29 != null) {
                            return (TextView) view29.findViewById(e.available_amount_tv2);
                        }
                        return null;
                    default:
                        int i319 = CLMainFragment.j1;
                        View view30 = cLMainFragment.f27318b;
                        if (view30 != null) {
                            return (TextView) view30.findViewById(e.borrow_other_amount_tv);
                        }
                        return null;
                }
            }
        });
        final int i52 = 0;
        this.f30259P0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i52) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i210 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i211 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i212 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i213 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i214 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i215 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i216 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i217 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i218 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i219 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i310 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i311 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i312 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i53 = 1;
        this.f30261Q0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i53) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i210 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i211 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i212 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i213 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i214 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i215 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i216 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i217 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i218 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i219 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i310 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i311 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i312 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i54 = 2;
        this.f30262R0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i54) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i210 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i211 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i212 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i213 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i214 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i215 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i216 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i217 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i218 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i219 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i310 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i311 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i312 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i55 = 4;
        this.f30263S0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i55) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i210 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i211 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i212 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i213 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i214 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i215 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i216 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i217 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i218 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i219 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i310 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i311 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i312 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i56 = 5;
        this.T0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i56) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i210 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i211 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i212 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i213 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i214 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i215 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i216 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i217 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i218 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i219 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i310 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i311 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i312 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i57 = 6;
        this.f30264U0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i57) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i210 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i211 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i212 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i213 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i214 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i215 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i216 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i217 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i218 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i219 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i310 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i311 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i312 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
        final int i58 = 7;
        this.f30265V0 = C2131j.b(new Function0(this) { // from class: zb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLMainFragment f44577b;

            {
                this.f44577b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CLMainFragment cLMainFragment = this.f44577b;
                switch (i58) {
                    case 0:
                        int i110 = CLMainFragment.j1;
                        View view = cLMainFragment.f27318b;
                        if (view != null) {
                            return (CLMultipleCashProductView) view.findViewById(e.multipleCashProductView);
                        }
                        return null;
                    case 1:
                        int i111 = CLMainFragment.j1;
                        View view2 = cLMainFragment.f27318b;
                        if (view2 != null) {
                            return (TextView) view2.findViewById(e.top_tips_tv);
                        }
                        return null;
                    case 2:
                        int i112 = CLMainFragment.j1;
                        View view3 = cLMainFragment.f27318b;
                        if (view3 != null) {
                            return (TextView) view3.findViewById(e.tv_main_bill_notice);
                        }
                        return null;
                    case 3:
                        int i113 = CLMainFragment.j1;
                        View view4 = cLMainFragment.f27318b;
                        if (view4 != null) {
                            return view4.findViewById(e.view_temporary_amount_question);
                        }
                        return null;
                    case 4:
                        int i114 = CLMainFragment.j1;
                        View view5 = cLMainFragment.f27318b;
                        if (view5 != null) {
                            return (MarqueeView) view5.findViewById(e.cl_main_top_mv);
                        }
                        return null;
                    case 5:
                        int i115 = CLMainFragment.j1;
                        View view6 = cLMainFragment.f27318b;
                        if (view6 != null) {
                            return (SingleAdView) view6.findViewById(e.cl_main_top_sav);
                        }
                        return null;
                    case 6:
                        int i210 = CLMainFragment.j1;
                        View view7 = cLMainFragment.f27318b;
                        if (view7 != null) {
                            return (PpTitleBar) view7.findViewById(e.cl_main_mtb);
                        }
                        return null;
                    case 7:
                        int i211 = CLMainFragment.j1;
                        View view8 = cLMainFragment.f27318b;
                        if (view8 != null) {
                            return (ImageView) view8.findViewById(e.cl_main_bg_img);
                        }
                        return null;
                    case 8:
                        int i212 = CLMainFragment.j1;
                        View view9 = cLMainFragment.f27318b;
                        if (view9 != null) {
                            return (Group) view9.findViewById(e.groupOneTouchBorrow);
                        }
                        return null;
                    case 9:
                        int i213 = CLMainFragment.j1;
                        View view10 = cLMainFragment.f27318b;
                        if (view10 != null) {
                            return (TextView) view10.findViewById(e.tvBorrowOtherAmount);
                        }
                        return null;
                    case 10:
                        int i214 = CLMainFragment.j1;
                        View view11 = cLMainFragment.f27318b;
                        if (view11 != null) {
                            return (OneTouchBorrowView2) view11.findViewById(e.oneTouchBorrowView2);
                        }
                        return null;
                    case 11:
                        int i215 = CLMainFragment.j1;
                        View view12 = cLMainFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(e.cl_ifJointDebit);
                        }
                        return null;
                    case 12:
                        int i216 = CLMainFragment.j1;
                        View view13 = cLMainFragment.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.cl_borrow_tv);
                        }
                        return null;
                    case 13:
                        int i217 = CLMainFragment.j1;
                        View view14 = cLMainFragment.f27318b;
                        if (view14 != null) {
                            return (TextView) view14.findViewById(e.top_left_interest_tv);
                        }
                        return null;
                    case 14:
                        int i218 = CLMainFragment.j1;
                        View view15 = cLMainFragment.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.tv_temporary_amount);
                        }
                        return null;
                    case 15:
                        int i219 = CLMainFragment.j1;
                        View view16 = cLMainFragment.f27318b;
                        if (view16 != null) {
                            return (ConstraintLayout) view16.findViewById(e.ly_tempQuota);
                        }
                        return null;
                    case 16:
                        int i310 = CLMainFragment.j1;
                        View view17 = cLMainFragment.f27318b;
                        if (view17 != null) {
                            return (TextView) view17.findViewById(e.available_amount_tv);
                        }
                        return null;
                    case 17:
                        int i311 = CLMainFragment.j1;
                        View view18 = cLMainFragment.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.tv_title_days);
                        }
                        return null;
                    case 18:
                        int i312 = CLMainFragment.j1;
                        View view19 = cLMainFragment.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.period_days_tv);
                        }
                        return null;
                    default:
                        int i313 = CLMainFragment.j1;
                        View view20 = cLMainFragment.f27318b;
                        if (view20 != null) {
                            return (TextView) view20.findViewById(e.loan_period_title_tv);
                        }
                        return null;
                }
            }
        });
    }

    public final TextView A() {
        return (TextView) this.f30262R0.getValue();
    }

    public final void B(boolean z3) {
        TextView textView = (TextView) this.f30286s0.getValue();
        if (textView != null) {
            textView.setTextColor(requireContext().getColor(z3 ? b.cs_color_frozen : b.cs_color_amount));
        }
        TextView textView2 = (TextView) this.f30284q0.getValue();
        if (textView2 != null) {
            textView2.setTextColor(requireContext().getColor(z3 ? b.cs_color_frozen : b.cs_color_amount));
        }
        TextView textViewY = y();
        if (textViewY != null) {
            textViewY.setTextColor(requireContext().getColor(z3 ? b.cs_color_frozen : b.cs_color_amount));
        }
        TextView textView3 = (TextView) this.f30280k0.getValue();
        if (textView3 != null) {
            textView3.setTextColor(requireContext().getColor(z3 ? b.cs_color_frozen : b.cs_color_amount));
        }
        TextView textView4 = (TextView) this.f30271Z.getValue();
        if (textView4 != null) {
            textView4.setTextColor(requireContext().getColor(z3 ? b.cs_color_frozen : b.cs_color_amount));
        }
        TextView textView5 = (TextView) this.f30257N0.getValue();
        if (textView5 != null) {
            textView5.setTextColor(requireContext().getColor(z3 ? b.cs_cl_open_rate_txt_color : b.cs_oc_negative_txt_color));
        }
        TextView textViewY2 = y();
        if (textViewY2 != null) {
            textViewY2.setTextColor(requireContext().getColor(z3 ? b.cs_color_frozen : b.cs_color_amount));
        }
        TextView textView6 = (TextView) this.f30285r0.getValue();
        if (textView6 != null) {
            textView6.setVisibility(z3 ? 0 : 8);
        }
    }

    public final void C(boolean z3, CLRepaymentPlanData cLRepaymentPlanData) {
        Integer applyStatus;
        InstallmentLoanMainPageData installmentLoanMainPageData;
        InstallmentLoanMainPageData installmentLoanMainPageData2;
        Integer applyStatus2;
        Integer applyStatus3;
        BorrowCLInfoView2 borrowCLInfoView2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        TextPaint paint;
        CLMainCashLoanBill currentCashLoanBill;
        CLMainData cLMainData = this.f30266W0;
        boolean z8 = true;
        boolean z10 = ((cLMainData == null || (currentCashLoanBill = cLMainData.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill.getOutstandingAmount()) == 0;
        ProductSubs productSubs = this.Z0;
        t tVar = this.f30289v;
        t tVar2 = this.f30287t0;
        if (productSubs == null) {
            Group group = (Group) tVar.getValue();
            if (group != null) {
                h.s(group, z3);
            }
            TextView textViewV = v();
            if (textViewV != null) {
                h.s(textViewV, !z3);
            }
            ConstraintLayout constraintLayoutZ = z();
            if (constraintLayoutZ != null) {
                h.s(constraintLayoutZ, z10);
            }
            TextView textView = (TextView) tVar2.getValue();
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (cLRepaymentPlanData != null) {
                OneTouchBorrowView2 oneTouchBorrowView2X = x();
                if (oneTouchBorrowView2X != null && (borrowCLInfoView2 = oneTouchBorrowView2X.f30656e) != null) {
                    TextView textView2 = borrowCLInfoView2.f30641o;
                    if (textView2 != null) {
                        Long serviceFeeSum = cLRepaymentPlanData.getServiceFeeSum();
                        textView2.setText(r0.F(serviceFeeSum != null ? serviceFeeSum.longValue() : 0L));
                    }
                    LinearLayout linearLayout4 = borrowCLInfoView2.f30636e;
                    if (linearLayout4 != null) {
                        Long serviceFeeSum2 = cLRepaymentPlanData.getServiceFeeSum();
                        h.s(linearLayout4, (serviceFeeSum2 != null ? serviceFeeSum2.longValue() : 0L) > 0);
                    }
                    TextView textView3 = borrowCLInfoView2.f30640j;
                    if (textView3 != null) {
                        Long interestSum = cLRepaymentPlanData.getInterestSum();
                        textView3.setText(r0.F(interestSum != null ? interestSum.longValue() : 0L));
                    }
                    TextView textView4 = borrowCLInfoView2.f30639i;
                    if (textView4 != null) {
                        h.s(textView4, !Intrinsics.c(cLRepaymentPlanData.getOriginInterestSum(), cLRepaymentPlanData.getInterestSum()));
                    }
                    TextView textView5 = borrowCLInfoView2.f30639i;
                    if (textView5 != null) {
                        Long originInterestSum = cLRepaymentPlanData.getOriginInterestSum();
                        textView5.setText(r0.F(originInterestSum != null ? originInterestSum.longValue() : 0L));
                    }
                    TextView textView6 = borrowCLInfoView2.f30639i;
                    if (textView6 != null && (paint = textView6.getPaint()) != null) {
                        paint.setFlags(17);
                    }
                    LinearLayout linearLayout5 = borrowCLInfoView2.f30637f;
                    if (linearLayout5 != null) {
                        Long stampDuty = cLRepaymentPlanData.getStampDuty();
                        h.s(linearLayout5, (stampDuty != null ? stampDuty.longValue() : 0L) > 0);
                    }
                    TextView textView7 = borrowCLInfoView2.f30643v;
                    if (textView7 != null) {
                        Long stampDuty2 = cLRepaymentPlanData.getStampDuty();
                        textView7.setText(r0.F(stampDuty2 != null ? stampDuty2.longValue() : 0L));
                    }
                    LinearLayout linearLayout6 = borrowCLInfoView2.f30634c;
                    if (linearLayout6 != null && linearLayout6.getVisibility() == 0 && (linearLayout = borrowCLInfoView2.f30637f) != null && linearLayout.getVisibility() == 0 && (linearLayout2 = borrowCLInfoView2.f30636e) != null && linearLayout2.getVisibility() == 0 && (linearLayout3 = borrowCLInfoView2.f30638g) != null && linearLayout3.getVisibility() == 0) {
                        LinearLayout linearLayout7 = borrowCLInfoView2.f30634c;
                        if (linearLayout7 != null) {
                            linearLayout7.setGravity(8388611);
                        }
                        LinearLayout linearLayout8 = borrowCLInfoView2.f30636e;
                        if (linearLayout8 != null) {
                            linearLayout8.setGravity(8388611);
                        }
                        LinearLayout linearLayout9 = borrowCLInfoView2.f30637f;
                        if (linearLayout9 != null) {
                            linearLayout9.setGravity(8388611);
                        }
                        LinearLayout linearLayout10 = borrowCLInfoView2.f30638g;
                        if (linearLayout10 != null) {
                            linearLayout10.setGravity(8388611);
                        }
                        TextView textView8 = borrowCLInfoView2.f30639i;
                        if (textView8 != null && textView8.getVisibility() == 0) {
                            LinearLayout linearLayout11 = borrowCLInfoView2.f30635d;
                            if (linearLayout11 != null) {
                                linearLayout11.setOrientation(1);
                            }
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams.topMargin = SizeUtils.dp2px(66.0f);
                            RelativeLayout relativeLayout = borrowCLInfoView2.f30644w;
                            if (relativeLayout != null) {
                                relativeLayout.setLayoutParams(layoutParams);
                            }
                        }
                        LinearLayout linearLayout12 = borrowCLInfoView2.f30638g;
                        if (linearLayout12 != null) {
                            linearLayout12.setPadding(SizeUtils.dp2px(10.0f), linearLayout12.getPaddingTop(), linearLayout12.getPaddingRight(), linearLayout12.getPaddingBottom());
                        }
                    }
                    TextView textView9 = borrowCLInfoView2.t;
                    if (textView9 != null) {
                        h.l(new c(7, borrowCLInfoView2, cLRepaymentPlanData), textView9);
                    }
                }
                OneTouchBorrowView2 oneTouchBorrowView2X2 = x();
                if (oneTouchBorrowView2X2 != null) {
                    oneTouchBorrowView2X2.setOneTouchBorrowListener(new C2167j(this, cLRepaymentPlanData));
                }
            }
        } else {
            Group group2 = (Group) tVar.getValue();
            if (group2 != null) {
                h.s(group2, false);
            }
            TextView textViewV2 = v();
            if (textViewV2 != null) {
                h.s(textViewV2, true);
            }
            CLMultipleCashProductView cLMultipleCashProductView = (CLMultipleCashProductView) this.f30259P0.getValue();
            if (cLMultipleCashProductView != null) {
                h.s(cLMultipleCashProductView, z3);
            }
            ConstraintLayout constraintLayoutZ2 = z();
            if (constraintLayoutZ2 != null) {
                h.s(constraintLayoutZ2, !z3 && z10);
            }
            TextView textView10 = (TextView) tVar2.getValue();
            if (textView10 != null) {
                textView10.setVisibility(8);
            }
            TextView textView11 = (TextView) this.f30251J0.getValue();
            if (textView11 != null) {
                textView11.setVisibility(z10 ? 0 : 8);
            }
        }
        TextView textView12 = (TextView) tVar2.getValue();
        if (textView12 != null) {
            InstallmentLoanMainPageData installmentLoanMainPageData3 = this.f30268X0;
            if (installmentLoanMainPageData3 == null || (((applyStatus = installmentLoanMainPageData3.getApplyStatus()) != null && applyStatus.intValue() == -1) || (((installmentLoanMainPageData = this.f30268X0) != null && (applyStatus3 = installmentLoanMainPageData.getApplyStatus()) != null && applyStatus3.intValue() == 0) || ((installmentLoanMainPageData2 = this.f30268X0) != null && (applyStatus2 = installmentLoanMainPageData2.getApplyStatus()) != null && applyStatus2.intValue() == 2)))) {
                z8 = false;
            }
            h.s(textView12, z8);
        }
    }

    public final void D(boolean z3) {
        t tVar = this.f30239A0;
        Button button = (Button) tVar.getValue();
        if (button != null) {
            button.setText(getString(z3 ? g.cs_cl_repay : g.cs_cl_repay_before_due));
        }
        Button button2 = (Button) tVar.getValue();
        if (button2 != null) {
            button2.setBackgroundResource(z3 ? d.cs_cl_repay_bt_bg : d.cs_cl_repay_before_bt_bg);
        }
        Button button3 = (Button) tVar.getValue();
        if (button3 != null) {
            button3.setTextColor(requireContext().getColor(z3 ? p.md_white_1000 : b.cs_cl_main_color));
        }
    }

    public final void E() {
        Long repaymentDate;
        Long repaymentDate2;
        Long repaymentDate3;
        Long repaymentDate4;
        Long repaymentDate5;
        CLMainCreditCard creditCard;
        Integer accountStatus;
        boolean z3;
        CLMainCreditCard creditCard2;
        Integer accountStatus2;
        Long repaymentDate6;
        Long repaymentDate7;
        int i7;
        Long repaymentDate8;
        Long repaymentDate9;
        CLMainCashLoanBill currentCashLoanBill;
        Integer loanType;
        Integer extensionTag;
        CLMainCreditCard creditCard3;
        Long allOutstandingAmount;
        if (getContext() != null) {
            CLMainCashLoanBill cLMainCashLoanBill = this.f30270Y0;
            Integer productSubId = cLMainCashLoanBill != null ? cLMainCashLoanBill.getProductSubId() : null;
            t tVar = this.f30293x0;
            if (productSubId != null && productSubId.intValue() == 2) {
                ConstraintLayout constraintLayout = (ConstraintLayout) tVar.getValue();
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                TextView textView = (TextView) this.f30292w0.getValue();
                if (textView != null) {
                    SpanUtils spanUtilsAppend = new SpanUtils().append(getString(g.cs_cl_main_bill_repayment_tip_first));
                    CLMainData cLMainData = this.f30266W0;
                    textView.setText(spanUtilsAppend.append(" " + r0.B((cLMainData == null || (creditCard3 = cLMainData.getCreditCard()) == null || (allOutstandingAmount = creditCard3.getAllOutstandingAmount()) == null) ? 0L : allOutstandingAmount.longValue(), true) + " \n").setBold().append(getString(g.cs_cl_main_bill_repayment_tip_end)).create());
                }
            } else if (productSubId != null && productSubId.intValue() == 3) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar.getValue();
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
            } else {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) tVar.getValue();
                if (constraintLayout3 != null) {
                    constraintLayout3.setVisibility(8);
                }
            }
            CLMainCashLoanBill cLMainCashLoanBill2 = this.f30270Y0;
            t tVar2 = this.f30295z0;
            if (cLMainCashLoanBill2 == null || (extensionTag = cLMainCashLoanBill2.getExtensionTag()) == null || extensionTag.intValue() != 1) {
                TextView textView2 = (TextView) tVar2.getValue();
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                TextView textView3 = (TextView) tVar2.getValue();
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
            CLMainCashLoanBill cLMainCashLoanBill3 = this.f30270Y0;
            t tVar3 = this.f30247G0;
            if (cLMainCashLoanBill3 == null || (loanType = cLMainCashLoanBill3.getLoanType()) == null || loanType.intValue() != 2) {
                TextView textView4 = (TextView) tVar3.getValue();
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            } else {
                TextView textView5 = (TextView) tVar3.getValue();
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
            }
            CLMainData cLMainData2 = this.f30266W0;
            boolean zC = (cLMainData2 == null || (currentCashLoanBill = cLMainData2.getCurrentCashLoanBill()) == null) ? false : Intrinsics.c(currentCashLoanBill.getCurrentCleared(), Boolean.TRUE);
            t tVar4 = this.f30246F0;
            t tVar5 = this.f30250I0;
            t tVar6 = this.f30244D0;
            if (zC) {
                CLMainCashLoanBill cLMainCashLoanBill4 = this.f30270Y0;
                long jLongValue = (cLMainCashLoanBill4 == null || (repaymentDate9 = cLMainCashLoanBill4.getRepaymentDate()) == null) ? 0L : repaymentDate9.longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(jLongValue));
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                long jFloor = (long) Math.floor((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / ((double) 86400000));
                int i10 = (int) jFloor;
                String string = getString(i10 == 1 ? g.tv_day : g.tv_days_lower);
                Intrinsics.e(string);
                TextView textView6 = (TextView) tVar5.getValue();
                if (textView6 != null) {
                    textView6.setText(getString(g.cs_cl_next_payment));
                }
                TextView textView7 = (TextView) this.f30245E0.getValue();
                if (textView7 != null) {
                    textView7.setText(getString(g.cs_cl_repayment_date));
                }
                TextView textView8 = (TextView) tVar6.getValue();
                if (textView8 != null) {
                    int i11 = g.cs_cl_bottom_repayment_date_tv;
                    CLMainCashLoanBill cLMainCashLoanBill5 = this.f30270Y0;
                    textView8.setText(getString(i11, r0.X1(Long.valueOf((cLMainCashLoanBill5 == null || (repaymentDate8 = cLMainCashLoanBill5.getRepaymentDate()) == null) ? 0L : repaymentDate8.longValue()), "MMM dd")));
                }
                TextView textView9 = (TextView) tVar4.getValue();
                if (textView9 != null) {
                    CLMainCashLoanBill cLMainCashLoanBill6 = this.f30270Y0;
                    long outstandingAmount = cLMainCashLoanBill6 != null ? cLMainCashLoanBill6.getOutstandingAmount() : 0L;
                    i7 = 1;
                    textView9.setText(r0.B(outstandingAmount, true));
                } else {
                    i7 = 1;
                }
                if (i10 == i7) {
                    D(false);
                    TextView textViewA = A();
                    if (textViewA != null) {
                        textViewA.setVisibility(0);
                    }
                    TextView textViewW = w();
                    if (textViewW != null) {
                        textViewW.setVisibility(0);
                    }
                    TextView textViewW2 = w();
                    if (textViewW2 != null) {
                        textViewW2.setText(getString(g.tv_text_due_tomorrow));
                    }
                    TextView textViewW3 = w();
                    if (textViewW3 != null) {
                        textViewW3.setTextColor(requireContext().getColor(L6.b.ppColorError));
                    }
                    TextView textViewA2 = A();
                    if (textViewA2 != null) {
                        textViewA2.setTextColor(requireContext().getColor(L6.b.ppColorError));
                    }
                    TextView textViewA3 = A();
                    if (textViewA3 != null) {
                        textViewA3.setCompoundDrawablesWithIntrinsicBounds(d.cs_cl_open_failed_warn_icon, 0, 0, 0);
                    }
                    TextView textViewA4 = A();
                    if (textViewA4 != null) {
                        textViewA4.setBackgroundColor(requireContext().getColor(b.cv_color_F7E6EA));
                    }
                    TextView textViewA5 = A();
                    if (textViewA5 != null) {
                        textViewA5.setText("Your bill is " + jFloor + " " + string + " overde,repay as soon as possible");
                        return;
                    }
                    return;
                }
                if (2 > i10 || i10 >= 4) {
                    D(true);
                    TextView textViewA6 = A();
                    if (textViewA6 != null) {
                        textViewA6.setVisibility(8);
                    }
                    TextView textViewW4 = w();
                    if (textViewW4 != null) {
                        textViewW4.setVisibility(8);
                        return;
                    }
                    return;
                }
                D(false);
                TextView textViewA7 = A();
                if (textViewA7 != null) {
                    textViewA7.setVisibility(0);
                }
                TextView textViewW5 = w();
                if (textViewW5 != null) {
                    textViewW5.setVisibility(0);
                }
                TextView textViewW6 = w();
                if (textViewW6 != null) {
                    textViewW6.setText(getString(g.cs_cl_repayment_left_days, Long.valueOf(jFloor)));
                }
                TextView textViewW7 = w();
                if (textViewW7 != null) {
                    textViewW7.setTextColor(requireContext().getColor(p.cv_color_ffaa0c));
                }
                TextView textViewA8 = A();
                if (textViewA8 != null) {
                    textViewA8.setTextColor(requireContext().getColor(L6.b.ppColorWarning));
                }
                TextView textViewA9 = A();
                if (textViewA9 != null) {
                    textViewA9.setCompoundDrawablesWithIntrinsicBounds(d.cs_cl_install_pt_tips_icon, 0, 0, 0);
                }
                TextView textViewA10 = A();
                if (textViewA10 != null) {
                    textViewA10.setBackgroundColor(requireContext().getColor(b.cv_color_FFECD2));
                }
                TextView textViewA11 = A();
                if (textViewA11 != null) {
                    textViewA11.setText(getString(g.cs_cl_nearly_days_tip, Long.valueOf(jFloor)));
                    return;
                }
                return;
            }
            TextView textView10 = (TextView) tVar5.getValue();
            if (textView10 != null) {
                textView10.setText(getString(g.cs_outstanding_bill));
            }
            t tVar7 = this.f30249H0;
            TextView textView11 = (TextView) tVar7.getValue();
            if (textView11 != null) {
                textView11.setVisibility(8);
            }
            TextView textView12 = (TextView) tVar4.getValue();
            if (textView12 != null) {
                CLMainCashLoanBill cLMainCashLoanBill7 = this.f30270Y0;
                textView12.setText(r0.B(cLMainCashLoanBill7 != null ? cLMainCashLoanBill7.getOutstandingAmount() : 0L, true));
            } else {
                tVar4 = tVar4;
            }
            CLMainData cLMainData3 = this.f30266W0;
            if (cLMainData3 != null && (creditCard = cLMainData3.getCreditCard()) != null && (accountStatus = creditCard.getAccountStatus()) != null && accountStatus.intValue() == 1) {
                TextView textView13 = (TextView) tVar5.getValue();
                if (textView13 != null) {
                    textView13.setText(getString(g.cs_outstanding_bill));
                }
                TextView textView14 = (TextView) tVar7.getValue();
                if (textView14 != null) {
                    textView14.setVisibility(8);
                }
                TextView textView15 = (TextView) tVar4.getValue();
                if (textView15 != null) {
                    CLMainCashLoanBill cLMainCashLoanBill8 = this.f30270Y0;
                    z3 = true;
                    textView15.setText(r0.B(cLMainCashLoanBill8 != null ? cLMainCashLoanBill8.getOutstandingAmount() : 0L, true));
                } else {
                    z3 = true;
                }
                D(z3);
                CLMainData cLMainData4 = this.f30266W0;
                if (cLMainData4 == null || (creditCard2 = cLMainData4.getCreditCard()) == null || (accountStatus2 = creditCard2.getAccountStatus()) == null || accountStatus2.intValue() != z3) {
                    return;
                }
                TextView textViewA12 = A();
                if (textViewA12 != null) {
                    textViewA12.setVisibility(0);
                }
                TextView textViewA13 = A();
                if (textViewA13 != null) {
                    textViewA13.setTextColor(requireContext().getColor(L6.b.ppColorError));
                }
                TextView textViewA14 = A();
                if (textViewA14 != null) {
                    textViewA14.setCompoundDrawablesWithIntrinsicBounds(d.cs_cl_open_failed_warn_icon, 0, 0, 0);
                }
                TextView textViewA15 = A();
                if (textViewA15 != null) {
                    textViewA15.setBackgroundColor(requireContext().getColor(b.cv_color_F7E6EA));
                }
                CLMainCashLoanBill cLMainCashLoanBill9 = this.f30270Y0;
                long jLongValue2 = (cLMainCashLoanBill9 == null || (repaymentDate7 = cLMainCashLoanBill9.getRepaymentDate()) == null) ? 0L : repaymentDate7.longValue();
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTime(new Date(jLongValue2));
                calendar3.set(11, 0);
                calendar3.set(12, 0);
                calendar3.set(13, 0);
                calendar3.set(14, 0);
                Calendar calendar4 = Calendar.getInstance();
                calendar4.set(11, 0);
                calendar4.set(12, 0);
                long jC = (q0.c(calendar4, 13, 0, 14, 0) - calendar3.getTimeInMillis()) / ((long) 86400000);
                String string2 = getString(((int) jC) == 1 ? g.tv_day : g.tv_days_lower);
                Intrinsics.e(string2);
                TextView textViewA16 = A();
                if (textViewA16 != null) {
                    textViewA16.setText("Your bill is " + jC + " " + string2 + " overde,repay as soon as possible");
                }
                TextView textView16 = (TextView) tVar6.getValue();
                if (textView16 != null) {
                    int i12 = g.cs_cl_bottom_repayment_date_tv;
                    CLMainCashLoanBill cLMainCashLoanBill10 = this.f30270Y0;
                    textView16.setText(getString(i12, r0.X1(Long.valueOf((cLMainCashLoanBill10 == null || (repaymentDate6 = cLMainCashLoanBill10.getRepaymentDate()) == null) ? 0L : repaymentDate6.longValue()), "MMM dd")));
                }
                TextView textViewW8 = w();
                if (textViewW8 != null) {
                    textViewW8.setVisibility(0);
                }
                TextView textViewW9 = w();
                if (textViewW9 != null) {
                    G.w(requireContext(), b.cs_overdue_txt_color, d0.k(" ", string2, " overdue. Auto-debit is taking place", new SpanUtils().append(String.valueOf(jC)).setForegroundColor(requireContext().getColor(b.cs_overdue_txt_color)).setBold()), textViewW9);
                }
                TextView textViewW10 = w();
                if (textViewW10 != null) {
                    textViewW10.setTextColor(requireContext().getColor(L6.b.ppColorError));
                }
                TextView textViewW11 = w();
                if (textViewW11 != null) {
                    textViewW11.setBackgroundResource(d.cs_btn_overdue_state_2);
                    return;
                }
                return;
            }
            CLMainCashLoanBill cLMainCashLoanBill11 = this.f30270Y0;
            long jLongValue3 = (cLMainCashLoanBill11 == null || (repaymentDate5 = cLMainCashLoanBill11.getRepaymentDate()) == null) ? 0L : repaymentDate5.longValue();
            Calendar calendar5 = Calendar.getInstance();
            calendar5.setTime(new Date(jLongValue3));
            calendar5.set(11, 0);
            calendar5.set(12, 0);
            calendar5.set(13, 0);
            calendar5.set(14, 0);
            Calendar calendar6 = Calendar.getInstance();
            calendar6.set(11, 0);
            calendar6.set(12, 0);
            calendar6.set(13, 0);
            calendar6.set(14, 0);
            long jFloor2 = (long) Math.floor((calendar5.getTimeInMillis() - calendar6.getTimeInMillis()) / ((double) 86400000));
            CLMainCashLoanBill cLMainCashLoanBill12 = this.f30270Y0;
            if (DateUtils.isToday((cLMainCashLoanBill12 == null || (repaymentDate4 = cLMainCashLoanBill12.getRepaymentDate()) == null) ? 0L : repaymentDate4.longValue())) {
                TextView textView17 = (TextView) tVar6.getValue();
                if (textView17 != null) {
                    int i13 = g.cs_cl_bottom_repayment_date_tv;
                    CLMainCashLoanBill cLMainCashLoanBill13 = this.f30270Y0;
                    textView17.setText(getString(i13, r0.X1(Long.valueOf((cLMainCashLoanBill13 == null || (repaymentDate3 = cLMainCashLoanBill13.getRepaymentDate()) == null) ? 0L : repaymentDate3.longValue()), "MMM dd")));
                }
                TextView textViewW12 = w();
                if (textViewW12 != null) {
                    textViewW12.setVisibility(0);
                }
                TextView textViewW13 = w();
                if (textViewW13 != null) {
                    textViewW13.setText("Due today");
                }
                TextView textViewW14 = w();
                if (textViewW14 != null) {
                    textViewW14.setTextColor(requireContext().getColor(L6.b.ppColorError));
                }
                TextView textViewA17 = A();
                if (textViewA17 != null) {
                    textViewA17.setVisibility(0);
                }
                TextView textViewA18 = A();
                if (textViewA18 != null) {
                    textViewA18.setTextColor(requireContext().getColor(L6.b.ppColorError));
                }
                TextView textViewA19 = A();
                if (textViewA19 != null) {
                    textViewA19.setCompoundDrawablesWithIntrinsicBounds(d.cs_cl_open_failed_warn_icon, 0, 0, 0);
                }
                TextView textViewA20 = A();
                if (textViewA20 != null) {
                    textViewA20.setBackgroundColor(requireContext().getColor(b.cv_color_F7E6EA));
                }
                TextView textViewA21 = A();
                if (textViewA21 != null) {
                    textViewA21.setText(getString(g.cs_cl_main_bill_today_tips));
                    return;
                }
                return;
            }
            if (jFloor2 > 3) {
                D(false);
                TextView textView18 = (TextView) tVar6.getValue();
                if (textView18 != null) {
                    int i14 = g.cs_cl_bottom_repayment_date_tv;
                    CLMainCashLoanBill cLMainCashLoanBill14 = this.f30270Y0;
                    textView18.setText(getString(i14, r0.X1(Long.valueOf((cLMainCashLoanBill14 == null || (repaymentDate = cLMainCashLoanBill14.getRepaymentDate()) == null) ? 0L : repaymentDate.longValue()), "MMM dd")));
                    return;
                }
                return;
            }
            TextView textViewA22 = A();
            if (textViewA22 != null) {
                textViewA22.setVisibility(0);
            }
            TextView textViewW15 = w();
            if (textViewW15 != null) {
                textViewW15.setVisibility(0);
            }
            TextView textViewW16 = w();
            if (textViewW16 != null) {
                textViewW16.setText(getString(((int) jFloor2) == 1 ? g.tv_text_due_tomorrow : g.cs_cl_repayment_left_days, Long.valueOf(jFloor2)));
            }
            TextView textView19 = (TextView) tVar6.getValue();
            if (textView19 != null) {
                int i15 = g.cs_cl_bottom_repayment_date_tv;
                CLMainCashLoanBill cLMainCashLoanBill15 = this.f30270Y0;
                textView19.setText(getString(i15, r0.X1(Long.valueOf((cLMainCashLoanBill15 == null || (repaymentDate2 = cLMainCashLoanBill15.getRepaymentDate()) == null) ? 0L : repaymentDate2.longValue()), "MMM dd")));
            }
            TextView textViewW17 = w();
            if (textViewW17 != null) {
                textViewW17.setTextColor(requireContext().getColor(L6.b.ppColorWarning));
            }
            TextView textViewA23 = A();
            if (textViewA23 != null) {
                textViewA23.setTextColor(requireContext().getColor(L6.b.ppColorWarning));
            }
            TextView textViewA24 = A();
            if (textViewA24 != null) {
                textViewA24.setCompoundDrawablesWithIntrinsicBounds(d.cs_cl_install_pt_tips_icon, 0, 0, 0);
            }
            TextView textViewA25 = A();
            if (textViewA25 != null) {
                textViewA25.setBackgroundColor(requireContext().getColor(b.cv_color_FFECD2));
            }
            TextView textViewA26 = A();
            if (textViewA26 != null) {
                textViewA26.setText(getString(((int) jFloor2) > 1 ? g.cs_cl_nearly_days_tip : g.cs_cl_one_days_tip, Long.valueOf(jFloor2)));
            }
        }
    }

    public final void F(Long l5, SpannableStringBuilder spannableStringBuilder, boolean z3) {
        CLMainCreditCard creditCard;
        if (getContext() != null) {
            TextView textView = (TextView) this.f30271Z.getValue();
            long jLongValue = 0;
            if (textView != null) {
                textView.setText(r0.F(l5 != null ? l5.longValue() : 0L));
            }
            TextView textView2 = (TextView) this.f30257N0.getValue();
            if (textView2 != null) {
                textView2.setText(r0.F(l5 != null ? l5.longValue() : 0L));
            }
            CLMainData cLMainData = this.f30266W0;
            Long tempQuota = (cLMainData == null || (creditCard = cLMainData.getCreditCard()) == null) ? null : creditCard.getTempQuota();
            TextView textView3 = (TextView) this.f30253L.getValue();
            if (textView3 != null) {
                if (tempQuota != null) {
                    Long lValueOf = l5 != null ? Long.valueOf(l5.longValue() - tempQuota.longValue()) : null;
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    }
                }
                textView3.setText(r0.B(jLongValue, true));
            }
            TextView textView4 = (TextView) this.f30248H.getValue();
            if (textView4 != null) {
                textView4.setText(spannableStringBuilder);
            }
            if (z3) {
                TextView textViewV = v();
                if (textViewV != null) {
                    textViewV.setText(getString(g.cs_cl_activating));
                }
                TextView textViewV2 = v();
                if (textViewV2 != null) {
                    textViewV2.setBackgroundResource(d.cs_cl_applying_txt_bg);
                    return;
                }
                return;
            }
            CLMainData cLMainData2 = this.f30266W0;
            boolean zC = Intrinsics.c(cLMainData2 != null ? cLMainData2.getUserTag() : null, CLMainData.CL_STATUS_RE_ACTIVE);
            t tVar = this.f30284q0;
            if (zC) {
                TextView textViewV3 = v();
                if (textViewV3 != null) {
                    textViewV3.setText(getString(g.cs_cl_apply));
                }
                TextView textView5 = (TextView) tVar.getValue();
                if (textView5 != null) {
                    textView5.setText(getString(g.cs_cl_loan_period_up_to));
                }
            } else {
                TextView textViewV4 = v();
                if (textViewV4 != null) {
                    textViewV4.setText(getString(g.cs_cl_borrow_now));
                }
                TextView textView6 = (TextView) tVar.getValue();
                if (textView6 != null) {
                    textView6.setText(getString(g.cs_cl_loan_period));
                }
            }
            TextView textViewV5 = v();
            if (textViewV5 != null) {
                textViewV5.setBackgroundResource(p116hb.b.cs_cl_borrow_txt_bg);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:446:0x0878  */
    /* JADX WARN: Code duplicated, block: B:449:0x0889  */
    /* JADX WARN: Code duplicated, block: B:452:0x089a  */
    /* JADX WARN: Code duplicated, block: B:462:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:474:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:477:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:479:0x08fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:480:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:481:0x090a  */
    /* JADX WARN: Code duplicated, block: B:505:0x094f  */
    /* JADX WARN: Code duplicated, block: B:511:0x0961  */
    /* JADX WARN: Code duplicated, block: B:514:0x0969  */
    /* JADX WARN: Code duplicated, block: B:517:0x097e  */
    /* JADX WARN: Code duplicated, block: B:520:0x0989  */
    /* JADX WARN: Code duplicated, block: B:523:0x099f  */
    /* JADX WARN: Code duplicated, block: B:525:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:534:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:538:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:540:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:549:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:553:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:555:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:558:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:562:0x0a10  */
    /* JADX WARN: Code duplicated, block: B:565:0x0a25  */
    /* JADX WARN: Code duplicated, block: B:568:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:576:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:623:0x0aea  */
    /* JADX WARN: Code duplicated, block: B:626:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:629:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:632:0x0b11  */
    /* JADX WARN: Code duplicated, block: B:643:0x0917 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[RETURN, SYNTHETIC] */
    public final void G() {
        CLMainData cLMainData;
        long j6;
        CLMainData cLMainData2;
        Long exampleLoanDailyAmount;
        Long exampleAmount;
        CLMainCashLoanBill currentCashLoanBill;
        Integer productSubId;
        CLMainData cLMainData3;
        Long exampleLoanDailyAmount2;
        Long exampleAmount2;
        CLMainCashLoanBill currentCashLoanBill2;
        Integer productSubId2;
        CLMainData cLMainData4;
        Long exampleLoanDailyAmount3;
        Long exampleAmount3;
        CLMainCashLoanBill currentCashLoanBill3;
        Integer productSubId3;
        Integer productSubId4;
        String string;
        String str;
        List<ProductSubs> productSubs;
        ProductSubs productSubs2;
        String str2;
        String str3;
        String singleDays;
        Long exampleLoanDailyAmount4;
        Long exampleAmount4;
        List<ProductSubs> productSubs3;
        ProductSubs productSubs4;
        Long exampleLoanDailyAmount5;
        Long exampleAmount5;
        Long exampleLoanDailyAmount6;
        Long exampleAmount6;
        Long exampleLoanDailyAmount7;
        Long exampleAmount7;
        Integer maxInstallmentTerm;
        List<ProductSubs> productSubs5;
        ProductSubs productSubs6;
        Long exampleLoanDailyAmount8;
        Long exampleAmount8;
        CLMainCashLoanBill currentCashLoanBill4;
        Integer applyStatus;
        CLMainConfig config;
        CLMainConfig config2;
        Long exampleLoanDailyAmount9;
        Long exampleAmount9;
        CLMainConfig config3;
        Long exampleLoanDailyAmount10;
        Long exampleAmount10;
        Integer applyStatus2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        t tVar;
        TextView textView;
        int i7;
        CLMainData cLMainData5;
        boolean z3;
        t tVar2;
        TextView[] textViewArr;
        CLMainData cLMainData6;
        CLMainData cLMainData7;
        CLMainCreditCard creditCard;
        Integer accountStatus;
        InstallmentLoanView installmentLoanView;
        InstallmentLoanMainPageData installmentLoanMainPageData;
        long jLongValue;
        t tVar3;
        t tVar4;
        InstallmentLoanMainPageData installmentLoanMainPageData2;
        TextView textView2;
        OneTouchBorrowView2 oneTouchBorrowView2X;
        TextView textViewV;
        TextView textView3;
        InstallmentLoanCardInfo installmentLoanCardInfo;
        Integer accountStatus2;
        InstallmentLoanMainPageData installmentLoanMainPageData3;
        Integer ifJointDebit;
        InstallmentLoanCardInfo installmentLoanCardInfo2;
        Long outStandingAmount;
        CLMainData cLMainData8;
        String strReplace;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        TextView textViewV2;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        CLMainData cLMainData9;
        String accountPrompt;
        CLMainCreditCard creditCard2;
        CLMainData cLMainData10;
        int i10;
        CLMainCreditCard creditCard3;
        Integer accountStatus3;
        CLMainData cLMainData11;
        int i11;
        CLMainCreditCard creditCard4;
        Integer accountStatus4;
        CLMainCreditCard creditCard5;
        TopTipsData accountStatusPrompt;
        CLMainCreditCard creditCard6;
        Integer accountStatus5;
        TextView textView10;
        int color;
        CLMainCreditCard creditCard7;
        Integer accountStatus6;
        CLMainData cLMainData12;
        int i12;
        CLMainCreditCard creditCard8;
        Integer accountStatus7;
        Integer applyStatus3;
        List<ProductSubs> productSubs7;
        CLMainCreditCard creditCard9;
        Long tempQuota;
        CLMainCreditCard creditCard10;
        Long tempQuotaExpirationDate;
        boolean z8;
        CLMainCreditCard creditCard11;
        CLMainCreditCard creditCard12;
        Context context = getContext();
        if (context != null) {
            r0.R1((TextView) this.f30246F0.getValue(), "fonts/PalmPayNum-Bold.ttf");
            TextView textView11 = (TextView) this.f30284q0.getValue();
            if (textView11 != null) {
                textView11.setVisibility(0);
            }
            TextView textViewY = y();
            if (textViewY != null) {
                textViewY.setVisibility(0);
            }
            TextView textView12 = (TextView) this.f30280k0.getValue();
            if (textView12 != null) {
                textView12.setVisibility(0);
            }
            B(false);
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f30269Y.getValue();
            Long creditLimit = null;
            if (constraintLayout != null) {
                CLMainData cLMainData13 = this.f30266W0;
                if (((cLMainData13 == null || (creditCard12 = cLMainData13.getCreditCard()) == null) ? null : creditCard12.getTempQuota()) == null) {
                    z8 = false;
                } else {
                    CLMainData cLMainData14 = this.f30266W0;
                    Long tempQuota2 = (cLMainData14 == null || (creditCard11 = cLMainData14.getCreditCard()) == null) ? null : creditCard11.getTempQuota();
                    Intrinsics.e(tempQuota2);
                    if (tempQuota2.longValue() > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                h.s(constraintLayout, z8);
            }
            CLMainData cLMainData15 = this.f30266W0;
            if (cLMainData15 != null && (creditCard9 = cLMainData15.getCreditCard()) != null && (tempQuota = creditCard9.getTempQuota()) != null) {
                long jLongValue2 = tempQuota.longValue();
                TextView textView13 = (TextView) this.f30267X.getValue();
                if (textView13 != null) {
                    textView13.setText(r0.F(jLongValue2));
                }
                TextView textView14 = (TextView) this.f30255M.getValue();
                if (textView14 != null) {
                    SpannableStringBuilder spannableStringBuilderB = h.B("Limited time: ", null, null, Integer.valueOf(L6.b.ppColorWarning), null, null, null, 1019);
                    CLMainData cLMainData16 = this.f30266W0;
                    textView14.setText(spannableStringBuilderB.append((CharSequence) h.B(u.g((((int) ((((cLMainData16 == null || (creditCard10 = cLMainData16.getCreditCard()) == null || (tempQuotaExpirationDate = creditCard10.getTempQuotaExpirationDate()) == null) ? 0L : tempQuotaExpirationDate.longValue()) - System.currentTimeMillis()) / 1000)) / 86400) + 1, " days"), null, null, Integer.valueOf(L6.b.ppColorWarning), null, "sans-serif-medium", null, ErrorCodes.MALFORMED_URL_EXCEPTION)));
                }
            }
            CLMainData cLMainData17 = this.f30266W0;
            if (cLMainData17 != null && (productSubs7 = cLMainData17.getProductSubs()) != null) {
                for (ProductSubs productSubs8 : productSubs7) {
                    Integer productSubId5 = productSubs8.getProductSubId();
                    if (productSubId5 != null && productSubId5.intValue() == 1) {
                        this.f30272a1 = productSubs8;
                        this.f30274c1 = productSubs8;
                        this.f1 = productSubs8;
                    }
                    Integer productSubId6 = productSubs8.getProductSubId();
                    if (productSubId6 != null && productSubId6.intValue() == 3) {
                        this.f30273b1 = productSubs8;
                        this.f30274c1 = productSubs8;
                        this.f1 = productSubs8;
                    }
                    Integer productSubId7 = productSubs8.getProductSubId();
                    if (productSubId7 != null && productSubId7.intValue() == 2) {
                        this.Z0 = productSubs8;
                        this.f30274c1 = productSubs8;
                    }
                }
            }
            CLMainData cLMainData18 = this.f30266W0;
            t tVar5 = this.f30241B0;
            t tVar6 = this.f30254L0;
            if ((cLMainData18 == null || (applyStatus3 = cLMainData18.getApplyStatus()) == null || applyStatus3.intValue() != -1) && ((cLMainData = this.f30266W0) == null || (applyStatus2 = cLMainData.getApplyStatus()) == null || applyStatus2.intValue() != 2)) {
                CLMainData cLMainData19 = this.f30266W0;
                long jLongValue3 = 30;
                long jLongValue4 = DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;
                if (cLMainData19 == null || (applyStatus = cLMainData19.getApplyStatus()) == null || applyStatus.intValue() != 0) {
                    CLMainData cLMainData20 = this.f30266W0;
                    long outstandingAmount = (cLMainData20 == null || (currentCashLoanBill4 = cLMainData20.getCurrentCashLoanBill()) == null) ? 0L : currentCashLoanBill4.getOutstandingAmount();
                    j6 = 0;
                    t tVar7 = this.f30252K0;
                    if (outstandingAmount == 0) {
                        ConstraintLayout constraintLayoutZ = z();
                        if (constraintLayoutZ != null) {
                            constraintLayoutZ.setVisibility(0);
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar6.getValue();
                        if (constraintLayout2 != null) {
                            constraintLayout2.setVisibility(8);
                        }
                        SingleAdView singleAdView = (SingleAdView) tVar5.getValue();
                        if (singleAdView != null) {
                            singleAdView.setVisibility(8);
                        }
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) tVar7.getValue();
                        if (constraintLayout3 != null) {
                            constraintLayout3.setVisibility(8);
                        }
                        Context context2 = getContext();
                        if (context2 != null) {
                            if (this.Z0 != null) {
                                SpanUtils spanUtilsAppend = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs9 = this.Z0;
                                SpanUtils spanUtilsJ = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.k(" ", r0.F((productSubs9 == null || (exampleAmount8 = productSubs9.getExampleAmount()) == null) ? 10000L : exampleAmount8.longValue()), " ", spanUtilsAppend).setForegroundColor(context2.getColor(b.cs_cl_main_color)).setBold());
                                ProductSubs productSubs10 = this.Z0;
                                SpannableStringBuilder spannableStringBuilderCreate = d0.k(" ", r0.F((productSubs10 == null || (exampleLoanDailyAmount8 = productSubs10.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount8.longValue()), " ", spanUtilsJ).setForegroundColor(context2.getColor(b.cs_cl_main_color)).setBold().create();
                                TextView textViewY2 = y();
                                if (textViewY2 != null) {
                                    CLMainData cLMainData21 = this.f30266W0;
                                    textViewY2.setText(String.valueOf((cLMainData21 == null || (productSubs5 = cLMainData21.getProductSubs()) == null || (productSubs6 = productSubs5.get(0)) == null) ? null : productSubs6.getMaxLoanDay()));
                                }
                                getString(g.cs_cl_installment_name);
                                ProductSubs productSubs11 = this.Z0;
                                Long availableBalance = productSubs11 != null ? productSubs11.getAvailableBalance() : null;
                                int i13 = g.cs_cl_repay_for_month;
                                ProductSubs productSubs12 = this.Z0;
                                getString(i13, Integer.valueOf((productSubs12 == null || (maxInstallmentTerm = productSubs12.getMaxInstallmentTerm()) == null) ? 1 : maxInstallmentTerm.intValue()));
                                u();
                                F(availableBalance, spannableStringBuilderCreate, false);
                            } else if (this.f30272a1 != null) {
                                SpanUtils spanUtilsAppend2 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs13 = this.f30272a1;
                                SpanUtils spanUtilsJ2 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.k(" ", r0.F((productSubs13 == null || (exampleAmount5 = productSubs13.getExampleAmount()) == null) ? 10000L : exampleAmount5.longValue()), " ", spanUtilsAppend2).setForegroundColor(context2.getColor(b.cs_cl_main_color)).setBold());
                                ProductSubs productSubs14 = this.f30272a1;
                                SpannableStringBuilder spannableStringBuilderCreate2 = d0.k(" ", r0.F((productSubs14 == null || (exampleLoanDailyAmount5 = productSubs14.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount5.longValue()), " ", spanUtilsJ2).setForegroundColor(context2.getColor(b.cs_cl_main_color)).setBold().create();
                                getString(g.cs_cl_cash_name);
                                ProductSubs productSubs15 = this.f30272a1;
                                Long availableBalance2 = productSubs15 != null ? productSubs15.getAvailableBalance() : null;
                                getString(g.cs_cl_repay_very_date);
                                u();
                                F(availableBalance2, spannableStringBuilderCreate2, false);
                                TextView textViewY3 = y();
                                if (textViewY3 != null) {
                                    CLMainData cLMainData22 = this.f30266W0;
                                    textViewY3.setText(String.valueOf((cLMainData22 == null || (productSubs3 = cLMainData22.getProductSubs()) == null || (productSubs4 = productSubs3.get(0)) == null) ? null : productSubs4.getMaxLoanDay()));
                                }
                            } else {
                                SpanUtils spanUtilsAppend3 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs16 = this.f30273b1;
                                SpanUtils spanUtilsJ3 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.k(" ", r0.F((productSubs16 == null || (exampleAmount4 = productSubs16.getExampleAmount()) == null) ? 10000L : exampleAmount4.longValue()), " ", spanUtilsAppend3).setForegroundColor(context2.getColor(b.cs_cl_main_color)).setBold());
                                ProductSubs productSubs17 = this.f30273b1;
                                SpannableStringBuilder spannableStringBuilderCreate3 = d0.k(" ", r0.F((productSubs17 == null || (exampleLoanDailyAmount4 = productSubs17.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount4.longValue()), " ", spanUtilsJ3).setForegroundColor(context2.getColor(b.cs_cl_main_color)).setBold().create();
                                ProductSubs productSubs18 = this.f30273b1;
                                List listSplit$default = (productSubs18 == null || (singleDays = productSubs18.getSingleDays()) == null) ? null : StringsKt__StringsKt.split$default(singleDays, new String[]{","}, false, 0, 6, null);
                                String str4 = "0";
                                if ((listSplit$default != null ? listSplit$default.size() : 0) > 1) {
                                    int i14 = g.cs_cl_seven_or_fourteen_days;
                                    if (listSplit$default == null || (str2 = (String) listSplit$default.get(0)) == null) {
                                        str2 = "0";
                                    }
                                    if (listSplit$default != null && (str3 = (String) listSplit$default.get(1)) != null) {
                                        str4 = str3;
                                    }
                                    string = getString(i14, str2, str4);
                                } else {
                                    int i15 = g.cs_cl_short_borrow_days;
                                    if (listSplit$default != null && (str = (String) listSplit$default.get(0)) != null) {
                                        str4 = str;
                                    }
                                    string = getString(i15, str4);
                                }
                                Intrinsics.e(string);
                                TextView textViewY4 = y();
                                if (textViewY4 != null) {
                                    CLMainData cLMainData23 = this.f30266W0;
                                    textViewY4.setText(String.valueOf((cLMainData23 == null || (productSubs = cLMainData23.getProductSubs()) == null || (productSubs2 = productSubs.get(0)) == null) ? null : productSubs2.getMaxLoanDay()));
                                }
                                getString(g.cs_cl_pal_loan);
                                ProductSubs productSubs19 = this.f30273b1;
                                Long availableBalance3 = productSubs19 != null ? productSubs19.getAvailableBalance() : null;
                                u();
                                F(availableBalance3, spannableStringBuilderCreate3, false);
                            }
                            if (this.Z0 != null && this.f30272a1 != null) {
                                SpanUtils spanUtilsAppend4 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs20 = this.f30272a1;
                                SpanUtils spanUtilsJ4 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.k(" ", r0.F((productSubs20 == null || (exampleAmount7 = productSubs20.getExampleAmount()) == null) ? 10000L : exampleAmount7.longValue()), " ", spanUtilsAppend4));
                                ProductSubs productSubs21 = this.f30272a1;
                                spanUtilsJ4.append(" " + r0.F((productSubs21 == null || (exampleLoanDailyAmount7 = productSubs21.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount7.longValue()) + " ").create();
                            }
                            if ((this.Z0 != null || this.f30272a1 != null) && this.f30273b1 != null) {
                                SpanUtils spanUtilsAppend5 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs22 = this.f30273b1;
                                if (productSubs22 != null && (exampleAmount6 = productSubs22.getExampleAmount()) != null) {
                                    jLongValue4 = exampleAmount6.longValue();
                                }
                                SpanUtils spanUtilsJ5 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.k(" ", r0.F(jLongValue4), ",", spanUtilsAppend5));
                                ProductSubs productSubs23 = this.f30273b1;
                                if (productSubs23 != null && (exampleLoanDailyAmount6 = productSubs23.getExampleLoanDailyAmount()) != null) {
                                    jLongValue3 = exampleLoanDailyAmount6.longValue();
                                }
                                spanUtilsJ5.append(" " + r0.F(jLongValue3) + " ").create();
                            }
                        }
                        if (this.Z0 != null) {
                            C(false, null);
                        } else {
                            ProductSubs productSubs24 = this.f1;
                            if (productSubs24 != null && (productSubId4 = productSubs24.getProductSubId()) != null) {
                                p171lb.c.f39296f.getInstance().d(productSubId4.intValue(), 23, this, new C2102t0(this));
                            }
                        }
                    } else {
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) tVar6.getValue();
                        if (constraintLayout4 != null) {
                            constraintLayout4.setVisibility(0);
                        }
                        ConstraintLayout constraintLayoutZ2 = z();
                        if (constraintLayoutZ2 != null) {
                            constraintLayoutZ2.setVisibility(8);
                        }
                        SingleAdView singleAdView2 = (SingleAdView) tVar5.getValue();
                        if (singleAdView2 != null) {
                            singleAdView2.setSlotId(getString(g.cl_main_repay_bt_ad_slot_id));
                        }
                        CLMainData cLMainData24 = this.f30266W0;
                        this.f30270Y0 = cLMainData24 != null ? cLMainData24.getCurrentCashLoanBill() : null;
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) tVar7.getValue();
                        if (constraintLayout5 != null) {
                            constraintLayout5.setVisibility(0);
                        }
                        E();
                        if (getContext() != null) {
                            if (this.Z0 != null && ((cLMainData4 = this.f30266W0) == null || (currentCashLoanBill3 = cLMainData4.getCurrentCashLoanBill()) == null || (productSubId3 = currentCashLoanBill3.getProductSubId()) == null || productSubId3.intValue() != 2)) {
                                SpanUtils spanUtilsAppend6 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs25 = this.Z0;
                                SpanUtils spanUtilsJ6 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.k(" ", r0.F((productSubs25 == null || (exampleAmount3 = productSubs25.getExampleAmount()) == null) ? 10000L : exampleAmount3.longValue()), " ", spanUtilsAppend6));
                                ProductSubs productSubs26 = this.Z0;
                                spanUtilsJ6.append(" " + r0.F((productSubs26 == null || (exampleLoanDailyAmount3 = productSubs26.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount3.longValue()) + " ").create();
                            }
                            if (this.f30272a1 != null && ((cLMainData3 = this.f30266W0) == null || (currentCashLoanBill2 = cLMainData3.getCurrentCashLoanBill()) == null || (productSubId2 = currentCashLoanBill2.getProductSubId()) == null || productSubId2.intValue() != 1)) {
                                SpanUtils spanUtilsAppend7 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs27 = this.f30272a1;
                                SpanUtils spanUtilsJ7 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.j(" ", r0.F((productSubs27 == null || (exampleAmount2 = productSubs27.getExampleAmount()) == null) ? 10000L : exampleAmount2.longValue()), spanUtilsAppend7));
                                ProductSubs productSubs28 = this.f30272a1;
                                spanUtilsJ7.append(" " + r0.F((productSubs28 == null || (exampleLoanDailyAmount2 = productSubs28.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount2.longValue()) + " ").create();
                            }
                            if (this.f30273b1 != null && ((cLMainData2 = this.f30266W0) == null || (currentCashLoanBill = cLMainData2.getCurrentCashLoanBill()) == null || (productSubId = currentCashLoanBill.getProductSubId()) == null || productSubId.intValue() != 3)) {
                                SpanUtils spanUtilsAppend8 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                                ProductSubs productSubs29 = this.f30273b1;
                                if (productSubs29 != null && (exampleAmount = productSubs29.getExampleAmount()) != null) {
                                    jLongValue4 = exampleAmount.longValue();
                                }
                                SpanUtils spanUtilsJ8 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.j(" ", r0.F(jLongValue4), spanUtilsAppend8));
                                ProductSubs productSubs30 = this.f30273b1;
                                if (productSubs30 != null && (exampleLoanDailyAmount = productSubs30.getExampleLoanDailyAmount()) != null) {
                                    jLongValue3 = exampleLoanDailyAmount.longValue();
                                }
                                spanUtilsJ8.append(" " + r0.F(jLongValue3) + " ").create();
                            }
                        }
                        C(false, null);
                    }
                } else {
                    ConstraintLayout constraintLayout6 = (ConstraintLayout) tVar6.getValue();
                    if (constraintLayout6 != null) {
                        constraintLayout6.setVisibility(8);
                    }
                    ConstraintLayout constraintLayoutZ3 = z();
                    if (constraintLayoutZ3 != null) {
                        constraintLayoutZ3.setVisibility(0);
                    }
                    SingleAdView singleAdView3 = (SingleAdView) tVar5.getValue();
                    if (singleAdView3 != null) {
                        singleAdView3.setVisibility(8);
                    }
                    Context context3 = getContext();
                    if (context3 != null) {
                        SpanUtils spanUtilsAppend9 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                        CLMainData cLMainData25 = this.f30266W0;
                        SpanUtils spanUtilsAppend10 = d0.k(" ", r0.F((cLMainData25 == null || (exampleAmount10 = cLMainData25.getExampleAmount()) == null) ? 10000L : exampleAmount10.longValue()), " ", spanUtilsAppend9).setForegroundColor(context3.getColor(b.cs_cl_main_color)).setBold().append(" with lowest to");
                        CLMainData cLMainData26 = this.f30266W0;
                        SpannableStringBuilder spannableStringBuilderCreate4 = d0.k(" ", r0.B((cLMainData26 == null || (exampleLoanDailyAmount10 = cLMainData26.getExampleLoanDailyAmount()) == null) ? 30L : exampleLoanDailyAmount10.longValue(), true), " ", spanUtilsAppend10).setForegroundColor(context3.getColor(b.cs_cl_main_color)).setBold().append(" daily interest").create();
                        if (this.Z0 != null) {
                            getString(g.cs_cl_installment_name);
                            CLMainData cLMainData27 = this.f30266W0;
                            if (cLMainData27 != null && (config3 = cLMainData27.getConfig()) != null) {
                                creditLimit = config3.getCreditLimit();
                            }
                            getString(g.cs_cl_up_to_month);
                            u();
                            F(creditLimit, spannableStringBuilderCreate4, true);
                        } else if (this.f30272a1 != null) {
                            getString(g.cs_cl_cash_name);
                            CLMainData cLMainData28 = this.f30266W0;
                            if (cLMainData28 != null && (config2 = cLMainData28.getConfig()) != null) {
                                creditLimit = config2.getCreditLimit();
                            }
                            getString(g.cs_cl_repay_very_date);
                            u();
                            F(creditLimit, spannableStringBuilderCreate4, true);
                        } else {
                            getString(g.cs_cl_pal_loan);
                            CLMainData cLMainData29 = this.f30266W0;
                            if (cLMainData29 != null && (config = cLMainData29.getConfig()) != null) {
                                creditLimit = config.getCreditLimit();
                            }
                            getString(g.cs_cl_up_to_fourteen_day);
                            u();
                            F(creditLimit, spannableStringBuilderCreate4, true);
                        }
                        SpanUtils spanUtilsAppend11 = new SpanUtils().append(getString(g.cs_cl_card_interest_borrow));
                        CLMainData cLMainData30 = this.f30266W0;
                        if (cLMainData30 != null && (exampleAmount9 = cLMainData30.getExampleAmount()) != null) {
                            jLongValue4 = exampleAmount9.longValue();
                        }
                        SpanUtils spanUtilsJ9 = d0.j(" ", getString(g.cs_cs_cl_card_interest_amount), d0.k(" ", r0.F(jLongValue4), " ", spanUtilsAppend11));
                        CLMainData cLMainData31 = this.f30266W0;
                        if (cLMainData31 != null && (exampleLoanDailyAmount9 = cLMainData31.getExampleLoanDailyAmount()) != null) {
                            jLongValue3 = exampleLoanDailyAmount9.longValue();
                        }
                        spanUtilsJ9.append(" " + r0.F(jLongValue3) + " ").create();
                    }
                }
                this.f30276g1 = new B(context, this.f30275e1);
                t tVar8 = this.f30281o;
                recyclerView = (RecyclerView) tVar8.getValue();
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new GridLayoutManager(context, 4, 1, false));
                }
                recyclerView2 = (RecyclerView) tVar8.getValue();
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(this.f30276g1);
                }
                tVar = this.f30261Q0;
                textView = (TextView) tVar.getValue();
                if (textView != null) {
                    cLMainData12 = this.f30266W0;
                    if (cLMainData12 != null || (creditCard8 = cLMainData12.getCreditCard()) == null || (accountStatus7 = creditCard8.getAccountStatus()) == null || accountStatus7.intValue() != 4) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    textView.setVisibility(i12);
                }
                cLMainData5 = this.f30266W0;
                if (cLMainData5 != null || (creditCard7 = cLMainData5.getCreditCard()) == null || (accountStatus6 = creditCard7.getAccountStatus()) == null || accountStatus6.intValue() != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                TextView textView15 = (TextView) this.f30286s0.getValue();
                TextView textView16 = (TextView) this.f30271Z.getValue();
                TextView textView17 = (TextView) this.f30257N0.getValue();
                tVar2 = this.f30248H;
                textViewArr = new TextView[]{textView15, textView16, textView17, (TextView) tVar2.getValue()};
                for (i7 = 0; i7 < 4; i7++) {
                    textView10 = textViewArr[i7];
                    if (textView10 == null) {
                        if (z3) {
                            color = requireContext().getColor(L6.b.ppColorTextDisable);
                        } else {
                            color = requireContext().getColor(b.cs_color_amount);
                        }
                        textView10.setTextColor(color);
                    }
                }
                cLMainData6 = this.f30266W0;
                if ((cLMainData6 == null && (creditCard6 = cLMainData6.getCreditCard()) != null && (accountStatus5 = creditCard6.getAccountStatus()) != null && accountStatus5.intValue() == 5) || ((cLMainData7 = this.f30266W0) != null && (creditCard = cLMainData7.getCreditCard()) != null && (accountStatus = creditCard.getAccountStatus()) != null && accountStatus.intValue() == 4)) {
                    cLMainData8 = this.f30266W0;
                    if (cLMainData8 != null || (creditCard5 = cLMainData8.getCreditCard()) == null || (accountStatusPrompt = creditCard5.getAccountStatusPrompt()) == null || (strReplace = accountStatusPrompt.getStatusMsg()) == null) {
                        strReplace = "";
                    }
                    if (m()) {
                        strReplace = new Regex("#202046").replace(strReplace, "#ffffff");
                    }
                    textView4 = (TextView) tVar.getValue();
                    if (textView4 != null) {
                        textView4.setText(strReplace);
                    }
                    textView5 = (TextView) tVar.getValue();
                    if (textView5 != null) {
                        textView5.setText(Html.fromHtml(strReplace, 63));
                    }
                    B(true);
                    textView6 = (TextView) this.f30285r0.getValue();
                    if (textView6 != null) {
                        cLMainData11 = this.f30266W0;
                        if (cLMainData11 != null || (creditCard4 = cLMainData11.getCreditCard()) == null || (accountStatus4 = creditCard4.getAccountStatus()) == null || accountStatus4.intValue() != 4) {
                            i11 = g.cs_disabled;
                        } else {
                            i11 = g.cs_frozen;
                        }
                        textView6.setText(getString(i11));
                    }
                    textViewV2 = v();
                    if (textViewV2 != null) {
                        cLMainData10 = this.f30266W0;
                        if (cLMainData10 != null || (creditCard3 = cLMainData10.getCreditCard()) == null || (accountStatus3 = creditCard3.getAccountStatus()) == null || accountStatus3.intValue() != 4) {
                            i10 = g.cs_cl_apply;
                        } else {
                            i10 = g.tv_cash_main_how_to_forzen;
                        }
                        textViewV2.setText(getString(i10));
                    }
                    textView7 = (TextView) tVar2.getValue();
                    if (textView7 != null) {
                        cLMainData9 = this.f30266W0;
                        if (cLMainData9 != null || (creditCard2 = cLMainData9.getCreditCard()) == null) {
                            accountPrompt = null;
                        } else {
                            accountPrompt = creditCard2.getAccountPrompt();
                        }
                        textView7.setText(accountPrompt);
                    }
                    textView8 = (TextView) tVar2.getValue();
                    if (textView8 != null) {
                        textView8.setTextColor(requireContext().getColor(L6.b.ppColorTextPrimary));
                    }
                    textView9 = (TextView) tVar.getValue();
                    if (textView9 != null) {
                        h.l(new ViewOnClickListenerC2163f(this, 3), textView9);
                    }
                }
                installmentLoanView = (InstallmentLoanView) this.f30256M0.getValue();
                if (installmentLoanView != null) {
                    installmentLoanView.a(this.f30268X0, this.f30266W0);
                }
                installmentLoanMainPageData = this.f30268X0;
                if (installmentLoanMainPageData != null || (installmentLoanCardInfo2 = installmentLoanMainPageData.getInstallmentLoanCardInfo()) == null || (outStandingAmount = installmentLoanCardInfo2.getOutStandingAmount()) == null) {
                    jLongValue = j6;
                } else {
                    jLongValue = outStandingAmount.longValue();
                }
                tVar3 = this.f30240B;
                tVar4 = this.f30291w;
                if (jLongValue <= j6 && (installmentLoanMainPageData3 = this.f30268X0) != null && (ifJointDebit = installmentLoanMainPageData3.getIfJointDebit()) != null && ifJointDebit.intValue() == 0) {
                    TextView textView18 = (TextView) tVar4.getValue();
                    if (textView18 != null) {
                        textView18.setTextColor(Color.parseColor("#99DBD7"));
                    }
                    OneTouchBorrowView2 oneTouchBorrowView2X2 = x();
                    if (oneTouchBorrowView2X2 != null) {
                        oneTouchBorrowView2X2.setBorrowEnable(false);
                    }
                    TextView textViewV3 = v();
                    if (textViewV3 != null) {
                        textViewV3.setEnabled(false);
                    }
                    TextView textView19 = (TextView) tVar3.getValue();
                    if (textView19 != null) {
                        h.s(textView19, true);
                        return;
                    }
                    return;
                }
                installmentLoanMainPageData2 = this.f30268X0;
                if (installmentLoanMainPageData2 != null || (installmentLoanCardInfo = installmentLoanMainPageData2.getInstallmentLoanCardInfo()) == null || (accountStatus2 = installmentLoanCardInfo.getAccountStatus()) == null || accountStatus2.intValue() != 1) {
                    textView2 = (TextView) tVar4.getValue();
                    if (textView2 != null) {
                        textView2.setTextColor(requireContext().getColor(L6.b.ppColorFlexiCashPrimary));
                    }
                    oneTouchBorrowView2X = x();
                    if (oneTouchBorrowView2X != null) {
                        oneTouchBorrowView2X.setBorrowEnable(true);
                    }
                    textViewV = v();
                    if (textViewV != null) {
                        textViewV.setEnabled(true);
                    }
                    textView3 = (TextView) tVar3.getValue();
                    if (textView3 != null) {
                        h.s(textView3, false);
                    }
                }
                TextView textView20 = (TextView) tVar4.getValue();
                if (textView20 != null) {
                    textView20.setTextColor(Color.parseColor("#99DBD7"));
                }
                OneTouchBorrowView2 oneTouchBorrowView2X3 = x();
                if (oneTouchBorrowView2X3 != null) {
                    oneTouchBorrowView2X3.setBorrowEnable(false);
                }
                TextView textViewV4 = v();
                if (textViewV4 != null) {
                    textViewV4.setEnabled(false);
                }
                TextView textView21 = (TextView) tVar3.getValue();
                if (textView21 != null) {
                    h.s(textView21, true);
                    return;
                }
                return;
            }
            ConstraintLayout constraintLayout7 = (ConstraintLayout) tVar6.getValue();
            if (constraintLayout7 != null) {
                constraintLayout7.setVisibility(8);
            }
            ConstraintLayout constraintLayoutZ4 = z();
            if (constraintLayoutZ4 != null) {
                constraintLayoutZ4.setVisibility(8);
            }
            SingleAdView singleAdView4 = (SingleAdView) tVar5.getValue();
            if (singleAdView4 != null) {
                singleAdView4.setVisibility(8);
            }
            j6 = 0;
            this.f30276g1 = new B(context, this.f30275e1);
            t tVar9 = this.f30281o;
            recyclerView = (RecyclerView) tVar9.getValue();
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new GridLayoutManager(context, 4, 1, false));
            }
            recyclerView2 = (RecyclerView) tVar9.getValue();
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f30276g1);
            }
            tVar = this.f30261Q0;
            textView = (TextView) tVar.getValue();
            if (textView != null) {
                cLMainData12 = this.f30266W0;
                if (cLMainData12 != null) {
                    i12 = 8;
                } else {
                    i12 = 8;
                }
                textView.setVisibility(i12);
            }
            cLMainData5 = this.f30266W0;
            if (cLMainData5 != null) {
                z3 = false;
            } else {
                z3 = false;
            }
            TextView textView110 = (TextView) this.f30286s0.getValue();
            TextView textView111 = (TextView) this.f30271Z.getValue();
            TextView textView112 = (TextView) this.f30257N0.getValue();
            tVar2 = this.f30248H;
            textViewArr = new TextView[]{textView110, textView111, textView112, (TextView) tVar2.getValue()};
            while (i7 < 4) {
                textView10 = textViewArr[i7];
                if (textView10 == null) {
                    if (z3) {
                        color = requireContext().getColor(b.cs_color_amount);
                    } else {
                        color = requireContext().getColor(L6.b.ppColorTextDisable);
                    }
                    textView10.setTextColor(color);
                }
            }
            cLMainData6 = this.f30266W0;
            if (cLMainData6 == null) {
                cLMainData8 = this.f30266W0;
                if (cLMainData8 != null) {
                    strReplace = "";
                } else {
                    strReplace = "";
                }
                if (m()) {
                    strReplace = new Regex("#202046").replace(strReplace, "#ffffff");
                }
                textView4 = (TextView) tVar.getValue();
                if (textView4 != null) {
                    textView4.setText(strReplace);
                }
                textView5 = (TextView) tVar.getValue();
                if (textView5 != null) {
                    textView5.setText(Html.fromHtml(strReplace, 63));
                }
                B(true);
                textView6 = (TextView) this.f30285r0.getValue();
                if (textView6 != null) {
                    cLMainData11 = this.f30266W0;
                    if (cLMainData11 != null) {
                        i11 = g.cs_disabled;
                    } else {
                        i11 = g.cs_disabled;
                    }
                    textView6.setText(getString(i11));
                }
                textViewV2 = v();
                if (textViewV2 != null) {
                    cLMainData10 = this.f30266W0;
                    if (cLMainData10 != null) {
                        i10 = g.cs_cl_apply;
                    } else {
                        i10 = g.cs_cl_apply;
                    }
                    textViewV2.setText(getString(i10));
                }
                textView7 = (TextView) tVar2.getValue();
                if (textView7 != null) {
                    cLMainData9 = this.f30266W0;
                    if (cLMainData9 != null) {
                        accountPrompt = null;
                    } else {
                        accountPrompt = null;
                    }
                    textView7.setText(accountPrompt);
                }
                textView8 = (TextView) tVar2.getValue();
                if (textView8 != null) {
                    textView8.setTextColor(requireContext().getColor(L6.b.ppColorTextPrimary));
                }
                textView9 = (TextView) tVar.getValue();
                if (textView9 != null) {
                    h.l(new ViewOnClickListenerC2163f(this, 3), textView9);
                }
            } else {
                cLMainData8 = this.f30266W0;
                if (cLMainData8 != null) {
                    strReplace = "";
                } else {
                    strReplace = "";
                }
                if (m()) {
                    strReplace = new Regex("#202046").replace(strReplace, "#ffffff");
                }
                textView4 = (TextView) tVar.getValue();
                if (textView4 != null) {
                    textView4.setText(strReplace);
                }
                textView5 = (TextView) tVar.getValue();
                if (textView5 != null) {
                    textView5.setText(Html.fromHtml(strReplace, 63));
                }
                B(true);
                textView6 = (TextView) this.f30285r0.getValue();
                if (textView6 != null) {
                    cLMainData11 = this.f30266W0;
                    if (cLMainData11 != null) {
                        i11 = g.cs_disabled;
                    } else {
                        i11 = g.cs_disabled;
                    }
                    textView6.setText(getString(i11));
                }
                textViewV2 = v();
                if (textViewV2 != null) {
                    cLMainData10 = this.f30266W0;
                    if (cLMainData10 != null) {
                        i10 = g.cs_cl_apply;
                    } else {
                        i10 = g.cs_cl_apply;
                    }
                    textViewV2.setText(getString(i10));
                }
                textView7 = (TextView) tVar2.getValue();
                if (textView7 != null) {
                    cLMainData9 = this.f30266W0;
                    if (cLMainData9 != null) {
                        accountPrompt = null;
                    } else {
                        accountPrompt = null;
                    }
                    textView7.setText(accountPrompt);
                }
                textView8 = (TextView) tVar2.getValue();
                if (textView8 != null) {
                    textView8.setTextColor(requireContext().getColor(L6.b.ppColorTextPrimary));
                }
                textView9 = (TextView) tVar.getValue();
                if (textView9 != null) {
                    h.l(new ViewOnClickListenerC2163f(this, 3), textView9);
                }
            }
            installmentLoanView = (InstallmentLoanView) this.f30256M0.getValue();
            if (installmentLoanView != null) {
                installmentLoanView.a(this.f30268X0, this.f30266W0);
            }
            installmentLoanMainPageData = this.f30268X0;
            if (installmentLoanMainPageData != null) {
                jLongValue = j6;
            } else {
                jLongValue = j6;
            }
            tVar3 = this.f30240B;
            tVar4 = this.f30291w;
            if (jLongValue <= j6) {
            }
            installmentLoanMainPageData2 = this.f30268X0;
            if (installmentLoanMainPageData2 != null) {
            }
            textView2 = (TextView) tVar4.getValue();
            if (textView2 != null) {
                textView2.setTextColor(requireContext().getColor(L6.b.ppColorFlexiCashPrimary));
            }
            oneTouchBorrowView2X = x();
            if (oneTouchBorrowView2X != null) {
                oneTouchBorrowView2X.setBorrowEnable(true);
            }
            textViewV = v();
            if (textViewV != null) {
                textViewV.setEnabled(true);
            }
            textView3 = (TextView) tVar3.getValue();
            if (textView3 != null) {
                h.s(textView3, false);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_cl_normal_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        if (i0.W(getActivity()) && isAdded() && getContext() != null) {
            try {
                String string = getString(g.cl_main_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                InterstitialAdView.show$default(new InterstitialAdView(string, 1, new C2025x(19), new org.sufficientlysecure.htmltextview.h(9)), getContext(), null, 2, null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        CLMainViewModel cLMainViewModel = (CLMainViewModel) this.f27333i;
        if (cLMainViewModel != null) {
            p140j8.f.s(cLMainViewModel, new C0342a(1, null), cLMainViewModel.f30890e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        CLMainViewModel cLMainViewModel2 = (CLMainViewModel) this.f27333i;
        l lVar = cLMainViewModel2 != null ? cLMainViewModel2.f30890e : null;
        if (lVar != null) {
            lVar.e(this, new p369yd.e(new p369yd.p(this, 1)));
        }
        CLMainViewModel cLMainViewModel3 = (CLMainViewModel) this.f27333i;
        n.B(this, cLMainViewModel3 != null ? cLMainViewModel3.f30891f : null, this, new C1807o(this, 13), null, true, null, 232);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ImageView rightImageView1;
        String string;
        int i7 = 0;
        int i10 = 1;
        super.o();
        org.greenrobot.eventbus.c.b().j(this);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("source")) != null) {
            if (TextUtils.isEmpty(string)) {
                string = null;
            }
            if (string != null) {
                n0.g().w("credit_main_view_apply_source", F.b(new Pair("element_name", string)));
            }
        }
        E activity = getActivity();
        if (activity != null) {
            BarUtils.setStatusBarLightMode((Activity) activity, true);
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("cl_main_data") : null;
        if (!TextUtils.isEmpty(string2)) {
            this.f30266W0 = (CLMainData) d0.l(CLMainData.class, string2);
        }
        HashMap map = this.d1;
        map.put(2, "CASH_INSTALLMENT_LOAN");
        map.put(1, "CASH_LOAN");
        map.put(3, "CASH_INSTANT_LOAN");
        G();
        r0.l1(r0.y0("cs_main_tab_top_bg.png"), (ImageView) this.f30265V0.getValue());
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) this.T0.getValue());
        SingleAdView singleAdView = (SingleAdView) this.f30279j.getValue();
        Boolean bool = Boolean.FALSE;
        org.chromium.support_lib_boundary.util.b.d(singleAdView, bool);
        t tVar = this.f30263S0;
        org.chromium.support_lib_boundary.util.b.d((MarqueeView) tVar.getValue(), bool);
        MarqueeView marqueeView = (MarqueeView) tVar.getValue();
        if (marqueeView != null) {
            marqueeView.setAdListener(new C2025x(18));
        }
        B b7 = this.f30276g1;
        if (b7 != null) {
            r itemClickListener = new r(this, 27);
            Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            b7.f44156c = itemClickListener;
        }
        t tVar2 = this.f30264U0;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar2.getValue();
        if (ppTitleBar != null) {
            ppTitleBar.setBackButtonClickListener(new ViewOnClickListenerC2163f(this, i7));
        }
        PpTitleBar ppTitleBar2 = (PpTitleBar) tVar2.getValue();
        if (ppTitleBar2 != null && (rightImageView1 = ppTitleBar2.getRightImageView1()) != null) {
            h.l(new h1(14), rightImageView1);
        }
        h.q(new ViewOnClickListenerC2163f(this, i10), (ConstraintLayout) this.t.getValue(), (View) this.f30260Q.getValue(), v(), (TextView) this.f30258O0.getValue(), (TextView) this.f30246F0.getValue(), (Button) this.f30239A0.getValue(), (TextView) this.f30290v0.getValue(), (TextView) this.f30282p.getValue(), (TextView) this.f30294y0.getValue(), (TextView) this.f30291w.getValue());
        InstallmentLoanView installmentLoanView = (InstallmentLoanView) this.f30256M0.getValue();
        if (installmentLoanView != null) {
            installmentLoanView.setOnButtonClickListener(new C2166i(this));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Object objF;
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 4 || eventType != 552) {
            return;
        }
        String str = this.f27317a;
        F6.d.h(str, 3, "handleRnApply >>> ");
        try {
            o oVar = q.f43977a;
            String eventContent = event.getEventContent();
            JSONObject jSONObject = new JSONObject(eventContent);
            F6.d.h(str, 3, "EVENT_OC_RN_LOAN_ROUTE >>> " + eventContent);
            int iOptInt = jSONObject.optInt("productType", 0);
            int iOptInt2 = jSONObject.optInt("shuntType", 0);
            p143jb.g.g(p143jb.g.f38511o.getInstance(), Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2), jSONObject.optString("product", ""), this, jSONObject.optInt("signType", -1), jSONObject.optString("channelEnum", "HOME"), jSONObject.optString("operateType"), MessageEvent.EVENT_GO_TO_PERSON_TRANSFER);
            objF = Unit.f38893a;
        } catch (Throwable th) {
            o oVar2 = q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th);
        }
        Throwable thA = q.a(objF);
        if (thA != null) {
            thA.printStackTrace();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) != null && "M0539".equalsIgnoreCase(pushMessage.content.messageType)) {
            n();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        E activity = getActivity();
        if (activity == null || i7 != 1001) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int length = grantResults.length;
        for (int i10 = 0; i10 < length; i10++) {
            CLPermissionInfo cLPermissionInfo = new CLPermissionInfo(null, 0, 3, null);
            cLPermissionInfo.setName(permissions[i10]);
            if (grantResults[i10] == 0) {
                cLPermissionInfo.setState(1);
            } else if (AbstractC1032a.h(activity, permissions[i10])) {
                cLPermissionInfo.setState(2);
            } else {
                cLPermissionInfo.setState(3);
            }
            arrayList.add(cLPermissionInfo);
        }
        PermissionReq permissionReq = new PermissionReq("flexi cash", "trade", Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()), arrayList);
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().uploadPermissionResult(permissionReq).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2164g(this, 3));
        p143jb.g.f38511o.getInstance().l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        new m(this).a(null);
        p221ob.c.f40268a.getInstance().getClass();
        p221ob.c.a().queryCreditIncrease().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2165h(this));
    }

    public final void t() {
        Integer okCardAccountStatus;
        CLMainCreditCard creditCard;
        Integer accountStatus;
        CLMainData cLMainData = this.f30266W0;
        if (cLMainData != null && (creditCard = cLMainData.getCreditCard()) != null && (accountStatus = creditCard.getAccountStatus()) != null && accountStatus.intValue() == 4) {
            com.palmpay.lib.apm.launchcounter.util.d.F("/credit_score/unfreeze_activity");
            return;
        }
        CLMainData cLMainData2 = this.f30266W0;
        if (cLMainData2 == null || (okCardAccountStatus = cLMainData2.getOkCardAccountStatus()) == null || okCardAccountStatus.intValue() != 1) {
            ProductSubs productSubs = this.f30274c1;
            if (productSubs != null) {
                productSubs.getProductSubId();
            }
            ProductSubs productSubs2 = this.f30274c1;
            if (productSubs2 != null) {
                productSubs2.getAvailableBalance();
                return;
            }
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        int i7 = g.cs_flexi_overdue;
        String string = getString(g.cs_confirm);
        n.O(contextRequireContext, 0, Integer.valueOf(i7), null, Integer.valueOf(d.cs_oc_finance_tip_warn_icon), null, null, getString(g.cs_borrow_when_flexi_bill_overdue), null, string, new ViewOnClickListenerC2163f(this, 2), null, null, null, null, false, 0, 8386933);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[EDGE_INSN: B:25:0x0054->B:26:0x0055 BREAK  A[LOOP:0: B:17:0x0038->B:41:0x0038]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f A[RETURN] */
    public final boolean u() {
        CLMainData cLMainData;
        boolean z3;
        CLMainData cLMainData2;
        int iIntValue;
        CLMainCreditCard creditCard;
        Integer largeLoanTerm;
        CLMainData cLMainData3 = this.f30266W0;
        if (cLMainData3 != null ? Intrinsics.c(cLMainData3.getInstallmentUserA(), Boolean.TRUE) : false) {
            cLMainData = this.f30266W0;
            if (cLMainData != null && cLMainData.getProductSubs() != null) {
                Iterator<ProductSubs> it = cLMainData.getProductSubs().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z3 = false;
                        break;
                    }
                    Integer productSubId = it.next().getProductSubId();
                    if (productSubId != null && productSubId.intValue() == 2) {
                        z3 = true;
                        break;
                    }
                }
            } else {
                z3 = false;
                break;
            }
            if (!z3) {
                cLMainData2 = this.f30266W0;
                if (cLMainData2 != null || (creditCard = cLMainData2.getCreditCard()) == null || (largeLoanTerm = creditCard.getLargeLoanTerm()) == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = largeLoanTerm.intValue();
                }
                if (iIntValue <= 1) {
                    return true;
                }
            }
        } else {
            CLMainData cLMainData4 = this.f30266W0;
            if (cLMainData4 != null ? Intrinsics.c(cLMainData4.getInstallmentUserC(), Boolean.TRUE) : false) {
                cLMainData = this.f30266W0;
                if (cLMainData != null) {
                    z3 = false;
                    break;
                }
                z3 = false;
                break;
                if (!z3) {
                    cLMainData2 = this.f30266W0;
                    if (cLMainData2 != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue <= 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final TextView v() {
        return (TextView) this.f30242C.getValue();
    }

    public final TextView w() {
        return (TextView) this.f30243C0.getValue();
    }

    public final OneTouchBorrowView2 x() {
        return (OneTouchBorrowView2) this.f30238A.getValue();
    }

    public final TextView y() {
        return (TextView) this.f30283p0.getValue();
    }

    public final ConstraintLayout z() {
        return (ConstraintLayout) this.f30288u0.getValue();
    }
}
