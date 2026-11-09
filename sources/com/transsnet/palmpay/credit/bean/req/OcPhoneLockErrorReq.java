package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcPhoneLockErrorReq;", "", "serviceType", "", "code", "message", "", "ptApiName", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getServiceType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCode", "getMessage", "()Ljava/lang/String;", "getPtApiName", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcPhoneLockErrorReq {

    @Nullable
    private final Integer code;

    @Nullable
    private final String message;

    @Nullable
    private final String ptApiName;

    @Nullable
    private final Integer serviceType;

    public OcPhoneLockErrorReq(@Nullable Integer num, @Nullable Integer num2, @Nullable String str, @Nullable String str2) {
        this.serviceType = num;
        this.code = num2;
        this.message = str;
        this.ptApiName = str2;
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getPtApiName() {
        return this.ptApiName;
    }

    @Nullable
    public final Integer getServiceType() {
        return this.serviceType;
    }
}
