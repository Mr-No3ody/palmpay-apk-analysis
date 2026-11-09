package G1;

import C0.G;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements RequestCoordinator, Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f2960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Request f2961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2962e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2963f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2964g;

    public f(Object obj, RequestCoordinator requestCoordinator) {
        this.f2959b = obj;
        this.f2958a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.Request
    public final void begin() {
        synchronized (this.f2959b) {
            try {
                this.f2964g = true;
                try {
                    if (this.f2962e != 4 && this.f2963f != 1) {
                        this.f2963f = 1;
                        this.f2961d.begin();
                    }
                    if (this.f2964g && this.f2962e != 1) {
                        this.f2962e = 1;
                        this.f2960c.begin();
                    }
                    this.f2964g = false;
                } catch (Throwable th) {
                    this.f2964g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyCleared(Request request) {
        boolean z3;
        synchronized (this.f2959b) {
            try {
                ?? r3 = this.f2958a;
                z3 = (r3 == 0 || r3.canNotifyCleared(this)) && request.equals(this.f2960c) && this.f2962e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyStatusChanged(Request request) {
        boolean z3;
        synchronized (this.f2959b) {
            try {
                ?? r3 = this.f2958a;
                z3 = (r3 == 0 || r3.canNotifyStatusChanged(this)) && request.equals(this.f2960c) && !isAnyResourceSet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canSetImage(Request request) {
        boolean z3;
        synchronized (this.f2959b) {
            try {
                ?? r3 = this.f2958a;
                z3 = (r3 == 0 || r3.canSetImage(this)) && (request.equals(this.f2960c) || this.f2962e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.f2959b) {
            this.f2964g = false;
            this.f2962e = 3;
            this.f2963f = 3;
            this.f2961d.clear();
            this.f2960c.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f2959b) {
            try {
                ?? r3 = this.f2958a;
                root = r3 != 0 ? r3.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public final boolean isAnyResourceSet() {
        boolean z3;
        synchronized (this.f2959b) {
            try {
                z3 = this.f2961d.isAnyResourceSet() || this.f2960c.isAnyResourceSet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isCleared() {
        boolean z3;
        synchronized (this.f2959b) {
            z3 = this.f2962e == 3;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z3;
        synchronized (this.f2959b) {
            z3 = this.f2962e == 4;
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isEquivalentTo(Request request) {
        if (!(request instanceof f)) {
            return false;
        }
        f fVar = (f) request;
        if (this.f2960c == null) {
            if (fVar.f2960c != null) {
                return false;
            }
        } else if (!this.f2960c.isEquivalentTo(fVar.f2960c)) {
            return false;
        }
        if (this.f2961d == null) {
            return fVar.f2961d == null;
        }
        return this.f2961d.isEquivalentTo(fVar.f2961d);
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f2959b) {
            z3 = true;
            if (this.f2962e != 1) {
                z3 = false;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void onRequestFailed(Request request) {
        synchronized (this.f2959b) {
            try {
                if (!request.equals(this.f2960c)) {
                    this.f2963f = 5;
                    return;
                }
                this.f2962e = 5;
                ?? r3 = this.f2958a;
                if (r3 != 0) {
                    r3.onRequestFailed(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void onRequestSuccess(Request request) {
        synchronized (this.f2959b) {
            try {
                if (request.equals(this.f2961d)) {
                    this.f2963f = 4;
                    return;
                }
                this.f2962e = 4;
                ?? r3 = this.f2958a;
                if (r3 != 0) {
                    r3.onRequestSuccess(this);
                }
                if (!G.a(this.f2963f)) {
                    this.f2961d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.f2959b) {
            try {
                if (!G.a(this.f2963f)) {
                    this.f2963f = 2;
                    this.f2961d.pause();
                }
                if (!G.a(this.f2962e)) {
                    this.f2962e = 2;
                    this.f2960c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
