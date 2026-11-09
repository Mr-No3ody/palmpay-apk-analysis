package com.transsnet.palmpay.cash_in.ui.fragment;

import Ce.ViewOnClickListenerC0159a;
import E9.g;
import E9.i;
import Fd.G;
import G9.j;
import G9.k;
import G9.m;
import G9.n;
import J9.F;
import J9.K;
import L6.b;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.palmpay.cash_in.bean.request.NearbyAgentsReq;
import com.transsnet.palmpay.cash_in.bean.response.NearbyAgentsResp;
import com.transsnet.palmpay.cash_in.ui.fragment.WithdrawHomeFragment;
import com.transsnet.palmpay.cash_in.ui.viewmodel.WithdrawViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.req.QueryRecipientReq;
import com.transsnet.palmpay.core.bean.rsp.QueryRecentlyMerchantResp;
import com.transsnet.palmpay.core.bean.rsp.WithdrawalMenuRsp;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p140j8.f;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/fragment/WithdrawHomeFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawViewModel;", "<init>", "()V", "G9/k", "a", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWithdrawHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithdrawHomeFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/WithdrawHomeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,452:1\n1#2:453\n152#3:454\n169#3:455\n152#3:456\n169#3:457\n152#3:458\n169#3:459\n*S KotlinDebug\n*F\n+ 1 WithdrawHomeFragment.kt\ncom/transsnet/palmpay/cash_in/ui/fragment/WithdrawHomeFragment\n*L\n181#1:454\n181#1:455\n199#1:456\n199#1:457\n215#1:458\n215#1:459\n*E\n"})
public final class WithdrawHomeFragment extends BaseMvvmFragment<WithdrawViewModel> {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ int f27021t0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f27022A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f27023B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f27024C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f27025H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f27026L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f27027M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final t f27028Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f27029X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f27030Y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f27032j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f27034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f27035p;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final t f27037q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final t f27038r0;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f27040v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f27041w;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final t f27031Z = C2131j.b(new j(0));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final t f27033k0 = C2131j.b(new j(1));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final t f27036p0 = C2131j.b(new j(2));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ViewOnClickListenerC0159a f27039s0 = new ViewOnClickListenerC0159a(this, 13);

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

    public WithdrawHomeFragment() {
        final int i7 = 11;
        this.f27032j = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i7) {
                    case 0:
                        int i10 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i11 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i12 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i13 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i14 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i15 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i16 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i10 = 2;
        this.f27034o = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i10) {
                    case 0:
                        int i11 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i12 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i13 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i14 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i15 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i16 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i11 = 3;
        this.f27035p = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i11) {
                    case 0:
                        int i12 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i13 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i14 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i15 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i16 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i12 = 4;
        this.t = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i12) {
                    case 0:
                        int i13 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i14 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i15 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i16 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i13 = 5;
        this.f27040v = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i13) {
                    case 0:
                        int i14 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i15 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i16 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i14 = 6;
        this.f27041w = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i14) {
                    case 0:
                        int i15 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i16 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i15 = 7;
        this.f27022A = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i15) {
                    case 0:
                        int i16 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i16 = 8;
        this.f27023B = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i16) {
                    case 0:
                        int i17 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i17 = 9;
        this.f27024C = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i17) {
                    case 0:
                        int i18 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i117 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i18 = 10;
        this.f27025H = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i18) {
                    case 0:
                        int i19 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i117 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i118 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i19 = 12;
        this.f27026L = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i19) {
                    case 0:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i117 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i118 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i119 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i20 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i20 = 13;
        this.f27027M = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i20) {
                    case 0:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i117 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i118 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i119 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i21 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i25 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i21 = 14;
        this.f27028Q = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i21) {
                    case 0:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i117 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i118 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i119 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i22 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i25 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i26 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i22 = 0;
        this.f27037q0 = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i22) {
                    case 0:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i117 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i118 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i119 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i23 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i25 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i26 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i27 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
        final int i23 = 1;
        this.f27038r0 = C2131j.b(new Function0(this) { // from class: G9.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawHomeFragment withdrawHomeFragment = this.f3174b;
                switch (i23) {
                    case 0:
                        int i110 = WithdrawHomeFragment.f27021t0;
                        return new k(withdrawHomeFragment);
                    case 1:
                        int i111 = WithdrawHomeFragment.f27021t0;
                        return withdrawHomeFragment.registerForActivityResult(new V3.a(4), new i(withdrawHomeFragment, 0));
                    case 2:
                        int i112 = WithdrawHomeFragment.f27021t0;
                        View view = withdrawHomeFragment.f27318b;
                        if (view != null) {
                            return (TextView) view.findViewById(p366y9.b.iv_turn_on);
                        }
                        return null;
                    case 3:
                        int i113 = WithdrawHomeFragment.f27021t0;
                        View view2 = withdrawHomeFragment.f27318b;
                        if (view2 != null) {
                            return (ConstraintLayout) view2.findViewById(p366y9.b.ll_location_permission);
                        }
                        return null;
                    case 4:
                        int i114 = WithdrawHomeFragment.f27021t0;
                        View view3 = withdrawHomeFragment.f27318b;
                        if (view3 != null) {
                            return (RecyclerView) view3.findViewById(p366y9.b.rvMenuList);
                        }
                        return null;
                    case 5:
                        int i115 = WithdrawHomeFragment.f27021t0;
                        View view4 = withdrawHomeFragment.f27318b;
                        if (view4 != null) {
                            return (RecyclerView) view4.findViewById(p366y9.b.rvRecentLyList);
                        }
                        return null;
                    case 6:
                        int i116 = WithdrawHomeFragment.f27021t0;
                        View view5 = withdrawHomeFragment.f27318b;
                        if (view5 != null) {
                            return (LinearLayout) view5.findViewById(p366y9.b.ll_recently);
                        }
                        return null;
                    case 7:
                        int i117 = WithdrawHomeFragment.f27021t0;
                        View view6 = withdrawHomeFragment.f27318b;
                        if (view6 != null) {
                            return (RecyclerView) view6.findViewById(p366y9.b.rv_nearest);
                        }
                        return null;
                    case 8:
                        int i118 = WithdrawHomeFragment.f27021t0;
                        View view7 = withdrawHomeFragment.f27318b;
                        if (view7 != null) {
                            return (TextView) view7.findViewById(p366y9.b.tvMore);
                        }
                        return null;
                    case 9:
                        int i119 = WithdrawHomeFragment.f27021t0;
                        View view8 = withdrawHomeFragment.f27318b;
                        if (view8 != null) {
                            return (ConstraintLayout) view8.findViewById(p366y9.b.ll_nearest);
                        }
                        return null;
                    case 10:
                        int i24 = WithdrawHomeFragment.f27021t0;
                        View view9 = withdrawHomeFragment.f27318b;
                        if (view9 != null) {
                            return view9.findViewById(p366y9.b.v_line);
                        }
                        return null;
                    case 11:
                        int i25 = WithdrawHomeFragment.f27021t0;
                        View view10 = withdrawHomeFragment.f27318b;
                        if (view10 != null) {
                            return (IconicsImageView) view10.findViewById(p366y9.b.iv_close);
                        }
                        return null;
                    case 12:
                        int i26 = WithdrawHomeFragment.f27021t0;
                        View view11 = withdrawHomeFragment.f27318b;
                        if (view11 != null) {
                            return (IconicsImageView) view11.findViewById(p366y9.b.ivScan);
                        }
                        return null;
                    case 13:
                        int i27 = WithdrawHomeFragment.f27021t0;
                        View view12 = withdrawHomeFragment.f27318b;
                        if (view12 != null) {
                            return (TextView) view12.findViewById(p366y9.b.tv_account_no);
                        }
                        return null;
                    default:
                        int i28 = WithdrawHomeFragment.f27021t0;
                        View view13 = withdrawHomeFragment.f27318b;
                        if (view13 != null) {
                            return (MarqueeView) view13.findViewById(p366y9.b.viewNotice);
                        }
                        return null;
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public static void w(String str, String str2, String str3, String str4) {
        String str5;
        if (str == null) {
            str5 = null;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != 1539) {
                if (iHashCode != 3678) {
                    if (iHashCode == 3679 && str.equals(TransType.TRANS_TYPE_PAY_SHOP)) {
                        str5 = "/sm/pay_shop_input_amount";
                    } else {
                        str5 = null;
                    }
                } else if (str.equals(TransType.TRANS_TYPE_WITHDRAW_TO_AGENT)) {
                    str5 = "/sm/withdraw_input_amount";
                } else {
                    str5 = null;
                }
            } else if (str.equals("03")) {
                str5 = "/credit_score/input_amount";
            } else {
                str5 = null;
            }
        }
        if (str5 != null) {
            Postcard postcardWithString = ARouter.getInstance().build(str5).withBoolean("FORCE_NO_NIGHT_MODE", false).withString("core_order_source_type", "WITHDRAW").withString("sn_no", str4);
            if (TextUtils.equals("03", str)) {
                postcardWithString.withInt("extra_type", 14);
            }
            if (!TextUtils.isEmpty(str2)) {
                postcardWithString.withString("MEMBER_ID", str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                postcardWithString.withString("phone_number", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                postcardWithString.withString("extra_data", str4);
            }
            postcardWithString.navigation();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return c.cash_in_activity_withdraw_home;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        WithdrawViewModel withdrawViewModel = (WithdrawViewModel) this.f27333i;
        l lVar = withdrawViewModel != null ? withdrawViewModel.f27116o : null;
        if (lVar != null) {
            lVar.e(this, new G(new G9.l(this, 0), 1));
        }
        WithdrawViewModel withdrawViewModel2 = (WithdrawViewModel) this.f27333i;
        l lVar2 = withdrawViewModel2 != null ? withdrawViewModel2.f27117p : null;
        if (lVar2 != null) {
            lVar2.e(this, new G(new G9.l(this, 1), 1));
        }
        WithdrawViewModel withdrawViewModel3 = (WithdrawViewModel) this.f27333i;
        l lVar3 = withdrawViewModel3 != null ? withdrawViewModel3.t : null;
        if (lVar3 == null) {
            return 1;
        }
        lVar3.e(this, new G(new G9.l(this, 2), 1));
        return 1;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        QueryRecipientReq req = new QueryRecipientReq(2, 2, C0.G.k());
        WithdrawViewModel withdrawViewModel = (WithdrawViewModel) this.f27333i;
        if (withdrawViewModel != null) {
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(withdrawViewModel, new J9.G(req, null), withdrawViewModel.f27116o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        WithdrawViewModel withdrawViewModel2 = (WithdrawViewModel) this.f27333i;
        if (withdrawViewModel2 != null) {
            f.s(withdrawViewModel2, new K(1, null), withdrawViewModel2.t, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        if (d.a(requireContext(), com.transsnet.palmpay.core.config.d.j()) != 0) {
            ConstraintLayout constraintLayoutT = t();
            if (constraintLayoutT != null) {
                h.s(constraintLayoutT, true);
                return;
            }
            return;
        }
        u();
        ConstraintLayout constraintLayoutT2 = t();
        if (constraintLayoutT2 != null) {
            h.c(constraintLayoutT2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ((androidx.activity.result.a) this.f27038r0.getValue()).toString();
        TextView textView = (TextView) this.f27027M.getValue();
        ViewOnClickListenerC0159a viewOnClickListenerC0159a = this.f27039s0;
        if (textView != null) {
            textView.setOnClickListener(viewOnClickListenerC0159a);
        }
        IconicsImageView iconicsImageView = (IconicsImageView) this.f27026L.getValue();
        if (iconicsImageView != null) {
            iconicsImageView.setOnClickListener(viewOnClickListenerC0159a);
        }
        TextView textView2 = (TextView) this.f27034o.getValue();
        if (textView2 != null) {
            textView2.setOnClickListener(viewOnClickListenerC0159a);
        }
        IconicsImageView iconicsImageView2 = (IconicsImageView) this.f27032j.getValue();
        if (iconicsImageView2 != null) {
            iconicsImageView2.setOnClickListener(viewOnClickListenerC0159a);
        }
        TextView textView3 = (TextView) this.f27023B.getValue();
        if (textView3 != null) {
            textView3.setOnClickListener(viewOnClickListenerC0159a);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        t tVar = this.f27040v;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(new m());
        }
        RecyclerView recyclerView3 = (RecyclerView) tVar.getValue();
        t tVar2 = this.f27031Z;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter((i) tVar2.getValue());
        }
        final int i7 = 0;
        ((i) tVar2.getValue()).setOnItemClickListener(new OnItemClickListener(this) { // from class: G9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3172b;

            {
                this.f3172b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i10) {
                WithdrawHomeFragment withdrawHomeFragment = this.f3172b;
                switch (i7) {
                    case 0:
                        int i11 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        QueryRecentlyMerchantResp.Data data = (QueryRecentlyMerchantResp.Data) ((E9.i) withdrawHomeFragment.f27031Z.getValue()).getItem(i10);
                        WithdrawHomeFragment.w(data.getTransType(), data.getMerchantMemberId(), data.getPhone(), data.getSnNo());
                        break;
                    case 1:
                        int i12 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        WithdrawalMenuRsp.WithdrawalMenuBean withdrawalMenuBean = (WithdrawalMenuRsp.WithdrawalMenuBean) ((E9.f) withdrawHomeFragment.f27033k0.getValue()).getItem(i10);
                        if (!TextUtils.isEmpty(withdrawalMenuBean.getLinkAddress())) {
                            com.palmpay.lib.apm.launchcounter.util.d.F(withdrawalMenuBean.getLinkAddress());
                        }
                        break;
                    default:
                        int i13 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        NearbyAgentsResp.NearbyShopListBean nearbyShopListBean = (NearbyAgentsResp.NearbyShopListBean) withdrawHomeFragment.v().getItem(i10);
                        WithdrawHomeFragment.w(nearbyShopListBean.transType, nearbyShopListBean.memberId, nearbyShopListBean.networkMobile, nearbyShopListBean.accountNo);
                        break;
                }
            }
        });
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        t tVar3 = this.t;
        RecyclerView recyclerView4 = (RecyclerView) tVar3.getValue();
        if (recyclerView4 != null) {
            recyclerView4.setLayoutManager(linearLayoutManager2);
        }
        RecyclerView recyclerView5 = (RecyclerView) tVar3.getValue();
        t tVar4 = this.f27033k0;
        if (recyclerView5 != null) {
            recyclerView5.setAdapter((E9.f) tVar4.getValue());
        }
        C1548f c1548f = new C1548f(requireContext().getColor(b.ppColorDividerLine), getResources().getDimensionPixelOffset(q.dp1), getResources().getDimensionPixelOffset(q.dp12), getResources().getDimensionPixelOffset(q.dp12));
        c1548f.f31336e = false;
        RecyclerView recyclerView6 = (RecyclerView) tVar3.getValue();
        if (recyclerView6 != null) {
            recyclerView6.addItemDecoration(c1548f);
        }
        E9.f fVar = (E9.f) tVar4.getValue();
        final int i10 = 1;
        fVar.setOnItemClickListener(new OnItemClickListener(this) { // from class: G9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3172b;

            {
                this.f3172b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i11) {
                WithdrawHomeFragment withdrawHomeFragment = this.f3172b;
                switch (i10) {
                    case 0:
                        int i12 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        QueryRecentlyMerchantResp.Data data = (QueryRecentlyMerchantResp.Data) ((E9.i) withdrawHomeFragment.f27031Z.getValue()).getItem(i11);
                        WithdrawHomeFragment.w(data.getTransType(), data.getMerchantMemberId(), data.getPhone(), data.getSnNo());
                        break;
                    case 1:
                        int i13 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        WithdrawalMenuRsp.WithdrawalMenuBean withdrawalMenuBean = (WithdrawalMenuRsp.WithdrawalMenuBean) ((E9.f) withdrawHomeFragment.f27033k0.getValue()).getItem(i11);
                        if (!TextUtils.isEmpty(withdrawalMenuBean.getLinkAddress())) {
                            com.palmpay.lib.apm.launchcounter.util.d.F(withdrawalMenuBean.getLinkAddress());
                        }
                        break;
                    default:
                        int i14 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        NearbyAgentsResp.NearbyShopListBean nearbyShopListBean = (NearbyAgentsResp.NearbyShopListBean) withdrawHomeFragment.v().getItem(i11);
                        WithdrawHomeFragment.w(nearbyShopListBean.transType, nearbyShopListBean.memberId, nearbyShopListBean.networkMobile, nearbyShopListBean.accountNo);
                        break;
                }
            }
        });
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext());
        t tVar5 = this.f27022A;
        RecyclerView recyclerView7 = (RecyclerView) tVar5.getValue();
        if (recyclerView7 != null) {
            recyclerView7.setLayoutManager(linearLayoutManager3);
        }
        RecyclerView recyclerView8 = (RecyclerView) tVar5.getValue();
        if (recyclerView8 != null) {
            recyclerView8.addItemDecoration(new n());
        }
        RecyclerView recyclerView9 = (RecyclerView) tVar5.getValue();
        if (recyclerView9 != null) {
            recyclerView9.setAdapter(v());
        }
        final int i11 = 2;
        v().setOnItemClickListener(new OnItemClickListener(this) { // from class: G9.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WithdrawHomeFragment f3172b;

            {
                this.f3172b = this;
            }

            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(M1.j jVar, View view, int i12) {
                WithdrawHomeFragment withdrawHomeFragment = this.f3172b;
                switch (i11) {
                    case 0:
                        int i13 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        QueryRecentlyMerchantResp.Data data = (QueryRecentlyMerchantResp.Data) ((E9.i) withdrawHomeFragment.f27031Z.getValue()).getItem(i12);
                        WithdrawHomeFragment.w(data.getTransType(), data.getMerchantMemberId(), data.getPhone(), data.getSnNo());
                        break;
                    case 1:
                        int i14 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        WithdrawalMenuRsp.WithdrawalMenuBean withdrawalMenuBean = (WithdrawalMenuRsp.WithdrawalMenuBean) ((E9.f) withdrawHomeFragment.f27033k0.getValue()).getItem(i12);
                        if (!TextUtils.isEmpty(withdrawalMenuBean.getLinkAddress())) {
                            com.palmpay.lib.apm.launchcounter.util.d.F(withdrawalMenuBean.getLinkAddress());
                        }
                        break;
                    default:
                        int i15 = WithdrawHomeFragment.f27021t0;
                        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
                        Intrinsics.checkNotNullParameter(view, "<unused var>");
                        NearbyAgentsResp.NearbyShopListBean nearbyShopListBean = (NearbyAgentsResp.NearbyShopListBean) withdrawHomeFragment.v().getItem(i12);
                        WithdrawHomeFragment.w(nearbyShopListBean.transType, nearbyShopListBean.memberId, nearbyShopListBean.networkMobile, nearbyShopListBean.accountNo);
                        break;
                }
            }
        });
        org.chromium.support_lib_boundary.util.b.d((MarqueeView) this.f27028Q.getValue(), Boolean.TRUE);
        super.o();
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 16705 && d.a(((k) this.f27037q0.getValue()).f3178a.requireContext(), com.transsnet.palmpay.core.config.d.j()) == 0) {
            u();
            ConstraintLayout constraintLayoutT = t();
            if (constraintLayoutT != null) {
                h.c(constraintLayoutT);
            }
        }
    }

    public final ConstraintLayout t() {
        return (ConstraintLayout) this.f27035p.getValue();
    }

    public final void u() {
        try {
            LocationRecord locationRecordF = p367ya.a.d().f();
            if (locationRecordF == null || locationRecordF.isExpired()) {
                this.f27029X = null;
                this.f27030Y = null;
            } else {
                this.f27029X = String.valueOf(locationRecordF.getLatitude());
                this.f27030Y = String.valueOf(locationRecordF.getLongitude());
            }
        } catch (Exception unused) {
            this.f27029X = null;
            this.f27030Y = null;
        }
        if (this.f27029X == null || this.f27030Y == null) {
            return;
        }
        NearbyAgentsReq nearbyAgentsReq = new NearbyAgentsReq();
        nearbyAgentsReq.latitude = this.f27029X;
        nearbyAgentsReq.longitude = this.f27030Y;
        WithdrawViewModel withdrawViewModel = (WithdrawViewModel) this.f27333i;
        if (withdrawViewModel != null) {
            f.s(withdrawViewModel, new F(nearbyAgentsReq, null), withdrawViewModel.f27117p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final g v() {
        return (g) this.f27036p0.getValue();
    }
}
