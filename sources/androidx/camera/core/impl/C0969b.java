package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.camera.core.impl.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0969b extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f14016b;

    public C0969b(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f14015a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f14016b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O) {
            O o10 = (O) obj;
            if (this.f14015a.equals(((C0969b) o10).f14015a) && this.f14016b.equals(((C0969b) o10).f14016b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14015a.hashCode() ^ 1000003) * 1000003) ^ this.f14016b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f14015a + ", schedulerHandler=" + this.f14016b + "}";
    }
}
