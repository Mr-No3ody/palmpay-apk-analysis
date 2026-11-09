package androidx.webkit.internal;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WebViewProviderFactory f18327a;

    static {
        WebViewProviderFactory dVar;
        try {
            dVar = new Ab.r((WebViewProviderFactoryBoundaryInterface) org.chromium.support_lib_boundary.util.b.n(WebViewProviderFactoryBoundaryInterface.class, p059e1.a.l()), 13);
        } catch (ClassNotFoundException unused) {
            dVar = new d();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
        f18327a = dVar;
    }
}
