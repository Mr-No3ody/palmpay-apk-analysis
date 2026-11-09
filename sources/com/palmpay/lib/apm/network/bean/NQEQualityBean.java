package com.palmpay.lib.apm.network.bean;

import androidx.camera.video.u;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/palmpay/lib/apm/network/bean/NQEQualityBean;", "Lcom/palmpay/lib/apm/network/bean/BaseNQEQualityBean;", "()V", "cronet", "getCronet", "()Lcom/palmpay/lib/apm/network/bean/BaseNQEQualityBean;", "setCronet", "(Lcom/palmpay/lib/apm/network/bean/BaseNQEQualityBean;)V", "okhttp", "getOkhttp", "setOkhttp", "oldSuccessRate", "", "getOldSuccessRate", "()D", "setOldSuccessRate", "(D)V", "successRateContinuousDiff", "getSuccessRateContinuousDiff", "setSuccessRateContinuousDiff", "toString", "", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NQEQualityBean extends BaseNQEQualityBean {

    @Nullable
    private BaseNQEQualityBean cronet;

    @Nullable
    private BaseNQEQualityBean okhttp;
    private double oldSuccessRate;
    private double successRateContinuousDiff;

    @Nullable
    public final BaseNQEQualityBean getCronet() {
        return this.cronet;
    }

    @Nullable
    public final BaseNQEQualityBean getOkhttp() {
        return this.okhttp;
    }

    public final double getOldSuccessRate() {
        return this.oldSuccessRate;
    }

    public final double getSuccessRateContinuousDiff() {
        return this.successRateContinuousDiff;
    }

    public final void setCronet(@Nullable BaseNQEQualityBean baseNQEQualityBean) {
        this.cronet = baseNQEQualityBean;
    }

    public final void setOkhttp(@Nullable BaseNQEQualityBean baseNQEQualityBean) {
        this.okhttp = baseNQEQualityBean;
    }

    public final void setOldSuccessRate(double d2) {
        this.oldSuccessRate = d2;
    }

    public final void setSuccessRateContinuousDiff(double d2) {
        this.successRateContinuousDiff = d2;
    }

    @Override // com.palmpay.lib.apm.network.bean.BaseNQEQualityBean
    @NotNull
    public String toString() {
        long weightedHttpRTT = getWeightedHttpRTT();
        double weightedSuccessRate = getWeightedSuccessRate();
        StringBuilder sbR = u.r(weightedHttpRTT, "NQEQualityBean(weightedHttpRTT=", ", weightedSuccessRate=");
        sbR.append(weightedSuccessRate);
        sbR.append(")");
        return sbR.toString();
    }
}
