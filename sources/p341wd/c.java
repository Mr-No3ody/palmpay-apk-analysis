package p341wd;

import Ef.a;
import Ff.h;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.airbnb.lottie.model.layer.d;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.ui.activity.st4bu.ScheduleTransferForBankUnstableBeneficiariesListActivity;
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
    public int f43405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f43406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScheduleTransferForBankUnstableBeneficiariesListActivity f43407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f43408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f43409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ScheduleTransferForBankUnstableBeneficiariesListActivity scheduleTransferForBankUnstableBeneficiariesListActivity, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f43407c = scheduleTransferForBankUnstableBeneficiariesListActivity;
        this.f43408d = str;
        this.f43409e = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        c cVar = new c(this.f43407c, this.f43408d, this.f43409e, continuation);
        cVar.f43406b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String recipientNickname;
        String strL;
        a aVar = a.f2423a;
        int i7 = this.f43405a;
        if (i7 == 0) {
            g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f43406b;
            Iterator it = ((CopyOnWriteArrayList) this.f43407c.f33432j.getValue()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f43409e;
                if (!zHasNext) {
                    break;
                }
                RecipientListResp.RecipientBean recipientBean = (RecipientListResp.RecipientBean) it.next();
                if (!TextUtils.isEmpty(recipientBean.getRecipientNickname()) && (recipientNickname = recipientBean.getRecipientNickname()) != null && (strL = d.l("getDefault(...)", recipientNickname, "toUpperCase(...)")) != null) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = this.f43408d.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (StringsKt.A(strL, upperCase, false)) {
                        arrayList.add(recipientBean);
                    }
                }
            }
            this.f43405a = 1;
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
