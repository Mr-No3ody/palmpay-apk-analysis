package p152k5;

import N2.a;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.references.CloseableReference;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import java.nio.MappedByteBuffer;
import p032c3.b;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f38675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f38677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f38678f;

    public /* synthetic */ c(d dVar, g gVar, int[] iArr, int i7, int i10, int i11) {
        this.f38673a = i11;
        this.f38678f = dVar;
        this.f38674b = gVar;
        this.f38675c = iArr;
        this.f38676d = i7;
        this.f38677e = i10;
    }

    public boolean a(int i7, int i10) {
        CloseableReference bitmapToReuseForFrame;
        a aVar = (a) this.f38678f;
        AnimationBackend animationBackend = (AnimationBackend) this.f38675c;
        int i11 = 2;
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    try {
                        bitmapToReuseForFrame = ((b) aVar.f6064a).a(animationBackend.getIntrinsicWidth(), animationBackend.getIntrinsicHeight(), (Bitmap.Config) aVar.f6066c);
                        i11 = -1;
                    } catch (RuntimeException e10) {
                        p229p2.a.t(a.class, "Failed to create frame bitmap", e10);
                    }
                }
                return false;
            }
            bitmapToReuseForFrame = ((BitmapFrameCache) this.f38674b).getBitmapToReuseForFrame(i7, animationBackend.getIntrinsicWidth(), animationBackend.getIntrinsicHeight());
            CloseableReference closeableReference = bitmapToReuseForFrame;
            if (CloseableReference.h(closeableReference)) {
                ((O2.a) aVar.f6065b).renderFrame(i7, (Bitmap) closeableReference.f());
            }
            CloseableReference.d(closeableReference);
            if (i11 == -1) {
                return false;
            }
            return a(i7, i11);
        } catch (Throwable th) {
            CloseableReference.d(null);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38673a) {
            case 0:
                d dVar = (d) this.f38678f;
                MappedByteBuffer mappedByteBuffer = dVar.f38683e;
                g gVar = (g) this.f38674b;
                Integer num = (Integer) gVar.a(mappedByteBuffer);
                int iIntValue = (num != null ? num.intValue() : this.f38676d) + this.f38677e;
                ((int[]) this.f38675c)[0] = iIntValue;
                gVar.b(iIntValue, dVar.f38683e);
                return;
            case 1:
                d dVar2 = (d) this.f38678f;
                MappedByteBuffer mappedByteBuffer2 = dVar2.f38683e;
                g gVar2 = (g) this.f38674b;
                Integer num2 = (Integer) gVar2.a(mappedByteBuffer2);
                int iIntValue2 = (num2 != null ? num2.intValue() : this.f38676d) - this.f38677e;
                ((int[]) this.f38675c)[0] = iIntValue2;
                gVar2.b(iIntValue2, dVar2.f38683e);
                return;
            default:
                try {
                    if (((BitmapFrameCache) this.f38674b).contains(this.f38676d)) {
                        p229p2.a.o(a.class, "Frame %d is cached already.", Integer.valueOf(this.f38676d));
                        synchronized (((SparseArray) ((a) this.f38678f).f6068e)) {
                            ((SparseArray) ((a) this.f38678f).f6068e).remove(this.f38677e);
                            break;
                        }
                        return;
                    }
                    if (a(this.f38676d, 1)) {
                        p229p2.a.o(a.class, "Prepared frame frame %d.", Integer.valueOf(this.f38676d));
                    } else {
                        p229p2.a.g(a.class, "Could not prepare frame %d.", Integer.valueOf(this.f38676d));
                    }
                    synchronized (((SparseArray) ((a) this.f38678f).f6068e)) {
                        ((SparseArray) ((a) this.f38678f).f6068e).remove(this.f38677e);
                        break;
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (((SparseArray) ((a) this.f38678f).f6068e)) {
                        ((SparseArray) ((a) this.f38678f).f6068e).remove(this.f38677e);
                        throw th;
                    }
                }
        }
    }

    public c(a aVar, AnimationBackend animationBackend, BitmapFrameCache bitmapFrameCache, int i7, int i10) {
        this.f38673a = 2;
        this.f38678f = aVar;
        this.f38675c = animationBackend;
        this.f38674b = bitmapFrameCache;
        this.f38676d = i7;
        this.f38677e = i10;
    }
}
