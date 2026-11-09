package V0;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9907c;

    public V(Context context) {
        this.f9905a = context;
    }

    public X a() {
        X xB = b();
        C0689h c0689h = ((androidx.work.impl.model.k) this.f9906b).f18621j;
        boolean z3 = !c0689h.f9948i.isEmpty() || c0689h.f9944e || c0689h.f9942c || c0689h.f9943d;
        androidx.work.impl.model.k kVar = (androidx.work.impl.model.k) this.f9906b;
        if (kVar.f18628q) {
            if (z3) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (kVar.f18618g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (kVar.f18634x == null) {
            kVar.f18634x = X.f9908d.deriveTraceTagFromClassName(kVar.f18614c);
        }
        UUID id2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(id2, "randomUUID()");
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f9905a = id2;
        String newId = id2.toString();
        Intrinsics.checkNotNullExpressionValue(newId, "id.toString()");
        androidx.work.impl.model.k other = (androidx.work.impl.model.k) this.f9906b;
        Intrinsics.checkNotNullParameter(newId, "newId");
        Intrinsics.checkNotNullParameter(other, "other");
        this.f9906b = new androidx.work.impl.model.k(newId, other.f18613b, other.f18614c, other.f18615d, new C0695n(other.f18616e), new C0695n(other.f18617f), other.f18618g, other.f18619h, other.f18620i, new C0689h(other.f18621j), other.f18622k, other.f18623l, other.f18624m, other.f18625n, other.f18626o, other.f18627p, other.f18628q, other.f18629r, other.f18630s, other.f18631u, other.f18632v, other.f18633w, other.f18634x, 524288);
        return xB;
    }

    public abstract X b();

    public MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (((M.n) this.f9906b) == null) {
            this.f9906b = new M.n(0);
        }
        MenuItem menuItem2 = (MenuItem) ((M.n) this.f9906b).get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        androidx.appcompat.view.menu.q qVar = new androidx.appcompat.view.menu.q((Context) this.f9905a, supportMenuItem);
        ((M.n) this.f9906b).put(supportMenuItem, qVar);
        return qVar;
    }

    public SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (((M.n) this.f9907c) == null) {
            this.f9907c = new M.n(0);
        }
        SubMenu subMenu2 = (SubMenu) ((M.n) this.f9907c).get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        androidx.appcompat.view.menu.x xVar = new androidx.appcompat.view.menu.x((Context) this.f9905a, supportSubMenu);
        ((M.n) this.f9907c).put(supportSubMenu, xVar);
        return xVar;
    }

    public V(Class workerClass) {
        Intrinsics.checkNotNullParameter(workerClass, "workerClass");
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        this.f9905a = uuidRandomUUID;
        String id2 = ((UUID) this.f9905a).toString();
        Intrinsics.checkNotNullExpressionValue(id2, "id.toString()");
        String workerClassName_ = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(workerClassName_, "workerClass.name");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workerClassName_, "workerClassName_");
        this.f9906b = new androidx.work.impl.model.k(id2, (Q) null, workerClassName_, (String) null, (C0695n) null, (C0695n) null, 0L, 0L, 0L, (C0689h) null, 0, (EnumC0682a) null, 0L, 0L, 0L, 0L, false, (K) null, 0, 0L, 0, 0, (String) null, 16777210);
        String name = workerClass.getName();
        Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
        String[] elements = {name};
        Intrinsics.checkNotNullParameter(elements, "elements");
        LinkedHashSet destination = new LinkedHashSet(kotlin.collections.F.a(1));
        Intrinsics.checkNotNullParameter(elements, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.add(elements[0]);
        this.f9907c = destination;
    }
}
