package Ke;

import Bc.q;
import android.widget.ImageView;
import com.horcrux.svg.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f5439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f5440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.f5439a = hVar;
        this.f5440b = z3;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.f5439a, this.f5440b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        q qVar;
        ImageView imageView;
        ImageView imageView2;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        h hVar = this.f5439a;
        q qVar2 = (q) hVar.f5446d;
        if (qVar2 != null && (imageView2 = (ImageView) qVar2.f820g) != null) {
            p220oa.h.s(imageView2, this.f5440b);
        }
        if (d0.t() && (qVar = (q) hVar.f5446d) != null && (imageView = (ImageView) qVar.f820g) != null) {
            p220oa.h.c(imageView);
        }
        return Unit.f38893a;
    }
}
