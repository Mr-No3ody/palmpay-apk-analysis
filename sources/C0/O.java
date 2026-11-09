package C0;

import N8.q0;
import android.os.Bundle;
import androidx.navigation.Navigator$Name;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Navigator$Name("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LC0/O;", "LC0/e0;", "LC0/N;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class O extends e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f969c;

    public O(g0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f969c = navigatorProvider;
    }

    @Override // C0.e0
    public final K a() {
        return new N(this);
    }

    @Override // C0.e0
    public final void d(List entries, U u6) {
        String strValueOf;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C0119k c0119k = (C0119k) it.next();
            K k2 = c0119k.f1051b;
            Intrinsics.f(k2, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            N n10 = (N) k2;
            Bundle bundleA = c0119k.a();
            int i7 = n10.f967v;
            if (i7 == 0) {
                StringBuilder sb2 = new StringBuilder("no start destination defined via app:startDestination for ");
                int i10 = n10.f961i;
                if (i10 != 0) {
                    strValueOf = n10.f956c;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i10);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb2.append(strValueOf);
                throw new IllegalStateException(sb2.toString().toString());
            }
            K destination = n10.g(i7, false);
            if (destination == null) {
                if (n10.f968w == null) {
                    n10.f968w = String.valueOf(n10.f967v);
                }
                String str = n10.f968w;
                Intrinsics.e(str);
                throw new IllegalArgumentException(q0.k("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            e0 e0VarB = this.f969c.b(destination.f954a);
            C0123o c0123oB = b();
            Bundle bundleB = destination.b(bundleA);
            Intrinsics.checkNotNullParameter(destination, "destination");
            C0115g c0115g = C0119k.f1049v;
            AbstractC0130w abstractC0130w = c0123oB.f1073h;
            e0VarB.d(C1849p.c(C0115g.create$default(c0115g, abstractC0130w.f1101a, destination, bundleB, abstractC0130w.f(), abstractC0130w.f1115o, null, null, 96, null)), u6);
        }
    }
}
