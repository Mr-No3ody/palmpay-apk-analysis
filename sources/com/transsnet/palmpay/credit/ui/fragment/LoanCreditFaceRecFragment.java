package com.transsnet.palmpay.credit.ui.fragment;

import C0.G;
import G9.i;
import Pa.g0;
import Sd.b;
import androidx.activity.result.a;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.viewmodel.OcApplyBaseViewModel;
import com.transsnet.palmpay.util.CameraUtils;
import com.transsnet.palmpay.util.OcCameraInfoBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p038ca.d;
import p177m.j;
import p221ob.c;
import p298tf.f;
import p310ub.O;
import p369yd.e;
import p382zb.C2168k;
import p382zb.r;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/LoanCreditFaceRecFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/credit/viewmodel/OcApplyBaseViewModel;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoanCreditFaceRecFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoanCreditFaceRecFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanCreditFaceRecFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,220:1\n260#2,10:221\n296#2:231\n*S KotlinDebug\n*F\n+ 1 LoanCreditFaceRecFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/LoanCreditFaceRecFragment\n*L\n66#1:221,10\n66#1:231\n*E\n"})
public final class LoanCreditFaceRecFragment extends BaseMvvmFragment<OcApplyBaseViewModel> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f30333j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d f30334o = new d(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a f30335p;

    public LoanCreditFaceRecFragment() {
        a aVarRegisterForActivityResult = registerForActivityResult(new j(), new i(this, 12));
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f30335p = aVarRegisterForActivityResult;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        OcApplyBaseViewModel ocApplyBaseViewModel = (OcApplyBaseViewModel) this.f27333i;
        l lVar = ocApplyBaseViewModel != null ? ocApplyBaseViewModel.f30902p : null;
        if (lVar == null) {
            return 0;
        }
        lVar.e(this, new e(new r(this, this, 0)));
        return 0;
    }

    public final void t() {
        String str = this.f27317a;
        F6.d.h(str, 3, "startFaceRecReal >>>");
        F6.d.h(str, 3, "uploadCameraInfo >>>");
        IApiCreditService iApiCreditServiceH = G.h(c.f40268a);
        OcCameraInfoBean ocCameraInfo = CameraUtils.getOcCameraInfo(BaseApplication.get());
        Intrinsics.checkNotNullExpressionValue(ocCameraInfo, "getOcCameraInfo(...)");
        iApiCreditServiceH.uploadCameraInfo(ocCameraInfo).k(f.f42629b).i(p071ef.b.a()).subscribe(new C2168k(this, 2));
        g0.f(g0.f7080h.getInstance(), this, 0, new O(this), this.f30334o, G.A(), false);
    }
}
