package p355xf;

import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final w f43988b = new w(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f43989a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.h(this.f43989a & UnsignedBytes.MAX_VALUE, ((x) obj).f43989a & UnsignedBytes.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            return this.f43989a == ((x) obj).f43989a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f43989a);
    }

    public final String toString() {
        return String.valueOf(this.f43989a & UnsignedBytes.MAX_VALUE);
    }
}
