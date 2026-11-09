package p353xd;

import Ef.a;
import Ff.h;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.ui.activity.tobank.SelectBankForToBankActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectBankForToBankActivity f43877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43879e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SelectBankForToBankActivity selectBankForToBankActivity, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f43877c = selectBankForToBankActivity;
        this.f43878d = str;
        this.f43879e = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        k kVar = new k(this.f43877c, this.f43878d, this.f43879e, continuation);
        kVar.f43876b = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        a aVar = a.f2423a;
        int i7 = this.f43875a;
        if (i7 == 0) {
            g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f43876b;
            Iterator it = ((CopyOnWriteArrayList) this.f43877c.f33516p.getValue()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f43879e;
                if (!zHasNext) {
                    break;
                }
                BankInfo bankInfo = (BankInfo) it.next();
                if (!TextUtils.isEmpty(bankInfo.bankName)) {
                    String bankName = bankInfo.bankName;
                    Intrinsics.checkNotNullExpressionValue(bankName, "bankName");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = bankName.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                    String upperCase2 = this.f43878d.toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (y.m(upperCase, upperCase2, false)) {
                        arrayList.add(bankInfo);
                    }
                }
            }
            this.f43875a = 1;
            if (flowCollector.emit(arrayList, this) == aVar) {
                return aVar;
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
