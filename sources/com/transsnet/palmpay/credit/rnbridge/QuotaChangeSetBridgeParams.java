package com.transsnet.palmpay.credit.rnbridge;

import N8.q0;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/rnbridge/QuotaChangeSetBridgeParams;", "", "quota_change_data", "", "<init>", "(Ljava/lang/String;)V", "getQuota_change_data", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class QuotaChangeSetBridgeParams {

    @Nullable
    private final String quota_change_data;

    public QuotaChangeSetBridgeParams(@Nullable String str) {
        this.quota_change_data = str;
    }

    public static /* synthetic */ QuotaChangeSetBridgeParams copy$default(QuotaChangeSetBridgeParams quotaChangeSetBridgeParams, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = quotaChangeSetBridgeParams.quota_change_data;
        }
        return quotaChangeSetBridgeParams.copy(str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuota_change_data() {
        return this.quota_change_data;
    }

    @NotNull
    public final QuotaChangeSetBridgeParams copy(@Nullable String quota_change_data) {
        return new QuotaChangeSetBridgeParams(quota_change_data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuotaChangeSetBridgeParams) && Intrinsics.c(this.quota_change_data, ((QuotaChangeSetBridgeParams) other).quota_change_data);
    }

    @Nullable
    public final String getQuota_change_data() {
        return this.quota_change_data;
    }

    public int hashCode() {
        String str = this.quota_change_data;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return q0.k("QuotaChangeSetBridgeParams(quota_change_data=", this.quota_change_data, ")");
    }
}
