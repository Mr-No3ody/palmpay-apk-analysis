package N8;

import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.MemberLabelReq;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import com.transsnet.palmpay.util.SPUtils;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: N8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0471o extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6246a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0471o(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0471o) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f6246a;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
                MemberLabelReq memberLabelReq = new MemberLabelReq(3, "");
                this.f6246a = 1;
                obj = memberApiService.queryMemberLabelInfo(memberLabelReq, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            CommonBeanResult commonBeanResult = (CommonBeanResult) obj;
            if (commonBeanResult.isSuccess()) {
                MemberLabelReq memberLabelReq2 = (MemberLabelReq) commonBeanResult.data;
                int i10 = (memberLabelReq2 == null || (str = memberLabelReq2.status) == null) ? 0 : Integer.parseInt(str);
                if (i10 > 0) {
                    SPUtils.getInstance().put(BaseApplication.getInstance().getUser().getPhoneNumber() + "PATTERN_PIN_SETTING", i10);
                    p059e1.a.U(0, com.transsnet.palmpay.core.config.d.h());
                    p115ha.c cVar = p115ha.b.f37362a;
                    cVar.f37366d = false;
                    cVar.f37365c = false;
                }
            }
        } catch (Exception unused) {
        }
        return Unit.f38893a;
    }
}
