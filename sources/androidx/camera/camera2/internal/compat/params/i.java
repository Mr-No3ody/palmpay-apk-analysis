package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f13423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13426d = 1;

    public i(OutputConfiguration outputConfiguration) {
        this.f13423a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f13423a.equals(iVar.f13423a) && this.f13425c == iVar.f13425c && this.f13426d == iVar.f13426d && Objects.equals(this.f13424b, iVar.f13424b);
    }

    public final int hashCode() {
        int iHashCode = this.f13423a.hashCode() ^ 31;
        int i7 = (this.f13425c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
        int i10 = (i7 << 5) - i7;
        String str = this.f13424b;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
        return Long.hashCode(this.f13426d) ^ ((iHashCode2 << 5) - iHashCode2);
    }
}
