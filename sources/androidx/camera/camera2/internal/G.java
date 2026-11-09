package androidx.camera.camera2.internal;

import android.os.SystemClock;
import com.google.firebase.perf.util.Constants;
import face.security.device.api.FaceSecCode;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13141b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f13142c;

    public G(I i7, long j6) {
        this.f13142c = i7;
        this.f13140a = j6;
    }

    public final int a() {
        if (!this.f13142c.c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f13141b == -1) {
            this.f13141b = jUptimeMillis;
        }
        long j6 = jUptimeMillis - this.f13141b;
        if (j6 <= 120000) {
            return 1000;
        }
        if (j6 <= 300000) {
            return Constants.MAX_URL_LENGTH;
        }
        return 4000;
    }

    public final int b() {
        boolean zC = this.f13142c.c();
        long j6 = this.f13140a;
        if (zC) {
            return j6 > 0 ? Math.min((int) j6, com.adjust.sdk.Constants.THIRTY_MINUTES) : com.adjust.sdk.Constants.THIRTY_MINUTES;
        }
        return j6 > 0 ? Math.min((int) j6, FaceSecCode.SC_SUCCESS) : FaceSecCode.SC_SUCCESS;
    }
}
