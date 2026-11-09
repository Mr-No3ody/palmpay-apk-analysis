package com.google.android.gms.internal.measurement;

import androidx.camera.video.u;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zzacy extends IOException {
    public zzacy() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzacy(long j6, long j10, int i7, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbR = u.r(j6, "Pos: ", ", limit: ");
        sbR.append(j10);
        sbR.append(", len: ");
        sbR.append(i7);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbR.toString()), th);
    }

    public zzacy(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
