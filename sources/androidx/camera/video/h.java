package androidx.camera.video;

import androidx.camera.core.impl.X;
import com.google.maps.android.BuildConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f14598c = new h(0, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f14599d = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final X f14600e = new X(new h(0, 1));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14602b;

    public h(int i7, int i10) {
        this.f14601a = i7;
        if (i10 == 0) {
            throw new NullPointerException("Null streamState");
        }
        this.f14602b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f14601a == hVar.f14601a && androidx.camera.camera2.internal.F.a(this.f14602b, hVar.f14602b);
    }

    public final int hashCode() {
        return (((this.f14601a ^ 1000003) * 1000003) ^ androidx.camera.camera2.internal.F.i(this.f14602b)) * 1000003;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("StreamInfo{id=");
        sb2.append(this.f14601a);
        sb2.append(", streamState=");
        int i7 = this.f14602b;
        if (i7 != 1) {
            str = i7 != 2 ? BuildConfig.TRAVIS : "INACTIVE";
        } else {
            str = "ACTIVE";
        }
        sb2.append(str);
        sb2.append(", inProgressTransformationInfo=null}");
        return sb2.toString();
    }
}
