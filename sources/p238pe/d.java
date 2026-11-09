package p238pe;

import Bc.q;
import Ef.a;
import Ff.h;
import android.widget.TextView;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.ui.activity.paycode.PayCodeTransactionResultActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PayCodeTransactionResultActivity f41304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PayCodeTransactionResultActivity payCodeTransactionResultActivity, String str, Continuation continuation) {
        super(1, continuation);
        this.f41304a = payCodeTransactionResultActivity;
        this.f41305b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new d(this.f41304a, this.f41305b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((d) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        TextView orderStatusTv;
        a aVar = a.f2423a;
        g.M(obj);
        PayCodeTransactionResultActivity payCodeTransactionResultActivity = this.f41304a;
        q qVar = payCodeTransactionResultActivity.f34802v;
        if (qVar != null && (orderStatusTv = ((TransactionResultHeaderModel) qVar.f823o).getOrderStatusTv()) != null) {
            orderStatusTv.setText(payCodeTransactionResultActivity.getString(v.cv_processing));
        }
        q qVar2 = payCodeTransactionResultActivity.f34802v;
        if (qVar2 != null) {
            ((TransactionResultHeaderModel) qVar2.f823o).h(this.f41305b);
        }
        return Unit.f38893a;
    }
}
