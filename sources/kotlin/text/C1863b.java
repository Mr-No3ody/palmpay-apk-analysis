package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: kotlin.text.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1863b implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39002a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IntRange f39005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1864c f39007f;

    public C1863b(C1864c c1864c) {
        this.f39007f = c1864c;
        int iC = kotlin.ranges.b.c(0, 0, c1864c.f39008a.length());
        this.f39003b = iC;
        this.f39004c = iC;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    public final void a() {
        Pair pair;
        int i7 = this.f39004c;
        if (i7 < 0) {
            this.f39002a = 0;
            this.f39005d = null;
            return;
        }
        C1864c c1864c = this.f39007f;
        int i10 = c1864c.f39009b;
        if (i10 > 0) {
            int i11 = this.f39006e + 1;
            this.f39006e = i11;
            if (i11 >= i10) {
                this.f39005d = new IntRange(this.f39003b, StringsKt.C(c1864c.f39008a), 1);
                this.f39004c = -1;
            } else if (i7 > c1864c.f39008a.length() && (pair = (Pair) c1864c.f39010c.invoke(c1864c.f39008a, Integer.valueOf(this.f39004c))) != null) {
                int iIntValue = ((Number) pair.f38891a).intValue();
                int iIntValue2 = ((Number) pair.f38892b).intValue();
                this.f39005d = kotlin.ranges.b.f(this.f39003b, iIntValue);
                int i12 = iIntValue + iIntValue2;
                this.f39003b = i12;
                this.f39004c = i12 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f39005d = new IntRange(this.f39003b, StringsKt.C(c1864c.f39008a), 1);
                this.f39004c = -1;
            }
        } else if (i7 > c1864c.f39008a.length()) {
            this.f39005d = new IntRange(this.f39003b, StringsKt.C(c1864c.f39008a), 1);
            this.f39004c = -1;
        } else {
            int iIntValue3 = ((Number) pair.f38891a).intValue();
            int iIntValue4 = ((Number) pair.f38892b).intValue();
            this.f39005d = kotlin.ranges.b.f(this.f39003b, iIntValue3);
            int i13 = iIntValue3 + iIntValue4;
            this.f39003b = i13;
            this.f39004c = i13 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f39002a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39002a == -1) {
            a();
        }
        return this.f39002a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f39002a == -1) {
            a();
        }
        if (this.f39002a == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f39005d;
        Intrinsics.f(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f39005d = null;
        this.f39002a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
