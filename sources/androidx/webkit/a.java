package androidx.webkit;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f18288c;

    public a(String str, String str2, Set set) {
        this.f18286a = str;
        this.f18287b = str2;
        this.f18288c = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.f18286a, aVar.f18286a) && Objects.equals(this.f18287b, aVar.f18287b) && Objects.equals(this.f18288c, aVar.f18288c);
    }

    public final int hashCode() {
        return Objects.hash(this.f18286a, this.f18287b, this.f18288c);
    }
}
