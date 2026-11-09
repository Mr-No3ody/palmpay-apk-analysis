package com.transsnet.palmpay.credit.manager;

import C0.G;
import F6.d;
import Pa.Y;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.camera.camera2.internal.F;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.bean.JumpLinkInfo;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.credit.bean.req.QueryWithdrawPreReq;
import com.transsnet.palmpay.credit.bean.resp.QueryWithdrawPreCheckResp;
import com.transsnet.palmpay.credit.ui.fragment.LoanCreditFragment;
import df.i;
import io.reactivex.internal.operators.observable.C1765q;
import io.reactivex.internal.operators.observable.K;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.c;
import org.jetbrains.annotations.NotNull;
import p071ef.b;
import p143jb.n;
import p143jb.o;
import p143jb.t;
import p186mb.e;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "LoanCreditService", path = "/credit_score/loan_credit_service")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/manager/LoanCreditService;", "Lcom/transsnet/palmpay/core/interfaces/ILoanCreditService;", "<init>", "()V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanCreditService implements ILoanCreditService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f28648a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return LoanCreditService.f28648a;
        }

        private a() {
        }
    }

    static {
        new a(null);
        Intrinsics.checkNotNullExpressionValue("LoanCreditService", "getSimpleName(...)");
        f28648a = "LoanCreditService";
    }

    public LoanCreditService() {
    }

    public final void a(Z z3) {
        d.h(f28648a, 3, "initCreditFragment >>> " + z3);
        new WeakReference(new e(this, z3));
    }

    @Override // com.transsnet.palmpay.core.interfaces.ILoanCreditService
    public final void checkPermission(Z fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        String str = f28648a;
        d.h(str, 3, "checkPermission >>>> " + fragmentManager);
        Lazy lazy = (Lazy) new WeakReference(new e(this, fragmentManager)).get();
        LoanCreditFragment permissionHost = lazy != null ? (LoanCreditFragment) lazy.getValue() : null;
        if (permissionHost == null) {
            d.c(str, "permissionHost is null");
            return;
        }
        t pVar = t.f38573n.getInstance();
        pVar.getClass();
        Intrinsics.checkNotNullParameter(permissionHost, "permissionHost");
        d.h("CreditRouterManagerV2", 3, "checkPermission >>>");
        d.h("CreditRouterManagerV2", 3, "registerEventBus >>>");
        o.f38542z.getInstance().i().a();
        if (!c.b().e(pVar)) {
            c.b().j(pVar);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("creditRouteType", true);
        permissionHost.setArguments(bundle);
        permissionHost.checkPermission(Boolean.TRUE);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }

    @Override // com.transsnet.palmpay.core.interfaces.ILoanCreditService
    public final void startBorrow(Z fragmentManager, String str, Long l5, Integer num, JumpLinkInfo jumpLinkInfo, String str2, Integer num2) {
        LoanCreditFragment loanCreditFragment;
        String string;
        int iIntValue;
        Integer num3 = num2;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Lazy lazy = (Lazy) new WeakReference(new e(this, fragmentManager)).get();
        if (lazy == null || (loanCreditFragment = (LoanCreditFragment) lazy.getValue()) == null) {
            return;
        }
        o jVar = o.f38542z.getInstance();
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loanCreditFragment, "loanCreditFragment");
        StringBuilder sbF = F.f("startBorrow >>> loanProduct=", str, ", borrowRoutePath=", str2, ", productSubIdOverride=");
        sbF.append(num3);
        sbF.append(", sceneSource=");
        sbF.append(num);
        d.h("CreditRouterManager", 3, sbF.toString());
        jVar.f38544b = new WeakReference(loanCreditFragment);
        jVar.f38553k = str;
        if (str2 == null || (string = StringsKt.V(str2).toString()) == null || string.length() <= 0) {
            string = null;
        }
        jVar.f38551i = string;
        if (num3 == null || num3.intValue() <= 0) {
            num3 = null;
        }
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else if (TextUtils.equals(str, "INSTALLMENT_LOAN")) {
            iIntValue = 2;
        } else {
            iIntValue = TextUtils.equals(str, "CASH_LOAN") ? 1 : 3;
        }
        boolean z3 = jumpLinkInfo != null;
        d.h("CreditRouterManager", 3, "startBorrow preCheck req >>> productSubId=" + iIntValue + ", loanAmount=" + l5 + ", loanSource=" + ((Object) 23) + ", sceneSource=" + num + ", jumpLinkInfo=" + z3 + ", mBorrowRoutePath=" + jVar.f38551i);
        df.d<QueryWithdrawPreCheckResp> dVarQueryWithdrawPreCheckV1 = G.h(p221ob.c.f40268a).queryWithdrawPreCheckV1(new QueryWithdrawPreReq(Integer.valueOf(iIntValue), l5, null, 23, str, num, TextUtils.equals(str, "INSTALLMENT_LOAN") ? 1 : null, 4, null));
        dVarQueryWithdrawPreCheckV1.getClass();
        i iVar = f.f42629b;
        C1765q c1765qI = new K(dVarQueryWithdrawPreCheckV1.k(iVar), iVar, 1).i(b.a());
        WeakReference weakReference = jVar.f38544b;
        if (weakReference != null) {
            c1765qI.c(new Y(new WeakReference((BaseFragment) weakReference.get()), 0)).subscribe(new n(jVar, str, jumpLinkInfo));
        } else {
            Intrinsics.n("mLoanCreditFragmentRef");
            throw null;
        }
    }

    @Override // com.transsnet.palmpay.core.interfaces.ILoanCreditService
    public final void startCredit(Z fragmentManager, String str, String str2, String str3) {
        LoanCreditFragment loanCreditFragment;
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Lazy lazy = (Lazy) new WeakReference(new e(this, fragmentManager)).get();
        if (lazy == null || (loanCreditFragment = (LoanCreditFragment) lazy.getValue()) == null) {
            return;
        }
        o jVar = o.f38542z.getInstance();
        if (TextUtils.isEmpty(str2)) {
            str2 = "OTHER";
        }
        o.z(jVar, loanCreditFragment, str2, str, 0, str3, 8);
    }

    public LoanCreditService(BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Z childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        a(childFragmentManager);
    }
}
