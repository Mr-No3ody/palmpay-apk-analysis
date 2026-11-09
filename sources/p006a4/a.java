package p006a4;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"La4/a;", "", "", "s3Url", "Ljava/lang/String;", "getS3Url", "()Ljava/lang/String;", "token", "b", "similarity", "getSimilarity", "errorMsg", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    @Nullable
    private final String errorMsg;

    @Nullable
    private final String s3Url;

    @Nullable
    private final String similarity;

    @Nullable
    private final String token;

    public a(String str, String str2, String str3, String str4) {
        this.s3Url = str;
        this.token = str2;
        this.similarity = str3;
        this.errorMsg = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.s3Url, aVar.s3Url) && Intrinsics.c(this.token, aVar.token) && Intrinsics.c(this.similarity, aVar.similarity) && Intrinsics.c(this.errorMsg, aVar.errorMsg);
    }

    public final int hashCode() {
        String str = this.s3Url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.token;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.similarity;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorMsg;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.s3Url;
        String str2 = this.token;
        return G.s(F.f("FlexiBankALiFaceCheckResultData(s3Url=", str, ", token=", str2, ", similarity="), this.similarity, ", errorMsg=", this.errorMsg, ")");
    }
}
