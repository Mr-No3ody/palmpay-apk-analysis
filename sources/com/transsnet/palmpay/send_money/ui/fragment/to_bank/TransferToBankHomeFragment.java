package com.transsnet.palmpay.send_money.ui.fragment.to_bank;

import Ae.n;
import Bc.C0105b;
import C0.G;
import C9.C0138e;
import C9.C0144k;
import C9.Q;
import Ce.H;
import Ed.N;
import Ed.O;
import Ed.P;
import Ed.T;
import Ed.U;
import Ed.X;
import Ed.Y;
import Gd.C0297a;
import Kd.L0;
import Kd.T0;
import Kd.V0;
import L6.b;
import Pa.F;
import Pa.n0;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.E;
import androidx.fragment.app.Z;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.RecentlyScheduleTransferBean;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmRecipientInfoDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.TransferToBankHomeFragment;
import com.transsnet.palmpay.send_money.ui.view.TransferHomeEntranceView;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.viewmodel.ClipboardMatchInfoViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TransferToBankHomeViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.c;
import p002a.a;
import p025ba.d;
import p025ba.k;
import p140j8.f;
import p159kd.e;
import p159kd.h;
import p223od.q;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBankHomeViewModel;", "Lod/q;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToBankHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToBankHomeFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 5 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,732:1\n1#2:733\n629#3,11:734\n51#4:745\n171#5,12:746\n215#5:758\n115#5,8:759\n145#5:767\n115#5,8:768\n145#5:776\n383#5:777\n401#5:778\n*S KotlinDebug\n*F\n+ 1 TransferToBankHomeFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_bank/TransferToBankHomeFragment\n*L\n291#1:734,11\n336#1:745\n404#1:746,12\n404#1:758\n416#1:759,8\n416#1:767\n424#1:768,8\n424#1:776\n435#1:777\n435#1:778\n*E\n"})
public final class TransferToBankHomeFragment extends BaseMvvmVBFragment<TransferToBankHomeViewModel, q> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f33774A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0105b f33775B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f33776C;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f33780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0297a f33781w;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33778o = "COMMON";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33779p = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f33777H = "新用户";

    public TransferToBankHomeFragment() {
        final int i7 = 0;
        this.t = C2131j.b(new Function0(this) { // from class: Ed.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeFragment f2331b;

            {
                this.f2331b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        androidx.fragment.app.E eRequireActivity = this.f2331b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (L0) new androidx.camera.video.internal.c(eRequireActivity).h(L0.class);
                    default:
                        return (ClipboardMatchInfoViewModel) new androidx.camera.video.internal.c(this.f2331b).h(ClipboardMatchInfoViewModel.class);
                }
            }
        });
        final int i10 = 1;
        this.f33780v = C2131j.b(new Function0(this) { // from class: Ed.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToBankHomeFragment f2331b;

            {
                this.f2331b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        androidx.fragment.app.E eRequireActivity = this.f2331b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (L0) new androidx.camera.video.internal.c(eRequireActivity).h(L0.class);
                    default:
                        return (ClipboardMatchInfoViewModel) new androidx.camera.video.internal.c(this.f2331b).h(ClipboardMatchInfoViewModel.class);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
        l lVar = transferToBankHomeViewModel != null ? transferToBankHomeViewModel.f34047e : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new T(this, 1), 23));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel2 = (TransferToBankHomeViewModel) this.f27333i;
        l lVar2 = transferToBankHomeViewModel2 != null ? transferToBankHomeViewModel2.f34051j : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new T(this, 0), 23));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel3 = (TransferToBankHomeViewModel) this.f27333i;
        l lVar3 = transferToBankHomeViewModel3 != null ? transferToBankHomeViewModel3.f34053p : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new U(0), 23));
        }
        l lVar4 = ((ClipboardMatchInfoViewModel) this.f33780v.getValue()).f33965e;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new Q(8, lVar4, this), 23));
        }
        TransferToBankHomeViewModel transferToBankHomeViewModel4 = (TransferToBankHomeViewModel) this.f27333i;
        if (transferToBankHomeViewModel4 != null) {
            if (System.currentTimeMillis() - SPUtils.get().getLong("no_net_ussd_bank_list_timestamp", 0L) >= 86400000) {
                f.s(transferToBankHomeViewModel4, new V0(1, null), transferToBankHomeViewModel4.f34053p, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        String string;
        Window window;
        ImageView rightImageView1;
        ImageView rightImageView2;
        ImageView rightImageView3;
        q qVar;
        int i7 = 0;
        int i10 = 3;
        int i11 = 1;
        int i12 = 2;
        super.o();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("core_order_source_type")) == null) {
            string = "COMMON";
        }
        this.f33778o = string;
        Bundle arguments2 = getArguments();
        View decorView = null;
        String string2 = arguments2 != null ? arguments2.getString("accountNo") : null;
        if (string2 == null) {
            string2 = "";
        }
        this.f33779p = string2;
        if (Intrinsics.c(this.f33778o, "WITHDRAW") && (qVar = (q) this.f27335j) != null) {
            qVar.f40450B.setTitle(getString(h.sm_withdraw_with_bank_account));
        }
        q qVar2 = (q) this.f27335j;
        if (qVar2 != null && (rightImageView3 = qVar2.f40450B.getRightImageView1()) != null) {
            rightImageView3.setImageTintMode(PorterDuff.Mode.SRC_IN);
        }
        q qVar3 = (q) this.f27335j;
        if (qVar3 != null && (rightImageView2 = qVar3.f40450B.getRightImageView1()) != null) {
            rightImageView2.setImageTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(b.ppColorTextPrimary, requireContext())));
        }
        q qVar4 = (q) this.f27335j;
        if (qVar4 != null && (rightImageView1 = qVar4.f40450B.getRightImageView1()) != null) {
            rightImageView1.setImageResource(d.core_bill_history_default);
        }
        q qVar5 = (q) this.f27335j;
        if (qVar5 != null) {
            qVar5.f40450B.setRightImageView1ClickListener(new N(this, i11));
        }
        q qVar6 = (q) this.f27335j;
        if (qVar6 != null) {
            qVar6.f40450B.setBackButtonClickListener(new N(this, i12));
        }
        q qVar7 = (q) this.f27335j;
        if (qVar7 != null) {
            qVar7.f40454M.setOnClickListener(new N(this, i10));
        }
        q qVar8 = (q) this.f27335j;
        if (qVar8 != null) {
            qVar8.f40456X.setOffscreenPageLimit(2);
        }
        ArrayList arrayListE = C1850q.e(getString(h.sm_recent), getString(k.core_favorites), getString(h.sm_palmpay_contacts));
        q qVar9 = (q) this.f27335j;
        if (qVar9 != null) {
            ViewPager viewPager = qVar9.f40456X;
            Z childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            TransferToBankHomeBeneficiariesFragment transferToBankHomeBeneficiariesFragment = new TransferToBankHomeBeneficiariesFragment();
            transferToBankHomeBeneficiariesFragment.setArguments(a.e(new Pair("core_order_source_type", this.f33778o)));
            Unit unit = Unit.f38893a;
            TransferToBankHomeFavoriteFragment transferToBankHomeFavoriteFragment = new TransferToBankHomeFavoriteFragment();
            transferToBankHomeFavoriteFragment.setArguments(a.e(new Pair("core_order_source_type", this.f33778o)));
            TransferToBankHomePalmPayContactsFragment transferToBankHomePalmPayContactsFragment = new TransferToBankHomePalmPayContactsFragment();
            transferToBankHomePalmPayContactsFragment.setArguments(a.e(new Pair("core_order_source_type", "2BANK2PALMPAY_1")));
            viewPager.setAdapter(new Kb.d(childFragmentManager, C1850q.e(transferToBankHomeBeneficiariesFragment, transferToBankHomeFavoriteFragment, transferToBankHomePalmPayContactsFragment), arrayListE));
        }
        q qVar10 = (q) this.f27335j;
        if (qVar10 != null) {
            qVar10.f40449A.setupWithViewPager(qVar10 != null ? qVar10.f40456X : null);
        }
        q qVar11 = (q) this.f27335j;
        if (qVar11 != null) {
            qVar11.f40456X.addOnPageChangeListener(new Ed.Z(arrayListE));
        }
        q qVar12 = (q) this.f27335j;
        if (qVar12 != null) {
            qVar12.f40459b.setAdListener(new Y(this, i11));
        }
        q qVar13 = (q) this.f27335j;
        if (qVar13 != null) {
            qVar13.f40470w.setAdListener(new Y(this, i12));
        }
        q qVar14 = (q) this.f27335j;
        if (qVar14 != null) {
            qVar14.f40461d.setAutoRefresh(false);
        }
        q qVar15 = (q) this.f27335j;
        if (qVar15 != null) {
            SingleAdView singleAdView = qVar15.f40461d;
            SingleAdView singleAdView2 = qVar15 != null ? singleAdView : null;
            String strR = G.r(new StringBuilder(), this.f27317a, "_middle");
            ClickEvent clickEventAdd = new ClickEvent("to_bank_page_element_click").add("user_type", this.f33777H).add("module_name", "green ad").add("element_name", "green ad");
            Intrinsics.checkNotNullExpressionValue(clickEventAdd, "add(...)");
            singleAdView.setAdListener(new X(this, singleAdView2, strR, clickEventAdd));
        }
        t tVar = this.t;
        ((L0) tVar.getValue()).f5082p.e(getViewLifecycleOwner(), new C0138e(new Ed.Q(this, i7)));
        String str = this.f33779p;
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                ((L0) tVar.getValue()).f5075d = str;
            }
        }
        q qVar16 = (q) this.f27335j;
        if (qVar16 != null) {
            TransferToBankAccountView transferToBankAccountView = qVar16.f40465i;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            transferToBankAccountView.h(this, viewLifecycleOwner, this.f33778o);
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            decorView.post(new H(handlerJ, 3, this, this));
        }
        n0.g().v("Transfer_ToBank_View");
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        TransferToBankAccountView transferToBankAccountView;
        super.onActivityResult(i7, i10, intent);
        q qVar = (q) this.f27335j;
        if (qVar == null || (transferToBankAccountView = qVar.f40465i) == null || i7 != 2 || i10 != -1 || intent == null) {
            return;
        }
        transferToBankAccountView.m((BankInfo) intent.getParcelableExtra("BANK_CARD_INFO"));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        q qVar = (q) this.f27335j;
        if (qVar != null) {
            qVar.f40459b.release();
        }
        q qVar2 = (q) this.f27335j;
        if (qVar2 != null) {
            TransferToBankAccountView transferToBankAccountView = qVar2.f40465i;
            ConfirmRecipientInfoDialog confirmRecipientInfoDialog = transferToBankAccountView.f33905i;
            if (confirmRecipientInfoDialog != null) {
                confirmRecipientInfoDialog.dismiss();
            }
            transferToBankAccountView.f33905i = null;
            if (c.b().e(transferToBankAccountView)) {
                c.b().l(transferToBankAccountView);
            }
            transferToBankAccountView.f33901d = null;
            transferToBankAccountView.f33900c = null;
        }
        super.onDestroyView();
        C0297a c0297a = this.f33781w;
        if (c0297a != null) {
            CountDownTimer countDownTimer = c0297a.f3337k;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c0297a.f3337k = null;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        CoordinatorLayout coordinatorLayout;
        super.onResume();
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
        if (transferToBankHomeViewModel != null) {
            transferToBankHomeViewModel.e();
        }
        if (NQEManager.INSTANCE.isNetworkOffline() && SPUtils.get().getBoolean("show_transfer_via_ussd", false)) {
            w();
        } else {
            View view = this.f33774A;
            if (view != null) {
                p220oa.h.c(view);
            }
        }
        q qVar = (q) this.f27335j;
        if (qVar == null || (coordinatorLayout = qVar.f40458a) == null) {
            return;
        }
        coordinatorLayout.post(new n(this, 12));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p159kd.f.sm_fragment_transfer_to_bank_home, viewGroup, false);
        int i7 = e.ad_home_text;
        MarqueeViewV2 marqueeViewV2 = (MarqueeViewV2) p059e1.a.m(i7, viewInflate);
        if (marqueeViewV2 != null) {
            i7 = e.ad_to_bank_home;
            SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
            if (singleAdView != null) {
                i7 = e.ad_user_type;
                SingleAdView singleAdView2 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                if (singleAdView2 != null) {
                    i7 = e.avs_transfer_via_ussd;
                    if (((AsyncViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.bundle_app_bar;
                        if (((AppBarLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                            i7 = e.cl_tab;
                            ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                            if (constraintLayout != null) {
                                i7 = e.dv_to_bank_home_ad;
                                DragView dragView = (DragView) p059e1.a.m(i7, viewInflate);
                                if (dragView != null) {
                                    i7 = e.fcv_add_bank;
                                    TransferToBankAccountView transferToBankAccountView = (TransferToBankAccountView) p059e1.a.m(i7, viewInflate);
                                    if (transferToBankAccountView != null) {
                                        i7 = e.flBenefitsBanner;
                                        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                                        if (frameLayout != null) {
                                            i7 = e.ivTransferSafeArrow;
                                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                            if (iconicsImageView != null) {
                                                i7 = e.ll_top;
                                                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                    i7 = e.llTransferAccountCard;
                                                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                    if (linearLayout != null) {
                                                        i7 = e.llTransferSafe;
                                                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                        if (linearLayout2 != null) {
                                                            i7 = e.refundViewStub;
                                                            ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                            if (viewStub != null) {
                                                                i7 = e.sa_top_horizontal_margin;
                                                                SingleAdView singleAdView3 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                                                                if (singleAdView3 != null) {
                                                                    i7 = e.tabLayout;
                                                                    TabLayout tabLayout = (TabLayout) p059e1.a.m(i7, viewInflate);
                                                                    if (tabLayout != null) {
                                                                        i7 = e.titleBar;
                                                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                        if (ppTitleBar != null) {
                                                                            i7 = e.toolbar;
                                                                            if (((Toolbar) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                i7 = e.transferEntranceView;
                                                                                TransferHomeEntranceView transferHomeEntranceView = (TransferHomeEntranceView) p059e1.a.m(i7, viewInflate);
                                                                                if (transferHomeEntranceView != null) {
                                                                                    i7 = e.tv_schedule_transfer_entrance;
                                                                                    IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, viewInflate);
                                                                                    if (iconicsTextView != null) {
                                                                                        i7 = e.tvTransferSafeContent;
                                                                                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                        if (textView != null) {
                                                                                            i7 = e.tv_view_full;
                                                                                            IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                                                                            if (iconicsImageView2 != null) {
                                                                                                i7 = e.viewFlipper;
                                                                                                ViewFlipper viewFlipper = (ViewFlipper) p059e1.a.m(i7, viewInflate);
                                                                                                if (viewFlipper != null) {
                                                                                                    i7 = e.vp_beneficiary;
                                                                                                    ViewPager viewPager = (ViewPager) p059e1.a.m(i7, viewInflate);
                                                                                                    if (viewPager != null) {
                                                                                                        i7 = e.vsScheduleNextOrder;
                                                                                                        ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                                        if (viewStub2 != null) {
                                                                                                            q qVar = new q(coordinatorLayout, marqueeViewV2, singleAdView, singleAdView2, coordinatorLayout, constraintLayout, dragView, transferToBankAccountView, frameLayout, iconicsImageView, linearLayout, linearLayout2, viewStub, singleAdView3, tabLayout, ppTitleBar, transferHomeEntranceView, iconicsTextView, textView, iconicsImageView2, viewFlipper, viewPager, viewStub2);
                                                                                                            Intrinsics.checkNotNullExpressionValue(qVar, "inflate(...)");
                                                                                                            return qVar;
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

    public final void u(String str, String str2) {
        ConstraintLayout constraintLayout;
        TransferToBankHomeViewModel transferToBankHomeViewModel = (TransferToBankHomeViewModel) this.f27333i;
        if (transferToBankHomeViewModel != null) {
            f.s(transferToBankHomeViewModel, new T0(str, null), new l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        C0105b c0105b = this.f33775B;
        if (c0105b != null && (constraintLayout = (ConstraintLayout) c0105b.f664d) != null) {
            p220oa.h.c(constraintLayout);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ActivityUtils.startActivity(F.a(requireContext(), str2));
    }

    public final void v(RecentlyScheduleTransferBean recentlyScheduleTransferBean) {
        C0105b c0105b = this.f33775B;
        if (c0105b == null) {
            q qVar = (q) this.f27335j;
            if (qVar != null) {
                qVar.f40457Y.setOnInflateListener(new O(this, recentlyScheduleTransferBean, 0));
            }
            q qVar2 = (q) this.f27335j;
            if (qVar2 != null) {
                qVar2.f40457Y.inflate();
                return;
            }
            return;
        }
        ((AppCompatTextView) c0105b.f667g).setText(recentlyScheduleTransferBean.getTitle());
        C0105b c0105b2 = this.f33775B;
        if (c0105b2 != null) {
            ((AppCompatTextView) c0105b2.f666f).setText(recentlyScheduleTransferBean.getContent());
        }
        C0105b c0105b3 = this.f33775B;
        if (c0105b3 != null) {
            ((PpButton) c0105b3.f663c).setOnClickListener(new P(this, recentlyScheduleTransferBean, 0));
        }
    }

    public final void w() {
        View view = this.f27318b;
        AsyncViewStub asyncViewStub = view != null ? (AsyncViewStub) view.findViewById(e.avs_transfer_via_ussd) : null;
        if (asyncViewStub != null) {
            asyncViewStub.b(com.transsnet.palmpay.core.config.d.r(), new Ed.Q(this, 1));
        }
        View view2 = this.f33774A;
        if (view2 != null) {
            p220oa.h.C(view2);
        }
    }
}
