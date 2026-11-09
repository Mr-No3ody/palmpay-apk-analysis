package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f13405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13406c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f13404a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O2.a f13407d = null;

    public l(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13405b = new k(cameraCharacteristics);
        } else {
            this.f13405b = new n(cameraCharacteristics);
        }
        this.f13406c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f13405b.f13411a).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f13404a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f13405b.f13411a).get(key);
                if (obj2 != null) {
                    this.f13404a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final O2.a b() {
        if (this.f13407d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                p1.d dVar = new p1.d(this.f13406c, 21);
                O2.a aVar = new O2.a();
                aVar.f6555c = new HashMap();
                aVar.f6556d = new HashMap();
                new HashMap();
                aVar.f6553a = new n(streamConfigurationMap);
                aVar.f6554b = dVar;
                this.f13407d = aVar;
            } catch (AssertionError | NullPointerException e10) {
                throw new IllegalArgumentException(e10.getMessage());
            }
        }
        return this.f13407d;
    }
}
