package com.transsnet.palmpay.credit.bean.style.local.light;

import N8.q0;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.style.HavingTroubleUnlockingStyleConfig;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/local/light/HavingTroubleUnlockingStyleConfigLocal;", "Lcom/transsnet/palmpay/credit/bean/style/HavingTroubleUnlockingStyleConfig;", "<init>", "()V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HavingTroubleUnlockingStyleConfigLocal extends HavingTroubleUnlockingStyleConfig {
    public HavingTroubleUnlockingStyleConfigLocal() {
        BaseStyleConfig baseStyleConfigF = q0.f("#ffffff");
        CornerRadius cornerRadius = new CornerRadius();
        cornerRadius.setTopLeft(12);
        cornerRadius.setTopRight(12);
        cornerRadius.setBottomLeft(12);
        cornerRadius.setBottomRight(12);
        baseStyleConfigF.setCornerRadius(cornerRadius);
        this.troubleUnlockingBg = baseStyleConfigF;
        TextStyleConfig textStyleConfigG = q0.g("#202046");
        textStyleConfigG.setTextSize(Float.valueOf(14.0f));
        this.troubleUnlockingTitle = textStyleConfigG;
        BaseStyleConfig baseStyleConfig = new BaseStyleConfig();
        Float fValueOf = Float.valueOf(16.0f);
        baseStyleConfig.setHeight(fValueOf);
        baseStyleConfig.setWidth(fValueOf);
        this.aboutPhoneLockIcon = baseStyleConfig;
        TextStyleConfig textStyleConfigG2 = q0.g("#6A35FF");
        Float fValueOf2 = Float.valueOf(12.0f);
        textStyleConfigG2.setTextSize(fValueOf2);
        this.aboutPhoneLock = textStyleConfigG2;
        BaseStyleConfig baseStyleConfig2 = new BaseStyleConfig();
        baseStyleConfig2.setHeight(fValueOf);
        baseStyleConfig2.setWidth(fValueOf);
        this.aboutTemporaryUnlockIcon = baseStyleConfig2;
        this.aboutTemporaryUnlock = q0.h("#6A35FF", fValueOf2);
    }
}
