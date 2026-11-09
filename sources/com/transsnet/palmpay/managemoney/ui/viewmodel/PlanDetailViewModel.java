package com.transsnet.palmpay.managemoney.ui.viewmodel;

import Qc.f0;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.managemoney.bean.req.CreateWithdrawOrderReq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/viewmodel/PlanDetailViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlanDetailViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f32781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f32782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f32783g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f32784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f32785j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l f32786o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f32787p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanDetailViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f32781e = new l();
        this.f32782f = new l();
        this.f32783g = new l();
        this.f32784i = new l();
        this.f32785j = new l();
        this.f32786o = new l();
        this.f32787p = new l();
    }

    public final void d(String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        f.s(this, new f0(new CreateWithdrawOrderReq(orderId), null), this.f32785j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
