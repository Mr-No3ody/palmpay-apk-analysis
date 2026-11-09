package p384zd;

import Ef.a;
import Ff.h;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f44674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectBankForTransferViaUssdDialog f44675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f44676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f44677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog, ArrayList arrayList, String str, Continuation continuation) {
        super(2, continuation);
        this.f44675c = selectBankForTransferViaUssdDialog;
        this.f44676d = arrayList;
        this.f44677e = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f44675c, this.f44676d, this.f44677e, continuation);
        cVar.f44674b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f2423a;
        int i7 = this.f44673a;
        if (i7 == 0) {
            g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f44674b;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f44675c.f33623H.getValue();
            ArrayList arrayList = this.f44676d;
            if (copyOnWriteArrayList != null) {
                if (copyOnWriteArrayList.isEmpty()) {
                    copyOnWriteArrayList = null;
                }
                if (copyOnWriteArrayList != null) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                    while (it.hasNext()) {
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
                            String upperCase2 = this.f44677e.toUpperCase(locale2);
                            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                            if (StringsKt.A(upperCase, upperCase2, false)) {
                                arrayList.add(bankInfo);
                            }
                        }
                    }
                }
            }
            this.f44673a = 1;
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
