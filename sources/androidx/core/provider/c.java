package androidx.core.provider;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f16107c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Objects.equals(this.f16105a, cVar.f16105a) && Objects.equals(this.f16106b, cVar.f16106b) && Objects.equals(this.f16107c, cVar.f16107c);
    }

    public final int hashCode() {
        return Objects.hash(this.f16105a, this.f16106b, this.f16107c);
    }
}
