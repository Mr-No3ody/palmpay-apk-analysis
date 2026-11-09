package p135j0;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import androidx.datastore.core.DataMigration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: j0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1772e extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataMigration f38033b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772e(DataMigration dataMigration, Continuation continuation) {
        super(1, continuation);
        this.f38033b = dataMigration;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C1772e(this.f38033b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C1772e) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f38032a;
        if (i7 == 0) {
            g.M(obj);
            this.f38032a = 1;
            if (this.f38033b.cleanUp(this) == aVar) {
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
