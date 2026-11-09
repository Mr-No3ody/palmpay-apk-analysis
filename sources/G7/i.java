package G7;

import android.os.Handler;
import com.skydoves.balloon.Balloon;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Balloon f3116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Balloon balloon, int i7) {
        super(0);
        this.f3115a = i7;
        this.f3116b = balloon;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f3115a) {
            case 0:
                return new d(this.f3116b);
            case 1:
                return w.f3145a.getInstance(this.f3116b.f25222a);
            default:
                Balloon balloon = this.f3116b;
                balloon.f25227f = false;
                balloon.f25225d.dismiss();
                balloon.f25226e.dismiss();
                ((Handler) balloon.f25229i.getValue()).removeCallbacks((d) balloon.f25230j.getValue());
                return Unit.f38893a;
        }
    }
}
