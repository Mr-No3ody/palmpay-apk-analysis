package com.transsnet.palmpay.teller.ui.viewhandler;

import android.app.Application;
import androidx.lifecycle.F;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/viewhandler/BillerSearchViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerSearchViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F f34379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F f34380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34381g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f34382i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillerSearchViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34379e = new F();
        this.f34380f = new F();
        this.f34381g = new l();
        this.f34382i = new l();
    }
}
