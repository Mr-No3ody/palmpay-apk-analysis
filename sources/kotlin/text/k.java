package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39028e;

    public k(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.f39024a = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i10;
        int i11 = this.f39025b;
        if (i11 != 0) {
            return i11 == 1;
        }
        if (this.f39028e < 0) {
            this.f39025b = 2;
            return false;
        }
        String str = this.f39024a;
        int length = str.length();
        int length2 = str.length();
        for (int i12 = this.f39026c; i12 < length2; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i7 = (cCharAt == '\r' && (i10 = i12 + 1) < str.length() && str.charAt(i10) == '\n') ? 2 : 1;
                length = i12;
                this.f39025b = 1;
                this.f39028e = i7;
                this.f39027d = length;
                return true;
            }
        }
        i7 = -1;
        this.f39025b = 1;
        this.f39028e = i7;
        this.f39027d = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f39025b = 0;
        int i7 = this.f39027d;
        int i10 = this.f39026c;
        this.f39026c = this.f39028e + i7;
        return this.f39024a.subSequence(i10, i7).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
