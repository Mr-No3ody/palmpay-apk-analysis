package androidx.webkit.internal;

import android.os.CancellationSignal;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;
import androidx.webkit.OutcomeReceiverCompat;
import androidx.webkit.Profile;
import java.lang.reflect.InvocationHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.OriginMatchedHeaderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Profile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProfileBoundaryInterface f18301a;

    public h(ProfileBoundaryInterface profileBoundaryInterface) {
        this.f18301a = profileBoundaryInterface;
    }

    public final HashSet a(String str, String str2) {
        HashSet hashSet = new HashSet();
        Iterator<InvocationHandler> it = this.f18301a.getOriginMatchedHeaders(str, str2).iterator();
        while (it.hasNext()) {
            OriginMatchedHeaderBoundaryInterface originMatchedHeaderBoundaryInterface = (OriginMatchedHeaderBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(OriginMatchedHeaderBoundaryInterface.class, it.next());
            hashSet.add(new androidx.webkit.a(originMatchedHeaderBoundaryInterface.getName(), originMatchedHeaderBoundaryInterface.getValue(), originMatchedHeaderBoundaryInterface.getRules()));
        }
        return hashSet;
    }

    @Override // androidx.webkit.Profile
    public final void addCustomHeader(androidx.webkit.a aVar) {
        if (!o.f18323p.b()) {
            throw o.a();
        }
        this.f18301a.addOriginMatchedHeader(aVar.f18286a, aVar.f18287b, aVar.f18288c);
    }

    @Override // androidx.webkit.Profile
    public final void addQuicHints(Set set) {
        if (!o.f18325r.b()) {
            throw o.a();
        }
        this.f18301a.addQuicHints(set);
    }

    @Override // androidx.webkit.Profile
    public final void clearAllCustomHeaders() {
        if (!o.f18323p.b()) {
            throw o.a();
        }
        this.f18301a.clearAllOriginMatchedHeaders();
    }

    @Override // androidx.webkit.Profile
    public final void clearAllOriginMatchedHeaders() {
        if (!o.f18322o.b()) {
            throw o.a();
        }
        this.f18301a.clearAllOriginMatchedHeaders();
    }

    @Override // androidx.webkit.Profile
    public final void clearCustomHeader(String str) {
        if (!o.f18323p.b()) {
            throw o.a();
        }
        this.f18301a.clearOriginMatchedHeader(str, null);
    }

    @Override // androidx.webkit.Profile
    public final void clearOriginMatchedHeader(String str) {
        if (!o.f18322o.b()) {
            throw o.a();
        }
        this.f18301a.clearOriginMatchedHeader(str);
    }

    @Override // androidx.webkit.Profile
    public final void clearPrefetchAsync(String str, Executor executor, OutcomeReceiverCompat outcomeReceiverCompat) {
        if (!o.f18315h.b()) {
            throw o.a();
        }
        this.f18301a.clearPrefetch(str, executor, new org.chromium.support_lib_boundary.util.a(new g(outcomeReceiverCompat)));
    }

    @Override // androidx.webkit.Profile
    public final CookieManager getCookieManager() {
        if (o.f18314g.b()) {
            return this.f18301a.getCookieManager();
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders() {
        if (o.f18323p.b()) {
            return a(null, null);
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final GeolocationPermissions getGeolocationPermissions() {
        if (o.f18314g.b()) {
            return this.f18301a.getGeoLocationPermissions();
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final String getName() {
        if (o.f18314g.b()) {
            return this.f18301a.getName();
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final ServiceWorkerController getServiceWorkerController() {
        if (o.f18314g.b()) {
            return this.f18301a.getServiceWorkerController();
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final WebStorage getWebStorage() {
        if (o.f18314g.b()) {
            return this.f18301a.getWebStorage();
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final boolean hasCustomHeader(String str) {
        if (o.f18323p.b()) {
            return this.f18301a.hasOriginMatchedHeader(str);
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final boolean hasOriginMatchedHeader(String str) {
        if (o.f18322o.b()) {
            return this.f18301a.hasOriginMatchedHeader(str);
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final void preconnect(String str) {
        if (!o.f18324q.b()) {
            throw o.a();
        }
        this.f18301a.preconnect(str);
    }

    @Override // androidx.webkit.Profile
    public final void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, androidx.webkit.g gVar, OutcomeReceiverCompat outcomeReceiverCompat) {
        if (!o.f18315h.b()) {
            throw o.a();
        }
        this.f18301a.prefetchUrl(str, cancellationSignal, executor, new org.chromium.support_lib_boundary.util.a(new j()), new org.chromium.support_lib_boundary.util.a(new g(outcomeReceiverCompat)));
    }

    @Override // androidx.webkit.Profile
    public final void setOriginMatchedHeader(String str, String str2, Set set) {
        if (!o.f18322o.b()) {
            throw o.a();
        }
        this.f18301a.setOriginMatchedHeader(str, str2, set);
    }

    @Override // androidx.webkit.Profile
    public final void setSpeculativeLoadingConfig(androidx.webkit.f fVar) {
        if (!o.f18318k.b()) {
            throw o.a();
        }
        this.f18301a.setSpeculativeLoadingConfig(new org.chromium.support_lib_boundary.util.a(new i()));
    }

    @Override // androidx.webkit.Profile
    public final void warmUpRendererProcess() {
        if (!o.f18321n.b()) {
            throw o.a();
        }
        this.f18301a.warmUpRendererProcess();
    }

    @Override // androidx.webkit.Profile
    public final void clearCustomHeader(String str, String str2) {
        if (o.f18323p.b()) {
            this.f18301a.clearOriginMatchedHeader(str, str2);
            return;
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders(String str) {
        if (o.f18323p.b()) {
            return a(str, null);
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final Set getCustomHeaders(String str, String str2) {
        if (o.f18323p.b()) {
            return a(str, str2);
        }
        throw o.a();
    }

    @Override // androidx.webkit.Profile
    public final void prefetchUrlAsync(String str, CancellationSignal cancellationSignal, Executor executor, OutcomeReceiverCompat outcomeReceiverCompat) {
        if (o.f18315h.b()) {
            this.f18301a.prefetchUrl(str, cancellationSignal, executor, new org.chromium.support_lib_boundary.util.a(new g(outcomeReceiverCompat)));
            return;
        }
        throw o.a();
    }
}
