package com.transsnet.palmpay.account.ui.fragment.guardian;

import Bc.i;
import C9.C0139f;
import F8.d;
import F8.e;
import F8.h;
import L8.a;
import T8.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p097g9.C1705c;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianInfoFragment;", "Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAddGuardianInfoFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddGuardianInfoFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianInfoFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,112:1\n115#2,8:113\n145#2:121\n1869#3,2:122\n*S KotlinDebug\n*F\n+ 1 AddGuardianInfoFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/AddGuardianInfoFragment\n*L\n56#1:113,8\n56#1:121\n80#1:122,2\n*E\n"})
public final class AddGuardianInfoFragment extends BaseAddGuardianFragment {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f26135p;

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.callback.CustomActionCallback
    public final boolean goBack(String str) {
        if (this.f26141j) {
            return false;
        }
        a.d(getContext(), "Don't Give Up Yet!", null, null, "Complete your guardian information to enjoy high-quality financial services.", Integer.valueOf(h.ac_continue), null, null, Integer.valueOf(h.ac_quit), new j(this, 1), null, 6860);
        return true;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment, com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        i iVar = this.f26135p;
        y(iVar != null ? (PpTitleBar) iVar.f725c : null);
        i iVar2 = this.f26135p;
        if (iVar2 != null) {
            TextView textView = (TextView) iVar2.f729g;
            AddGuardianActivity addGuardianActivityV = v();
            textView.setText(addGuardianActivityV != null ? addGuardianActivityV.f25815d : null);
        }
        i iVar3 = this.f26135p;
        if (iVar3 != null) {
            TextView textView2 = (TextView) iVar3.f728f;
            AddGuardianActivity addGuardianActivityV2 = v();
            textView2.setText(addGuardianActivityV2 != null ? addGuardianActivityV2.f25816e : null);
        }
        i iVar4 = this.f26135p;
        if (iVar4 != null) {
            ((PpButton) iVar4.f727e).setOnClickListener(new j(this, 0));
        }
        super.k();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final ViewBinding l(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(e.ac_fragment_add_guardian_info, viewGroup, false);
        int i7 = d.bottomViewStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = d.btnContinue;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = d.titleBar;
                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                if (ppTitleBar != null) {
                    i7 = d.tvMsg;
                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView != null) {
                        i7 = d.tvTitle;
                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView2 != null) {
                            i7 = d.viewInstruction;
                            LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                            if (linearLayout != null) {
                                i iVar = new i((ViewGroup) viewInflate, (View) viewStub, (View) ppButton, (ViewGroup) ppTitleBar, (View) textView, textView2, (View) linearLayout, 10);
                                this.f26135p = iVar;
                                return iVar;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        AddGuardianViewModel addGuardianViewModel = (AddGuardianViewModel) this.f27333i;
        if (addGuardianViewModel != null) {
            AddGuardianActivity addGuardianActivityV = v();
            f.s(addGuardianViewModel, new C1705c(addGuardianActivityV != null ? addGuardianActivityV.f25813b : null, null), addGuardianViewModel.f26410i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        AddGuardianViewModel addGuardianViewModel2 = (AddGuardianViewModel) this.f27333i;
        l lVar = addGuardianViewModel2 != null ? addGuardianViewModel2.f26410i : null;
        if (lVar != null) {
            lVar.e(this, new T8.f(new C0139f(this, 25)));
        }
    }

    @Override // com.transsnet.palmpay.account.ui.fragment.guardian.BaseAddGuardianFragment
    public final ViewStub t() {
        i iVar = this.f26135p;
        if (iVar != null) {
            return (ViewStub) iVar.f726d;
        }
        return null;
    }
}
