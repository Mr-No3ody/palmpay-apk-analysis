package M;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5682a;

    public static long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static String b(long j6) {
        return "(" + Float.intBitsToFloat((int) (j6 >> 32)) + ", " + Float.intBitsToFloat((int) (j6 & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f5682a == ((h) obj).f5682a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5682a);
    }

    public final String toString() {
        return b(this.f5682a);
    }
}
