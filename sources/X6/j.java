package X6;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11015f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f11018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function3 f11020e;

    static {
        new i(null);
    }

    public j(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11016a = context;
    }

    public final k a() {
        Context context = this.f11016a;
        Intrinsics.checkNotNullParameter(context, "context");
        k kVar = new k(context);
        new ArrayList();
        kVar.f11022e = this.f11018c;
        kVar.f11005c = this.f11017b;
        kVar.f11023f = this.f11020e;
        Integer numValueOf = Integer.valueOf(this.f11019d);
        kVar.f11024g = numValueOf;
        N6.d dVar = kVar.f11021d;
        if (dVar != null) {
            dVar.f6095c.b(numValueOf);
        }
        return kVar;
    }
}
