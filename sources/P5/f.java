package P5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6952a;

    public f(String str) {
        this.f6952a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f6952a.equalsIgnoreCase(((f) obj).f6952a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6952a.toLowerCase().hashCode();
    }

    public final String toString() {
        return this.f6952a;
    }
}
