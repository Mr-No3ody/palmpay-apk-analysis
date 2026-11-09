package com.transsnet.palmpay.account.ui.fragment.auth;

import Bc.k;
import F8.d;
import F8.e;
import F8.h;
import L6.b;
import L8.a;
import N8.C0457a;
import Pa.n0;
import Pa.r0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.PatternLockView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/auth/VerifyPatternFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/auth/BaseVerifyFragment;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifyPatternFragment extends BaseVerifyFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f26120j;

    public static void B(VerifyPatternFragment verifyPatternFragment, int[] password) {
        Intrinsics.checkNotNullParameter(password, "password");
        if (!r0.X0(password)) {
            String string = verifyPatternFragment.getString(h.ac_connect_at_least_4_dots);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            verifyPatternFragment.D(string);
            k kVar = verifyPatternFragment.f26120j;
            a.c(kVar != null ? (TextView) kVar.f749c : null);
            return;
        }
        k kVar2 = verifyPatternFragment.f26120j;
        if (kVar2 != null) {
            ((TextView) kVar2.f749c).setVisibility(4);
        }
        if (r0.m((int[]) password.clone())) {
            n0.g().k(new ClickEvent("PalmPayAutologout_VerifyType").afEvt(false).add("element_name", "VerifyType").add("element_details", "pattern"));
            verifyPatternFragment.z(null);
            return;
        }
        verifyPatternFragment.w();
        verifyPatternFragment.C(verifyPatternFragment.u());
        k kVar3 = verifyPatternFragment.f26120j;
        a.c(kVar3 != null ? (TextView) kVar3.f749c : null);
        if (verifyPatternFragment.u() >= verifyPatternFragment.v()) {
            verifyPatternFragment.y();
        }
    }

    public final void C(int i7) {
        PatternLockView patternLockView;
        if (i7 < v()) {
            String string = getString(h.ac_msg_pin_retry_times_left_long, Integer.valueOf(v() - i7));
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            D(string);
            return;
        }
        String string2 = getResources().getString(h.ac_finger_full_show_tip);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        D(string2);
        k kVar = this.f26120j;
        if (kVar == null || (patternLockView = (PatternLockView) kVar.f752f) == null) {
            return;
        }
        patternLockView.setEnabled(false);
    }

    public final void D(String str) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        k kVar = this.f26120j;
        if (kVar != null && (textView3 = (TextView) kVar.f749c) != null) {
            p220oa.h.s(textView3, true);
        }
        k kVar2 = this.f26120j;
        if (kVar2 != null && (textView2 = (TextView) kVar2.f749c) != null) {
            textView2.setTextColor(requireContext().getColor(b.ppColorError));
        }
        k kVar3 = this.f26120j;
        if (kVar3 == null || (textView = (TextView) kVar3.f749c) == null) {
            return;
        }
        textView.setText(str);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_verifiy_pattern, viewGroup, false);
        int i7 = d.layoutHeader;
        View viewM = p059e1.a.m(i7, viewInflate);
        if (viewM != null) {
            i7 = d.lockView;
            PatternLockView patternLockView = (PatternLockView) p059e1.a.m(i7, viewInflate);
            if (patternLockView != null) {
                i7 = d.tvMsg;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = d.tvVerify;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        k kVar = new k((ConstraintLayout) viewInflate, viewM, patternLockView, textView, textView2);
                        this.f26120j = kVar;
                        return kVar;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        x();
        k kVar = this.f26120j;
        if (kVar != null) {
            ((TextView) kVar.f750d).setOnClickListener(this);
        }
        k kVar2 = this.f26120j;
        if (kVar2 == null) {
            return 0;
        }
        ((PatternLockView) kVar2.f752f).setUnlockListener(new C0457a(this, 17));
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        int i7 = d.tvVerify;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            t();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        k kVar = this.f26120j;
        A(kVar != null ? (TextView) kVar.f750d : null);
        if (u() > 0) {
            C(u());
        }
    }
}
