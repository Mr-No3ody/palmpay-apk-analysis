package B6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0100w f389a;

    public H(EnumC0100w directive) {
        Intrinsics.checkNotNullParameter(directive, "directive");
        this.f389a = directive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H) && this.f389a == ((H) obj).f389a;
    }

    public final int hashCode() {
        return this.f389a.hashCode();
    }

    public final String toString() {
        return "Preparing(directive=" + this.f389a + ")";
    }
}
