package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.transsnet.palmpay.credit.export.OkCardModuleImpl;
import com.transsnet.palmpay.credit.manager.LoanCreditService;
import com.transsnet.palmpay.credit.manager.bankauth.LoanBankSilentAuthService;
import com.transsnet.palmpay.credit.manager.transferbyloan.TransferByLoanService;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Providers$$module_flexi_impl implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        RouteType routeType = RouteType.PROVIDER;
        map.put("com.transsnet.palmpay.core.interfaces.ILoanBankSilentAuthService", RouteMeta.build(routeType, LoanBankSilentAuthService.class, "/credit_score/loan_bank_silent_auth_service", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("com.transsnet.palmpay.core.interfaces.ILoanCreditService", RouteMeta.build(routeType, LoanCreditService.class, "/credit_score/loan_credit_service", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("com.transsnet.palmpay.core.provider.IOkCardModule", RouteMeta.build(routeType, OkCardModuleImpl.class, "/credit_score/provier", "credit_score", null, -1, Integer.MIN_VALUE));
        map.put("com.transsnet.palmpay.core.interfaces.ITransferByLoanService", RouteMeta.build(routeType, TransferByLoanService.class, "/credit_score/transfer_by_loan_service", "credit_score", null, -1, Integer.MIN_VALUE));
    }
}
