package Ga;

import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.bean.CommonListResultV2;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.req.QueryLatestPushReq;
import com.transsnet.palmpay.core.network.PayApiService;
import com.transsnet.palmpay.core.provider.IPushModule;
import com.transsnet.palmpay.util.SPUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Continuation continuation) {
        super(2, continuation);
        this.f3193b = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f3193b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f3192a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                QueryLatestPushReq queryLatestPushReq = new QueryLatestPushReq();
                queryLatestPushReq.memberId = this.f3193b;
                queryLatestPushReq.fcmMessageIdList = androidx.camera.core.impl.utils.executor.g.u();
                PayApiService payApiService = (PayApiService) p324va.c.f43141a.f14621b;
                this.f3192a = 1;
                obj = payApiService.queryLatestPushMessage(queryLatestPushReq, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonListResultV2 commonListResultV2 = (CommonListResultV2) obj;
            if (commonListResultV2.isSuccess()) {
                F6.d.h("SyncPushMessageTask", 3, "fetchMessage: ok");
                long jCurrentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkNotNullParameter("push_record", "spName");
                Intrinsics.checkNotNullParameter("_key_sync_push_message", "key");
                SPUtils.getInstance("push_record").put("_key_sync_push_message", jCurrentTimeMillis);
            }
            List<T> list = commonListResultV2.data;
            if (list != 0 && !list.isEmpty()) {
                Iterable<PushMessage> iterable = commonListResultV2.data;
                if (iterable != null) {
                    for (PushMessage pushMessage : iterable) {
                        PushMessage.Content content = pushMessage.content;
                        if (content != null) {
                            content.fcmMessageId = pushMessage.fcmMessageId;
                        }
                        pushMessage.receivedByPull = true;
                        F6.d.h("SyncPushMessageTask", 3, "fetchMessage: post message");
                        IPushModule iPushModule = (IPushModule) ARouter.getInstance().navigation(IPushModule.class);
                        if (iPushModule != null) {
                            iPushModule.dealDataMessage(pushMessage);
                        }
                    }
                }
                return Unit.f38893a;
            }
            return Unit.f38893a;
        } catch (Exception unused) {
        }
    }
}
