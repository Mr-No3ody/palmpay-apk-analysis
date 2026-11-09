package androidx.camera.core.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: androidx.camera.core.impl.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1005t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f14130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f14131c;

    public C1005t0(boolean z3, HashSet hashSet, HashSet hashSet2) {
        this.f14129a = z3;
        this.f14130b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.f14131c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean a(Class cls, boolean z3) {
        if (this.f14130b.contains(cls)) {
            return true;
        }
        return !this.f14131c.contains(cls) && this.f14129a && z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1005t0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1005t0 c1005t0 = (C1005t0) obj;
        return this.f14129a == c1005t0.f14129a && Objects.equals(this.f14130b, c1005t0.f14130b) && Objects.equals(this.f14131c, c1005t0.f14131c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f14129a), this.f14130b, this.f14131c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f14129a + ", forceEnabledQuirks=" + this.f14130b + ", forceDisabledQuirks=" + this.f14131c + '}';
    }
}
