package Z3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LZ3/e;", "", "", "bussinessType", "I", "getBussinessType", "()I", "", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class e {
    private final int bussinessType;

    @NotNull
    private final String status;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.bussinessType == eVar.bussinessType && Intrinsics.c(this.status, eVar.status);
    }

    public final int hashCode() {
        return this.status.hashCode() + (Integer.hashCode(this.bussinessType) * 31);
    }

    public final String toString() {
        return "FlexiBankMemberLabelReq(bussinessType=" + this.bussinessType + ", status=" + this.status + ")";
    }
}
