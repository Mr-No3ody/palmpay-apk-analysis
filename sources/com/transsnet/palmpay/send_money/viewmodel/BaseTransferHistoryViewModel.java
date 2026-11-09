package com.transsnet.palmpay.send_money.viewmodel;

import android.app.Application;
import com.transsnet.palmpay.core.base.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/viewmodel/BaseTransferHistoryViewModel;", "Lcom/transsnet/palmpay/send_money/viewmodel/TransferToBaseViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BaseTransferHistoryViewModel extends TransferToBaseViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransferHistoryViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        new l();
        new l();
    }
}
