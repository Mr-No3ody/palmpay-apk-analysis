package Ad;

import Pa.r0;
import com.transsnet.palmpay.send_money.bean.AddFromContactListResp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ad.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0063j extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f227b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063j(List list, String str, Continuation continuation) {
        super(2, continuation);
        this.f226a = list;
        this.f227b = str;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0063j(this.f226a, this.f227b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0063j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0012 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        String recipientPhone;
        String recipientAccountNumber;
        String strW;
        String strK;
        String strL;
        String strW2;
        String strK2;
        String strL2;
        String strL3;
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        List list = this.f226a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            AddFromContactListResp addFromContactListResp = (AddFromContactListResp) obj2;
            String recipientName = addFromContactListResp.getRecipientName();
            String str = this.f227b;
            if (recipientName == null || (strL3 = com.airbnb.lottie.model.layer.d.l("getDefault(...)", recipientName, "toUpperCase(...)")) == null) {
                recipientPhone = addFromContactListResp.getRecipientPhone();
                if (recipientPhone != null || (strW2 = r0.w(recipientPhone)) == null || (strK2 = kotlin.text.y.k(strW2, " ", "")) == null || (strL2 = com.airbnb.lottie.model.layer.d.l("getDefault(...)", strK2, "toUpperCase(...)")) == null) {
                    recipientAccountNumber = addFromContactListResp.getRecipientAccountNumber();
                    if (recipientAccountNumber == null && (strW = r0.w(recipientAccountNumber)) != null && (strK = kotlin.text.y.k(strW, " ", "")) != null && (strL = com.airbnb.lottie.model.layer.d.l("getDefault(...)", strK, "toUpperCase(...)")) != null) {
                        Locale locale = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                        String upperCase = str.toUpperCase(locale);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        if (StringsKt.A(strL, upperCase, false)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
                    String upperCase2 = str.toUpperCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                    if (!StringsKt.A(strL2, upperCase2, false)) {
                        recipientAccountNumber = addFromContactListResp.getRecipientAccountNumber();
                        if (recipientAccountNumber == null) {
                        }
                    }
                    arrayList.add(obj2);
                }
            } else {
                Locale locale3 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "getDefault(...)");
                String upperCase3 = str.toUpperCase(locale3);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                if (!StringsKt.A(strL3, upperCase3, false)) {
                    recipientPhone = addFromContactListResp.getRecipientPhone();
                    if (recipientPhone != null) {
                        recipientAccountNumber = addFromContactListResp.getRecipientAccountNumber();
                        if (recipientAccountNumber == null) {
                        }
                    } else {
                        recipientAccountNumber = addFromContactListResp.getRecipientAccountNumber();
                        if (recipientAccountNumber == null) {
                        }
                    }
                }
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
