package com.transsnet.palmpay.account.ui.fragment.upgrade;

import Bc.p;
import Bc.q;
import F8.d;
import F8.e;
import Wf.AbstractC0780y;
import Wf.t0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.custom_view.CircleProgressView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p024b9.o;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepLoadingFragment;", "Lcom/transsnet/palmpay/core/base/BaseFragment;", "<init>", "()V", "b9/o", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpgradeTier3StepLoadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpgradeTier3StepLoadingFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepLoadingFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1869#2,2:260\n1878#2,3:263\n1#3:262\n*S KotlinDebug\n*F\n+ 1 UpgradeTier3StepLoadingFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/upgrade/UpgradeTier3StepLoadingFragment\n*L\n82#1:260,2\n147#1:263,3\n*E\n"})
public final class UpgradeTier3StepLoadingFragment extends BaseFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f26301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f26302j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f26303o = new ArrayList();

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

    public static o t(p pVar, int i7) {
        if (pVar == null) {
            return null;
        }
        TextView tvStep = (TextView) pVar.f813d;
        tvStep.setText(i7);
        ImageView ivStatus = (ImageView) pVar.f812c;
        Intrinsics.checkNotNullExpressionValue(ivStatus, "ivStatus");
        h.c(ivStatus);
        Intrinsics.checkNotNullExpressionValue(tvStep, "tvStep");
        Intrinsics.checkNotNullExpressionValue(ivStatus, "ivStatus");
        return new o(ivStatus, tvStep);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        View viewM;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_palmpay_level_up_tier3_step_loading, viewGroup, false);
        int i7 = d.flProgress;
        FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
        if (frameLayout != null) {
            i7 = d.llStepContainer;
            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = d.progressBar;
                CircleProgressView circleProgressView = (CircleProgressView) p059e1.a.m(i7, viewInflate);
                if (circleProgressView != null && (viewM = p059e1.a.m((i7 = d.stepComplete), viewInflate)) != null) {
                    p pVarA = p.a(viewM);
                    i7 = d.stepUpload;
                    View viewM2 = p059e1.a.m(i7, viewInflate);
                    if (viewM2 != null) {
                        p pVarA2 = p.a(viewM2);
                        i7 = d.stepVerify;
                        View viewM3 = p059e1.a.m(i7, viewInflate);
                        if (viewM3 != null) {
                            p pVarA3 = p.a(viewM3);
                            i7 = d.tvCountdown;
                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView != null) {
                                i7 = d.tvSubtitle;
                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = d.tvTitle;
                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView3 != null) {
                                        q qVar = new q((ConstraintLayout) viewInflate, frameLayout, circleProgressView, pVarA, pVarA2, pVarA3, textView, textView2, textView3);
                                        this.f26301i = qVar;
                                        return qVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        PalmPayLevelUpTier3V2Activity palmPayLevelUpTier3V2Activity;
        PpTitleBar titleBar;
        E e10 = this.f27319c;
        if (e10 instanceof PalmPayLevelUpTier3V2Activity) {
            Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.PalmPayLevelUpTier3V2Activity");
            palmPayLevelUpTier3V2Activity = (PalmPayLevelUpTier3V2Activity) e10;
        } else {
            palmPayLevelUpTier3V2Activity = null;
        }
        if (palmPayLevelUpTier3V2Activity != null && (titleBar = palmPayLevelUpTier3V2Activity.getTitleBar()) != null) {
            h.d(titleBar);
        }
        ArrayList arrayList = this.f26303o;
        arrayList.clear();
        q qVar = this.f26301i;
        o oVarT = t(qVar != null ? (p) qVar.f820g : null, F8.h.ac_tier3_pending_step_uploaded);
        if (oVarT != null) {
            arrayList.add(oVarT);
        }
        q qVar2 = this.f26301i;
        o oVarT2 = t(qVar2 != null ? (p) qVar2.f821i : null, F8.h.ac_tier3_pending_step_verified);
        if (oVarT2 != null) {
            arrayList.add(oVarT2);
        }
        q qVar3 = this.f26301i;
        o oVarT3 = t(qVar3 != null ? (p) qVar3.f819f : null, F8.h.ac_tier3_pending_step_completed);
        if (oVarT3 == null) {
            return 0;
        }
        arrayList.add(oVarT3);
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        t0 t0Var = this.f26302j;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        this.f26302j = null;
        ArrayList arrayList = this.f26303o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f18823b.clearAnimation();
        }
        arrayList.clear();
        this.f26301i = null;
        super.onDestroyView();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Context context;
        super.onResume();
        t0 t0Var = this.f26302j;
        if ((t0Var == null || !t0Var.isActive()) && (context = getContext()) != null) {
            t0 t0Var2 = this.f26302j;
            if (t0Var2 != null) {
                t0Var2.cancel((CancellationException) null);
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            this.f26302j = AbstractC0780y.m(V.f(viewLifecycleOwner), null, null, new p024b9.p(this, context, null), 3);
        }
    }
}
