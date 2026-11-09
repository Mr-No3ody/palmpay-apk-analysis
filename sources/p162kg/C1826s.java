package p162kg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p191mg.i;

/* JADX INFO: renamed from: kg.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1826s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f38874e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f38875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f38876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f38877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f38878d;

    static {
        new r(null);
        f38874e = new long[0];
    }

    public C1826s(SerialDescriptor descriptor, i readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f38875a = descriptor;
        this.f38876b = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.f38877c = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.f38878d = f38874e;
            return;
        }
        this.f38877c = 0L;
        int i7 = (elementsCount - 1) >>> 6;
        long[] jArr = new long[i7];
        if ((elementsCount & 63) != 0) {
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            jArr[i7 - 1] = (-1) << elementsCount;
        }
        this.f38878d = jArr;
    }
}
