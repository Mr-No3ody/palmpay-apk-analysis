package Uc;

import android.view.View;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.p2pcash.bean.rsp.CreateBizOrderResp;
import com.transsnet.palmpay.p2pcash.ui.atm.CashierDeskPage;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9557a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f9558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CashierDeskPage f9559c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(CashierDeskPage cashierDeskPage, K k2) {
        super(null);
        this.f9559c = cashierDeskPage;
        this.f9558b = k2;
    }

    @Override // Of.a
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        final int i7 = 3;
        final int i10 = 2;
        CashierDeskPage cashierDeskPage = this.f9559c;
        K k2 = this.f9558b;
        final int i11 = 1;
        final int i12 = 0;
        int i13 = this.f9557a;
        Intrinsics.checkNotNullParameter(property, "property");
        switch (i13) {
            case 0:
                CreateBizOrderResp createBizOrderResp = (CreateBizOrderResp) obj2;
                if (createBizOrderResp != null) {
                    int i14 = createBizOrderResp.type;
                    p355xf.t tVar = cashierDeskPage.t;
                    if (i14 == 1) {
                        int i15 = CashierDeskPage.f32844B;
                        final CashierDeskPage cashierDeskPage2 = ((O) tVar.getValue()).f9582a;
                        Intrinsics.checkNotNullParameter(cashierDeskPage2, "<this>");
                        O6.c cVar = new O6.c(cashierDeskPage2);
                        cVar.e(Sc.e.p2p_str_you_can_only_make_3_bookings_per_time);
                        cVar.f6598d = cashierDeskPage2.getString(Sc.e.p2p_str_complete_this_naira_pickup_and_try_again);
                        String string = cashierDeskPage2.getString(p025ba.k.core_ok);
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: Uc.N
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        cashierDeskPage2.finish();
                                        break;
                                    case 1:
                                        cashierDeskPage2.finish();
                                        break;
                                    case 2:
                                        cashierDeskPage2.finish();
                                        break;
                                    default:
                                        cashierDeskPage2.finish();
                                        break;
                                }
                            }
                        };
                        cVar.f6600f = string;
                        cVar.f6602h = onClickListener;
                        cVar.f6604j = new View.OnClickListener() { // from class: Uc.N
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i7) {
                                    case 0:
                                        cashierDeskPage2.finish();
                                        break;
                                    case 1:
                                        cashierDeskPage2.finish();
                                        break;
                                    case 2:
                                        cashierDeskPage2.finish();
                                        break;
                                    default:
                                        cashierDeskPage2.finish();
                                        break;
                                }
                            }
                        };
                        O6.d dVarA = cVar.a();
                        dVarA.setCancelable(false);
                        dVarA.show();
                        return;
                    }
                    if (i14 != 2) {
                        if (i14 != 3) {
                            return;
                        }
                        k2.c();
                        return;
                    }
                    int i16 = CashierDeskPage.f32844B;
                    final CashierDeskPage cashierDeskPage3 = ((O) tVar.getValue()).f9582a;
                    Intrinsics.checkNotNullParameter(cashierDeskPage3, "<this>");
                    O6.c cVar2 = new O6.c(cashierDeskPage3);
                    cVar2.e(Sc.e.p2p_str_you_already_made_an_appointment_with________);
                    cVar2.f6598d = cashierDeskPage3.getString(Sc.e.p2p_str_choose_another_agent_location);
                    String string2 = cashierDeskPage3.getString(p025ba.k.core_ok);
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: Uc.N
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    cashierDeskPage3.finish();
                                    break;
                                case 1:
                                    cashierDeskPage3.finish();
                                    break;
                                case 2:
                                    cashierDeskPage3.finish();
                                    break;
                                default:
                                    cashierDeskPage3.finish();
                                    break;
                            }
                        }
                    };
                    cVar2.f6600f = string2;
                    cVar2.f6602h = onClickListener2;
                    cVar2.f6604j = new View.OnClickListener() { // from class: Uc.N
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    cashierDeskPage3.finish();
                                    break;
                                case 1:
                                    cashierDeskPage3.finish();
                                    break;
                                case 2:
                                    cashierDeskPage3.finish();
                                    break;
                                default:
                                    cashierDeskPage3.finish();
                                    break;
                            }
                        }
                    };
                    O6.d dVarA2 = cVar2.a();
                    dVarA2.setCancelable(false);
                    dVarA2.show();
                    return;
                }
                return;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                Object obj3 = null;
                k2.f9572f = null;
                try {
                    for (Object obj4 : arrayList) {
                        L l5 = (L) cashierDeskPage.f32845A.getValue();
                        int i17 = ((PaymentMethod) obj4).senderAccountType;
                        l5.getClass();
                        if (i17 == 1) {
                            if (i12 != 0) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            obj3 = obj4;
                            i12 = 1;
                        }
                    }
                    if (i12 == 0) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    k2.f9572f = (PaymentMethod) obj3;
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(ArrayList arrayList, K k2, CashierDeskPage cashierDeskPage) {
        super(arrayList);
        this.f9558b = k2;
        this.f9559c = cashierDeskPage;
    }
}
