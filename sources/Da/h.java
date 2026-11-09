package Da;

import androidx.camera.video.internal.encoder.EncoderCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1754d;

    public /* synthetic */ h(EncoderCallback encoderCallback, int i7, String str, Throwable th) {
        this.f1751a = 27;
        this.f1752b = encoderCallback;
        this.f1753c = str;
        this.f1754d = th;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0145  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0147, code lost:
    
        if (r3.f14562f == r2) goto L59;
     */
    /* JADX WARN: Type inference failed for: r0v97, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Da.h.run():void");
    }

    public /* synthetic */ h(Object obj, int i7, Object obj2, Object obj3) {
        this.f1751a = i7;
        this.f1752b = obj;
        this.f1753c = obj2;
        this.f1754d = obj3;
    }

    public /* synthetic */ h(String str, String str2, int i7, Object obj) {
        this.f1751a = i7;
        this.f1753c = str;
        this.f1754d = str2;
        this.f1752b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(AtomicBoolean atomicBoolean, androidx.concurrent.futures.k kVar, Function0 function0) {
        this.f1751a = 13;
        this.f1752b = atomicBoolean;
        this.f1753c = kVar;
        this.f1754d = (kotlin.jvm.internal.o) function0;
    }
}
