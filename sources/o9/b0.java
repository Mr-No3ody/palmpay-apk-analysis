package o9;

import com.transsnet.palmpay.airtime.network.IAirtimeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(String str, Continuation continuation) {
        super(1, continuation);
        this.f40163b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new b0(this.f40163b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((b0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f40162a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
            return obj;
        }
        androidx.camera.core.impl.utils.executor.g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        String str = this.f40163b;
        Intrinsics.e(str);
        this.f40162a = 1;
        Object objQueryScheduleList = iAirtimeService.queryScheduleList(str, this);
        return objQueryScheduleList == aVar ? aVar : objQueryScheduleList;
    }
}
