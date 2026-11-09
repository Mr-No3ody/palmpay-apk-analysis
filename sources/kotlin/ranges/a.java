package kotlin.ranges;

import Hf.c;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Rf.a f38976d = new Rf.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38979c;

    public a(int i7, int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f38977a = i7;
        this.f38978b = c.a(i7, i10, i11);
        this.f38979c = i11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f38977a == aVar.f38977a && this.f38978b == aVar.f38978b && this.f38979c == aVar.f38979c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f38977a * 31) + this.f38978b) * 31) + this.f38979c;
    }

    public boolean isEmpty() {
        int i7 = this.f38979c;
        int i10 = this.f38978b;
        int i11 = this.f38977a;
        if (i7 > 0) {
            return i11 > i10;
        }
        return i11 < i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Rf.b(this.f38977a, this.f38978b, this.f38979c);
    }

    public String toString() {
        StringBuilder sb2;
        int i7 = this.f38978b;
        int i10 = this.f38977a;
        int i11 = this.f38979c;
        if (i11 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append("..");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(i11);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(" downTo ");
            sb2.append(i7);
            sb2.append(" step ");
            sb2.append(-i11);
        }
        return sb2.toString();
    }
}
