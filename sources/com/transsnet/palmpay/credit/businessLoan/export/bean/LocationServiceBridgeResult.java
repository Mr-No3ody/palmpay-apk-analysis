package com.transsnet.palmpay.credit.businessLoan.export.bean;

import C0.G;
import androidx.annotation.Keep;
import com.google.firebase.messaging.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationServiceBridgeResult;", "", "success", "", "action", "", "message", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "error", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getSuccess", "()Z", "getAction", "()Ljava/lang/String;", "getMessage", "getData", "()Ljava/util/Map;", "getError", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "module_business_loan_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LocationServiceBridgeResult {

    @NotNull
    private final String action;

    @Nullable
    private final Map<String, Object> data;

    @Nullable
    private final String error;

    @NotNull
    private final String message;
    private final boolean success;

    public LocationServiceBridgeResult(boolean z3, @NotNull String action, @NotNull String message, @Nullable Map<String, ? extends Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(message, "message");
        this.success = z3;
        this.action = action;
        this.message = message;
        this.data = map;
        this.error = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocationServiceBridgeResult copy$default(LocationServiceBridgeResult locationServiceBridgeResult, boolean z3, String str, String str2, Map map, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = locationServiceBridgeResult.success;
        }
        if ((i7 & 2) != 0) {
            str = locationServiceBridgeResult.action;
        }
        if ((i7 & 4) != 0) {
            str2 = locationServiceBridgeResult.message;
        }
        if ((i7 & 8) != 0) {
            map = locationServiceBridgeResult.data;
        }
        if ((i7 & 16) != 0) {
            str3 = locationServiceBridgeResult.error;
        }
        String str4 = str3;
        String str5 = str2;
        return locationServiceBridgeResult.copy(z3, str, str5, map, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Map<String, Object> component4() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final LocationServiceBridgeResult copy(boolean success, @NotNull String action, @NotNull String message, @Nullable Map<String, ? extends Object> data, @Nullable String error) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(message, "message");
        return new LocationServiceBridgeResult(success, action, message, data, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationServiceBridgeResult)) {
            return false;
        }
        LocationServiceBridgeResult locationServiceBridgeResult = (LocationServiceBridgeResult) other;
        return this.success == locationServiceBridgeResult.success && Intrinsics.c(this.action, locationServiceBridgeResult.action) && Intrinsics.c(this.message, locationServiceBridgeResult.message) && Intrinsics.c(this.data, locationServiceBridgeResult.data) && Intrinsics.c(this.error, locationServiceBridgeResult.error);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final Map<String, Object> getData() {
        return this.data;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iC = G.c(G.c(Boolean.hashCode(this.success) * 31, 31, this.action), 31, this.message);
        Map<String, Object> map = this.data;
        int iHashCode = (iC + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.error;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z3 = this.success;
        String str = this.action;
        String str2 = this.message;
        Map<String, Object> map = this.data;
        String str3 = this.error;
        StringBuilder sb2 = new StringBuilder("LocationServiceBridgeResult(success=");
        sb2.append(z3);
        sb2.append(", action=");
        sb2.append(str);
        sb2.append(", message=");
        sb2.append(str2);
        sb2.append(", data=");
        sb2.append(map);
        sb2.append(", error=");
        return G.r(sb2, str3, ")");
    }

    public /* synthetic */ LocationServiceBridgeResult(boolean z3, String str, String str2, Map map, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, str, str2, (i7 & 8) != 0 ? null : map, (i7 & 16) != 0 ? null : str3);
    }
}
