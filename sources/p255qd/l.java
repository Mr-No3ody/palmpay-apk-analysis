package p255qd;

import Ef.a;
import Ff.h;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.send_money.api.SendMoneyApiService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import p188md.b;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, Continuation continuation) {
        super(1, continuation);
        this.f41503b = str;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new l(this.f41503b, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((l) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f41502a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
            return obj;
        }
        g.M(obj);
        SendMoneyApiService sendMoneyApiService = (SendMoneyApiService) b.f39648a.f6830b;
        this.f41502a = 1;
        Object shopNameByQrCode = sendMoneyApiService.getShopNameByQrCode(this.f41503b, this);
        return shopNameByQrCode == aVar ? aVar : shopNameByQrCode;
    }
}
