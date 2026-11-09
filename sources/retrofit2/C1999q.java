package retrofit2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: retrofit2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1999q extends kotlin.jvm.internal.o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Call f41947b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1999q(Call call, int i7) {
        super(1);
        this.f41946a = i7;
        this.f41947b = call;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f41946a) {
            case 0:
                this.f41947b.cancel();
                break;
            case 1:
                this.f41947b.cancel();
                break;
            default:
                this.f41947b.cancel();
                break;
        }
        return Unit.f38893a;
    }
}
