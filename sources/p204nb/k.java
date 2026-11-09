package p204nb;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.req.MemberLabelReq;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import p324va.c;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39896a;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(2, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f39896a;
        boolean z3 = true;
        try {
            if (i7 == 0) {
                g.M(obj);
                MemberApiService memberApiService = (MemberApiService) c.f43141a.f14622c;
                MemberLabelReq memberLabelReq = new MemberLabelReq(29, "");
                this.f39896a = 1;
                obj = memberApiService.queryMemberLabelInfo(memberLabelReq, this);
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
            if (commonBeanResult.isSuccess()) {
                return new f(true, commonBeanResult.data != 0, false, 12);
            }
            String respCode = commonBeanResult.getRespCode();
            if (respCode != null && !StringsKt.F(respCode)) {
                z3 = false;
            }
            return new f(false, false, z3, commonBeanResult.getRespMsg());
        } catch (Exception e10) {
            return new f(false, false, q.a(e10), 8);
        }
    }
}
