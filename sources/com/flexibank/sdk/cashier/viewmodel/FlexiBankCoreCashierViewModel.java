package com.flexibank.sdk.cashier.viewmodel;

import K3.j;
import android.app.Application;
import com.flexibank.sdk.base.FlexiBankBaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/flexibank/sdk/cashier/viewmodel/FlexiBankCoreCashierViewModel;", "Lcom/flexibank/sdk/base/FlexiBankBaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankCoreCashierViewModel extends FlexiBankBaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f22087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f22088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f22089g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f22090i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankCoreCashierViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f22087e = new j();
        this.f22088f = new j();
        this.f22089g = new j();
        this.f22090i = new j();
    }
}
