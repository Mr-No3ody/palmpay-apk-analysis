package com.palmpay.lib.apm.network.bean;

import com.transsnet.palmpay.core.bean.message.MessageEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/palmpay/lib/apm/network/bean/NetworkBadThreshold;", "", "()V", "httpRttBadThreshold", "", "getHttpRttBadThreshold", "()I", "setHttpRttBadThreshold", "(I)V", "successRateBadThreshold", "", "getSuccessRateBadThreshold", "()D", "setSuccessRateBadThreshold", "(D)V", "successRateTrendBadThreshold", "getSuccessRateTrendBadThreshold", "setSuccessRateTrendBadThreshold", "transportRttBadThreshold", "getTransportRttBadThreshold", "setTransportRttBadThreshold", "apm_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class NetworkBadThreshold {
    private int httpRttBadThreshold = 1220;
    private int transportRttBadThreshold = MessageEvent.EVENT_TO_LOAD_DRAFT;
    private double successRateBadThreshold = 0.9d;
    private double successRateTrendBadThreshold = 0.2d;

    public final int getHttpRttBadThreshold() {
        return this.httpRttBadThreshold;
    }

    public final double getSuccessRateBadThreshold() {
        return this.successRateBadThreshold;
    }

    public final double getSuccessRateTrendBadThreshold() {
        return this.successRateTrendBadThreshold;
    }

    public final int getTransportRttBadThreshold() {
        return this.transportRttBadThreshold;
    }

    public final void setHttpRttBadThreshold(int i7) {
        this.httpRttBadThreshold = i7;
    }

    public final void setSuccessRateBadThreshold(double d2) {
        this.successRateBadThreshold = d2;
    }

    public final void setSuccessRateTrendBadThreshold(double d2) {
        this.successRateTrendBadThreshold = d2;
    }

    public final void setTransportRttBadThreshold(int i7) {
        this.transportRttBadThreshold = i7;
    }
}
