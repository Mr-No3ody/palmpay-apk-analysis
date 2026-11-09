package I3;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LI3/a;", "", "", "success", "Z", "c", "()Z", "", "authCode", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "errorCode", "b", "errorMessage", "getErrorMessage", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    @Nullable
    private final String authCode;

    @Nullable
    private final String errorCode;

    @Nullable
    private final String errorMessage;
    private final boolean success;

    public a(String str, int i7, String str2, boolean z3, String str3) {
        str = (i7 & 2) != 0 ? null : str;
        str2 = (i7 & 4) != 0 ? null : str2;
        str3 = (i7 & 8) != 0 ? null : str3;
        this.success = z3;
        this.authCode = str;
        this.errorCode = str2;
        this.errorMessage = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAuthCode() {
        return this.authCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.success == aVar.success && Intrinsics.c(this.authCode, aVar.authCode) && Intrinsics.c(this.errorCode, aVar.errorCode) && Intrinsics.c(this.errorMessage, aVar.errorMessage);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.success) * 31;
        String str = this.authCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        boolean z3 = this.success;
        String str = this.authCode;
        String str2 = this.errorCode;
        String str3 = this.errorMessage;
        StringBuilder sb2 = new StringBuilder("FlexiBankAuthCodeResult(success=");
        sb2.append(z3);
        sb2.append(", authCode=");
        sb2.append(str);
        sb2.append(", errorCode=");
        return G.s(sb2, str2, ", errorMessage=", str3, ")");
    }
}
