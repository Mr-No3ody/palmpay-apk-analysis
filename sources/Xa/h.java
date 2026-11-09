package Xa;

import C0.G;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f11101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f11104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f11105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, Context context, Continuation continuation) {
        super(2, continuation);
        this.f11104d = list;
        this.f11105e = context;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f11104d, this.f11105e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0046 -> B:13:0x0025). Please report as a decompilation issue!!! */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        String str;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f11103c;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            it = this.f11104d.iterator();
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.f11102b;
            it = this.f11101a;
            try {
                androidx.camera.core.impl.utils.executor.g.M(obj);
            } catch (Exception e10) {
                F6.d.c("WebResPreloadMgr", G.o("preload url failed: ", str), e10);
            }
        }
        while (it.hasNext()) {
            str = (String) it.next();
            i iVar = i.f11106a;
            Context context = this.f11105e;
            Intrinsics.e(context);
            this.f11101a = it;
            this.f11102b = str;
            this.f11103c = 1;
            if (i.c(context, str, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f38893a;
    }
}
