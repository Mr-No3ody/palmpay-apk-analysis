package p218o7;

import N8.q0;
import V3.d;
import android.os.Build;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.work.impl.model.b;
import com.permissionx.guolindev.callback.RequestCallback;
import com.permissionx.guolindev.request.InvisibleFragment;
import java.util.HashSet;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E f40076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f40077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashSet f40078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashSet f40079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinkedHashSet f40080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinkedHashSet f40081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinkedHashSet f40082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinkedHashSet f40083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinkedHashSet f40084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RequestCallback f40085j;

    static {
        new g(null);
    }

    public final E a() {
        E e10 = this.f40076a;
        if (e10 != null) {
            return e10;
        }
        Intrinsics.n("activity");
        throw null;
    }

    public final Z b() {
        Z supportFragmentManager = a().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        return supportFragmentManager;
    }

    public final InvisibleFragment c() {
        Fragment fragmentE = b().E("InvisibleFragment");
        if (fragmentE != null) {
            return (InvisibleFragment) fragmentE;
        }
        InvisibleFragment invisibleFragment = new InvisibleFragment();
        Z zB = b();
        C1161a c1161aE = q0.e(zB, zB);
        c1161aE.d(0, invisibleFragment, "InvisibleFragment", 1);
        c1161aE.j();
        return invisibleFragment;
    }

    public final int d() {
        return a().getApplicationInfo().targetSdkVersion;
    }

    public final void e(RequestCallback requestCallback) {
        this.f40085j = requestCallback;
        if (Build.VERSION.SDK_INT != 26) {
            this.f40077b = a().getRequestedOrientation();
            int i7 = a().getResources().getConfiguration().orientation;
            if (i7 == 1) {
                a().setRequestedOrientation(7);
            } else if (i7 == 2) {
                a().setRequestedOrientation(6);
            }
        }
        b bVar = new b(16, false);
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new q(this, 0));
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new j(this));
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new q(this, 2));
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new q(this, 3));
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new p(this));
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new n(this));
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new q(this, 1));
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        bVar.c(new l(this));
        d dVar = (d) bVar.f18580b;
        if (dVar != null) {
            dVar.request();
        }
    }

    public final void f(HashSet permissions, q chainTask) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        InvisibleFragment invisibleFragmentC = c();
        Intrinsics.checkNotNullParameter(this, "permissionBuilder");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(chainTask, "chainTask");
        invisibleFragmentC.f24646b = this;
        invisibleFragmentC.f24647c = chainTask;
        Object[] array = permissions.toArray(new String[0]);
        Intrinsics.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        invisibleFragmentC.f24648d.a(array);
    }
}
