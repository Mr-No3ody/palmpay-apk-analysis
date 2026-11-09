package p112h6;

import Ef.a;
import Ff.h;
import Wf.D;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.apm.network.NQEManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37348a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f37348a;
        if (i7 == 0) {
            g.M(obj);
            this.f37348a = 1;
            if (D.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        ConnectivityManager connectivityManager = NQEManager.connectivityManager;
        if (connectivityManager != null) {
            ConcurrentHashMap concurrentHashMap = NQEManager.networkConnectAvailable;
            Integer num = new Integer(1);
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            concurrentHashMap.put(num, Boolean.valueOf(networkCapabilities != null ? networkCapabilities.hasTransport(1) : false));
            ConcurrentHashMap concurrentHashMap2 = NQEManager.networkConnectAvailable;
            Integer num2 = new Integer(0);
            NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            concurrentHashMap2.put(num2, Boolean.valueOf(networkCapabilities2 != null ? networkCapabilities2.hasTransport(0) : false));
            Object obj2 = NQEManager.networkConnectAvailable.get(new Integer(1));
            Object obj3 = NQEManager.networkConnectAvailable.get(new Integer(0));
            Objects.toString(obj2);
            Objects.toString(obj3);
            Object obj4 = NQEManager.networkConnectAvailable.get(new Integer(1));
            Boolean bool = Boolean.FALSE;
            NQEManager.networkState = (Intrinsics.c(obj4, bool) && Intrinsics.c(NQEManager.networkConnectAvailable.get(new Integer(0)), bool)) ? 1 : 0;
            NQEManager.INSTANCE.notifyNetworkStateChanged();
        }
        return Unit.f38893a;
    }
}
