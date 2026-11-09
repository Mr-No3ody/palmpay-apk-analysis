package com.transsnet.palmpay.jara_packet.ui.activity;

import Da.g;
import N8.q0;
import Pa.i0;
import Pa.k0;
import Pa.r0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.text.ImageTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.rollingtextview.RollingTextView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.base.i;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.jara_packet.bean.WhoInviteItem;
import com.transsnet.palmpay.jara_packet.bean.resp.ReInviteListResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReInviteRecordItem;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnHomeResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnOrderLatestResp;
import com.transsnet.palmpay.jara_packet.bean.resp.ReferEarnRecordsResp;
import com.transsnet.palmpay.jara_packet.ui.activity.ReferEarnHomePageActivity;
import com.transsnet.palmpay.jara_packet.ui.dialog.ReferEarnRichDialog;
import com.transsnet.palmpay.jara_packet.ui.model.ReferEarnTextSwitcherModel;
import com.transsnet.palmpay.jara_packet.ui.model.comments.AutoPollRecyclerView;
import com.transsnet.palmpay.jara_packet.ui.model.comments.ReferEarnCommentsView;
import com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract;
import com.transsnet.palmpay.util.SizeUtils;
import io.fastkv.n;
import io.reactivex.internal.operators.observable.C1760l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.r;
import kotlin.collections.v;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.E;
import p141j9.C1794b;
import p141j9.C1798f;
import p220oa.h;
import p236pc.d;
import p236pc.e;
import p285sc.C2035i;
import p285sc.ViewOnClickListenerC2033g;
import p285sc.k;
import p285sc.l;
import p285sc.o;
import p285sc.p;
import p285sc.q;
import p285sc.s;
import p285sc.u;
import p298tf.f;
import p352xc.a;
import p352xc.b;
import p352xc.c;
import p355xf.C2131j;
import p355xf.t;
import p382zb.I;
import p383zc.m;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/refer_earn/homepage")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnHomePageActivity;", "Lcom/transsnet/palmpay/core/base/i;", "Lzc/m;", "Lcom/transsnet/palmpay/jara_packet/ui/mvp/contract/ReferEarnHomePageContract$View;", "<init>", "()V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReferEarnHomePageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReferEarnHomePageActivity.kt\ncom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnHomePageActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1031:1\n1563#2:1032\n1634#2,3:1033\n1#3:1036\n*S KotlinDebug\n*F\n+ 1 ReferEarnHomePageActivity.kt\ncom/transsnet/palmpay/jara_packet/ui/activity/ReferEarnHomePageActivity\n*L\n388#1:1032\n388#1:1033,3\n*E\n"})
public final class ReferEarnHomePageActivity extends i implements ReferEarnHomePageContract.View {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f31872z0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final t f31873A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final t f31874B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f31875C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final t f31876H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public a f31877L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public c f31878M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f31879Q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f31884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f31887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f31888g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f31889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ReferEarnCommentsView f31890j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f31891k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f31893p;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ReferEarnHomeResp f31897s0;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f31900v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CustomFloatingView f31901v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f31902w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final t f31903w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Animation f31904x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public com.transsnet.adsdk.widgets.banner.bannerview.b f31905y0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public p103gf.a f31880X = new p103gf.a();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public p103gf.a f31881Y = new p103gf.a();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final ArrayList f31882Z = new ArrayList();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f31894p0 = "";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f31895q0 = 10;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f31896r0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f31898t0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public String f31899u0 = "0";

    public ReferEarnHomePageActivity() {
        final int i7 = 11;
        this.f31883b = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i7) {
                    case 0:
                        int i10 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i11 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i12 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i13 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i14 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i15 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i16 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i10 = 2;
        this.f31885d = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i10) {
                    case 0:
                        int i11 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i12 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i13 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i14 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i15 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i16 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i11 = 3;
        this.f31886e = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i11) {
                    case 0:
                        int i12 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i13 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i14 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i15 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i16 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i12 = 4;
        this.f31887f = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i12) {
                    case 0:
                        int i13 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i14 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i15 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i16 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i13 = 5;
        this.f31888g = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i13) {
                    case 0:
                        int i14 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i15 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i16 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i14 = 6;
        this.f31889i = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i14) {
                    case 0:
                        int i15 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i16 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i15 = 7;
        this.f31892o = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i15) {
                    case 0:
                        int i16 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i16 = 8;
        this.f31893p = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i16) {
                    case 0:
                        int i17 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i17 = 9;
        this.t = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i17) {
                    case 0:
                        int i18 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i18 = 10;
        this.f31900v = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i18) {
                    case 0:
                        int i19 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i118 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i19 = 12;
        this.f31902w = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i19) {
                    case 0:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i118 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i119 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i20 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i20 = 13;
        this.f31873A = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i20) {
                    case 0:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i118 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i119 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i21 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i26 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i21 = 14;
        this.f31874B = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i21) {
                    case 0:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i118 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i119 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i22 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i26 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i27 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i22 = 15;
        this.f31875C = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i22) {
                    case 0:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i118 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i119 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i23 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i26 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i27 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i28 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i23 = 0;
        this.f31876H = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i23) {
                    case 0:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i118 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i119 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i24 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i26 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i27 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i28 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i29 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
        final int i24 = 1;
        this.f31903w0 = C2131j.b(new Function0(this) { // from class: sc.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ReferEarnHomePageActivity f42215b;

            {
                this.f42215b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42215b;
                switch (i24) {
                    case 0:
                        int i110 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.btnCopyInvitationCode);
                    case 1:
                        int i111 = ReferEarnHomePageActivity.f31872z0;
                        return Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorFlexiCashAssist, referEarnHomePageActivity));
                    case 2:
                        int i112 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite);
                    case 3:
                        int i113 = ReferEarnHomePageActivity.f31872z0;
                        return (RollingTextView) referEarnHomePageActivity.findViewById(d.jp_my_cash_value);
                    case 4:
                        int i114 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.tvWithdraw);
                    case 5:
                        int i115 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.statusBarView);
                    case 6:
                        int i116 = ReferEarnHomePageActivity.f31872z0;
                        return (LinearLayout) referEarnHomePageActivity.findViewById(d.viewContainer);
                    case 7:
                        int i117 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_btn);
                    case 8:
                        int i118 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvRank);
                    case 9:
                        int i119 = ReferEarnHomePageActivity.f31872z0;
                        return (ViewSwitcher) referEarnHomePageActivity.findViewById(d.jp_my_cash_switcher);
                    case 10:
                        int i25 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivBg);
                    case 11:
                        int i26 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.jp_cash_invite_expire);
                    case 12:
                        int i27 = ReferEarnHomePageActivity.f31872z0;
                        return (ImageView) referEarnHomePageActivity.findViewById(d.ivAmountBg);
                    case 13:
                        int i28 = ReferEarnHomePageActivity.f31872z0;
                        return (PpTitleBar) referEarnHomePageActivity.findViewById(d.titleBar);
                    case 14:
                        int i29 = ReferEarnHomePageActivity.f31872z0;
                        return referEarnHomePageActivity.findViewById(d.clInvitationCodeSection);
                    default:
                        int i210 = ReferEarnHomePageActivity.f31872z0;
                        return (TextView) referEarnHomePageActivity.findViewById(d.tvInvitationCode);
                }
            }
        });
    }

    public static void q(ReferEarnHomePageActivity referEarnHomePageActivity, String str, int i7) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        int i10 = (i7 & 4) != 0 ? 16 : 17;
        if (referEarnHomePageActivity.f31894p0.length() == 0) {
            return;
        }
        if (com.transsnet.palmpay.core.config.d.t()) {
            p185ma.t tVar = new p185ma.t(referEarnHomePageActivity);
            tVar.f39628d = referEarnHomePageActivity.f31894p0;
            tVar.s(i10);
        } else {
            ShareDialog shareDialog = new ShareDialog(referEarnHomePageActivity);
            if (!TextUtils.isEmpty(str)) {
                shareDialog.setSharePhoneNumber(str);
            }
            shareDialog.setShareBusinessTypeWithEntrySource(i10, 0);
            shareDialog.setReferEarnId(referEarnHomePageActivity.f31894p0);
            shareDialog.show();
        }
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void commentListResult(CommonBeanResult resp) {
        Intrinsics.checkNotNullParameter(resp, "resp");
        if (this.f31890j == null) {
            this.f31890j = new ReferEarnCommentsView(this, null, 6, 0);
            Object value = this.f31889i.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ReferEarnCommentsView referEarnCommentsView = this.f31890j;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, CommonViewExtKt.getDp(100.0f));
            layoutParams.topMargin = CommonViewExtKt.getDp(10.0f);
            Unit unit = Unit.f38893a;
            ((LinearLayout) value).addView(referEarnCommentsView, layoutParams);
        }
        ReferEarnCommentsView referEarnCommentsView2 = this.f31890j;
        if (referEarnCommentsView2 != null) {
            referEarnCommentsView2.d(resp);
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return e.jp_activity_cs_homepage;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        HashMap map = new HashMap();
        map.put(LogConstants.Autotrack.EVENT_RE_BTN_ENABLE, Boolean.valueOf(p367ya.a.d().f44149a.getBoolean(LogConstants.Autotrack.EVENT_RE_BTN_ENABLE, false)));
        AutoTrackUtil.trackActivityProperties(this, map);
        Object value = this.f31900v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        r0.r1(r0.y0("/jp_cs_homepage_top_3.png"), (ImageView) value);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(0);
        requestLayoutFullScreen();
    }

    @Override // com.transsnet.palmpay.core.base.i
    public final IBasePresenter l() {
        return new m();
    }

    public final TextView m() {
        Object value = this.f31892o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    public final ViewSwitcher n() {
        Object value = this.t.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ViewSwitcher) value;
    }

    public final RollingTextView o() {
        Object value = this.f31886e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RollingTextView) value;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onBackPressed() {
        ((m) this.f27350a).queryReferEarnPop();
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.transsnet.adsdk.widgets.banner.bannerview.b bVar = this.f31905y0;
        if (bVar != null) {
            getUIHandler().removeCallbacks(bVar);
        }
        this.f31905y0 = null;
        s();
        this.f31904x0 = null;
        n().setInAnimation(null);
        n().setOutAnimation(null);
        p103gf.a aVar = this.f31880X;
        if (aVar != null) {
            aVar.dispose();
            this.f31880X = null;
        }
        p103gf.a aVar2 = this.f31881Y;
        if (aVar2 != null) {
            aVar2.dispose();
            this.f31881Y = null;
        }
        ReferEarnCommentsView referEarnCommentsView = this.f31890j;
        if (referEarnCommentsView != null) {
            AutoPollRecyclerView mRecyclerView = referEarnCommentsView.getMRecyclerView();
            mRecyclerView.f31982b = false;
            mRecyclerView.removeCallbacks(mRecyclerView.f31981a);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        s();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        p(this.f31891k0);
        s();
        com.transsnet.adsdk.widgets.banner.bannerview.b bVar = this.f31905y0;
        if (bVar != null) {
            getUIHandler().removeCallbacks(bVar);
        }
        com.transsnet.adsdk.widgets.banner.bannerview.b bVar2 = new com.transsnet.adsdk.widgets.banner.bannerview.b(this, 24);
        this.f31905y0 = bVar2;
        getUIHandler().post(bVar2);
        ((m) this.f27350a).queryReInviteList();
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void onUpdateReInviteIsInviteDone(String str) {
        q(this, str, 2);
    }

    public final void p(long j6) {
        p103gf.a aVar = this.f31881Y;
        if (aVar != null) {
            aVar.a();
        }
        if (j6 == 0) {
            return;
        }
        new C1760l(df.d.g(1000L, 1000L, TimeUnit.MILLISECONDS, f.f42628a), new C1794b(new C2035i(j6, this), 27), 2).k(f.f42629b).i(p071ef.b.a()).subscribe(new k(this, 0));
    }

    @Override // com.transsnet.palmpay.core.base.i, com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ReferEarnHomePageActivity referEarnHomePageActivity;
        super.processLogic(bundle);
        ((m) this.f27350a).queryReferEarnHome();
        if (getIntent() == null) {
            referEarnHomePageActivity = this;
        } else {
            referEarnHomePageActivity = this;
            new Handler(Looper.getMainLooper()).postDelayed(new g(referEarnHomePageActivity, getIntent().getStringExtra("transparentJson"), getIntent().getStringExtra("visitSeconds"), getIntent().getStringExtra("originPath"), 19), 1000L);
        }
        if (referEarnHomePageActivity.f31878M != null) {
            return;
        }
        referEarnHomePageActivity.f31878M = new c((ViewStub) findViewById(d.jp_who_invite_list_layout), new C1798f(this, 18));
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void queryOrderLatestResult(CommonListResultV2 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = this.f31882Z;
        arrayList.clear();
        arrayList.addAll(data.data);
        p103gf.a aVar = this.f31880X;
        if (aVar != null) {
            aVar.a();
        }
        df.d.g(3000L, 3000L, TimeUnit.MILLISECONDS, f.f42628a).i(p071ef.b.a()).subscribe(new k(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void queryReInviteListResult(CommonBeanResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f31878M == null) {
            this.f31878M = new c((ViewStub) findViewById(d.jp_who_invite_list_layout), new C1798f(this, 18));
        }
        if (!result.isSuccess()) {
            c cVar = this.f31878M;
            if (cVar != null) {
                cVar.b(z.f38935a);
                return;
            }
            return;
        }
        ReInviteListResp reInviteListResp = (ReInviteListResp) result.data;
        List<ReInviteRecordItem> list = reInviteListResp != null ? reInviteListResp.getList() : null;
        if (list == null) {
            list = z.f38935a;
        }
        List<ReInviteRecordItem> list2 = list;
        ArrayList arrayList = new ArrayList(r.l(list2, 10));
        for (ReInviteRecordItem reInviteRecordItem : list2) {
            arrayList.add(new WhoInviteItem(reInviteRecordItem.getId(), reInviteRecordItem.getPhone(), reInviteRecordItem.getTransType(), reInviteRecordItem.getName(), reInviteRecordItem.getTransTypeDesc(), reInviteRecordItem.isInvite()));
        }
        c cVar2 = this.f31878M;
        if (cVar2 != null) {
            cVar2.b(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void queryReferEarnHomeResult(CommonBeanResult data) {
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!data.isSuccess()) {
            if ("15030038".equals(data.getRespCode())) {
                n.O(this, 0, null, "Refer & Earn Upgrade", null, null, null, data.getRespMsg(), null, "Upgrade Now", new ViewOnClickListenerC2033g(this, 1), null, null, null, new ViewOnClickListenerC2033g(this, 2), false, 0, 8337787);
                return;
            } else {
                showToastDialog(data.getRespMsg());
                return;
            }
        }
        p367ya.a.d().f44149a.k(LogConstants.Autotrack.EVENT_RE_BTN_ENABLE, ((ReferEarnHomeResp) data.data).shareEnable);
        ((m) this.f27350a).queryOrderLatest();
        ReferEarnHomeResp referEarnHomeResp = (ReferEarnHomeResp) data.data;
        this.f31897s0 = referEarnHomeResp;
        if (this.f31884c == null) {
            this.f31884c = new b((ViewStub) findViewById(d.rewardProgressStub));
        }
        b bVar = this.f31884c;
        if (bVar != null) {
            bVar.f43843c = referEarnHomeResp;
            if (referEarnHomeResp != null) {
                long j6 = referEarnHomeResp.targetAmt2;
                Bc.f fVar = bVar.f43842b;
                if (j6 == 0 || referEarnHomeResp.targetAmt3 == 0) {
                    if (fVar != null) {
                        h.c((TextView) fVar.f698d);
                    }
                    if (fVar != null) {
                        h.c((TextView) fVar.f699e);
                    }
                    if (fVar != null) {
                        h.c((TextView) fVar.f702i);
                    }
                    if (fVar != null) {
                        h.c((TextView) fVar.f703j);
                    }
                    if (fVar != null) {
                        ((TextView) fVar.f696b).setText(bVar.b(referEarnHomeResp.userCount3));
                    }
                    if (fVar != null) {
                        ((TextView) fVar.f700f).setText(b.a(referEarnHomeResp.targetAmt1));
                    }
                    if (fVar != null) {
                        ((ProgressBar) fVar.f701g).setMax((int) referEarnHomeResp.targetAmt1);
                    }
                } else {
                    if (fVar != null) {
                        ((TextView) fVar.f702i).setText(bVar.b(referEarnHomeResp.userCount1));
                    }
                    if (fVar != null) {
                        ((TextView) fVar.f703j).setText(bVar.b(referEarnHomeResp.userCount2));
                    }
                    if (fVar != null) {
                        ((TextView) fVar.f696b).setText(bVar.b(referEarnHomeResp.userCount3));
                    }
                    if (fVar != null) {
                        ((TextView) fVar.f698d).setText(b.a(referEarnHomeResp.targetAmt1));
                    }
                    if (fVar != null) {
                        ((TextView) fVar.f699e).setText(b.a(referEarnHomeResp.targetAmt2));
                    }
                    if (fVar != null) {
                        ((TextView) fVar.f700f).setText(b.a(referEarnHomeResp.targetAmt3));
                    }
                    if (fVar != null) {
                        ((ProgressBar) fVar.f701g).setMax((int) referEarnHomeResp.targetAmt3);
                    }
                    View view = bVar.f43841a;
                    if ((view != null ? view.getMeasuredWidth() : 0) > 0) {
                        bVar.c(referEarnHomeResp);
                    } else if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                        viewTreeObserver.addOnGlobalLayoutListener(new Be.c(bVar, 22));
                    }
                }
                if (fVar != null) {
                    ProgressBar progressBar = (ProgressBar) fVar.f701g;
                    progressBar.setProgress((int) referEarnHomeResp.actualAmt);
                    p311uc.a aVar = new p311uc.a(progressBar, progressBar.getProgress());
                    aVar.setDuration(2000L);
                    progressBar.startAnimation(aVar);
                }
            }
        }
        Intrinsics.e(referEarnHomeResp);
        RollingTextView rollingTextViewO = o();
        rollingTextViewO.getClass();
        Intrinsics.checkNotNullParameter("0123456789", "orderList");
        Intrinsics.checkNotNullParameter("0123456789", "<this>");
        E orderList = new E();
        p039cb.c cVar = rollingTextViewO.f25002d;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(orderList, "orderList");
        ArrayList arrayListI = C1850q.i(0);
        v.n(arrayListI, orderList);
        ((ArrayList) cVar.f18902c).add(new LinkedHashSet(arrayListI));
        o().setAnimationDuration(2000L);
        RollingTextView rollingTextViewO2 = o();
        p379z7.b direction = p379z7.b.f44496c;
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(direction, "direction");
        p379z7.a orderStrategy = new p379z7.a();
        orderStrategy.f44495u = true;
        Intrinsics.checkNotNullParameter(orderStrategy, "orderStrategy");
        rollingTextViewO2.setCharStrategy(new p379z7.d(orderStrategy));
        RollingTextView rollingTextViewO3 = o();
        String strM0 = r0.m0(referEarnHomeResp.actualAmt);
        Intrinsics.checkNotNullExpressionValue(strM0, "getNumberStringWithOutUnitPoint(...)");
        rollingTextViewO3.setText(strM0);
        Object value = this.f31902w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        r0.i1((ImageView) value, ((ReferEarnHomeResp) data.data).topAmountBg, 0, CommonViewExtKt.getDp(110.0f));
        SpannableString spannableString = new SpannableString(getResources().getString(p236pc.f.jp_invite_new_users, referEarnHomeResp.nextUserCount, BaseApplication.getCurrencySymbol(), r0.m0(referEarnHomeResp.nextAmt)));
        t tVar = this.f31903w0;
        k0.d(spannableString, "[a-zA-Z]*([1-9]\\d*)[a-zA-Z]*", ((Number) tVar.getValue()).intValue(), SizeUtils.dp2px(14.0f), "sans-serif-medium");
        k0.d(spannableString, "[a-zA-Z]*(₦[1-9]\\d*)[a-zA-Z]*", ((Number) tVar.getValue()).intValue(), SizeUtils.dp2px(14.0f), "sans-serif-medium");
        Object value2 = this.f31885d.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((TextView) value2).setText(spannableString);
        String str = referEarnHomeResp.inviteCode;
        t tVar2 = this.f31874B;
        if (str == null || str.length() == 0) {
            Object value3 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            h.c((View) value3);
        } else {
            Object value4 = this.f31875C.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((TextView) value4).setText(str);
            Object value5 = tVar2.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            h.C((View) value5);
        }
        if (referEarnHomeResp.upgradeFlag) {
            r(ReferEarnRichDialog.INSTANCE.getRE_TYPE_UPGRADE(), referEarnHomeResp.id, referEarnHomeResp.remark, q0.j(BaseApplication.getCurrencySymbol(), r0.n0(referEarnHomeResp.withdrawAmt)));
        }
        long j10 = referEarnHomeResp.endTime;
        this.f31891k0 = j10;
        p(j10);
        String str2 = referEarnHomeResp.id;
        if (str2 == null) {
            str2 = "";
        }
        this.f31894p0 = str2;
        this.f31896r0 = 1;
        ((m) this.f27350a).queryReferEarnRecords(str2, 1, this.f31895q0);
        if (referEarnHomeResp.popover == 1) {
            ReferEarnRewardDialogActivity.f31932q0.startActivity(this, referEarnHomeResp);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void queryReferRecordsResult(CommonBeanResult data) {
        ArrayList arrayListB;
        Context context;
        ArrayList arrayListB2;
        View viewInflate;
        Context context2;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = null;
        if (this.f31877L == null) {
            ViewStub viewStub = (ViewStub) findViewById(d.jp_invite_list_layout);
            a aVar = new a();
            aVar.f43836a = this;
            if (viewStub != null) {
                try {
                    viewInflate = viewStub.inflate();
                } catch (Exception unused) {
                }
            } else {
                viewInflate = null;
            }
            aVar.f43837b = viewInflate;
            View view = aVar.f43837b;
            if (view != null) {
                int i7 = d.bottomBarrier;
                if (((Barrier) p059e1.a.m(i7, view)) != null) {
                    i7 = d.ivNoInvitees;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, view);
                    if (appCompatImageView != null) {
                        i7 = d.jp_iv_expand;
                        ImageTextView imageTextView = (ImageTextView) p059e1.a.m(i7, view);
                        if (imageTextView != null) {
                            i7 = d.jp_my_cash_rv;
                            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, view);
                            if (recyclerView != null) {
                                i7 = d.tvInvitees;
                                TextView textView = (TextView) p059e1.a.m(i7, view);
                                if (textView != null) {
                                    i7 = d.tvNoInvitees;
                                    TextView textView2 = (TextView) p059e1.a.m(i7, view);
                                    if (textView2 != null) {
                                        aVar.f43838c = new Bc.k((ConstraintLayout) view, appCompatImageView, imageTextView, recyclerView, textView, textView2, 18);
                                        View view2 = aVar.f43837b;
                                        if (view2 != null && (context2 = view2.getContext()) != null) {
                                            recyclerView.setLayoutManager(new LinearLayoutManager(context2, 1, false));
                                            p295tc.f fVar = new p295tc.f(context2, new I(aVar));
                                            aVar.f43839d = fVar;
                                            C1548f c1548f = new C1548f(context2.getColor(p236pc.b.jp_invite_divider_line), CommonViewExtKt.getDp(1.0f), CommonViewExtKt.getDp(19.0f), CommonViewExtKt.getDp(19.0f));
                                            c1548f.f31336e = false;
                                            recyclerView.addItemDecoration(c1548f);
                                            recyclerView.setAdapter(fVar);
                                        }
                                        imageTextView.setOnClickListener(aVar);
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
            }
            this.f31877L = aVar;
        }
        a aVar2 = this.f31877L;
        if (aVar2 != null) {
            int i10 = this.f31896r0;
            Intrinsics.checkNotNullParameter(data, "data");
            boolean zIsEmpty = ((ReferEarnRecordsResp) data.data).list.isEmpty();
            Bc.k kVar = aVar2.f43838c;
            if (zIsEmpty) {
                if (kVar != null) {
                    h.c((ImageTextView) kVar.f752f);
                }
            } else if (kVar != null) {
                ((ImageTextView) kVar.f752f).setEnabled(true);
            }
            p295tc.f fVar2 = aVar2.f43839d;
            if (i10 == 1) {
                long j6 = ((ReferEarnRecordsResp) data.data).total;
                aVar2.f43840e = j6;
                if (j6 <= 3) {
                    if (kVar != null) {
                        h.c((ImageTextView) kVar.f752f);
                    }
                } else if (kVar != null) {
                    h.C((ImageTextView) kVar.f752f);
                }
                if (fVar2 != null && (arrayListB2 = fVar2.b()) != null) {
                    arrayListB2.clear();
                }
                if (((ReferEarnRecordsResp) data.data).list.isEmpty()) {
                    if (kVar != null) {
                        ((TextView) kVar.f749c).setText(p236pc.f.jp_my_invitees);
                    }
                    if (kVar != null) {
                        h.C((TextView) kVar.f750d);
                    }
                    if (kVar != null) {
                        h.C((AppCompatImageView) kVar.f748b);
                    }
                } else {
                    if (kVar != null) {
                        TextView textView3 = (TextView) kVar.f749c;
                        View view3 = aVar2.f43837b;
                        if (view3 != null && (context = view3.getContext()) != null) {
                            string = context.getString(p236pc.f.jp_my_invitees_s, String.valueOf(((ReferEarnRecordsResp) data.data).total));
                        }
                        textView3.setText(string);
                    }
                    if (kVar != null) {
                        h.c((TextView) kVar.f750d);
                    }
                    if (kVar != null) {
                        h.c((AppCompatImageView) kVar.f748b);
                    }
                }
            }
            if (fVar2 != null && (arrayListB = fVar2.b()) != null) {
                arrayListB.addAll(((ReferEarnRecordsResp) data.data).list);
            }
            long j10 = aVar2.f43840e;
            if (j10 > 0) {
                Number numberValueOf = fVar2 != null ? Long.valueOf(fVar2.getItemCount()) : 0;
                if ((numberValueOf instanceof Long) && j10 == numberValueOf.longValue() && kVar != null) {
                    h.c((ImageTextView) kVar.f752f);
                }
            }
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
        }
    }

    public final void r(int i7, String str, String str2, String str3) {
        ReferEarnRichDialog.Companion aVar = ReferEarnRichDialog.INSTANCE;
        if (i7 == aVar.getRE_TYPE_UPGRADE()) {
            ReferEarnRichDialog referEarnRichDialog = new ReferEarnRichDialog(this, aVar.getRE_TYPE_UPGRADE(), new p285sc.n(this, str));
            referEarnRichDialog.show();
            referEarnRichDialog.setContent(str2);
            String string = getString(p236pc.f.jp_withdraw_s_n, str3);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = getString(p236pc.f.jp_keep_inviting_n);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            referEarnRichDialog.setActionName(string, string2);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC()) {
            ReferEarnRichDialog referEarnRichDialog2 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC(), new l(this));
            referEarnRichDialog2.show();
            referEarnRichDialog2.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC_RATE()) {
            ReferEarnRichDialog referEarnRichDialog3 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC_RATE(), new p285sc.m(this));
            referEarnRichDialog3.show();
            referEarnRichDialog3.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_FAIL_RISK()) {
            ReferEarnRichDialog referEarnRichDialog4 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_FAIL_RISK(), new o());
            referEarnRichDialog4.show();
            referEarnRichDialog4.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_RETAIN()) {
            ReferEarnRichDialog referEarnRichDialog5 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_RETAIN(), new p(this));
            referEarnRichDialog5.show();
            referEarnRichDialog5.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_ENABLE_ORDER_DISABLE()) {
            ReferEarnRichDialog referEarnRichDialog6 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_ENABLE_ORDER_DISABLE(), new q(this));
            referEarnRichDialog6.show();
            referEarnRichDialog6.setContent(str);
            return;
        }
        if (i7 == aVar.getRE_TYPE_ENALBE_ORDER_CONFIRM()) {
            ReferEarnRichDialog referEarnRichDialog7 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_ENALBE_ORDER_CONFIRM(), new p285sc.r(this));
            referEarnRichDialog7.show();
            referEarnRichDialog7.setContent(str);
            Resources resources = getResources();
            int i10 = p236pc.f.jp_withdraw_s_n;
            String currencySymbol = BaseApplication.getCurrencySymbol();
            ReferEarnHomeResp referEarnHomeResp = this.f31897s0;
            String string3 = resources.getString(i10, q0.j(currencySymbol, referEarnHomeResp != null ? r0.n0(referEarnHomeResp.withdrawAmt) : null));
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String string4 = getResources().getString(p236pc.f.jp_keep_inviting_n);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            referEarnRichDialog7.setActionName(string3, string4);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC_BIND()) {
            ReferEarnRichDialog referEarnRichDialog8 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC_BIND(), new s());
            referEarnRichDialog8.show();
            referEarnRichDialog8.setContent(str);
            referEarnRichDialog8.setBottomContent(str2);
            String string5 = getString(p025ba.k.core_add_bank_card);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            referEarnRichDialog8.setActionName("", string5);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_SUCC_COMMENT()) {
            ReferEarnRichDialog referEarnRichDialog9 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_SUCC_COMMENT(), new p285sc.t(this, str3));
            referEarnRichDialog9.show();
            referEarnRichDialog9.setContent(str);
            referEarnRichDialog9.setBottomContent(str2);
            String string6 = getString(p236pc.f.jp_share_earn);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            referEarnRichDialog9.setActionName("", string6);
            return;
        }
        if (i7 == aVar.getRE_TYPE_WITHDRAW_MANUAL_REVIEW()) {
            ReferEarnRichDialog referEarnRichDialog10 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_WITHDRAW_MANUAL_REVIEW(), new u());
            referEarnRichDialog10.show();
            referEarnRichDialog10.setContent(str);
            referEarnRichDialog10.setBottomContent(str2);
            String string7 = getString(p236pc.f.jp_view_now);
            Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
            String string8 = getString(p236pc.f.jp_claim_more);
            Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
            referEarnRichDialog10.setActionName(string7, string8);
            return;
        }
        if (i7 == aVar.getRE_TYPE_REAL_NAME_RATE()) {
            ReferEarnRichDialog referEarnRichDialog11 = new ReferEarnRichDialog(this, aVar.getRE_TYPE_REAL_NAME_RATE(), new p285sc.v());
            referEarnRichDialog11.show();
            referEarnRichDialog11.setContent(str);
            referEarnRichDialog11.setBottomContent(str2);
            String string9 = getString(p236pc.f.jp_resolve);
            Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
            referEarnRichDialog11.setActionName("", string9);
        }
    }

    public final void s() {
        com.transsnet.adsdk.widgets.banner.bannerview.b bVar = this.f31905y0;
        if (bVar != null) {
            getUIHandler().removeCallbacks(bVar);
        }
        try {
            if (i0.X(this)) {
                m().clearAnimation();
            }
        } catch (Exception unused) {
        }
        this.f31904x0 = null;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 0;
        int i10 = 24;
        Object value = this.f31873A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        PpTitleBar ppTitleBar = (PpTitleBar) value;
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextBase, this);
        ppTitleBar.c(S6.a.pay_ArrowLeft, iColorInt);
        ppTitleBar.setRightImageView2ClickListener(new ViewOnClickListenerC2033g(this, 3));
        ppTitleBar.setBackButtonClickListener(new ViewOnClickListenerC2033g(this, 4));
        S6.a aVar = S6.a.pay_More;
        ImageView imageView = ppTitleBar.f24625f;
        if (imageView != null) {
            imageView.setImageDrawable(p059e1.a.h(ppTitleBar.getContext(), aVar, null, iColorInt, 24));
        }
        if (Build.VERSION.SDK_INT >= 35) {
            Object value2 = this.f31888g.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            View view = (View) value2;
            if (view != null) {
                h.c(view);
            }
        }
        o().setTypeface(r0.K0(this, "fonts/PalmPayNum-Bold.ttf"));
        r0.R1((TextView) findViewById(d.tvCurrency), "fonts/PalmPayNum-Bold.ttf");
        ViewOnClickListenerC2033g viewOnClickListenerC2033g = new ViewOnClickListenerC2033g(this, i7);
        TextView textViewM = m();
        Object value3 = this.f31887f.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        Object value4 = this.f31893p.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        View viewFindViewById = findViewById(d.tvReward);
        Object value5 = this.f31876H.getValue();
        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
        h.q(viewOnClickListenerC2033g, textViewM, (View) value3, (TextView) value4, viewFindViewById, (TextView) value5);
        s();
        com.transsnet.adsdk.widgets.banner.bannerview.b bVar = this.f31905y0;
        if (bVar != null) {
            getUIHandler().removeCallbacks(bVar);
        }
        com.transsnet.adsdk.widgets.banner.bannerview.b bVar2 = new com.transsnet.adsdk.widgets.banner.bannerview.b(this, i10);
        this.f31905y0 = bVar2;
        getUIHandler().post(bVar2);
        n().setInAnimation(AnimationUtils.loadAnimation(this, p236pc.a.slide_in_bottom));
        n().setOutAnimation(AnimationUtils.loadAnimation(this, p236pc.a.slide_out_top));
        n().setFactory(new ViewSwitcher.ViewFactory() { // from class: sc.h
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                int i11 = ReferEarnHomePageActivity.f31872z0;
                ReferEarnHomePageActivity referEarnHomePageActivity = this.f42218a;
                ReferEarnTextSwitcherModel referEarnTextSwitcherModel = new ReferEarnTextSwitcherModel(referEarnHomePageActivity, null, 6, 0);
                ArrayList arrayList = referEarnHomePageActivity.f31882Z;
                if (arrayList.size() != 0) {
                    Object obj = arrayList.get(referEarnHomePageActivity.f31879Q);
                    Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                    referEarnTextSwitcherModel.setModel((ReferEarnOrderLatestResp) obj);
                }
                return referEarnTextSwitcherModel;
            }
        });
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void showRichDialog(int i7, String str, String str2, String str3) {
        r(i7, str, str2, str3);
    }

    @Override // com.transsnet.palmpay.jara_packet.ui.mvp.contract.ReferEarnHomePageContract.View
    public final void showToastDialog(String str) {
        y yVar = new y(this);
        yVar.f31323a = str;
        yVar.h();
    }
}
