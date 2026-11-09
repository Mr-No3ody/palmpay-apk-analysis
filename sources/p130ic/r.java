package p130ic;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.teller.bean.DataBundleMoreTipsResult;
import com.transsnet.palmpay.teller.business.IApiTellerService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f37540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f37542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f37543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i7, String str, Continuation continuation) {
        super(1, continuation);
        this.f37542d = str;
        this.f37543e = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new r(this.f37543e, this.f37542d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((r) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        String str;
        a aVar = a.f2423a;
        int i7 = this.f37541c;
        if (i7 == 0) {
            g.M(obj);
            int i10 = this.f37543e;
            Integer num2 = new Integer(i10);
            IApiTellerService iApiTellerService = (IApiTellerService) Qd.a.f7847a.f8871b;
            String str2 = this.f37542d;
            this.f37539a = str2;
            this.f37540b = num2;
            this.f37541c = 1;
            Object objQueryMoreTipsByOperatorCode = iApiTellerService.queryMoreTipsByOperatorCode(str2, i10, this);
            if (objQueryMoreTipsByOperatorCode == aVar) {
                return aVar;
            }
            num = num2;
            obj = objQueryMoreTipsByOperatorCode;
            str = str2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = this.f37540b;
            str = this.f37539a;
            g.M(obj);
        }
        return new DataBundleMoreTipsResult(str, num, (CommonBeanResult) obj);
    }
}
