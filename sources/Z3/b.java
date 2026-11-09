package Z3;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"LZ3/b;", "", "", "metaInfo", "Ljava/lang/String;", "getMetaInfo", "()Ljava/lang/String;", "", "scene", "Ljava/lang/Integer;", "getScene", "()Ljava/lang/Integer;", "phone", "getPhone", "setPhone", "(Ljava/lang/String;)V", "bizId", "getBizId", "setBizId", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    @Nullable
    private String bizId;

    @Nullable
    private final String metaInfo;

    @Nullable
    private String phone;

    @Nullable
    private final Integer scene;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.metaInfo, bVar.metaInfo) && Intrinsics.c(this.scene, bVar.scene) && Intrinsics.c(this.phone, bVar.phone) && Intrinsics.c(this.bizId, bVar.bizId);
    }

    public final int hashCode() {
        String str = this.metaInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.scene;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.metaInfo;
        Integer num = this.scene;
        String str2 = this.phone;
        String str3 = this.bizId;
        StringBuilder sb2 = new StringBuilder("FlexiBankALiFaceInitReq(metaInfo=");
        sb2.append(str);
        sb2.append(", scene=");
        sb2.append(num);
        sb2.append(", phone=");
        return G.s(sb2, str2, ", bizId=", str3, ")");
    }
}
