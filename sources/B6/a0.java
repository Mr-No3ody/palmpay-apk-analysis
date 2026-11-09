package B6;

import E.AbstractC0198c;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Size;
import com.palmpay.lib.liveness.LiveID$ILiveIDMonitor;
import java.io.File;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bitmap f445b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f444a = b0Var;
        this.f445b = bitmap;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a0(this.f444a, this.f445b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        g0 g0Var;
        Object value;
        File file;
        Bitmap bitmapCreateBitmap;
        LiveID$ILiveIDMonitor liveID$ILiveIDMonitor;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        b0 b0Var = this.f444a;
        int i7 = b0Var.f454d;
        Bitmap bitmap = this.f445b;
        Size size = b0Var.f456f;
        if (i7 == 2) {
            File fileJ = AbstractC0198c.j("selfie");
            b0Var.f462v = fileJ;
            AbstractC0198c.U(bitmap, fileJ, size);
        } else {
            File fileJ2 = AbstractC0198c.j("selfie");
            b0Var.f462v = fileJ2;
            AbstractC0198c.T(bitmap, fileJ2, size);
        }
        do {
            g0Var = b0Var.f459j;
            value = g0Var.getValue();
            file = b0Var.f462v;
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        } while (!g0Var.compareAndSet(value, O.a((O) value, null, 0.0f, false, file, bitmapCreateBitmap, 3)));
        p232p6.p.f41245l.collectLiveness();
        r6.a aVar2 = p232p6.p.f41237d;
        if (aVar2 != null && (liveID$ILiveIDMonitor = aVar2.f41573e) != null) {
            p320v6.d dVar = p320v6.e.f43077e;
            String str = dVar.f43071a;
            Pair pair = new Pair("event_desc", dVar.f43072b);
            Integer num = p232p6.p.f41243j;
            Pair pair2 = new Pair("scene", new Integer(num != null ? num.intValue() : -1));
            Pair pair3 = new Pair("total", new Integer(b0Var.f455e));
            String str2 = b0Var.f452A;
            if (str2 == null) {
                str2 = "";
            }
            Pair pair4 = new Pair("transactionId", str2);
            String str3 = p232p6.p.f41242i;
            liveID$ILiveIDMonitor.report(str, kotlin.collections.G.h(pair, pair2, pair3, pair4, new Pair("uuid", str3 != null ? str3 : "")));
        }
        return Unit.f38893a;
    }
}
