package com.transsnet.palmpay.send_money.viewmodel;

import Kd.C0433z0;
import Wf.t0;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/TransferAddBankAccountViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferAddBankAccountViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34029g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t0 f34031j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferAddBankAccountViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34027e = new l();
        this.f34028f = new l();
        this.f34029g = new l();
        new l();
        this.f34030i = new l();
    }

    public final void d() {
        t0 t0Var = this.f34031j;
        if (t0Var == null || !t0Var.isActive()) {
            this.f34031j = f.s(this, new C0433z0(1, null), this.f34030i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }
}
