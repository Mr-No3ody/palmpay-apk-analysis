package androidx.work.impl;

import V0.C0695n;
import V0.C0704x;
import V0.C0705y;
import V0.C0706z;
import V0.Q;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpecDao;
import com.facebook.cache.common.CacheKey;
import com.facebook.react.runtime.ReactHostImpl;
import com.google.firebase.remoteconfig.CustomSignals;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18355c;

    public /* synthetic */ D(int i7, Object obj, Object obj2) {
        this.f18353a = i7;
        this.f18354b = obj;
        this.f18355c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f18355c;
        Object obj2 = this.f18354b;
        switch (this.f18353a) {
            case 0:
                C c6 = (C) obj2;
                boolean z3 = c6 instanceof A;
                Q q10 = Q.f9885a;
                J j6 = (J) obj;
                String str = j6.f18374c;
                WorkSpecDao workSpecDao = j6.f18380i;
                boolean z8 = true;
                boolean z10 = false;
                if (z3) {
                    V0.A c0704x = ((A) c6).f18351a;
                    Q state = workSpecDao.getState(str);
                    j6.f18379h.g().delete(str);
                    if (state == null) {
                        z8 = false;
                    } else if (state == Q.f9886b) {
                        boolean z11 = c0704x instanceof C0706z;
                        androidx.work.impl.model.k kVar = j6.f18372a;
                        if (z11) {
                            String str2 = K.f18385a;
                            V0.C.c().getClass();
                            if (kVar.d()) {
                                j6.c();
                            } else {
                                workSpecDao.setState(Q.f9887c, str);
                                Intrinsics.f(c0704x, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
                                C0695n c0695n = ((C0706z) c0704x).f9980a;
                                Intrinsics.checkNotNullExpressionValue(c0695n, "success.outputData");
                                workSpecDao.setOutput(str, c0695n);
                                j6.f18377f.getClass();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                DependencyDao dependencyDao = j6.f18381j;
                                for (String str3 : dependencyDao.getDependentWorkIds(str)) {
                                    if (workSpecDao.getState(str3) == Q.f9889e && dependencyDao.hasCompletedAllPrerequisites(str3)) {
                                        String str4 = K.f18385a;
                                        V0.C.c().getClass();
                                        workSpecDao.setState(q10, str3);
                                        workSpecDao.setLastEnqueueTime(str3, jCurrentTimeMillis);
                                    }
                                }
                            }
                        } else if (c0704x instanceof C0705y) {
                            String str5 = K.f18385a;
                            V0.C.c().getClass();
                            j6.b(-256);
                        } else {
                            String str6 = K.f18385a;
                            V0.C.c().getClass();
                            if (kVar.d()) {
                                j6.c();
                            } else {
                                if (c0704x == null) {
                                    c0704x = new C0704x();
                                }
                                j6.d(c0704x);
                            }
                        }
                        z8 = false;
                    } else if (state.a()) {
                        z8 = false;
                    } else {
                        j6.b(-512);
                    }
                    z10 = z8;
                } else if (c6 instanceof z) {
                    j6.d(((z) c6).f18749a);
                } else {
                    if (!(c6 instanceof B)) {
                        throw new p355xf.l();
                    }
                    int i7 = ((B) c6).f18352a;
                    Q state2 = workSpecDao.getState(str);
                    if (state2 == null || state2.a()) {
                        String str7 = K.f18385a;
                        V0.C c10 = V0.C.c();
                        Objects.toString(state2);
                        c10.getClass();
                        z8 = false;
                    } else {
                        String str8 = K.f18385a;
                        V0.C c11 = V0.C.c();
                        state2.toString();
                        c11.getClass();
                        workSpecDao.setState(q10, str);
                        workSpecDao.setStopReason(str, i7);
                        workSpecDao.markWorkSpecScheduled(str, -1L);
                    }
                    z10 = z8;
                }
                return Boolean.valueOf(z10);
            case 1:
                return ReactHostImpl.reload$lambda$7((ReactHostImpl) obj2, (String) obj);
            case 2:
                return ((FirebaseRemoteConfig) obj2).lambda$setCustomSignals$8((CustomSignals) obj);
            case 3:
                return ((FirebaseRemoteConfig) obj2).lambda$setConfigSettingsAsync$5((FirebaseRemoteConfigSettings) obj);
            case 4:
                return ((ConfigCacheClient) obj2).lambda$put$0((ConfigContainer) obj);
            default:
                p045d3.d this$0 = (p045d3.d) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CacheKey key = (CacheKey) obj;
                Intrinsics.checkNotNullParameter(key, "$key");
                try {
                    this$0.f35501g.l(key);
                    this$0.f35495a.remove(key);
                    return null;
                } catch (Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "th");
                    throw th;
                }
        }
    }
}
