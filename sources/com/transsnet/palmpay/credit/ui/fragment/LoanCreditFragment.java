package com.transsnet.palmpay.credit.ui.fragment;

import F6.d;
import G9.i;
import androidx.activity.result.a;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.credit.base.CreditBaseMvvmFragment;
import com.transsnet.palmpay.credit.interfaces.CLPermissionHostInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p177m.j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/LoanCreditFragment;", "Lcom/transsnet/palmpay/credit/base/CreditBaseMvvmFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Lcom/transsnet/palmpay/credit/interfaces/CLPermissionHostInterface;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanCreditFragment extends CreditBaseMvvmFragment<BaseViewModel> implements CLPermissionHostInterface {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f30336j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30337o;

    public LoanCreditFragment() {
        a aVarRegisterForActivityResult = registerForActivityResult(new j(), new i(this, 13));
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f30336j = aVarRegisterForActivityResult;
    }

    @Override // com.transsnet.palmpay.credit.interfaces.CLPermissionHostInterface
    public final void checkPermission(Boolean bool) {
        d.h(this.f27317a, 3, "checkPermission >>>");
        Intrinsics.e(bool);
        this.f30337o = bool.booleanValue();
        try {
            this.f30336j.a(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.ACCESS_COARSE_LOCATION"});
        } catch (Exception unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }
}
