package com.transsnet.palmpay.account.ui.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p097g9.C1707e;
import p097g9.C1710h;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/viewmodel/AddGuardianViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddGuardianViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f26407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f26408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f26409g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f26410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f26411j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f26412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f26413p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddGuardianViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26407e = new l();
        this.f26408f = new l();
        this.f26409g = new l();
        this.f26410i = new l();
        this.f26411j = new l();
        this.f26412o = new l();
        this.f26413p = new l();
    }

    public final void d(boolean z3) {
        C1707e c1707e = new C1707e(1, null);
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.f26407e;
        lVar.f27356m = boolValueOf;
        Unit unit = Unit.f38893a;
        f.v(this, c1707e, lVar, 0L);
    }

    public final void e(SubmitGuardianReq submitGuardianReq) {
        f.s(this, new C1710h(submitGuardianReq, null), this.f26409g, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
