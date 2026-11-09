package p350xa;

import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import com.google.net.cronet.okhttptransport.CronetLogHelper;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p042cg.e;
import p042cg.f;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements CronetLogHelper.OnMetricCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f43719a;

    public d(f fVar) {
        this.f43719a = fVar;
    }

    @Override // com.google.net.cronet.okhttptransport.CronetLogHelper.OnMetricCallback
    public final void onMetric(Map metricsMap) {
        Intrinsics.checkNotNullParameter(metricsMap, "metricsMap");
        this.f43719a.getClass();
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, e.f19009c, null, new e(metricsMap, null), 2);
    }
}
