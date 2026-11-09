package com.transsnet.palmpay.credit.bean.style.local.night;

import N8.q0;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.style.VaTransferRepaymentStyleConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/local/night/VaTransferRepaymentStyleConfigNightLocal;", "Lcom/transsnet/palmpay/credit/bean/style/VaTransferRepaymentStyleConfig;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VaTransferRepaymentStyleConfigNightLocal extends VaTransferRepaymentStyleConfig {
    public VaTransferRepaymentStyleConfigNightLocal() {
        BaseStyleConfig baseStyleConfigF = q0.f("#1E1E1E");
        CornerRadius cornerRadius = new CornerRadius();
        cornerRadius.setTopLeft(12);
        cornerRadius.setTopRight(12);
        cornerRadius.setBottomLeft(12);
        cornerRadius.setBottomRight(12);
        baseStyleConfigF.setCornerRadius(cornerRadius);
        this.vaTransferCardBg = baseStyleConfigF;
        TextStyleConfig textStyleConfigG = q0.g("#FFFFFF");
        textStyleConfigG.setTextSize(Float.valueOf(14.0f));
        this.vaTransferTitle = textStyleConfigG;
        TextStyleConfig textStyleConfigG2 = q0.g("#9CA2AA");
        Float fValueOf = Float.valueOf(12.0f);
        textStyleConfigG2.setTextSize(fValueOf);
        this.vaTransferGuideText = textStyleConfigG2;
        BaseStyleConfig baseStyleConfig = new BaseStyleConfig();
        Float fValueOf2 = Float.valueOf(16.0f);
        baseStyleConfig.setWidth(fValueOf2);
        baseStyleConfig.setHeight(fValueOf2);
        this.vaTransferGuideArrowIcon = baseStyleConfig;
        this.vaTransferDesc = q0.h("#9CA2AA", fValueOf);
        this.vaTransferAccountNumberLabel = q0.h("#FFFFFF", fValueOf);
        this.vaTransferAccountNo = q0.h("#875CFF", fValueOf);
        BaseStyleConfig baseStyleConfig2 = new BaseStyleConfig();
        baseStyleConfig2.setWidth(fValueOf2);
        baseStyleConfig2.setHeight(fValueOf2);
        this.vaTransferAccountCopyIcon = baseStyleConfig2;
        this.vaTransferAccountNameLabel = q0.h("#FFFFFF", fValueOf);
        this.vaTransferAccountName = q0.h("#FFFFFF", fValueOf);
        this.vaTransferBankNameLabel = q0.h("#FFFFFF", fValueOf);
        this.vaTransferBankName = q0.h("#FFFFFF", fValueOf);
    }
}
