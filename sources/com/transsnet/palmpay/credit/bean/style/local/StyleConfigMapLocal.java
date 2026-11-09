package com.transsnet.palmpay.credit.bean.style.local;

import com.transsnet.palmpay.credit.bean.style.StyleConfigConstant;
import com.transsnet.palmpay.credit.bean.style.StyleConfigMap;
import com.transsnet.palmpay.credit.bean.style.local.light.AboutRepaymentInformationStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.AgentInformationStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.HavingTroubleUnlockingStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.MobileInstallmentDailyStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.MobileInstallmentFirstPayStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.MobileInstallmentStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.ProductInfoChangeStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.RepaymentManagementStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.light.VaTransferRepaymentStyleConfigLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.AboutRepaymentInformationStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.AgentInformationStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.HavingTroubleUnlockingStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.MobileInstallmentDailyStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.MobileInstallmentFirstPayStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.MobileInstallmentStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.ProductInfoChangeStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.RepaymentManagementStyleConfigNightLocal;
import com.transsnet.palmpay.credit.bean.style.local.night.VaTransferRepaymentStyleConfigNightLocal;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/local/StyleConfigMapLocal;", "Lcom/transsnet/palmpay/credit/bean/style/StyleConfigMap;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StyleConfigMapLocal extends StyleConfigMap {
    public StyleConfigMapLocal() {
        this.configMap = G.h(new Pair(StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_LOAN, new MobileInstallmentStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_DAILY, new MobileInstallmentDailyStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_FIRST_PAY, new MobileInstallmentFirstPayStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_AGENT_INFORMATION, new AgentInformationStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_ABOUT_REPAYMENT_INFORMATION, new AboutRepaymentInformationStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_VA_TRANSFER_REPAYMENT, new VaTransferRepaymentStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_HAVING_TROUBLE_UNLOCKING, new HavingTroubleUnlockingStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_REPAYMENT_MANAGEMENT, new RepaymentManagementStyleConfigLocal()), new Pair(StyleConfigConstant.CONFIG_PRODUCT_INFO_MANAGE, new ProductInfoChangeStyleConfigLocal()));
        this.configNightMap = G.h(new Pair(StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_LOAN, new MobileInstallmentStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_DAILY, new MobileInstallmentDailyStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_MOBILE_INSTALLMENT_FIRST_PAY, new MobileInstallmentFirstPayStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_AGENT_INFORMATION, new AgentInformationStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_ABOUT_REPAYMENT_INFORMATION, new AboutRepaymentInformationStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_VA_TRANSFER_REPAYMENT, new VaTransferRepaymentStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_HAVING_TROUBLE_UNLOCKING, new HavingTroubleUnlockingStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_REPAYMENT_MANAGEMENT, new RepaymentManagementStyleConfigNightLocal()), new Pair(StyleConfigConstant.CONFIG_PRODUCT_INFO_MANAGE, new ProductInfoChangeStyleConfigNightLocal()));
    }
}
