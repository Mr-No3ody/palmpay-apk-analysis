package Xa;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import p072eg.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f11070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicInteger f11073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicInteger f11074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicInteger f11075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11076g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f11077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f11078j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f11079o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f11080p;
    public final /* synthetic */ AtomicInteger t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f11081v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, Context context, String str, AtomicInteger atomicInteger, AtomicInteger atomicInteger2, AtomicInteger atomicInteger3, Continuation continuation) {
        super(2, continuation);
        this.f11077i = jVar;
        this.f11078j = context;
        this.f11079o = str;
        this.f11080p = atomicInteger;
        this.t = atomicInteger2;
        this.f11081v = atomicInteger3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        AtomicInteger atomicInteger = this.t;
        AtomicInteger atomicInteger2 = this.f11081v;
        return new c(this.f11077i, this.f11078j, this.f11079o, this.f11080p, atomicInteger, atomicInteger2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        Context context;
        String str;
        AtomicInteger atomicInteger;
        AtomicInteger atomicInteger2;
        AtomicInteger atomicInteger3;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11076g;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            jVar = this.f11077i;
            this.f11070a = jVar;
            context = this.f11078j;
            this.f11071b = context;
            str = this.f11079o;
            this.f11072c = str;
            AtomicInteger atomicInteger4 = this.f11080p;
            this.f11073d = atomicInteger4;
            AtomicInteger atomicInteger5 = this.t;
            this.f11074e = atomicInteger5;
            AtomicInteger atomicInteger6 = this.f11081v;
            this.f11075f = atomicInteger6;
            this.f11076g = 1;
            if (jVar.acquire(this) == aVar) {
                return aVar;
            }
            atomicInteger = atomicInteger4;
            atomicInteger2 = atomicInteger5;
            atomicInteger3 = atomicInteger6;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicInteger3 = this.f11075f;
            atomicInteger2 = this.f11074e;
            atomicInteger = this.f11073d;
            str = this.f11072c;
            context = this.f11071b;
            jVar = this.f11070a;
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        try {
            try {
                i iVar = i.f11106a;
                File filesDir = context.getFilesDir();
                Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                File fileC = p118hf.a.C(filesDir, str);
                if (fileC != null && fileC.exists() && fileC.length() > 0) {
                    F6.d.h("WebResPreloadMgr", 3, "[SKIP] already exists (" + fileC.length() + "B): " + str);
                    atomicInteger.incrementAndGet();
                    return Unit.f38893a;
                }
                byte[] bArrA = i.a(str);
                if (bArrA == null || bArrA.length == 0) {
                    F6.d.h("WebResPreloadMgr", 5, "[FAIL] empty response: " + str);
                    atomicInteger3.incrementAndGet();
                } else {
                    i.f(context, str, bArrA);
                    F6.d.h("WebResPreloadMgr", 3, "[SAVE] " + bArrA.length + "B -> " + (fileC != null ? fileC.getAbsolutePath() : null) + "  url=" + str);
                    atomicInteger2.incrementAndGet();
                }
                return Unit.f38893a;
            } catch (Exception e10) {
                F6.d.c("WebResPreloadMgr", "[ERROR] download failed: " + str, e10);
                atomicInteger3.incrementAndGet();
            }
        } finally {
            jVar.release();
        }
    }
}
