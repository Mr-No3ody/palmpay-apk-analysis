package com.transsnet.palmpay.managemoney.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.SwipeRecyclerView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.UserFixedSavingViewModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/UserFixedSavingFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/UserFixedSavingViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "PageType", "FixedSavingType", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserFixedSavingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserFixedSavingFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/UserFixedSavingFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,291:1\n115#2,8:292\n145#2:300\n115#2,8:301\n145#2:309\n33#2,2:310\n115#2,8:312\n145#2:320\n*S KotlinDebug\n*F\n+ 1 UserFixedSavingFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/UserFixedSavingFragment\n*L\n95#1:292,8\n95#1:300\n142#1:301,8\n142#1:309\n173#1:310,2\n182#1:312,8\n182#1:320\n*E\n"})
public final class UserFixedSavingFragment extends BaseMvvmFragment<UserFixedSavingViewModel> {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f32574v = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p355xf.t f32575j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Nc.A f32576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p355xf.t f32577p;
    public final p355xf.t t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/UserFixedSavingFragment$FixedSavingType;", "", "<init>", "()V", "Companion", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    public @interface FixedSavingType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int INVESTING = 1;
        public static final int PAYBACK = 2;

        /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.UserFixedSavingFragment$FixedSavingType$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int INVESTING = 1;
            public static final int PAYBACK = 2;

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/UserFixedSavingFragment$PageType;", "", "<init>", "()V", "Companion", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    public @interface PageType {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int OLD_USE_SAVING = 0;
        public static final int TRANSACTION_HISTORY = 1;

        /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.fragment.UserFixedSavingFragment$PageType$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int OLD_USE_SAVING = 0;
            public static final int TRANSACTION_HISTORY = 1;

            private Companion() {
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserFixedSavingFragment newInstance(int i7, int i10) {
            UserFixedSavingFragment userFixedSavingFragment = new UserFixedSavingFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("page_type", i7);
            bundle.putInt("fixed_saving_type", i10);
            userFixedSavingFragment.setArguments(bundle);
            return userFixedSavingFragment;
        }

        private a() {
        }
    }

    public UserFixedSavingFragment() {
        final int i7 = 0;
        this.f32575j = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserFixedSavingFragment f32677b;

            {
                this.f32677b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UserFixedSavingFragment userFixedSavingFragment = this.f32677b;
                switch (i7) {
                    case 0:
                        UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
                        View view = userFixedSavingFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.rvProductList);
                        }
                        return null;
                    case 1:
                        UserFixedSavingFragment.a aVar2 = UserFixedSavingFragment.f32574v;
                        return Integer.valueOf(userFixedSavingFragment.requireArguments().getInt("page_type"));
                    default:
                        UserFixedSavingFragment.a aVar3 = UserFixedSavingFragment.f32574v;
                        return Integer.valueOf(userFixedSavingFragment.requireArguments().getInt("fixed_saving_type"));
                }
            }
        });
        final int i10 = 1;
        this.f32577p = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserFixedSavingFragment f32677b;

            {
                this.f32677b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UserFixedSavingFragment userFixedSavingFragment = this.f32677b;
                switch (i10) {
                    case 0:
                        UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
                        View view = userFixedSavingFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.rvProductList);
                        }
                        return null;
                    case 1:
                        UserFixedSavingFragment.a aVar2 = UserFixedSavingFragment.f32574v;
                        return Integer.valueOf(userFixedSavingFragment.requireArguments().getInt("page_type"));
                    default:
                        UserFixedSavingFragment.a aVar3 = UserFixedSavingFragment.f32574v;
                        return Integer.valueOf(userFixedSavingFragment.requireArguments().getInt("fixed_saving_type"));
                }
            }
        });
        final int i11 = 2;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.w0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserFixedSavingFragment f32677b;

            {
                this.f32677b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                UserFixedSavingFragment userFixedSavingFragment = this.f32677b;
                switch (i11) {
                    case 0:
                        UserFixedSavingFragment.a aVar = UserFixedSavingFragment.f32574v;
                        View view = userFixedSavingFragment.f27318b;
                        if (view != null) {
                            return (SwipeRecyclerView) view.findViewById(Jc.c.rvProductList);
                        }
                        return null;
                    case 1:
                        UserFixedSavingFragment.a aVar2 = UserFixedSavingFragment.f32574v;
                        return Integer.valueOf(userFixedSavingFragment.requireArguments().getInt("page_type"));
                    default:
                        UserFixedSavingFragment.a aVar3 = UserFixedSavingFragment.f32574v;
                        return Integer.valueOf(userFixedSavingFragment.requireArguments().getInt("fixed_saving_type"));
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_use_fixed_saving_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        SwipeRecyclerView swipeRecyclerViewW;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        org.greenrobot.eventbus.c.b().j(this);
        if (getArguments() != null) {
            int iU = u();
            int iT = t();
            Nc.A a3 = new Nc.A();
            a3.f6302a = iU;
            a3.f6303b = iT;
            Intrinsics.checkNotNullParameter(a3, "<set-?>");
            this.f32576o = a3;
            SwipeRecyclerView swipeRecyclerViewW2 = w();
            if (swipeRecyclerViewW2 != null && (recyclerView2 = swipeRecyclerViewW2.getRecyclerView()) != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            }
            if (u() == 1 && (swipeRecyclerViewW = w()) != null && (recyclerView = swipeRecyclerViewW.getRecyclerView()) != null) {
                C1548f c1548f = new C1548f(requireContext().getColor(Jc.a.mm_color_e2e8eb), DensityUtil.dp2px(0.5f), DensityUtil.dp2px(16.0f), DensityUtil.dp2px(16.0f));
                c1548f.f31336e = false;
                recyclerView.addItemDecoration(c1548f);
            }
            SwipeRecyclerView swipeRecyclerViewW3 = w();
            if (swipeRecyclerViewW3 != null) {
                swipeRecyclerViewW3.setAdapter(v());
            }
            x();
            SwipeRecyclerView swipeRecyclerViewW4 = w();
            if (swipeRecyclerViewW4 != null) {
                swipeRecyclerViewW4.setOnLoadListener(new z0(this));
            }
        }
        UserFixedSavingViewModel userFixedSavingViewModel = (UserFixedSavingViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = userFixedSavingViewModel != null ? userFixedSavingViewModel.f32797g : null;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new x0(this, 0), 27));
        }
        UserFixedSavingViewModel userFixedSavingViewModel2 = (UserFixedSavingViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = userFixedSavingViewModel2 != null ? userFixedSavingViewModel2.f32796f : null;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new x0(this, 1), 27));
        }
        UserFixedSavingViewModel userFixedSavingViewModel3 = (UserFixedSavingViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = userFixedSavingViewModel3 != null ? userFixedSavingViewModel3.f32799j : null;
        if (lVar3 != null) {
            lVar3.e(this, new Wd.I(new x0(this, 3), 27));
        }
        UserFixedSavingViewModel userFixedSavingViewModel4 = (UserFixedSavingViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = userFixedSavingViewModel4 != null ? userFixedSavingViewModel4.f32800o : null;
        if (lVar4 != null) {
            lVar4.e(this, new Wd.I(new x0(this, 2), 27));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        if (u() == 0) {
            UserFixedSavingViewModel userFixedSavingViewModel = (UserFixedSavingViewModel) this.f27333i;
            if (userFixedSavingViewModel != null) {
                userFixedSavingViewModel.e(t(), true);
                return;
            }
            return;
        }
        UserFixedSavingViewModel userFixedSavingViewModel2 = (UserFixedSavingViewModel) this.f27333i;
        if (userFixedSavingViewModel2 != null) {
            userFixedSavingViewModel2.d(t(), true);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 392) {
            if (t() == 1) {
                n();
            }
        } else if (eventType == 530) {
            n();
        } else {
            if (eventType != 548) {
                return;
            }
            n();
        }
    }

    public final int t() {
        return ((Number) this.t.getValue()).intValue();
    }

    public final int u() {
        return ((Number) this.f32577p.getValue()).intValue();
    }

    public final Nc.A v() {
        Nc.A a3 = this.f32576o;
        if (a3 != null) {
            return a3;
        }
        Intrinsics.n("mUserFixedSavingAdapter");
        throw null;
    }

    public final SwipeRecyclerView w() {
        return (SwipeRecyclerView) this.f32575j.getValue();
    }

    public final void x() {
        View emptyView;
        TextView textView;
        View emptyView2;
        View viewFindViewById;
        View emptyView3;
        SwipeRecyclerView swipeRecyclerViewW = w();
        if (swipeRecyclerViewW != null) {
            swipeRecyclerViewW.setEmptyView(LayoutInflater.from(requireContext()).inflate(com.transsnet.palmpay.custom_view.t.cv_empty_list_view, (ViewGroup) null));
        }
        SwipeRecyclerView swipeRecyclerViewW2 = w();
        if (swipeRecyclerViewW2 != null && (emptyView3 = swipeRecyclerViewW2.getEmptyView()) != null) {
            emptyView3.setBackground(emptyView3.getResources().getDrawable(com.transsnet.palmpay.custom_view.r.cv_rect_corner_12_bg_white));
        }
        SwipeRecyclerView swipeRecyclerViewW3 = w();
        if (swipeRecyclerViewW3 != null && (emptyView2 = swipeRecyclerViewW3.getEmptyView()) != null && (viewFindViewById = emptyView2.findViewById(com.transsnet.palmpay.custom_view.s.tvRemark)) != null && (viewFindViewById instanceof TextView)) {
            TextView textView2 = (TextView) viewFindViewById;
            textView2.setVisibility(0);
            textView2.setText("Start your new savings journey today!");
        }
        SwipeRecyclerView swipeRecyclerViewW4 = w();
        if (swipeRecyclerViewW4 == null || (emptyView = swipeRecyclerViewW4.getEmptyView()) == null || (textView = (TextView) emptyView.findViewById(com.transsnet.palmpay.custom_view.s.tvTips)) == null) {
            return;
        }
        textView.setTextColor(textView.getResources().getColor(L6.b.ppColorTextPrimary));
        textView.setTextSize(14.0f);
        textView.setText("No savings plans yet");
    }
}
