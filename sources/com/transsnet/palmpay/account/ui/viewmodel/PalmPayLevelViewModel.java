package com.transsnet.palmpay.account.ui.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p097g9.M;
import p097g9.N;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/viewmodel/PalmPayLevelViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmPayLevelViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f26430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f26431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f26432g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f26433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f26434j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f26435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f26436p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalmPayLevelViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26430e = new l();
        this.f26431f = new l();
        this.f26432g = new l();
        this.f26433i = new l();
        this.f26434j = new l();
        this.f26435o = new l();
        this.f26436p = new l();
    }

    public final void d(boolean z3) {
        M m7 = new M(1, null);
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.f26431f;
        lVar.f27356m = boolValueOf;
        Unit unit = Unit.f38893a;
        f.v(this, m7, lVar, 0L);
    }

    public final void e(boolean z3) {
        N n10 = new N(1, null);
        Boolean boolValueOf = Boolean.valueOf(z3);
        l lVar = this.f26430e;
        lVar.f27356m = boolValueOf;
        Unit unit = Unit.f38893a;
        f.v(this, n10, lVar, 0L);
    }
}
