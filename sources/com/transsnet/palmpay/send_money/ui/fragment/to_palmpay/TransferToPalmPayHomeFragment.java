package com.transsnet.palmpay.send_money.ui.fragment.to_palmpay;

import Ae.n;
import Bc.C0105b;
import C9.C0144k;
import C9.Q;
import Ce.H;
import Ed.O;
import Fd.A;
import Fd.B;
import Fd.C;
import Fd.D;
import Fd.w;
import J1.g;
import Kd.U1;
import Kd.e2;
import Kd.h2;
import L6.b;
import Pa.F;
import Pa.i0;
import Pa.n0;
import Wf.AbstractC0780y;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
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
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.m;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.skydoves.balloon.Balloon;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmVBFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.widget.CashBoxTrialCashEntryLayout;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.BannerEntranceBean;
import com.transsnet.palmpay.send_money.bean.resp.RecentlyScheduleTransferBean;
import com.transsnet.palmpay.send_money.bean.resp.TransferToPalmPayHomeConfigResp;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmRecipientInfoDialog;
import com.transsnet.palmpay.send_money.ui.fragment.to_palmpay.TransferToPalmPayHomeFragment;
import com.transsnet.palmpay.send_money.ui.view.TransferHomeEntranceView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;
import com.transsnet.palmpay.send_money.viewmodel.ClipboardMatchInfoViewModel;
import com.transsnet.palmpay.send_money.viewmodel.TransferToPalmPayHomeViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.KeyboardUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p002a.a;
import p025ba.d;
import p052da.E;
import p140j8.f;
import p159kd.e;
import p220oa.h;
import p223od.r;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/trans_to_palmpay_home")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBFragment;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToPalmPayHomeViewModel;", "Lod/r;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransferToPalmPayHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransferToPalmPayHomeFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,709:1\n629#2,11:710\n171#3,12:721\n215#3:733\n115#3,8:734\n145#3:742\n383#3:743\n401#3:744\n1#4:745\n774#5:746\n865#5,2:747\n1869#5,2:749\n51#6:751\n*S KotlinDebug\n*F\n+ 1 TransferToPalmPayHomeFragment.kt\ncom/transsnet/palmpay/send_money/ui/fragment/to_palmpay/TransferToPalmPayHomeFragment\n*L\n157#1:710,11\n337#1:721,12\n337#1:733\n349#1:734,8\n349#1:742\n357#1:743\n357#1:744\n627#1:746\n627#1:747,2\n627#1:749,2\n630#1:751\n*E\n"})
public final class TransferToPalmPayHomeFragment extends BaseMvvmVBFragment<TransferToPalmPayHomeViewModel, r> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TransferToPalmPayHomeConfigResp f33814A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Balloon f33815B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CashBoxTrialCashEntryLayout f33816C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C0105b f33817H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f33818L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f33820p;
    public boolean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f33821v;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f33819o = "COMMON";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f33822w = true;

    public TransferToPalmPayHomeFragment() {
        final int i7 = 0;
        this.f33820p = C2131j.b(new Function0(this) { // from class: Fd.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeFragment f2716b;

            {
                this.f2716b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        int i10 = p159kd.h.sm_recent;
                        TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = this.f2716b;
                        return C1850q.e(transferToPalmPayHomeFragment.getString(i10), transferToPalmPayHomeFragment.getString(p025ba.k.core_favorites), transferToPalmPayHomeFragment.getString(p159kd.h.sm_palmpay_contacts));
                    default:
                        return (ClipboardMatchInfoViewModel) new androidx.camera.video.internal.c(this.f2716b).h(ClipboardMatchInfoViewModel.class);
                }
            }
        });
        final int i10 = 1;
        this.f33818L = C2131j.b(new Function0(this) { // from class: Fd.x

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferToPalmPayHomeFragment f2716b;

            {
                this.f2716b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        int i11 = p159kd.h.sm_recent;
                        TransferToPalmPayHomeFragment transferToPalmPayHomeFragment = this.f2716b;
                        return C1850q.e(transferToPalmPayHomeFragment.getString(i11), transferToPalmPayHomeFragment.getString(p025ba.k.core_favorites), transferToPalmPayHomeFragment.getString(p159kd.h.sm_palmpay_contacts));
                    default:
                        return (ClipboardMatchInfoViewModel) new androidx.camera.video.internal.c(this.f2716b).h(ClipboardMatchInfoViewModel.class);
                }
            }
        });
    }

    public static final void u(final TransferToPalmPayHomeFragment transferToPalmPayHomeFragment) {
        ImageView rightImageView1;
        ImageView rightImageView2;
        ImageView rightImageView3;
        final int i7 = 1;
        final int i10 = 2;
        final int i11 = 0;
        r rVar = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar != null) {
            rVar.f40472B.setBackButtonClickListener(new View.OnClickListener(transferToPalmPayHomeFragment) { // from class: Fd.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToPalmPayHomeFragment f2718b;

                {
                    this.f2718b = transferToPalmPayHomeFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<BannerEntranceBean> topBanners;
                    BannerEntranceBean bannerEntranceBean;
                    switch (i11) {
                        case 0:
                            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
                            this.f2718b.requireActivity().finish();
                            if (activityIsActivityExistsInStack == null) {
                                i0.j0();
                            }
                            break;
                        case 1:
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                TransferToPalmPayHomeFragment transferToPalmPayHomeFragment2 = this.f2718b;
                                TransferToPalmPayHomeConfigResp transferToPalmPayHomeConfigResp = transferToPalmPayHomeFragment2.f33814A;
                                String jumpUrl = (transferToPalmPayHomeConfigResp == null || (topBanners = transferToPalmPayHomeConfigResp.getTopBanners()) == null || (bannerEntranceBean = (BannerEntranceBean) CollectionsKt.firstOrNull(topBanners)) == null) ? null : bannerEntranceBean.getJumpUrl();
                                if (jumpUrl == null || jumpUrl.length() == 0) {
                                    TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToPalmPayHomeFragment2.f27333i;
                                    if (transferToPalmPayHomeViewModel != null) {
                                        ArrayList transTypes = C1850q.e("03");
                                        Intrinsics.checkNotNullParameter(transTypes, "transTypes");
                                        AbstractC0780y.m(V.h(transferToPalmPayHomeViewModel), null, null, new h2(transferToPalmPayHomeViewModel.f34078e, C0.G.p("Pref_", "queryTransactionLink_" + transTypes, "_", BaseApplication.getCountryLocale()), null, transTypes), 3);
                                    }
                                } else {
                                    ActivityUtils.startActivity(Pa.F.a(transferToPalmPayHomeFragment2.requireContext(), jumpUrl));
                                }
                                n0.g().l("Transfer_ToPalmPay_TransferHistory_Click");
                            }
                            break;
                        default:
                            ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").withString("core_order_source_type", this.f2718b.f33819o).navigation();
                            n0.g().l("Transfer_ToPalmPay_SearchContacts_Click");
                            break;
                    }
                }
            });
        }
        r rVar2 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar2 != null && (rightImageView3 = rVar2.f40472B.getRightImageView1()) != null) {
            rightImageView3.setImageTintMode(PorterDuff.Mode.SRC_IN);
        }
        r rVar3 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar3 != null && (rightImageView2 = rVar3.f40472B.getRightImageView1()) != null) {
            rightImageView2.setImageTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(b.ppColorTextPrimary, transferToPalmPayHomeFragment.requireContext())));
        }
        r rVar4 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar4 != null && (rightImageView1 = rVar4.f40472B.getRightImageView1()) != null) {
            rightImageView1.setImageResource(d.core_bill_history_default);
        }
        r rVar5 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar5 != null) {
            rVar5.f40472B.setRightImageView1ClickListener(new View.OnClickListener(transferToPalmPayHomeFragment) { // from class: Fd.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToPalmPayHomeFragment f2718b;

                {
                    this.f2718b = transferToPalmPayHomeFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<BannerEntranceBean> topBanners;
                    BannerEntranceBean bannerEntranceBean;
                    switch (i7) {
                        case 0:
                            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
                            this.f2718b.requireActivity().finish();
                            if (activityIsActivityExistsInStack == null) {
                                i0.j0();
                            }
                            break;
                        case 1:
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                TransferToPalmPayHomeFragment transferToPalmPayHomeFragment2 = this.f2718b;
                                TransferToPalmPayHomeConfigResp transferToPalmPayHomeConfigResp = transferToPalmPayHomeFragment2.f33814A;
                                String jumpUrl = (transferToPalmPayHomeConfigResp == null || (topBanners = transferToPalmPayHomeConfigResp.getTopBanners()) == null || (bannerEntranceBean = (BannerEntranceBean) CollectionsKt.firstOrNull(topBanners)) == null) ? null : bannerEntranceBean.getJumpUrl();
                                if (jumpUrl == null || jumpUrl.length() == 0) {
                                    TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToPalmPayHomeFragment2.f27333i;
                                    if (transferToPalmPayHomeViewModel != null) {
                                        ArrayList transTypes = C1850q.e("03");
                                        Intrinsics.checkNotNullParameter(transTypes, "transTypes");
                                        AbstractC0780y.m(V.h(transferToPalmPayHomeViewModel), null, null, new h2(transferToPalmPayHomeViewModel.f34078e, C0.G.p("Pref_", "queryTransactionLink_" + transTypes, "_", BaseApplication.getCountryLocale()), null, transTypes), 3);
                                    }
                                } else {
                                    ActivityUtils.startActivity(Pa.F.a(transferToPalmPayHomeFragment2.requireContext(), jumpUrl));
                                }
                                n0.g().l("Transfer_ToPalmPay_TransferHistory_Click");
                            }
                            break;
                        default:
                            ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").withString("core_order_source_type", this.f2718b.f33819o).navigation();
                            n0.g().l("Transfer_ToPalmPay_SearchContacts_Click");
                            break;
                    }
                }
            });
        }
        r rVar6 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar6 != null) {
            rVar6.f40475L.setOnClickListener(new View.OnClickListener(transferToPalmPayHomeFragment) { // from class: Fd.y

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ TransferToPalmPayHomeFragment f2718b;

                {
                    this.f2718b = transferToPalmPayHomeFragment;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<BannerEntranceBean> topBanners;
                    BannerEntranceBean bannerEntranceBean;
                    switch (i10) {
                        case 0:
                            Activity activityIsActivityExistsInStack = ActivityUtils.isActivityExistsInStack("com.transsnet.palmpay.ui.activity.HomeActivity");
                            this.f2718b.requireActivity().finish();
                            if (activityIsActivityExistsInStack == null) {
                                i0.j0();
                            }
                            break;
                        case 1:
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                TransferToPalmPayHomeFragment transferToPalmPayHomeFragment2 = this.f2718b;
                                TransferToPalmPayHomeConfigResp transferToPalmPayHomeConfigResp = transferToPalmPayHomeFragment2.f33814A;
                                String jumpUrl = (transferToPalmPayHomeConfigResp == null || (topBanners = transferToPalmPayHomeConfigResp.getTopBanners()) == null || (bannerEntranceBean = (BannerEntranceBean) CollectionsKt.firstOrNull(topBanners)) == null) ? null : bannerEntranceBean.getJumpUrl();
                                if (jumpUrl == null || jumpUrl.length() == 0) {
                                    TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) transferToPalmPayHomeFragment2.f27333i;
                                    if (transferToPalmPayHomeViewModel != null) {
                                        ArrayList transTypes = C1850q.e("03");
                                        Intrinsics.checkNotNullParameter(transTypes, "transTypes");
                                        AbstractC0780y.m(V.h(transferToPalmPayHomeViewModel), null, null, new h2(transferToPalmPayHomeViewModel.f34078e, C0.G.p("Pref_", "queryTransactionLink_" + transTypes, "_", BaseApplication.getCountryLocale()), null, transTypes), 3);
                                    }
                                } else {
                                    ActivityUtils.startActivity(Pa.F.a(transferToPalmPayHomeFragment2.requireContext(), jumpUrl));
                                }
                                n0.g().l("Transfer_ToPalmPay_TransferHistory_Click");
                            }
                            break;
                        default:
                            ARouter.getInstance().build("/sm/transfer_to_palmpay_contact").withString("core_order_source_type", this.f2718b.f33819o).navigation();
                            n0.g().l("Transfer_ToPalmPay_SearchContacts_Click");
                            break;
                    }
                }
            });
        }
        r rVar7 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar7 != null) {
            ViewPager2 viewPager2 = rVar7.f40477Q;
            Z childFragmentManager = transferToPalmPayHomeFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            AbstractC1205o lifecycle = transferToPalmPayHomeFragment.getViewLifecycleOwner().getLifecycle();
            TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment = new TransferToPalmPayHomeRecentlyFragment();
            transferToPalmPayHomeRecentlyFragment.setArguments(a.e(new Pair("core_order_source_type", transferToPalmPayHomeFragment.f33819o)));
            Unit unit = Unit.f38893a;
            TransferToPalmPayHomeFavoriteFragment transferToPalmPayHomeFavoriteFragment = new TransferToPalmPayHomeFavoriteFragment();
            transferToPalmPayHomeFavoriteFragment.setArguments(a.e(new Pair("core_order_source_type", transferToPalmPayHomeFragment.f33819o)));
            TransferToPalmPayHomeRecentlyFragment transferToPalmPayHomeRecentlyFragment2 = new TransferToPalmPayHomeRecentlyFragment();
            transferToPalmPayHomeRecentlyFragment2.setArguments(a.e(new Pair("core_order_source_type", transferToPalmPayHomeFragment.f33819o), new Pair("recipient_source", 2)));
            viewPager2.setAdapter(new E(childFragmentManager, lifecycle, C1850q.e(transferToPalmPayHomeRecentlyFragment, transferToPalmPayHomeFavoriteFragment, transferToPalmPayHomeRecentlyFragment2), 0));
        }
        r rVar8 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar8 != null) {
            rVar8.f40477Q.registerOnPageChangeCallback(new C(transferToPalmPayHomeFragment));
        }
        r rVar9 = (r) transferToPalmPayHomeFragment.f27335j;
        TabLayout tabLayout = rVar9 != null ? rVar9.f40471A : null;
        Intrinsics.e(tabLayout);
        r rVar10 = (r) transferToPalmPayHomeFragment.f27335j;
        ViewPager2 viewPager3 = rVar10 != null ? rVar10.f40477Q : null;
        Intrinsics.e(viewPager3);
        new TabLayoutMediator(tabLayout, viewPager3, new Dg.a(transferToPalmPayHomeFragment, 11)).attach();
        r rVar11 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar11 != null) {
            TransferToPalmPayAccountView transferToPalmPayAccountView = rVar11.t;
            LifecycleOwner viewLifecycleOwner = transferToPalmPayHomeFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            transferToPalmPayAccountView.f(transferToPalmPayHomeFragment, viewLifecycleOwner, transferToPalmPayHomeFragment.f33819o);
        }
        r rVar12 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar12 != null) {
            rVar12.f40482d.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: Fd.z
                @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
                public final void onOffsetChanged(AppBarLayout appBarLayout, int i12) {
                    androidx.fragment.app.E activity;
                    TransferToPalmPayHomeFragment transferToPalmPayHomeFragment2 = this.f2719a;
                    if (!transferToPalmPayHomeFragment2.isDetached() && transferToPalmPayHomeFragment2.isAdded() && i0.W(transferToPalmPayHomeFragment2.getActivity())) {
                        if (i12 < 0 && transferToPalmPayHomeFragment2.f33821v != i12 && (activity = transferToPalmPayHomeFragment2.getActivity()) != null) {
                            KeyboardUtils.hideSoftInput(activity);
                        }
                        transferToPalmPayHomeFragment2.f33821v = i12;
                    }
                }
            });
        }
        r rVar13 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar13 != null) {
            rVar13.f40480b.setAdListener(new B(transferToPalmPayHomeFragment, i11));
        }
        r rVar14 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar14 != null) {
            rVar14.f40490v.setAdListener(new B(transferToPalmPayHomeFragment, i7));
        }
        r rVar15 = (r) transferToPalmPayHomeFragment.f27335j;
        if (rVar15 != null) {
            rVar15.f40491w.setAdListener(new B(transferToPalmPayHomeFragment, i10));
        }
        n0.g().v("Transfer_ToPalmPay_View");
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
        l lVar = transferToPalmPayHomeViewModel != null ? transferToPalmPayHomeViewModel.f34078e : null;
        if (lVar != null) {
            lVar.e(this, new C0144k(new A(this, 1), 29));
        }
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel2 = (TransferToPalmPayHomeViewModel) this.f27333i;
        l lVar2 = transferToPalmPayHomeViewModel2 != null ? transferToPalmPayHomeViewModel2.f34081i : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new A(this, 0), 29));
        }
        l lVar3 = ((ClipboardMatchInfoViewModel) this.f33818L.getValue()).f33965e;
        if (lVar3 == null) {
            return 0;
        }
        lVar3.e(this, new C0144k(new Q(13, lVar3, this), 29));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Window window;
        super.o();
        ARouter.getInstance().inject(this);
        c.b().j(this);
        r rVar = (r) this.f27335j;
        if (rVar != null) {
            rVar.f40481c.setAdListener(new B(this, 3));
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        androidx.fragment.app.E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        decorView.post(new H(handlerJ, 4, this, this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        TransferToPalmPayAccountView transferToPalmPayAccountView;
        MarqueeViewV2 marqueeViewV2;
        r rVar = (r) this.f27335j;
        if (rVar != null && (marqueeViewV2 = rVar.f40481c) != null) {
            marqueeViewV2.release();
        }
        r rVar2 = (r) this.f27335j;
        if (rVar2 != null && (transferToPalmPayAccountView = rVar2.t) != null) {
            ConfirmRecipientInfoDialog confirmRecipientInfoDialog = transferToPalmPayAccountView.f33936j;
            if (confirmRecipientInfoDialog != null) {
                confirmRecipientInfoDialog.dismiss();
            }
            transferToPalmPayAccountView.f33936j = null;
            if (c.b().e(transferToPalmPayAccountView)) {
                c.b().l(transferToPalmPayAccountView);
            }
            transferToPalmPayAccountView.f33930c = null;
        }
        super.onDestroyView();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 528) {
            this.t = true;
            w();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewFlipper viewFlipper;
        r rVar = (r) this.f27335j;
        if (rVar != null && (viewFlipper = rVar.f40476M) != null) {
            viewFlipper.stopFlipping();
        }
        super.onPause();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        CoordinatorLayout coordinatorLayout;
        super.onResume();
        if (this.f33822w) {
            this.f33822w = false;
        } else {
            TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
            if (transferToPalmPayHomeViewModel != null) {
                f.s(transferToPalmPayHomeViewModel, new e2(1, null), transferToPalmPayHomeViewModel.f34081i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
        r rVar = (r) this.f27335j;
        if (rVar == null || (coordinatorLayout = rVar.f40479a) == null) {
            return;
        }
        coordinatorLayout.post(new n(this, 13));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(p159kd.f.sm_fragment_transfer_to_palmpay_home, viewGroup, false);
        int i7 = e.ad_cashback;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = e.ad_home_text;
            MarqueeViewV2 marqueeViewV2 = (MarqueeViewV2) p059e1.a.m(i7, viewInflate);
            if (marqueeViewV2 != null) {
                i7 = e.bundle_app_bar;
                AppBarLayout appBarLayout = (AppBarLayout) p059e1.a.m(i7, viewInflate);
                if (appBarLayout != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) viewInflate;
                    i7 = e.cl_tab;
                    ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                    if (constraintLayout != null) {
                        i7 = e.dv_cashback_ad;
                        DragView dragView = (DragView) p059e1.a.m(i7, viewInflate);
                        if (dragView != null) {
                            i7 = e.fl_benefits_banner;
                            FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                            if (frameLayout != null) {
                                i7 = e.iv_transfer_safe_arrow;
                                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                if (iconicsImageView != null) {
                                    i7 = e.ll_top;
                                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                    if (linearLayout != null) {
                                        i7 = e.ll_transfer_account_card;
                                        LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                        if (linearLayout2 != null) {
                                            i7 = e.ll_transfer_safe;
                                            LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                            if (linearLayout3 != null) {
                                                i7 = e.palmpay_account_view;
                                                TransferToPalmPayAccountView transferToPalmPayAccountView = (TransferToPalmPayAccountView) p059e1.a.m(i7, viewInflate);
                                                if (transferToPalmPayAccountView != null) {
                                                    i7 = e.sa_top_horizontal_full;
                                                    SingleAdView singleAdView2 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                                                    if (singleAdView2 != null) {
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
                                                                        i7 = e.transfer_entrance_view;
                                                                        TransferHomeEntranceView transferHomeEntranceView = (TransferHomeEntranceView) p059e1.a.m(i7, viewInflate);
                                                                        if (transferHomeEntranceView != null) {
                                                                            i7 = e.tv_transfer_safe_content;
                                                                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                            if (textView != null) {
                                                                                i7 = e.tv_view_full;
                                                                                IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                                                                                if (iconicsImageView2 != null) {
                                                                                    i7 = e.view_flipper;
                                                                                    ViewFlipper viewFlipper = (ViewFlipper) p059e1.a.m(i7, viewInflate);
                                                                                    if (viewFlipper != null) {
                                                                                        i7 = e.vp_beneficiary;
                                                                                        ViewPager2 viewPager2 = (ViewPager2) p059e1.a.m(i7, viewInflate);
                                                                                        if (viewPager2 != null) {
                                                                                            i7 = e.vs_cashbox_trial_cash;
                                                                                            if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                                i7 = e.vsScheduleNextOrder;
                                                                                                ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                                if (viewStub != null) {
                                                                                                    r rVar = new r(coordinatorLayout, singleAdView, marqueeViewV2, appBarLayout, constraintLayout, dragView, frameLayout, iconicsImageView, linearLayout, linearLayout2, linearLayout3, transferToPalmPayAccountView, singleAdView2, singleAdView3, tabLayout, ppTitleBar, transferHomeEntranceView, textView, iconicsImageView2, viewFlipper, viewPager2, viewStub);
                                                                                                    Intrinsics.checkNotNullExpressionValue(rVar, "inflate(...)");
                                                                                                    return rVar;
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

    public final void v(String str, String str2) {
        ConstraintLayout constraintLayout;
        TransferToPalmPayHomeViewModel transferToPalmPayHomeViewModel = (TransferToPalmPayHomeViewModel) this.f27333i;
        if (transferToPalmPayHomeViewModel != null) {
            f.s(transferToPalmPayHomeViewModel, new U1(str, null), new l(), (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        C0105b c0105b = this.f33817H;
        if (c0105b != null && (constraintLayout = (ConstraintLayout) c0105b.f664d) != null) {
            h.c(constraintLayout);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        ActivityUtils.startActivity(getActivity(), F.a(requireContext(), str2));
    }

    public final void w() {
        String noRecipientLocalContactDarkPic;
        TransferToPalmPayHomeConfigResp transferToPalmPayHomeConfigResp = this.f33814A;
        if (transferToPalmPayHomeConfigResp == null) {
            return;
        }
        String noRecipientLocalContactPic = (!m() || (noRecipientLocalContactDarkPic = transferToPalmPayHomeConfigResp.getNoRecipientLocalContactDarkPic()) == null || noRecipientLocalContactDarkPic.length() == 0) ? transferToPalmPayHomeConfigResp.getNoRecipientLocalContactPic() : transferToPalmPayHomeConfigResp.getNoRecipientLocalContactDarkPic();
        if (noRecipientLocalContactPic != null) {
            if ((!TextUtils.isEmpty(noRecipientLocalContactPic) ? noRecipientLocalContactPic : null) != null) {
                ImageView imageView = new ImageView(requireContext());
                m mVarLoad = com.bumptech.glide.b.f(imageView).load(noRecipientLocalContactPic);
                mVarLoad.T(new D(imageView, this), null, mVarLoad, g.f4461a);
            }
        }
    }

    public final void x(RecentlyScheduleTransferBean recentlyScheduleTransferBean) {
        C0105b c0105b = this.f33817H;
        if (c0105b == null) {
            r rVar = (r) this.f27335j;
            if (rVar != null) {
                rVar.f40478X.setOnInflateListener(new O(this, recentlyScheduleTransferBean, 1));
            }
            r rVar2 = (r) this.f27335j;
            if (rVar2 != null) {
                rVar2.f40478X.inflate();
                return;
            }
            return;
        }
        ((AppCompatTextView) c0105b.f667g).setText(recentlyScheduleTransferBean.getTitle());
        C0105b c0105b2 = this.f33817H;
        if (c0105b2 != null) {
            ((AppCompatTextView) c0105b2.f666f).setText(recentlyScheduleTransferBean.getContent());
        }
        C0105b c0105b3 = this.f33817H;
        if (c0105b3 != null) {
            ((PpButton) c0105b3.f663c).setOnClickListener(new w(this, recentlyScheduleTransferBean, 0));
        }
    }

    public final void y() {
        r rVar;
        if (getView() != null && ((C1212w) getViewLifecycleOwner().getLifecycle()).f17478d.a(EnumC1204n.f17464e) && (rVar = (r) this.f27335j) != null && rVar.f40485g.isShown()) {
            ViewFlipper viewFlipper = rVar.f40476M;
            if (viewFlipper.getChildCount() > 1) {
                viewFlipper.startFlipping();
            }
        }
    }
}
