package com.transsnet.palmpay.teller.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/resp/CheckBettingValidationResp;", "", "exists", "", "name", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "getExists", "()Ljava/lang/Boolean;", "setExists", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckBettingValidationResp {

    @Nullable
    private Boolean exists;

    @Nullable
    private String name;

    public CheckBettingValidationResp(@Nullable Boolean bool, @Nullable String str) {
        this.exists = bool;
        this.name = str;
    }

    @Nullable
    public final Boolean getExists() {
        return this.exists;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setExists(@Nullable Boolean bool) {
        this.exists = bool;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
