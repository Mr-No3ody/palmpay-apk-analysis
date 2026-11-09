package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import Pa.C0525w;
import Pa.i0;
import Ya.b;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.utils.n;
import androidx.core.app.AbstractC1032a;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.gson.Gson;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.credit.bean.rsp.OkCardMainPageRspData;
import com.transsnet.palmpay.credit.bean.rsp.TopTipsData;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcMainActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcRecommendDialog;
import com.transsnet.palmpay.credit.ui.fragment.OcMainFragment;
import com.transsnet.palmpay.credit.view.OcModelOkCard;
import com.transsnet.palmpay.util.BarUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.sufficientlysecure.htmltextview.h;
import p183m6.j;
import p221ob.c;
import p284sb.C2025x;
import p310ub.h1;
import p355xf.C2131j;
import p355xf.t;
import p368yb.B;
import p382zb.a0;
import p382zb.b0;
import p382zb.c0;
import p382zb.d0;
import p382zb.e0;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_main_fragment")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcMainFragment;", "Lcom/transsnet/palmpay/credit/ui/fragment/OcBaseFragment;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcMainFragment extends OcBaseFragment {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ int f30445B0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f30446A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public B f30447A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f30448B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f30449C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f30450H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30451L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f30452M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f30453Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final t f30454X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final t f30455Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f30456Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f30457k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f30458p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f30459q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f30460r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f30461s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f30462t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f30463u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f30464v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f30465v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f30466w;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f30468x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public OcGuideFragment f30469y0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f30467w0 = true;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final ArrayList f30470z0 = new ArrayList();

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

    public OcMainFragment() {
        final int i7 = 0;
        this.f30464v = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i7) {
                    case 0:
                        int i10 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i11 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i12 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i13 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i14 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i15 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i16 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i17 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i18 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i19 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i10 = 15;
        this.f30466w = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i10) {
                    case 0:
                        int i11 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i12 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i13 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i14 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i15 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i16 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i17 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i18 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i19 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i110 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i11 = 16;
        this.f30446A = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i11) {
                    case 0:
                        int i12 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i13 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i14 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i15 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i16 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i17 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i18 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i19 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i110 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i111 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i12 = 1;
        this.f30448B = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i12) {
                    case 0:
                        int i13 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i14 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i15 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i16 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i17 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i18 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i19 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i110 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i111 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i112 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i13 = 2;
        this.f30449C = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i13) {
                    case 0:
                        int i14 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i15 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i16 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i17 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i18 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i19 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i110 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i111 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i112 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i113 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i14 = 3;
        this.f30450H = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i14) {
                    case 0:
                        int i15 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i16 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i17 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i18 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i19 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i110 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i111 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i112 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i113 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i114 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i15 = 4;
        this.f30451L = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i15) {
                    case 0:
                        int i16 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i17 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i18 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i19 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i110 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i111 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i112 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i113 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i115 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i16 = 5;
        this.f30452M = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i16) {
                    case 0:
                        int i17 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i18 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i19 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i110 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i111 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i112 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i113 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i114 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i115 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i116 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i17 = 6;
        this.f30453Q = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i17) {
                    case 0:
                        int i18 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i19 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i110 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i111 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i112 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i113 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i114 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i115 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i116 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i117 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i18 = 7;
        this.f30454X = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i18) {
                    case 0:
                        int i19 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i111 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i112 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i113 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i114 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i115 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i116 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i117 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i118 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i19 = 8;
        this.f30455Y = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i19) {
                    case 0:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i111 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i112 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i113 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i115 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i116 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i117 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i118 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i119 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i20 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i21 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i22 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i23 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i20 = 9;
        this.f30456Z = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i20) {
                    case 0:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i111 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i112 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i113 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i115 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i116 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i117 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i118 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i119 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i21 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i22 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i23 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i24 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i25 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i26 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i27 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i21 = 10;
        this.f30457k0 = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i21) {
                    case 0:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i111 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i112 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i113 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i115 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i116 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i117 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i118 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i119 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i22 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i23 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i24 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i25 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i26 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i27 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i28 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i22 = 11;
        this.f30458p0 = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i22) {
                    case 0:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i111 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i112 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i113 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i115 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i116 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i117 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i118 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i119 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i23 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i24 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i25 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i26 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i27 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i28 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i29 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i23 = 12;
        this.f30459q0 = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i23) {
                    case 0:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i111 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i112 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i113 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i115 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i116 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i117 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i118 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i119 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i24 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i25 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i26 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i27 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i28 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i29 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i210 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i24 = 13;
        this.f30460r0 = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i24) {
                    case 0:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i111 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i112 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i113 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i115 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i116 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i117 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i118 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i119 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i25 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i26 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i27 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i28 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i29 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i210 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i211 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
        final int i25 = 14;
        this.f30461s0 = C2131j.b(new Function0(this) { // from class: zb.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcMainFragment f44562b;

            {
                this.f44562b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcMainFragment ocMainFragment = this.f44562b;
                switch (i25) {
                    case 0:
                        int i110 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_right_adView);
                    case 1:
                        int i111 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.adView);
                    case 2:
                        int i112 = OcMainFragment.f30445B0;
                        return (RecyclerView) ocMainFragment.f27318b.findViewById(e.menu_rv);
                    case 3:
                        int i113 = OcMainFragment.f30445B0;
                        return (OcModelOkCard) ocMainFragment.f27318b.findViewById(e.oc_model_omoc);
                    case 4:
                        int i114 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.top_tips_tv);
                    case 5:
                        int i115 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.main_content_ll);
                    case 6:
                        int i116 = OcMainFragment.f30445B0;
                        return (NestedScrollView) ocMainFragment.f27318b.findViewById(e.oc_nsv);
                    case 7:
                        int i117 = OcMainFragment.f30445B0;
                        return (IconicsImageView) ocMainFragment.f27318b.findViewById(e.right_menu_img);
                    case 8:
                        int i118 = OcMainFragment.f30445B0;
                        return (TextView) ocMainFragment.f27318b.findViewById(e.logo_img);
                    case 9:
                        int i119 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.left_arrow_img);
                    case 10:
                        int i26 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.oc_main_top_ll);
                    case 11:
                        int i27 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.oc_main_top_sav);
                    case 12:
                        int i28 = OcMainFragment.f30445B0;
                        return (ImageView) ocMainFragment.f27318b.findViewById(e.oc_main_top_default);
                    case 13:
                        int i29 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_normal_ll);
                    case 14:
                        int i210 = OcMainFragment.f30445B0;
                        return (FrameLayout) ocMainFragment.f27318b.findViewById(e.oc_guide_fl);
                    case 15:
                        int i211 = OcMainFragment.f30445B0;
                        return (SingleAdView) ocMainFragment.f27318b.findViewById(e.bottom_left_adView);
                    default:
                        int i212 = OcMainFragment.f30445B0;
                        return (LinearLayout) ocMainFragment.f27318b.findViewById(e.ad_ll);
                }
            }
        });
    }

    public final TextView A() {
        Object value = this.f30451L.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final void B() {
        E activity = getActivity();
        if (activity != null) {
            BarUtils.setStatusBarLightMode((Activity) activity, true);
        }
        Object value = this.f30461s0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((FrameLayout) value).setVisibility(0);
        Object value2 = this.f30460r0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((FrameLayout) value2).setVisibility(8);
        if (this.f30469y0 == null) {
            this.f30469y0 = new OcGuideFragment();
            if (getArguments() == null) {
                Bundle bundle = new Bundle();
                C0525w c0525wF = C0525w.f();
                bundle.putString("oc_guide_data", ((Gson) c0525wF.f7166b).toJson(this.f30369o));
                bundle.putBoolean("KEY_NEED_BACK", true);
                bundle.putString("oc_apply_enter_point", "HOME");
                OcGuideFragment ocGuideFragment = this.f30469y0;
                if (ocGuideFragment == null) {
                    Intrinsics.n("mGuideFragment");
                    throw null;
                }
                ocGuideFragment.setArguments(bundle);
            } else {
                Bundle arguments = getArguments();
                if (arguments != null) {
                    C0525w c0525wF2 = C0525w.f();
                    arguments.putString("oc_guide_data", ((Gson) c0525wF2.f7166b).toJson(this.f30369o));
                }
                Bundle arguments2 = getArguments();
                if (arguments2 != null) {
                    arguments2.putBoolean("KEY_NEED_BACK", true);
                }
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    arguments3.putString("oc_apply_enter_point", "HOME");
                }
                OcGuideFragment ocGuideFragment2 = this.f30469y0;
                if (ocGuideFragment2 == null) {
                    Intrinsics.n("mGuideFragment");
                    throw null;
                }
                ocGuideFragment2.setArguments(getArguments());
            }
        }
        try {
            Z childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            C1161a c1161a = new C1161a(childFragmentManager);
            int i7 = e.oc_guide_fl;
            OcGuideFragment ocGuideFragment3 = this.f30469y0;
            if (ocGuideFragment3 == null) {
                Intrinsics.n("mGuideFragment");
                throw null;
            }
            c1161a.e(i7, ocGuideFragment3, null);
            c1161a.h(true);
            if (Intrinsics.c(this.f30370p, "0")) {
                t();
            }
            Intrinsics.checkNotNullParameter("1", "<set-?>");
            this.f30370p = "1";
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    public final void C() {
        Integer userType;
        Integer applyStatus;
        Integer applyStatus2;
        Integer applyStatus3;
        TopTipsData accountStatusPrompt;
        String statusMsg;
        OkCardMainPageRspData okCardMainPageRspData;
        Integer accountStatus;
        Integer accountStatus2;
        Integer accountStatus3;
        Integer accountStatus4;
        Integer accountStatus5;
        TopTipsData accountStatusPrompt2;
        TopTipsData accountStatusPrompt3;
        TopTipsData accountStatusPrompt4;
        String statusMsg2;
        if (getContext() != null) {
            Object value = this.f30461s0.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((FrameLayout) value).setVisibility(8);
            Object value2 = this.f30460r0.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((FrameLayout) value2).setVisibility(0);
            if (m()) {
                OkCardMainPageRspData okCardMainPageRspData2 = this.f30369o;
                if (okCardMainPageRspData2 == null || (accountStatusPrompt4 = okCardMainPageRspData2.getAccountStatusPrompt()) == null || (statusMsg2 = accountStatusPrompt4.getStatusMsg()) == null) {
                    statusMsg = null;
                } else {
                    statusMsg = new Regex("#202046").replace(statusMsg2, "#ffffff");
                }
            } else {
                OkCardMainPageRspData okCardMainPageRspData3 = this.f30369o;
                if (okCardMainPageRspData3 == null || (accountStatusPrompt = okCardMainPageRspData3.getAccountStatusPrompt()) == null) {
                    statusMsg = null;
                } else {
                    statusMsg = accountStatusPrompt.getStatusMsg();
                }
            }
            OkCardMainPageRspData okCardMainPageRspData4 = this.f30369o;
            String tipStatus = (okCardMainPageRspData4 == null || (accountStatusPrompt3 = okCardMainPageRspData4.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt3.getTipStatus();
            if (tipStatus != null) {
                switch (tipStatus) {
                    case "frozen":
                        A().setText(Html.fromHtml(statusMsg, 63));
                        A().setCompoundDrawablesWithIntrinsicBounds(d.cs_oc_frozen_icon, 0, 0, 0);
                        A().setVisibility(0);
                        break;
                    case "overpayment":
                        A().setText(statusMsg);
                        OkCardMainPageRspData okCardMainPageRspData5 = this.f30369o;
                        if (TextUtils.isEmpty((okCardMainPageRspData5 == null || (accountStatusPrompt2 = okCardMainPageRspData5.getAccountStatusPrompt()) == null) ? null : accountStatusPrompt2.getJumpPath())) {
                            A().setCompoundDrawablesWithIntrinsicBounds(d.cs_oc_overpayment_tips_icon, 0, 0, 0);
                        } else {
                            A().setCompoundDrawablesWithIntrinsicBounds(0, 0, d.cs_oc_view_icon, 0);
                        }
                        A().setVisibility(0);
                        break;
                    case "overdue":
                        A().setText(statusMsg);
                        A().setCompoundDrawablesWithIntrinsicBounds(d.cs_oc_finance_tip_warn_icon, 0, 0, 0);
                        A().setVisibility(0);
                        break;
                    case "disable":
                        A().setText(statusMsg);
                        A().setCompoundDrawablesWithIntrinsicBounds(d.cs_oc_finance_tip_warn_icon, 0, 0, 0);
                        A().setVisibility(0);
                        break;
                    default:
                        A().setVisibility(8);
                        break;
                }
            } else {
                A().setVisibility(8);
            }
            if (this.f30369o != null) {
                Object value3 = this.f30450H.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                OkCardMainPageRspData okCardMainPageRspData6 = this.f30369o;
                Intrinsics.e(okCardMainPageRspData6);
                OcModelOkCard.e((OcModelOkCard) value3, okCardMainPageRspData6);
            }
            OkCardMainPageRspData okCardMainPageRspData7 = this.f30369o;
            if (okCardMainPageRspData7 != null) {
                okCardMainPageRspData7.getCreditQuota();
            }
            OkCardMainPageRspData okCardMainPageRspData8 = this.f30369o;
            if (okCardMainPageRspData8 != null) {
                okCardMainPageRspData8.getAvailableBalance();
            }
            OkCardMainPageRspData okCardMainPageRspData9 = this.f30369o;
            if (okCardMainPageRspData9 != null) {
                okCardMainPageRspData9.getUnpaidInterest();
            }
            OkCardMainPageRspData okCardMainPageRspData10 = this.f30369o;
            if (okCardMainPageRspData10 != null) {
                okCardMainPageRspData10.getUnpaidPenalty();
            }
            OkCardMainPageRspData okCardMainPageRspData11 = this.f30369o;
            if (okCardMainPageRspData11 != null) {
                okCardMainPageRspData11.getCreditQuota();
            }
            OkCardMainPageRspData okCardMainPageRspData12 = this.f30369o;
            if (okCardMainPageRspData12 != null) {
                okCardMainPageRspData12.getAvailableBalance();
            }
            OkCardMainPageRspData okCardMainPageRspData13 = this.f30369o;
            if (okCardMainPageRspData13 == null || (accountStatus5 = okCardMainPageRspData13.getAccountStatus()) == null || accountStatus5.intValue() != 5) {
                OkCardMainPageRspData okCardMainPageRspData14 = this.f30369o;
                if (okCardMainPageRspData14 == null || (accountStatus4 = okCardMainPageRspData14.getAccountStatus()) == null || accountStatus4.intValue() != 4) {
                    OkCardMainPageRspData okCardMainPageRspData15 = this.f30369o;
                    if (okCardMainPageRspData15 == null || (accountStatus3 = okCardMainPageRspData15.getAccountStatus()) == null || accountStatus3.intValue() != 1) {
                        OkCardMainPageRspData okCardMainPageRspData16 = this.f30369o;
                        if ((okCardMainPageRspData16 != null && (accountStatus2 = okCardMainPageRspData16.getAccountStatus()) != null && accountStatus2.intValue() == 0) || ((okCardMainPageRspData = this.f30369o) != null && (accountStatus = okCardMainPageRspData.getAccountStatus()) != null && accountStatus.intValue() == 2)) {
                            Intrinsics.checkNotNullParameter("1", "<set-?>");
                            this.f30370p = "1";
                        }
                    } else {
                        Intrinsics.checkNotNullParameter("1", "<set-?>");
                        this.f30370p = "1";
                    }
                } else {
                    Intrinsics.checkNotNullParameter("1", "<set-?>");
                    this.f30370p = "1";
                }
            } else {
                if (Intrinsics.c(this.f30370p, "0")) {
                    t();
                }
                Intrinsics.checkNotNullParameter("1", "<set-?>");
                this.f30370p = "1";
            }
        }
        OkCardMainPageRspData okCardMainPageRspData17 = this.f30369o;
        if ((okCardMainPageRspData17 == null || (applyStatus3 = okCardMainPageRspData17.getApplyStatus()) == null || applyStatus3.intValue() != 1) && !((okCardMainPageRspData17 != null && (applyStatus = okCardMainPageRspData17.getApplyStatus()) != null && applyStatus.intValue() == 0) || okCardMainPageRspData17 == null || (userType = okCardMainPageRspData17.getUserType()) == null || userType.intValue() != 2 || this.f30468x0)) {
            OkCardMainPageRspData okCardMainPageRspData18 = this.f30369o;
            this.f30468x0 = true;
            Context context = getContext();
            if (context != null) {
                OcRecommendDialog ocRecommendDialog = new OcRecommendDialog(context, okCardMainPageRspData18 != null ? Long.valueOf(okCardMainPageRspData18.getCreditQuota()) : null, new a0(this, 0));
                ocRecommendDialog.setContent(new SpanUtils().append(getString(g.cs_oc_buy_now_repay_later)).setForegroundColor(context.getColor(b.cs_oc_recommend_content_color)).append(getString(g.cs_oc_first_or_sixteen)).setForegroundColor(context.getColor(b.cs_oc_recommend_date_color)).append(getString(g.cs_oc_of_each_month)).setForegroundColor(context.getColor(b.cs_oc_recommend_content_color)).create());
                ocRecommendDialog.show();
                return;
            }
            return;
        }
        OkCardMainPageRspData okCardMainPageRspData19 = this.f30369o;
        if (((okCardMainPageRspData19 == null || (applyStatus2 = okCardMainPageRspData19.getApplyStatus()) == null) ? -1 : applyStatus2.intValue()) == 1) {
            if ((getActivity() instanceof OcMainActivity) && this.f30467w0) {
                if (!i0.W(getActivity())) {
                    return;
                }
                if (isAdded() && getContext() != null) {
                    try {
                        String string = getString(g.oc_main_dialog_ad_slot_id);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        InterstitialAdView.show$default(new InterstitialAdView(string, 1, new C2025x(23), new h(9)), getContext(), null, 2, null);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            }
            this.f30467w0 = false;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_oc_fg_layout;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        c.f40268a.getInstance().getClass();
        c.a().getFlexiMenuData().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new c0(this, 1));
        return 0;
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        if (getActivity() != null) {
            w();
        }
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Bundle arguments;
        super.o();
        this.f30463u0 = false;
        Context context = getContext();
        if (context != null) {
            if (getArguments() == null || (arguments = getArguments()) == null || !arguments.getBoolean("oc_show_top_bar_left", true)) {
                x().setVisibility(8);
            } else {
                x().setVisibility(0);
            }
            ArrayList arrayList = this.f30470z0;
            m();
            this.f30447A0 = new B(context, arrayList);
            t tVar = this.f30449C;
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((RecyclerView) value).setLayoutManager(new GridLayoutManager(context, 4, 1, false));
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((RecyclerView) value2).setAdapter(this.f30447A0);
            Object value3 = this.f30458p0.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((SingleAdView) value3).setAdListener(new d0(this, 0));
            B b7 = this.f30447A0;
            if (b7 != null) {
                j itemClickListener = new j(this, 25);
                Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
                b7.f44156c = itemClickListener;
            }
            p220oa.h.l(new a0(this, 1), x());
            p220oa.h.l(new h1(19), z());
            p220oa.h.l(new a0(this, 2), A());
            Object value4 = this.f30448B.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((SingleAdView) value4).setAdListener(new C2025x(22));
            Object value5 = this.f30466w.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((SingleAdView) value5).setAdListener(new d0(this, 1));
            Object value6 = this.f30464v.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((SingleAdView) value6).setAdListener(new e0());
            Object value7 = this.f30453Q.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((NestedScrollView) value7).setOnScrollChangeListener(new b0(this));
            org.greenrobot.eventbus.c.b().j(this);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30463u0 = true;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Integer applyStatus;
        E activity;
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 4) {
            OkCardMainPageRspData okCardMainPageRspData = this.f30369o;
            if (okCardMainPageRspData == null || (applyStatus = okCardMainPageRspData.getApplyStatus()) == null || applyStatus.intValue() != 1) {
                return;
            }
            u();
            return;
        }
        if (eventType == 344) {
            if (this.f30465v0 != 1) {
                this.f30465v0 = 1;
            }
            u();
            w();
            return;
        }
        if (eventType != 361 && eventType != 368) {
            if (eventType == 372) {
                if (!(getActivity() instanceof OcMainActivity) || (activity = getActivity()) == null) {
                    return;
                }
                activity.finish();
                return;
            }
            if (eventType == 377) {
                u();
                return;
            }
            if (eventType == 307 || eventType == 308) {
                if (getActivity() instanceof OcMainActivity) {
                    Intrinsics.checkNotNullParameter("0", "<set-?>");
                    this.f30370p = "0";
                    return;
                }
                return;
            }
            if (eventType != 355 && eventType != 356 && eventType != 358 && eventType != 359) {
                switch (eventType) {
                    case MessageEvent.EVENT_OC_REPAY_SUCCESS /* 327 */:
                    case MessageEvent.EVENT_OC_REPAY_PENDING /* 328 */:
                        this.f30462t0 = true;
                        u();
                        break;
                    case MessageEvent.EVENT_OC_REPAY_FAILED /* 329 */:
                        u();
                        break;
                }
                return;
            }
        }
        w();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if ("5025".equalsIgnoreCase(pushMessage.content.messageType) || "5026".equalsIgnoreCase(pushMessage.content.messageType) || "5024".equalsIgnoreCase(pushMessage.content.messageType) || "5031".equalsIgnoreCase(pushMessage.content.messageType)) {
            this.f30462t0 = false;
            u();
            return;
        }
        if (PushMessage.MESSAGE_TYPE_OC_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType)) {
            if (this.f30465v0 == 0) {
                this.f30465v0 = 1;
            }
            this.f30462t0 = false;
            u();
            w();
            return;
        }
        if (PushMessage.MESSAGE_TYPE_OC_APPLY_FAILED.equalsIgnoreCase(pushMessage.content.messageType)) {
            String str = pushMessage.content.noticeMsg;
            if (this.f30465v0 == 0) {
                this.f30465v0 = 1;
            }
            this.f30462t0 = false;
            u();
            return;
        }
        if (PushMessage.MESSAGE_TYPE_CL_APPLY_SUCCESS.equalsIgnoreCase(pushMessage.content.messageType) || "5065".equalsIgnoreCase(pushMessage.content.messageType) || "5066".equalsIgnoreCase(pushMessage.content.messageType) || "5067".equalsIgnoreCase(pushMessage.content.messageType)) {
            w();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i7, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(i7, permissions, grantResults);
        int i10 = 0;
        if (i7 == 100) {
            int length = grantResults.length;
            while (i10 < length) {
                if (grantResults[i10] != 0) {
                    return;
                } else {
                    i10++;
                }
            }
            if (BaseApplication.hasLogin()) {
                Fb.d.f2639a.uploadDeviceInfo();
                return;
            }
            return;
        }
        if (i7 != 1000) {
            return;
        }
        int length2 = grantResults.length;
        while (i10 < length2) {
            if (grantResults[i10] != 0) {
                return;
            } else {
                i10++;
            }
        }
        if (PermissionUtils.isGranted("android.permission.CAMERA")) {
            G.z("/credit_score/ol_take_photo_activity", "oc_business_type", "OK_CARD", "oc_use_type", "oc_use_type_alone");
            return;
        }
        E activity = getActivity();
        if (activity != null) {
            n.u(getString(g.cs_grant_camera_permission));
            AbstractC1032a.g(activity, new String[]{"android.permission.CAMERA"}, 1000);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Integer num = this.f30368j;
        if (num != null && num.intValue() == 7) {
            B();
            return;
        }
        u();
        if (this.f30462t0) {
            n.u(getString(g.cs_repay_success_tips));
        }
        this.f30462t0 = false;
    }

    @Override // com.transsnet.palmpay.credit.ui.fragment.OcBaseFragment
    public final void v() {
        Integer userType;
        Integer applyStatus;
        Integer applyStatus2;
        OkCardMainPageRspData okCardMainPageRspData;
        Integer accountStatus;
        Integer applyStatus3;
        Integer cardLevel;
        Integer applyStatus4;
        if (this.f30463u0) {
            return;
        }
        OkCardMainPageRspData okCardMainPageRspData2 = this.f30369o;
        if ((okCardMainPageRspData2 == null || (applyStatus4 = okCardMainPageRspData2.getApplyStatus()) == null || applyStatus4.intValue() != 1) && ((okCardMainPageRspData2 == null || (applyStatus = okCardMainPageRspData2.getApplyStatus()) == null || applyStatus.intValue() != 0) && okCardMainPageRspData2 != null && (userType = okCardMainPageRspData2.getUserType()) != null && userType.intValue() == 2)) {
            C();
            return;
        }
        OkCardMainPageRspData okCardMainPageRspData3 = this.f30369o;
        t tVar = this.f30459q0;
        if (okCardMainPageRspData3 == null || (cardLevel = okCardMainPageRspData3.getCardLevel()) == null || cardLevel.intValue() != 1) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((ImageView) value).setImageResource(d.cs_oc_main_top_img);
            x().setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_ArrowLeft, null, requireContext().getColor(L6.b.ppColorTextPrimary), 24.0f));
            z().setImageDrawable(p059e1.a.h(getContext(), S6.a.pay_Setup, null, requireContext().getColor(L6.b.ppColorTextPrimary), 24.0f));
            Context context = getContext();
            if (context != null) {
                y().setTextColor(context.getColor(L6.b.ppColorTextPrimary));
            }
        } else {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((ImageView) value2).setImageResource(d.cs_oc_main_top_gold_card_img);
            x().setImageResource(d.cs_oc_back_icon_white);
            z().setColorFilter(-1);
            y().setTextColor(-1);
        }
        OkCardMainPageRspData okCardMainPageRspData4 = this.f30369o;
        int iIntValue = (okCardMainPageRspData4 == null || (applyStatus3 = okCardMainPageRspData4.getApplyStatus()) == null) ? 1 : applyStatus3.intValue();
        if (iIntValue == -1) {
            B();
        } else if (iIntValue != 2) {
            C();
        } else {
            Intrinsics.checkNotNullParameter("1", "<set-?>");
            this.f30370p = "1";
            B();
        }
        OkCardMainPageRspData okCardMainPageRspData5 = this.f30369o;
        if (okCardMainPageRspData5 == null || (applyStatus2 = okCardMainPageRspData5.getApplyStatus()) == null || applyStatus2.intValue() != 1 || (okCardMainPageRspData = this.f30369o) == null || (accountStatus = okCardMainPageRspData.getAccountStatus()) == null || accountStatus.intValue() != 5) {
            return;
        }
        B();
    }

    public final void w() {
        c.f40268a.getInstance().getClass();
        c.a().getCashLoan().k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new c0(this, 0));
    }

    public final ImageView x() {
        Object value = this.f30456Z.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    public final TextView y() {
        Object value = this.f30455Y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final IconicsImageView z() {
        Object value = this.f30454X.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }
}
