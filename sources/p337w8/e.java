package p337w8;

import Cg.d;
import Ef.a;
import Ff.h;
import N8.q0;
import android.util.Log;
import androidx.camera.core.impl.utils.executor.g;
import java.io.IOException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.collections.z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Dns;
import okhttp3.J;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dns f43309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f43310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f43311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Dns dns, l lVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f43309a = dns;
        this.f43310b = lVar;
        this.f43311c = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new e(this.f43309a, this.f43310b, this.f43311c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        Dns dns = this.f43309a;
        Intrinsics.f(dns, "null cannot be cast to non-null type okhttp3.dnsoverhttps.DnsOverHttps");
        d dVar = (d) dns;
        String str = this.f43311c;
        int i7 = l.f43326m;
        this.f43310b.getClass();
        J j6 = dVar.f1564c;
        try {
            return dVar.lookup(str);
        } catch (UnknownHostException unused) {
            Log.e("DnsLib", "DNS lookup failed for " + str + ": Unknown host");
            return z.f38935a;
        } catch (IOException unused2) {
            Log.e("DnsLib", "DNS lookup failed for " + str + ": I/O error");
            return z.f38935a;
        } catch (Exception e10) {
            StringBuilder sbQ = q0.q("DNS lookup failed for ", str, ": ");
            sbQ.append(e10.getMessage());
            Log.e("DnsLib", sbQ.toString());
            return z.f38935a;
        } catch (Throwable unused3) {
            return z.f38935a;
        }
    }
}
