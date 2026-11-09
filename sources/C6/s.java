package C6;

import com.snail.antifake.jni.EmulatorDetectUtil;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends Ff.h implements Function2 {
    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zIsEmulatorFromAll;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        try {
            p232p6.p pVar = p232p6.p.f41234a;
            zIsEmulatorFromAll = EmulatorDetectUtil.isEmulatorFromAll(p232p6.p.f());
        } catch (Exception unused) {
            zIsEmulatorFromAll = false;
        }
        return Boolean.valueOf(zIsEmulatorFromAll);
    }
}
