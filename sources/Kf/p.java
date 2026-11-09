package Kf;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f5484c;

    public p(q qVar) {
        this.f5484c = qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f5482a == null && !this.f5483b) {
            String line = ((BufferedReader) this.f5484c.f5486b).readLine();
            this.f5482a = line;
            if (line == null) {
                this.f5483b = true;
            }
        }
        return this.f5482a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f5482a;
        this.f5482a = null;
        Intrinsics.e(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
