package p006a4;

import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006¨\u0006\u001b"}, d2 = {"La4/b;", "", "", "blockMsg", "Ljava/lang/String;", "getBlockMsg", "()Ljava/lang/String;", "clientCfg", "getClientCfg", "", "enable", "Ljava/lang/Boolean;", "getEnable", "()Ljava/lang/Boolean;", "existsHistory", "getExistsHistory", "lastS3Url", "getLastS3Url", "", "lastTime", "Ljava/lang/Long;", "getLastTime", "()Ljava/lang/Long;", "needBlock", "getNeedBlock", "transactionId", "getTransactionId", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    @Nullable
    private final String blockMsg;

    @Nullable
    private final String clientCfg;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final Boolean existsHistory;

    @Nullable
    private final String lastS3Url;

    @Nullable
    private final Long lastTime;

    @Nullable
    private final Boolean needBlock;

    @Nullable
    private final String transactionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.blockMsg, bVar.blockMsg) && Intrinsics.c(this.clientCfg, bVar.clientCfg) && Intrinsics.c(this.enable, bVar.enable) && Intrinsics.c(this.existsHistory, bVar.existsHistory) && Intrinsics.c(this.lastS3Url, bVar.lastS3Url) && Intrinsics.c(this.lastTime, bVar.lastTime) && Intrinsics.c(this.needBlock, bVar.needBlock) && Intrinsics.c(this.transactionId, bVar.transactionId);
    }

    public final int hashCode() {
        String str = this.blockMsg;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientCfg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.enable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.existsHistory;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.lastS3Url;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l5 = this.lastTime;
        int iHashCode6 = (iHashCode5 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool3 = this.needBlock;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.transactionId;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.blockMsg;
        String str2 = this.clientCfg;
        Boolean bool = this.enable;
        Boolean bool2 = this.existsHistory;
        String str3 = this.lastS3Url;
        Long l5 = this.lastTime;
        Boolean bool3 = this.needBlock;
        String str4 = this.transactionId;
        StringBuilder sbF = F.f("FlexiBankALiFaceInitData(blockMsg=", str, ", clientCfg=", str2, ", enable=");
        sbF.append(bool);
        sbF.append(", existsHistory=");
        sbF.append(bool2);
        sbF.append(", lastS3Url=");
        sbF.append(str3);
        sbF.append(", lastTime=");
        sbF.append(l5);
        sbF.append(", needBlock=");
        sbF.append(bool3);
        sbF.append(", transactionId=");
        sbF.append(str4);
        sbF.append(")");
        return sbF.toString();
    }
}
