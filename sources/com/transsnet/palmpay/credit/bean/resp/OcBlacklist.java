package com.transsnet.palmpay.credit.bean.resp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcBlacklist;", "", "ableRaise", "", "blackUser", "errorMsg", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAbleRaise", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBlackUser", "getErrorMsg", "()Ljava/lang/String;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcBlacklist {

    @Nullable
    private final Boolean ableRaise;

    @Nullable
    private final Boolean blackUser;

    @Nullable
    private final String errorMsg;

    public OcBlacklist(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str) {
        this.ableRaise = bool;
        this.blackUser = bool2;
        this.errorMsg = str;
    }

    @Nullable
    public final Boolean getAbleRaise() {
        return this.ableRaise;
    }

    @Nullable
    public final Boolean getBlackUser() {
        return this.blackUser;
    }

    @Nullable
    public final String getErrorMsg() {
        return this.errorMsg;
    }
}
