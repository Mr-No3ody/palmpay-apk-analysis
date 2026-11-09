package com.transsnet.palmpay.send_money.viewmodel;

import Kd.C0421v0;
import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/TradeRecordViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TradeRecordViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f34022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f34023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f34024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeRecordViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f34022e = new l();
        this.f34023f = new l();
        this.f34024g = new l();
    }

    public final void d(String str) {
        f.s(this, new C0421v0(str, null), this.f34022e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }
}
