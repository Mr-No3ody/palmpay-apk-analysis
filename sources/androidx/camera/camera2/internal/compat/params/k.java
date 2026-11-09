package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f13428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13430c = 1;

    public k(OutputConfiguration outputConfiguration) {
        this.f13428a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f13428a, kVar.f13428a) && this.f13430c == kVar.f13430c && Objects.equals(this.f13429b, kVar.f13429b);
    }

    public final int hashCode() {
        int iHashCode = this.f13428a.hashCode() ^ 31;
        int i7 = (iHashCode << 5) - iHashCode;
        String str = this.f13429b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i7;
        return Long.hashCode(this.f13430c) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
