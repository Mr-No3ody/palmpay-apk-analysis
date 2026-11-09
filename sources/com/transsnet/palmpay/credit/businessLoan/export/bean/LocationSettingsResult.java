package com.transsnet.palmpay.credit.businessLoan.export.bean;

import C0.G;
import N8.q0;
import androidx.annotation.Keep;
import androidx.camera.video.u;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/businessLoan/export/bean/LocationSettingsResult;", "", "success", "", "message", "", FirebaseAnalytics.Param.METHOD, "error", "attemptedMethods", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSuccess", "()Z", "getMessage", "()Ljava/lang/String;", "getMethod", "getError", "getAttemptedMethods", "()Ljava/util/List;", "toString", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "module_business_loan_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class LocationSettingsResult {

    @NotNull
    private final List<String> attemptedMethods;

    @Nullable
    private final String error;

    @NotNull
    private final String message;

    @NotNull
    private final String method;
    private final boolean success;

    public LocationSettingsResult(boolean z3, @NotNull String message, @NotNull String method, @Nullable String str, @NotNull List<String> attemptedMethods) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(attemptedMethods, "attemptedMethods");
        this.success = z3;
        this.message = message;
        this.method = method;
        this.error = str;
        this.attemptedMethods = attemptedMethods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LocationSettingsResult copy$default(LocationSettingsResult locationSettingsResult, boolean z3, String str, String str2, String str3, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z3 = locationSettingsResult.success;
        }
        if ((i7 & 2) != 0) {
            str = locationSettingsResult.message;
        }
        if ((i7 & 4) != 0) {
            str2 = locationSettingsResult.method;
        }
        if ((i7 & 8) != 0) {
            str3 = locationSettingsResult.error;
        }
        if ((i7 & 16) != 0) {
            list = locationSettingsResult.attemptedMethods;
        }
        List list2 = list;
        String str4 = str2;
        return locationSettingsResult.copy(z3, str, str4, str3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final List<String> component5() {
        return this.attemptedMethods;
    }

    @NotNull
    public final LocationSettingsResult copy(boolean success, @NotNull String message, @NotNull String method, @Nullable String error, @NotNull List<String> attemptedMethods) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(attemptedMethods, "attemptedMethods");
        return new LocationSettingsResult(success, message, method, error, attemptedMethods);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationSettingsResult)) {
            return false;
        }
        LocationSettingsResult locationSettingsResult = (LocationSettingsResult) other;
        return this.success == locationSettingsResult.success && Intrinsics.c(this.message, locationSettingsResult.message) && Intrinsics.c(this.method, locationSettingsResult.method) && Intrinsics.c(this.error, locationSettingsResult.error) && Intrinsics.c(this.attemptedMethods, locationSettingsResult.attemptedMethods);
    }

    @NotNull
    public final List<String> getAttemptedMethods() {
        return this.attemptedMethods;
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iC = G.c(G.c(Boolean.hashCode(this.success) * 31, 31, this.message), 31, this.method);
        String str = this.error;
        return this.attemptedMethods.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        boolean z3 = this.success;
        String str = this.message;
        String str2 = this.method;
        String str3 = this.error;
        List<String> list = this.attemptedMethods;
        StringBuilder sb2 = new StringBuilder("LocationSettingsResult(success=");
        sb2.append(z3);
        sb2.append(", message=");
        sb2.append(str);
        sb2.append(", method=");
        u.x(sb2, str2, ", error=", str3, ", attemptedMethods=");
        return q0.o(sb2, list, ")");
    }

    public LocationSettingsResult(boolean z3, String str, String str2, String str3, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, str, str2, (i7 & 8) != 0 ? null : str3, (i7 & 16) != 0 ? z.f38935a : list);
    }
}
