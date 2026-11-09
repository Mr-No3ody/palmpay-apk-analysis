package A0;

import M.o;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.i0;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f22b;

    public d(LifecycleOwner lifecycleOwner, i0 i0Var) {
        this.f21a = lifecycleOwner;
        this.f22b = (c) new androidx.camera.video.internal.c(i0Var, c.f19e).h(c.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        o oVar = this.f22b.f20d;
        if (oVar.e() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (oVar.e() <= 0) {
                return;
            }
            if (oVar.f(0) != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(oVar.c(0));
            printWriter.print(": ");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Object obj = this.f21a;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb2.append(simpleName);
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}}");
        return sb2.toString();
    }
}
