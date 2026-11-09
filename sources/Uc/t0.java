package Uc;

import android.widget.TextView;
import com.transsnet.palmpay.p2pcash.ui.atm.NearbyAgent2Page;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9725b;

    public /* synthetic */ t0(Object obj, int i7) {
        this.f9724a = i7;
        this.f9725b = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f9724a) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                long jLongValue3 = ((Long) obj3).longValue();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jLongValue2);
                int i7 = calendar.get(11);
                calendar.setTimeInMillis(jLongValue3);
                int i10 = calendar.get(11);
                String strN = com.airbnb.lottie.model.layer.d.n(new Object[]{androidx.camera.core.impl.utils.executor.g.m(jLongValue, jLongValue2), i7 <= 12 ? androidx.camera.video.u.g(i7, "am") : androidx.camera.video.u.g(i7 - 12, "pm"), i10 <= 12 ? androidx.camera.video.u.g(i10, "am") : androidx.camera.video.u.g(i10 - 12, "pm")}, 3, "%1$s %2$s-%3$s", "format(...)");
                Object value = ((NearbyAgent2Page) this.f9725b).f32909o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                ((TextView) value).setText(strN);
                return Unit.f38893a;
            case 1:
                ((Function1) this.f9725b).invoke((Throwable) obj);
                return Unit.f38893a;
            case 2:
                return new Z6.b(1, (p072eg.e) this.f9725b, obj2);
            default:
                ((p072eg.i) this.f9725b).release();
                return Unit.f38893a;
        }
    }
}
