package C0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.C1847n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class N extends K implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final L f966A = new L(null);
    public final M.o t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f967v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.t = new M.o();
    }

    @Override // C0.K
    public final I d(top.zibin.luban.io.a navDeepLinkRequest) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        I iD = super.d(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        M m7 = new M(this);
        while (m7.hasNext()) {
            I iD2 = ((K) m7.next()).d(navDeepLinkRequest);
            if (iD2 != null) {
                arrayList.add(iD2);
            }
        }
        I[] elements = {iD, (I) CollectionsKt.M(arrayList)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (I) CollectionsKt.M(C1847n.r(elements));
    }

    @Override // C0.K
    public final void e(Context context, AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.e(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, D0.a.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "context.resources.obtain…vGraphNavigator\n        )");
        h(typedArrayObtainAttributes.getResourceId(D0.a.NavGraphNavigator_startDestination, 0));
        this.f968w = K.f952o.getDisplayName(context, this.f967v);
        Unit unit = Unit.f38893a;
        typedArrayObtainAttributes.recycle();
    }

    @Override // C0.K
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof N) || !super.equals(obj)) {
            return false;
        }
        M.o oVar = this.t;
        int iE = oVar.e();
        N n10 = (N) obj;
        M.o oVar2 = n10.t;
        if (iE != oVar2.e() || this.f967v != n10.f967v) {
            return false;
        }
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        for (K k2 : Sf.m.a(new M.q(oVar, 0))) {
            if (!k2.equals(oVar2.b(k2.f961i))) {
                return false;
            }
        }
        return true;
    }

    public final void f(K node) {
        Intrinsics.checkNotNullParameter(node, "node");
        int i7 = node.f961i;
        String str = node.f962j;
        if (i7 == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        String str2 = this.f962j;
        if (str2 != null && Intrinsics.c(str, str2)) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (i7 == this.f961i) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        M.o oVar = this.t;
        K k2 = (K) oVar.b(i7);
        if (k2 == node) {
            return;
        }
        if (node.f955b != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (k2 != null) {
            k2.f955b = null;
        }
        node.f955b = this;
        oVar.d(node.f961i, node);
    }

    public final K g(int i7, boolean z3) {
        N n10;
        K k2 = (K) this.t.b(i7);
        if (k2 != null) {
            return k2;
        }
        if (!z3 || (n10 = this.f955b) == null) {
            return null;
        }
        return n10.g(i7, true);
    }

    public final void h(int i7) {
        if (i7 != this.f961i) {
            this.f967v = i7;
            this.f968w = null;
        } else {
            throw new IllegalArgumentException(("Start destination " + i7 + " cannot use the same id as the graph " + this).toString());
        }
    }

    @Override // C0.K
    public final int hashCode() {
        int iC = this.f967v;
        M.o oVar = this.t;
        int iE = oVar.e();
        for (int i7 = 0; i7 < iE; i7++) {
            iC = (((iC * 31) + oVar.c(i7)) * 31) + ((K) oVar.f(i7)).hashCode();
        }
        return iC;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new M(this);
    }

    @Override // C0.K
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        K kG = g(this.f967v, true);
        sb2.append(" startDestination=");
        if (kG == null) {
            String str = this.f968w;
            if (str != null) {
                sb2.append(str);
            } else {
                sb2.append("0x" + Integer.toHexString(this.f967v));
            }
        } else {
            sb2.append("{");
            sb2.append(kG.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
