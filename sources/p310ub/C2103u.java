package p310ub;

import Oc.C0500c;
import Pa.AbstractC0511h;
import Pa.C0510g;
import Ya.g;
import Z4.e;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.credit.bean.UserDeduceDateResp;
import com.transsnet.palmpay.credit.bean.resp.OcAutoRepaymentData;
import com.transsnet.palmpay.credit.bean.resp.OcAutoRepaymentListResp;
import com.transsnet.palmpay.credit.bean.rsp.CLMainCreditCard;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcAutoRepaymentExplainActivity;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import p355xf.t;
import p368yb.C2140h;

/* JADX INFO: renamed from: ub.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2103u extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f42926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ OcAutoRepaymentExplainActivity f42927g;

    public /* synthetic */ C2103u(OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity, int i7) {
        this.f42926f = i7;
        this.f42927g = ocAutoRepaymentExplainActivity;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable d2) {
        switch (this.f42926f) {
            case 0:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42927g.addSubscription(d2);
                break;
            default:
                Intrinsics.checkNotNullParameter(d2, "d");
                this.f42927g.addSubscription(d2);
                break;
        }
    }

    @Override // Z4.e
    public final void w(String message) {
        switch (this.f42926f) {
            case 0:
                Intrinsics.checkNotNullParameter(message, "message");
                ToastUtils.showShort(message, new Object[0]);
                break;
            default:
                Intrinsics.checkNotNullParameter(message, "message");
                if (!TextUtils.isEmpty(message)) {
                    ToastUtils.showShort(message, new Object[0]);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x0202  */
    @Override // Z4.e
    public final void y(Object obj) {
        List<OcAutoRepaymentData> data;
        String str;
        int i7;
        int i10;
        Object next;
        Object next2;
        Long deduceDateStamp;
        Long deduceDateStamp2;
        Long deduceDateStamp3;
        Object obj2 = null;
        OcAutoRepaymentExplainActivity ocAutoRepaymentExplainActivity = this.f42927g;
        switch (this.f42926f) {
            case 0:
                OcAutoRepaymentListResp ocAutoRepaymentListResp = (OcAutoRepaymentListResp) obj;
                if (ocAutoRepaymentListResp != null && ocAutoRepaymentListResp.isSuccess() && ocAutoRepaymentListResp.getData() != null && (data = ocAutoRepaymentListResp.getData()) != null && !data.isEmpty()) {
                    ArrayList arrayList = ocAutoRepaymentExplainActivity.f29338w;
                    if (arrayList == null) {
                        Intrinsics.n("mBankCardData");
                        throw null;
                    }
                    arrayList.clear();
                    ArrayList arrayList2 = ocAutoRepaymentExplainActivity.f29338w;
                    if (arrayList2 == null) {
                        Intrinsics.n("mBankCardData");
                        throw null;
                    }
                    List<OcAutoRepaymentData> data2 = ocAutoRepaymentListResp.getData();
                    Intrinsics.e(data2);
                    arrayList2.addAll(data2);
                    C2140h c2140h = ocAutoRepaymentExplainActivity.f29328A;
                    if (c2140h == null) {
                        Intrinsics.n("mBankCardAdapter");
                        throw null;
                    }
                    c2140h.notifyDataSetChanged();
                }
                ArrayList arrayList3 = ocAutoRepaymentExplainActivity.f29338w;
                if (arrayList3 == null) {
                    Intrinsics.n("mBankCardData");
                    throw null;
                }
                boolean zIsEmpty = arrayList3.isEmpty();
                t tVar = ocAutoRepaymentExplainActivity.f29330e;
                if (zIsEmpty) {
                    Object value = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((TextView) value).setText(ocAutoRepaymentExplainActivity.getString(g.cs_oc_your_unbound_bank_cards));
                    return;
                } else {
                    Object value2 = tVar.getValue();
                    Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                    ((TextView) value2).setText(ocAutoRepaymentExplainActivity.getString(g.cs_oc_your_bound_bank_cards));
                    return;
                }
            default:
                UserDeduceDateResp userDeduceDateResp = (UserDeduceDateResp) obj;
                int i11 = OcAutoRepaymentExplainActivity.f29327B;
                if (userDeduceDateResp == null || !userDeduceDateResp.isSuccess() || userDeduceDateResp.getData() == null) {
                    return;
                }
                UserDeduceDateResp.Data data3 = userDeduceDateResp.getData();
                long jLongValue = 0;
                boolean z3 = ((data3 == null || (deduceDateStamp3 = data3.getDeduceDateStamp()) == null) ? 0L : deduceDateStamp3.longValue()) > 0;
                t tVar2 = ocAutoRepaymentExplainActivity.t;
                Object value3 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                TextView textView = (TextView) value3;
                UserDeduceDateResp.Data data4 = userDeduceDateResp.getData();
                String str2 = new SimpleDateFormat("d").format(new Date((data4 == null || (deduceDateStamp2 = data4.getDeduceDateStamp()) == null) ? 0L : deduceDateStamp2.longValue()));
                Intrinsics.e(str2);
                int i12 = Integer.parseInt(str2);
                int i13 = i12 % 10;
                if (i13 == 1 && i12 != 11) {
                    str = "st";
                } else if (i13 != 2 || i12 == 12) {
                    str = (i13 != 3 || i12 == 13) ? "th" : "rd";
                } else {
                    str = "nd";
                }
                String strConcat = str2.concat(str);
                UserDeduceDateResp.Data data5 = userDeduceDateResp.getData();
                if (data5 != null && (deduceDateStamp = data5.getDeduceDateStamp()) != null) {
                    jLongValue = deduceDateStamp.longValue();
                }
                textView.setText(strConcat + TimeUtils.millis2String(jLongValue, new SimpleDateFormat("   MMM ", Locale.ENGLISH)));
                Object value4 = ocAutoRepaymentExplainActivity.f29337v.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                ((TextView) value4).setVisibility(z3 ? 0 : 8);
                Object value5 = tVar2.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((TextView) value5).setVisibility(z3 ? 0 : 8);
                Object value6 = ocAutoRepaymentExplainActivity.f29335o.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                ((TextView) value6).setVisibility(z3 ? 8 : 0);
                Object value7 = ocAutoRepaymentExplainActivity.f29336p.getValue();
                Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                ((View) value7).setVisibility(z3 ? 8 : 0);
                Object value8 = ocAutoRepaymentExplainActivity.f29334j.getValue();
                Intrinsics.checkNotNullExpressionValue(value8, "getValue(...)");
                PpButton ppButton = (PpButton) value8;
                if (z3) {
                    i7 = 8;
                } else {
                    UserDeduceDateResp.Data data6 = userDeduceDateResp.getData();
                    List<CLMainCreditCard> creditCardList = data6 != null ? data6.getCreditCardList() : null;
                    if (creditCardList == null || creditCardList.isEmpty()) {
                        i7 = 8;
                    } else {
                        List<CLMainCreditCard> list = creditCardList;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                CLMainCreditCard cLMainCreditCard = (CLMainCreditCard) next;
                                Integer accountType = cLMainCreditCard.getAccountType();
                                if (accountType != null && accountType.intValue() == 7 && !TextUtils.isEmpty(cLMainCreditCard.getCardNo()) && !TextUtils.isEmpty(cLMainCreditCard.getAccountId())) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next == null) {
                            Iterator<T> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    CLMainCreditCard cLMainCreditCard2 = (CLMainCreditCard) next2;
                                    Integer accountType2 = cLMainCreditCard2.getAccountType();
                                    if (accountType2 != null && accountType2.intValue() == 9 && !TextUtils.isEmpty(cLMainCreditCard2.getCardNo()) && !TextUtils.isEmpty(cLMainCreditCard2.getAccountId())) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            if (next2 == null) {
                                i7 = 8;
                            }
                        }
                        i7 = 0;
                    }
                }
                ppButton.setVisibility(i7);
                Object value9 = ocAutoRepaymentExplainActivity.f29333i.getValue();
                Intrinsics.checkNotNullExpressionValue(value9, "getValue(...)");
                PpButton ppButton2 = (PpButton) value9;
                if (!z3) {
                    UserDeduceDateResp.Data data7 = userDeduceDateResp.getData();
                    List<CLMainCreditCard> creditCardList2 = data7 != null ? data7.getCreditCardList() : null;
                    if (creditCardList2 != null && !creditCardList2.isEmpty()) {
                        for (Object obj3 : creditCardList2) {
                            CLMainCreditCard cLMainCreditCard3 = (CLMainCreditCard) obj3;
                            Integer accountType3 = cLMainCreditCard3.getAccountType();
                            if (accountType3 != null && accountType3.intValue() == 6 && !TextUtils.isEmpty(cLMainCreditCard3.getCardNo()) && !TextUtils.isEmpty(cLMainCreditCard3.getAccountId())) {
                                obj2 = obj3;
                                i10 = obj2 == null ? 8 : 0;
                            }
                        }
                        if (obj2 == null) {
                        }
                    }
                }
                ppButton2.setVisibility(i10);
                C0510g c0510g = AbstractC0511h.f7089a;
                Object value10 = ocAutoRepaymentExplainActivity.f29332g.getValue();
                Intrinsics.checkNotNullExpressionValue(value10, "getValue(...)");
                c0510g.richText((TextView) value10, ocAutoRepaymentExplainActivity.getString(z3 ? g.cs_with_wait_repay_tips : g.cs_without_wait_repay_tips), "on or after due date", new C0500c(ocAutoRepaymentExplainActivity, 18));
                return;
        }
    }
}
