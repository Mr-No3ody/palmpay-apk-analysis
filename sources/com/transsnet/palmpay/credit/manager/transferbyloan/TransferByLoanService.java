package com.transsnet.palmpay.credit.manager.transferbyloan;

import android.content.Context;
import androidx.fragment.app.E;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.core.interfaces.ITransferByLoanService;
import com.transsnet.palmpay.credit.ui.activity.transferbyloan.TransferByLoanActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "TransferByLoanService", path = "/credit_score/transfer_by_loan_service")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/manager/transferbyloan/TransferByLoanService;", "Lcom/transsnet/palmpay/core/interfaces/ITransferByLoanService;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TransferByLoanService implements ITransferByLoanService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }

    @Override // com.transsnet.palmpay.core.interfaces.ITransferByLoanService
    public final boolean isTrialOpen() {
        return TransferByLoanActivity.f29927e.isActive();
    }

    @Override // com.transsnet.palmpay.core.interfaces.ITransferByLoanService
    public final void launch(E activity, TransferByLoanOpenParams params) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(params, "params");
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        TransferByLoanActivity.a aVar = TransferByLoanActivity.f29927e;
        if (aVar.isActive()) {
            return;
        }
        activity.startActivityForResult(aVar.intent(activity, params), 1002);
    }
}
