package com.transsnet.palmpay.managemoney.ui.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.palmpay.core.base.BaseLazyMvvmFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.EmptyView;
import com.transsnet.palmpay.managemoney.ui.viewmodel.NewUserIntroductionViewModel;
import com.transsnet.palmpay.util.TimeUtils;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/NewUserFixedSavingFragment;", "Lcom/transsnet/palmpay/core/base/BaseLazyMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/NewUserIntroductionViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNewUserFixedSavingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewUserFixedSavingFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/NewUserFixedSavingFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,240:1\n115#2,8:241\n145#2:249\n115#2,8:250\n145#2:258\n*S KotlinDebug\n*F\n+ 1 NewUserFixedSavingFragment.kt\ncom/transsnet/palmpay/managemoney/ui/fragment/NewUserFixedSavingFragment\n*L\n118#1:241,8\n118#1:249\n128#1:250,8\n128#1:258\n*E\n"})
public final class NewUserFixedSavingFragment extends BaseLazyMvvmFragment<NewUserIntroductionViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f32484A = new a(null);
    public final p355xf.t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p355xf.t f32485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f32486w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NewUserFixedSavingFragment newInstance() {
            return new NewUserFixedSavingFragment();
        }

        private a() {
        }
    }

    public NewUserFixedSavingFragment() {
        final int i7 = 0;
        this.t = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserFixedSavingFragment f32483b;

            {
                this.f32483b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserFixedSavingFragment newUserFixedSavingFragment = this.f32483b;
                switch (i7) {
                    case 0:
                        NewUserFixedSavingFragment.a aVar = NewUserFixedSavingFragment.f32484A;
                        View view = newUserFixedSavingFragment.f27318b;
                        if (view != null) {
                            return (EmptyView) view.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 1:
                        NewUserFixedSavingFragment.a aVar2 = NewUserFixedSavingFragment.f32484A;
                        View view2 = newUserFixedSavingFragment.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(Jc.c.rvProductList);
                        }
                        return null;
                    default:
                        NewUserFixedSavingFragment.a aVar3 = NewUserFixedSavingFragment.f32484A;
                        View view3 = newUserFixedSavingFragment.f27318b;
                        if (view3 != null) {
                            return (MarqueeView) view3.findViewById(Jc.c.viewMarquee);
                        }
                        return null;
                }
            }
        });
        final int i10 = 1;
        this.f32485v = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserFixedSavingFragment f32483b;

            {
                this.f32483b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserFixedSavingFragment newUserFixedSavingFragment = this.f32483b;
                switch (i10) {
                    case 0:
                        NewUserFixedSavingFragment.a aVar = NewUserFixedSavingFragment.f32484A;
                        View view = newUserFixedSavingFragment.f27318b;
                        if (view != null) {
                            return (EmptyView) view.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 1:
                        NewUserFixedSavingFragment.a aVar2 = NewUserFixedSavingFragment.f32484A;
                        View view2 = newUserFixedSavingFragment.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(Jc.c.rvProductList);
                        }
                        return null;
                    default:
                        NewUserFixedSavingFragment.a aVar3 = NewUserFixedSavingFragment.f32484A;
                        View view3 = newUserFixedSavingFragment.f27318b;
                        if (view3 != null) {
                            return (MarqueeView) view3.findViewById(Jc.c.viewMarquee);
                        }
                        return null;
                }
            }
        });
        final int i11 = 2;
        this.f32486w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.managemoney.ui.fragment.N

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewUserFixedSavingFragment f32483b;

            {
                this.f32483b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                NewUserFixedSavingFragment newUserFixedSavingFragment = this.f32483b;
                switch (i11) {
                    case 0:
                        NewUserFixedSavingFragment.a aVar = NewUserFixedSavingFragment.f32484A;
                        View view = newUserFixedSavingFragment.f27318b;
                        if (view != null) {
                            return (EmptyView) view.findViewById(Jc.c.emptyView);
                        }
                        return null;
                    case 1:
                        NewUserFixedSavingFragment.a aVar2 = NewUserFixedSavingFragment.f32484A;
                        View view2 = newUserFixedSavingFragment.f27318b;
                        if (view2 != null) {
                            return (RecyclerView) view2.findViewById(Jc.c.rvProductList);
                        }
                        return null;
                    default:
                        NewUserFixedSavingFragment.a aVar3 = NewUserFixedSavingFragment.f32484A;
                        View view3 = newUserFixedSavingFragment.f27318b;
                        if (view3 != null) {
                            return (MarqueeView) view3.findViewById(Jc.c.viewMarquee);
                        }
                        return null;
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return Jc.d.mm_new_user_fixed_saving_fragment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Pa.n0.g().v("FixedPlansPage_View");
        org.greenrobot.eventbus.c.b().j(this);
        org.chromium.support_lib_boundary.util.b.d((MarqueeView) this.f32486w.getValue(), Boolean.TRUE);
        p355xf.t tVar = this.f32485v;
        RecyclerView recyclerView = (RecyclerView) tVar.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) tVar.getValue();
        if (recyclerView2 != null) {
            Nc.s sVar = new Nc.s();
            O investBtnClickListener = new O(this);
            Intrinsics.checkNotNullParameter(investBtnClickListener, "investBtnClickListener");
            sVar.f6351b = investBtnClickListener;
            P payoutOptionsClickListener = new P(this);
            Intrinsics.checkNotNullParameter(payoutOptionsClickListener, "payoutOptionsClickListener");
            recyclerView2.setAdapter(sVar);
        }
        com.transsnet.palmpay.core.base.l lVar = ((NewUserIntroductionViewModel) this.f27327p).f32774e;
        if (lVar != null) {
            lVar.e(this, new Wd.I(new Q(this, 0), 23));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((NewUserIntroductionViewModel) this.f27327p).f32775f;
        if (lVar2 != null) {
            lVar2.e(this, new Wd.I(new Q(this, 1), 23));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 308) {
            RecyclerView recyclerView = (RecyclerView) this.f32485v.getValue();
            RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            Intrinsics.f(adapter, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.adapter.NewUserFixedProductListAdapter");
            ((Nc.s) adapter).notifyItemChanged(0, new Bundle());
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment
    public final void u() {
        super.u();
        NewUserIntroductionViewModel newUserIntroductionViewModel = (NewUserIntroductionViewModel) this.f27327p;
        newUserIntroductionViewModel.getClass();
        p140j8.f.s(newUserIntroductionViewModel, new Qc.X(1, null), newUserIntroductionViewModel.f32774e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        long jF = p059e1.a.F("fixedAutoSave");
        if (jF == 0 || !TimeUtils.isToday(jF)) {
            NewUserIntroductionViewModel newUserIntroductionViewModel2 = (NewUserIntroductionViewModel) this.f27327p;
            newUserIntroductionViewModel2.getClass();
            p140j8.f.s(newUserIntroductionViewModel2, new Qc.W(1, null), newUserIntroductionViewModel2.f32775f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment
    public final void v() {
        super.v();
        NewUserIntroductionViewModel newUserIntroductionViewModel = (NewUserIntroductionViewModel) this.f27327p;
        newUserIntroductionViewModel.getClass();
        p140j8.f.s(newUserIntroductionViewModel, new Qc.X(1, null), newUserIntroductionViewModel.f32774e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
