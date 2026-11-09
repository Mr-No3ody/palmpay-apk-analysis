package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.InitializerApi;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: j0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1770c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f38021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1770c(List list, Continuation continuation) {
        super(2, continuation);
        this.f38021c = list;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1770c c1770c = new C1770c(this.f38021c, continuation);
        c1770c.f38020b = obj;
        return c1770c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1770c) create((InitializerApi) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f38019a;
        if (i7 == 0) {
            g.M(obj);
            InitializerApi initializerApi = (InitializerApi) this.f38020b;
            C1774g c1774g = AbstractC1775h.f38045a;
            this.f38019a = 1;
            if (c1774g.runMigrations(this.f38021c, initializerApi, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
