package Ae;

import android.widget.TextView;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.ui.dialog.SendMoneyHandlerHomeDialog;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonBeanResult f305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SendMoneyHandlerHomeDialog f306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CommonBeanResult commonBeanResult, SendMoneyHandlerHomeDialog sendMoneyHandlerHomeDialog, Continuation continuation) {
        super(2, continuation);
        this.f305a = commonBeanResult;
        this.f306b = sendMoneyHandlerHomeDialog;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f305a, this.f306b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        CommonBeanResult commonBeanResult = this.f305a;
        if (!commonBeanResult.isSuccess()) {
            ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
            return Unit.f38893a;
        }
        TextView text3 = this.f306b.getText3();
        if (text3 == null) {
            return null;
        }
        text3.setOnClickListener(new A8.b(commonBeanResult, 13));
        return Unit.f38893a;
    }
}
