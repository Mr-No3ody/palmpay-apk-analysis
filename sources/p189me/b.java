package p189me;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.rsp.UnReadMsgCntRsp;
import com.transsnet.palmpay.ui.activity.message.NotificationListV2Activity;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonBeanResult f39650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationListV2Activity f39651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CommonBeanResult commonBeanResult, NotificationListV2Activity notificationListV2Activity, Continuation continuation) {
        super(2, continuation);
        this.f39650a = commonBeanResult;
        this.f39651b = notificationListV2Activity;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f39650a, this.f39651b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        g.M(obj);
        CommonBeanResult commonBeanResult = this.f39650a;
        if (!commonBeanResult.isSuccess()) {
            ToastUtils.showLong(commonBeanResult.getRespMsg(), new Object[0]);
            return Unit.f38893a;
        }
        UnReadMsgCntRsp unReadMsgCntRsp = (UnReadMsgCntRsp) commonBeanResult.data;
        if (unReadMsgCntRsp != null) {
            NotificationListV2Activity notificationListV2Activity = this.f39651b;
            O2.a aVar2 = notificationListV2Activity.f34751c;
            if (aVar2 != null) {
                aVar2.i(unReadMsgCntRsp.paymentCount);
            }
            O2.a aVar3 = notificationListV2Activity.f34752d;
            if (aVar3 != null) {
                aVar3.i(unReadMsgCntRsp.getMsgCount());
                return Unit.f38893a;
            }
        }
        return null;
    }
}
