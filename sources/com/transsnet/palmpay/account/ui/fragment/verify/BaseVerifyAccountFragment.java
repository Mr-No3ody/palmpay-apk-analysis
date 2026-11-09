package com.transsnet.palmpay.account.ui.fragment.verify;

import L6.b;
import S6.a;
import W8.d;
import Yd.i;
import android.os.Bundle;
import androidx.fragment.app.E;
import androidx.navigation.fragment.NavHostFragment;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity;
import com.transsnet.palmpay.account.ui.mvp.contract.VerifyAccountContract;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p051d9.n0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/fragment/verify/BaseVerifyAccountFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "Ld9/n0;", "Lcom/transsnet/palmpay/account/ui/mvp/contract/VerifyAccountContract$View;", "<init>", "()V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseVerifyAccountFragment extends BaseMVPFragment<n0> implements VerifyAccountContract.View {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f26306j;

    public static void u(PpTitleBar ppTitleBar) {
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView1Icon(a.pay_CustomerService);
        }
        if (ppTitleBar != null) {
            ppTitleBar.setRightImageView1ClickListener(new d(23));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public int o() {
        NavHostFragment.f17502e.findNavController(this);
        Bundle arguments = getArguments();
        this.f26306j = arguments != null ? arguments.getString("extra_id") : null;
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        VerifyAccountActivity verifyAccountActivityW = w();
        if (verifyAccountActivityW != null) {
            verifyAccountActivityW.initStatusBar(verifyAccountActivityW.getColor(!(this instanceof VerifyAccountIdFragment) ? b.ppColorBackgroundLight : b.ppColorBackgroundDark));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public n0 t() {
        return new n0();
    }

    public final VerifyAccountActivity w() {
        E e10 = this.f27319c;
        if (!(e10 instanceof VerifyAccountActivity)) {
            return null;
        }
        Intrinsics.f(e10, "null cannot be cast to non-null type com.transsnet.palmpay.account.ui.activity.VerifyAccountActivity");
        return (VerifyAccountActivity) e10;
    }

    public void x(CommonBeanResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    public void y(CommonBeanResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    public final void z(PpTitleBar ppTitleBar) {
        if (ppTitleBar != null) {
            ppTitleBar.setBackButtonClickListener(new i(this, 9));
        }
    }
}
