package V3;

import G9.i;
import V3.d;
import android.app.Activity;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.core.app.M;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.F;
import com.permissionx.guolindev.callback.RequestCallback;
import com.permissionx.guolindev.request.ChainTask;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p177m.l;
import p218o7.h;
import ta.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements ChainTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9987d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f9988e;

    public d(ActivityResultCaller caller, p177m.b contract, int i7) {
        this.f9984a = i7;
        switch (i7) {
            case 1:
                this.f9988e = caller;
                final int i10 = 1;
                this.f9985b = caller.registerForActivityResult(contract, new ActivityResultCallback(this) { // from class: ca.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ d f18881b;

                    {
                        this.f18881b = this;
                    }

                    @Override // androidx.activity.result.ActivityResultCallback
                    public final void onActivityResult(Object obj) {
                        switch (i10) {
                            case 0:
                                this.f18881b.c(obj);
                                break;
                            default:
                                this.f18881b.c(obj);
                                break;
                        }
                    }
                });
                break;
            default:
                Intrinsics.checkNotNullParameter(caller, "caller");
                Intrinsics.checkNotNullParameter(contract, "contract");
                this.f9988e = caller;
                this.f9985b = caller.registerForActivityResult(contract, new i(this, 2));
                break;
        }
    }

    public Activity a() {
        WeakReference weakReference = (WeakReference) this.f9988e;
        Intrinsics.e(weakReference);
        if (weakReference.get() == null) {
            return null;
        }
        WeakReference weakReference2 = (WeakReference) this.f9988e;
        Intrinsics.e(weakReference2);
        Object obj = weakReference2.get();
        Intrinsics.e(obj);
        p283sa.a aVar = (p283sa.a) obj;
        Activity activity = (Activity) aVar.f42096b.get();
        if (activity != null) {
            return activity;
        }
        Fragment fragment = (Fragment) aVar.f42097c.get();
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public Fragment b() {
        WeakReference weakReference = (WeakReference) this.f9988e;
        Intrinsics.e(weakReference);
        if (weakReference.get() == null) {
            return null;
        }
        WeakReference weakReference2 = (WeakReference) this.f9988e;
        Intrinsics.e(weakReference2);
        Object obj = weakReference2.get();
        Intrinsics.e(obj);
        return (Fragment) ((p283sa.a) obj).f42097c.get();
    }

    public void c(Object obj) {
        ActivityResultCallback activityResultCallback = (ActivityResultCallback) this.f9986c;
        if (activityResultCallback != null) {
            activityResultCallback.onActivityResult(obj);
            this.f9986c = null;
        } else {
            if (((F) this.f9987d) == null) {
                this.f9987d = new F();
            }
            ((F) this.f9987d).k(obj);
        }
    }

    public void d(Object obj, ActivityResultCallback callback) {
        switch (this.f9984a) {
            case 0:
                Intrinsics.checkNotNullParameter(callback, "callback");
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f9986c = callback;
                ((androidx.activity.result.a) this.f9985b).a(obj);
                break;
            default:
                this.f9986c = callback;
                try {
                    ((androidx.activity.result.a) this.f9985b).a(obj);
                } catch (Exception e10) {
                    F6.d.c("ActivityLauncher", "launch: ", e10);
                }
                break;
        }
    }

    public abstract boolean e();

    @Override // com.permissionx.guolindev.request.ChainTask
    public void finish() {
        Unit unit;
        d dVar = (d) this.f9985b;
        if (dVar != null) {
            dVar.request();
            unit = Unit.f38893a;
        } else {
            unit = null;
        }
        if (unit == null) {
            ArrayList arrayList = new ArrayList();
            h hVar = (h) this.f9988e;
            arrayList.addAll(hVar.f40082g);
            arrayList.addAll(hVar.f40083h);
            arrayList.addAll(hVar.f40080e);
            if (hVar.f40079d.contains("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                if (androidx.core.content.d.a(hVar.a(), "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    hVar.f40081f.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                } else {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                }
            }
            if (hVar.f40079d.contains("android.permission.SYSTEM_ALERT_WINDOW") && hVar.d() >= 23) {
                if (Settings.canDrawOverlays(hVar.a())) {
                    hVar.f40081f.add("android.permission.SYSTEM_ALERT_WINDOW");
                } else {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                }
            }
            if (hVar.f40079d.contains("android.permission.WRITE_SETTINGS") && hVar.d() >= 23) {
                if (Settings.System.canWrite(hVar.a())) {
                    hVar.f40081f.add("android.permission.WRITE_SETTINGS");
                } else {
                    arrayList.add("android.permission.WRITE_SETTINGS");
                }
            }
            if (hVar.f40079d.contains("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                if (Build.VERSION.SDK_INT < 30 || !Environment.isExternalStorageManager()) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                } else {
                    hVar.f40081f.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                }
            }
            if (hVar.f40079d.contains("android.permission.REQUEST_INSTALL_PACKAGES")) {
                if (Build.VERSION.SDK_INT < 26 || hVar.d() < 26 || !hVar.a().getPackageManager().canRequestPackageInstalls()) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                } else {
                    hVar.f40081f.add("android.permission.REQUEST_INSTALL_PACKAGES");
                }
            }
            if (hVar.f40079d.contains("android.permission.POST_NOTIFICATIONS")) {
                if (new M(hVar.a()).f15943b.areNotificationsEnabled()) {
                    hVar.f40081f.add("android.permission.POST_NOTIFICATIONS");
                } else {
                    arrayList.add("android.permission.POST_NOTIFICATIONS");
                }
            }
            if (hVar.f40079d.contains("android.permission.BODY_SENSORS_BACKGROUND")) {
                if (androidx.core.content.d.a(hVar.a(), "android.permission.BODY_SENSORS_BACKGROUND") == 0) {
                    hVar.f40081f.add("android.permission.BODY_SENSORS_BACKGROUND");
                } else {
                    arrayList.add("android.permission.BODY_SENSORS_BACKGROUND");
                }
            }
            RequestCallback requestCallback = hVar.f40085j;
            if (requestCallback != null) {
                requestCallback.onResult(arrayList.isEmpty(), new ArrayList(hVar.f40081f), arrayList);
            }
            Fragment fragmentE = hVar.b().E("InvisibleFragment");
            if (fragmentE != null) {
                Z zB = hVar.b();
                zB.getClass();
                C1161a c1161a = new C1161a(zB);
                c1161a.m(fragmentE);
                c1161a.j();
            }
            if (Build.VERSION.SDK_INT != 26) {
                hVar.a().setRequestedOrientation(hVar.f40077b);
            }
        }
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public p218o7.a getExplainScope() {
        return (p218o7.a) this.f9986c;
    }

    @Override // com.permissionx.guolindev.request.ChainTask
    public p218o7.b getForwardScope() {
        return (p218o7.b) this.f9987d;
    }

    public d(String[] requiredPermissions, p pVar) {
        this.f9984a = 3;
        Intrinsics.checkNotNullParameter(requiredPermissions, "requiredPermissions");
        if (requiredPermissions.length != 0) {
            this.f9986c = requiredPermissions;
            this.f9987d = pVar;
            return;
        }
        throw new IllegalArgumentException("You cannot create PermissionProvider without any permission required.");
    }

    public d(h pb2) {
        this.f9984a = 2;
        Intrinsics.checkNotNullParameter(pb2, "pb");
        this.f9988e = pb2;
        this.f9986c = new p218o7.a(pb2, this);
        this.f9987d = new p218o7.b(pb2, this);
        this.f9986c = new p218o7.a(pb2, this);
        this.f9987d = new p218o7.b(pb2, this);
    }

    public d(ActivityResultCaller activityResultCaller, androidx.activity.result.h hVar, String str, l lVar) {
        this.f9984a = 1;
        this.f9988e = activityResultCaller;
        if (!TextUtils.isEmpty(str) && hVar != null) {
            final int i7 = 0;
            this.f9985b = hVar.d(str, lVar, new ActivityResultCallback(this) { // from class: ca.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f18881b;

                {
                    this.f18881b = this;
                }

                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    switch (i7) {
                        case 0:
                            this.f18881b.c(obj);
                            break;
                        default:
                            this.f18881b.c(obj);
                            break;
                    }
                }
            });
        } else {
            final int i10 = 0;
            this.f9985b = activityResultCaller.registerForActivityResult(lVar, new ActivityResultCallback(this) { // from class: ca.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f18881b;

                {
                    this.f18881b = this;
                }

                @Override // androidx.activity.result.ActivityResultCallback
                public final void onActivityResult(Object obj) {
                    switch (i10) {
                        case 0:
                            this.f18881b.c(obj);
                            break;
                        default:
                            this.f18881b.c(obj);
                            break;
                    }
                }
            });
        }
    }
}
