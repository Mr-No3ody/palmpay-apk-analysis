package L8;

import C0.G;
import N8.q0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.J;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends J {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f5563b = new d(null);

    @Override // androidx.fragment.app.J
    public final Fragment a(ClassLoader classLoader, String className) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(className, "className");
        if (f5563b.isBiometricInternalFragment(className)) {
            F6.d.h("SafeFragmentFactory", 5, G.o("skip restore biometric fragment: ", className));
            return new Fragment();
        }
        try {
            Fragment fragment = (Fragment) J.c(classLoader, className).getConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(fragment, "instantiate(...)");
            return fragment;
        } catch (IllegalAccessException e10) {
            throw new P0.c(5, q0.k("Unable to instantiate fragment ", className, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new P0.c(5, q0.k("Unable to instantiate fragment ", className, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new P0.c(5, q0.k("Unable to instantiate fragment ", className, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new P0.c(5, q0.k("Unable to instantiate fragment ", className, ": calling Fragment constructor caused an exception"), e13);
        }
    }
}
