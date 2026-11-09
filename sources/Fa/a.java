package Fa;

import Ff.h;
import Pa.T;
import android.content.Context;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.QueryUnReadMsgCntReq;
import com.transsnet.palmpay.core.bean.rsp.UnReadMsgCntRsp;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.service.UpdateBadgeService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UpdateBadgeService f2631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UpdateBadgeService updateBadgeService, Continuation continuation) {
        super(2, continuation);
        this.f2631b = updateBadgeService;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f2631b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2630a;
        try {
            if (i7 == 0) {
                g.M(obj);
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                QueryUnReadMsgCntReq queryUnReadMsgCntReq = new QueryUnReadMsgCntReq();
                this.f2630a = 1;
                obj = payApiService.queryUnReadMessageCount(queryUnReadMsgCntReq, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.M(obj);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            if (commonBeanResult != null) {
                UpdateBadgeService updateBadgeService = this.f2631b;
                if (commonBeanResult.isSuccess()) {
                    UnReadMsgCntRsp unReadMsgCntRsp = (UnReadMsgCntRsp) commonBeanResult.data;
                    int total = unReadMsgCntRsp != null ? unReadMsgCntRsp.getTotal() : 0;
                    Context context = updateBadgeService.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                    Intrinsics.checkNotNullParameter(context, "context");
                    T.b(-4).execute(new B3.a(total, context, 3));
                }
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }
}
