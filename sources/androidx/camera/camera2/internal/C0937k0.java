package androidx.camera.camera2.internal;

import E.C0216v;
import android.util.ArrayMap;
import androidx.camera.core.impl.AbstractC0999q;
import androidx.camera.core.impl.C0992m0;
import androidx.camera.core.impl.C0996o0;
import androidx.camera.core.impl.C1000q0;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.RequestProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.camera.camera2.internal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0937k0 implements RequestProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0962x0 f13574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f13575c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile androidx.camera.core.impl.H0 f13577e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13573a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f13576d = false;

    public C0937k0(C0962x0 c0962x0, ArrayList arrayList) {
        int i7 = c0962x0.f13678i;
        p118hf.a.g(i7 == 5, "CaptureSession state must be OPENED. Current state:".concat(F.k(i7)));
        this.f13574b = c0962x0;
        this.f13575c = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void a() {
        synchronized (this.f13573a) {
            try {
                List list = this.f13575c;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final void abortCaptures() {
        C0962x0 c0962x0;
        synchronized (this.f13573a) {
            try {
                if (!this.f13576d && (c0962x0 = this.f13574b) != null) {
                    c0962x0.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(RequestProcessor.Request request) {
        if (request.getTargetOutputConfigIds().isEmpty()) {
            p140j8.f.g("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: empty targetOutputConfigIds");
            return false;
        }
        Iterator<Integer> it = request.getTargetOutputConfigIds().iterator();
        if (!it.hasNext()) {
            return true;
        }
        Integer next = it.next();
        next.getClass();
        a();
        p140j8.f.g("Camera2RequestProcessor", "Unable to submit the RequestProcessor.Request: targetOutputConfigId(" + next + ") is not a valid id");
        return false;
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final int setRepeating(RequestProcessor.Request request, RequestProcessor.Callback callback) {
        synchronized (this.f13573a) {
            try {
                if (!this.f13576d && b(request) && this.f13574b != null) {
                    androidx.camera.core.impl.C0 c0 = new androidx.camera.core.impl.C0();
                    c0.f13839b.f13957c = request.getTemplateId();
                    Config parameters = request.getParameters();
                    androidx.camera.core.impl.S s3 = c0.f13839b;
                    s3.getClass();
                    s3.f13956b = C0992m0.c(parameters);
                    c0.a(new C0950r0(new C0935j0(this, request, callback, true)));
                    if (this.f13577e != null) {
                        Iterator it = this.f13577e.f13886g.f13970e.iterator();
                        while (it.hasNext()) {
                            c0.a((AbstractC0999q) it.next());
                        }
                        androidx.camera.core.impl.O0 o10 = this.f13577e.f13886g.f13972g;
                        for (String str : o10.f13941a.keySet()) {
                            c0.f13839b.f13961g.f13941a.put(str, o10.f13941a.get(str));
                        }
                    }
                    Iterator<Integer> it2 = request.getTargetOutputConfigIds().iterator();
                    if (!it2.hasNext()) {
                        return this.f13574b.h(c0.d());
                    }
                    it2.next().getClass();
                    a();
                    c0.c(null, C0216v.f2122d, -1);
                    throw null;
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final void stopRepeating() {
        C0962x0 c0962x0;
        synchronized (this.f13573a) {
            try {
                if (!this.f13576d && (c0962x0 = this.f13574b) != null) {
                    c0962x0.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final int submit(RequestProcessor.Request request, RequestProcessor.Callback callback) {
        return submit(Arrays.asList(request), callback);
    }

    @Override // androidx.camera.core.impl.RequestProcessor
    public final int submit(List list, RequestProcessor.Callback callback) {
        synchronized (this.f13573a) {
            try {
                if (!this.f13576d) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            if (this.f13574b == null) {
                                break;
                            }
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list.iterator();
                            boolean z3 = true;
                            while (it2.hasNext()) {
                                RequestProcessor.Request request = (RequestProcessor.Request) it2.next();
                                HashSet hashSet = new HashSet();
                                C0992m0.b();
                                ArrayList arrayList2 = new ArrayList();
                                C0996o0 c0996o0A = C0996o0.a();
                                int templateId = request.getTemplateId();
                                C0992m0 c0992m0C = C0992m0.c(request.getParameters());
                                C0950r0 c0950r0 = new C0950r0(new C0935j0(this, request, callback, z3));
                                if (!arrayList2.contains(c0950r0)) {
                                    arrayList2.add(c0950r0);
                                }
                                Iterator<Integer> it3 = request.getTargetOutputConfigIds().iterator();
                                while (it3.hasNext()) {
                                    it3.next().getClass();
                                    a();
                                    hashSet.add(null);
                                }
                                ArrayList arrayList3 = new ArrayList(hashSet);
                                C1000q0 c1000q0A = C1000q0.a(c0992m0C);
                                ArrayList arrayList4 = new ArrayList(arrayList2);
                                androidx.camera.core.impl.O0 o10 = androidx.camera.core.impl.O0.f13940b;
                                ArrayMap arrayMap = new ArrayMap();
                                for (String str : c0996o0A.f13941a.keySet()) {
                                    arrayMap.put(str, c0996o0A.f13941a.get(str));
                                }
                                arrayList.add(new androidx.camera.core.impl.T(arrayList3, c1000q0A, templateId, false, arrayList4, false, new androidx.camera.core.impl.O0(arrayMap), null));
                                z3 = false;
                            }
                            return this.f13574b.g(arrayList);
                        }
                    } while (b((RequestProcessor.Request) it.next()));
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
