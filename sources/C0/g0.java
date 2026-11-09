package C0;

import N8.q0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f1042b = new f0(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f1043c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1044a = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(e0 navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Class<?> cls = navigator.getClass();
        f0 f0Var = f1042b;
        String name = f0Var.getNameForNavigator$navigation_common_release(cls);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!f0Var.validateName$navigation_common_release(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f1044a;
        e0 e0Var = (e0) linkedHashMap.get(name);
        if (Intrinsics.c(e0Var, navigator)) {
            return;
        }
        boolean z3 = false;
        if (e0Var != null && e0Var.f1037b) {
            z3 = true;
        }
        if (z3) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + e0Var).toString());
        }
        if (!navigator.f1037b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    public final e0 b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!f1042b.validateName$navigation_common_release(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        e0 e0Var = (e0) this.f1044a.get(name);
        if (e0Var != null) {
            return e0Var;
        }
        throw new IllegalStateException(q0.k("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
