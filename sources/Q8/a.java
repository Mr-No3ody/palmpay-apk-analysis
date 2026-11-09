package Q8;

import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.req.MemberLabelReq;
import com.transsnet.palmpay.core.network.api.MemberApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i7, Continuation continuation) {
        super(2, continuation);
        this.f7633b = i7;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f7633b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f7632a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        MemberApiService memberApiService = (MemberApiService) p324va.c.f43141a.f14622c;
        MemberLabelReq memberLabelReq = new MemberLabelReq(3, String.valueOf(this.f7633b));
        this.f7632a = 1;
        Object objMarkMemberLabel = memberApiService.markMemberLabel(memberLabelReq, this);
        return objMarkMemberLabel == aVar ? aVar : objMarkMemberLabel;
    }
}
