package p384zd;

import Ff.h;
import Pa.C0525w;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.util.SPUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44670b;

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        a aVar = new a(2, continuation);
        aVar.f44670b = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f44669a;
        if (i7 == 0) {
            g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f44670b;
            String string = SPUtils.get().getString("no_net_ussd_bank_list", "");
            if (string != null) {
                String str = !TextUtils.isEmpty(string) ? string : null;
                if (str != null) {
                    Object objFromJson = ((Gson) C0525w.f().f7166b).fromJson(string, new TypeToken<ArrayList<BankInfo>>() { // from class: com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog$initData$1$1$2$1
                    }.getType());
                    this.f44670b = str;
                    this.f44669a = 1;
                    if (flowCollector.emit(objFromJson, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.M(obj);
        }
        return Unit.f38893a;
    }
}
