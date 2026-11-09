package Je;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GetMsgRsp.DataBean.ListBean f4806b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GetMsgRsp.DataBean.ListBean listBean, Continuation continuation) {
        super(2, continuation);
        this.f4806b = listBean;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f4806b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f4805a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
                GetMsgRsp.DataBean.ListBean listBean = this.f4806b;
                String str = listBean != null ? listBean.msgObjectId : null;
                String str2 = listBean != null ? listBean.msgScene : null;
                this.f4805a = 1;
                obj = iApiMainService.markMessageAsRead(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonResult commonResult = (CommonResult) obj;
            if (!commonResult.isSuccess()) {
                F6.d.h("HomeMessageViewHolder", 3, "markMessageAsRead: " + commonResult.getRespMsg());
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }
}
