package I3;

import C0.G;
import androidx.camera.camera2.internal.F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"LI3/c;", "", "", "token", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "memberId", "b", "", "securityAlert", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "firstLogin", "a", "palmpayPhone", "c", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    @Nullable
    private final String token = null;

    @Nullable
    private final String memberId = null;

    @Nullable
    private final Boolean securityAlert = null;

    @Nullable
    private final Boolean firstLogin = null;

    @Nullable
    private final String palmpayPhone = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getFirstLogin() {
        return this.firstLogin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPalmpayPhone() {
        return this.palmpayPhone;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getSecurityAlert() {
        return this.securityAlert;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.token, cVar.token) && Intrinsics.c(this.memberId, cVar.memberId) && Intrinsics.c(this.securityAlert, cVar.securityAlert) && Intrinsics.c(this.firstLogin, cVar.firstLogin) && Intrinsics.c(this.palmpayPhone, cVar.palmpayPhone);
    }

    public final int hashCode() {
        String str = this.token;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.securityAlert;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.firstLogin;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.palmpayPhone;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.token;
        String str2 = this.memberId;
        Boolean bool = this.securityAlert;
        Boolean bool2 = this.firstLogin;
        String str3 = this.palmpayPhone;
        StringBuilder sbF = F.f("FlexiBankAuthorizationLoginResponse(token=", str, ", memberId=", str2, ", securityAlert=");
        sbF.append(bool);
        sbF.append(", firstLogin=");
        sbF.append(bool2);
        sbF.append(", palmpayPhone=");
        return G.r(sbF, str3, ")");
    }
}
