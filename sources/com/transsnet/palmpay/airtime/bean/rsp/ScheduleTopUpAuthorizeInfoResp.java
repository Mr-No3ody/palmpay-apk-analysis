package com.transsnet.palmpay.airtime.bean.rsp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpAuthorizeInfoResp;", "", "<init>", "()V", "authorityStatus", "", "getAuthorityStatus", "()Ljava/lang/Boolean;", "setAuthorityStatus", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "authorityUrl", "", "getAuthorityUrl", "()Ljava/lang/String;", "setAuthorityUrl", "(Ljava/lang/String;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScheduleTopUpAuthorizeInfoResp {

    @Nullable
    private Boolean authorityStatus;

    @Nullable
    private String authorityUrl;

    @Nullable
    public final Boolean getAuthorityStatus() {
        return this.authorityStatus;
    }

    @Nullable
    public final String getAuthorityUrl() {
        return this.authorityUrl;
    }

    public final void setAuthorityStatus(@Nullable Boolean bool) {
        this.authorityStatus = bool;
    }

    public final void setAuthorityUrl(@Nullable String str) {
        this.authorityUrl = str;
    }
}
