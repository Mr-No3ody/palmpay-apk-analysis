package Ga;

import Wf.AbstractC0777v;
import Wf.AbstractC0780y;
import com.transsnet.palmpay.util.PermissionUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class e {
    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final boolean isTaskRunning() {
        boolean z3;
        synchronized (this) {
            z3 = k.f3217e != null;
        }
        return z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean setCurrentTask(k kVar) {
        synchronized (this) {
            try {
                if (kVar == null) {
                    e eVar = k.f3214b;
                    k.f3217e = null;
                    F6.d.h(k.f3215c, 3, "Upload task completed");
                    return true;
                }
                if (k.f3217e != null) {
                    F6.d.h(k.f3215c, 5, "Upload task already running, rejecting new task");
                    return false;
                }
                e eVar2 = k.f3214b;
                k.f3217e = kVar;
                F6.d.h(k.f3215c, 3, "Upload task started");
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean cancelCurrentTask() {
        boolean z3;
        synchronized (this) {
            try {
                k kVar = k.f3217e;
                if (kVar != null) {
                    F6.d.h(k.f3215c, 3, "Cancelling current upload task");
                    AbstractC0777v.c(kVar.f3218a, null);
                    k.f3214b.setCurrentTask(null);
                    z3 = true;
                } else {
                    F6.d.h(k.f3215c, 3, "No upload task to cancel");
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public final boolean isUploading() {
        return isTaskRunning();
    }

    public final boolean upload() {
        if (!PermissionUtils.isGranted("android.permission.READ_CONTACTS")) {
            F6.d.h(k.f3215c, 5, "READ_CONTACTS permission not granted, upload failed");
            return false;
        }
        k kVar = new k();
        if (!setCurrentTask(kVar)) {
            F6.d.h(k.f3215c, 5, "Upload request rejected: another task is already running");
            return false;
        }
        AbstractC0780y.m(kVar.f3218a, null, null, new d(kVar, null), 3);
        return true;
    }

    private e() {
    }
}
