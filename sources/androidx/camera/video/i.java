package androidx.camera.video;

import N8.q0;
import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class i extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p1.d f14603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Range f14604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Range f14605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f14606d;

    public final j a() {
        String strJ = this.f14603a == null ? " qualitySelector" : "";
        if (this.f14604b == null) {
            strJ = strJ.concat(" frameRate");
        }
        if (this.f14605c == null) {
            strJ = q0.j(strJ, " bitrate");
        }
        if (this.f14606d == null) {
            strJ = q0.j(strJ, " aspectRatio");
        }
        if (strJ.isEmpty()) {
            return new j(this.f14603a, this.f14604b, this.f14605c, this.f14606d.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }
}
