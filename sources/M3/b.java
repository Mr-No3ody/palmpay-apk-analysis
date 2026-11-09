package M3;

import Je.l;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.flexibank.sdk.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5750b;

    public /* synthetic */ b(e eVar, int i7) {
        this.f5749a = i7;
        this.f5750b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e eVar = this.f5750b;
        switch (this.f5749a) {
            case 0:
                return new FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem(eVar, eVar.getContext());
            case 1:
                return Long.valueOf(eVar.f5755c);
            case 2:
                return eVar.f5757e;
            case 3:
                return eVar.f5754b;
            case 4:
                return Long.valueOf(eVar.f5755c);
            case 5:
                return eVar.f5757e;
            case 6:
                return eVar.f5754b;
            case 7:
                return Long.valueOf(eVar.f5755c);
            case 8:
                return eVar.f5757e;
            case 9:
                return eVar.f5754b;
            case 10:
                return Long.valueOf(eVar.f5755c);
            case 11:
                return eVar.f5757e;
            case 12:
                return eVar.f5754b;
            case 13:
                return Long.valueOf(eVar.f5755c);
            case 14:
                return eVar.f5757e;
            case 15:
                return LayoutInflater.from(eVar.getContext()).inflate(q.fb_item_cashier_apply_flexi, (ViewGroup) null);
            case 16:
                return eVar.f5754b;
            default:
                int i7 = FlexiBankCashierPaymentMethodAdapter$CashierAddPaymentMethodItem.f21961g;
                return new l(eVar, 9);
        }
    }
}
