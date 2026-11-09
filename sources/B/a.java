package B;

import E.C0211p;
import android.content.Context;
import androidx.camera.camera2.internal.C0946p;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements CameraFactory.Provider {
    @Override // androidx.camera.core.impl.CameraFactory.Provider
    public final CameraFactory newInstance(Context context, O o10, C0211p c0211p, long j6) {
        return new C0946p(context, o10, c0211p, j6);
    }
}
