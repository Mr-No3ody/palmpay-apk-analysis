package F2;

import androidx.camera.camera2.internal.F;
import com.facebook.common.internal.Supplier;
import com.google.maps.android.BuildConfig;
import p061e3.k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2.a f2551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2556f;

    public e(f fVar, C2.a aVar, String str, Object obj, Object obj2, int i7) {
        this.f2556f = fVar;
        this.f2551a = aVar;
        this.f2552b = str;
        this.f2553c = obj;
        this.f2554d = obj2;
        this.f2555e = i7;
    }

    @Override // com.facebook.common.internal.Supplier
    public final Object get() {
        com.facebook.imagepipeline.request.c cVar;
        String str;
        f fVar = this.f2556f;
        C2.a aVar = this.f2551a;
        String str2 = this.f2552b;
        Object obj = this.f2553c;
        Object obj2 = this.f2554d;
        int i7 = this.f2555e;
        C2.b bVar = (C2.b) fVar;
        bVar.getClass();
        com.facebook.imagepipeline.request.d dVar = (com.facebook.imagepipeline.request.d) obj;
        k kVar = bVar.f1148j;
        int i10 = F.i(i7);
        if (i10 == 0) {
            cVar = com.facebook.imagepipeline.request.c.FULL_FETCH;
        } else if (i10 == 1) {
            cVar = com.facebook.imagepipeline.request.c.DISK_CACHE;
        } else {
            if (i10 != 2) {
                StringBuilder sb2 = new StringBuilder("Cache level");
                if (i7 == 1) {
                    str = "FULL_FETCH";
                } else if (i7 != 2) {
                    str = i7 != 3 ? BuildConfig.TRAVIS : "BITMAP_MEMORY_CACHE";
                } else {
                    str = "DISK_CACHE";
                }
                sb2.append(str);
                sb2.append("is not supported. ");
                throw new RuntimeException(sb2.toString());
            }
            cVar = com.facebook.imagepipeline.request.c.BITMAP_MEMORY_CACHE;
        }
        com.facebook.imagepipeline.request.c cVar2 = cVar;
        if (aVar != null) {
            synchronized (aVar) {
            }
        }
        return kVar.b(dVar, obj2, cVar2, null, str2);
    }

    public final String toString() {
        androidx.camera.video.internal.c cVarM = p213o2.e.m(this);
        cVarM.c(this.f2553c.toString(), "request");
        return cVarM.toString();
    }
}
