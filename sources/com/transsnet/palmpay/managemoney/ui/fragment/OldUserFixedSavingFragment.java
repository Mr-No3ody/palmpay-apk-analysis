package com.transsnet.palmpay.managemoney.ui.fragment;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.palmpay.core.base.BaseLazyMvvmFragment;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.managemoney.bean.SavingStatBean;
import com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingTabFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OldUserFixedSavingViewModel;
import com.transsnet.palmpay.util.BarUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/OldUserFixedSavingFragment;", "Lcom/transsnet/palmpay/core/base/BaseLazyMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/OldUserFixedSavingViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "com/transsnet/palmpay/managemoney/ui/fragment/X", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOldUserFixedSavingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OldUserFixedSavingFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/OldUserFixedSavingFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,320:1\n115#2,8:321\n145#2:329\n*S KotlinDebug\n*F\n+ 1 OldUserFixedSavingFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/OldUserFixedSavingFragment\n*L\n84#1:321,8\n84#1:329\n*E\n"})
public final class OldUserFixedSavingFragment extends BaseLazyMvvmFragment<OldUserFixedSavingViewModel> {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final a f32498Z = new a(null);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f32505Q;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public SavingStatBean f32507Y;
    public final p355xf.t t = C2131j.b(new V(this, 2));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32508v = C2131j.b(new V(this, 3));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32509w = C2131j.b(new V(this, 4));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f32499A = C2131j.b(new V(this, 5));

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f32500B = C2131j.b(new V(this, 6));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p355xf.t f32501C = C2131j.b(new V(this, 7));

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f32502H = C2131j.b(new V(this, 8));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f32503L = C2131j.b(new V(this, 9));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f32504M = C2131j.b(new V(this, 1));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f32506X = 1;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OldUserFixedSavingFragment newInstance(int i7) {
            OldUserFixedSavingFragment oldUserFixedSavingFragment = new OldUserFixedSavingFragment();
            oldUserFixedSavingFragment.f32506X = i7;
            return oldUserFixedSavingFragment;
        }

        private a() {
        }
    }

    public final void A(TabLayout.Tab tab, boolean z3) {
        View customView;
        int i7 = m() ? com.transsnet.palmpay.custom_view.p.md_white_1000 : Jc.a.mm_color_202046;
        if (tab == null || (customView = tab.getCustomView()) == null || !(customView instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) customView;
        Context contextRequireContext = requireContext();
        if (z3) {
            i7 = Jc.a.mm_color_6306b2;
        }
        textView.setTextColor(contextRequireContext.getColor(i7));
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_old_user_fixed_saving_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        TabLayout.Tab tabAt;
        TabLayout.Tab tabAt2;
        final int i7 = 2;
        final int i10 = 1;
        final int i11 = 0;
        Pa.n0.g().v("MyPlansPage_View");
        org.greenrobot.eventbus.c.b().j(this);
        p355xf.t tVar = this.f32504M;
        PpTitleBar ppTitleBar = (PpTitleBar) tVar.getValue();
        if (ppTitleBar != null) {
            PpTitleBar ppTitleBar2 = (PpTitleBar) tVar.getValue();
            ViewGroup.LayoutParams layoutParams = ppTitleBar2 != null ? ppTitleBar2.getLayoutParams() : null;
            Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = BarUtils.getStatusBarHeight();
            ppTitleBar.setLayoutParams(layoutParams2);
        }
        PpTitleBar ppTitleBar3 = (PpTitleBar) tVar.getValue();
        if (ppTitleBar3 != null) {
            ppTitleBar3.setBackButtonClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.W

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OldUserFixedSavingFragment f32581b;

                {
                    this.f32581b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextView textView;
                    OldUserFixedSavingFragment oldUserFixedSavingFragment = this.f32581b;
                    switch (i11) {
                        case 0:
                            OldUserFixedSavingFragment.a aVar = OldUserFixedSavingFragment.f32498Z;
                            androidx.fragment.app.E activity = oldUserFixedSavingFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        case 1:
                            OldUserFixedSavingFragment.a aVar2 = OldUserFixedSavingFragment.f32498Z;
                            Pa.n0.g().l("MyPlansPage_CreatePlan_Click");
                            Fragment parentFragment = oldUserFixedSavingFragment.getParentFragment();
                            Intrinsics.f(parentFragment, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingTabFragment");
                            ((UserFixedSavingTabFragment) parentFragment).x(0);
                            break;
                        default:
                            OldUserFixedSavingFragment.a aVar3 = OldUserFixedSavingFragment.f32498Z;
                            boolean zC = p059e1.a.C("savings_balance_shown", true);
                            if (zC) {
                                IconicsTextView iconicsTextViewZ = oldUserFixedSavingFragment.z();
                                if (iconicsTextViewZ != null) {
                                    iconicsTextViewZ.setText("****");
                                }
                                p059e1.a.X("savings_balance_shown", false);
                            } else {
                                IconicsTextView iconicsTextViewZ2 = oldUserFixedSavingFragment.z();
                                if (iconicsTextViewZ2 != null) {
                                    iconicsTextViewZ2.setText(Pa.r0.B(oldUserFixedSavingFragment.f32505Q, true));
                                }
                                p059e1.a.X("savings_balance_shown", true);
                            }
                            SavingStatBean savingStatBean = oldUserFixedSavingFragment.f32507Y;
                            if (savingStatBean != null && (textView = (TextView) oldUserFixedSavingFragment.f32499A.getValue()) != null) {
                                textView.setText(oldUserFixedSavingFragment.getString(Jc.f.mm_total_interest_with_amount, zC ? "****" : Pa.r0.B(savingStatBean.getMaturedEarning(), true)));
                            }
                            oldUserFixedSavingFragment.w(!zC);
                            break;
                    }
                }
            });
        }
        Pa.r0.g1((ImageView) this.f32502H.getValue(), Ea.a.c(TransType.TRANS_TYPE_FIXED_SAVING, (14 & 2) != 0 ? null : -1, null, null), (G1.d) new G1.d().x(com.transsnet.palmpay.custom_view.r.cv_bill_default_icon));
        p355xf.t tVar2 = this.f32508v;
        ViewPager viewPager = (ViewPager) tVar2.getValue();
        if (viewPager != null) {
            viewPager.setOffscreenPageLimit(1);
        }
        ViewPager viewPager2 = (ViewPager) tVar2.getValue();
        if (viewPager2 != null) {
            androidx.fragment.app.Z childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            ArrayList arrayList = new ArrayList();
            UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
            arrayList.add(aVar.newInstance(0, 1));
            arrayList.add(aVar.newInstance(0, 2));
            Unit unit = Unit.f38893a;
            viewPager2.setAdapter(new X(childFragmentManager, arrayList));
        }
        TabLayout tabLayoutY = y();
        if (tabLayoutY != null) {
            tabLayoutY.setupWithViewPager((ViewPager) tVar2.getValue());
        }
        TabLayout tabLayoutY2 = y();
        if (tabLayoutY2 != null && (tabAt2 = tabLayoutY2.getTabAt(0)) != null) {
            String string = getResources().getString(Jc.f.mm_plan_status_investing);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            tabAt2.setCustomView(x(string));
        }
        TabLayout tabLayoutY3 = y();
        if (tabLayoutY3 != null && (tabAt = tabLayoutY3.getTabAt(1)) != null) {
            String string2 = getResources().getString(Jc.f.mm_tab_matured);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            tabAt.setCustomView(x(string2));
        }
        RoundedTextView roundedTextView = (RoundedTextView) this.t.getValue();
        if (roundedTextView != null) {
            roundedTextView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.W

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OldUserFixedSavingFragment f32581b;

                {
                    this.f32581b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextView textView;
                    OldUserFixedSavingFragment oldUserFixedSavingFragment = this.f32581b;
                    switch (i10) {
                        case 0:
                            OldUserFixedSavingFragment.a aVar2 = OldUserFixedSavingFragment.f32498Z;
                            androidx.fragment.app.E activity = oldUserFixedSavingFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        case 1:
                            OldUserFixedSavingFragment.a aVar3 = OldUserFixedSavingFragment.f32498Z;
                            Pa.n0.g().l("MyPlansPage_CreatePlan_Click");
                            Fragment parentFragment = oldUserFixedSavingFragment.getParentFragment();
                            Intrinsics.f(parentFragment, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingTabFragment");
                            ((UserFixedSavingTabFragment) parentFragment).x(0);
                            break;
                        default:
                            OldUserFixedSavingFragment.a aVar4 = OldUserFixedSavingFragment.f32498Z;
                            boolean zC = p059e1.a.C("savings_balance_shown", true);
                            if (zC) {
                                IconicsTextView iconicsTextViewZ = oldUserFixedSavingFragment.z();
                                if (iconicsTextViewZ != null) {
                                    iconicsTextViewZ.setText("****");
                                }
                                p059e1.a.X("savings_balance_shown", false);
                            } else {
                                IconicsTextView iconicsTextViewZ2 = oldUserFixedSavingFragment.z();
                                if (iconicsTextViewZ2 != null) {
                                    iconicsTextViewZ2.setText(Pa.r0.B(oldUserFixedSavingFragment.f32505Q, true));
                                }
                                p059e1.a.X("savings_balance_shown", true);
                            }
                            SavingStatBean savingStatBean = oldUserFixedSavingFragment.f32507Y;
                            if (savingStatBean != null && (textView = (TextView) oldUserFixedSavingFragment.f32499A.getValue()) != null) {
                                textView.setText(oldUserFixedSavingFragment.getString(Jc.f.mm_total_interest_with_amount, zC ? "****" : Pa.r0.B(savingStatBean.getMaturedEarning(), true)));
                            }
                            oldUserFixedSavingFragment.w(!zC);
                            break;
                    }
                }
            });
        }
        IconicsTextView iconicsTextViewZ = z();
        if (iconicsTextViewZ != null) {
            iconicsTextViewZ.setOnClickListener(new ViewOnClickListenerC1478l(25));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f32501C.getValue();
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.W

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OldUserFixedSavingFragment f32581b;

                {
                    this.f32581b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TextView textView;
                    OldUserFixedSavingFragment oldUserFixedSavingFragment = this.f32581b;
                    switch (i7) {
                        case 0:
                            OldUserFixedSavingFragment.a aVar2 = OldUserFixedSavingFragment.f32498Z;
                            androidx.fragment.app.E activity = oldUserFixedSavingFragment.getActivity();
                            if (activity != null) {
                                activity.onBackPressed();
                            }
                            break;
                        case 1:
                            OldUserFixedSavingFragment.a aVar3 = OldUserFixedSavingFragment.f32498Z;
                            Pa.n0.g().l("MyPlansPage_CreatePlan_Click");
                            Fragment parentFragment = oldUserFixedSavingFragment.getParentFragment();
                            Intrinsics.f(parentFragment, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingTabFragment");
                            ((UserFixedSavingTabFragment) parentFragment).x(0);
                            break;
                        default:
                            OldUserFixedSavingFragment.a aVar4 = OldUserFixedSavingFragment.f32498Z;
                            boolean zC = p059e1.a.C("savings_balance_shown", true);
                            if (zC) {
                                IconicsTextView iconicsTextViewZ2 = oldUserFixedSavingFragment.z();
                                if (iconicsTextViewZ2 != null) {
                                    iconicsTextViewZ2.setText("****");
                                }
                                p059e1.a.X("savings_balance_shown", false);
                            } else {
                                IconicsTextView iconicsTextViewZ3 = oldUserFixedSavingFragment.z();
                                if (iconicsTextViewZ3 != null) {
                                    iconicsTextViewZ3.setText(Pa.r0.B(oldUserFixedSavingFragment.f32505Q, true));
                                }
                                p059e1.a.X("savings_balance_shown", true);
                            }
                            SavingStatBean savingStatBean = oldUserFixedSavingFragment.f32507Y;
                            if (savingStatBean != null && (textView = (TextView) oldUserFixedSavingFragment.f32499A.getValue()) != null) {
                                textView.setText(oldUserFixedSavingFragment.getString(Jc.f.mm_total_interest_with_amount, zC ? "****" : Pa.r0.B(savingStatBean.getMaturedEarning(), true)));
                            }
                            oldUserFixedSavingFragment.w(!zC);
                            break;
                    }
                }
            });
        }
        TabLayout tabLayoutY4 = y();
        A(tabLayoutY4 != null ? tabLayoutY4.getTabAt(1) : null, false);
        TabLayout tabLayoutY5 = y();
        if (tabLayoutY5 != null) {
            tabLayoutY5.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Y(this));
        }
        int i12 = this.f32506X == 1 ? 0 : 1;
        TabLayout tabLayoutY6 = y();
        A(tabLayoutY6 != null ? tabLayoutY6.getTabAt(i12) : null, true);
        ViewPager viewPager3 = (ViewPager) tVar2.getValue();
        if (viewPager3 != null) {
            viewPager3.setCurrentItem(i12);
        }
        boolean zC = p059e1.a.C("savings_balance_shown", true);
        IconicsTextView iconicsTextViewZ2 = z();
        if (iconicsTextViewZ2 != null) {
            iconicsTextViewZ2.setText(zC ? Pa.r0.B(0L, true) : "****");
        }
        if (zC) {
            Pa.r0.A(0L);
        }
        w(zC);
        Pa.r0.R1(z(), "fonts/PalmPayNum-Bold.ttf");
        org.chromium.support_lib_boundary.util.b.d((MarqueeView) this.f32503L.getValue(), Boolean.TRUE);
        com.transsnet.palmpay.core.base.l lVar = ((OldUserFixedSavingViewModel) this.f27327p).f32777f;
        if (lVar != null) {
            lVar.e(this, new T8.f(new V8.w(this, 9), (byte) 0));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        OldUserFixedSavingViewModel oldUserFixedSavingViewModel = (OldUserFixedSavingViewModel) this.f27327p;
        oldUserFixedSavingViewModel.getClass();
        p140j8.f.s(oldUserFixedSavingViewModel, new Qc.a0(1, null), oldUserFixedSavingViewModel.f32777f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        OldUserFixedSavingViewModel oldUserFixedSavingViewModel2 = (OldUserFixedSavingViewModel) this.f27327p;
        oldUserFixedSavingViewModel2.getClass();
        p140j8.f.s(oldUserFixedSavingViewModel2, new Qc.Z(1, null), oldUserFixedSavingViewModel2.f32778g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 392 || eventType == 530) {
            n();
        }
    }

    public final void w(boolean z3) {
        p355xf.t tVar = this.f32501C;
        if (z3) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) tVar.getValue();
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_eye_opened);
                return;
            }
            return;
        }
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) tVar.getValue();
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_icon_eye_closed);
        }
    }

    public final TextView x(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        TextView textView = new TextView(requireContext());
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(requireContext().getColor(Jc.a.mm_color_202046));
        textView.setText(text);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setGravity(17);
        return textView;
    }

    public final TabLayout y() {
        return (TabLayout) this.f32509w.getValue();
    }

    public final IconicsTextView z() {
        return (IconicsTextView) this.f32500B.getValue();
    }
}
