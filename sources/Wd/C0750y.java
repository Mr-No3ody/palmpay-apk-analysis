package Wd;

import Rd.C0598n;
import android.widget.TextView;
import com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: Wd.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0750y extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BillerTransactionResultActivity f10794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10795b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0750y(BillerTransactionResultActivity billerTransactionResultActivity, String str, Continuation continuation) {
        super(1, continuation);
        this.f10794a = billerTransactionResultActivity;
        this.f10795b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0750y(this.f10794a, this.f10795b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0750y) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TextView orderStatusTv;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        int i7 = BillerTransactionResultActivity.f34181Y;
        BillerTransactionResultActivity billerTransactionResultActivity = this.f10794a;
        C0598n c0598n = (C0598n) billerTransactionResultActivity.f27334c;
        if (c0598n != null && (orderStatusTv = c0598n.f8408f.getOrderStatusTv()) != null) {
            orderStatusTv.setText(billerTransactionResultActivity.getString(com.transsnet.palmpay.custom_view.v.cv_processing));
        }
        C0598n c0598n2 = (C0598n) billerTransactionResultActivity.f27334c;
        if (c0598n2 != null) {
            c0598n2.f8408f.h(this.f10795b);
        }
        return Unit.f38893a;
    }
}
