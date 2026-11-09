package com.transsnet.palmpay.cash_in.ui.viewmodel;

import J9.u;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/viewmodel/WithdrawDetailViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WithdrawDetailViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f27105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f27106f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f27107g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f27108i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawDetailViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f27105e = new l();
        this.f27106f = new l();
        this.f27107g = new l();
        this.f27108i = new l();
    }

    public final void d(String str) {
        f.s(this, new u(str, null), this.f27106f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
