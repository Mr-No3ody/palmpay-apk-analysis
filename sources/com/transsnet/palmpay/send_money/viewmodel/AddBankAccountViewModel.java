package com.transsnet.palmpay.send_money.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/AddBankAccountViewModel;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AddBankAccountViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f33961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f33962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f33963g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f33964i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddBankAccountViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.f33961e = new l();
        this.f33962f = new l();
        this.f33963g = new l();
        this.f33964i = new l();
    }
}
