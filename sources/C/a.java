package C;

import C0.G;
import androidx.camera.camera2.internal.C0933i0;
import androidx.camera.camera2.internal.M;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1.d;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CameraFilter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f911c;

    public /* synthetic */ a(Object obj, int i7) {
        this.f910b = i7;
        this.f911c = obj;
    }

    @Override // androidx.camera.core.CameraFilter
    public final List filter(List list) {
        String str;
        CameraInfo cameraInfo;
        d dVarF;
        C0933i0 c0933i0;
        switch (this.f910b) {
            case 0:
                Iterator it = list.iterator();
                do {
                    boolean zHasNext = it.hasNext();
                    str = (String) this.f911c;
                    if (!zHasNext) {
                        throw new IllegalArgumentException(G.o("No camera can be find for id: ", str));
                    }
                    cameraInfo = (CameraInfo) it.next();
                    dVarF = d.f(cameraInfo);
                    c0933i0 = (C0933i0) dVarF.f41179c;
                } while (!str.equals(c0933i0 != null ? c0933i0.f13554a : ((M) dVarF.f41178b).f13228a));
                return Collections.singletonList(cameraInfo);
            default:
                return ((CameraInfoInternal) this.f911c).lambda$getCameraSelector$0(list);
        }
    }
}
