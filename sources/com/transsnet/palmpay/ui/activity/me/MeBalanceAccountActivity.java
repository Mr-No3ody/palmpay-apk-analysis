package com.transsnet.palmpay.ui.activity.me;

import Ac.e;
import Ac.f;
import Bc.o;
import L6.b;
import Pa.i0;
import Pa.k0;
import Pa.r0;
import Pe.C0531c;
import Pe.C0532d;
import Pe.C0533e;
import Wf.AbstractC0780y;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.V;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.AccountFlowReq;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.viewmodule.BalanceViewModel;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p054dd.d;
import p054dd.q;
import p059e1.a;
import p141j9.C1794b;
import p141j9.t;
import p220oa.h;
import p328ve.s;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "余额账户详情/Balance Account", path = "/main/statement")
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/me/MeBalanceAccountActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/BalanceViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMeBalanceAccountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeBalanceAccountActivity.kt\ncom/transsnet/palmpay/ui/activity/me/MeBalanceAccountActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,492:1\n152#2:493\n169#2:494\n152#2:495\n169#2:496\n383#2:497\n401#2:498\n115#2,8:499\n145#2:507\n115#2,8:508\n145#2:516\n*S KotlinDebug\n*F\n+ 1 MeBalanceAccountActivity.kt\ncom/transsnet/palmpay/ui/activity/me/MeBalanceAccountActivity\n*L\n258#1:493\n258#1:494\n311#1:495\n311#1:496\n329#1:497\n329#1:498\n379#1:499,8\n379#1:507\n384#1:508,8\n384#1:516\n*E\n"})
public final class MeBalanceAccountActivity extends BaseMvvmActivity<BalanceViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f34737j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f34738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s f34740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f34741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34742g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f34743i;

    public static final void m(MeBalanceAccountActivity meBalanceAccountActivity) {
        o oVar;
        boolean z3 = false;
        boolean z8 = meBalanceAccountActivity.f34741f != null;
        o oVar2 = meBalanceAccountActivity.f34743i;
        if (oVar2 != null) {
            h.s(oVar2.f791Z, z8 && meBalanceAccountActivity.f34739d <= 0);
        }
        o oVar3 = meBalanceAccountActivity.f34743i;
        if (oVar3 != null) {
            h.s(oVar3.t, meBalanceAccountActivity.f34739d > 0);
        }
        if (meBalanceAccountActivity.f34739d == 0 && !BaseApplication.getInstance().getUser().isTier3User() && !z8) {
            z3 = true;
        }
        o oVar4 = meBalanceAccountActivity.f34743i;
        if (oVar4 != null) {
            h.s(oVar4.f784C, z3);
        }
        o oVar5 = meBalanceAccountActivity.f34743i;
        if (oVar5 != null) {
            h.s(oVar5.f796e, z3);
        }
        if (z3) {
            boolean zIsTier2User = BaseApplication.getInstance().getUser().isTier2User();
            o oVar6 = meBalanceAccountActivity.f34743i;
            if (oVar6 != null) {
                IconicsTextView iconicsTextView = oVar6.f784C;
                SpannableString spannableString = new SpannableString(zIsTier2User ? "Upgrade to Tier 3 for unlimited balance" : "Upgrade your KYC to increase Maximum Balance");
                k0.d(spannableString, zIsTier2User ? "for unlimited balance" : "to increase Maximum Balance", CommonViewExtKt.colorInt(b.ppColorTextPrimary, meBalanceAccountActivity), CommonViewExtKt.getDp(12.0f), null);
                iconicsTextView.setText(spannableString);
            }
        }
        Pair pair = meBalanceAccountActivity.f34741f;
        if (pair != null && (oVar = meBalanceAccountActivity.f34743i) != null) {
            oVar.f791Z.setText(meBalanceAccountActivity.getString(Intrinsics.c(pair.f38891a, Boolean.TRUE) ? Ac.h.main_open_cashbox_tips : Ac.h.main_turn_on_auto_save_tips));
        }
        meBalanceAccountActivity.o();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_palmpay_balance_account, (ViewGroup) null, false);
        int i7 = e.emptyView;
        EmptyView emptyView = (EmptyView) a.m(i7, viewInflate);
        if (emptyView != null) {
            i7 = e.ivArrowRight;
            if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                i7 = e.ivLogo;
                ImageView imageView = (ImageView) a.m(i7, viewInflate);
                if (imageView != null) {
                    i7 = e.ivNetworkTips;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) a.m(i7, viewInflate);
                    if (appCompatImageView != null) {
                        i7 = e.ivPolygon;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) a.m(i7, viewInflate);
                        if (appCompatImageView2 != null) {
                            i7 = e.ivSecurityGuaranteed;
                            if (((IconicsImageView) a.m(i7, viewInflate)) != null) {
                                i7 = e.ivShield;
                                ImageView imageView2 = (ImageView) a.m(i7, viewInflate);
                                if (imageView2 != null) {
                                    i7 = e.layoutSecurityGuaranteed;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) a.m(i7, viewInflate);
                                    if (constraintLayout != null) {
                                        i7 = e.mapbaAvaliableBalance;
                                        TextView textView = (TextView) a.m(i7, viewInflate);
                                        if (textView != null) {
                                            i7 = e.mapbaBalanceView;
                                            LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                                            if (linearLayout != null) {
                                                i7 = e.mapbaEye;
                                                ImageView imageView3 = (ImageView) a.m(i7, viewInflate);
                                                if (imageView3 != null) {
                                                    i7 = e.mapbaFrozenAmount;
                                                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                                                    if (textView2 != null) {
                                                        i7 = e.mapbaFrozenArea;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) a.m(i7, viewInflate);
                                                        if (constraintLayout2 != null) {
                                                            i7 = e.mapbaFrozenTips;
                                                            TextView textView3 = (TextView) a.m(i7, viewInflate);
                                                            if (textView3 != null) {
                                                                i7 = e.mapbaFund;
                                                                PpButton ppButton = (PpButton) a.m(i7, viewInflate);
                                                                if (ppButton != null) {
                                                                    i7 = e.mapbaRecyclerView;
                                                                    RecyclerView recyclerView = (RecyclerView) a.m(i7, viewInflate);
                                                                    if (recyclerView != null) {
                                                                        i7 = e.mapbaTopView;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) a.m(i7, viewInflate);
                                                                        if (constraintLayout3 != null) {
                                                                            i7 = e.mapbaUpgradeKYC;
                                                                            IconicsTextView iconicsTextView = (IconicsTextView) a.m(i7, viewInflate);
                                                                            if (iconicsTextView != null) {
                                                                                i7 = e.mapbaViewAll2;
                                                                                IconicsTextView iconicsTextView2 = (IconicsTextView) a.m(i7, viewInflate);
                                                                                if (iconicsTextView2 != null) {
                                                                                    i7 = e.mapbaWithdraw;
                                                                                    PpButton ppButton2 = (PpButton) a.m(i7, viewInflate);
                                                                                    if (ppButton2 != null && (viewM = a.m((i7 = e.space), viewInflate)) != null) {
                                                                                        i7 = e.titleBar;
                                                                                        PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                                                                                        if (ppTitleBar != null) {
                                                                                            i7 = e.tv1;
                                                                                            TextView textView4 = (TextView) a.m(i7, viewInflate);
                                                                                            if (textView4 != null) {
                                                                                                i7 = e.tvAll;
                                                                                                TextView textView5 = (TextView) a.m(i7, viewInflate);
                                                                                                if (textView5 != null) {
                                                                                                    i7 = e.tvCashBoxAutoSave;
                                                                                                    TextView textView6 = (TextView) a.m(i7, viewInflate);
                                                                                                    if (textView6 != null) {
                                                                                                        i7 = e.tvNetworkTips;
                                                                                                        RoundedTextView roundedTextView = (RoundedTextView) a.m(i7, viewInflate);
                                                                                                        if (roundedTextView != null) {
                                                                                                            i7 = e.tvSecurityGuaranteed;
                                                                                                            TextView textView7 = (TextView) a.m(i7, viewInflate);
                                                                                                            if (textView7 != null) {
                                                                                                                i7 = e.tvTitle2;
                                                                                                                TextView textView8 = (TextView) a.m(i7, viewInflate);
                                                                                                                if (textView8 != null) {
                                                                                                                    i7 = e.viewAd;
                                                                                                                    BannerAdView bannerAdView = (BannerAdView) a.m(i7, viewInflate);
                                                                                                                    if (bannerAdView != null) {
                                                                                                                        i7 = e.viewTopMarquee;
                                                                                                                        MarqueeView marqueeView = (MarqueeView) a.m(i7, viewInflate);
                                                                                                                        if (marqueeView != null) {
                                                                                                                            o oVar = new o((LinearLayout) viewInflate, emptyView, imageView, appCompatImageView, appCompatImageView2, imageView2, constraintLayout, textView, linearLayout, imageView3, textView2, constraintLayout2, textView3, ppButton, recyclerView, constraintLayout3, iconicsTextView, iconicsTextView2, ppButton2, viewM, ppTitleBar, textView4, textView5, textView6, roundedTextView, textView7, textView8, bannerAdView, marqueeView);
                                                                                                                            this.f34743i = oVar;
                                                                                                                            return oVar;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    public final void n() {
        o oVar;
        if (a.C("main_sp_show_balance", false)) {
            o oVar2 = this.f34743i;
            if (oVar2 != null) {
                oVar2.f802o.setImageResource(r.cv_icon_eye_opened);
            }
            o oVar3 = this.f34743i;
            if (oVar3 != null) {
                oVar3.f799i.setText(r0.B(this.f34738c, true));
            }
        } else {
            o oVar4 = this.f34743i;
            if (oVar4 != null) {
                oVar4.f802o.setImageResource(r.cv_icon_eye_closed);
            }
            o oVar5 = this.f34743i;
            if (oVar5 != null) {
                oVar5.f799i.setText("****");
            }
        }
        if (!NQEManager.INSTANCE.isNetworkOffline() || (oVar = this.f34743i) == null) {
            return;
        }
        oVar.f799i.setText("--");
    }

    public final void o() {
        o oVar;
        boolean zIsNetworkOffline = NQEManager.INSTANCE.isNetworkOffline();
        o oVar2 = this.f34743i;
        if (oVar2 != null) {
            h.s(oVar2.f801k0, zIsNetworkOffline);
        }
        o oVar3 = this.f34743i;
        if (oVar3 != null) {
            h.s(oVar3.f795d, zIsNetworkOffline);
        }
        if (zIsNetworkOffline) {
            o oVar4 = this.f34743i;
            if (TextUtils.isEmpty(oVar4 != null ? oVar4.f801k0.getText() : null) && (oVar = this.f34743i) != null) {
                oVar.f801k0.setText(Ac.h.main_not_network_amount_tips);
            }
        }
        if (zIsNetworkOffline) {
            o oVar5 = this.f34743i;
            if (oVar5 != null) {
                h.s(oVar5.t, false);
            }
            o oVar6 = this.f34743i;
            if (oVar6 != null) {
                h.s(oVar6.f796e, false);
            }
            o oVar7 = this.f34743i;
            if (oVar7 != null) {
                h.s(oVar7.f784C, false);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 409) {
            BalanceViewModel balanceViewModel = (BalanceViewModel) l();
            balanceViewModel.getClass();
            AbstractC0780y.m(V.h(balanceViewModel), null, null, new C0531c(balanceViewModel, null), 3);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((BalanceViewModel) l()).f35351e;
        if (lVar != null) {
            lVar.e(this, new q(new p174le.a(this, 2), 10));
        }
        l lVar2 = ((BalanceViewModel) l()).f35352f;
        if (lVar2 != null) {
            lVar2.e(this, new q(new p174le.a(this, 3), 10));
        }
        l lVar3 = ((BalanceViewModel) l()).f35353g;
        if (lVar3 != null) {
            lVar3.e(this, new q(new t(lVar3, this, 6), 10));
        }
        l lVar4 = ((BalanceViewModel) l()).f35354i;
        if (lVar4 != null) {
            lVar4.e(this, new q(new p174le.a(this, 0), 10));
        }
        l lVar5 = ((BalanceViewModel) l()).f35355j;
        if (lVar5 != null) {
            lVar5.e(this, new q(new p174le.a(this, 1), 10));
        }
        BalanceViewModel balanceViewModel = (BalanceViewModel) l();
        balanceViewModel.getClass();
        p140j8.f.s(balanceViewModel, new C0533e(1, null), balanceViewModel.f35351e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        BalanceViewModel balanceViewModel2 = (BalanceViewModel) l();
        AccountFlowReq accountFlowReq = new AccountFlowReq();
        accountFlowReq.setPageNum(1);
        accountFlowReq.setPageSize(10);
        accountFlowReq.setAccountId(BaseApplication.getInstance().getUser().getBalanceAccountId());
        int i7 = Calendar.getInstance().get(1);
        int i10 = Calendar.getInstance().get(2);
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(i7, i10, 1);
        accountFlowReq.setBeginTime(calendar.getTimeInMillis());
        int i11 = Calendar.getInstance().get(1);
        int i12 = Calendar.getInstance().get(2);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.clear();
        calendar2.set(i11, i12 + 1, 1);
        accountFlowReq.setEndTime(calendar2.getTimeInMillis());
        accountFlowReq.setTotalFlag(1);
        accountFlowReq.setDcType("");
        balanceViewModel2.d(accountFlowReq);
        BalanceViewModel balanceViewModel3 = (BalanceViewModel) l();
        balanceViewModel3.getClass();
        AbstractC0780y.m(V.h(balanceViewModel3), null, null, new C0531c(balanceViewModel3, null), 3);
        BalanceViewModel balanceViewModel4 = (BalanceViewModel) l();
        balanceViewModel4.getClass();
        p140j8.f.s(balanceViewModel4, new C0532d(1, null), balanceViewModel4.f35355j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        int i7 = 1;
        super.setupView();
        c.b().j(this);
        int iColorInt = CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this);
        int iColorInt2 = CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this);
        o oVar = this.f34743i;
        i0.h0(oVar != null ? oVar.f783B : null, iColorInt2, iColorInt, 12);
        o oVar2 = this.f34743i;
        i0.h0(oVar2 != null ? oVar2.f800j : null, iColorInt2, iColorInt, 12);
        p173ld.o oVar3 = new p173ld.o(this, i7);
        o oVar4 = this.f34743i;
        h.q(oVar3, oVar4 != null ? oVar4.f790Y : null, oVar4 != null ? oVar4.f785H : null, oVar4 != null ? oVar4.f786L : null, oVar4 != null ? oVar4.f809w : null, oVar4 != null ? oVar4.f802o : null, oVar4 != null ? oVar4.f784C : null, oVar4 != null ? oVar4.f791Z : null, oVar4 != null ? oVar4.f798g : null);
        o oVar5 = this.f34743i;
        if (oVar5 != null) {
            oVar5.f788Q.setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        o oVar6 = this.f34743i;
        if (oVar6 != null) {
            oVar6.f788Q.setRightImageView1ClickListener(new d(23));
        }
        this.f34740e = new s(this);
        o oVar7 = this.f34743i;
        if (oVar7 != null) {
            oVar7.f782A.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        o oVar8 = this.f34743i;
        if (oVar8 != null) {
            oVar8.f782A.setItemViewCacheSize(4);
        }
        C1548f c1548f = new C1548f(getColor(b.ppColorDividerLine), SizeUtils.dp2px(0.5f), SizeUtils.dp2px(15.0f), SizeUtils.dp2px(15.0f));
        c1548f.f31336e = false;
        o oVar9 = this.f34743i;
        if (oVar9 != null) {
            oVar9.f782A.addItemDecoration(c1548f);
        }
        o oVar10 = this.f34743i;
        if (oVar10 != null) {
            oVar10.f782A.setAdapter(this.f34740e);
        }
        s sVar = this.f34740e;
        if (sVar != null) {
            sVar.f4986c = new C1794b(this, 9);
        }
        o oVar11 = this.f34743i;
        if (oVar11 != null) {
            oVar11.f807s0.setCompoundDrawablesWithIntrinsicBounds(getDrawable(r.cv_notify_icon), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        o oVar12 = this.f34743i;
        if (oVar12 != null) {
            oVar12.f807s0.setCompoundDrawablePadding(CommonViewExtKt.getDp(12.0f));
        }
        o oVar13 = this.f34743i;
        MarqueeView marqueeView = oVar13 != null ? oVar13.f807s0 : null;
        Boolean bool = Boolean.TRUE;
        org.chromium.support_lib_boundary.util.b.d(marqueeView, bool);
        o oVar14 = this.f34743i;
        org.chromium.support_lib_boundary.util.b.d(oVar14 != null ? oVar14.f806r0 : null, bool);
        o oVar15 = this.f34743i;
        r0.R1(oVar15 != null ? oVar15.f799i : null, "fonts/PalmPayNum-Bold.ttf");
        o oVar16 = this.f34743i;
        if (oVar16 != null) {
            oVar16.f791Z.setCompoundDrawables(null, null, a.h(this, S6.a.pay_ArrowRight, null, CommonViewExtKt.colorInt(b.ppColorSuccess, this), 12.0f), null);
        }
        n();
        o();
    }
}
