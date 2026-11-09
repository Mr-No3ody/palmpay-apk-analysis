package com.transsnet.palmpay.account.ui.fragment.guardian;

import C0.AbstractC0130w;
import C0.U;
import Ce.H;
import F8.d;
import Pa.C0525w;
import S6.a;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import com.google.gson.Gson;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.bean.rsp.SubmitGuardianRsp;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity;
import com.transsnet.palmpay.account.ui.viewmodel.AddGuardianViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.callback.CustomActionCallback;
import com.transsnet.palmpay.custom_view.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/account/ui/viewmodel/AddGuardianViewModel;", "Lcom/transsnet/palmpay/core/callback/CustomActionCallback;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseAddGuardianFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAddGuardianFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,105:1\n629#2,11:106\n*S KotlinDebug\n*F\n+ 1 BaseAddGuardianFragment.kt\ncom/transsnet/palmpay/account/ui/fragment/guardian/BaseAddGuardianFragment\n*L\n48#1:106,11\n*E\n"})
public class BaseAddGuardianFragment extends BaseMvvmFragment<AddGuardianViewModel> implements CustomActionCallback {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f26141j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC0130w f26142o;

    public static U u(Integer num, boolean z3) {
        int iIntValue;
        boolean z8;
        int i7 = m.cv_anim_slide_alpha_in_right;
        int i10 = m.cv_anim_slide_alpha_out_left;
        int i11 = m.cv_anim_slide_alpha_in_left;
        int i12 = m.cv_anim_slide_alpha_out_right;
        if (num != null) {
            iIntValue = num.intValue();
            z8 = z3;
        } else {
            iIntValue = -1;
            z8 = false;
        }
        return new U(false, false, iIntValue, z8, false, i7, i10, i11, i12);
    }

    public boolean goBack(String str) {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public int k() {
        Window window;
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        decorView.post(new H(handlerJ, 6, this, this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        this.f26142o = NavHostFragment.f17502e.findNavController(this);
        super.o();
        return 0;
    }

    public ViewStub t() {
        return null;
    }

    public final AddGuardianActivity v() {
        E e10 = this.f27319c;
        if (!(e10 instanceof AddGuardianActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.AddGuardianActivity");
        return (AddGuardianActivity) e10;
    }

    public final GuardianApproveActivity w() {
        E e10 = this.f27319c;
        if (!(e10 instanceof GuardianApproveActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.GuardianApproveActivity");
        return (GuardianApproveActivity) e10;
    }

    public final void x(Integer num, SubmitGuardianRsp submitGuardianRsp) {
        Bundle bundle;
        AbstractC0130w abstractC0130w = this.f26142o;
        if (abstractC0130w != null) {
            int i7 = d.fragment_add_guardian_step_result;
            if (submitGuardianRsp != null) {
                bundle = new Bundle();
                bundle.putString("extra_data", ((Gson) C0525w.f().f7166b).toJson(submitGuardianRsp));
                Unit unit = Unit.f38893a;
            } else {
                bundle = null;
            }
            abstractC0130w.h(i7, bundle, u(num, true));
        }
    }

    public final void y(PpTitleBar ppTitleBar) {
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView2Icon(a.pay_CustomerService);
        }
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView2ClickListener(new K8.a(24));
        }
        if (ppTitleBar != null) {
            ppTitleBar.setBackButtonClickListener(new R8.d(this, 8));
        }
    }
}
