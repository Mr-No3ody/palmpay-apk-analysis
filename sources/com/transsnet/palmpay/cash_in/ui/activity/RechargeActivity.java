package com.transsnet.palmpay.cash_in.ui.activity;

import Ab.B;
import C9.C0139f;
import C9.C0144k;
import C9.C0154v;
import C9.C0157y;
import C9.C0158z;
import C9.ViewOnClickListenerC0151s;
import J9.C0325i;
import J9.C0326j;
import J9.o;
import J9.p;
import L6.b;
import Pa.C0525w;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.Gson;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.cash_in.bean.request.CreateCashInOutOrderReqV2;
import com.transsnet.palmpay.cash_in.bean.request.ExtendField;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.viewmodel.FundViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.PreviewPayInfoResp;
import com.transsnet.palmpay.core.bean.req.PaymentMethodReq;
import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.core.bean.rsp.PaymentMethodV3Resp;
import com.transsnet.palmpay.core.bean.rsp.USSDFundResp;
import com.transsnet.palmpay.core.dialog.SelectPayMethodDialog;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p140j8.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;
import p366y9.d;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/cashin/recharge")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/activity/RechargeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/FundViewModel;", "Lcom/transsnet/palmpay/core/dialog/SelectPayMethodDialog$CallBack;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargeActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/RechargeActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,976:1\n1#2:977\n171#3,12:978\n215#3:990\n171#3,12:991\n215#3:1003\n171#3,12:1004\n215#3:1016\n171#3,12:1017\n215#3:1029\n171#3,12:1030\n215#3:1042\n171#3,12:1043\n215#3:1055\n115#3,8:1056\n145#3:1064\n*S KotlinDebug\n*F\n+ 1 RechargeActivity.kt\ncom/transsnet/palmpay/cash_in/ui/activity/RechargeActivity\n*L\n686#1:978,12\n686#1:990\n704#1:991,12\n704#1:1003\n747#1:1004,12\n747#1:1016\n766#1:1017,12\n766#1:1029\n797#1:1030,12\n797#1:1042\n907#1:1043,12\n907#1:1055\n920#1:1056,8\n920#1:1064\n*E\n"})
public final class RechargeActivity extends BaseMvvmActivity<FundViewModel> implements SelectPayMethodDialog.CallBack {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f26858r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f26859s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f26860t0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f26861A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f26862B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f26863C;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f26865L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SelectPayMethodDialog f26866M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f26867Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public PaymentMethod f26868X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public PaymentMethod f26869Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public PreviewPayInfoResp.DataBean f26870Z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f26872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f26874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f26875g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f26876i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f26877j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f26878k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f26879o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f26880p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f26883v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f26884w;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f26864H = f26859s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Handler f26881p0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ViewOnClickListenerC0151s f26882q0 = new ViewOnClickListenerC0151s(this, 1);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getFUND_WITH_BANK() {
            return RechargeActivity.f26859s0;
        }

        @NotNull
        public final String getFUND_WITH_BANK_ACCOUNT() {
            return RechargeActivity.f26860t0;
        }

        @NotNull
        public final String getFUND_WITH_USSD() {
            return RechargeActivity.f26858r0;
        }

        private a() {
        }
    }

    static {
        new a(null);
        f26858r0 = "fund_with_ussd";
        f26859s0 = "fund_with_bank";
        f26860t0 = "fund_with_bank_account";
    }

    public RechargeActivity() {
        final int i7 = 14;
        this.f26871c = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i7) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i10 = 5;
        this.f26872d = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i10) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i11 = 6;
        this.f26873e = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i11) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i12 = 7;
        this.f26874f = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i12) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i13 = 8;
        this.f26875g = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i13) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i14 = 9;
        this.f26876i = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i14) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i15 = 10;
        this.f26877j = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i15) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i16 = 11;
        this.f26879o = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i16) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i17 = 12;
        this.f26880p = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i17) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i18 = 13;
        this.t = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i18) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i19 = 0;
        this.f26883v = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i19) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i20 = 1;
        this.f26884w = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i20) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i21 = 2;
        this.f26861A = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i21) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i22 = 3;
        this.f26862B = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i22) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
        final int i23 = 4;
        this.f26863C = C2131j.b(new Function0(this) { // from class: C9.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1328b;

            {
                this.f1328b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RechargeActivity rechargeActivity = this.f1328b;
                switch (i23) {
                    case 0:
                        String str = RechargeActivity.f26858r0;
                        return (LinearLayout) rechargeActivity.findViewById(p366y9.b.rl_select_bank);
                    case 1:
                        String str2 = RechargeActivity.f26858r0;
                        return (MarqueeView) rechargeActivity.findViewById(p366y9.b.fun_txt_mv);
                    case 2:
                        String str3 = RechargeActivity.f26858r0;
                        return (SingleAdView) rechargeActivity.findViewById(p366y9.b.ciarAdView);
                    case 3:
                        String str4 = RechargeActivity.f26858r0;
                        return (ScrollView) rechargeActivity.findViewById(p366y9.b.ciarScrollView);
                    case 4:
                        String str5 = RechargeActivity.f26858r0;
                        return (PpTitleBar) rechargeActivity.findViewById(p366y9.b.ciar_page_top);
                    case 5:
                        String str6 = RechargeActivity.f26858r0;
                        return (RecyclerView) rechargeActivity.findViewById(p366y9.b.amount_rv);
                    case 6:
                        String str7 = RechargeActivity.f26858r0;
                        return (PpAmountEditText) rechargeActivity.findViewById(p366y9.b.inputAmount);
                    case 7:
                        String str8 = RechargeActivity.f26858r0;
                        return rechargeActivity.findViewById(p366y9.b.ciar_mantle);
                    case 8:
                        String str9 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.ciar_expire);
                    case 9:
                        String str10 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_no);
                    case 10:
                        String str11 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tv_bank_name);
                    case 11:
                        String str12 = RechargeActivity.f26858r0;
                        return (ImageView) rechargeActivity.findViewById(p366y9.b.iv_bank_icon);
                    case 12:
                        String str13 = RechargeActivity.f26858r0;
                        return (ConstraintLayout) rechargeActivity.findViewById(p366y9.b.rl_bank_info);
                    case 13:
                        String str14 = RechargeActivity.f26858r0;
                        return (FrameLayout) rechargeActivity.findViewById(p366y9.b.fl_add_bank_account);
                    default:
                        String str15 = RechargeActivity.f26858r0;
                        return (TextView) rechargeActivity.findViewById(p366y9.b.tvFeeTips);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return c.cash_in_activity_recharge;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void m() {
        KeyboardUtils.hideSoftInput(this);
        long j6 = this.f26867Q;
        if (j6 < DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            p().setError(getString(d.ci_above_amount, r0.B(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, false)));
            return;
        }
        if (j6 > 500000000) {
            p().setError(getString(d.ci_below_amount, r0.B(500000000L, false)));
            return;
        }
        Object value = this.f26874f.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        if (((View) value).getVisibility() == 0) {
            ToastUtils.showShort("Please select another fund method", new Object[0]);
            return;
        }
        if (r0.U0()) {
            return;
        }
        if (Intrinsics.c(this.f26864H, f26858r0) && this.f26868X == null) {
            ToastUtils.showShort(getString(d.ci_please_select_bank), new Object[0]);
            return;
        }
        if ((Intrinsics.c(this.f26864H, f26859s0) || Intrinsics.c(this.f26864H, f26860t0)) && this.f26869Y == null) {
            O6.c cVar = new O6.c(this);
            cVar.e(d.ci_you_havet_add_bank_or_account);
            cVar.b(d.ci_add_bank_card_or_account_to_fund);
            cVar.d(k.core_add_bank_card_account, new ViewOnClickListenerC0151s(this, 3));
            cVar.g().setCanceledOnTouchOutside(false);
            return;
        }
        if (this.f26867Q < 0) {
            ToastUtils.showShort("Input error", new Object[0]);
            return;
        }
        n0.g().l("Fund_BankCard_click_Next");
        CreateCashInOutOrderReqV2 req = new CreateCashInOutOrderReqV2();
        req.amount = this.f26867Q;
        req.transType = "01";
        PaymentMethod paymentMethod = this.f26868X;
        if (paymentMethod != null) {
            ExtendField extendField = new ExtendField(null, null, null, 7, null);
            extendField.payerBankCode = paymentMethod.bankCode;
            extendField.payerBankAccNo = paymentMethod.bankAccountNo;
            extendField.payerBankName = paymentMethod.bankName;
            req.extendField = extendField;
        }
        PaymentMethod paymentMethod2 = this.f26869Y;
        if (paymentMethod2 != null) {
            ExtendField extendField2 = new ExtendField(null, null, null, 7, null);
            extendField2.payerBankCode = paymentMethod2.bankCode;
            extendField2.payerBankAccNo = paymentMethod2.bankAccountNo;
            extendField2.payerBankName = paymentMethod2.bankName;
            req.extendField = extendField2;
        }
        FundViewModel fundViewModel = (FundViewModel) l();
        fundViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        f.s(fundViewModel, new C0325i(req, null), fundViewModel.f27097e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final PpTitleBar n() {
        Object value = this.f26863C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpTitleBar) value;
    }

    public final MarqueeView o() {
        Object value = this.f26884w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MarqueeView) value;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (100 == i7 && i10 == -1) {
            if ((intent != null ? intent.getParcelableExtra("BANK_CARD_INFO") : null) != null) {
                BankInfo bankInfo = (BankInfo) intent.getParcelableExtra("BANK_CARD_INFO");
                PaymentMethod paymentMethod = new PaymentMethod();
                Intrinsics.e(bankInfo);
                paymentMethod.bankCode = bankInfo.bankCode;
                paymentMethod.bankName = bankInfo.bankName;
                paymentMethod.bankUrl = bankInfo.bankUrl;
                paymentMethod.countryCode = bankInfo.countryCode;
                paymentMethod.payType = 13;
                paymentMethod.senderAccountType = 23;
                this.f26868X = paymentMethod;
                u(MsgEvent.MSG_EVENT_STOP_FOREGROUND);
                r(paymentMethod.bankUrl, paymentMethod.senderAccountType, paymentMethod.bankName, paymentMethod.expiryFlag, null);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankAccountClick() {
        q();
        SelectPayMethodDialog selectPayMethodDialog = this.f26866M;
        if (selectPayMethodDialog != null) {
            selectPayMethodDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankCardClick() {
        ARouter.getInstance().build("/coreImpl/add_new_card").withString("extra_type", "2").withString("extra_data_1", getLocalClassName()).navigation();
        SelectPayMethodDialog selectPayMethodDialog = this.f26866M;
        if (selectPayMethodDialog != null) {
            selectPayMethodDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onAddNewBankCardOrBankAccountClick() {
        q();
        SelectPayMethodDialog selectPayMethodDialog = this.f26866M;
        if (selectPayMethodDialog != null) {
            selectPayMethodDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onChoosePayMethodClick(PaymentMethod paymentMethod, PreviewPayInfoResp.DataBean dataBean) {
        if (paymentMethod != null) {
            this.f26869Y = paymentMethod;
            SelectPayMethodDialog selectPayMethodDialog = this.f26866M;
            if (selectPayMethodDialog != null) {
                selectPayMethodDialog.dismiss();
            }
            PaymentMethod paymentMethod2 = this.f26869Y;
            if (paymentMethod2 != null) {
                String str = paymentMethod2.bankUrl;
                String str2 = paymentMethod2.bankName;
                String str3 = paymentMethod2.cardNo;
                r(str, paymentMethod2.senderAccountType, str2, paymentMethod2.expiryFlag, str3);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        org.greenrobot.eventbus.c.b().l(this);
        this.f26881p0.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 275 || eventType == 291) {
            String eventContent = event.getEventContent();
            if (TextUtils.isEmpty(eventContent) || Intrinsics.c(getLocalClassName(), eventContent)) {
                Object eventObj = event.getEventObj();
                Intrinsics.f(eventObj, "null cannot be cast to non-null type com.transsnet.palmpay.core.bean.PaymentMethod");
                PaymentMethod paymentMethod = (PaymentMethod) eventObj;
                this.f26869Y = paymentMethod;
                u(101);
                String str = paymentMethod.bankUrl;
                String str2 = paymentMethod.bankName;
                String str3 = paymentMethod.cardNo;
                r(str, paymentMethod.senderAccountType, str2, paymentMethod.expiryFlag, str3);
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        setIntent(intent);
        String stringExtra = intent.getStringExtra("extra_type");
        if (stringExtra == null) {
            stringExtra = f26859s0;
        }
        this.f26864H = stringExtra;
        String stringExtra2 = intent.getStringExtra("extra_title");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f26865L = stringExtra2;
        v();
        s();
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectPayMethodDialog.CallBack
    public final void onUseUSSDClick() {
    }

    public final PpAmountEditText p() {
        Object value = this.f26873e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PpAmountEditText) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        org.greenrobot.eventbus.c.b().j(this);
        l lVar = ((FundViewModel) l()).f27097e;
        if (lVar != null) {
            lVar.e(this, new C0144k(new C0154v(this, this, 0), 1));
        }
        l lVar2 = ((FundViewModel) l()).f27100i;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new C0154v(this, this, 1), 1));
        }
        l lVar3 = ((FundViewModel) l()).f27101j;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new C0154v(this, this, 2), 1));
        }
        l lVar4 = ((FundViewModel) l()).f27103p;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new C0154v(this, this, 3), 1));
        }
        l lVar5 = ((FundViewModel) l()).f27099g;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new C0154v(this, this, 4), 1));
        }
        final int i7 = 0;
        n.B(this, ((FundViewModel) l()).f27102o, this, new Function2(this) { // from class: C9.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1330b;

            {
                this.f1330b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PaymentMethodV3Resp.DataBean dataBean;
                List<PaymentMethod> list;
                switch (i7) {
                    case 0:
                        USSDFundResultReq uSSDFundResultReq = (USSDFundResultReq) obj;
                        USSDFundResp resp = (USSDFundResp) obj2;
                        String str = RechargeActivity.f26858r0;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess()) {
                            ARouter.getInstance().build("/cashin/ussd_result").withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(resp.data)).withString("extra_type", uSSDFundResultReq != null ? uSSDFundResultReq.transType : null).withString("orderId", uSSDFundResultReq != null ? uSSDFundResultReq.orderNo : null).withLong("extra_amount", uSSDFundResultReq != null ? uSSDFundResultReq.amout : 0L).navigation();
                        } else {
                            p220oa.h.x(this.f1330b, resp.getRespMsg());
                        }
                        break;
                    default:
                        K9.a aVar = (K9.a) obj;
                        PaymentMethodV3Resp response = (PaymentMethodV3Resp) obj2;
                        String str2 = RechargeActivity.f26858r0;
                        Intrinsics.checkNotNullParameter(response, "response");
                        if (response.isSuccess()) {
                            RechargeActivity rechargeActivity = this.f1330b;
                            if ((Intrinsics.c(RechargeActivity.f26859s0, rechargeActivity.f26864H) || Intrinsics.c(RechargeActivity.f26860t0, rechargeActivity.f26864H)) && (dataBean = response.data) != null && (list = dataBean.payAble) != null) {
                                if (list.isEmpty()) {
                                    rechargeActivity.u(105);
                                } else {
                                    rechargeActivity.u(101);
                                    if (rechargeActivity.f26869Y == null) {
                                        PaymentMethod paymentMethod = list.get(0);
                                        rechargeActivity.f26869Y = paymentMethod;
                                        if (paymentMethod != null) {
                                            rechargeActivity.r(paymentMethod.bankUrl, paymentMethod.senderAccountType, paymentMethod.bankName, paymentMethod.expiryFlag, paymentMethod.cardNo);
                                        }
                                    }
                                }
                            }
                            if (aVar != null && aVar.f4969a) {
                                List<PaymentMethod> payAble = response.data.payAble;
                                Intrinsics.checkNotNullExpressionValue(payAble, "payAble");
                                if (rechargeActivity.f26866M == null) {
                                    rechargeActivity.f26866M = new SelectPayMethodDialog(rechargeActivity);
                                }
                                SelectPayMethodDialog selectPayMethodDialog = rechargeActivity.f26866M;
                                if (selectPayMethodDialog != null) {
                                    selectPayMethodDialog.setCallBack(rechargeActivity);
                                    selectPayMethodDialog.setPaymentMethodOptions(3);
                                    selectPayMethodDialog.setPayMethods(payAble);
                                    PaymentMethod paymentMethod2 = rechargeActivity.f26869Y;
                                    if (paymentMethod2 != null) {
                                        selectPayMethodDialog.setSelectedPayMethod(paymentMethod2);
                                    }
                                    selectPayMethodDialog.show();
                                    selectPayMethodDialog.setIsFundType(true);
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new B(3), true, null, 224);
        final int i10 = 1;
        n.B(this, ((FundViewModel) l()).f27098f, this, new Function2(this) { // from class: C9.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RechargeActivity f1330b;

            {
                this.f1330b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PaymentMethodV3Resp.DataBean dataBean;
                List<PaymentMethod> list;
                switch (i10) {
                    case 0:
                        USSDFundResultReq uSSDFundResultReq = (USSDFundResultReq) obj;
                        USSDFundResp resp = (USSDFundResp) obj2;
                        String str = RechargeActivity.f26858r0;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess()) {
                            ARouter.getInstance().build("/cashin/ussd_result").withString("extra_data", ((Gson) C0525w.f().f7166b).toJson(resp.data)).withString("extra_type", uSSDFundResultReq != null ? uSSDFundResultReq.transType : null).withString("orderId", uSSDFundResultReq != null ? uSSDFundResultReq.orderNo : null).withLong("extra_amount", uSSDFundResultReq != null ? uSSDFundResultReq.amout : 0L).navigation();
                        } else {
                            p220oa.h.x(this.f1330b, resp.getRespMsg());
                        }
                        break;
                    default:
                        K9.a aVar = (K9.a) obj;
                        PaymentMethodV3Resp response = (PaymentMethodV3Resp) obj2;
                        String str2 = RechargeActivity.f26858r0;
                        Intrinsics.checkNotNullParameter(response, "response");
                        if (response.isSuccess()) {
                            RechargeActivity rechargeActivity = this.f1330b;
                            if ((Intrinsics.c(RechargeActivity.f26859s0, rechargeActivity.f26864H) || Intrinsics.c(RechargeActivity.f26860t0, rechargeActivity.f26864H)) && (dataBean = response.data) != null && (list = dataBean.payAble) != null) {
                                if (list.isEmpty()) {
                                    rechargeActivity.u(105);
                                } else {
                                    rechargeActivity.u(101);
                                    if (rechargeActivity.f26869Y == null) {
                                        PaymentMethod paymentMethod = list.get(0);
                                        rechargeActivity.f26869Y = paymentMethod;
                                        if (paymentMethod != null) {
                                            rechargeActivity.r(paymentMethod.bankUrl, paymentMethod.senderAccountType, paymentMethod.bankName, paymentMethod.expiryFlag, paymentMethod.cardNo);
                                        }
                                    }
                                }
                            }
                            if (aVar != null && aVar.f4969a) {
                                List<PaymentMethod> payAble = response.data.payAble;
                                Intrinsics.checkNotNullExpressionValue(payAble, "payAble");
                                if (rechargeActivity.f26866M == null) {
                                    rechargeActivity.f26866M = new SelectPayMethodDialog(rechargeActivity);
                                }
                                SelectPayMethodDialog selectPayMethodDialog = rechargeActivity.f26866M;
                                if (selectPayMethodDialog != null) {
                                    selectPayMethodDialog.setCallBack(rechargeActivity);
                                    selectPayMethodDialog.setPaymentMethodOptions(3);
                                    selectPayMethodDialog.setPayMethods(payAble);
                                    PaymentMethod paymentMethod2 = rechargeActivity.f26869Y;
                                    if (paymentMethod2 != null) {
                                        selectPayMethodDialog.setSelectedPayMethod(paymentMethod2);
                                    }
                                    selectPayMethodDialog.show();
                                    selectPayMethodDialog.setIsFundType(true);
                                }
                            }
                        } else {
                            ToastUtils.showLong(response.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new B(4), true, null, 224);
        l lVar6 = ((FundViewModel) l()).t;
        if (lVar6 != null) {
            lVar6.e(this, new C0144k(new C0154v(this, this, 5), 1));
        }
        l lVar7 = ((FundViewModel) l()).f27104v;
        if (lVar7 != null) {
            lVar7.e(this, new C0144k(new C0139f(this, 1), 1));
        }
        s();
    }

    public final void q() {
        ARouter.getInstance().build("/coreImpl/add_new_card").withString("extra_type", "2").withString("extra_data_1", getLocalClassName()).navigation();
    }

    public final void r(String str, int i7, String str2, boolean z3, String str3) {
        String str4;
        if (i7 != 5) {
            str4 = i7 != 6 ? f26858r0 : f26860t0;
        } else {
            str4 = f26859s0;
        }
        this.f26864H = str4;
        Object value = this.f26879o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ImageView imageView = (ImageView) value;
        if (str == null) {
            str = "";
        }
        r0.h1(imageView, str, r.cv_default_bank_logo);
        Object value2 = this.f26877j.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(str2);
        if (str3 != null) {
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                t tVar = this.f26876i;
                Object value3 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                h.s((TextView) value3, true);
                if (i7 == 6) {
                    Object value4 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((TextView) value4).setText(r0.G(str3));
                } else {
                    Object value5 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                    ((TextView) value5).setText(r0.I(str3));
                }
            }
        }
        Object value6 = this.f26875g.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        h.s((TextView) value6, z3);
        Object value7 = this.f26874f.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        h.s((View) value7, z3);
    }

    public final void s() {
        String str = this.f26864H;
        String str2 = f26858r0;
        if (Intrinsics.c(str2, str)) {
            u(104);
        }
        if (Intrinsics.c(f26859s0, this.f26864H) || Intrinsics.c(f26860t0, this.f26864H)) {
            t(false);
        } else if (Intrinsics.c(str2, this.f26864H)) {
            FundViewModel fundViewModel = (FundViewModel) l();
            fundViewModel.getClass();
            f.s(fundViewModel, new o(1, null), fundViewModel.f27101j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            FundViewModel fundViewModel2 = (FundViewModel) l();
            fundViewModel2.getClass();
            f.s(fundViewModel2, new p(1, null), fundViewModel2.f27103p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        FundViewModel fundViewModel3 = (FundViewModel) l();
        int i7 = Intrinsics.c(this.f26864H, str2) ? 14 : 13;
        fundViewModel3.getClass();
        f.s(fundViewModel3, new C0326j(i7, null), fundViewModel3.f27104v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 0;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
        ArrayList data = new ArrayList();
        data.add(Long.valueOf(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT));
        data.add(100000L);
        data.add(200000L);
        data.add(300000L);
        data.add(500000L);
        data.add(999900L);
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        E9.b bVar = new E9.b(this, data);
        t tVar = this.f26872d;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new GridLayoutManager((Context) this, 3, 1, false));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setAdapter(bVar);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).addItemDecoration(new C0157y());
        p1.d itemClickListener = new p1.d(1, this, data);
        Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
        bVar.f4993c = itemClickListener;
        n().setRightTextViewClickListener(new ViewOnClickListenerC0151s(this, i7));
        n().setBackButtonClickListener(new ViewOnClickListenerC0151s(this, 2));
        Object value4 = this.f26883v.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        Object value5 = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        Object value6 = this.f26880p.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        h.q(this.f26882q0, (LinearLayout) value4, (FrameLayout) value5, (ConstraintLayout) value6);
        v();
        p().setActionButtonListener(new ViewOnClickListenerC0151s(this, 4));
        p().setTextInputListener(new A8.a(this, 18));
        p().setOnClickListener(new ViewOnClickListenerC0151s(this, 5));
        if (Intrinsics.c(f26858r0, this.f26864H)) {
            o().setSlotId(getString(k.fund_ussd_txt_slot_id));
        }
        o().setAdListener(new C0158z(this, i7));
        Object value7 = this.f26861A.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        org.chromium.support_lib_boundary.util.b.c((SingleAdView) value7);
    }

    public final void t(boolean z3) {
        PaymentMethodReq req = new PaymentMethodReq();
        req.transType = "01";
        req.morePayerAccountType = C1850q.h(5, 6);
        FundViewModel fundViewModel = (FundViewModel) l();
        fundViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        J9.n nVar = new J9.n(req, null);
        K9.a aVar = new K9.a();
        aVar.f4969a = z3;
        l lVar = fundViewModel.f27098f;
        lVar.f27356m = aVar;
        Unit unit = Unit.f38893a;
        f.v(fundViewModel, nVar, lVar, 0L);
    }

    public final void u(int i7) {
        t tVar = this.f26880p;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        h.s((ConstraintLayout) value, false);
        t tVar2 = this.f26883v;
        Object value2 = tVar2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        h.s((LinearLayout) value2, false);
        t tVar3 = this.t;
        Object value3 = tVar3.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.s((FrameLayout) value3, false);
        switch (i7) {
            case 101:
            case 102:
            case MsgEvent.MSG_EVENT_STOP_FOREGROUND /* 103 */:
                Object value4 = tVar.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                h.s((ConstraintLayout) value4, true);
                break;
            case 104:
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                h.s((LinearLayout) value5, true);
                break;
            case 105:
                Object value6 = tVar3.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                h.s((FrameLayout) value6, true);
                break;
        }
    }

    public final void v() {
        String strString;
        if (!TextUtils.isEmpty(this.f26865L)) {
            n().setTitle(this.f26865L);
            return;
        }
        PpTitleBar ppTitleBarN = n();
        String str = this.f26864H;
        if (Intrinsics.c(str, f26858r0)) {
            strString = CommonViewExtKt.string(d.ci_add_money_via_ussd, this);
        } else {
            strString = (Intrinsics.c(str, f26859s0) || Intrinsics.c(str, f26860t0)) ? CommonViewExtKt.string(d.ci_bank_card_account, this) : CommonViewExtKt.string(k.core_add_money, this);
        }
        ppTitleBarN.setTitle(strString);
    }
}
