package androidx.camera.core.impl;

import E.C0216v;
import android.util.Range;
import android.util.Size;

/* JADX INFO: renamed from: androidx.camera.core.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0991m extends K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Size f14102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0216v f14103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Range f14104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.camera.camera2.impl.b f14105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f14106e;

    public final C0993n a() {
        String strJ = this.f14102a == null ? " resolution" : "";
        if (this.f14103b == null) {
            strJ = strJ.concat(" dynamicRange");
        }
        if (this.f14104c == null) {
            strJ = N8.q0.j(strJ, " expectedFrameRateRange");
        }
        if (this.f14106e == null) {
            strJ = N8.q0.j(strJ, " zslDisabled");
        }
        if (strJ.isEmpty()) {
            return new C0993n(this.f14102a, this.f14103b, this.f14104c, this.f14105d, this.f14106e.booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }
}
