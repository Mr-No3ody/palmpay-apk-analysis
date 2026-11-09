package Rb;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7966a;

    public a(String str) {
        this.f7966a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return Objects.equals(this.f7966a, aVar.f7966a);
    }

    public final int hashCode() {
        return Objects.hash(this.f7966a, Boolean.FALSE);
    }
}
