package okhttp3.internal.http2;

import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class x {
    public /* synthetic */ x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final Logger getLogger() {
        return z.f40910e;
    }

    public final int lengthWithoutPadding(int i7, int i10, int i11) throws IOException {
        if ((i10 & 8) != 0) {
            i7--;
        }
        if (i11 <= i7) {
            return i7 - i11;
        }
        throw new IOException(androidx.camera.video.u.h(i11, "PROTOCOL_ERROR padding ", i7, " > remaining length "));
    }

    private x() {
    }
}
