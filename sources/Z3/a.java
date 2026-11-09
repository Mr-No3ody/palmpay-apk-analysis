package Z3;

import C0.G;
import androidx.camera.video.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LZ3/a;", "", "", "transactionId", "Ljava/lang/String;", "getTransactionId", "()Ljava/lang/String;", "", "needFaceCompare", "Z", "getNeedFaceCompare", "()Z", "metaInfo", "getMetaInfo", "setMetaInfo", "(Ljava/lang/String;)V", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a {

    @Nullable
    private String metaInfo;
    private final boolean needFaceCompare;

    @Nullable
    private final String transactionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.transactionId, aVar.transactionId) && this.needFaceCompare == aVar.needFaceCompare && Intrinsics.c(this.metaInfo, aVar.metaInfo);
    }

    public final int hashCode() {
        String str = this.transactionId;
        int iD = u.d((str == null ? 0 : str.hashCode()) * 31, 31, this.needFaceCompare);
        String str2 = this.metaInfo;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.transactionId;
        boolean z3 = this.needFaceCompare;
        String str2 = this.metaInfo;
        StringBuilder sb2 = new StringBuilder("FlexiBankALiFaceCheckResultReq(transactionId=");
        sb2.append(str);
        sb2.append(", needFaceCompare=");
        sb2.append(z3);
        sb2.append(", metaInfo=");
        return G.r(sb2, str2, ")");
    }
}
