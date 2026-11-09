package C0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0111c extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0111c f1005b = new C0111c(1, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0111c f1006c = new C0111c(1, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0111c f1007d = new C0111c(1, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0111c f1008e = new C0111c(1, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0111c f1009f = new C0111c(1, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0111c f1010g = new C0111c(1, 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0111c f1011i = new C0111c(1, 6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C0111c f1012j = new C0111c(1, 7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0111c f1013o = new C0111c(1, 8);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0111c f1014p = new C0111c(1, 9);
    public static final C0111c t = new C0111c(1, 10);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0111c f1015v = new C0111c(1, 11);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1016a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0111c(int i7, int i10) {
        super(i7);
        this.f1016a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1016a) {
            case 0:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context it2 = (Context) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 2:
                V navOptions = (V) obj;
                Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
                navOptions.f994c = true;
                return Unit.f38893a;
            case 3:
                K destination = (K) obj;
                Intrinsics.checkNotNullParameter(destination, "destination");
                N n10 = destination.f955b;
                if (n10 == null || n10.f967v != destination.f961i) {
                    return null;
                }
                return n10;
            case 4:
                K destination2 = (K) obj;
                Intrinsics.checkNotNullParameter(destination2, "destination");
                N n11 = destination2.f955b;
                if (n11 == null || n11.f967v != destination2.f961i) {
                    return null;
                }
                return n11;
            case 5:
                C0112d anim = (C0112d) obj;
                Intrinsics.checkNotNullParameter(anim, "$this$anim");
                anim.f1018a = 0;
                anim.f1019b = 0;
                return Unit.f38893a;
            case 6:
                h0 popUpTo = (h0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.f1045a = true;
                return Unit.f38893a;
            case 7:
                K it3 = (K) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return it3.f955b;
            case 8:
                K it4 = (K) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (!(it4 instanceof N)) {
                    return null;
                }
                N n12 = (N) it4;
                return n12.g(n12.f967v, true);
            case 9:
                View it5 = (View) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                Object parent = it5.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 10:
                View it6 = (View) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                Object tag = it6.getTag(i0.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (AbstractC0130w) ((WeakReference) tag).get();
                }
                if (tag instanceof AbstractC0130w) {
                    return (AbstractC0130w) tag;
                }
                return null;
            default:
                V navOptions2 = (V) obj;
                Intrinsics.checkNotNullParameter(navOptions2, "$this$navOptions");
                navOptions2.f993b = true;
                return Unit.f38893a;
        }
    }
}
