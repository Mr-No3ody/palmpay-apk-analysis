package G0;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Context context, int i7) {
        super(1);
        this.f2887a = i7;
        this.f2888b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2887a) {
            case 0:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = this.f2888b;
                Intrinsics.checkNotNullParameter(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
                return new f(measurementManager);
            default:
                androidx.camera.core.c cameraX = (androidx.camera.core.c) obj;
                androidx.camera.lifecycle.h hVar = androidx.camera.lifecycle.h.f14528j;
                Intrinsics.checkNotNullExpressionValue(cameraX, "cameraX");
                hVar.f14534f = cameraX;
                Context contextR = com.palmpay.lib.apm.launchcounter.util.d.r(this.f2888b);
                Intrinsics.checkNotNullExpressionValue(contextR, "getApplicationContext(context)");
                hVar.f14535g = contextR;
                return hVar;
        }
    }
}
