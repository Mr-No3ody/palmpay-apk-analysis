package com.transsnet.palmpay.credit.ui.activity;

import Ab.k;
import C0.G;
import C9.C0158z;
import Db.A;
import Db.B;
import Db.w;
import Db.x;
import Db.z;
import E.N;
import J1.g;
import L6.b;
import Pa.n0;
import Wf.t0;
import Ya.e;
import Ya.f;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.m;
import com.facebook.react.uimanager.ViewProps;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.req.ParseInstalmentsQrcodeReq;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmActivity;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.credit.ui.viewmodel.PayShopHomeViewModel;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import io.fastkv.n;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.Nullable;
import p141j9.C1794b;
import p141j9.C1798f;
import p141j9.C1807o;
import p173ld.o;
import p220oa.h;
import p270rd.C1976t;
import p284sb.C2020s;
import p284sb.C2021t;
import p284sb.C2022u;
import p284sb.C2023v;
import p284sb.C2024w;
import p284sb.C2025x;
import p339wb.q;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/bind_merchant")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/PayShopHomeActivity;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmActivity;", "Lcom/transsnet/palmpay/credit/ui/viewmodel/PayShopHomeViewModel;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayShopHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayShopHomeActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,519:1\n115#2,8:520\n145#2:528\n171#2,12:529\n215#2:541\n171#2,12:542\n215#2:554\n152#2:555\n169#2:556\n115#2,8:557\n145#2:565\n*S KotlinDebug\n*F\n+ 1 PayShopHomeActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/PayShopHomeActivity\n*L\n196#1:520,8\n196#1:528\n216#1:529,12\n216#1:541\n226#1:542,12\n226#1:554\n266#1:555\n266#1:556\n278#1:557,8\n278#1:565\n*E\n"})
public final class PayShopHomeActivity extends CreditBaseMvvmActivity<PayShopHomeViewModel> implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f28705p0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f28706A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f28707B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f28708C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f28709H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f28710L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f28711M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f28712Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f28713X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f28714Y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f28717g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f28718i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f28719j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f28721o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f28722p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f28723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f28724w;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Integer f28715Z = -1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f28720k0 = C2131j.b(new C1976t(5));

    public PayShopHomeActivity() {
        final int i7 = 10;
        this.f28716f = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i7) {
                    case 0:
                        int i10 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i11 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i12 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i13 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i14 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i15 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i16 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i10 = 1;
        this.f28717g = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i10) {
                    case 0:
                        int i11 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i12 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i13 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i14 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i15 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i16 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i11 = 2;
        this.f28718i = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i11) {
                    case 0:
                        int i12 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i13 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i14 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i15 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i16 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i12 = 3;
        this.f28719j = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i12) {
                    case 0:
                        int i13 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i14 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i15 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i16 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i13 = 4;
        this.f28721o = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i13) {
                    case 0:
                        int i14 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i15 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i16 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i14 = 5;
        this.f28722p = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i14) {
                    case 0:
                        int i15 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i16 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i15 = 6;
        this.t = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i15) {
                    case 0:
                        int i16 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i16 = 7;
        this.f28723v = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i16) {
                    case 0:
                        int i17 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i17 = 8;
        this.f28724w = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i17) {
                    case 0:
                        int i18 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i18 = 9;
        this.f28706A = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i18) {
                    case 0:
                        int i19 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i19 = 11;
        this.f28707B = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i19) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i20 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i20 = 12;
        this.f28708C = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i20) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i21 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i28 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i21 = 13;
        this.f28709H = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i21) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i22 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i28 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i29 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i22 = 14;
        this.f28710L = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i22) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i23 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i28 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i29 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i210 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i23 = 15;
        this.f28711M = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i23) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i24 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i28 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i29 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i210 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i211 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i24 = 16;
        this.f28712Q = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i24) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i25 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i28 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i29 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i210 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i211 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i212 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i25 = 17;
        this.f28713X = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i25) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i26 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i28 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i29 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i210 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i211 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i212 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i213 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
        final int i26 = 0;
        this.f28714Y = C2131j.b(new Function0(this) { // from class: sb.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopHomeActivity f42178b;

            {
                this.f42178b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayShopHomeActivity payShopHomeActivity = this.f42178b;
                switch (i26) {
                    case 0:
                        int i110 = PayShopHomeActivity.f28705p0;
                        return (PpTitleBar) payShopHomeActivity.findViewById(e.title_bar);
                    case 1:
                        int i111 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_bottom_banner);
                    case 2:
                        int i112 = PayShopHomeActivity.f28705p0;
                        return (RecyclerView) payShopHomeActivity.findViewById(e.rv_past_shop);
                    case 3:
                        int i113 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_more);
                    case 4:
                        int i114 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_past_shop);
                    case 5:
                        int i115 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutBottom);
                    case 6:
                        int i116 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tvCopyWriting);
                    case 7:
                        int i117 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.ivPicture);
                    case 8:
                        int i118 = PayShopHomeActivity.f28705p0;
                        return (LinearLayout) payShopHomeActivity.findViewById(e.layoutCouponAndPoint);
                    case 9:
                        int i119 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_next);
                    case 10:
                        int i27 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_cashback);
                    case 11:
                        int i28 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_merchant_name);
                    case 12:
                        int i29 = PayShopHomeActivity.f28705p0;
                        return (ConstraintLayout) payShopHomeActivity.findViewById(e.ll_merchant_name);
                    case 13:
                        int i210 = PayShopHomeActivity.f28705p0;
                        return (TextView) payShopHomeActivity.findViewById(e.tv_error);
                    case 14:
                        int i211 = PayShopHomeActivity.f28705p0;
                        return (EditText) payShopHomeActivity.findViewById(e.et_account);
                    case 15:
                        int i212 = PayShopHomeActivity.f28705p0;
                        return (ImageView) payShopHomeActivity.findViewById(e.iv_scan);
                    case 16:
                        int i213 = PayShopHomeActivity.f28705p0;
                        return (SingleAdView) payShopHomeActivity.findViewById(e.ad_top);
                    default:
                        int i214 = PayShopHomeActivity.f28705p0;
                        return (MarqueeView) payShopHomeActivity.findViewById(e.viewNotice);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.cs_activity_pay_shop_home;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((PayShopHomeViewModel) l()).f30700i;
        if (lVar != null) {
            lVar.e(this, new C2023v(new C2021t(this, 0), 0));
        }
        l lVar2 = ((PayShopHomeViewModel) l()).f30699g;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new C2022u(this, this, 0), 0));
        }
        l lVar3 = ((PayShopHomeViewModel) l()).f30701j;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new C2022u(this, this, 1), 0));
        }
        n.B(this, ((PayShopHomeViewModel) l()).f30697e, this, new C1807o(this, 9), new C1798f(this, 17), false, null, 224);
        l lVar4 = ((PayShopHomeViewModel) l()).f30702o;
        if (lVar4 != null) {
            lVar4.e(this, new C2023v(new C2021t(this, 2), 0));
        }
        l lVar5 = ((PayShopHomeViewModel) l()).f30703p;
        if (lVar5 != null) {
            lVar5.e(this, new C2023v(new C2021t(this, 1), 0));
        }
    }

    public final void n(ParseInstalmentsQrcodeRsp.DataBean dataBean) {
        if (dataBean != null) {
            h.c(s());
            h.C(u());
            h.C(q());
            SpanUtils spanUtilsAppend = new SpanUtils().setFontSize(SizeUtils.dp2px(14.0f)).setForegroundColor(getColor(b.ppColorTextPrimary)).setFontFamily("sans-serif-medium").append(dataBean.merchantName);
            if (dataBean.labelType != 0) {
                spanUtilsAppend.appendSpace(SizeUtils.dp2px(8.0f));
                spanUtilsAppend.appendImage(dataBean.labelType == 1 ? r.cv_sm_ic_send_agent_tag : r.cv_sm_ic_send_merchant_tag, 2);
            }
            if (TextUtils.isEmpty(dataBean.cashBackPictureUrl)) {
                t().setText(spanUtilsAppend.create());
            } else {
                m mVar = (m) com.bumptech.glide.b.c(this).e(this).load(dataBean.cashBackPictureUrl).c();
                mVar.T(new C2020s(spanUtilsAppend, this), null, mVar, g.f4461a);
            }
        }
    }

    public final String o() {
        return y.k(p().getText().toString(), " ", "");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = e.tv_more;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            n0.g().l("PayshopHomepageMore");
            ARouter.getInstance().build("/credit_score/past_shop").navigation();
            return;
        }
        int i10 = e.iv_scan;
        if (numValueOf != null && numValueOf.intValue() == i10) {
            n0.g().l("PayshopHomepageScanning");
            ARouter.getInstance().build("/qrcode/scan").navigation();
            return;
        }
        int i11 = e.tv_next;
        if (numValueOf == null || numValueOf.intValue() != i11) {
            int i12 = e.ll_merchant_name;
            if (numValueOf == null || numValueOf.intValue() != i12) {
                return;
            }
        }
        if (v3 != null && v3.getId() == e.tv_next) {
            n0.g().l("PayshopHomepageNext");
        }
        if (v3 != null && v3.getId() == e.ll_merchant_name) {
            n0.g().l("PayshopHomepageResult");
        }
        if (o().length() >= 8 && o().length() != 9) {
            v(o(), true);
            return;
        }
        h.C(s());
        s().setText("The merchant number entered is incorrect, please re-enter 10-digits or 8-digits account number");
        h.c(q());
    }

    public final EditText p() {
        Object value = this.f28710L.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (EditText) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PayShopHomeViewModel payShopHomeViewModel = (PayShopHomeViewModel) l();
        payShopHomeViewModel.getClass();
        p140j8.f.s(payShopHomeViewModel, new x(1, null), payShopHomeViewModel.f30703p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        PayShopHomeViewModel payShopHomeViewModel2 = (PayShopHomeViewModel) l();
        payShopHomeViewModel2.getClass();
        p140j8.f.s(payShopHomeViewModel2, new Db.y(1, null), payShopHomeViewModel2.f30700i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        if (!SPUtils.getInstance().getBoolean(BaseApplication.get().getUser().getMemberId())) {
            PayShopHomeViewModel payShopHomeViewModel3 = (PayShopHomeViewModel) l();
            payShopHomeViewModel3.getClass();
            p140j8.f.s(payShopHomeViewModel3, new w(1, null), payShopHomeViewModel3.f30702o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        Integer num = this.f28715Z;
        if (num != null && num.intValue() == 1) {
            PayShopHomeViewModel payShopHomeViewModel4 = (PayShopHomeViewModel) l();
            payShopHomeViewModel4.getClass();
            p140j8.f.s(payShopHomeViewModel4, new z(1, null), payShopHomeViewModel4.f30701j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final ConstraintLayout q() {
        Object value = this.f28708C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    public final RecyclerView r() {
        Object value = this.f28718i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final TextView s() {
        Object value = this.f28709H.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(Ya.b.cs_main_color));
        Object value = this.f28714Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).setRightImageView2ClickListener(new o(this, 28));
        Object value2 = this.f28711M.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        h.l(this, (ImageView) value2);
        h.l(this, u());
        h.l(this, q());
        Object value3 = this.f28719j.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.l(this, (TextView) value3);
        p().requestFocus();
        KeyboardUtils.showSoftInput(p());
        p().setHint(G.i("").append(getString(Ya.g.cs_8_or_10_digits_account_number)).setFontSize(ScreenUtils.dip2px(12.0f)).create());
        h.r(p(), new C2024w(this), null);
        t tVar = this.f28720k0;
        ((q) tVar.getValue()).setOnItemClickListener(new C1794b(this, 26));
        r().setAdapter((q) tVar.getValue());
        r().setLayoutManager(new LinearLayoutManager(this));
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), getResources().getDimensionPixelOffset(com.transsnet.palmpay.custom_view.q.dp1), 0, 0);
        c1548f.f31336e = false;
        r().addItemDecoration(c1548f);
        Object value4 = this.f28712Q.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((SingleAdView) value4).setAdListener(new C0158z(this, 17));
        Object value5 = this.f28716f.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((SingleAdView) value5).setAdListener(new k(29));
        MarqueeView marqueeView = (MarqueeView) this.f28713X.getValue();
        Boolean bool = Boolean.TRUE;
        org.chromium.support_lib_boundary.util.b.d(marqueeView, bool);
        Object value6 = this.f28717g.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        org.chromium.support_lib_boundary.util.b.d((SingleAdView) value6, bool);
        w(false);
    }

    public final TextView t() {
        Object value = this.f28707B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final TextView u() {
        Object value = this.f28706A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void v(String str, boolean z3) {
        t0 t0Var;
        t0 t0Var2;
        t0 t0Var3;
        ParseInstalmentsQrcodeReq req = new ParseInstalmentsQrcodeReq("", str);
        if (z3) {
            PayShopHomeViewModel payShopHomeViewModel = (PayShopHomeViewModel) l();
            payShopHomeViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            p140j8.f.v(payShopHomeViewModel, new A(req, null), payShopHomeViewModel.f30699g, 0L);
            return;
        }
        PayShopHomeViewModel payShopHomeViewModel2 = (PayShopHomeViewModel) l();
        payShopHomeViewModel2.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        t0 t0Var4 = payShopHomeViewModel2.f30698f;
        if (t0Var4 != null && t0Var4.isActive() && (t0Var = payShopHomeViewModel2.f30698f) != null && !t0Var.isCancelled() && (t0Var2 = payShopHomeViewModel2.f30698f) != null && !t0Var2.isCompleted() && (t0Var3 = payShopHomeViewModel2.f30698f) != null) {
            t0Var3.cancel((CancellationException) null);
        }
        B b7 = new B(req, null);
        String str2 = req.snNo;
        l lVar = payShopHomeViewModel2.f30697e;
        lVar.f27356m = str2;
        Unit unit = Unit.f38893a;
        payShopHomeViewModel2.f30698f = p140j8.f.v(payShopHomeViewModel2, b7, lVar, 200L);
    }

    public final void w(boolean z3) {
        String string = getString(p025ba.k.ad_pay_shop_home_pop_slot_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        InterstitialAdView interstitialAdView = new InterstitialAdView(string, null);
        interstitialAdView.setInterstitialListener(new C2025x(0));
        interstitialAdView.show(this, new N(z3, 10));
    }

    public final void x(String str) {
        h.C(u());
        h.C(s());
        s().setText(str);
        h.c(q());
    }
}
