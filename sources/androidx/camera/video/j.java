package androidx.camera.video;

import android.util.Range;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Range f14782e = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f14783f = new Range(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p1.d f14784g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.d f14785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Range f14786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Range f14787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14788d;

    static {
        C1018g c1018g = l.f14795c;
        f14784g = p1.d.h(Arrays.asList(c1018g, l.f14794b, l.f14793a), new C1015d(c1018g, 1));
    }

    public j(p1.d dVar, Range range, Range range2, int i7) {
        this.f14785a = dVar;
        this.f14786b = range;
        this.f14787c = range2;
        this.f14788d = i7;
    }

    public static i a() {
        i iVar = new i();
        p1.d dVar = f14784g;
        if (dVar == null) {
            throw new NullPointerException("Null qualitySelector");
        }
        iVar.f14603a = dVar;
        Range range = f14782e;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        iVar.f14604b = range;
        Range range2 = f14783f;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        iVar.f14605c = range2;
        iVar.f14606d = -1;
        return iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f14785a.equals(jVar.f14785a) && this.f14786b.equals(jVar.f14786b) && this.f14787c.equals(jVar.f14787c) && this.f14788d == jVar.f14788d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f14785a.hashCode() ^ 1000003) * 1000003) ^ this.f14786b.hashCode()) * 1000003) ^ this.f14787c.hashCode()) * 1000003) ^ this.f14788d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoSpec{qualitySelector=");
        sb2.append(this.f14785a);
        sb2.append(", frameRate=");
        sb2.append(this.f14786b);
        sb2.append(", bitrate=");
        sb2.append(this.f14787c);
        sb2.append(", aspectRatio=");
        return C0.G.n(this.f14788d, "}", sb2);
    }
}
