package S3;

import Hb.L;
import Pa.r0;
import Rd.C;
import Rd.C0599o;
import S7.e;
import Uc.C0670n;
import Uc.Y;
import Uc.o0;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionItem;
import com.flexibank.sdk.p;
import com.swmansion.rnscreens.gamma.stack.host.StackHost;
import com.swmansion.rnscreens.gamma.stack.screen.StackScreen;
import com.transsnet.palmpay.betting.bean.BettingBillerListItemBean;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.betting.ui.view.ModelBettingRootView;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.credit.ui.activity.SearchMIDActivity;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.p2pcash.bean.rsp.ShopHomeByMemberIdResp;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import com.transsnet.palmpay.teller.ui.activity.TvPreCheckActivity;
import java.util.ArrayList;
import kotlin.collections.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import p141j9.B;
import p220oa.h;
import p284sb.T;
import p284sb.U;
import p284sb.W;
import p355xf.l;
import p355xf.t;
import x4.k;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(KeyEvent.Callback callback, int i7) {
        super(null);
        this.f8665a = i7;
        this.f8666b = callback;
    }

    @Override // Of.a
    public void afterChange(KProperty property, Object obj, Object obj2) {
        androidx.viewpager.widget.a adapter;
        String billerId;
        Object obj3 = this.f8666b;
        switch (this.f8665a) {
            case 0:
                Intrinsics.checkNotNullParameter(property, "property");
                CharSequence charSequence = (CharSequence) obj2;
                CharSequence charSequence2 = (CharSequence) obj;
                if (TextUtils.isEmpty(charSequence) || Intrinsics.c(charSequence, charSequence2)) {
                    return;
                }
                FlexiBankModelPaymentPromotionItem flexiBankModelPaymentPromotionItem = (FlexiBankModelPaymentPromotionItem) obj3;
                TextView textView = (TextView) flexiBankModelPaymentPromotionItem.findViewById(p.fb_tv_promotion_key);
                if (textView != null) {
                    textView.setText(charSequence);
                }
                k binding = flexiBankModelPaymentPromotionItem.getBinding();
                if (binding != null) {
                    binding.f43629e.setText(charSequence);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(property, "property");
                if (((T7.a) obj) != ((T7.a) obj2)) {
                    StackScreen stackScreen = (StackScreen) obj3;
                    StackHost stackHost = stackScreen.getStackHost$react_native_screens_release().get();
                    if (stackHost != null) {
                        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
                        int iOrdinal = stackScreen.getActivityMode().ordinal();
                        p279s5.d dVar = stackHost.f25412c;
                        if (iOrdinal == 0) {
                            dVar.getClass();
                            Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
                            ((ArrayList) dVar.f42026c).add(new S7.d(stackScreen));
                            return;
                        } else {
                            if (iOrdinal != 1) {
                                throw new l();
                            }
                            dVar.getClass();
                            Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
                            ((ArrayList) dVar.f42025b).add(new e(stackScreen));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(property, "property");
                ((C0670n) obj3).notifyDataSetChanged();
                return;
            case 3:
                Intrinsics.checkNotNullParameter(property, "property");
                int i7 = MapPage.f32859u0;
                MapPage mapPage = (MapPage) obj3;
                Y yS = mapPage.s();
                yS.a(new L(5, yS.f9608d, yS));
                ViewPager viewPagerQ = MapPage.q(mapPage);
                if (viewPagerQ == null || (adapter = viewPagerQ.getAdapter()) == null) {
                    return;
                }
                adapter.i();
                return;
            case 4:
                Intrinsics.checkNotNullParameter(property, "property");
                ArrayList<ShopHomeByMemberIdResp.ReceivedShopListBean> arrayList = (ArrayList) obj2;
                ArrayList arrayList2 = new ArrayList(r.l(arrayList, 10));
                for (ShopHomeByMemberIdResp.ReceivedShopListBean receivedShopListBean : arrayList) {
                    Vc.c cVar = new Vc.c();
                    cVar.E(receivedShopListBean.currentTime);
                    cVar.M(receivedShopListBean.bookingStartTime);
                    cVar.H(receivedShopListBean.bookingEndTime);
                    cVar.K(receivedShopListBean.timeStatus != null);
                    cVar.y(receivedShopListBean.bookingCode);
                    String orderNo = receivedShopListBean.orderNo;
                    Intrinsics.checkNotNullExpressionValue(orderNo, "orderNo");
                    cVar.O(orderNo);
                    cVar.N(receivedShopListBean.orderStatus);
                    cVar.z(receivedShopListBean.updateMoneyFlag);
                    cVar.x(receivedShopListBean.bookingMoney);
                    arrayList2.add(cVar);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                o0 o0Var = (o0) obj3;
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(arrayList3, "<set-?>");
                o0Var.f9702g.setValue(o0Var, o0.f9695j[2], arrayList3);
                return;
            case 5:
                Intrinsics.checkNotNullParameter(property, "property");
                CharSequence charSequence3 = (CharSequence) obj2;
                CharSequence charSequence4 = (CharSequence) obj;
                if (TextUtils.isEmpty(charSequence3) || Intrinsics.c(charSequence3, charSequence4)) {
                    return;
                }
                ModelPaymentPromotionItem modelPaymentPromotionItem = (ModelPaymentPromotionItem) obj3;
                TextView textView2 = (TextView) modelPaymentPromotionItem.findViewById(s.tv_promotion_key);
                if (textView2 != null) {
                    textView2.setText(charSequence3);
                }
                TextView tv_promotion_key = modelPaymentPromotionItem.getTv_promotion_key();
                if (tv_promotion_key != null) {
                    tv_promotion_key.setText(charSequence3);
                    return;
                }
                return;
            case 6:
                Intrinsics.checkNotNullParameter(property, "property");
                long jLongValue = ((Number) obj2).longValue();
                if (((Number) obj).longValue() == jLongValue || jLongValue <= 0) {
                    return;
                }
                KProperty[] kPropertyArr = TvPreCheckActivity.f34231j;
                TvPreCheckActivity tvPreCheckActivity = (TvPreCheckActivity) obj3;
                C c6 = (C) tvPreCheckActivity.f27334c;
                if (c6 != null) {
                    c6.f8007k0.setText(tvPreCheckActivity.getString(p025ba.k.core_pay_s, r0.C(r0.E(jLongValue), false)));
                    return;
                }
                return;
            case 7:
                Intrinsics.checkNotNullParameter(property, "property");
                MobileWalletResp.MobileWallet mobileWallet = (MobileWalletResp.MobileWallet) obj2;
                if (mobileWallet != null) {
                    String str = mobileWallet.userIdTips;
                    BuyBundleHomePageActivity buyBundleHomePageActivity = (BuyBundleHomePageActivity) obj3;
                    if (str != null) {
                        KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                        C0599o c0599o = (C0599o) buyBundleHomePageActivity.f27334c;
                        if ((c0599o != null ? c0599o.f8429d.setInputHint(str) : null) != null) {
                            return;
                        }
                    }
                    KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                    C0599o c0599o2 = (C0599o) buyBundleHomePageActivity.f27334c;
                    if (c0599o2 != null) {
                        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = c0599o2.f8429d;
                        String string = buyBundleHomePageActivity.getString(p025ba.k.core_enter_mobile_number);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        modelMobileWithIconInputLayout.setInputHint(string);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Intrinsics.checkNotNullParameter(property, "property");
                BettingBillerListItemBean bettingBillerListItemBean = (BettingBillerListItemBean) obj2;
                ModelBettingRootView modelBettingRootView = ((BettingHomeActivity) obj3).f26676p;
                if (modelBettingRootView != null) {
                    if (bettingBillerListItemBean == null || (billerId = bettingBillerListItemBean.getBillerId()) == null) {
                        billerId = "";
                    }
                    modelBettingRootView.setBillerAd(billerId);
                    return;
                }
                return;
            default:
                super.afterChange(property, obj, obj2);
                return;
        }
    }

    @Override // Of.a
    public boolean beforeChange(KProperty property, Object obj, Object obj2) {
        switch (this.f8665a) {
            case 9:
                Intrinsics.checkNotNullParameter(property, "property");
                String content = (String) obj2;
                boolean z3 = content.length() <= 10;
                SearchMIDActivity searchMIDActivity = (SearchMIDActivity) this.f8666b;
                if (z3) {
                    KProperty[] kPropertyArr = SearchMIDActivity.f28782Q;
                    W wP = searchMIDActivity.p();
                    wP.getClass();
                    Intrinsics.checkNotNullParameter(content, "content");
                    SearchMIDActivity searchMIDActivity2 = wP.f42144a;
                    Object value = searchMIDActivity2.f28796p.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    searchMIDActivity2.o().getClass();
                    ((TextView) value).setText(T.a(content));
                    int length = content.length();
                    t tVar = searchMIDActivity2.t;
                    if (length > 0) {
                        Object value2 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        h.c((TextView) value2);
                    } else {
                        Object value3 = tVar.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        h.C((TextView) value3);
                    }
                    int length2 = content.length();
                    t tVar2 = searchMIDActivity2.f28794j;
                    if (length2 > 0) {
                        Object value4 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                        h.C((ImageView) value4);
                    } else {
                        Object value5 = tVar2.getValue();
                        Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                        h.c((ImageView) value5);
                    }
                    Object value6 = tVar2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                    h.l(new U(searchMIDActivity2, 2), (ImageView) value6);
                    int i7 = searchMIDActivity.f28787L + 1;
                    searchMIDActivity.f28787L = i7;
                    p284sb.Y y8 = new p284sb.Y(i7, searchMIDActivity, content);
                    Object value7 = searchMIDActivity.f28796p.getValue();
                    Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
                    ((TextView) value7).postDelayed(new B(y8), 300L);
                    searchMIDActivity.p().a(content);
                } else {
                    String strSubstring = content.substring(0, 10);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    searchMIDActivity.q(strSubstring);
                }
                return z3;
            default:
                return super.beforeChange(property, obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ArrayList arrayList, Object obj, int i7) {
        super(arrayList);
        this.f8665a = i7;
        this.f8666b = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(StackScreen stackScreen) {
        this.f8665a = 1;
        T7.a aVar = T7.a.f9033a;
        this.f8666b = stackScreen;
        super(aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TvPreCheckActivity tvPreCheckActivity) {
        super(0L);
        this.f8665a = 6;
        this.f8666b = tvPreCheckActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SearchMIDActivity searchMIDActivity) {
        super("");
        this.f8665a = 9;
        this.f8666b = searchMIDActivity;
    }
}
