package C6;

import E.C0211p;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0211p f1163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1164b;

    public d(C0211p camSelector, ArrayList qualities) {
        Intrinsics.checkNotNullParameter(camSelector, "camSelector");
        Intrinsics.checkNotNullParameter(qualities, "qualities");
        this.f1163a = camSelector;
        this.f1164b = qualities;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f1163a.equals(dVar.f1163a) && this.f1164b.equals(dVar.f1164b);
    }

    public final int hashCode() {
        return this.f1164b.hashCode() + (this.f1163a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraCapability(camSelector=" + this.f1163a + ", qualities=" + this.f1164b + ")";
    }
}
