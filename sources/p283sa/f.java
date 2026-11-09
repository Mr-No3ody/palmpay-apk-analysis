package p283sa;

import V3.d;
import android.content.Context;
import com.transsnet.palmpay.core.location.listeners.PermissionListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import p115ha.a;
import p268ra.e;
import ta.h;
import ta.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements PermissionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f42103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f42104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f42105c;

    static {
        new e(null);
    }

    public f(O2.a aVar) {
        d dVar;
        a listener = (a) aVar.f6554b;
        this.f42103a = listener;
        e eVarA = (e) aVar.f6555c;
        eVarA = eVarA == null ? new e().a() : eVarA;
        h hVar = (h) aVar.f6556d;
        hVar = hVar == null ? new h() : hVar;
        this.f42104b = hVar;
        org.greenrobot.eventbus.f fVar = eVarA.f41667a;
        if (fVar == null || (dVar = (d) fVar.f41079b) == null) {
            throw new IllegalStateException("PermissionProvider cannot be null.");
        }
        this.f42105c = dVar;
        a aVar2 = (a) aVar.f6553a;
        dVar.f9988e = new WeakReference(aVar2);
        Intrinsics.checkNotNullParameter(this, "permissionListener");
        dVar.f9985b = new WeakReference(this);
        if (listener != null) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            hVar.f42388c = aVar2;
            hVar.f42387b = eVarA;
            hVar.f42389d = new WeakReference(listener);
        }
    }

    public final void a() {
        Context context;
        Context context2;
        d dVar = this.f42105c;
        Intrinsics.e(dVar);
        WeakReference weakReference = (WeakReference) dVar.f9988e;
        Intrinsics.e(weakReference);
        if (weakReference.get() == null) {
            context = null;
        } else {
            WeakReference weakReference2 = (WeakReference) dVar.f9988e;
            Intrinsics.e(weakReference2);
            Object obj = weakReference2.get();
            Intrinsics.e(obj);
            context = ((a) obj).f42095a;
        }
        a aVar = this.f42103a;
        if (context != null) {
            String[] strArr = (String[]) dVar.f9986c;
            int length = strArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    F6.d.c("LocationManager", "We got permission!");
                    if (aVar != null) {
                        aVar.onPermissionGranted(true);
                    }
                    o oVar = this.f42104b;
                    Intrinsics.e(oVar);
                    oVar.b();
                    return;
                }
                String str = strArr[i7];
                WeakReference weakReference3 = (WeakReference) dVar.f9988e;
                Intrinsics.e(weakReference3);
                if (weakReference3.get() == null) {
                    context2 = null;
                } else {
                    WeakReference weakReference4 = (WeakReference) dVar.f9988e;
                    Intrinsics.e(weakReference4);
                    Object obj2 = weakReference4.get();
                    Intrinsics.e(obj2);
                    context2 = ((a) obj2).f42095a;
                }
                if (context2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.e(str);
                if (androidx.core.content.d.a(context2, str) != 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        if (aVar != null) {
            aVar.onProcessTypeChanged(1);
        }
        if (dVar.e()) {
            F6.d.c("LocationManager", "Waiting until we receive any callback from PermissionProvider...");
            return;
        }
        F6.d.c("LocationManager", "Couldn't get permission, Abort!");
        if (aVar != null) {
            aVar.onLocationFailed(2);
        }
    }

    @Override // com.transsnet.palmpay.core.location.listeners.PermissionListener
    public final void onPermissionsDenied() {
        a aVar = this.f42103a;
        if (aVar != null) {
            aVar.onLocationFailed(2);
        }
    }

    @Override // com.transsnet.palmpay.core.location.listeners.PermissionListener
    public final void onPermissionsDeniedAndNeverAskAgain() {
        a aVar = this.f42103a;
        if (aVar != null) {
            aVar.onLocationFailed(10);
        }
    }

    @Override // com.transsnet.palmpay.core.location.listeners.PermissionListener
    public final void onPermissionsGranted() {
        F6.d.c("LocationManager", "We got permission!");
        a aVar = this.f42103a;
        if (aVar != null) {
            aVar.onPermissionGranted(false);
        }
        o oVar = this.f42104b;
        Intrinsics.e(oVar);
        oVar.b();
    }
}
