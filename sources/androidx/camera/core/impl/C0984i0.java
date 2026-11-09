package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.core.impl.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0984i0 implements CameraFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14085b;

    public C0984i0(int i7) {
        this.f14085b = i7;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraInfo cameraInfo = (CameraInfo) it.next();
            p118hf.a.g(cameraInfo instanceof CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            if (cameraInfo.getLensFacing() == this.f14085b) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }
}
