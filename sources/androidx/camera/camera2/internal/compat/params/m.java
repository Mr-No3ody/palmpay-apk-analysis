package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputConfiguration f13431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13432b = 1;

    public m(OutputConfiguration outputConfiguration) {
        this.f13431a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equals(this.f13431a, mVar.f13431a) && this.f13432b == mVar.f13432b;
    }

    public final int hashCode() {
        int iHashCode = this.f13431a.hashCode() ^ 31;
        return Long.hashCode(this.f13432b) ^ ((iHashCode << 5) - iHashCode);
    }
}
