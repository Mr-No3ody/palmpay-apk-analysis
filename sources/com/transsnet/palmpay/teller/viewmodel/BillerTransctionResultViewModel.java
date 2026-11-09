package com.transsnet.palmpay.teller.viewmodel;

import F6.d;
import Wf.t0;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p086fe.H0;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/viewmodel/BillerTransctionResultViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerTransctionResultViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t0 f34421g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f34423j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillerTransctionResultViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34419e = new l();
        this.f34420f = new l();
        this.f34422i = new l();
        this.f34423j = new l();
    }

    public final void d(String str, String str2) {
        t0 t0Var = this.f34421g;
        if (t0Var != null && t0Var.isActive()) {
            d.h("jobGetDetail cancel", 3, new Object[0]);
            t0 t0Var2 = this.f34421g;
            if (t0Var2 != null) {
                t0Var2.cancel((CancellationException) null);
            }
        }
        this.f34421g = f.s(this, new H0(str2, str, null), this.f34422i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
