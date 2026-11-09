package F1;

import V0.C;
import X0.j;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.h;
import androidx.work.impl.constraints.m;
import androidx.work.impl.model.k;
import com.airbnb.lottie.animation.content.o;
import com.airbnb.lottie.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.X;
import okhttp3.E;
import okhttp3.F;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f2516a;

    public b(int i7) {
        switch (i7) {
            case 2:
                this.f2516a = new ArrayList();
                break;
            case 3:
                this.f2516a = new ArrayList(20);
                break;
            default:
                this.f2516a = new ArrayList();
                break;
        }
    }

    public void a(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        int iD = StringsKt.D(line, ':', 0, 6);
        if (iD == -1) {
            throw new IllegalArgumentException("Unexpected header: ".concat(line).toString());
        }
        String strSubstring = line.substring(0, iD);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String string = StringsKt.V(strSubstring).toString();
        String strSubstring2 = line.substring(iD + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
        b(string, strSubstring2);
    }

    public void b(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        E e10 = F.f40566b;
        e10.checkName(name);
        e10.checkValue(value, name);
        d(name, value);
    }

    public void c(String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        int iD = StringsKt.D(line, ':', 1, 4);
        if (iD != -1) {
            String strSubstring = line.substring(0, iD);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = line.substring(iD + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            d(strSubstring, strSubstring2);
            return;
        }
        if (line.charAt(0) != ':') {
            d("", line);
            return;
        }
        String strSubstring3 = line.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
        d("", strSubstring3);
    }

    public void d(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ArrayList arrayList = this.f2516a;
        arrayList.add(name);
        arrayList.add(StringsKt.V(value).toString());
    }

    public void e(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        F.f40566b.checkName(name);
        d(name, value);
    }

    public void f(Path path) {
        ArrayList arrayList = this.f2516a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            Matrix matrix = i.f20269a;
            if (oVar != null && !oVar.f19777b) {
                i.a(path, oVar.f19780e.l() / 100.0f, oVar.f19781f.l() / 100.0f, oVar.f19782g.l() / 360.0f);
            }
        }
    }

    public boolean g(k workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        ArrayList arrayList = this.f2516a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            C c6 = C.c();
            int i7 = m.f18506a;
            CollectionsKt.J(arrayList2, null, null, null, androidx.work.impl.constraints.k.f18501a, 31);
            c6.getClass();
        }
        return arrayList2.isEmpty();
    }

    public F h() {
        return new F((String[]) this.f2516a.toArray(new String[0]));
    }

    public String i(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ArrayList arrayList = this.f2516a;
        int size = arrayList.size() - 2;
        int iA = Hf.c.a(size, 0, -2);
        if (iA > size) {
            return null;
        }
        while (!y.h(name, (String) arrayList.get(size), true)) {
            if (size == iA) {
                return null;
            }
            size -= 2;
        }
        return (String) arrayList.get(size + 1);
    }

    public void j(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2516a;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (y.h(name, (String) arrayList.get(i7), true)) {
                arrayList.remove(i7);
                arrayList.remove(i7);
                i7 -= 2;
            }
            i7 += 2;
        }
    }

    public Flow k(k spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        ArrayList arrayList = this.f2516a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((ConstraintController) obj).hasConstraint(spec)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(r.l(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ConstraintController) it.next()).track(spec.f18621j));
        }
        return X.i(new j((Flow[]) CollectionsKt.Y(arrayList3).toArray(new Flow[0]), 2));
    }

    public b(androidx.work.impl.constraints.trackers.k trackers) {
        h hVar;
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        androidx.work.impl.constraints.controllers.d dVar = new androidx.work.impl.constraints.controllers.d(trackers.f18525b);
        androidx.work.impl.constraints.controllers.d dVar2 = new androidx.work.impl.constraints.controllers.d(trackers.f18526c, (byte) 0);
        androidx.work.impl.constraints.controllers.d dVar3 = new androidx.work.impl.constraints.controllers.d(trackers.f18528e, (char) 0);
        androidx.work.impl.constraints.trackers.h hVar2 = trackers.f18527d;
        androidx.work.impl.constraints.controllers.d dVar4 = new androidx.work.impl.constraints.controllers.d(hVar2, 2);
        androidx.work.impl.constraints.controllers.d dVar5 = new androidx.work.impl.constraints.controllers.d(hVar2, 3);
        androidx.work.impl.constraints.controllers.h hVar3 = new androidx.work.impl.constraints.controllers.h(hVar2);
        androidx.work.impl.constraints.controllers.f fVar = new androidx.work.impl.constraints.controllers.f(hVar2);
        if (Build.VERSION.SDK_INT >= 28) {
            int i7 = m.f18506a;
            Context context = trackers.f18524a;
            Intrinsics.checkNotNullParameter(context, "context");
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            hVar = new h((ConnectivityManager) systemService);
        } else {
            hVar = null;
        }
        ConstraintController[] elements = {dVar, dVar2, dVar3, dVar4, dVar5, hVar3, fVar, hVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList controllers = C1847n.r(elements);
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.f2516a = controllers;
    }
}
