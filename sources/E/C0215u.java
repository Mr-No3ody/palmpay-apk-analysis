package E;

import androidx.camera.core.impl.CaptureBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: E.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0215u implements CaptureBundle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2120a;

    public C0215u(List list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
        }
        this.f2120a = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // androidx.camera.core.impl.CaptureBundle
    public final List getCaptureStages() {
        return this.f2120a;
    }
}
