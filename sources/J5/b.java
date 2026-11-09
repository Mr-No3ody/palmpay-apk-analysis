package J5;

import com.mikepenz.iconics.IconicsDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Integer f4515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f4516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Integer f4517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Integer num, Integer num2, Integer num3, int i7) {
        super(1);
        this.f4515a = num;
        this.f4516b = num2;
        this.f4517c = num3;
        this.f4518d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IconicsDrawable applyShadow = (IconicsDrawable) obj;
        Intrinsics.checkNotNullParameter(applyShadow, "$this$applyShadow");
        applyShadow.f23570B = this.f4515a.intValue();
        applyShadow.p();
        applyShadow.f23571C = this.f4516b.intValue();
        applyShadow.p();
        applyShadow.f23572D = this.f4517c.intValue();
        applyShadow.p();
        applyShadow.f23573E = this.f4518d;
        applyShadow.p();
        applyShadow.d();
        return Unit.f38893a;
    }
}
