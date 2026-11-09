package p360y2;

import androidx.camera.video.internal.c;
import com.facebook.common.internal.Supplier;
import java.util.ArrayList;
import p213o2.e;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44051a;

    public f(ArrayList arrayList) {
        e.b(!arrayList.isEmpty(), "List of suppliers is empty!");
        this.f44051a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return e.h(this.f44051a, ((f) obj).f44051a);
        }
        return false;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        return new e(this);
    }

    public final int hashCode() {
        return this.f44051a.hashCode();
    }

    public final String toString() {
        c cVarM = e.m(this);
        cVarM.c(this.f44051a, "list");
        return cVarM.toString();
    }
}
