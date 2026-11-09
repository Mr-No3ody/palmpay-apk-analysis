package H;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f3502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f3506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3508g;

    public c(UUID uuid, int i7, int i10, Rect rect, Size size, int i11, boolean z3) {
        if (uuid == null) {
            throw new NullPointerException("Null getUuid");
        }
        this.f3502a = uuid;
        this.f3503b = i7;
        this.f3504c = i10;
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f3505d = rect;
        if (size == null) {
            throw new NullPointerException("Null getSize");
        }
        this.f3506e = size;
        this.f3507f = i11;
        this.f3508g = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3502a.equals(cVar.f3502a) && this.f3503b == cVar.f3503b && this.f3504c == cVar.f3504c && this.f3505d.equals(cVar.f3505d) && this.f3506e.equals(cVar.f3506e) && this.f3507f == cVar.f3507f && this.f3508g == cVar.f3508g;
    }

    public final int hashCode() {
        return ((((((((((((((this.f3502a.hashCode() ^ 1000003) * 1000003) ^ this.f3503b) * 1000003) ^ this.f3504c) * 1000003) ^ this.f3505d.hashCode()) * 1000003) ^ this.f3506e.hashCode()) * 1000003) ^ this.f3507f) * 1000003) ^ (this.f3508g ? 1231 : 1237)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "OutConfig{getUuid=" + this.f3502a + ", getTargets=" + this.f3503b + ", getFormat=" + this.f3504c + ", getCropRect=" + this.f3505d + ", getSize=" + this.f3506e + ", getRotationDegrees=" + this.f3507f + ", isMirroring=" + this.f3508g + ", shouldRespectInputCropRect=false}";
    }
}
