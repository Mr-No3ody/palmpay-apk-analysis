package com.transsnet.palmpay.ui.fragment;

import Ab.C;
import Ab.ViewOnClickListenerC0053e;
import Ac.e;
import Ac.f;
import Bc.i;
import C9.C0138e;
import C9.C0142i;
import C9.C0144k;
import C9.C0158z;
import Ce.H;
import Ce.N;
import Ce.O;
import Ce.P;
import Ce.Q;
import Ce.S;
import Ce.U;
import Ce.ViewOnAttachStateChangeListenerC0160b;
import Ce.ViewOnClickListenerC0159a;
import Je.n;
import Me.A;
import Me.j;
import Me.k;
import Me.l;
import Me.m;
import Me.r;
import Me.x;
import Pe.d0;
import Pe.h0;
import Pe.i0;
import Wf.AbstractC0780y;
import Wf.I;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.custom_view.StatusBarView;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.req.PalmZoneTasksReq;
import com.transsnet.palmpay.main.export.bean.rsp.ClaimPalmZoneRewardsRsp;
import com.transsnet.palmpay.main.export.bean.rsp.PalmZoneTasksRspV2;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneChainProgressDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneRewardsDialog;
import com.transsnet.palmpay.ui.dialog.reward.PalmZoneTaskListDialog;
import com.transsnet.palmpay.ui.view.HomeScrollView;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import com.transsnet.palmpay.ui.view.ModelPremiumBenefits;
import com.transsnet.palmpay.viewmodule.PalmZoneViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/HomePalmZoneTabV2;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/viewmodule/PalmZoneViewModel;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomePalmZoneTabV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePalmZoneTabV2.kt\ncom/transsnet/palmpay/ui/fragment/HomePalmZoneTabV2\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,771:1\n629#2,11:772\n171#3,12:783\n215#3:795\n348#3:796\n375#3:797\n171#3,12:798\n215#3:810\n171#3,12:811\n215#3:823\n171#3,12:824\n215#3:836\n171#3,12:837\n215#3:849\n171#3,12:850\n215#3:862\n348#3:863\n375#3:864\n1869#4,2:865\n1#5:867\n*S KotlinDebug\n*F\n+ 1 HomePalmZoneTabV2.kt\ncom/transsnet/palmpay/ui/fragment/HomePalmZoneTabV2\n*L\n216#1:772,11\n324#1:783,12\n324#1:795\n339#1:796\n339#1:797\n355#1:798,12\n355#1:810\n363#1:811,12\n363#1:823\n381#1:824,12\n381#1:836\n396#1:837,12\n396#1:849\n400#1:850,12\n400#1:862\n405#1:863\n405#1:864\n474#1:865,2\n*E\n"})
public final class HomePalmZoneTabV2 extends BaseMvvmFragment<PalmZoneViewModel> implements ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final /* synthetic */ int f35134Z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public j f35135A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public k f35136B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public NetworkNotConnectView f35137C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public View f35138H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public i f35139L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f35140M = true;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public View f35141Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SingleAdView f35142X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public DragView f35143Y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35144j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f35145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public m f35146p;
    public n t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public A f35147v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f35148w;

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

    public static final void t(HomePalmZoneTabV2 homePalmZoneTabV2, ClaimPalmZoneRewardsRsp claimPalmZoneRewardsRsp) {
        PalmZoneTaskListDialog palmZoneTaskListDialog;
        if (claimPalmZoneRewardsRsp != null) {
            int i7 = claimPalmZoneRewardsRsp.prizeStatus;
            if (i7 == 4 || i7 == 2) {
                E activity = homePalmZoneTabV2.getActivity();
                if (activity != null) {
                    io.fastkv.n.O(activity, 0, null, claimPalmZoneRewardsRsp.failTitle, null, null, null, claimPalmZoneRewardsRsp.failMsg, Integer.valueOf(p025ba.k.core_confirm), null, null, null, null, null, null, false, 0, 8388219);
                }
            } else if (Intrinsics.c(claimPalmZoneRewardsRsp.popupType, "CHAIN_PROGRESS")) {
                Context contextRequireContext = homePalmZoneTabV2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                PalmZoneChainProgressDialog palmZoneChainProgressDialog = new PalmZoneChainProgressDialog(contextRequireContext);
                palmZoneChainProgressDialog.show();
                palmZoneChainProgressDialog.updateUi(claimPalmZoneRewardsRsp.chainProgressPopup);
            } else {
                Context contextRequireContext2 = homePalmZoneTabV2.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                PalmZoneRewardsDialog palmZoneRewardsDialog = new PalmZoneRewardsDialog(contextRequireContext2);
                palmZoneRewardsDialog.show();
                palmZoneRewardsDialog.updateUi(claimPalmZoneRewardsRsp);
            }
            A a3 = homePalmZoneTabV2.f35147v;
            if (a3 != null) {
                PalmZoneTaskListDialog palmZoneTaskListDialog2 = a3.t;
                if (palmZoneTaskListDialog2 != null && palmZoneTaskListDialog2.isShowing() && (palmZoneTaskListDialog = a3.t) != null) {
                    palmZoneTaskListDialog.dismiss();
                }
                a3.l().clear();
            }
            homePalmZoneTabV2.x();
            PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) homePalmZoneTabV2.f27333i;
            if (palmZoneViewModel != null) {
                palmZoneViewModel.f();
            }
        }
    }

    public static final void u(HomePalmZoneTabV2 homePalmZoneTabV2) {
        ViewStub viewStub = (ViewStub) homePalmZoneTabV2.f27318b.findViewById(e.dragViewStub);
        if (viewStub != null) {
            viewStub.setVisibility(0);
            SingleAdView singleAdView = (SingleAdView) homePalmZoneTabV2.f27318b.findViewById(e.floatAdView);
            homePalmZoneTabV2.f35142X = singleAdView;
            if (singleAdView != null) {
                singleAdView.setSlotId("D0E06BA1495F402AB1D67E3D3684F04B");
            }
            b.c(homePalmZoneTabV2.f35142X);
            if (homePalmZoneTabV2.f35143Y == null) {
                DragView dragView = (DragView) homePalmZoneTabV2.f27318b.findViewById(e.ch_act_img_dragview);
                homePalmZoneTabV2.f35143Y = dragView;
                i iVar = homePalmZoneTabV2.f35139L;
                if (iVar != null) {
                    ((HomeScrollView) iVar.f729g).setDragView(dragView);
                }
                DragView dragView2 = homePalmZoneTabV2.f35143Y;
                if (dragView2 != null) {
                    dragView2.setCallback(new U(homePalmZoneTabV2));
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_home_rewards_tab;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PalmZoneViewModel palmZoneViewModel;
        com.transsnet.palmpay.core.base.l lVar;
        int i7 = 2;
        int i10 = 1;
        int i11 = 0;
        PalmZoneViewModel palmZoneViewModel2 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = palmZoneViewModel2 != null ? palmZoneViewModel2.f35389e : null;
        if (lVar2 != null) {
            lVar2.e(this, new C0144k(new Q(this, this, i11), 8));
        }
        PalmZoneViewModel palmZoneViewModel3 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = palmZoneViewModel3 != null ? palmZoneViewModel3.f35390f : null;
        if (lVar3 != null) {
            lVar3.e(this, new C0144k(new C9.Q(this, lVar3, this), 8));
        }
        PalmZoneViewModel palmZoneViewModel4 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = palmZoneViewModel4 != null ? palmZoneViewModel4.f35394o : null;
        if (lVar4 != null) {
            lVar4.e(this, new C0144k(new P(this, this, i11), 8));
        }
        PalmZoneViewModel palmZoneViewModel5 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar5 = palmZoneViewModel5 != null ? palmZoneViewModel5.f35395p : null;
        if (lVar5 != null) {
            lVar5.e(this, new C0144k(new P(this, this, i10), 8));
        }
        PalmZoneViewModel palmZoneViewModel6 = (PalmZoneViewModel) this.f27333i;
        if (palmZoneViewModel6 != null && (lVar = palmZoneViewModel6.f35391g) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            lVar.e(viewLifecycleOwner, new C0138e(new C(this, 6), (byte) 0));
        }
        PalmZoneViewModel palmZoneViewModel7 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar6 = palmZoneViewModel7 != null ? palmZoneViewModel7.f35392i : null;
        if (lVar6 != null) {
            lVar6.e(this, new C0144k(new Q(this, this, i10), 8));
        }
        PalmZoneViewModel palmZoneViewModel8 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar7 = palmZoneViewModel8 != null ? palmZoneViewModel8.t : null;
        if (lVar7 != null) {
            lVar7.e(this, new C0144k(new Q(this, this, i7), 8));
        }
        PalmZoneViewModel palmZoneViewModel9 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar8 = palmZoneViewModel9 != null ? palmZoneViewModel9.f35397w : null;
        if (lVar8 != null) {
            lVar8.e(this, new C0144k(new Q(this, this, 3), 8));
        }
        PalmZoneViewModel palmZoneViewModel10 = (PalmZoneViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar9 = palmZoneViewModel10 != null ? palmZoneViewModel10.f35396v : null;
        if (lVar9 != null) {
            lVar9.e(this, new C0144k(new S(this, lVar9, this), 8));
        }
        if (BaseApplication.hasLogin() && (palmZoneViewModel = (PalmZoneViewModel) this.f27333i) != null) {
            CoroutineScope coroutineScopeH = V.h(palmZoneViewModel);
            p042cg.f fVar = I.f10809a;
            AbstractC0780y.m(coroutineScopeH, p042cg.e.f19009c, null, new h0(palmZoneViewModel, null), 2);
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        c.b().j(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ViewTreeObserver viewTreeObserver;
        Window window;
        ImageView rightImageView1;
        TextView tvTitle;
        ImageView rightImageView2;
        ImageView backImageView;
        View viewFindViewById = this.f27318b.findViewById(e.viewZone);
        this.f35138H = viewFindViewById;
        if (viewFindViewById != null) {
            h.s(viewFindViewById, !NQEManager.INSTANCE.isNetworkOffline());
            int i7 = e.dragViewStub;
            if (((ViewStub) p059e1.a.m(i7, viewFindViewById)) != null) {
                i7 = e.guestStub;
                ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewFindViewById);
                if (viewStub != null) {
                    i7 = e.ivTopBg;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewFindViewById);
                    if (appCompatImageView != null) {
                        i7 = e.palmPrizeStub;
                        if (((ViewStub) p059e1.a.m(i7, viewFindViewById)) != null) {
                            i7 = e.premiumBenefitsStub;
                            if (((ViewStub) p059e1.a.m(i7, viewFindViewById)) != null) {
                                i7 = e.refreshLayout;
                                VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = (VerticalSwipeRefreshLayout) p059e1.a.m(i7, viewFindViewById);
                                if (verticalSwipeRefreshLayout != null) {
                                    i7 = e.rewardsStub;
                                    if (((ViewStub) p059e1.a.m(i7, viewFindViewById)) != null) {
                                        i7 = e.scrollView;
                                        HomeScrollView homeScrollView = (HomeScrollView) p059e1.a.m(i7, viewFindViewById);
                                        if (homeScrollView != null) {
                                            i7 = e.statusView;
                                            if (((StatusBarView) p059e1.a.m(i7, viewFindViewById)) != null) {
                                                i7 = e.tasksStub;
                                                if (((ViewStub) p059e1.a.m(i7, viewFindViewById)) != null) {
                                                    i7 = e.titleBar;
                                                    PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewFindViewById);
                                                    if (ppTitleBar != null) {
                                                        i7 = e.viewContainer;
                                                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewFindViewById);
                                                        if (linearLayout != null) {
                                                            this.f35139L = new i((ConstraintLayout) viewFindViewById, viewStub, appCompatImageView, verticalSwipeRefreshLayout, homeScrollView, ppTitleBar, linearLayout, 1);
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
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
        }
        i iVar = this.f35139L;
        if (iVar != null) {
            ((VerticalSwipeRefreshLayout) iVar.f728f).setOnRefreshListener(new N(this));
        }
        int iColorInt = CommonViewExtKt.colorInt(Ac.b.main_rewards_points_coupon_text_color, getActivity());
        i iVar2 = this.f35139L;
        if (iVar2 != null && (backImageView = ((PpTitleBar) iVar2.f725c).getBackImageView()) != null) {
            h.s(backImageView, false);
        }
        i iVar3 = this.f35139L;
        if (iVar3 != null && (rightImageView2 = ((PpTitleBar) iVar3.f725c).getRightImageView1()) != null) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            IconicsDrawable iconicsDrawable = new IconicsDrawable(contextRequireContext);
            iconicsDrawable.a(new O(iColorInt, 0));
            rightImageView2.setImageDrawable(iconicsDrawable);
        }
        i iVar4 = this.f35139L;
        if (iVar4 != null) {
            PpTitleBar ppTitleBar2 = (PpTitleBar) iVar4.f725c;
            String string = getString(p025ba.k.core_reward);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ppTitleBar2.setTitle(h.B(string, getContext(), Integer.valueOf(iColorInt), null, null, null, null, 1020));
        }
        i iVar5 = this.f35139L;
        if (iVar5 != null && (tvTitle = ((PpTitleBar) iVar5.f725c).getTvTitle()) != null) {
            tvTitle.setPadding(CommonViewExtKt.getDp(16), 0, 0, 0);
        }
        i iVar6 = this.f35139L;
        if (iVar6 != null && (rightImageView1 = ((PpTitleBar) iVar6.f725c).getRightImageView1()) != null) {
            h.s(rightImageView1, BaseApplication.hasLogin());
        }
        i iVar7 = this.f35139L;
        if (iVar7 != null) {
            ((PpTitleBar) iVar7.f725c).setRightImageView1ClickListener(new ViewOnClickListenerC0159a(this, 3));
        }
        Handler handler = new Handler(Looper.getMainLooper());
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            decorView.post(new H(handler, 2, this, this));
        }
        i iVar8 = this.f35139L;
        if (iVar8 != null && (viewTreeObserver = ((HomeScrollView) iVar8.f729g).getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this);
        }
        i iVar9 = this.f35139L;
        if (iVar9 != null) {
            ((HomeScrollView) iVar9.f729g).addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0160b(this, 2));
        }
        super.o();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        A a3 = this.f35147v;
        if (a3 != null) {
            a3.q();
        }
        r rVar = this.f35148w;
        if (rVar != null) {
            rVar.m();
        }
        super.onDestroy();
        c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        k kVar;
        BannerAdView bannerAdView;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() != 308 || (kVar = this.f35136B) == null || (bannerAdView = kVar.f5977c) == null) {
            return;
        }
        BannerAdView.refreshData$default(bannerAdView, false, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        A a3 = this.f35147v;
        if (a3 != null) {
            a3.f5936C = true;
            a3.n().removeCallbacks(a3.m());
            a3.u();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        PalmZoneViewModel palmZoneViewModel;
        i iVar;
        View viewInflate;
        super.onResume();
        if (NQEManager.INSTANCE.isNetworkOffline()) {
            w();
            View view = this.f35138H;
            if (view != null) {
                h.s(view, false);
            }
            NetworkNotConnectView networkNotConnectView = this.f35137C;
            if (networkNotConnectView != null) {
                h.s(networkNotConnectView, true);
            }
            View view2 = this.f35141Q;
            if (view2 != null) {
                h.s(view2, false);
            }
        } else if (BaseApplication.hasLogin()) {
            View view3 = this.f35141Q;
            if (view3 != null) {
                h.s(view3, false);
            }
            i iVar2 = this.f35139L;
            if (iVar2 != null) {
                h.s((VerticalSwipeRefreshLayout) iVar2.f728f, true);
            }
            if (this.f35147v != null) {
                x();
            }
            if (this.f35148w != null) {
                PalmZoneViewModel palmZoneViewModel2 = (PalmZoneViewModel) this.f27333i;
                if (palmZoneViewModel2 != null) {
                    palmZoneViewModel2.f();
                }
                PalmZoneViewModel palmZoneViewModel3 = (PalmZoneViewModel) this.f27333i;
                if (palmZoneViewModel3 != null) {
                    palmZoneViewModel3.h();
                }
            }
            if (this.t != null && (palmZoneViewModel = (PalmZoneViewModel) this.f27333i) != null) {
                palmZoneViewModel.g();
            }
        } else {
            i iVar3 = this.f35139L;
            if (iVar3 != null) {
                h.s((VerticalSwipeRefreshLayout) iVar3.f728f, false);
            }
            if (this.f35141Q == null && (iVar = this.f35139L) != null && (viewInflate = ((ViewStub) iVar.f726d).inflate()) != null) {
                this.f35141Q = viewInflate.findViewById(e.guestViewContainer);
                ImageView imageView = (ImageView) viewInflate.findViewById(e.ivSkeleton);
                SingleAdView singleAdView = (SingleAdView) viewInflate.findViewById(e.guestAdView);
                if (singleAdView != null) {
                    singleAdView.setAdListenerInternal(new C0158z(imageView, 4));
                }
                View viewFindViewById = viewInflate.findViewById(e.tvLogin);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(new ViewOnClickListenerC0053e(4));
                }
            }
            View view4 = this.f35141Q;
            if (view4 != null) {
                h.s(view4, true);
            }
        }
        A a3 = this.f35147v;
        if (a3 != null && a3.f5936C) {
            a3.f5936C = false;
            PalmZoneTasksRspV2 palmZoneTasksRspV2 = a3.f5945o;
            if (palmZoneTasksRspV2 != null) {
                a3.s(false);
                i iVar4 = a3.f5947v;
                if (iVar4 != null) {
                    ((AppCompatTextView) iVar4.f729g).setTag(Long.valueOf(palmZoneTasksRspV2.expireTime));
                }
                i iVar5 = a3.f5947v;
                x xVar = A.f5933L;
                if (iVar5 != null) {
                    ((AppCompatTextView) iVar5.f729g).setText(xVar.getExpireTime(palmZoneTasksRspV2.expireTime));
                }
                a3.n().removeCallbacks(a3.m());
                long refreshTime = xVar.getRefreshTime(palmZoneTasksRspV2.expireTime);
                if (refreshTime > 0) {
                    a3.n().postDelayed(a3.m(), refreshTime);
                }
            }
        }
        i iVar6 = this.f35139L;
        if (iVar6 != null) {
            ((HomeScrollView) iVar6.f729g).r();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout;
        HomeScrollView homeScrollView;
        i iVar = this.f35139L;
        if (iVar == null || (verticalSwipeRefreshLayout = (VerticalSwipeRefreshLayout) iVar.f728f) == null) {
            return;
        }
        verticalSwipeRefreshLayout.setEnabled(((iVar == null || (homeScrollView = (HomeScrollView) iVar.f729g) == null) ? 0 : homeScrollView.getScrollY()) <= 0);
    }

    public final void v(boolean z3, boolean z8) {
        View view;
        if (z3 && this.f35147v == null) {
            i iVar = this.f35139L;
            A a3 = new A(iVar != null ? (LinearLayout) iVar.f730i : null, (PalmZoneViewModel) this.f27333i, this.f35144j);
            this.f35147v = a3;
            a3.r(false);
            this.f35144j = false;
        }
        if (z3 && z8) {
            x();
        }
        A a10 = this.f35147v;
        if (a10 != null) {
            a10.f5946p = z3;
            if (z3 || (view = a10.f5942g) == null) {
                return;
            }
            h.s(view, false);
        }
    }

    public final void w() {
        if (this.f35137C == null) {
            this.f27318b.findViewById(e.viewNotNetworkStub).setVisibility(0);
            NetworkNotConnectView networkNotConnectView = (NetworkNotConnectView) this.f27318b.findViewById(e.viewNotNetwork);
            this.f35137C = networkNotConnectView;
            if (networkNotConnectView != null) {
                networkNotConnectView.setTitle(CommonViewExtKt.string(p025ba.k.core_reward, getContext()));
            }
            NetworkNotConnectView networkNotConnectView2 = this.f35137C;
            if (networkNotConnectView2 != null) {
                networkNotConnectView2.setTopMessage("Go online to view rewards and discover amazing deals！");
            }
            NetworkNotConnectView networkNotConnectView3 = this.f35137C;
            if (networkNotConnectView3 != null) {
                networkNotConnectView3.setRefreshListener(new C0142i(this, 2));
            }
        }
    }

    public final void x() {
        PalmZoneViewModel palmZoneViewModel = (PalmZoneViewModel) this.f27333i;
        if (palmZoneViewModel != null) {
            PalmZoneTasksReq req = new PalmZoneTasksReq();
            req.setPageNum(1);
            req.setPageSize(10);
            Intrinsics.checkNotNullParameter(req, "req");
            if (BaseApplication.hasLogin()) {
                p140j8.f.s(palmZoneViewModel, new i0(req, null), palmZoneViewModel.f35389e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
            }
        }
        PalmZoneViewModel palmZoneViewModel2 = (PalmZoneViewModel) this.f27333i;
        if (palmZoneViewModel2 != null) {
            PalmZoneTasksReq req2 = new PalmZoneTasksReq();
            req2.setPageNum(1);
            req2.setPageSize(100);
            Intrinsics.checkNotNullParameter(req2, "req");
            d0 d0Var = new d0(req2, null);
            Boolean bool = Boolean.FALSE;
            com.transsnet.palmpay.core.base.l lVar = palmZoneViewModel2.f35390f;
            lVar.f27356m = bool;
            Unit unit = Unit.f38893a;
            p140j8.f.v(palmZoneViewModel2, d0Var, lVar, 0L);
        }
    }

    public final void y() {
        ModelPalmPrizeBanner modelPalmPrizeBanner;
        ModelPremiumBenefits modelPremiumBenefits;
        BannerAdView bannerAdView;
        PalmZoneViewModel palmZoneViewModel;
        x();
        if (this.t != null && (palmZoneViewModel = (PalmZoneViewModel) this.f27333i) != null) {
            palmZoneViewModel.g();
        }
        if (this.f35148w != null) {
            PalmZoneViewModel palmZoneViewModel2 = (PalmZoneViewModel) this.f27333i;
            if (palmZoneViewModel2 != null) {
                palmZoneViewModel2.f();
            }
            PalmZoneViewModel palmZoneViewModel3 = (PalmZoneViewModel) this.f27333i;
            if (palmZoneViewModel3 != null) {
                palmZoneViewModel3.h();
            }
        }
        k kVar = this.f35136B;
        if (kVar != null && (bannerAdView = kVar.f5977c) != null) {
            BannerAdView.refreshData$default(bannerAdView, false, 1, null);
        }
        m mVar = this.f35146p;
        if (mVar != null && (modelPremiumBenefits = mVar.f5985e) != null) {
            modelPremiumBenefits.f35307e = mVar.f5983c;
            modelPremiumBenefits.d();
        }
        l lVar = this.f35145o;
        if (lVar == null || (modelPalmPrizeBanner = lVar.f5980d) == null) {
            return;
        }
        modelPalmPrizeBanner.d();
    }
}
