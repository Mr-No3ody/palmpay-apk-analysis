package androidx.camera.core.impl.utils;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enumeration f14223a;

    public h(i iVar) {
        this.f14223a = Collections.enumeration(iVar.f14228a);
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f14223a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return new HashMap((Map) this.f14223a.nextElement());
    }
}
