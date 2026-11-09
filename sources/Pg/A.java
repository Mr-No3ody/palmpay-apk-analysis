package Pg;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f7331a = new z(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f7333c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f7332b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i7 = 0; i7 < iHighestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f7333c = atomicReferenceArr;
    }

    public static final void a(z segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (segment.f7396f != null || segment.f7397g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (segment.f7394d) {
            return;
        }
        AtomicReference atomicReference = f7333c[(int) (Thread.currentThread().getId() & (((long) f7332b) - 1))];
        z zVar = f7331a;
        z zVar2 = (z) atomicReference.getAndSet(zVar);
        if (zVar2 == zVar) {
            return;
        }
        int i7 = zVar2 != null ? zVar2.f7393c : 0;
        if (i7 >= 65536) {
            atomicReference.set(zVar2);
            return;
        }
        segment.f7396f = zVar2;
        segment.f7392b = 0;
        segment.f7393c = i7 + UserMetadata.MAX_INTERNAL_KEY_SIZE;
        atomicReference.set(segment);
    }

    public static final z b() {
        AtomicReference atomicReference = f7333c[(int) (Thread.currentThread().getId() & (((long) f7332b) - 1))];
        z zVar = f7331a;
        z zVar2 = (z) atomicReference.getAndSet(zVar);
        if (zVar2 == zVar) {
            return new z();
        }
        if (zVar2 == null) {
            atomicReference.set(null);
            return new z();
        }
        atomicReference.set(zVar2.f7396f);
        zVar2.f7396f = null;
        zVar2.f7393c = 0;
        return zVar2;
    }
}
