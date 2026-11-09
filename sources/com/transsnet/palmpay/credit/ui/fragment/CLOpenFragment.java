package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import C9.C0158z;
import N8.q0;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Ya.e;
import Ya.f;
import Ya.g;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.api.Service;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.horcrux.svg.d0;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.credit.bean.rsp.CLMainConfig;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.bean.rsp.CLMainData;
import com.transsnet.palmpay.credit.bean.rsp.CLMainOkCardBill;
import com.transsnet.palmpay.credit.bean.rsp.CashLoanWhitelistData;
import com.transsnet.palmpay.credit.bean.rsp.ProductSubs;
import com.transsnet.palmpay.credit.interfaces.CLActiveInterface;
import com.transsnet.palmpay.credit.ui.dialog.CLStopOpenDialog;
import com.transsnet.palmpay.credit.ui.dialog.FlexiOverdueDialogFragment;
import com.transsnet.palmpay.credit.ui.fragment.CLOpenFragment;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.sufficientlysecure.htmltextview.h;
import p071ef.b;
import p221ob.c;
import p284sb.C2025x;
import p355xf.C2131j;
import p355xf.t;
import p382zb.C2168k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/CLOpenFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class CLOpenFragment extends BaseFragment {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30296A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public MarqueeView f30297A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30298B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f30299B0 = "CASH_LOAN";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30300C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30301H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30302L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30303M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f30304Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f30305X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f30306Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f30307Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f30308i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30309j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f30310k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30312p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f30313p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f30314q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f30315r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f30316s0;
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final t f30317t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final t f30318u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30319v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final t f30320v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30321w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f30322w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f30323x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f30324y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public CLMainData f30325z0;

    public CLOpenFragment() {
        final int i7 = 0;
        this.f30308i = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i10 = 2;
        this.f30309j = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i11 = 12;
        this.f30311o = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i12 = 13;
        this.f30312p = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i13 = 14;
        this.t = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i14 = 15;
        this.f30319v = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i15 = 16;
        this.f30321w = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i16 = 17;
        this.f30296A = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i17 = 18;
        this.f30298B = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i18 = 19;
        this.f30300C = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i19 = 11;
        this.f30301H = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i20 = 20;
        this.f30302L = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i21 = 21;
        this.f30303M = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i22 = 22;
        this.f30304Q = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i23 = 23;
        this.f30305X = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i24 = 24;
        this.f30306Y = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i25 = 25;
        this.f30307Z = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i26 = 26;
        this.f30310k0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i27 = 27;
        this.f30313p0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i28 = 1;
        this.f30314q0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i29 = 3;
        this.f30315r0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i30 = 4;
        this.f30316s0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i31 = 5;
        this.f30317t0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i31) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i32 = 6;
        this.f30318u0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i33 = 7;
        this.f30320v0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i34 = 8;
        this.f30322w0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i34) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i35 = 9;
        this.f30323x0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i35) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
        final int i36 = 10;
        this.f30324y0 = C2131j.b(new Function0(this) { // from class: zb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenFragment f44600b;

            {
                this.f44600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i36) {
                    case 0:
                        View view = this.f44600b.f27318b;
                        if (view != null) {
                            return (SingleAdView) view.findViewById(e.cl_open_bottom_sav);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44600b.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(e.layoutCurContent);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44600b.f27318b;
                        if (view3 != null) {
                            return (LinearLayout) view3.findViewById(e.bottom_ad_title_ll);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44600b.f27318b;
                        if (view4 != null) {
                            return (TextView) view4.findViewById(e.tvDailyInterestLowRate);
                        }
                        return null;
                    case 4:
                        View view5 = this.f44600b.f27318b;
                        if (view5 != null) {
                            return (TextView) view5.findViewById(e.tvPeriod);
                        }
                        return null;
                    case 5:
                        View view6 = this.f44600b.f27318b;
                        if (view6 != null) {
                            return (TextView) view6.findViewById(e.tvLoanPeriod);
                        }
                        return null;
                    case 6:
                        View view7 = this.f44600b.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(e.tvUpToInstallments);
                        }
                        return null;
                    case 7:
                        View view8 = this.f44600b.f27318b;
                        if (view8 != null) {
                            return (PpTitleBar) view8.findViewById(e.cl_ins_open_mtb);
                        }
                        return null;
                    case 8:
                        View view9 = this.f44600b.f27318b;
                        if (view9 != null) {
                            return (ImageView) view9.findViewById(e.ivBg);
                        }
                        return null;
                    case 9:
                        View view10 = this.f44600b.f27318b;
                        if (view10 != null) {
                            return (ViewStub) view10.findViewById(e.cash_open_stub);
                        }
                        return null;
                    case 10:
                        View view11 = this.f44600b.f27318b;
                        if (view11 != null) {
                            return (ViewStub) view11.findViewById(e.ins_open_stub);
                        }
                        return null;
                    case 11:
                        View view12 = this.f44600b.f27318b;
                        if (view12 != null) {
                            return (ConstraintLayout) view12.findViewById(e.open_card_cl);
                        }
                        return null;
                    case 12:
                        View view13 = this.f44600b.f27318b;
                        if (view13 != null) {
                            return (TextView) view13.findViewById(e.apply_after_date_tv);
                        }
                        return null;
                    case 13:
                        View view14 = this.f44600b.f27318b;
                        if (view14 != null) {
                            return (SingleAdView) view14.findViewById(e.cl_borrow_bt_sav);
                        }
                        return null;
                    case 14:
                        View view15 = this.f44600b.f27318b;
                        if (view15 != null) {
                            return (TextView) view15.findViewById(e.apply_bt_expired_tv);
                        }
                        return null;
                    case 15:
                        View view16 = this.f44600b.f27318b;
                        if (view16 != null) {
                            return (TextView) view16.findViewById(e.cl_open_tv);
                        }
                        return null;
                    case 16:
                        View view17 = this.f44600b.f27318b;
                        if (view17 != null) {
                            return (SingleAdView) view17.findViewById(e.cl_open_sav);
                        }
                        return null;
                    case 17:
                        View view18 = this.f44600b.f27318b;
                        if (view18 != null) {
                            return (TextView) view18.findViewById(e.rate_tv);
                        }
                        return null;
                    case 18:
                        View view19 = this.f44600b.f27318b;
                        if (view19 != null) {
                            return (TextView) view19.findViewById(e.max_amount_tv);
                        }
                        return null;
                    case 19:
                        View view20 = this.f44600b.f27318b;
                        if (view20 != null) {
                            return (Group) view20.findViewById(e.precredit_group);
                        }
                        return null;
                    case 20:
                        View view21 = this.f44600b.f27318b;
                        if (view21 != null) {
                            return (SingleAdView) view21.findViewById(e.cl_open_top_sav);
                        }
                        return null;
                    case 21:
                        View view22 = this.f44600b.f27318b;
                        if (view22 != null) {
                            return (PpTitleBar) view22.findViewById(e.cl_cash_open_mtb);
                        }
                        return null;
                    case 22:
                        View view23 = this.f44600b.f27318b;
                        if (view23 != null) {
                            return (FrameLayout) view23.findViewById(e.normal_open_fl);
                        }
                        return null;
                    case 23:
                        View view24 = this.f44600b.f27318b;
                        if (view24 != null) {
                            return (TextView) view24.findViewById(e.tvLearnMore);
                        }
                        return null;
                    case 24:
                        View view25 = this.f44600b.f27318b;
                        if (view25 != null) {
                            return (RoundedTextView) view25.findViewById(e.rtvUpgradeNow);
                        }
                        return null;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        View view26 = this.f44600b.f27318b;
                        if (view26 != null) {
                            return (ImageView) view26.findViewById(e.iv_upgradeIcon);
                        }
                        return null;
                    case 26:
                        View view27 = this.f44600b.f27318b;
                        if (view27 != null) {
                            return (TextView) view27.findViewById(e.tvCurLoanPeriod);
                        }
                        return null;
                    default:
                        View view28 = this.f44600b.f27318b;
                        if (view28 != null) {
                            return (TextView) view28.findViewById(e.tvCurLoanableAmount);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_cl_open_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        c.f40268a.getInstance().getClass();
        c.a().getCLOpenUserListData().k(p298tf.f.f42629b).i(b.a()).subscribe(new C2168k(this, 1));
        if (i0.W(getActivity()) && isAdded() && getContext() != null) {
            try {
                String string = getString(g.cl_open_pop_slot_id);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                InterstitialAdView.show$default(new InterstitialAdView(string, 1, new C2025x(20), new h(9)), getContext(), null, 2, null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int o() {
        E activity = getActivity();
        if (activity != null) {
            BarUtils.setStatusBarLightMode((Activity) activity, true);
        }
        x();
        if (getContext() != null) {
            CLMainData cLMainData = this.f30325z0;
            if (cLMainData != null ? Intrinsics.c(cLMainData.getInstallmentUserA(), Boolean.TRUE) : false) {
                this.f30299B0 = "CASH_INSTALLMENT_LOAN";
            } else {
                CLMainData cLMainData2 = this.f30325z0;
                if (cLMainData2 != null ? Intrinsics.c(cLMainData2.getInstallmentUserC(), Boolean.TRUE) : false) {
                    this.f30299B0 = "CASH_INSTALLMENT_LOAN";
                } else {
                    CLMainData cLMainData3 = this.f30325z0;
                    if (Intrinsics.c(cLMainData3 != null ? cLMainData3.getCashLoanWhitelist() : null, "1")) {
                        this.f30299B0 = "CASH_LOAN";
                    } else {
                        CLMainData cLMainData4 = this.f30325z0;
                        if (cLMainData4 != null ? Intrinsics.c(cLMainData4.getInstantWhitelist(), Boolean.TRUE) : false) {
                            this.f30299B0 = "CASH_INSTANT_LOAN";
                        }
                    }
                }
            }
        }
        PpTitleBar ppTitleBar = (PpTitleBar) this.f30303M.getValue();
        if (ppTitleBar != null) {
            final int i7 = 0;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: zb.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOpenFragment f44603b;

                {
                    this.f44603b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMainData cLMainData5;
                    CLMainData cLMainData6;
                    CashLoanWhitelistData cashLoanWhitelistData;
                    Integer busiType;
                    CashLoanWhitelistData cashLoanWhitelistData2;
                    Integer busiType2;
                    Integer shuntType;
                    Integer okCardAccountStatus;
                    CLMainCreditCard creditCard;
                    Integer accountStatus;
                    Integer term;
                    CLMainConfig config;
                    Integer termSpan;
                    CLMainConfig config2;
                    CLMainConfig config3;
                    CLMainConfig config4;
                    CLMainConfig config5;
                    CLMainConfig config6;
                    switch (i7) {
                        case 0:
                            CLOpenFragment cLOpenFragment = this.f44603b;
                            E activity2 = cLOpenFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            n0.g().m(cLOpenFragment.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment.f30299B0);
                            break;
                        case 1:
                            CLOpenFragment cLOpenFragment2 = this.f44603b;
                            E activity3 = cLOpenFragment2.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            n0.g().m(cLOpenFragment2.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment2.f30299B0);
                            break;
                        case 2:
                            CLOpenFragment cLOpenFragment3 = this.f44603b;
                            if (cLOpenFragment3.getContext() != null) {
                                CLMainData cLMainData7 = cLOpenFragment3.f30325z0;
                                if ((cLMainData7 == null || (shuntType = cLMainData7.getShuntType()) == null || shuntType.intValue() != 2) && (((cLMainData5 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData2 = cLMainData5.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData2.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData6 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData = cLMainData6.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13))) {
                                    cLOpenFragment3.v();
                                } else if (AppUtils.isAppInstalled("com.legend.cash")) {
                                    i0.Z(cLOpenFragment3.getContext());
                                } else {
                                    CLMainData cLMainData8 = cLOpenFragment3.f30325z0;
                                    if (TextUtils.isEmpty(cLMainData8 != null ? cLMainData8.getCashAppDownloadUrl() : null)) {
                                        ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                    } else {
                                        CLMainData cLMainData9 = cLOpenFragment3.f30325z0;
                                        i0.c0(cLMainData9 != null ? cLMainData9.getCashAppDownloadUrl() : null);
                                    }
                                }
                            }
                            n0.g().m(cLOpenFragment3.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment3.f30299B0);
                            break;
                        case 3:
                            CLOpenFragment cLOpenFragment4 = this.f44603b;
                            CLMainData cLMainData10 = cLOpenFragment4.f30325z0;
                            if (cLMainData10 == null || !cLMainData10.getBlacklist()) {
                                CLMainData cLMainData11 = cLOpenFragment4.f30325z0;
                                if (cLMainData11 == null || (creditCard = cLMainData11.getCreditCard()) == null || (accountStatus = creditCard.getAccountStatus()) == null || accountStatus.intValue() != 1) {
                                    CLMainData cLMainData12 = cLOpenFragment4.f30325z0;
                                    if (cLMainData12 == null || (okCardAccountStatus = cLMainData12.getOkCardAccountStatus()) == null || okCardAccountStatus.intValue() != 1) {
                                        cLOpenFragment4.v();
                                    } else {
                                        FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance = FlexiOverdueDialogFragment.f29971C.newInstance(3);
                                        Z childFragmentManager = cLOpenFragment4.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        flexiOverdueDialogFragmentNewInstance.show(childFragmentManager, "showFlexiOverdueDialog");
                                    }
                                } else {
                                    FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance2 = FlexiOverdueDialogFragment.f29971C.newInstance(2);
                                    Z childFragmentManager2 = cLOpenFragment4.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                    flexiOverdueDialogFragmentNewInstance2.show(childFragmentManager2, "showFlexiOverdueDialog");
                                }
                            } else {
                                FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance3 = FlexiOverdueDialogFragment.f29971C.newInstance(0);
                                Z childFragmentManager3 = cLOpenFragment4.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                flexiOverdueDialogFragmentNewInstance3.show(childFragmentManager3, "showFlexiOverdueDialog");
                            }
                            n0.g().m(cLOpenFragment4.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment4.f30299B0);
                            break;
                        default:
                            Bundle bundle = new Bundle();
                            bundle.putLong("amount", 500000L);
                            CLOpenFragment cLOpenFragment5 = this.f44603b;
                            CLMainData cLMainData13 = cLOpenFragment5.f30325z0;
                            String termSpanUnit = null;
                            if (((cLMainData13 == null || (config6 = cLMainData13.getConfig()) == null) ? null : config6.getTerm()) == null) {
                                term = 0;
                            } else {
                                CLMainData cLMainData14 = cLOpenFragment5.f30325z0;
                                term = (cLMainData14 == null || (config = cLMainData14.getConfig()) == null) ? null : config.getTerm();
                            }
                            if (term != null) {
                                bundle.putInt(FirebaseAnalytics.Param.TERM, term.intValue());
                            }
                            CLMainData cLMainData15 = cLOpenFragment5.f30325z0;
                            if (((cLMainData15 == null || (config5 = cLMainData15.getConfig()) == null) ? null : config5.getTermSpan()) == null) {
                                termSpan = 0;
                            } else {
                                CLMainData cLMainData16 = cLOpenFragment5.f30325z0;
                                termSpan = (cLMainData16 == null || (config2 = cLMainData16.getConfig()) == null) ? null : config2.getTermSpan();
                            }
                            if (termSpan != null) {
                                bundle.putInt("termSpan", termSpan.intValue());
                            }
                            CLMainData cLMainData17 = cLOpenFragment5.f30325z0;
                            if (TextUtils.isEmpty((cLMainData17 == null || (config4 = cLMainData17.getConfig()) == null) ? null : config4.getTermSpanUnit())) {
                                termSpanUnit = "";
                            } else {
                                CLMainData cLMainData18 = cLOpenFragment5.f30325z0;
                                if (cLMainData18 != null && (config3 = cLMainData18.getConfig()) != null) {
                                    termSpanUnit = config3.getTermSpanUnit();
                                }
                            }
                            if (termSpanUnit != null) {
                                bundle.putString("termSpanUnit", termSpanUnit);
                            }
                            d.x(bundle, "AboutInstallmentLoan");
                            break;
                    }
                }
            });
        }
        PpTitleBar ppTitleBar2 = (PpTitleBar) this.f30320v0.getValue();
        if (ppTitleBar2 != null) {
            final int i10 = 1;
            ppTitleBar2.setBackButtonClickListener(new View.OnClickListener(this) { // from class: zb.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOpenFragment f44603b;

                {
                    this.f44603b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMainData cLMainData5;
                    CLMainData cLMainData6;
                    CashLoanWhitelistData cashLoanWhitelistData;
                    Integer busiType;
                    CashLoanWhitelistData cashLoanWhitelistData2;
                    Integer busiType2;
                    Integer shuntType;
                    Integer okCardAccountStatus;
                    CLMainCreditCard creditCard;
                    Integer accountStatus;
                    Integer term;
                    CLMainConfig config;
                    Integer termSpan;
                    CLMainConfig config2;
                    CLMainConfig config3;
                    CLMainConfig config4;
                    CLMainConfig config5;
                    CLMainConfig config6;
                    switch (i10) {
                        case 0:
                            CLOpenFragment cLOpenFragment = this.f44603b;
                            E activity2 = cLOpenFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            n0.g().m(cLOpenFragment.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment.f30299B0);
                            break;
                        case 1:
                            CLOpenFragment cLOpenFragment2 = this.f44603b;
                            E activity3 = cLOpenFragment2.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            n0.g().m(cLOpenFragment2.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment2.f30299B0);
                            break;
                        case 2:
                            CLOpenFragment cLOpenFragment3 = this.f44603b;
                            if (cLOpenFragment3.getContext() != null) {
                                CLMainData cLMainData7 = cLOpenFragment3.f30325z0;
                                if ((cLMainData7 == null || (shuntType = cLMainData7.getShuntType()) == null || shuntType.intValue() != 2) && (((cLMainData5 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData2 = cLMainData5.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData2.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData6 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData = cLMainData6.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13))) {
                                    cLOpenFragment3.v();
                                } else if (AppUtils.isAppInstalled("com.legend.cash")) {
                                    i0.Z(cLOpenFragment3.getContext());
                                } else {
                                    CLMainData cLMainData8 = cLOpenFragment3.f30325z0;
                                    if (TextUtils.isEmpty(cLMainData8 != null ? cLMainData8.getCashAppDownloadUrl() : null)) {
                                        ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                    } else {
                                        CLMainData cLMainData9 = cLOpenFragment3.f30325z0;
                                        i0.c0(cLMainData9 != null ? cLMainData9.getCashAppDownloadUrl() : null);
                                    }
                                }
                            }
                            n0.g().m(cLOpenFragment3.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment3.f30299B0);
                            break;
                        case 3:
                            CLOpenFragment cLOpenFragment4 = this.f44603b;
                            CLMainData cLMainData10 = cLOpenFragment4.f30325z0;
                            if (cLMainData10 == null || !cLMainData10.getBlacklist()) {
                                CLMainData cLMainData11 = cLOpenFragment4.f30325z0;
                                if (cLMainData11 == null || (creditCard = cLMainData11.getCreditCard()) == null || (accountStatus = creditCard.getAccountStatus()) == null || accountStatus.intValue() != 1) {
                                    CLMainData cLMainData12 = cLOpenFragment4.f30325z0;
                                    if (cLMainData12 == null || (okCardAccountStatus = cLMainData12.getOkCardAccountStatus()) == null || okCardAccountStatus.intValue() != 1) {
                                        cLOpenFragment4.v();
                                    } else {
                                        FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance = FlexiOverdueDialogFragment.f29971C.newInstance(3);
                                        Z childFragmentManager = cLOpenFragment4.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        flexiOverdueDialogFragmentNewInstance.show(childFragmentManager, "showFlexiOverdueDialog");
                                    }
                                } else {
                                    FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance2 = FlexiOverdueDialogFragment.f29971C.newInstance(2);
                                    Z childFragmentManager2 = cLOpenFragment4.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                    flexiOverdueDialogFragmentNewInstance2.show(childFragmentManager2, "showFlexiOverdueDialog");
                                }
                            } else {
                                FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance3 = FlexiOverdueDialogFragment.f29971C.newInstance(0);
                                Z childFragmentManager3 = cLOpenFragment4.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                flexiOverdueDialogFragmentNewInstance3.show(childFragmentManager3, "showFlexiOverdueDialog");
                            }
                            n0.g().m(cLOpenFragment4.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment4.f30299B0);
                            break;
                        default:
                            Bundle bundle = new Bundle();
                            bundle.putLong("amount", 500000L);
                            CLOpenFragment cLOpenFragment5 = this.f44603b;
                            CLMainData cLMainData13 = cLOpenFragment5.f30325z0;
                            String termSpanUnit = null;
                            if (((cLMainData13 == null || (config6 = cLMainData13.getConfig()) == null) ? null : config6.getTerm()) == null) {
                                term = 0;
                            } else {
                                CLMainData cLMainData14 = cLOpenFragment5.f30325z0;
                                term = (cLMainData14 == null || (config = cLMainData14.getConfig()) == null) ? null : config.getTerm();
                            }
                            if (term != null) {
                                bundle.putInt(FirebaseAnalytics.Param.TERM, term.intValue());
                            }
                            CLMainData cLMainData15 = cLOpenFragment5.f30325z0;
                            if (((cLMainData15 == null || (config5 = cLMainData15.getConfig()) == null) ? null : config5.getTermSpan()) == null) {
                                termSpan = 0;
                            } else {
                                CLMainData cLMainData16 = cLOpenFragment5.f30325z0;
                                termSpan = (cLMainData16 == null || (config2 = cLMainData16.getConfig()) == null) ? null : config2.getTermSpan();
                            }
                            if (termSpan != null) {
                                bundle.putInt("termSpan", termSpan.intValue());
                            }
                            CLMainData cLMainData17 = cLOpenFragment5.f30325z0;
                            if (TextUtils.isEmpty((cLMainData17 == null || (config4 = cLMainData17.getConfig()) == null) ? null : config4.getTermSpanUnit())) {
                                termSpanUnit = "";
                            } else {
                                CLMainData cLMainData18 = cLOpenFragment5.f30325z0;
                                if (cLMainData18 != null && (config3 = cLMainData18.getConfig()) != null) {
                                    termSpanUnit = config3.getTermSpanUnit();
                                }
                            }
                            if (termSpanUnit != null) {
                                bundle.putString("termSpanUnit", termSpanUnit);
                            }
                            d.x(bundle, "AboutInstallmentLoan");
                            break;
                    }
                }
            });
        }
        TextView textViewT = t();
        if (textViewT != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: zb.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOpenFragment f44603b;

                {
                    this.f44603b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMainData cLMainData5;
                    CLMainData cLMainData6;
                    CashLoanWhitelistData cashLoanWhitelistData;
                    Integer busiType;
                    CashLoanWhitelistData cashLoanWhitelistData2;
                    Integer busiType2;
                    Integer shuntType;
                    Integer okCardAccountStatus;
                    CLMainCreditCard creditCard;
                    Integer accountStatus;
                    Integer term;
                    CLMainConfig config;
                    Integer termSpan;
                    CLMainConfig config2;
                    CLMainConfig config3;
                    CLMainConfig config4;
                    CLMainConfig config5;
                    CLMainConfig config6;
                    switch (i11) {
                        case 0:
                            CLOpenFragment cLOpenFragment = this.f44603b;
                            E activity2 = cLOpenFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            n0.g().m(cLOpenFragment.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment.f30299B0);
                            break;
                        case 1:
                            CLOpenFragment cLOpenFragment2 = this.f44603b;
                            E activity3 = cLOpenFragment2.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            n0.g().m(cLOpenFragment2.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment2.f30299B0);
                            break;
                        case 2:
                            CLOpenFragment cLOpenFragment3 = this.f44603b;
                            if (cLOpenFragment3.getContext() != null) {
                                CLMainData cLMainData7 = cLOpenFragment3.f30325z0;
                                if ((cLMainData7 == null || (shuntType = cLMainData7.getShuntType()) == null || shuntType.intValue() != 2) && (((cLMainData5 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData2 = cLMainData5.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData2.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData6 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData = cLMainData6.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13))) {
                                    cLOpenFragment3.v();
                                } else if (AppUtils.isAppInstalled("com.legend.cash")) {
                                    i0.Z(cLOpenFragment3.getContext());
                                } else {
                                    CLMainData cLMainData8 = cLOpenFragment3.f30325z0;
                                    if (TextUtils.isEmpty(cLMainData8 != null ? cLMainData8.getCashAppDownloadUrl() : null)) {
                                        ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                    } else {
                                        CLMainData cLMainData9 = cLOpenFragment3.f30325z0;
                                        i0.c0(cLMainData9 != null ? cLMainData9.getCashAppDownloadUrl() : null);
                                    }
                                }
                            }
                            n0.g().m(cLOpenFragment3.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment3.f30299B0);
                            break;
                        case 3:
                            CLOpenFragment cLOpenFragment4 = this.f44603b;
                            CLMainData cLMainData10 = cLOpenFragment4.f30325z0;
                            if (cLMainData10 == null || !cLMainData10.getBlacklist()) {
                                CLMainData cLMainData11 = cLOpenFragment4.f30325z0;
                                if (cLMainData11 == null || (creditCard = cLMainData11.getCreditCard()) == null || (accountStatus = creditCard.getAccountStatus()) == null || accountStatus.intValue() != 1) {
                                    CLMainData cLMainData12 = cLOpenFragment4.f30325z0;
                                    if (cLMainData12 == null || (okCardAccountStatus = cLMainData12.getOkCardAccountStatus()) == null || okCardAccountStatus.intValue() != 1) {
                                        cLOpenFragment4.v();
                                    } else {
                                        FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance = FlexiOverdueDialogFragment.f29971C.newInstance(3);
                                        Z childFragmentManager = cLOpenFragment4.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        flexiOverdueDialogFragmentNewInstance.show(childFragmentManager, "showFlexiOverdueDialog");
                                    }
                                } else {
                                    FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance2 = FlexiOverdueDialogFragment.f29971C.newInstance(2);
                                    Z childFragmentManager2 = cLOpenFragment4.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                    flexiOverdueDialogFragmentNewInstance2.show(childFragmentManager2, "showFlexiOverdueDialog");
                                }
                            } else {
                                FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance3 = FlexiOverdueDialogFragment.f29971C.newInstance(0);
                                Z childFragmentManager3 = cLOpenFragment4.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                flexiOverdueDialogFragmentNewInstance3.show(childFragmentManager3, "showFlexiOverdueDialog");
                            }
                            n0.g().m(cLOpenFragment4.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment4.f30299B0);
                            break;
                        default:
                            Bundle bundle = new Bundle();
                            bundle.putLong("amount", 500000L);
                            CLOpenFragment cLOpenFragment5 = this.f44603b;
                            CLMainData cLMainData13 = cLOpenFragment5.f30325z0;
                            String termSpanUnit = null;
                            if (((cLMainData13 == null || (config6 = cLMainData13.getConfig()) == null) ? null : config6.getTerm()) == null) {
                                term = 0;
                            } else {
                                CLMainData cLMainData14 = cLOpenFragment5.f30325z0;
                                term = (cLMainData14 == null || (config = cLMainData14.getConfig()) == null) ? null : config.getTerm();
                            }
                            if (term != null) {
                                bundle.putInt(FirebaseAnalytics.Param.TERM, term.intValue());
                            }
                            CLMainData cLMainData15 = cLOpenFragment5.f30325z0;
                            if (((cLMainData15 == null || (config5 = cLMainData15.getConfig()) == null) ? null : config5.getTermSpan()) == null) {
                                termSpan = 0;
                            } else {
                                CLMainData cLMainData16 = cLOpenFragment5.f30325z0;
                                termSpan = (cLMainData16 == null || (config2 = cLMainData16.getConfig()) == null) ? null : config2.getTermSpan();
                            }
                            if (termSpan != null) {
                                bundle.putInt("termSpan", termSpan.intValue());
                            }
                            CLMainData cLMainData17 = cLOpenFragment5.f30325z0;
                            if (TextUtils.isEmpty((cLMainData17 == null || (config4 = cLMainData17.getConfig()) == null) ? null : config4.getTermSpanUnit())) {
                                termSpanUnit = "";
                            } else {
                                CLMainData cLMainData18 = cLOpenFragment5.f30325z0;
                                if (cLMainData18 != null && (config3 = cLMainData18.getConfig()) != null) {
                                    termSpanUnit = config3.getTermSpanUnit();
                                }
                            }
                            if (termSpanUnit != null) {
                                bundle.putString("termSpanUnit", termSpanUnit);
                            }
                            d.x(bundle, "AboutInstallmentLoan");
                            break;
                    }
                }
            }, textViewT);
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.f30306Y.getValue();
        if (roundedTextView != null) {
            final int i12 = 3;
            p220oa.h.l(new View.OnClickListener(this) { // from class: zb.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOpenFragment f44603b;

                {
                    this.f44603b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMainData cLMainData5;
                    CLMainData cLMainData6;
                    CashLoanWhitelistData cashLoanWhitelistData;
                    Integer busiType;
                    CashLoanWhitelistData cashLoanWhitelistData2;
                    Integer busiType2;
                    Integer shuntType;
                    Integer okCardAccountStatus;
                    CLMainCreditCard creditCard;
                    Integer accountStatus;
                    Integer term;
                    CLMainConfig config;
                    Integer termSpan;
                    CLMainConfig config2;
                    CLMainConfig config3;
                    CLMainConfig config4;
                    CLMainConfig config5;
                    CLMainConfig config6;
                    switch (i12) {
                        case 0:
                            CLOpenFragment cLOpenFragment = this.f44603b;
                            E activity2 = cLOpenFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            n0.g().m(cLOpenFragment.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment.f30299B0);
                            break;
                        case 1:
                            CLOpenFragment cLOpenFragment2 = this.f44603b;
                            E activity3 = cLOpenFragment2.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            n0.g().m(cLOpenFragment2.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment2.f30299B0);
                            break;
                        case 2:
                            CLOpenFragment cLOpenFragment3 = this.f44603b;
                            if (cLOpenFragment3.getContext() != null) {
                                CLMainData cLMainData7 = cLOpenFragment3.f30325z0;
                                if ((cLMainData7 == null || (shuntType = cLMainData7.getShuntType()) == null || shuntType.intValue() != 2) && (((cLMainData5 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData2 = cLMainData5.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData2.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData6 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData = cLMainData6.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13))) {
                                    cLOpenFragment3.v();
                                } else if (AppUtils.isAppInstalled("com.legend.cash")) {
                                    i0.Z(cLOpenFragment3.getContext());
                                } else {
                                    CLMainData cLMainData8 = cLOpenFragment3.f30325z0;
                                    if (TextUtils.isEmpty(cLMainData8 != null ? cLMainData8.getCashAppDownloadUrl() : null)) {
                                        ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                    } else {
                                        CLMainData cLMainData9 = cLOpenFragment3.f30325z0;
                                        i0.c0(cLMainData9 != null ? cLMainData9.getCashAppDownloadUrl() : null);
                                    }
                                }
                            }
                            n0.g().m(cLOpenFragment3.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment3.f30299B0);
                            break;
                        case 3:
                            CLOpenFragment cLOpenFragment4 = this.f44603b;
                            CLMainData cLMainData10 = cLOpenFragment4.f30325z0;
                            if (cLMainData10 == null || !cLMainData10.getBlacklist()) {
                                CLMainData cLMainData11 = cLOpenFragment4.f30325z0;
                                if (cLMainData11 == null || (creditCard = cLMainData11.getCreditCard()) == null || (accountStatus = creditCard.getAccountStatus()) == null || accountStatus.intValue() != 1) {
                                    CLMainData cLMainData12 = cLOpenFragment4.f30325z0;
                                    if (cLMainData12 == null || (okCardAccountStatus = cLMainData12.getOkCardAccountStatus()) == null || okCardAccountStatus.intValue() != 1) {
                                        cLOpenFragment4.v();
                                    } else {
                                        FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance = FlexiOverdueDialogFragment.f29971C.newInstance(3);
                                        Z childFragmentManager = cLOpenFragment4.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        flexiOverdueDialogFragmentNewInstance.show(childFragmentManager, "showFlexiOverdueDialog");
                                    }
                                } else {
                                    FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance2 = FlexiOverdueDialogFragment.f29971C.newInstance(2);
                                    Z childFragmentManager2 = cLOpenFragment4.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                    flexiOverdueDialogFragmentNewInstance2.show(childFragmentManager2, "showFlexiOverdueDialog");
                                }
                            } else {
                                FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance3 = FlexiOverdueDialogFragment.f29971C.newInstance(0);
                                Z childFragmentManager3 = cLOpenFragment4.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                flexiOverdueDialogFragmentNewInstance3.show(childFragmentManager3, "showFlexiOverdueDialog");
                            }
                            n0.g().m(cLOpenFragment4.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment4.f30299B0);
                            break;
                        default:
                            Bundle bundle = new Bundle();
                            bundle.putLong("amount", 500000L);
                            CLOpenFragment cLOpenFragment5 = this.f44603b;
                            CLMainData cLMainData13 = cLOpenFragment5.f30325z0;
                            String termSpanUnit = null;
                            if (((cLMainData13 == null || (config6 = cLMainData13.getConfig()) == null) ? null : config6.getTerm()) == null) {
                                term = 0;
                            } else {
                                CLMainData cLMainData14 = cLOpenFragment5.f30325z0;
                                term = (cLMainData14 == null || (config = cLMainData14.getConfig()) == null) ? null : config.getTerm();
                            }
                            if (term != null) {
                                bundle.putInt(FirebaseAnalytics.Param.TERM, term.intValue());
                            }
                            CLMainData cLMainData15 = cLOpenFragment5.f30325z0;
                            if (((cLMainData15 == null || (config5 = cLMainData15.getConfig()) == null) ? null : config5.getTermSpan()) == null) {
                                termSpan = 0;
                            } else {
                                CLMainData cLMainData16 = cLOpenFragment5.f30325z0;
                                termSpan = (cLMainData16 == null || (config2 = cLMainData16.getConfig()) == null) ? null : config2.getTermSpan();
                            }
                            if (termSpan != null) {
                                bundle.putInt("termSpan", termSpan.intValue());
                            }
                            CLMainData cLMainData17 = cLOpenFragment5.f30325z0;
                            if (TextUtils.isEmpty((cLMainData17 == null || (config4 = cLMainData17.getConfig()) == null) ? null : config4.getTermSpanUnit())) {
                                termSpanUnit = "";
                            } else {
                                CLMainData cLMainData18 = cLOpenFragment5.f30325z0;
                                if (cLMainData18 != null && (config3 = cLMainData18.getConfig()) != null) {
                                    termSpanUnit = config3.getTermSpanUnit();
                                }
                            }
                            if (termSpanUnit != null) {
                                bundle.putString("termSpanUnit", termSpanUnit);
                            }
                            d.x(bundle, "AboutInstallmentLoan");
                            break;
                    }
                }
            }, roundedTextView);
        }
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) this.f30321w.getValue());
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) this.f30302L.getValue());
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) this.f30312p.getValue());
        SingleAdView singleAdView = (SingleAdView) this.f30308i.getValue();
        if (singleAdView != null) {
            singleAdView.setAdListener(new C0158z(this, 19));
        }
        TextView textView = (TextView) this.f30305X.getValue();
        if (textView != null) {
            final int i13 = 4;
            p220oa.h.l(new View.OnClickListener(this) { // from class: zb.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOpenFragment f44603b;

                {
                    this.f44603b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMainData cLMainData5;
                    CLMainData cLMainData6;
                    CashLoanWhitelistData cashLoanWhitelistData;
                    Integer busiType;
                    CashLoanWhitelistData cashLoanWhitelistData2;
                    Integer busiType2;
                    Integer shuntType;
                    Integer okCardAccountStatus;
                    CLMainCreditCard creditCard;
                    Integer accountStatus;
                    Integer term;
                    CLMainConfig config;
                    Integer termSpan;
                    CLMainConfig config2;
                    CLMainConfig config3;
                    CLMainConfig config4;
                    CLMainConfig config5;
                    CLMainConfig config6;
                    switch (i13) {
                        case 0:
                            CLOpenFragment cLOpenFragment = this.f44603b;
                            E activity2 = cLOpenFragment.getActivity();
                            if (activity2 != null) {
                                activity2.finish();
                            }
                            n0.g().m(cLOpenFragment.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment.f30299B0);
                            break;
                        case 1:
                            CLOpenFragment cLOpenFragment2 = this.f44603b;
                            E activity3 = cLOpenFragment2.getActivity();
                            if (activity3 != null) {
                                activity3.finish();
                            }
                            n0.g().m(cLOpenFragment2.getClass().getSimpleName().concat("_element_click"), "mtb_back_iv", cLOpenFragment2.f30299B0);
                            break;
                        case 2:
                            CLOpenFragment cLOpenFragment3 = this.f44603b;
                            if (cLOpenFragment3.getContext() != null) {
                                CLMainData cLMainData7 = cLOpenFragment3.f30325z0;
                                if ((cLMainData7 == null || (shuntType = cLMainData7.getShuntType()) == null || shuntType.intValue() != 2) && (((cLMainData5 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData2 = cLMainData5.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData2.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData6 = cLOpenFragment3.f30325z0) == null || (cashLoanWhitelistData = cLMainData6.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13))) {
                                    cLOpenFragment3.v();
                                } else if (AppUtils.isAppInstalled("com.legend.cash")) {
                                    i0.Z(cLOpenFragment3.getContext());
                                } else {
                                    CLMainData cLMainData8 = cLOpenFragment3.f30325z0;
                                    if (TextUtils.isEmpty(cLMainData8 != null ? cLMainData8.getCashAppDownloadUrl() : null)) {
                                        ToastUtils.showLong("download Flexi Cash url is null", new Object[0]);
                                    } else {
                                        CLMainData cLMainData9 = cLOpenFragment3.f30325z0;
                                        i0.c0(cLMainData9 != null ? cLMainData9.getCashAppDownloadUrl() : null);
                                    }
                                }
                            }
                            n0.g().m(cLOpenFragment3.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment3.f30299B0);
                            break;
                        case 3:
                            CLOpenFragment cLOpenFragment4 = this.f44603b;
                            CLMainData cLMainData10 = cLOpenFragment4.f30325z0;
                            if (cLMainData10 == null || !cLMainData10.getBlacklist()) {
                                CLMainData cLMainData11 = cLOpenFragment4.f30325z0;
                                if (cLMainData11 == null || (creditCard = cLMainData11.getCreditCard()) == null || (accountStatus = creditCard.getAccountStatus()) == null || accountStatus.intValue() != 1) {
                                    CLMainData cLMainData12 = cLOpenFragment4.f30325z0;
                                    if (cLMainData12 == null || (okCardAccountStatus = cLMainData12.getOkCardAccountStatus()) == null || okCardAccountStatus.intValue() != 1) {
                                        cLOpenFragment4.v();
                                    } else {
                                        FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance = FlexiOverdueDialogFragment.f29971C.newInstance(3);
                                        Z childFragmentManager = cLOpenFragment4.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        flexiOverdueDialogFragmentNewInstance.show(childFragmentManager, "showFlexiOverdueDialog");
                                    }
                                } else {
                                    FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance2 = FlexiOverdueDialogFragment.f29971C.newInstance(2);
                                    Z childFragmentManager2 = cLOpenFragment4.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                                    flexiOverdueDialogFragmentNewInstance2.show(childFragmentManager2, "showFlexiOverdueDialog");
                                }
                            } else {
                                FlexiOverdueDialogFragment flexiOverdueDialogFragmentNewInstance3 = FlexiOverdueDialogFragment.f29971C.newInstance(0);
                                Z childFragmentManager3 = cLOpenFragment4.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                                flexiOverdueDialogFragmentNewInstance3.show(childFragmentManager3, "showFlexiOverdueDialog");
                            }
                            n0.g().m(cLOpenFragment4.getClass().getSimpleName().concat("_element_click"), "cl_open_tv", cLOpenFragment4.f30299B0);
                            break;
                        default:
                            Bundle bundle = new Bundle();
                            bundle.putLong("amount", 500000L);
                            CLOpenFragment cLOpenFragment5 = this.f44603b;
                            CLMainData cLMainData13 = cLOpenFragment5.f30325z0;
                            String termSpanUnit = null;
                            if (((cLMainData13 == null || (config6 = cLMainData13.getConfig()) == null) ? null : config6.getTerm()) == null) {
                                term = 0;
                            } else {
                                CLMainData cLMainData14 = cLOpenFragment5.f30325z0;
                                term = (cLMainData14 == null || (config = cLMainData14.getConfig()) == null) ? null : config.getTerm();
                            }
                            if (term != null) {
                                bundle.putInt(FirebaseAnalytics.Param.TERM, term.intValue());
                            }
                            CLMainData cLMainData15 = cLOpenFragment5.f30325z0;
                            if (((cLMainData15 == null || (config5 = cLMainData15.getConfig()) == null) ? null : config5.getTermSpan()) == null) {
                                termSpan = 0;
                            } else {
                                CLMainData cLMainData16 = cLOpenFragment5.f30325z0;
                                termSpan = (cLMainData16 == null || (config2 = cLMainData16.getConfig()) == null) ? null : config2.getTermSpan();
                            }
                            if (termSpan != null) {
                                bundle.putInt("termSpan", termSpan.intValue());
                            }
                            CLMainData cLMainData17 = cLOpenFragment5.f30325z0;
                            if (TextUtils.isEmpty((cLMainData17 == null || (config4 = cLMainData17.getConfig()) == null) ? null : config4.getTermSpanUnit())) {
                                termSpanUnit = "";
                            } else {
                                CLMainData cLMainData18 = cLOpenFragment5.f30325z0;
                                if (cLMainData18 != null && (config3 = cLMainData18.getConfig()) != null) {
                                    termSpanUnit = config3.getTermSpanUnit();
                                }
                            }
                            if (termSpanUnit != null) {
                                bundle.putString("termSpanUnit", termSpanUnit);
                            }
                            d.x(bundle, "AboutInstallmentLoan");
                            break;
                    }
                }
            }, textView);
        }
        HashMap map = new HashMap();
        String simpleName = getClass().getSimpleName();
        CLMainData cLMainData5 = this.f30325z0;
        map.put("screen_name", simpleName + "_" + (cLMainData5 != null ? cLMainData5.getUserTag() : null));
        AutoTrackUtil.trackActivityProperties(getActivity(), map);
        return 0;
    }

    public final TextView t() {
        return (TextView) this.f30319v.getValue();
    }

    public final void u(String str) {
        if (!(getActivity() instanceof CLActiveInterface)) {
            q0.v("/main/home", "tab", "finance");
            return;
        }
        KeyEventDispatcher$Component activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.credit.interfaces.CLActiveInterface");
        ((CLActiveInterface) activity).activeCashLoan(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        Long remainingDate;
        Integer remainingDays;
        Object[] objArr;
        CLMainCreditCard creditCard;
        Integer applyStatus;
        Integer productSubId;
        Integer cashLoanAccountStatus;
        Integer okCardAccountStatus;
        List<CLMainOkCardBill> okCardBillList;
        Context context = getContext();
        if (context != null) {
            p186mb.b.f39631b.getInstance().f39633a = 2;
            CLMainData cLMainData = this.f30325z0;
            boolean z3 = false;
            cLMainOkCardBill = null;
            CLMainOkCardBill cLMainOkCardBill = null;
            int iIntValue = 1;
            if (!(cLMainData != null ? Intrinsics.c(cLMainData.getInstallmentUserA(), Boolean.TRUE) : false)) {
                CLMainData cLMainData2 = this.f30325z0;
                if (!(cLMainData2 != null ? Intrinsics.c(cLMainData2.getInstallmentUserC(), Boolean.TRUE) : false)) {
                    CLMainData cLMainData3 = this.f30325z0;
                    if (!Intrinsics.c(cLMainData3 != null ? cLMainData3.getCashLoanWhitelist() : null, "1")) {
                        CLMainData cLMainData4 = this.f30325z0;
                        if (!(cLMainData4 != null ? Intrinsics.c(cLMainData4.getInstantWhitelist(), Boolean.TRUE) : false)) {
                            ToastUtils.showLong(getString(g.cs_cl_no_short_cash_white_user), new Object[0]);
                            return;
                        }
                        CLMainData cLMainData5 = this.f30325z0;
                        if (cLMainData5 != null ? Intrinsics.c(cLMainData5.getPalmpayAccount(), Boolean.TRUE) : false) {
                            u("CASH_INSTANT_LOAN");
                            return;
                        } else {
                            ToastUtils.showLong(getString(g.cs_cl_palmpay_account_unavailable), new Object[0]);
                            return;
                        }
                    }
                    CLMainData cLMainData6 = this.f30325z0;
                    List<CLMainOkCardBill> okCardBillList2 = cLMainData6 != null ? cLMainData6.getOkCardBillList() : null;
                    if (okCardBillList2 != null && !okCardBillList2.isEmpty()) {
                        iIntValue = 0;
                    }
                    if (iIntValue == 0) {
                        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/cl_oc_bill_activity");
                        C0525w c0525wF = C0525w.f();
                        CLMainData cLMainData7 = this.f30325z0;
                        if (cLMainData7 != null && (okCardBillList = cLMainData7.getOkCardBillList()) != null) {
                            cLMainOkCardBill = okCardBillList.get(0);
                        }
                        postcardBuild.withString("cl_oc_bill_data", ((Gson) c0525wF.f7166b).toJson(cLMainOkCardBill)).navigation();
                        return;
                    }
                    CLMainData cLMainData8 = this.f30325z0;
                    if (!Intrinsics.c(cLMainData8 != null ? cLMainData8.getUserTag() : null, "CASH_LOAN_WHITE_LIST")) {
                        CLMainData cLMainData9 = this.f30325z0;
                        if (!Intrinsics.c(cLMainData9 != null ? cLMainData9.getUserTag() : null, CLMainData.CL_STATUS_RE_ACTIVE)) {
                            CLStopOpenDialog cLStopOpenDialog = new CLStopOpenDialog(context);
                            CLMainData cLMainData10 = this.f30325z0;
                            cLStopOpenDialog.setContent(cLMainData10 != null ? cLMainData10.getErrorText() : null);
                            cLStopOpenDialog.show();
                            return;
                        }
                    }
                    u("CASH_LOAN");
                    return;
                }
            }
            CLMainData cLMainData11 = this.f30325z0;
            if (((cLMainData11 == null || (okCardAccountStatus = cLMainData11.getOkCardAccountStatus()) == null || okCardAccountStatus.intValue() != 1) ? false : true) == false) {
                CLMainData cLMainData12 = this.f30325z0;
                if (((cLMainData12 == null || (cashLoanAccountStatus = cLMainData12.getCashLoanAccountStatus()) == null || cashLoanAccountStatus.intValue() != 1) ? false : true) == false) {
                    CLMainData cLMainData13 = this.f30325z0;
                    if (!Intrinsics.c(cLMainData13 != null ? cLMainData13.getUserTag() : null, "OPEN_ACCOUNT_REJECT_DAYS")) {
                        CLMainData cLMainData14 = this.f30325z0;
                        if (!Intrinsics.c(cLMainData14 != null ? cLMainData14.getUserTag() : null, CLMainData.CL_RETRY_TIME_TAG)) {
                            CLMainData cLMainData15 = this.f30325z0;
                            if (cLMainData15 == null || cLMainData15.getProductSubs() == null) {
                                objArr = false;
                            } else {
                                Iterator<ProductSubs> it = cLMainData15.getProductSubs().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        ProductSubs next = it.next();
                                        Integer productSubId2 = next.getProductSubId();
                                        if ((productSubId2 != null && productSubId2.intValue() == 1) || ((productSubId = next.getProductSubId()) != null && productSubId.intValue() == 3)) {
                                            objArr = true;
                                        }
                                    } else {
                                        objArr = false;
                                    }
                                }
                            }
                            if (objArr == true) {
                                u("CASH_INSTALLMENT_RAISE_AMOUNT");
                                return;
                            }
                            CLMainData cLMainData16 = this.f30325z0;
                            if (cLMainData16 != null && (creditCard = cLMainData16.getCreditCard()) != null && (applyStatus = creditCard.getApplyStatus()) != null && applyStatus.intValue() == 1) {
                                z3 = true;
                            }
                            q0.v("/credit_score/cl_main_open_account_activity", "CL_OPEN_ACCOUNT_TYPE_PATH", z3 ? "/credit_score/oc_cash_open_guide_fragment" : "/credit_score/oc_double_open_guide_fragment");
                            return;
                        }
                    }
                    CLMainData cLMainData17 = this.f30325z0;
                    Postcard postcardBuild2 = ARouter.getInstance().build("/credit_score/cs_cl_penalty_period_activity");
                    if (cLMainData17 != null && (remainingDays = cLMainData17.getRemainingDays()) != null) {
                        iIntValue = remainingDays.intValue();
                    }
                    postcardBuild2.withInt("cl_remain_days", iIntValue).withLong("cl_remain_date", (cLMainData17 == null || (remainingDate = cLMainData17.getRemainingDate()) == null) ? 0L : remainingDate.longValue()).navigation();
                    return;
                }
            }
            d.F("/credit_score/cs_cl_total_overdue_activity");
        }
    }

    public final void w() {
        CLMainData cLMainData;
        CashLoanWhitelistData cashLoanWhitelistData;
        Integer busiType;
        CashLoanWhitelistData cashLoanWhitelistData2;
        Long expireDays;
        CashLoanWhitelistData cashLoanWhitelistData3;
        Long expireDays2;
        CashLoanWhitelistData cashLoanWhitelistData4;
        Integer busiType2;
        TextView textViewT = t();
        if (textViewT != null) {
            textViewT.setEnabled(true);
        }
        TextView textViewT2 = t();
        if (textViewT2 != null) {
            textViewT2.setText(getString(g.cs_cl_apply));
        }
        CLMainData cLMainData2 = this.f30325z0;
        t tVar = this.f30312p;
        t tVar2 = this.f30300C;
        t tVar3 = this.f30301H;
        t tVar4 = this.t;
        if ((cLMainData2 == null || (cashLoanWhitelistData4 = cLMainData2.getCashLoanWhitelistData()) == null || (busiType2 = cashLoanWhitelistData4.getBusiType()) == null || busiType2.intValue() != 12) && ((cLMainData = this.f30325z0) == null || (cashLoanWhitelistData = cLMainData.getCashLoanWhitelistData()) == null || (busiType = cashLoanWhitelistData.getBusiType()) == null || busiType.intValue() != 13)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) tVar3.getValue();
            if (constraintLayout != null) {
                constraintLayout.setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
            }
            Group group = (Group) tVar2.getValue();
            if (group != null) {
                group.setVisibility(8);
            }
            TextView textView = (TextView) tVar4.getValue();
            if (textView != null) {
                textView.setVisibility(8);
            }
            SingleAdView singleAdView = (SingleAdView) tVar.getValue();
            if (singleAdView != null) {
                singleAdView.setSlotId(getString(g.cl_open_borrow_bt_single_ad_slot_id));
            }
            TextView textViewT3 = t();
            if (textViewT3 != null) {
                textViewT3.setText(getString(g.cs_cl_apply));
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) tVar3.getValue();
        if (constraintLayout2 != null) {
            constraintLayout2.setBackgroundResource(Ya.d.cs_cl_top_precredit_card_bg);
        }
        Group group2 = (Group) tVar2.getValue();
        if (group2 != null) {
            group2.setVisibility(0);
        }
        TextView textView2 = (TextView) tVar4.getValue();
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        CLMainData cLMainData3 = this.f30325z0;
        long jLongValue = 0;
        if (((cLMainData3 == null || (cashLoanWhitelistData3 = cLMainData3.getCashLoanWhitelistData()) == null || (expireDays2 = cashLoanWhitelistData3.getExpireDays()) == null) ? 0L : expireDays2.longValue()) > 0) {
            TextView textView3 = (TextView) tVar4.getValue();
            if (textView3 != null) {
                int i7 = g.cs_cl_expired_in_days;
                CLMainData cLMainData4 = this.f30325z0;
                if (cLMainData4 != null && (cashLoanWhitelistData2 = cLMainData4.getCashLoanWhitelistData()) != null && (expireDays = cashLoanWhitelistData2.getExpireDays()) != null) {
                    jLongValue = expireDays.longValue();
                }
                textView3.setText(getString(i7, Long.valueOf(jLongValue)));
            }
            TextView textView4 = (TextView) tVar4.getValue();
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else {
            TextView textView5 = (TextView) tVar4.getValue();
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            SingleAdView singleAdView2 = (SingleAdView) tVar.getValue();
            if (singleAdView2 != null) {
                singleAdView2.setSlotId(getString(g.cl_open_borrow_bt_single_ad_slot_id));
            }
        }
        TextView textViewT4 = t();
        if (textViewT4 != null) {
            textViewT4.setText(getString(g.cs_get_loan_amounts));
        }
    }

    public final void x() {
        CLMainConfig config;
        List<ProductSubs> productSubs;
        ProductSubs productSubs2;
        CLMainCreditCard creditCard;
        Long availableBalance;
        Integer productSubId;
        boolean z3;
        Integer productSubId2;
        CLMainCreditCard creditCard2;
        Double loanMinRatio;
        if (i0.W(getActivity())) {
            ViewStub viewStub = (ViewStub) this.f30324y0.getValue();
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
            ViewStub viewStub2 = (ViewStub) this.f30323x0.getValue();
            if (viewStub2 != null) {
                viewStub2.setVisibility(8);
            }
            Context context = getContext();
            if (context != null) {
                DecimalFormat decimalFormat = new DecimalFormat("0.00%");
                TextView textView = (TextView) this.f30315r0.getValue();
                if (textView != null) {
                    SpanUtils foregroundColor = G.i("Daily Interest low to ").setForegroundColor(context.getColor(Ya.b.cs_cl_main_color));
                    CLMainData cLMainData = this.f30325z0;
                    textView.setText(d0.j(" ", decimalFormat.format((cLMainData == null || (creditCard2 = cLMainData.getCreditCard()) == null || (loanMinRatio = creditCard2.getLoanMinRatio()) == null) ? 0.001d : loanMinRatio.doubleValue()), foregroundColor).setForegroundColor(context.getColor(Ya.b.cs_cl_main_color)).setTypeface(Typeface.create("sans-serif-medium", 0)).create());
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f30314q0.getValue();
            boolean z8 = true;
            if (constraintLayout != null) {
                CLMainData cLMainData2 = this.f30325z0;
                if (cLMainData2 == null || cLMainData2.getProductSubs() == null) {
                    z3 = false;
                } else {
                    Iterator<ProductSubs> it = cLMainData2.getProductSubs().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ProductSubs next = it.next();
                            Integer productSubId3 = next.getProductSubId();
                            if ((productSubId3 != null && productSubId3.intValue() == 1) || ((productSubId2 = next.getProductSubId()) != null && productSubId2.intValue() == 3)) {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    }
                }
                p220oa.h.s(constraintLayout, z3);
            }
            ImageView imageView = (ImageView) this.f30307Z.getValue();
            if (imageView != null) {
                CLMainData cLMainData3 = this.f30325z0;
                if (cLMainData3 != null && cLMainData3.getProductSubs() != null) {
                    Iterator<ProductSubs> it2 = cLMainData3.getProductSubs().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z8 = false;
                            break;
                        }
                        ProductSubs next2 = it2.next();
                        Integer productSubId4 = next2.getProductSubId();
                        if ((productSubId4 != null && productSubId4.intValue() == 1) || ((productSubId = next2.getProductSubId()) != null && productSubId.intValue() == 3)) {
                            break;
                        }
                    }
                } else {
                    z8 = false;
                    break;
                }
                p220oa.h.s(imageView, z8);
            }
            TextView textView2 = (TextView) this.f30313p0.getValue();
            if (textView2 != null) {
                CLMainData cLMainData4 = this.f30325z0;
                textView2.setText(r0.F((cLMainData4 == null || (creditCard = cLMainData4.getCreditCard()) == null || (availableBalance = creditCard.getAvailableBalance()) == null) ? 0L : availableBalance.longValue()));
            }
            TextView textView3 = (TextView) this.f30310k0.getValue();
            if (textView3 != null) {
                CLMainData cLMainData5 = this.f30325z0;
                textView3.setText(String.valueOf((cLMainData5 == null || (productSubs = cLMainData5.getProductSubs()) == null || (productSubs2 = productSubs.get(0)) == null) ? null : productSubs2.getMaxLoanDay()));
            }
            CLMainData cLMainData6 = this.f30325z0;
            if (cLMainData6 != null && (config = cLMainData6.getConfig()) != null) {
                TextView textView4 = (TextView) this.f30316s0.getValue();
                if (textView4 != null) {
                    textView4.setText(config.getTerm() + " Terms, " + config.getTermSpan() + (Intrinsics.c(config.getTermSpanUnit(), "D") ? " days/term" : " month/term"));
                }
                TextView textView5 = (TextView) this.f30317t0.getValue();
                if (textView5 != null) {
                    textView5.setText(String.valueOf(config.getMaxLoanDays()));
                }
                TextView textView6 = (TextView) this.f30318u0.getValue();
                if (textView6 != null) {
                    textView6.setText(getString(g.cs_cl_up_to_installments, config.getTerm()));
                }
            }
            ImageView imageView2 = (ImageView) this.f30322w0.getValue();
            if (imageView2 != null) {
                r0.h1(imageView2, r0.y0("/cs_cl_ins_open_top_bg_img.png"), Ya.d.cs_cl_open_bg);
            }
        }
    }
}
