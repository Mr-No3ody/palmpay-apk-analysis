package ta;

import android.app.Activity;
import androidx.core.app.AbstractC1032a;
import androidx.fragment.app.Fragment;
import com.horcrux.svg.d0;
import com.transsnet.palmpay.core.location.listeners.DialogListener;
import com.transsnet.palmpay.core.location.listeners.PermissionListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends V3.d implements DialogListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public org.sufficientlysecure.htmltextview.n f42374f;

    static {
        new e(null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // V3.d
    public final boolean e() {
        boolean zH;
        boolean z3 = false;
        if (a() == null) {
            F6.d.h("PermissionManager", 3, "Cannot ask for permissions, because DefaultPermissionProvider doesn't contain an Activity instance.");
            return false;
        }
        boolean z8 = false;
        for (String str : (String[]) this.f9986c) {
            if (z8) {
                z8 = true;
            } else {
                Fragment fragment = b();
                org.sufficientlysecure.htmltextview.n nVar = this.f42374f;
                if (fragment != null) {
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(fragment, "fragment");
                    Intrinsics.e(str);
                    zH = fragment.shouldShowRequestPermissionRationale(str);
                } else {
                    Activity activityA = a();
                    if (activityA != null) {
                        nVar.getClass();
                        Intrinsics.e(str);
                        zH = AbstractC1032a.h(activityA, str);
                    } else {
                        zH = false;
                    }
                }
                if (zH) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
        }
        F6.d.h("PermissionManager", 3, d0.q("Should show rationale dialog for required permissions: ", z8));
        p pVar = (p) this.f9987d;
        if (z8 && a() != null && pVar != null) {
            z3 = true;
        }
        if (!z3) {
            f();
            return true;
        }
        if (pVar != null) {
            pVar.f42390a = new WeakReference(this);
            Activity activityA2 = a();
            Intrinsics.e(activityA2);
            pVar.a(activityA2).show();
        }
        return true;
    }

    public final void f() {
        F6.d.h("PermissionManager", 3, "Asking for Runtime Permissions...");
        Fragment fragmentB = b();
        String[] strArr = (String[]) this.f9986c;
        org.sufficientlysecure.htmltextview.n nVar = this.f42374f;
        if (fragmentB != null) {
            Fragment fragment = b();
            Intrinsics.e(fragment);
            nVar.getClass();
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            fragment.requestPermissions(strArr, 23);
            return;
        }
        if (a() != null) {
            Activity activityA = a();
            nVar.getClass();
            Intrinsics.e(activityA);
            AbstractC1032a.g(activityA, strArr, 23);
            return;
        }
        F6.d.h("PermissionManager", 3, "Something went wrong requesting for permissions.");
        WeakReference weakReference = (WeakReference) this.f9985b;
        Intrinsics.e(weakReference);
        PermissionListener permissionListener = (PermissionListener) weakReference.get();
        if (permissionListener != null) {
            permissionListener.onPermissionsDenied();
        }
    }

    @Override // com.transsnet.palmpay.core.location.listeners.DialogListener
    public final void onNegativeButtonClick() {
        F6.d.h("PermissionManager", 3, "User didn't even let us to ask for permission!");
        WeakReference weakReference = (WeakReference) this.f9985b;
        Intrinsics.e(weakReference);
        if (((PermissionListener) weakReference.get()) != null) {
            WeakReference weakReference2 = (WeakReference) this.f9985b;
            Intrinsics.e(weakReference2);
            PermissionListener permissionListener = (PermissionListener) weakReference2.get();
            Intrinsics.e(permissionListener);
            permissionListener.onPermissionsDenied();
        }
    }

    @Override // com.transsnet.palmpay.core.location.listeners.DialogListener
    public final void onPositiveButtonClick() {
        f();
    }
}
