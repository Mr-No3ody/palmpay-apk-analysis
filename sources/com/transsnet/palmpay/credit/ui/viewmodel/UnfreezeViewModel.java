package com.transsnet.palmpay.credit.ui.viewmodel;

import Db.F;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/viewmodel/UnfreezeViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnfreezeViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f30706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f30707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f30708g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f30709i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnfreezeViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f30706e = new l();
        this.f30707f = new l();
        this.f30708g = new l();
        this.f30709i = new l();
    }

    public final void d() {
        f.s(this, new F(1, null), this.f30707f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
