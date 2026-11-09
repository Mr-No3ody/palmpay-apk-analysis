package Rf;

import java.util.NoSuchElementException;
import kotlin.collections.D;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8622d;

    public e(long j6, long j10, long j11) {
        this.f8619a = j11;
        this.f8620b = j10;
        boolean z3 = false;
        if (j11 <= 0 ? j6 >= j10 : j6 <= j10) {
            z3 = true;
        }
        this.f8621c = z3;
        this.f8622d = z3 ? j6 : j10;
    }

    @Override // kotlin.collections.D
    public final long a() {
        long j6 = this.f8622d;
        if (j6 != this.f8620b) {
            this.f8622d = this.f8619a + j6;
            return j6;
        }
        if (!this.f8621c) {
            throw new NoSuchElementException();
        }
        this.f8621c = false;
        return j6;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8621c;
    }
}
