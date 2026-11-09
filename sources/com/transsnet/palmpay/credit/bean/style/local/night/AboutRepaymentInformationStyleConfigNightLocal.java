package com.transsnet.palmpay.credit.bean.style.local.night;

import N8.q0;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.style.AboutRepaymentInformationStyleConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/local/night/AboutRepaymentInformationStyleConfigNightLocal;", "Lcom/transsnet/palmpay/credit/bean/style/AboutRepaymentInformationStyleConfig;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AboutRepaymentInformationStyleConfigNightLocal extends AboutRepaymentInformationStyleConfig {
    public AboutRepaymentInformationStyleConfigNightLocal() {
        BaseStyleConfig baseStyleConfigF = q0.f("#1E1E1E");
        CornerRadius cornerRadius = new CornerRadius();
        cornerRadius.setTopLeft(12);
        cornerRadius.setTopRight(12);
        cornerRadius.setBottomLeft(12);
        cornerRadius.setBottomRight(12);
        baseStyleConfigF.setCornerRadius(cornerRadius);
        this.aboutRepaymentCardBg = baseStyleConfigF;
        TextStyleConfig textStyleConfigG = q0.g("#FFFFFF");
        Float fValueOf = Float.valueOf(14.0f);
        textStyleConfigG.setTextSize(fValueOf);
        this.aboutRepaymentTitle = textStyleConfigG;
        BaseStyleConfig baseStyleConfig = new BaseStyleConfig();
        Float fValueOf2 = Float.valueOf(20.0f);
        baseStyleConfig.setHeight(fValueOf2);
        baseStyleConfig.setWidth(fValueOf2);
        this.myAccountLeadingIcon = baseStyleConfig;
        this.myAccountTitle = q0.h("#FFFFFF", fValueOf);
        this.myAccountValue = q0.h("#875CFF", fValueOf);
        BaseStyleConfig baseStyleConfig2 = new BaseStyleConfig();
        Float fValueOf3 = Float.valueOf(16.0f);
        baseStyleConfig2.setHeight(fValueOf3);
        baseStyleConfig2.setWidth(fValueOf3);
        this.myAccountTrailingIcon = baseStyleConfig2;
        BaseStyleConfig baseStyleConfig3 = new BaseStyleConfig();
        baseStyleConfig3.setHeight(fValueOf2);
        baseStyleConfig3.setWidth(fValueOf2);
        this.addBankCardLeadingIcon = baseStyleConfig3;
        this.addBankCardTitle = q0.h("#FFFFFF", fValueOf);
        BaseStyleConfig baseStyleConfig4 = new BaseStyleConfig();
        baseStyleConfig4.setHeight(fValueOf3);
        baseStyleConfig4.setWidth(fValueOf3);
        this.addBankCardTrailingIcon = baseStyleConfig4;
        BaseStyleConfig baseStyleConfig5 = new BaseStyleConfig();
        baseStyleConfig5.setHeight(fValueOf2);
        baseStyleConfig5.setWidth(fValueOf2);
        this.phoneLockLeadingIcon = baseStyleConfig5;
        this.phoneLockTitle = q0.h("#FFFFFF", fValueOf);
        BaseStyleConfig baseStyleConfig6 = new BaseStyleConfig();
        baseStyleConfig6.setHeight(fValueOf3);
        baseStyleConfig6.setWidth(fValueOf3);
        this.phoneLockTrailingIcon = baseStyleConfig6;
    }
}
