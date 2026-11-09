package androidx.camera.view.internal;

import androidx.camera.core.ImageCapture$ScreenFlash;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f14977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageCapture$ScreenFlash f14978b;

    public b(a aVar, ImageCapture$ScreenFlash imageCapture$ScreenFlash) {
        this.f14977a = aVar;
        this.f14978b = imageCapture$ScreenFlash;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14977a == bVar.f14977a && Objects.equals(this.f14978b, bVar.f14978b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14977a, this.f14978b);
    }
}
