package Ed;

import android.text.TextUtils;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.ui.fragment.to_bank.BankAccountPalmPayContactFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: Ed.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0242w extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f2408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BankAccountPalmPayContactFragment f2409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f2410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0242w(BankAccountPalmPayContactFragment bankAccountPalmPayContactFragment, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f2409c = bankAccountPalmPayContactFragment;
        this.f2410d = str;
        this.f2411e = arrayList;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        C0242w c0242w = new C0242w(this.f2409c, this.f2410d, this.f2411e, continuation);
        c0242w.f2408b = obj;
        return c0242w;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0242w) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x002c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        String ppAccountNo;
        String strL;
        String accountNo;
        String strL2;
        String phone;
        String strL3;
        String fullName;
        String strL4;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2407a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            FlowCollector flowCollector = (FlowCollector) this.f2408b;
            Iterator it = this.f2409c.u().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (true) {
                boolean zHasNext = it.hasNext();
                arrayList = this.f2411e;
                if (!zHasNext) {
                    break;
                }
                RecipientBeanV2 recipientBeanV2 = (RecipientBeanV2) it.next();
                boolean zIsEmpty = TextUtils.isEmpty(recipientBeanV2.getFullName());
                String str = this.f2410d;
                if (!zIsEmpty && (fullName = recipientBeanV2.getFullName()) != null && (strL4 = com.airbnb.lottie.model.layer.d.l("getDefault(...)", fullName, "toUpperCase(...)")) != null) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    String upperCase = str.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    if (!StringsKt.A(strL4, upperCase, false)) {
                        if (!TextUtils.isEmpty(recipientBeanV2.getPhone())) {
                            if (!TextUtils.isEmpty(recipientBeanV2.getAccountNo())) {
                                if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo())) {
                                }
                            } else if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo())) {
                            }
                        } else if (!TextUtils.isEmpty(recipientBeanV2.getAccountNo())) {
                            if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo())) {
                            }
                        } else if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo())) {
                        }
                    }
                    arrayList.add(recipientBeanV2);
                } else if (!TextUtils.isEmpty(recipientBeanV2.getPhone()) && (phone = recipientBeanV2.getPhone()) != null && (strL3 = com.airbnb.lottie.model.layer.d.l("getDefault(...)", phone, "toUpperCase(...)")) != null) {
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                    String upperCase2 = str.toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (!StringsKt.A(strL3, upperCase2, false)) {
                        if (!TextUtils.isEmpty(recipientBeanV2.getAccountNo())) {
                            if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo())) {
                            }
                        } else if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo())) {
                        }
                    }
                    arrayList.add(recipientBeanV2);
                } else if (!TextUtils.isEmpty(recipientBeanV2.getAccountNo()) && (accountNo = recipientBeanV2.getAccountNo()) != null && (strL2 = com.airbnb.lottie.model.layer.d.l("getDefault(...)", accountNo, "toUpperCase(...)")) != null) {
                    Locale locale3 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
                    String upperCase3 = str.toUpperCase(locale3);
                    Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    if (!StringsKt.A(strL2, upperCase3, false)) {
                        if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo())) {
                        }
                    }
                    arrayList.add(recipientBeanV2);
                } else if (TextUtils.isEmpty(recipientBeanV2.getPpAccountNo()) && (ppAccountNo = recipientBeanV2.getPpAccountNo()) != null && (strL = com.airbnb.lottie.model.layer.d.l("getDefault(...)", ppAccountNo, "toUpperCase(...)")) != null) {
                    Locale locale4 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale4, "getDefault(...)");
                    String upperCase4 = str.toUpperCase(locale4);
                    Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (StringsKt.A(strL, upperCase4, false)) {
                        arrayList.add(recipientBeanV2);
                    }
                }
            }
            this.f2407a = 1;
            if (flowCollector.emit(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return Unit.f38893a;
    }
}
