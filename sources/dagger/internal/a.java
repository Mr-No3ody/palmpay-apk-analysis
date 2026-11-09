package dagger.internal;

import com.google.firebase.perf.FirebasePerformance_Factory;
import dagger.Lazy;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Provider, Lazy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f35832c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile FirebasePerformance_Factory f35833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f35834b;

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f35834b;
        Object obj3 = f35832c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.f35834b;
            if (obj == obj3) {
                obj = this.f35833a.get();
                Object obj4 = this.f35834b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.f35834b = obj;
                this.f35833a = null;
            }
        }
        return obj;
    }
}
