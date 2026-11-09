package com.transsnet.palmpay.send_money.bean.resp.kkcar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarAuthInfoRsp;", "", "authStatus", "", "<init>", "(Ljava/lang/Integer;)V", "getAuthStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/transsnet/palmpay/send_money/bean/resp/kkcar/KkCarAuthInfoRsp;", "equals", "", "other", "hashCode", "toString", "", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class KkCarAuthInfoRsp {

    @Nullable
    private final Integer authStatus;

    /* JADX WARN: Multi-variable type inference failed */
    public KkCarAuthInfoRsp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KkCarAuthInfoRsp copy$default(KkCarAuthInfoRsp kkCarAuthInfoRsp, Integer num, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = kkCarAuthInfoRsp.authStatus;
        }
        return kkCarAuthInfoRsp.copy(num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getAuthStatus() {
        return this.authStatus;
    }

    @NotNull
    public final KkCarAuthInfoRsp copy(@Nullable Integer authStatus) {
        return new KkCarAuthInfoRsp(authStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KkCarAuthInfoRsp) && Intrinsics.c(this.authStatus, ((KkCarAuthInfoRsp) other).authStatus);
    }

    @Nullable
    public final Integer getAuthStatus() {
        return this.authStatus;
    }

    public int hashCode() {
        Integer num = this.authStatus;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        return "KkCarAuthInfoRsp(authStatus=" + this.authStatus + ")";
    }

    public KkCarAuthInfoRsp(@Nullable Integer num) {
        this.authStatus = num;
    }

    public /* synthetic */ KkCarAuthInfoRsp(Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num);
    }
}
