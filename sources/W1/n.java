package W1;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10452c;

    public n(long j6, long j10, long j11) {
        this.f10450a = j6;
        this.f10451b = j10;
        this.f10452c = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f10450a == nVar.f10450a && this.f10452c == nVar.f10452c && this.f10451b == nVar.f10451b;
    }

    public final int hashCode() {
        long j6 = this.f10450a;
        long j10 = this.f10451b;
        int i7 = ((((int) (j6 ^ (j6 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f10452c;
        return i7 + ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        return "Entry{firstChunk=" + this.f10450a + ", samplesPerChunk=" + this.f10451b + ", sampleDescriptionIndex=" + this.f10452c + '}';
    }
}
