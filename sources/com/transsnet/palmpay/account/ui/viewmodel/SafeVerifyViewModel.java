package com.transsnet.palmpay.account.ui.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/account/ui/viewmodel/SafeVerifyViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SafeVerifyViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f26439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f26440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f26441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeVerifyViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f26439e = new l();
        this.f26440f = new l();
        this.f26441g = new l();
    }
}
