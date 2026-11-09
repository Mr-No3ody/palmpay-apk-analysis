package p270rd;

import Ef.a;
import Ff.h;
import android.text.TextUtils;
import androidx.camera.core.impl.utils.executor.g;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.send_money.ui.activity.SelectBankActivity;
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

/* JADX INFO: renamed from: rd.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1980x extends h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f41779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectBankActivity f41780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f41781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f41782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1980x(SelectBankActivity selectBankActivity, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f41780c = selectBankActivity;
        this.f41781d = str;
        this.f41782e = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C1980x c1980x = new C1980x(this.f41780c, this.f41781d, this.f41782e, continuation);
        c1980x.f41779b = obj;
        return c1980x;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1980x) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ArrayList arrayList;
        a aVar = a.f2423a;
        int i7 = this.f41778a;
        if (i7 == 0) {
            g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f41779b;
            SelectBankActivity selectBankActivity = this.f41780c;
            Iterator it = ((CopyOnWriteArrayList) selectBankActivity.f33196p.getValue()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (true) {
                boolean zHasNext = it.hasNext();
                str = this.f41781d;
                arrayList = this.f41782e;
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
                    String upperCase2 = str.toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (y.m(upperCase, upperCase2, false)) {
                        arrayList.add(bankInfo);
                    }
                }
            }
            Iterator it2 = ((CopyOnWriteArrayList) selectBankActivity.t.getValue()).iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
            while (it2.hasNext()) {
                BankInfo bankInfo2 = (BankInfo) it2.next();
                if (!TextUtils.isEmpty(bankInfo2.bankName)) {
                    String bankName2 = bankInfo2.bankName;
                    Intrinsics.checkNotNullExpressionValue(bankName2, "bankName");
                    Locale locale3 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
                    String upperCase3 = bankName2.toUpperCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    Locale locale4 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale4, "getDefault(...)");
                    String upperCase4 = str.toUpperCase(locale4);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (y.m(upperCase3, upperCase4, false)) {
                        arrayList.add(bankInfo2);
                    }
                }
            }
            this.f41778a = 1;
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
