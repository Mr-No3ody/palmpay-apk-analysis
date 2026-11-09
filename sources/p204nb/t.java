package p204nb;

import Wf.C0765i;
import androidx.camera.core.impl.utils.executor.g;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2128g;
import p355xf.o;
import p355xf.q;
import retrofit2.C1993k;
import retrofit2.C1998p;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.K;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements FlexiBankAuthorizationCallback, Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0765i f39925a;

    public /* synthetic */ t(C0765i c0765i) {
        this.f39925a = c0765i;
    }

    @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
    public void onError(String str, String str2) {
        C0765i c0765i = this.f39925a;
        if (c0765i.isActive()) {
            o oVar = q.f43977a;
            c0765i.resumeWith(new r(s.f39923c, str2));
        }
    }

    @Override // retrofit2.Callback
    public void onFailure(Call call, Throwable t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "t");
        o oVar = q.f43977a;
        this.f39925a.resumeWith(g.f(t));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call call, K response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zIsSuccessful = response.f41873a.isSuccessful();
        C0765i c0765i = this.f39925a;
        if (!zIsSuccessful) {
            o oVar = q.f43977a;
            c0765i.resumeWith(g.f(new C1993k(response)));
            return;
        }
        Object obj = response.f41874b;
        if (obj != null) {
            o oVar2 = q.f43977a;
            c0765i.resumeWith(obj);
            return;
        }
        Object objC = call.request().c(C1998p.class);
        Intrinsics.e(objC);
        C1998p c1998p = (C1998p) objC;
        C2128g c2128g = new C2128g("Response from " + c1998p.f41942a.getName() + '.' + c1998p.f41944c.getName() + " was null but response body type was declared as non-null");
        o oVar3 = q.f43977a;
        c0765i.resumeWith(g.f(c2128g));
    }

    @Override // com.flexibank.sdk.callback.FlexiBankAuthorizationCallback
    public void onSuccess(String str, String str2, String str3, boolean z3, boolean z8) {
        C0765i c0765i = this.f39925a;
        if (c0765i.isActive()) {
            o oVar = q.f43977a;
            c0765i.resumeWith(new r(s.f39921a, null));
        }
    }
}
