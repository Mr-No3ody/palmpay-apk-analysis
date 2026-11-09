package com.transsnet.palmpay.managemoney.ui.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Z;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseLazyMvvmFragment;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.dialog.FixedSavingsMoreFunctionDialogFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.NewUserFixedSavingFragment;
import com.transsnet.palmpay.managemoney.ui.fragment.OldUserFixedSavingFragment;
import com.transsnet.palmpay.managemoney.ui.viewmodel.OldUserFixedSavingViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/activity/UserFixedSavingTabFragment;", "Lcom/transsnet/palmpay/core/base/BaseLazyMvvmFragment;", "Lcom/transsnet/palmpay/managemoney/ui/viewmodel/OldUserFixedSavingViewModel;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserFixedSavingTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserFixedSavingTabFragment.kt\ncom/transsnet/palmpay/managemoney/ui/activity/UserFixedSavingTabFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1878#2,3:158\n808#2,11:161\n1869#2,2:173\n1#3:172\n*S KotlinDebug\n*F\n+ 1 UserFixedSavingTabFragment.kt\ncom/transsnet/palmpay/managemoney/ui/activity/UserFixedSavingTabFragment\n*L\n88#1:158,3\n121#1:161,11\n125#1:173,2\n*E\n"})
public final class UserFixedSavingTabFragment extends BaseLazyMvvmFragment<OldUserFixedSavingViewModel> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f32214w = new a(null);
    public Bc.k t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f32215v = C1850q.h("Fixed Plans", "My Plans");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final UserFixedSavingTabFragment newInstance() {
            return new UserFixedSavingTabFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        if (!org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().j(this);
        }
        ((LinearLayout) w().f748b).removeAllViews();
        int i7 = 0;
        for (Object obj : this.f32215v) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            View viewInflate = LayoutInflater.from(getContext()).inflate(Jc.d.mm_fixed_saving_item_tab_custom, (ViewGroup) w().f748b, false);
            ((TextView) viewInflate.findViewById(Jc.c.tvTab)).setText((String) obj);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(CommonViewExtKt.getDp(88.0f), CommonViewExtKt.getDp(28.0f)));
            viewInflate.setOnClickListener(new Ad.V(i7, this));
            ((LinearLayout) w().f748b).addView(viewInflate);
            i7 = i10;
        }
        androidx.fragment.app.E e10 = this.f27319c;
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.ui.activity.UserFixedSavingActivity");
        x(((Number) ((UserFixedSavingActivity) e10).f32213f.getValue()).intValue());
        final int i11 = 0;
        ((IconicsImageView) w().f750d).setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserFixedSavingTabFragment userFixedSavingTabFragment = this;
                switch (i11) {
                    case 0:
                        UserFixedSavingTabFragment.a aVar = UserFixedSavingTabFragment.f32214w;
                        androidx.fragment.app.E e11 = userFixedSavingTabFragment.f27319c;
                        if (e11 != null) {
                            e11.finish();
                        }
                        break;
                    default:
                        UserFixedSavingTabFragment.a aVar2 = UserFixedSavingTabFragment.f32214w;
                        FixedSavingsMoreFunctionDialogFragment fixedSavingsMoreFunctionDialogFragmentNewInstance = FixedSavingsMoreFunctionDialogFragment.f32296C.newInstance();
                        Z childFragmentManager = userFixedSavingTabFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        fixedSavingsMoreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showFixedSavingsMoreFunctionDialog");
                        break;
                }
            }
        });
        final int i12 = 1;
        ((IconicsImageView) w().f749c).setOnClickListener(new View.OnClickListener() { // from class: com.transsnet.palmpay.managemoney.ui.activity.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserFixedSavingTabFragment userFixedSavingTabFragment = this;
                switch (i12) {
                    case 0:
                        UserFixedSavingTabFragment.a aVar = UserFixedSavingTabFragment.f32214w;
                        androidx.fragment.app.E e11 = userFixedSavingTabFragment.f27319c;
                        if (e11 != null) {
                            e11.finish();
                        }
                        break;
                    default:
                        UserFixedSavingTabFragment.a aVar2 = UserFixedSavingTabFragment.f32214w;
                        FixedSavingsMoreFunctionDialogFragment fixedSavingsMoreFunctionDialogFragmentNewInstance = FixedSavingsMoreFunctionDialogFragment.f32296C.newInstance();
                        Z childFragmentManager = userFixedSavingTabFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                        fixedSavingsMoreFunctionDialogFragmentNewInstance.show(childFragmentManager, "showFixedSavingsMoreFunctionDialog");
                        break;
                }
            }
        });
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Jc.d.mm_user_fixed_saving_tab_fragment, viewGroup, false);
        int i7 = Jc.c.container;
        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = Jc.c.imageViewClose;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
            if (iconicsImageView != null) {
                i7 = Jc.c.imageViewRight;
                IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                if (iconicsImageView2 != null) {
                    i7 = Jc.c.tabLayout;
                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                    if (linearLayout != null) {
                        Bc.k kVar = new Bc.k((ConstraintLayout) viewInflate, frameLayout, iconicsImageView, iconicsImageView2, linearLayout);
                        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
                        this.t = kVar;
                        return w();
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseLazyMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (org.greenrobot.eventbus.c.b().e(this)) {
            org.greenrobot.eventbus.c.b().l(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getEventType() == 592) {
            x(1);
        }
    }

    public final Bc.k w() {
        Bc.k kVar = this.t;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.n("binding");
        throw null;
    }

    public final void x(int i7) {
        Object next;
        int childCount = ((LinearLayout) w().f748b).getChildCount();
        int i10 = 0;
        while (true) {
            boolean z3 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = ((LinearLayout) w().f748b).getChildAt(i10);
            if (i10 != i7) {
                z3 = false;
            }
            childAt.setSelected(z3);
            i10++;
        }
        int i11 = i7 == 0 ? 1 : 2;
        String strValueOf = String.valueOf(i11);
        List listF = getChildFragmentManager().f17069c.f();
        Intrinsics.checkNotNullExpressionValue(listF, "getFragments(...)");
        ArrayList<BaseLazyMvvmFragment> arrayList = new ArrayList();
        for (Object obj : listF) {
            if (obj instanceof BaseLazyMvvmFragment) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.c(((BaseLazyMvvmFragment) next).getTag(), strValueOf));
        BaseLazyMvvmFragment baseLazyMvvmFragment = (BaseLazyMvvmFragment) next;
        Z childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        C1161a c1161a = new C1161a(childFragmentManager);
        Intrinsics.checkNotNullExpressionValue(c1161a, "beginTransaction(...)");
        for (BaseLazyMvvmFragment baseLazyMvvmFragment2 : arrayList) {
            if (Intrinsics.c(baseLazyMvvmFragment2, baseLazyMvvmFragment)) {
                if (baseLazyMvvmFragment2.isHidden()) {
                    c1161a.p(baseLazyMvvmFragment2);
                }
            } else if (!baseLazyMvvmFragment2.isHidden()) {
                c1161a.l(baseLazyMvvmFragment2);
            }
        }
        if (baseLazyMvvmFragment == null) {
            c1161a.d(Jc.c.container, i11 == 1 ? NewUserFixedSavingFragment.f32484A.newInstance() : OldUserFixedSavingFragment.f32498Z.newInstance(1), strValueOf, 1);
        }
        c1161a.h(true);
    }
}
