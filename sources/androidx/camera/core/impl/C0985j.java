package androidx.camera.core.impl;

import E.C0216v;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.core.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0985j extends E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC0970b0 f14086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f14087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f14088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f14089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0216v f14090e;

    public final C0987k a() {
        String strJ = this.f14086a == null ? " surface" : "";
        if (this.f14087b == null) {
            strJ = strJ.concat(" sharedSurfaces");
        }
        if (this.f14088c == null) {
            strJ = N8.q0.j(strJ, " mirrorMode");
        }
        if (this.f14089d == null) {
            strJ = N8.q0.j(strJ, " surfaceGroupId");
        }
        if (this.f14090e == null) {
            strJ = N8.q0.j(strJ, " dynamicRange");
        }
        if (strJ.isEmpty()) {
            return new C0987k(this.f14086a, this.f14087b, this.f14088c.intValue(), this.f14089d.intValue(), this.f14090e);
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }
}
