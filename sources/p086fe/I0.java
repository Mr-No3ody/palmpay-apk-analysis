package p086fe;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.airtime.network.IAirtimeService;
import com.transsnet.palmpay.common.export.bean.req.DialogConfigSettingsReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class I0 extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogConfigSettingsReq f36526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I0(DialogConfigSettingsReq dialogConfigSettingsReq, Continuation continuation) {
        super(1, continuation);
        this.f36526b = dialogConfigSettingsReq;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new I0(this.f36526b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((I0) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f36525a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        IAirtimeService iAirtimeService = (IAirtimeService) p127i9.a.f37437a.f6830b;
        this.f36525a = 1;
        Object objQueryDialogConfig = iAirtimeService.queryDialogConfig(this.f36526b, this);
        return objQueryDialogConfig == aVar ? aVar : objQueryDialogConfig;
    }
}
