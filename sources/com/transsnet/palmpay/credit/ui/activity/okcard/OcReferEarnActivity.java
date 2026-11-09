package com.transsnet.palmpay.credit.ui.activity.okcard;

import N8.q0;
import Pa.r0;
import Ya.e;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.q;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonLongResult;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.viewmodel.ScrollActivityWebView;
import com.transsnet.palmpay.credit.bean.resp.OcInviteListData;
import com.transsnet.palmpay.credit.bean.resp.OcInviteListResp;
import com.transsnet.palmpay.credit.bean.resp.OcMarqueeResp;
import com.transsnet.palmpay.credit.bean.resp.OcSumRewardResp;
import com.transsnet.palmpay.credit.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcReferEarnActivity;
import com.transsnet.palmpay.credit.ui.dialog.OcREUnFreezeDialog;
import com.transsnet.palmpay.credit.ui.dialog.OcReferEarnWithdrawDialog;
import com.transsnet.palmpay.custom_view.marqueeview.MarqueeView;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p235pb.p;
import p284sb.A;
import p285sc.x;
import p310ub.J0;
import p310ub.L0;
import p355xf.C2131j;
import p355xf.t;
import p368yb.S;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC运营页", path = "/credit_score/oc_refer_earn_activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcReferEarnActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Lpb/p;", "Lcom/transsnet/palmpay/credit/contract/OcReferEarnHomeContract$View;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcReferEarnActivity extends i implements OcReferEarnHomeContract.View {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f29672M = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public MarqueeView f29673A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public S f29674B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f29675C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f29678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f29679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f29680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f29681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f29682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f29683g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f29684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f29685j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f29686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f29687p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f29688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f29689w;
    public String t = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ArrayList f29676H = new ArrayList();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final x f29677L = new x(this, 23);

    public OcReferEarnActivity() {
        final int i7 = 3;
        this.f29678b = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i7) {
                    case 0:
                        int i10 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i11 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i12 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i13 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i14 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i15 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i16 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i10 = 4;
        this.f29679c = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i10) {
                    case 0:
                        int i11 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i12 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i13 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i14 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i15 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i16 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i11 = 5;
        this.f29680d = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i11) {
                    case 0:
                        int i12 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i13 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i14 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i15 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i16 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i12 = 6;
        this.f29681e = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i12) {
                    case 0:
                        int i13 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i14 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i15 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i16 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i112 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i13 = 7;
        this.f29682f = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i13) {
                    case 0:
                        int i14 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i15 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i16 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i112 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i113 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i14 = 8;
        this.f29683g = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i14) {
                    case 0:
                        int i15 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i16 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i112 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i113 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i114 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i15 = 9;
        this.f29684i = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i15) {
                    case 0:
                        int i16 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i112 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i113 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i114 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i115 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i16 = 0;
        this.f29685j = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i16) {
                    case 0:
                        int i17 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i112 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i113 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i114 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i115 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i116 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i17 = 1;
        this.f29686o = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i17) {
                    case 0:
                        int i18 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i112 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i113 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i114 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i115 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i116 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i117 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
        final int i18 = 2;
        this.f29687p = C2131j.b(new Function0(this) { // from class: ub.I0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnActivity f42763b;

            {
                this.f42763b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OcReferEarnActivity ocReferEarnActivity = this.f42763b;
                switch (i18) {
                    case 0:
                        int i19 = OcReferEarnActivity.f29672M;
                        return (PpTitleBar) ocReferEarnActivity.findViewById(e.title_bar);
                    case 1:
                        int i110 = OcReferEarnActivity.f29672M;
                        return (ScrollActivityWebView) ocReferEarnActivity.findViewById(e.cs_my_cash_webview);
                    case 2:
                        int i111 = OcReferEarnActivity.f29672M;
                        return (ImageView) ocReferEarnActivity.findViewById(e.topBg);
                    case 3:
                        int i112 = OcReferEarnActivity.f29672M;
                        return (RelativeLayout) ocReferEarnActivity.findViewById(e.inviteAll);
                    case 4:
                        int i113 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMore);
                    case 5:
                        int i114 = OcReferEarnActivity.f29672M;
                        return (RecyclerView) ocReferEarnActivity.findViewById(e.recycler_view);
                    case 6:
                        int i115 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvMoreInvite);
                    case 7:
                        int i116 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvCashSchedule);
                    case 8:
                        int i117 = OcReferEarnActivity.f29672M;
                        return (TextView) ocReferEarnActivity.findViewById(e.tvWithdraw);
                    default:
                        int i118 = OcReferEarnActivity.f29672M;
                        return (ConstraintLayout) ocReferEarnActivity.findViewById(e.viewContainer);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_refer_earn_activity;
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.View
    public final void hasUnfreeze() {
        new OcREUnFreezeDialog(this).show();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.View
    public final void inviteListResult(OcInviteListResp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        ArrayList arrayList = this.f29676H;
        arrayList.clear();
        Iterator<OcInviteListData> it = result.getData().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            OcInviteListData next = it.next();
            if (next.getActiveStatus() == -1) {
                i7++;
            }
            String strSubstring = next.getFriendPhone().substring(1, 4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = next.getFriendPhone().substring(5);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            arrayList.add("+" + strSubstring + strSubstring2);
        }
        int i10 = Ya.g.cs_friends_invite_ok_card;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i7);
        SpannableString spannableString = new SpannableString(getString(i10, sb2.toString(), q0.j(BaseApplication.getCurrencySymbol(), r0.n0(this.f29688v))));
        spannableString.setSpan(new ForegroundColorSpan(getColor(L6.b.ppColorSuccess)), 0, String.valueOf(i7).length(), 33);
        spannableString.setSpan(new TypefaceSpan("sans-serif-black"), 0, String.valueOf(i7).length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(getColor(L6.b.ppColorSuccess)), (spannableString.length() - r0.n0(this.f29688v).length()) - 2, spannableString.length(), 33);
        spannableString.setSpan(new TypefaceSpan("sans-serif-black"), (spannableString.length() - r0.n0(this.f29688v).length()) - 2, spannableString.length(), 33);
        Object value = this.f29681e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((TextView) value).setText(spannableString);
        m().b();
        m().a(result.getData());
        Object value2 = this.f29678b.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        p220oa.h.s((RelativeLayout) value2, (result.getData() == null || result.getData().isEmpty()) ? false : true);
        if (m().c() > 6) {
            n().setVisibility(0);
        } else {
            n().setVisibility(8);
        }
        m().notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new p();
    }

    public final S m() {
        S s3 = this.f29674B;
        if (s3 != null) {
            return s3;
        }
        Intrinsics.n("mAdapter");
        throw null;
    }

    public final TextView n() {
        Object value = this.f29679c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.View
    public final void okCardBaseAmountResult(CommonLongResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f29688v = result.getData();
        ((p) this.f27350a).querySumReward();
        ((p) this.f27350a).inviteList();
        ((p) this.f27350a).queryMarquee();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        super.processLogic(bundle);
        ((p) this.f27350a).okCardBaseAmount();
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.View
    public final void queryMarqueeResult(OcMarqueeResp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        MarqueeView marqueeView = this.f29673A;
        if (marqueeView != null) {
            marqueeView.b(result.getData());
        } else {
            Intrinsics.n("mMarqueeView");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.View
    public final void queryReferEarnHomeResult(ReferEarnHomeResp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.t = result.getData().getId();
        if (com.transsnet.palmpay.core.config.d.t()) {
            p185ma.t tVar = new p185ma.t(this);
            tVar.f39627c = getString(Ya.g.cs_share_title);
            tVar.s(16);
            tVar.f39628d = this.t;
            return;
        }
        ShareDialog shareDialog = new ShareDialog(this);
        shareDialog.setShareBusinessType(16);
        shareDialog.setReferEarnId(this.t);
        shareDialog.show();
        shareDialog.setTitle(getString(Ya.g.cs_share_title));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        MarqueeView marqueeView = (MarqueeView) findViewById(Ya.e.marquee);
        Intrinsics.checkNotNullParameter(marqueeView, "<set-?>");
        this.f29673A = marqueeView;
        initStatusBar(getColor(p025ba.c.core_oc_refer_earn_bg));
        Intrinsics.checkNotNullParameter(this, "context");
        S s3 = new S(this);
        s3.f44201e = true;
        Intrinsics.checkNotNullParameter(s3, "<set-?>");
        this.f29674B = s3;
        r0.l1(r0.y0("cs_refer_earn_header.png"), (ImageView) this.f29687p.getValue());
        t tVar = this.f29680d;
        Object value = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((RecyclerView) value).setLayoutManager(new GridLayoutManager(this, 3));
        Object value2 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((RecyclerView) value2).addItemDecoration(new J0());
        Object value3 = tVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((RecyclerView) value3).setAdapter(m());
        m().f4986c = new p287se.d(this, 14);
        Object value4 = this.f29685j.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((PpTitleBar) value4).setRightTextViewClickListener(new A(26));
        TextView textViewN = n();
        x xVar = this.f29677L;
        p220oa.h.l(xVar, textViewN);
        Object value5 = this.f29678b.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        p220oa.h.l(xVar, (RelativeLayout) value5);
        Object value6 = this.f29683g.getValue();
        Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
        p220oa.h.l(xVar, (TextView) value6);
        ScrollActivityWebView scrollActivityWebView = (ScrollActivityWebView) this.f29686o.getValue();
        if (scrollActivityWebView != null) {
            scrollActivityWebView.loadUrl(com.transsnet.palmpay.core.config.d.g("/#/okcard/marketing-rules"));
        }
        Object value7 = this.f29684i.getValue();
        Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
        ((ConstraintLayout) value7).setBackground(q.a(getTheme(), getResources(), p025ba.d.core_oc_refer_earn_details_bg));
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.View
    public final void sumRewardResult(OcSumRewardResp result) {
        Intrinsics.checkNotNullParameter(result, "result");
        long reward = result.getData().getReward();
        this.f29689w = reward;
        t tVar = this.f29683g;
        if (reward == 0) {
            Object value = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((TextView) value).setBackgroundResource(Ya.d.cs_re_unwithdraw_bg);
        } else {
            Object value2 = tVar.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setBackgroundResource(Ya.d.cs_re_withdraw_bg);
        }
        String strJ = q0.j(BaseApplication.getCurrencySymbol(), r0.n0(result.getData().getReward()));
        SpannableString spannableString = new SpannableString(q0.y(strJ, "/", q0.j(BaseApplication.getCurrencySymbol(), r0.n0(result.getData().getTotalReward()))));
        spannableString.setSpan(new AbsoluteSizeSpan(SizeUtils.dp2px(30.0f)), 0, strJ.length(), 33);
        spannableString.setSpan(new TypefaceSpan("sans-serif-black"), 0, strJ.length(), 33);
        Object value3 = this.f29682f.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((TextView) value3).setText(spannableString);
    }

    @Override // com.transsnet.palmpay.credit.contract.OcReferEarnHomeContract.View
    public final void withdrawResult(int i7) {
        OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog = new OcReferEarnWithdrawDialog(this, new L0(this));
        ocReferEarnWithdrawDialog.show();
        ocReferEarnWithdrawDialog.setType(i7);
        ((p) this.f27350a).querySumReward();
        ((p) this.f27350a).inviteList();
        ((p) this.f27350a).queryMarquee();
    }
}
