package p102ge;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.ui.activity.AllFuncationActivityV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: ge.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1729b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f37206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AllFuncationActivityV2 f37207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729b(AllFuncationActivityV2 allFuncationActivityV2, Continuation continuation, boolean z3) {
        super(2, continuation);
        this.f37206a = z3;
        this.f37207b = allFuncationActivityV2;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1729b(this.f37207b, continuation, this.f37206a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1729b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        if (this.f37206a) {
            this.f37207b.showLoadingDialog(true);
        }
        return Unit.f38893a;
    }
}
