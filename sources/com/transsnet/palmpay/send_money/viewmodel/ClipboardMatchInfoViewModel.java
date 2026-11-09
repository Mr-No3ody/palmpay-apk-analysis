package com.transsnet.palmpay.send_money.viewmodel;

import Kd.C0370e;
import Wf.t0;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/ClipboardMatchInfoViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClipboardMatchInfoViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f33965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f33966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardMatchInfoViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f33965e = new l();
    }

    @Override // com.transsnet.palmpay.core.base.BaseViewModel, androidx.lifecycle.a0
    public final void b() {
        d();
    }

    public final void d() {
        t0 t0Var = this.f33966f;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        this.f33966f = null;
    }

    public final void e(String accountNo) {
        Intrinsics.checkNotNullParameter(accountNo, "accountNo");
        t0 t0Var = this.f33966f;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
        l lVar = this.f33965e;
        lVar.f27356m = accountNo;
        this.f33966f = f.v(this, new C0370e(accountNo, null), lVar, 0L);
    }
}
