package com.transsnet.palmpay.jara_packet.ui.activity;

import C0.G;
import Pa.r0;
import S6.a;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.video.u;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.custom_view.q;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.jara_packet.bean.resp.RankListResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnPersonalRankResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnRankActivity;
import com.transsnet.palmpay.jara_packet.ui.model.comments.AutoPollRecyclerView;
import com.transsnet.palmpay.jara_packet.ui.model.comments.ReferEarnCommentsView;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p236pc.b;
import p236pc.d;
import p236pc.e;
import p236pc.f;
import p285sc.x;
import p295tc.h;
import p355xf.C2131j;
import p355xf.t;
import p383zc.r;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/refer_earn/rank")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnRankActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Lzc/r;", "Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnRankContract$View;", "<init>", "()V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnRankActivity extends i implements ReferEarnRankContract.View {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f31906v = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31912g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31914j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f31916p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f31915o = "";
    public final x t = new x(this, 0);

    public ReferEarnRankActivity() {
        final int i7 = 0;
        this.f31907b = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i7) {
                    case 0:
                        int i10 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i11 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i12 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i13 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i14 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i15 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i16 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
        final int i10 = 1;
        this.f31908c = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i10) {
                    case 0:
                        int i11 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i12 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i13 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i14 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i15 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i16 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i18 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
        final int i11 = 2;
        this.f31909d = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i11) {
                    case 0:
                        int i12 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i13 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i14 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i15 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i16 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i18 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i19 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
        final int i12 = 3;
        this.f31910e = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i12) {
                    case 0:
                        int i13 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i14 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i15 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i16 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i18 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i19 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i110 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
        final int i13 = 4;
        this.f31911f = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i13) {
                    case 0:
                        int i14 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i15 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i16 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i18 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i19 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i110 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i111 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
        final int i14 = 5;
        this.f31912g = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i14) {
                    case 0:
                        int i15 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i16 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i18 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i19 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i110 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i111 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i112 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
        final int i15 = 6;
        this.f31913i = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i15) {
                    case 0:
                        int i16 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i18 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i19 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i110 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i111 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i112 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i113 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
        final int i16 = 7;
        this.f31914j = C2131j.b(new Function0(this) { // from class: sc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnRankActivity f42234b;

            {
                this.f42234b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnRankActivity referEarnRankActivity = this.f42234b;
                switch (i16) {
                    case 0:
                        int i17 = ReferEarnRankActivity.f31906v;
                        return (PpTitleBar) referEarnRankActivity.findViewById(d.titleBar);
                    case 1:
                        int i18 = ReferEarnRankActivity.f31906v;
                        return (RelativeLayout) referEarnRankActivity.findViewById(d.rlInvite);
                    case 2:
                        int i19 = ReferEarnRankActivity.f31906v;
                        return (RecyclerView) referEarnRankActivity.findViewById(d.recycler_view);
                    case 3:
                        int i110 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvMoney);
                    case 4:
                        int i111 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvDesc);
                    case 5:
                        int i112 = ReferEarnRankActivity.f31906v;
                        return (TextView) referEarnRankActivity.findViewById(d.tvTitle);
                    case 6:
                        int i113 = ReferEarnRankActivity.f31906v;
                        return (ImageView) referEarnRankActivity.findViewById(d.ivAvatar);
                    default:
                        int i114 = ReferEarnRankActivity.f31906v;
                        return (ReferEarnCommentsView) referEarnRankActivity.findViewById(d.commentsView);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract.View
    public final void commentListResult(CommonBeanResult resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        Object value = this.f31914j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ReferEarnCommentsView) value).d(resp);
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.jp_activity_re_rank;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new r();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Object value = this.f31914j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        AutoPollRecyclerView mRecyclerView = ((ReferEarnCommentsView) value).getMRecyclerView();
        mRecyclerView.f31982b = false;
        mRecyclerView.removeCallbacks(mRecyclerView.f31981a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract.View
    public final void personalRankResult(CommonBeanResult resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        Object value = this.f31913i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        r0.u1((ImageView) value, ((ReferEarnPersonalRankResp) resp.data).headPortrait, com.transsnet.palmpay.custom_view.r.cv_avatar_default);
        Object value2 = this.f31912g.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(((ReferEarnPersonalRankResp) resp.data).memberName);
        Object value3 = this.f31910e.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        G.y("+", BaseApplication.getCurrencySymbol(), r0.n0(((ReferEarnPersonalRankResp) resp.data).amount), (TextView) value3);
        int i7 = ((ReferEarnPersonalRankResp) resp.data).rankRate;
        t tVar = this.f31911f;
        if (i7 != 0) {
            Object value4 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((TextView) value4).setText(getString(f.jp_surpassed_s_users, u.g(((ReferEarnPersonalRankResp) resp.data).rankRate, "%")));
        } else {
            Object value5 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((TextView) value5).setText(getString(f.jp_surpassed_zero));
        }
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((r) this.f27350a).queryPersonalRank();
        ((r) this.f27350a).queryComment();
        ((r) this.f27350a).queryRankList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract.View
    public final void rankListResult(CommonBeanResult resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        h hVar = this.f31916p;
        if (hVar != null) {
            hVar.a(((RankListResp) resp.data).list);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.jp_refer_earn_bg));
        Object value = this.f31907b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).c(a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        Intrinsics.checkNotNullParameter(this, "context");
        this.f31916p = new h(this);
        C1548f c1548f = new C1548f(Color.parseColor("#268A8CB2"), getResources().getDimensionPixelOffset(q.dp1), getResources().getDimensionPixelOffset(q.dp20), getResources().getDimensionPixelOffset(q.dp20));
        c1548f.f31336e = false;
        t tVar = this.f31909d;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).addItemDecoration(c1548f);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((RecyclerView) value4).setAdapter(this.f31916p);
        Object value5 = this.f31908c.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((RelativeLayout) value5).setOnClickListener(this.t);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnRankContract.View
    public final void showToastDialog(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        y yVar = new y(this);
        yVar.f31323a = msg;
        yVar.h();
    }
}
