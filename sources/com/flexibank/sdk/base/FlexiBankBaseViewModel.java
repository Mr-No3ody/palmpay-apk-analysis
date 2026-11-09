package com.flexibank.sdk.base;

import android.app.Application;
import androidx.lifecycle.AbstractC1193c;
import androidx.lifecycle.LifecycleObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/flexibank/sdk/base/FlexiBankBaseViewModel;", "Landroidx/lifecycle/c;", "Landroidx/lifecycle/LifecycleObserver;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FlexiBankBaseViewModel extends AbstractC1193c implements LifecycleObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankBaseViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }

    @Override // androidx.lifecycle.a0
    public final void b() {
    }
}
