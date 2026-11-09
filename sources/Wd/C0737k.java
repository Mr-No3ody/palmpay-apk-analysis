package Wd;

import Rd.C0608y;
import android.widget.TextView;
import com.transsnet.palmpay.teller.ui.activity.BillerRelayPageActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Wd.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0737k extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ long f10765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillerRelayPageActivity f10766b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0737k(BillerRelayPageActivity billerRelayPageActivity, Continuation continuation) {
        super(2, continuation);
        this.f10766b = billerRelayPageActivity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0737k c0737k = new C0737k(this.f10766b, continuation);
        c0737k.f10765a = ((Number) obj).longValue();
        return c0737k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0737k) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TextView textView;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        long j6 = this.f10765a;
        int i7 = BillerRelayPageActivity.f34167j;
        C0608y c0608y = (C0608y) this.f10766b.f27334c;
        if (c0608y != null && (textView = c0608y.f8553f) != null) {
            textView.setText((j6 / ((long) 1000)) + "s");
        }
        return Unit.f38893a;
    }
}
