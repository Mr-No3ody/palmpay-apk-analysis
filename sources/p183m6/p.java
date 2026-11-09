package p183m6;

import Ef.a;
import Ff.h;
import Wf.AbstractC0780y;
import androidx.camera.core.impl.utils.executor.g;
import com.palmpay.lib.config.OnFetchResultListener;
import com.palmpay.lib.config.api.bean.ConfigRsp;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f39528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f39529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ WeakReference f39530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, List list, WeakReference weakReference, Continuation continuation) {
        super(2, continuation);
        this.f39528b = qVar;
        this.f39529c = list;
        this.f39530d = weakReference;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.f39528b, this.f39529c, this.f39530d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.f2423a;
        int i7 = this.f39527a;
        if (i7 == 0) {
            g.M(obj);
            q qVar = this.f39528b;
            i iVar = qVar.f39531e;
            String str = qVar.f39532f;
            this.f39527a = 1;
            iVar.getClass();
            obj = AbstractC0780y.s(iVar.f39514g, new h(iVar, str, this.f39529c, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        ConfigRsp configRsp = (ConfigRsp) obj;
        OnFetchResultListener onFetchResultListener = (OnFetchResultListener) this.f39530d.get();
        if (onFetchResultListener != null) {
            onFetchResultListener.onComplete(configRsp != null);
        }
        return Unit.f38893a;
    }
}
