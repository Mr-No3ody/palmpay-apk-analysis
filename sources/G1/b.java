package G1;

import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements RequestCoordinator, Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Request f2918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Request f2919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2920e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2921f = 3;

    public b(Object obj, RequestCoordinator requestCoordinator) {
        this.f2916a = obj;
        this.f2917b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.Request
    public final void begin() {
        synchronized (this.f2916a) {
            try {
                if (this.f2920e != 1) {
                    this.f2920e = 1;
                    this.f2918c.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyCleared(Request request) {
        boolean z3;
        synchronized (this.f2916a) {
            ?? r3 = this.f2917b;
            z3 = (r3 == 0 || r3.canNotifyCleared(this)) && request.equals(this.f2918c);
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyStatusChanged(Request request) {
        boolean z3;
        boolean zEquals;
        int i7;
        synchronized (this.f2916a) {
            ?? r3 = this.f2917b;
            z3 = false;
            if (r3 == 0 || r3.canNotifyStatusChanged(this)) {
                if (this.f2920e != 5) {
                    zEquals = request.equals(this.f2918c);
                } else {
                    zEquals = request.equals(this.f2919d) && ((i7 = this.f2921f) == 4 || i7 == 5);
                }
                if (zEquals) {
                    z3 = true;
                }
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canSetImage(Request request) {
        boolean z3;
        synchronized (this.f2916a) {
            ?? r3 = this.f2917b;
            z3 = r3 == 0 || r3.canSetImage(this);
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.f2916a) {
            try {
                this.f2920e = 3;
                this.f2918c.clear();
                if (this.f2921f != 3) {
                    this.f2921f = 3;
                    this.f2919d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f2916a) {
            try {
                ?? r3 = this.f2917b;
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
        synchronized (this.f2916a) {
            try {
                z3 = this.f2918c.isAnyResourceSet() || this.f2919d.isAnyResourceSet();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isCleared() {
        boolean z3;
        synchronized (this.f2916a) {
            try {
                z3 = this.f2920e == 3 && this.f2921f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z3;
        synchronized (this.f2916a) {
            try {
                z3 = this.f2920e == 4 || this.f2921f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isEquivalentTo(Request request) {
        if (request instanceof b) {
            b bVar = (b) request;
            if (this.f2918c.isEquivalentTo(bVar.f2918c) && this.f2919d.isEquivalentTo(bVar.f2919d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z3;
        synchronized (this.f2916a) {
            try {
                z3 = true;
                if (this.f2920e != 1 && this.f2921f != 1) {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void onRequestFailed(Request request) {
        synchronized (this.f2916a) {
            try {
                if (request.equals(this.f2919d)) {
                    this.f2921f = 5;
                    ?? r3 = this.f2917b;
                    if (r3 != 0) {
                        r3.onRequestFailed(this);
                    }
                    return;
                }
                this.f2920e = 5;
                if (this.f2921f != 1) {
                    this.f2921f = 1;
                    this.f2919d.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.bumptech.glide.request.RequestCoordinator, java.lang.Object] */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void onRequestSuccess(Request request) {
        synchronized (this.f2916a) {
            try {
                if (request.equals(this.f2918c)) {
                    this.f2920e = 4;
                } else if (request.equals(this.f2919d)) {
                    this.f2921f = 4;
                }
                ?? r10 = this.f2917b;
                if (r10 != 0) {
                    r10.onRequestSuccess(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.f2916a) {
            try {
                if (this.f2920e == 1) {
                    this.f2920e = 2;
                    this.f2918c.pause();
                }
                if (this.f2921f == 1) {
                    this.f2921f = 2;
                    this.f2919d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
