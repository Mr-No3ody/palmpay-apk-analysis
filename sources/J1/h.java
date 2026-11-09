package J1;

import android.content.Context;
import android.os.Build;
import com.bumptech.glide.util.GlideSuppliers$GlideSupplier;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h implements GlideSuppliers$GlideSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f4463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f4464b;

    public h(GlideSuppliers$GlideSupplier glideSuppliers$GlideSupplier) {
        this.f4464b = glideSuppliers$GlideSupplier;
    }

    public boolean a() {
        Boolean bool = (Boolean) this.f4464b;
        if (bool != null) {
            return bool.booleanValue();
        }
        Context context = (Context) p267r9.a.f41645a.f4463a;
        boolean z3 = false;
        if (context == null) {
            return false;
        }
        Boolean boolValueOf = Boolean.valueOf(androidx.webkit.j.b(context) != null);
        this.f4464b = boolValueOf;
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 == 26 || i7 == 27 || i7 == 30) && boolValueOf.booleanValue()) {
            try {
                Objects.toString(Class.forName("android.webkit.WebViewFactory").getMethod("getProvider", new Class[0]).invoke(null, new Object[0]));
            } catch (RuntimeException | UnsatisfiedLinkError unused) {
            } catch (Exception e10) {
                e10.toString();
            }
            z3 = true;
            this.f4464b = Boolean.valueOf(z3);
        }
        return ((Boolean) this.f4464b).booleanValue();
    }

    @Override // com.bumptech.glide.util.GlideSuppliers$GlideSupplier
    public Object get() {
        if (this.f4463a == null) {
            synchronized (this) {
                try {
                    if (this.f4463a == null) {
                        Object obj = ((GlideSuppliers$GlideSupplier) this.f4464b).get();
                        g.c(obj, "Argument must not be null");
                        this.f4463a = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4463a;
    }
}
