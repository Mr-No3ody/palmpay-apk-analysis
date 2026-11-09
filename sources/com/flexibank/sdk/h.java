package com.flexibank.sdk;

import android.util.Log;
import com.flexibank.sdk.api.FlexiBankApiAccountService;
import com.flexibank.sdk.callback.FlexiBankAuthorizationCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f22306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I3.b f22308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FlexiBankAuthorizationCallback f22309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(I3.b bVar, FlexiBankAuthorizationCallback flexiBankAuthorizationCallback, String str, Continuation continuation) {
        super(2, continuation);
        this.f22308c = bVar;
        this.f22309d = flexiBankAuthorizationCallback;
        this.f22310e = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f22308c, this.f22309d, this.f22310e, continuation);
        hVar.f22307b = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        Object objF2;
        int i7 = 1;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = this.f22306a;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f22307b;
                I3.b bVar = this.f22308c;
                p355xf.o oVar = p355xf.q.f43977a;
                if (J3.a.f4489a == null) {
                    synchronized (J3.a.class) {
                        try {
                            if (J3.a.f4489a == null) {
                                J3.a.f4489a = (FlexiBankApiAccountService) p077f4.n.f36398b.getInstance$flexibank_sdk_release().a(FlexiBankApiAccountService.class);
                            }
                            Unit unit = Unit.f38893a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                FlexiBankApiAccountService flexiBankApiAccountService = J3.a.f4489a;
                Intrinsics.e(flexiBankApiAccountService);
                this.f22307b = coroutineScope;
                this.f22306a = 1;
                obj = flexiBankApiAccountService.authorize(bVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            objF = (W3.c) obj;
            p355xf.o oVar2 = p355xf.q.f43977a;
        } catch (Throwable th2) {
            p355xf.o oVar3 = p355xf.q.f43977a;
            objF = androidx.camera.core.impl.utils.executor.g.f(th2);
        }
        FlexiBankAuthorizationCallback flexiBankAuthorizationCallback = this.f22309d;
        String str = this.f22310e;
        if (!(objF instanceof p355xf.p)) {
            W3.c cVar = (W3.c) objF;
            if (cVar.c()) {
                I3.c cVar2 = (I3.c) cVar.getData();
                String token = cVar2 != null ? cVar2.getToken() : null;
                if (token == null || StringsKt.F(token)) {
                    k.f22327k.post(new g(0, flexiBankAuthorizationCallback, cVar));
                } else {
                    Object data = cVar.getData();
                    if (data == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    I3.c cVar3 = (I3.c) data;
                    try {
                        objF2 = k.f22317a.b(str, cVar3, true);
                    } catch (Throwable th3) {
                        p355xf.o oVar4 = p355xf.q.f43977a;
                        objF2 = androidx.camera.core.impl.utils.executor.g.f(th3);
                    }
                    k.f22327k.post(new androidx.emoji2.text.j(objF2, 11, flexiBankAuthorizationCallback, cVar3));
                }
            } else {
                k.f22327k.post(new g(0, flexiBankAuthorizationCallback, cVar));
            }
        }
        FlexiBankAuthorizationCallback flexiBankAuthorizationCallback2 = this.f22309d;
        Throwable thA = p355xf.q.a(objF);
        if (thA != null) {
            Log.e("FlexiBankSdk", "Authorization request failed, errorCode=NetworkFail", thA);
            k.f22327k.post(new g(i7, flexiBankAuthorizationCallback2, thA));
        }
        return Unit.f38893a;
    }
}
