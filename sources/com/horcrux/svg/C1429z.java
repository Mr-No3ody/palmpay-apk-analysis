package com.horcrux.svg;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.horcrux.svg.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1429z implements Provider {
    @Override // javax.inject.Provider
    public final Object get() {
        return new RenderableViewManager.MaskManager();
    }
}
