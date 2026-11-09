package com.transsnet.palmpay.core.ui.fragment.verify;

import C0.N;
import C0.P;
import C0.S;
import Fe.h0;
import Ha.d;
import Ja.w;
import Ja.x;
import Ma.s;
import Ma.v;
import O6.c;
import Rd.C0592h;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.b0;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.ui.mvvm.PayVerifyViewModel;
import io.fastkv.n;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.e;
import p025ba.g;
import p025ba.h;
import p025ba.k;
import p054dd.q;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAFragment;", "Lcom/transsnet/palmpay/core/ui/fragment/verify/BaseVerifyFragment;", "Lcom/transsnet/palmpay/core/ui/mvvm/PayVerifyViewModel;", "<init>", "()V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCheckSafetyAssessmentQAFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckSafetyAssessmentQAFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,203:1\n172#2,9:204\n260#3,10:213\n296#3:223\n260#3,10:224\n296#3:234\n260#3,10:235\n296#3:245\n*S KotlinDebug\n*F\n+ 1 CheckSafetyAssessmentQAFragment.kt\ncom/transsnet/palmpay/core/ui/fragment/verify/CheckSafetyAssessmentQAFragment\n*L\n34#1:204,9\n92#1:213,10\n92#1:223\n111#1:224,10\n111#1:234\n125#1:235,10\n125#1:245\n*E\n"})
public final class CheckSafetyAssessmentQAFragment extends BaseVerifyFragment<PayVerifyViewModel> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f28014A = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f28015j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f28016o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28017p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public P f28018v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b0 f28019w = p002a.a.h(this, G.a(v.class), new x(this, 0), new x(this, 1), new x(this, 2));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CheckSafetyAssessmentQAFragment newInstance(@NotNull PayByOrderResp.DataBean bean) {
            Intrinsics.checkNotNullParameter(bean, "bean");
            CheckSafetyAssessmentQAFragment checkSafetyAssessmentQAFragment = new CheckSafetyAssessmentQAFragment();
            Bundle bundle = new Bundle();
            bundle.putString("transType", bean.transType);
            bundle.putString("orderNo", bean.orderNo);
            bundle.putString("token", bean.token);
            bundle.putString("desc", bean.riskTips);
            checkSafetyAssessmentQAFragment.setArguments(bundle);
            return checkSafetyAssessmentQAFragment;
        }

        private a() {
        }
    }

    public final void A() {
        c cVar = new c(getContext());
        cVar.e(k.core_the_transfer_has_timed_out_title);
        cVar.f6598d = getString(k.core_the_transfer_has_timed_out_tips);
        cVar.d(k.core_confirm, new d(this, 28));
        cVar.g();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        PayVerifyViewModel payVerifyViewModel = (PayVerifyViewModel) this.f27333i;
        n.B(this, payVerifyViewModel != null ? payVerifyViewModel.f28070e : null, this, new Ba.a(this, 9), new h0(1), false, null, 240);
        PayVerifyViewModel payVerifyViewModel2 = (PayVerifyViewModel) this.f27333i;
        l lVar = payVerifyViewModel2 != null ? payVerifyViewModel2.f28071f : null;
        if (lVar != null) {
            lVar.e(this, new q(new w(this, this, 0), 2));
        }
        PayVerifyViewModel payVerifyViewModel3 = (PayVerifyViewModel) this.f27333i;
        l lVar2 = payVerifyViewModel3 != null ? payVerifyViewModel3.f28072g : null;
        if (lVar2 != null) {
            lVar2.e(this, new q(new w(this, this, 1), 2));
        }
        PayVerifyViewModel payVerifyViewModel4 = (PayVerifyViewModel) this.f27333i;
        l lVar3 = payVerifyViewModel4 != null ? payVerifyViewModel4.f28073i : null;
        if (lVar3 == null) {
            return 0;
        }
        lVar3.e(this, new q(new w(this, this, 2), 2));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(g.core_safety_assessment_qa_fragment, viewGroup, false);
        int i7 = e.navHostFragment;
        if (((FragmentContainerView) p059e1.a.m(i7, viewInflate)) != null) {
            return new C0592h((ConstraintLayout) viewInflate, 3);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f28015j = arguments.getString("transType");
            this.f28016o = arguments.getString("orderNo");
            this.f28017p = arguments.getString("token");
            this.t = arguments.getString("desc");
        }
        Fragment fragmentD = getChildFragmentManager().D(e.navHostFragment);
        Intrinsics.f(fragmentD, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f28018v = ((NavHostFragment) fragmentD).f();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.verify.BaseVerifyFragment
    public final void onBackPressed() {
        z();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        S s3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            P p3 = this.f28018v;
            N nB = (p3 == null || (s3 = (S) p3.f1099B.getValue()) == null) ? null : s3.b(h.core_fragment_safety_assessment_nav_graph);
            Bundle bundle2 = new Bundle();
            bundle2.putString("desc", this.t);
            if (nB != null) {
                nB.h(e.fragmentSafetyAssessmentQaDialog);
            }
            P p10 = this.f28018v;
            if (p10 != null) {
                Intrinsics.e(nB);
                p10.q(nB, bundle2);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.ui.fragment.verify.BaseVerifyFragment
    public final boolean v() {
        return true;
    }

    public final void z() {
        PayVerifyViewModel payVerifyViewModel = (PayVerifyViewModel) this.f27333i;
        if (payVerifyViewModel != null) {
            String token = this.f28017p;
            if (token == null) {
                token = "";
            }
            String str = this.t;
            Intrinsics.checkNotNullParameter(token, "token");
            f.s(payVerifyViewModel, new Ma.q(token, str, null), payVerifyViewModel.f28073i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        PayVerifyViewModel payVerifyViewModel2 = (PayVerifyViewModel) this.f27333i;
        if (payVerifyViewModel2 != null) {
            String str2 = this.f28015j;
            String str3 = this.f28016o;
            String orderNo = str3 != null ? str3 : "";
            Intrinsics.checkNotNullParameter(orderNo, "orderNo");
            f.s(payVerifyViewModel2, new s(str2, orderNo, null), payVerifyViewModel2.f28074j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
