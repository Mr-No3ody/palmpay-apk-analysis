package com.transsnet.palmpay.jara_packet.ui.activity;

import N8.q0;
import Pa.r0;
import S6.a;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnDetailsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecordsResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnResolveResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnResolveActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.model.ReferEarnResolveStepModel;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p141j9.C1794b;
import p220oa.h;
import p236pc.b;
import p236pc.c;
import p236pc.d;
import p236pc.e;
import p236pc.f;
import p285sc.A;
import p285sc.B;
import p285sc.C;
import p285sc.D;
import p285sc.E;
import p285sc.F;
import p285sc.G;
import p285sc.H;
import p285sc.x;
import p285sc.z;
import p295tc.j;
import p355xf.C2131j;
import p355xf.t;
import p383zc.y;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/refer_earn/resolve")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnResolveActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Lzc/y;", "Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnResolveContract$View;", "<init>", "()V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnResolveActivity extends i implements ReferEarnResolveContract.View {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f31917C = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31925g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f31927j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31928o;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public j f31930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f31931w;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f31929p = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31918A = 1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final x f31919B = new x(this, 1);

    public ReferEarnResolveActivity() {
        final int i7 = 0;
        this.f31920b = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i7) {
                    case 0:
                        int i10 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i11 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i12 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i13 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i14 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i15 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i16 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i10 = 1;
        this.f31921c = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i10) {
                    case 0:
                        int i11 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i12 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i13 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i14 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i15 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i16 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i11 = 2;
        this.f31922d = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i11) {
                    case 0:
                        int i12 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i13 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i14 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i15 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i16 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i110 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i12 = 3;
        this.f31923e = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i12) {
                    case 0:
                        int i13 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i14 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i15 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i16 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i110 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i111 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i13 = 4;
        this.f31924f = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i13) {
                    case 0:
                        int i14 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i15 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i16 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i110 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i111 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i112 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i14 = 5;
        this.f31925g = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i14) {
                    case 0:
                        int i15 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i16 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i110 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i111 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i112 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i113 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i15 = 6;
        this.f31926i = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i15) {
                    case 0:
                        int i16 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i110 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i111 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i112 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i113 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i114 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i16 = 7;
        this.f31927j = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i16) {
                    case 0:
                        int i17 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i110 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i111 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i112 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i113 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i114 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i115 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
        final int i17 = 8;
        this.f31928o = C2131j.b(new Function0(this) { // from class: sc.y

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnResolveActivity f42238b;

            {
                this.f42238b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnResolveActivity referEarnResolveActivity = this.f42238b;
                switch (i17) {
                    case 0:
                        int i18 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvWithdraw);
                    case 1:
                        int i19 = ReferEarnResolveActivity.f31917C;
                        return (LinearLayout) referEarnResolveActivity.findViewById(d.llResolveHow);
                    case 2:
                        int i110 = ReferEarnResolveActivity.f31917C;
                        return (ImageView) referEarnResolveActivity.findViewById(d.ivExpand);
                    case 3:
                        int i111 = ReferEarnResolveActivity.f31917C;
                        return (RecyclerView) referEarnResolveActivity.findViewById(d.rvResolve);
                    case 4:
                        int i112 = ReferEarnResolveActivity.f31917C;
                        return (Button) referEarnResolveActivity.findViewById(d.jp_cash_invite_btn);
                    case 5:
                        int i113 = ReferEarnResolveActivity.f31917C;
                        return (ProgressBar) referEarnResolveActivity.findViewById(d.seekBarProgress);
                    case 6:
                        int i114 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveRate);
                    case 7:
                        int i115 = ReferEarnResolveActivity.f31917C;
                        return (TextView) referEarnResolveActivity.findViewById(d.tvResolveTip2);
                    default:
                        int i116 = ReferEarnResolveActivity.f31917C;
                        return (PpTitleBar) referEarnResolveActivity.findViewById(d.titleBar);
                }
            }
        });
    }

    public static final void m(ReferEarnResolveActivity referEarnResolveActivity) {
        if (com.transsnet.palmpay.core.config.d.t()) {
            p185ma.t tVar = new p185ma.t(referEarnResolveActivity);
            tVar.f39627c = referEarnResolveActivity.getString(f.jp_share_title);
            tVar.f39628d = referEarnResolveActivity.f31929p;
            tVar.s(16);
            return;
        }
        ShareDialog shareDialog = new ShareDialog(referEarnResolveActivity);
        shareDialog.setShareBusinessType(16);
        shareDialog.setReferEarnId(referEarnResolveActivity.f31929p);
        shareDialog.show();
        shareDialog.setTitle(referEarnResolveActivity.getString(f.jp_share_title));
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.jp_activity_refer_earn_resolve;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        super.initStatusBar();
        initStatusBar(getColor(b.jp_refer_earn_bg));
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new y();
    }

    public final void n() {
        ((y) this.f27350a).queryReferEarnById(this.f31929p);
        this.f31918A = 1;
        ((y) this.f27350a).queryReferEarnRecords(this.f31929p, 1);
    }

    public final ImageView o() {
        Object value = this.f31922d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        n();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((y) this.f27350a).queryResolveConfig();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.View
    public final void queryReferRecordsResult(CommonBeanResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        T t = result.data;
        if (((ReferEarnRecordsResp) t).curPage >= ((ReferEarnRecordsResp) t).totalPage) {
            o().setVisibility(8);
        } else {
            o().setVisibility(0);
        }
        if (this.f31918A == 1) {
            j jVar = this.f31930v;
            if (jVar != null) {
                jVar.b();
            }
            if (((ReferEarnRecordsResp) result.data).list.isEmpty()) {
                o().setVisibility(8);
            }
        }
        j jVar2 = this.f31930v;
        if (jVar2 != null) {
            jVar2.a(((ReferEarnRecordsResp) result.data).list);
        }
        j jVar3 = this.f31930v;
        if (jVar3 != null) {
            jVar3.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.View
    public final void referEarnDetail(CommonBeanResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f31931w = ((ReferEarnDetailsResp) result.data).withdrawAmt;
        Object value = this.f31926i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(((ReferEarnDetailsResp) result.data).authRate + "%");
        t tVar = this.f31925g;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((ProgressBar) value2).setMax(100);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((ProgressBar) value3).setProgress(((ReferEarnDetailsResp) result.data).authRate);
        this.t = ((ReferEarnDetailsResp) result.data).status;
        Object value4 = this.f31924f.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((Button) value4).setEnabled(true);
        Object value5 = this.f31920b.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        ((TextView) value5).setEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.View
    public final void referEarnResolveConfig(CommonBeanResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        int size = ((ReferEarnResolveResp) result.data).guideImages.size();
        Object[] objArr = 0;
        int i7 = 0;
        while (i7 < size) {
            Object value = this.f31921c.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            LinearLayout linearLayout = (LinearLayout) value;
            ReferEarnResolveStepModel referEarnResolveStepModel = new ReferEarnResolveStepModel(this, null, 6, objArr == true ? 1 : 0);
            int i10 = i7 + 1;
            String url = ((ReferEarnResolveResp) result.data).guideImages.get(i7);
            Intrinsics.checkNotNullParameter(url, "url");
            if (i10 == 1) {
                TextView textView = referEarnResolveStepModel.f31970d;
                if (textView != null) {
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0);
                }
            } else {
                TextView textView2 = referEarnResolveStepModel.f31970d;
                if (textView2 != null) {
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(c.jp_re_resolve_step, 0, 0, 0);
                }
            }
            TextView textView3 = referEarnResolveStepModel.f31970d;
            if (textView3 != null) {
                textView3.setText("Step " + i10);
            }
            r0.l1(url, referEarnResolveStepModel.f31969c);
            linearLayout.addView(referEarnResolveStepModel);
            i7 = i10;
        }
        SpannableString spannableString = new SpannableString(getString(f.jp_resolve_tip_2, u.g(((ReferEarnResolveResp) result.data).authRate, "%")));
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(L6.b.ppColorTextBase)), spannableString.length() - 4, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(SizeUtils.dp2px(14.0f)), spannableString.length() - 4, spannableString.length(), 33);
        t tVar = this.f31927j;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(spannableString);
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        h.s((TextView) value3, ((ReferEarnResolveResp) result.data).authRate > 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        Object value = this.f31928o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PpTitleBar) value).c(a.pay_ArrowLeft, CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        Intrinsics.checkNotNullParameter(this, "context");
        j jVar = new j(this);
        this.f31930v = jVar;
        jVar.f4986c = new C1794b(this, 28);
        t tVar = this.f31923e;
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).setLayoutManager(new LinearLayoutManager(this, 1, false));
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setAdapter(this.f31930v);
        C1548f c1548f = new C1548f(getColor(b.jp_invite_divider_line), 1, 20, 20);
        c1548f.f31336e = false;
        Object value4 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((RecyclerView) value4).addItemDecoration(c1548f);
        Object value5 = this.f31924f.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        x xVar = this.f31919B;
        ((Button) value5).setOnClickListener(xVar);
        Object value6 = this.f31920b.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        ((TextView) value6).setOnClickListener(xVar);
        o().setOnClickListener(xVar);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.View
    public final void showRichDialog(int i7, String str, String str2, String str3) {
        ReferEarnRichDialog.Companion aVar = ReferEarnRichDialog.INSTANCE;
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC()) {
            ReferEarnRichDialog referEarnRichDialog = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC(), new z(this));
            referEarnRichDialog.show();
            referEarnRichDialog.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC_RATE()) {
            ReferEarnRichDialog referEarnRichDialog2 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC_RATE(), new A(this));
            referEarnRichDialog2.show();
            referEarnRichDialog2.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_FAIL_RISK()) {
            ReferEarnRichDialog referEarnRichDialog3 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_FAIL_RISK(), new B());
            referEarnRichDialog3.show();
            referEarnRichDialog3.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_ENABLE_ORDER_DISABLE()) {
            ReferEarnRichDialog referEarnRichDialog4 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_ENABLE_ORDER_DISABLE(), new C(this));
            referEarnRichDialog4.show();
            referEarnRichDialog4.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_ENALBE_ORDER_CONFIRM()) {
            ReferEarnRichDialog referEarnRichDialog5 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_ENALBE_ORDER_CONFIRM(), new D(this));
            referEarnRichDialog5.show();
            referEarnRichDialog5.setContent(str);
            String string = getResources().getString(f.jp_withdraw_s_n, q0.j(BaseApplication.getCurrencySymbol(), r0.n0(this.f31931w)));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getResources().getString(f.jp_keep_inviting_n);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            referEarnRichDialog5.setActionName(string, string2);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC_BIND()) {
            ReferEarnRichDialog referEarnRichDialog6 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC_BIND(), new E());
            referEarnRichDialog6.show();
            referEarnRichDialog6.setContent(str);
            referEarnRichDialog6.setBottomContent(str2);
            String string3 = getString(k.core_add_bank_card);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            referEarnRichDialog6.setActionName("", string3);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC_COMMENT()) {
            ReferEarnRichDialog referEarnRichDialog7 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC_COMMENT(), new F(str3, this));
            referEarnRichDialog7.show();
            referEarnRichDialog7.setContent(str);
            referEarnRichDialog7.setBottomContent(str2);
            String string4 = getString(f.jp_share_earn);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            referEarnRichDialog7.setActionName("", string4);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_MANUAL_REVIEW()) {
            ReferEarnRichDialog referEarnRichDialog8 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_MANUAL_REVIEW(), new G());
            referEarnRichDialog8.show();
            referEarnRichDialog8.setContent(str);
            referEarnRichDialog8.setBottomContent(str2);
            String string5 = getString(f.jp_view_now);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            String string6 = getString(f.jp_claim_more);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            referEarnRichDialog8.setActionName(string5, string6);
            return;
        }
        if (i7 == aVar.getRE_TYPE_REAL_NAME_RATE()) {
            ReferEarnRichDialog referEarnRichDialog9 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_REAL_NAME_RATE(), new H());
            referEarnRichDialog9.show();
            referEarnRichDialog9.setContent(str);
            referEarnRichDialog9.setBottomContent(str2);
            String string7 = getString(f.jp_resolve);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            referEarnRichDialog9.setActionName("", string7);
        }
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.View
    public final void showToastDialog(String str) {
        com.transsnet.palmpay.custom_view.dialog.y yVar = new com.transsnet.palmpay.custom_view.dialog.y(this);
        yVar.f31323a = str;
        yVar.h();
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnResolveContract.View
    public final void withDrawCallback() {
        n();
    }
}
