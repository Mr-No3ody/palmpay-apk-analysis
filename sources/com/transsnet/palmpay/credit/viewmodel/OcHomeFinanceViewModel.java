package com.transsnet.palmpay.credit.viewmodel;

import Jb.x;
import android.app.Application;
import androidx.lifecycle.F;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/viewmodel/OcHomeFinanceViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcHomeFinanceViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final l f30907A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final l f30908B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final l f30909C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final l f30910H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final l f30911L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f30912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f30913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F f30914g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f30915i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f30916j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f30917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f30918p;
    public final l t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final l f30919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l f30920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcHomeFinanceViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f30912e = new F();
        this.f30913f = new F();
        this.f30914g = new F();
        this.f30915i = new l();
        this.f30916j = new l();
        this.f30917o = new l();
        this.f30918p = new l();
        this.t = new l();
        this.f30919v = new l();
        this.f30920w = new l();
        this.f30907A = new l();
        this.f30908B = new l();
        this.f30909C = new l();
        this.f30910H = new l();
        this.f30911L = new l();
    }

    public final void d() {
        this.f30913f.k(Boolean.TRUE);
    }

    public final void e(LoanHomeDataInfo loanHomeDataInfo) {
        if (loanHomeDataInfo != null) {
            loanHomeDataInfo.normalizeHirePurchaseAboutRepayment();
        }
        this.f30912e.k(loanHomeDataInfo);
    }

    public final void f(Long l5, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (BaseApplication.hasLogin()) {
            f.s(this, new x(source, l5, null), this.f30919v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
