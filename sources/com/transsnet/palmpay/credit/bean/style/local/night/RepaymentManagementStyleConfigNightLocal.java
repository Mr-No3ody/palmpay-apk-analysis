package com.transsnet.palmpay.credit.bean.style.local.night;

import N8.q0;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.style.RepaymentManagementStyleConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/local/night/RepaymentManagementStyleConfigNightLocal;", "Lcom/transsnet/palmpay/credit/bean/style/RepaymentManagementStyleConfig;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RepaymentManagementStyleConfigNightLocal extends RepaymentManagementStyleConfig {
    public RepaymentManagementStyleConfigNightLocal() {
        BaseStyleConfig baseStyleConfigF = q0.f("#1E1E1E");
        CornerRadius cornerRadius = new CornerRadius();
        cornerRadius.setTopLeft(12);
        cornerRadius.setTopRight(12);
        cornerRadius.setBottomLeft(12);
        cornerRadius.setBottomRight(12);
        baseStyleConfigF.setCornerRadius(cornerRadius);
        this.repaymentManagementInfoBg = baseStyleConfigF;
        TextStyleConfig textStyleConfigG = q0.g("#ffffff");
        textStyleConfigG.setTextSize(Float.valueOf(14.0f));
        this.managementInfoTitle = textStyleConfigG;
        TextStyleConfig textStyleConfigG2 = q0.g("#9ca2aa");
        textStyleConfigG2.setTextSize(Float.valueOf(12.0f));
        this.managementInfoSubTitle = textStyleConfigG2;
        BaseStyleConfig baseStyleConfig = new BaseStyleConfig();
        baseStyleConfig.setHeight(Float.valueOf(42.0f));
        baseStyleConfig.setWidth(Float.valueOf(54.0f));
        this.managementInfoIcon = baseStyleConfig;
    }
}
