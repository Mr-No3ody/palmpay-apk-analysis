package p102ge;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.chromium.support_lib_boundary.util.b;

/* JADX INFO: renamed from: ge.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1732e extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Exception f37210a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732e(Exception exc, Continuation continuation) {
        super(2, continuation);
        this.f37210a = exc;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1732e(this.f37210a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1732e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        ToastUtils.showLong(b.W(this.f37210a), new Object[0]);
        return Unit.f38893a;
    }
}
