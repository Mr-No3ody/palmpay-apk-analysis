package androidx.camera.video.internal.encoder;

import N8.q0;
import android.util.Size;
import androidx.camera.core.impl.P0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f14649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P0 f14650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Size f14651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Integer f14652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f14653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f14654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f14655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f14656i;

    public final d a() {
        String strJ = this.f14648a == null ? " mimeType" : "";
        if (this.f14650c == null) {
            strJ = q0.j(strJ, " inputTimebase");
        }
        if (this.f14651d == null) {
            strJ = q0.j(strJ, " resolution");
        }
        if (this.f14653f == null) {
            strJ = q0.j(strJ, " dataSpace");
        }
        if (this.f14654g == null) {
            strJ = q0.j(strJ, " frameRate");
        }
        if (this.f14656i == null) {
            strJ = q0.j(strJ, " bitrate");
        }
        if (strJ.isEmpty()) {
            return new d(this.f14648a, this.f14649b.intValue(), this.f14650c, this.f14651d, this.f14652e.intValue(), this.f14653f, this.f14654g.intValue(), this.f14655h.intValue(), this.f14656i.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }
}
