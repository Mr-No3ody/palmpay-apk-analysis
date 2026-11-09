package S4;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f8745d;

    static {
        Logger.getLogger(m.class.getName());
    }

    @Override // S4.b
    public final void b(ByteBuffer byteBuffer) {
        this.f8745d = (ByteBuffer) byteBuffer.slice().limit(this.f8714b);
    }

    public final String toString() {
        return "UnknownDescriptor{tag=" + this.f8713a + ", sizeOfInstance=" + this.f8714b + ", data=" + this.f8745d + '}';
    }
}
