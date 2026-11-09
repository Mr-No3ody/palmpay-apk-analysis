package androidx.camera.lifecycle;

import E.AbstractC0198c;
import E.C0211p;
import E.C0214t;
import E.U;
import E.n0;
import E.p0;
import E.q0;
import android.content.Context;
import android.os.Trace;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.concurrent.CameraCoordinator;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.AbstractC0972c0;
import androidx.camera.core.impl.AbstractC0978f0;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.futures.l;
import androidx.concurrent.futures.m;
import androidx.lifecycle.LifecycleOwner;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h implements LifecycleCameraProvider {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f14527i = new f(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f14528j = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14529a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f14530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m f14531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListenableFuture f14532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f14533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.camera.core.c f14534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f14535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f14536h;

    public h() {
        l lVar = l.f14212c;
        Intrinsics.checkNotNullExpressionValue(lVar, "immediateFuture<Void>(null)");
        this.f14532d = lVar;
        this.f14533e = new b();
        this.f14536h = new HashMap();
    }

    public static final void a(h hVar, C0214t c0214t) {
        hVar.getClass();
        Trace.beginSection(AbstractC0198c.m0("CX:configureInstanceInternal"));
        try {
            synchronized (hVar.f14529a) {
                c0214t.getClass();
                p118hf.a.k(hVar.f14530b == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                hVar.f14530b = new g(c0214t);
                Unit unit = Unit.f38893a;
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final CameraConfig b(h hVar, C0211p c0211p, CameraInfoInternal cameraInfoInternal) {
        CameraConfigProvider cameraConfigProvider;
        CameraConfig cameraConfig = null;
        for (Object obj : c0211p.f2093a) {
            Intrinsics.checkNotNullExpressionValue(obj, "cameraSelector.cameraFilterSet");
            CameraFilter cameraFilter = (CameraFilter) obj;
            if (!Intrinsics.c(cameraFilter.getIdentifier(), CameraFilter.f13707a)) {
                AbstractC0978f0 identifier = cameraFilter.getIdentifier();
                synchronized (AbstractC0972c0.f14034a) {
                    cameraConfigProvider = (CameraConfigProvider) AbstractC0972c0.f14035b.get(identifier);
                }
                if (cameraConfigProvider == null) {
                    cameraConfigProvider = CameraConfigProvider.f13852a;
                }
                Context context = hVar.f14535g;
                Intrinsics.e(context);
                CameraConfig config = cameraConfigProvider.getConfig(cameraInfoInternal, context);
                if (config == null) {
                    continue;
                } else {
                    if (cameraConfig != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    cameraConfig = config;
                }
            }
        }
        return cameraConfig == null ? D.f13854a : cameraConfig;
    }

    public final LifecycleCamera c(LifecycleOwner lifecycleOwner, C0211p cameraSelector, p0 useCaseGroup) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCaseGroup, "useCaseGroup");
        Trace.beginSection(AbstractC0198c.m0("CX:bindToLifecycle-UseCaseGroup"));
        try {
            androidx.camera.core.c cVar = this.f14534f;
            if ((cVar == null ? 0 : cVar.b().getCameraCoordinator().getCameraOperatingMode()) == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            androidx.camera.core.c cVar2 = this.f14534f;
            if (cVar2 != null) {
                cVar2.b().getCameraCoordinator().setCameraOperatingMode(1);
            }
            U DEFAULT = U.f1955a;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            q0 q0Var = useCaseGroup.f2094a;
            ArrayList arrayList = useCaseGroup.f2096c;
            Intrinsics.checkNotNullExpressionValue(arrayList, "useCaseGroup.effects");
            ArrayList arrayList2 = useCaseGroup.f2095b;
            Intrinsics.checkNotNullExpressionValue(arrayList2, "useCaseGroup.useCases");
            n0[] n0VarArr = (n0[]) arrayList2.toArray(new n0[0]);
            LifecycleCamera lifecycleCameraE = e(lifecycleOwner, cameraSelector, q0Var, arrayList, (n0[]) Arrays.copyOf(n0VarArr, n0VarArr.length));
            Trace.endSection();
            return lifecycleCameraE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final LifecycleCamera d(LifecycleOwner lifecycleOwner, C0211p cameraSelector, n0... useCases) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection(AbstractC0198c.m0("CX:bindToLifecycle"));
        try {
            androidx.camera.core.c cVar = this.f14534f;
            if ((cVar == null ? 0 : cVar.b().getCameraCoordinator().getCameraOperatingMode()) == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            androidx.camera.core.c cVar2 = this.f14534f;
            if (cVar2 != null) {
                cVar2.b().getCameraCoordinator().setCameraOperatingMode(1);
            }
            U DEFAULT = U.f1955a;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            LifecycleCamera lifecycleCameraE = e(lifecycleOwner, cameraSelector, null, z.f38935a, (n0[]) Arrays.copyOf(useCases, useCases.length));
            Trace.endSection();
            return lifecycleCameraE;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final LifecycleCamera e(LifecycleOwner lifecycleOwner, C0211p primaryCameraSelector, q0 q0Var, List effects, n0... useCases) {
        LifecycleCamera lifecycleCameraB;
        U secondaryLayoutSettings = U.f1955a;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(primaryCameraSelector, "primaryCameraSelector");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "primaryLayoutSettings");
        Intrinsics.checkNotNullParameter(secondaryLayoutSettings, "secondaryLayoutSettings");
        Intrinsics.checkNotNullParameter(effects, "effects");
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection(AbstractC0198c.m0("CX:bindToLifecycle-internal"));
        try {
            p140j8.f.b();
            androidx.camera.core.c cVar = this.f14534f;
            Intrinsics.e(cVar);
            CameraInternal cameraInternalC = primaryCameraSelector.c(cVar.f13716a.b());
            Intrinsics.checkNotNullExpressionValue(cameraInternalC, "primaryCameraSelector.se…cameraRepository.cameras)");
            cameraInternalC.setPrimary(true);
            A0 a3 = (A0) getCameraInfo(primaryCameraSelector);
            b bVar = this.f14533e;
            androidx.camera.core.internal.a aVarI = androidx.camera.core.internal.f.i(a3, null);
            synchronized (bVar.f14518a) {
                lifecycleCameraB = (LifecycleCamera) bVar.f14519b.get(new a(lifecycleOwner, aVarI));
            }
            Collection collectionD = this.f14533e.d();
            for (n0 n0Var : C1847n.r(useCases)) {
                for (Object lifecycleCameras : collectionD) {
                    Intrinsics.checkNotNullExpressionValue(lifecycleCameras, "lifecycleCameras");
                    LifecycleCamera lifecycleCamera = (LifecycleCamera) lifecycleCameras;
                    if (lifecycleCamera.c(n0Var) && !lifecycleCamera.equals(lifecycleCameraB)) {
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{n0Var}, 1));
                        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (lifecycleCameraB == null) {
                b bVar2 = this.f14533e;
                androidx.camera.core.c cVar2 = this.f14534f;
                Intrinsics.e(cVar2);
                CameraCoordinator cameraCoordinator = cVar2.b().getCameraCoordinator();
                androidx.camera.core.c cVar3 = this.f14534f;
                Intrinsics.e(cVar3);
                CameraDeviceSurfaceManager cameraDeviceSurfaceManager = cVar3.f13723h;
                if (cameraDeviceSurfaceManager == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                androidx.camera.core.c cVar4 = this.f14534f;
                Intrinsics.e(cVar4);
                UseCaseConfigFactory useCaseConfigFactory = cVar4.f13724i;
                if (useCaseConfigFactory == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                lifecycleCameraB = bVar2.b(lifecycleOwner, new androidx.camera.core.internal.f(cameraInternalC, null, a3, null, cameraCoordinator, cameraDeviceSurfaceManager, useCaseConfigFactory));
            }
            LifecycleCamera lifecycleCamera2 = lifecycleCameraB;
            if (useCases.length != 0) {
                b bVar3 = this.f14533e;
                List listH = C1850q.h(Arrays.copyOf(useCases, useCases.length));
                androidx.camera.core.c cVar5 = this.f14534f;
                Intrinsics.e(cVar5);
                bVar3.a(lifecycleCamera2, q0Var, effects, listH, cVar5.b().getCameraCoordinator());
            }
            Trace.endSection();
            return lifecycleCamera2;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final List getAvailableCameraInfos() {
        Trace.beginSection(AbstractC0198c.m0("CX:getAvailableCameraInfos"));
        try {
            ArrayList arrayList = new ArrayList();
            androidx.camera.core.c cVar = this.f14534f;
            Intrinsics.e(cVar);
            LinkedHashSet linkedHashSetB = cVar.f13716a.b();
            Intrinsics.checkNotNullExpressionValue(linkedHashSetB, "mCameraX!!.cameraRepository.cameras");
            Iterator it = linkedHashSetB.iterator();
            while (it.hasNext()) {
                CameraInfo cameraInfo = ((CameraInternal) it.next()).getCameraInfo();
                Intrinsics.checkNotNullExpressionValue(cameraInfo, "camera.cameraInfo");
                arrayList.add(cameraInfo);
            }
            Trace.endSection();
            return arrayList;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final CameraInfo getCameraInfo(C0211p cameraSelector) {
        Object a3;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection(AbstractC0198c.m0("CX:getCameraInfo"));
        try {
            androidx.camera.core.c cVar = this.f14534f;
            Intrinsics.e(cVar);
            CameraInfoInternal cameraInfoInternal = cameraSelector.c(cVar.f13716a.b()).getCameraInfoInternal();
            Intrinsics.checkNotNullExpressionValue(cameraInfoInternal, "cameraSelector.select(mC…meras).cameraInfoInternal");
            CameraConfig cameraConfigB = b(this, cameraSelector, cameraInfoInternal);
            androidx.camera.core.internal.a aVar = new androidx.camera.core.internal.a(cameraInfoInternal.getCameraId(), cameraConfigB.getCompatibilityId());
            Intrinsics.checkNotNullExpressionValue(aVar, "create(\n                …ilityId\n                )");
            synchronized (this.f14529a) {
                try {
                    a3 = this.f14536h.get(aVar);
                    if (a3 == null) {
                        a3 = new A0(cameraInfoInternal, cameraConfigB);
                        this.f14536h.put(aVar, a3);
                    }
                    Unit unit = Unit.f38893a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            A0 a10 = (A0) a3;
            Trace.endSection();
            return a10;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // androidx.camera.core.CameraProvider
    public final boolean hasCamera(C0211p cameraSelector) {
        boolean z3;
        Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
        Trace.beginSection(AbstractC0198c.m0("CX:hasCamera"));
        try {
            androidx.camera.core.c cVar = this.f14534f;
            Intrinsics.e(cVar);
            cameraSelector.c(cVar.f13716a.b());
            z3 = true;
        } catch (IllegalArgumentException unused) {
            z3 = false;
        } finally {
            Trace.endSection();
        }
        return z3;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final boolean isBound(n0 useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        for (Object obj : this.f14533e.d()) {
            Intrinsics.checkNotNullExpressionValue(obj, "mLifecycleCameraRepository.lifecycleCameras");
            if (((LifecycleCamera) obj).c(useCase)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final void unbind(n0... useCases) {
        Intrinsics.checkNotNullParameter(useCases, "useCases");
        Trace.beginSection(AbstractC0198c.m0("CX:unbind"));
        try {
            p140j8.f.b();
            androidx.camera.core.c cVar = this.f14534f;
            if ((cVar == null ? 0 : cVar.b().getCameraCoordinator().getCameraOperatingMode()) == 2) {
                throw new UnsupportedOperationException("Unbind usecase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            this.f14533e.j(C1850q.h(Arrays.copyOf(useCases, useCases.length)));
            Unit unit = Unit.f38893a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraProvider
    public final void unbindAll() {
        Trace.beginSection(AbstractC0198c.m0("CX:unbindAll"));
        try {
            p140j8.f.b();
            androidx.camera.core.c cVar = this.f14534f;
            if (cVar != null) {
                cVar.b().getCameraCoordinator().setCameraOperatingMode(0);
            }
            this.f14533e.k();
            Unit unit = Unit.f38893a;
        } finally {
            Trace.endSection();
        }
    }
}
