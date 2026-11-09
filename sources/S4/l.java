package S4;

import N8.q0;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8744d;

    @Override // S4.b
    public final void b(ByteBuffer byteBuffer) {
        this.f8744d = V1.a.a(byteBuffer.get());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && l.class == obj.getClass() && this.f8744d == ((l) obj).f8744d;
    }

    public final int hashCode() {
        return this.f8744d;
    }

    public final String toString() {
        return q0.m(new StringBuilder("SLConfigDescriptor{predefined="), this.f8744d, '}');
    }
}
