package A6;

import N8.q0;
import Wf.C0775t;
import android.text.TextUtils;
import com.horcrux.svg.d0;
import com.palmpay.lib.liveness.model.LiveIDException;
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import okhttp3.J;
import okhttp3.Y;
import p355xf.C2126e;
import retrofit2.C1993k;
import retrofit2.K;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f60b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Function1 function1) {
        C0775t c0775t = C0775t.f10898a;
        this.f60b = function1;
        super(c0775t);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        LiveIDException liveIDException;
        Y y8;
        J j6;
        th.printStackTrace();
        if (th instanceof IOException) {
            try {
                if (th.getCause() instanceof C1993k) {
                    Throwable cause = th.getCause();
                    Intrinsics.f(cause, "null cannot be cast to non-null type retrofit2.HttpException");
                    C1993k c1993k = (C1993k) cause;
                    int i7 = c1993k.f41932a;
                    String strValueOf = String.valueOf(i7);
                    p280s6.a.f42044a.getInstance().getClass();
                    liveIDException = new LiveIDException(strValueOf, p280s6.a.a("processing_net_error") + "[" + i7 + "]", c1993k.f41933b, null, 8, null);
                } else {
                    String simpleName = null;
                    p280s6.a.f42044a.getInstance().getClass();
                    String strA = p280s6.a.a("smart_internal_error");
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        simpleName = cause2.getClass().getSimpleName();
                    }
                    liveIDException = new LiveIDException("-99", strA + "[" + simpleName + "]", th.getMessage(), null, 8, null);
                }
                th = liveIDException;
            } catch (Exception e10) {
                e10.printStackTrace();
                C2126e.a(th, e10);
                th = (Exception) th;
            }
        } else if (th instanceof C1993k) {
            C1993k c1993k2 = (C1993k) th;
            K k2 = c1993k2.f41934c;
            String strValueOf2 = String.valueOf((k2 == null || (y8 = k2.f41873a.f40728a) == null || (j6 = y8.f40685a) == null) ? null : j6.l());
            boolean zIsEmpty = TextUtils.isEmpty(strValueOf2);
            String strY = c1993k2.f41933b;
            if (!zIsEmpty) {
                strY = q0.y(strY, " when call ", strValueOf2);
            }
            int i10 = c1993k2.f41932a;
            th = new LiveIDException(String.valueOf(i10), d0.o(p280s6.a.f42044a, "processing_net_error") + "[" + i10 + "]", strY, null, 8, null);
        }
        this.f60b.invoke(th);
    }
}
