package B;

import E.C0212q;
import E.T;
import android.content.Context;
import androidx.camera.camera2.internal.C0926f;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements CameraDeviceSurfaceManager.Provider {
    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider
    public final CameraDeviceSurfaceManager newInstance(Context context, Object obj, Set set) throws T {
        try {
            return new C0926f(context, obj, set);
        } catch (C0212q e10) {
            throw new T(e10);
        }
    }
}
