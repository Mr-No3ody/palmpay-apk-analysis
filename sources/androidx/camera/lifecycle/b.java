package androidx.camera.lifecycle;

import E.q0;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14518a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f14519b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f14520c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f14521d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CameraCoordinator f14522e;

    public final void a(LifecycleCamera lifecycleCamera, q0 q0Var, List list, Collection collection, CameraCoordinator cameraCoordinator) {
        synchronized (this.f14518a) {
            try {
                p118hf.a.f(!collection.isEmpty());
                this.f14522e = cameraCoordinator;
                LifecycleOwner lifecycleOwnerA = lifecycleCamera.a();
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(lifecycleOwnerA);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                Set set = (Set) this.f14520c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC);
                CameraCoordinator cameraCoordinator2 = this.f14522e;
                if (cameraCoordinator2 == null || cameraCoordinator2.getCameraOperatingMode() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        LifecycleCamera lifecycleCamera2 = (LifecycleCamera) this.f14519b.get((a) it.next());
                        lifecycleCamera2.getClass();
                        if (!lifecycleCamera2.equals(lifecycleCamera) && !lifecycleCamera2.b().isEmpty()) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                        }
                    }
                }
                try {
                    androidx.camera.core.internal.f fVar = lifecycleCamera.f14512c;
                    synchronized (fVar.t) {
                        fVar.f14342j = q0Var;
                    }
                    androidx.camera.core.internal.f fVar2 = lifecycleCamera.f14512c;
                    synchronized (fVar2.t) {
                        fVar2.f14343o = list;
                    }
                    synchronized (lifecycleCamera.f14510a) {
                        lifecycleCamera.f14512c.a(collection);
                    }
                    if (((C1212w) lifecycleOwnerA.getLifecycle()).f17478d.a(EnumC1204n.f17463d)) {
                        g(lifecycleOwnerA);
                    }
                } catch (androidx.camera.core.internal.d e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LifecycleCamera b(LifecycleOwner lifecycleOwner, androidx.camera.core.internal.f fVar) {
        synchronized (this.f14518a) {
            try {
                p118hf.a.g(this.f14519b.get(new a(lifecycleOwner, fVar.f14338e)) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                LifecycleCamera lifecycleCamera = new LifecycleCamera(lifecycleOwner, fVar);
                if (((ArrayList) fVar.m()).isEmpty()) {
                    lifecycleCamera.d();
                }
                if (((C1212w) lifecycleOwner.getLifecycle()).f17478d == EnumC1204n.f17460a) {
                    return lifecycleCamera;
                }
                f(lifecycleCamera);
                return lifecycleCamera;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final LifecycleCameraRepository$LifecycleCameraRepositoryObserver c(LifecycleOwner lifecycleOwner) {
        synchronized (this.f14518a) {
            try {
                for (LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver : this.f14520c.keySet()) {
                    if (lifecycleOwner.equals(lifecycleCameraRepository$LifecycleCameraRepositoryObserver.f14515b)) {
                        return lifecycleCameraRepository$LifecycleCameraRepositoryObserver;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Collection d() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f14518a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f14519b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean e(LifecycleOwner lifecycleOwner) {
        synchronized (this.f14518a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(lifecycleOwner);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return false;
                }
                Iterator it = ((Set) this.f14520c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f14519b.get((a) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.b().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(LifecycleCamera lifecycleCamera) {
        synchronized (this.f14518a) {
            try {
                LifecycleOwner lifecycleOwnerA = lifecycleCamera.a();
                androidx.camera.core.internal.f fVar = lifecycleCamera.f14512c;
                a aVar = new a(lifecycleOwnerA, androidx.camera.core.internal.f.i(fVar.f14330H, fVar.f14331L));
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(lifecycleOwnerA);
                Set hashSet = lifecycleCameraRepository$LifecycleCameraRepositoryObserverC != null ? (Set) this.f14520c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC) : new HashSet();
                hashSet.add(aVar);
                this.f14519b.put(aVar, lifecycleCamera);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserver = new LifecycleCameraRepository$LifecycleCameraRepositoryObserver(lifecycleOwnerA, this);
                    this.f14520c.put(lifecycleCameraRepository$LifecycleCameraRepositoryObserver, hashSet);
                    lifecycleOwnerA.getLifecycle().a(lifecycleCameraRepository$LifecycleCameraRepositoryObserver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(LifecycleOwner lifecycleOwner) {
        synchronized (this.f14518a) {
            try {
                if (e(lifecycleOwner)) {
                    if (this.f14521d.isEmpty()) {
                        this.f14521d.push(lifecycleOwner);
                    } else {
                        CameraCoordinator cameraCoordinator = this.f14522e;
                        if (cameraCoordinator == null || cameraCoordinator.getCameraOperatingMode() != 2) {
                            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) this.f14521d.peek();
                            if (!lifecycleOwner.equals(lifecycleOwner2)) {
                                i(lifecycleOwner2);
                                this.f14521d.remove(lifecycleOwner);
                                this.f14521d.push(lifecycleOwner);
                            }
                        }
                    }
                    m(lifecycleOwner);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(LifecycleOwner lifecycleOwner) {
        synchronized (this.f14518a) {
            try {
                this.f14521d.remove(lifecycleOwner);
                i(lifecycleOwner);
                if (!this.f14521d.isEmpty()) {
                    m((LifecycleOwner) this.f14521d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(LifecycleOwner lifecycleOwner) {
        synchronized (this.f14518a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(lifecycleOwner);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                Iterator it = ((Set) this.f14520c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f14519b.get((a) it.next());
                    lifecycleCamera.getClass();
                    lifecycleCamera.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Collection collection) {
        synchronized (this.f14518a) {
            try {
                Iterator it = this.f14519b.keySet().iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f14519b.get((a) it.next());
                    boolean zIsEmpty = lifecycleCamera.b().isEmpty();
                    synchronized (lifecycleCamera.f14510a) {
                        ArrayList arrayList = new ArrayList(collection);
                        arrayList.retainAll(lifecycleCamera.f14512c.m());
                        lifecycleCamera.f14512c.r(arrayList);
                    }
                    if (!zIsEmpty && lifecycleCamera.b().isEmpty()) {
                        h(lifecycleCamera.a());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.f14518a) {
            Iterator it = this.f14519b.keySet().iterator();
            while (it.hasNext()) {
                LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f14519b.get((a) it.next());
                synchronized (lifecycleCamera.f14510a) {
                    androidx.camera.core.internal.f fVar = lifecycleCamera.f14512c;
                    fVar.r((ArrayList) fVar.m());
                }
                h(lifecycleCamera.a());
            }
        }
    }

    public final void l(LifecycleOwner lifecycleOwner) {
        synchronized (this.f14518a) {
            try {
                LifecycleCameraRepository$LifecycleCameraRepositoryObserver lifecycleCameraRepository$LifecycleCameraRepositoryObserverC = c(lifecycleOwner);
                if (lifecycleCameraRepository$LifecycleCameraRepositoryObserverC == null) {
                    return;
                }
                h(lifecycleOwner);
                Iterator it = ((Set) this.f14520c.get(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC)).iterator();
                while (it.hasNext()) {
                    this.f14519b.remove((a) it.next());
                }
                this.f14520c.remove(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC);
                lifecycleCameraRepository$LifecycleCameraRepositoryObserverC.f14515b.getLifecycle().b(lifecycleCameraRepository$LifecycleCameraRepositoryObserverC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(LifecycleOwner lifecycleOwner) {
        synchronized (this.f14518a) {
            try {
                Iterator it = ((Set) this.f14520c.get(c(lifecycleOwner))).iterator();
                while (it.hasNext()) {
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) this.f14519b.get((a) it.next());
                    lifecycleCamera.getClass();
                    if (!lifecycleCamera.b().isEmpty()) {
                        lifecycleCamera.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
