package I3;

import C0.G;
import androidx.camera.camera2.internal.F;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.palmpay.credit.rnbridge.CreditHandleRouterBridgeV2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LI3/b;", "", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "authCode", "getAuthCode", "Lcom/flexibank/sdk/c;", CreditHandleRouterBridgeV2.ACTION_DEVICE_INFO, "Lcom/flexibank/sdk/c;", "getDeviceInfo", "()Lcom/flexibank/sdk/c;", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b {

    @NotNull
    private final String appId;

    @NotNull
    private final String authCode;

    @NotNull
    private final com.flexibank.sdk.c deviceInfo;

    public b(String authCode, com.flexibank.sdk.c deviceInfo) {
        Intrinsics.checkNotNullParameter("P260617092568177297851", RemoteConfigConstants.RequestFieldKey.APP_ID);
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.appId = "P260617092568177297851";
        this.authCode = authCode;
        this.deviceInfo = deviceInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.appId, bVar.appId) && Intrinsics.c(this.authCode, bVar.authCode) && Intrinsics.c(this.deviceInfo, bVar.deviceInfo);
    }

    public final int hashCode() {
        return this.deviceInfo.hashCode() + G.c(this.appId.hashCode() * 31, 31, this.authCode);
    }

    public final String toString() {
        String str = this.appId;
        String str2 = this.authCode;
        com.flexibank.sdk.c cVar = this.deviceInfo;
        StringBuilder sbF = F.f("FlexiBankAuthorizationLoginRequest(appId=", str, ", authCode=", str2, ", deviceInfo=");
        sbF.append(cVar);
        sbF.append(")");
        return sbF.toString();
    }
}
