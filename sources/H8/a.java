package H8;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3743b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f3742a, aVar.f3742a) && Intrinsics.c(this.f3743b, aVar.f3743b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + G.c(this.f3742a.hashCode() * 961, 31, this.f3743b);
    }

    public final String toString() {
        return G.q("ChenosisConfig(clientId=", this.f3742a, ", clientSecret=, redirectUri=", this.f3743b, ", enablePKCE=false)");
    }
}
