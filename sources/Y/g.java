package Y;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f11252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f11253b;

    public g(Resources resources, Resources.Theme theme) {
        this.f11252a = resources;
        this.f11253b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.f11252a.equals(gVar.f11252a) && Objects.equals(this.f11253b, gVar.f11253b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11252a, this.f11253b);
    }
}
