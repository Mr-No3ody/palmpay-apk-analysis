package com.transsnet.palmpay.credit.bean.style.local.light;

import N8.q0;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.style.AgentInformationStyleConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/local/light/AgentInformationStyleConfigLocal;", "Lcom/transsnet/palmpay/credit/bean/style/AgentInformationStyleConfig;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AgentInformationStyleConfigLocal extends AgentInformationStyleConfig {
    public AgentInformationStyleConfigLocal() {
        BaseStyleConfig baseStyleConfigF = q0.f("#FFFFFF");
        CornerRadius cornerRadius = new CornerRadius();
        cornerRadius.setTopLeft(12);
        cornerRadius.setTopRight(12);
        cornerRadius.setBottomLeft(12);
        cornerRadius.setBottomRight(12);
        baseStyleConfigF.setCornerRadius(cornerRadius);
        this.agentInfoBg = baseStyleConfigF;
        TextStyleConfig textStyleConfigG = q0.g("#202046");
        Float fValueOf = Float.valueOf(14.0f);
        textStyleConfigG.setTextSize(fValueOf);
        this.agentInfoTitle = textStyleConfigG;
        this.agentInfoNameTitle = q0.h("#202046", fValueOf);
        this.agentInfoName = q0.h("#202046", fValueOf);
        this.agentInfoPhoneNoTitle = q0.h("#202046", fValueOf);
        this.agentInfoPhoneNo = q0.h("#6306B2", fValueOf);
        BaseStyleConfig baseStyleConfig = new BaseStyleConfig();
        Float fValueOf2 = Float.valueOf(20.0f);
        baseStyleConfig.setHeight(fValueOf2);
        baseStyleConfig.setWidth(fValueOf2);
        this.agentInfoRowLeadingIcon = baseStyleConfig;
        BaseStyleConfig baseStyleConfig2 = new BaseStyleConfig();
        Float fValueOf3 = Float.valueOf(16.0f);
        baseStyleConfig2.setHeight(fValueOf3);
        baseStyleConfig2.setWidth(fValueOf3);
        this.agentInfoPhoneIcon = baseStyleConfig2;
    }
}
