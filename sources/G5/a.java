package G5;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f3021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f3022b;

    public a(ByteBuffer byteBuffer, Long l5) {
        this.f3021a = byteBuffer;
        this.f3022b = l5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3021a.equals(aVar.f3021a)) {
            return this.f3022b.equals(aVar.f3022b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3022b.hashCode() + ((this.f3021a.hashCode() + 31) * 31);
    }
}
