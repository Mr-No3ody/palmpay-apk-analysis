package com.transsnet.palmpay.credit.manager.bankauth;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import p204nb.q;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "LoanBankSilentAuthService", path = "/credit_score/loan_bank_silent_auth_service")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/manager/bankauth/LoanBankSilentAuthService;", "Lcom/transsnet/palmpay/core/interfaces/ILoanBankSilentAuthService;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LoanBankSilentAuthService implements ILoanBankSilentAuthService {
    @Override // com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService
    public final Object ensure(Continuation continuation) {
        return q.f39914a.b("", continuation);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public final void init(Context context) {
    }
}
