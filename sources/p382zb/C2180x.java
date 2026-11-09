package p382zb;

import Ef.a;
import Ff.h;
import Pa.r0;
import android.content.Context;
import androidx.camera.core.impl.utils.executor.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: zb.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2180x extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f44623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44624b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180x(Context context, String str, Continuation continuation) {
        super(2, continuation);
        this.f44623a = context;
        this.f44624b = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2180x(this.f44623a, this.f44624b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2180x) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        a aVar = a.f2423a;
        g.M(obj);
        Context context = this.f44623a;
        if (context == null || (str = this.f44624b) == null || StringsKt.F(str)) {
            return null;
        }
        return r0.V(context, str);
    }
}
