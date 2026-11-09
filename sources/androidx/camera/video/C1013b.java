package androidx.camera.video;

import N8.q0;
import android.util.Range;

/* JADX INFO: renamed from: androidx.camera.video.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1013b extends AbstractC1012a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Range f14575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f14576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f14577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Range f14578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f14579e;

    public final C1014c a() {
        String strJ = this.f14575a == null ? " bitrate" : "";
        if (this.f14578d == null) {
            strJ = q0.j(strJ, " sampleRate");
        }
        if (strJ.isEmpty()) {
            return new C1014c(this.f14575a, this.f14576b.intValue(), this.f14577c.intValue(), this.f14578d, this.f14579e.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }
}
