package com.transsnet.palmpay.managemoney.ui.fragment;

import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/fragment/OrderPreViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderPreViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.transsnet.palmpay.core.base.l f32538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.transsnet.palmpay.core.base.l f32539f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.transsnet.palmpay.core.base.l f32540g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPreViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f32538e = new com.transsnet.palmpay.core.base.l();
        this.f32539f = new com.transsnet.palmpay.core.base.l();
        this.f32540g = new com.transsnet.palmpay.core.base.l();
    }
}
