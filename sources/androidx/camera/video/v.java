package androidx.camera.video;

import E.C0216v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class v implements VideoCapabilities {
    @Override // androidx.camera.video.VideoCapabilities
    public final Set getSupportedDynamicRanges() {
        return new HashSet();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final List getSupportedQualities(C0216v c0216v) {
        return new ArrayList();
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isQualitySupported(l lVar, C0216v c0216v) {
        return false;
    }

    @Override // androidx.camera.video.VideoCapabilities
    public final boolean isStabilizationSupported() {
        return false;
    }
}
