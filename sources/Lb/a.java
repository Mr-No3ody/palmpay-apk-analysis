package Lb;

import Ff.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AsyncViewStub f5611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f5612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AsyncViewStub asyncViewStub, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f5611a = asyncViewStub;
        this.f5612b = function1;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f5611a, this.f5612b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        g.M(obj);
        System.currentTimeMillis();
        AsyncViewStub asyncViewStub = this.f5611a;
        View viewInflate = LayoutInflater.from(asyncViewStub.getContext()).inflate(asyncViewStub.f31185a, (ViewGroup) null);
        int i7 = AsyncViewStub.f31184d;
        Intrinsics.e(viewInflate);
        asyncViewStub.a(viewInflate, this.f5612b);
        return Unit.f38893a;
    }
}
