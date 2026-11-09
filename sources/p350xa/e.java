package p350xa;

import Ef.a;
import F6.d;
import Ff.h;
import android.os.SystemClock;
import androidx.camera.core.impl.utils.executor.g;
import com.google.net.cronet.okhttptransport.CronetNqeKey;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.apm.network.bean.NQEMetrics;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f43720a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Map map, Continuation continuation) {
        super(2, continuation);
        this.f43720a = map;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f43720a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Long lU;
        Long lU2;
        a aVar = a.f2423a;
        g.M(obj);
        Map map = this.f43720a;
        if (map == null || map.isEmpty()) {
            return Unit.f38893a;
        }
        try {
            NQEMetrics nQEMetrics = new NQEMetrics();
            String str = (String) map.get(CronetNqeKey.KEY_HTTP_RTT);
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null && (lU2 = StringsKt.U(str)) != null) {
                    nQEMetrics.setHttpRTT(new Long(lU2.longValue()));
                }
            }
            String str2 = (String) map.get(CronetNqeKey.KEY_TRANSPORT_RTT);
            if (str2 != null) {
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null && (lU = StringsKt.U(str2)) != null) {
                    nQEMetrics.setTransportRTT(new Long(lU.longValue()));
                }
            }
            String str3 = (String) map.get("success");
            if (str3 != null) {
                if (str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 != null) {
                    nQEMetrics.setSuccessed(str3.equals("1"));
                }
            }
            String str4 = (String) map.get(CronetNqeKey.KEY_PROTOCOL);
            if (str4 != null) {
                String str5 = str4.length() > 0 ? str4 : null;
                if (str5 != null) {
                    nQEMetrics.setProtocol(str5);
                }
            }
            nQEMetrics.setType(1);
            nQEMetrics.setElapsedTime(SystemClock.elapsedRealtime());
            d.h("CronetWrapInterceptor", 5, "setCronetMetricToNQE " + nQEMetrics.getIsSuccessed());
            NQEManager.INSTANCE.addMetrics(nQEMetrics);
        } catch (Exception e10) {
            d.h("CronetWrapInterceptor", 5, "Error setting Cronet metrics", e10);
        }
        return Unit.f38893a;
    }
}
