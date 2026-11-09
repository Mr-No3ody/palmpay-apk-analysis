package C9;

import N8.q0;
import Pa.i0;
import Pa.r0;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.adsdk.interfaces.CommonAdListener;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.cash_in.ui.activity.RechargeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.WithdrawHomeActivity;
import com.transsnet.palmpay.cash_in.ui.activity.instruction.AddMoneyHomeActivity;
import com.transsnet.palmpay.contacts.ui.fragment.CloseContactsFragment;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.credit.ui.activity.okcard.OcTotalBillActivity;
import com.transsnet.palmpay.credit.ui.fragment.CLOpenFragment;
import com.transsnet.palmpay.credit.ui.fragment.LoanHomeFragment;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.managemoney.ui.fragment.CashBoxMainFragment;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentHomeNGFragment;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragment;
import com.transsnet.palmpay.ui.fragment.HomeMeFragment;
import com.transsnet.palmpay.ui.fragment.HomeSavingsUserV2Fragment;
import com.transsnet.palmpay.ui.fragment.SplashFragment;
import com.transsnet.palmpay.ui.fragment.TransactionHistoryFragment;
import com.transsnet.palmpay.ui.view.ModelPalmPrizeBanner;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: C9.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0158z extends CommonAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1340b;

    public /* synthetic */ C0158z(Object obj, int i7) {
        this.f1339a = i7;
        this.f1340b = obj;
    }

    @Override // com.transsnet.adsdk.interfaces.IAdListener
    public final void onClick(AdEntity adEntity) {
        User user;
        switch (this.f1339a) {
            case 0:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 1:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
                break;
            case 2:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 3:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 4:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
                break;
            case 6:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                if (!r0.U0()) {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                    SplashFragment splashFragment = (SplashFragment) this.f1340b;
                    if (splashFragment.isAdded() && (splashFragment.getActivity() instanceof HomeActivity)) {
                        androidx.fragment.app.E activity = splashFragment.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type com.transsnet.palmpay.ui.activity.HomeActivity");
                        ((HomeActivity) activity).r();
                        break;
                    }
                }
                break;
            case 7:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    return;
                }
                break;
            case 9:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 10:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 11:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e13) {
                    e13.printStackTrace();
                    return;
                }
                break;
            case 13:
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e14) {
                    e14.printStackTrace();
                    return;
                }
                break;
            case 14:
                if (adEntity != null) {
                    if ("01".equals(adEntity.jumpType) && ((user = BaseApplication.getInstance().getUser()) == null || user.getSvaStatus() != 3)) {
                        q0.u("/account/ask_apply_for_balance");
                    } else {
                        try {
                            org.chromium.support_lib_boundary.util.b.Q(adEntity.jumpType, adEntity.relativeUrl, adEntity.jumpParams, null);
                        } catch (Exception e15) {
                            F6.d.c(((BillPaymentHomeNGFragment) this.f1340b).f27317a, "initActivityBanner: ", e15);
                            return;
                        }
                    }
                }
                break;
            case 15:
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("adId", adEntity.adId);
                writableMapCreateMap.putString("applicationId", adEntity.applicationId);
                writableMapCreateMap.putString("adSlotId", adEntity.adSlotId);
                writableMapCreateMap.putString("imageUrl", adEntity.imageUrl);
                writableMapCreateMap.putString("jumpType", adEntity.jumpType);
                writableMapCreateMap.putString("relativeUrl", adEntity.relativeUrl);
                writableMapCreateMap.putString("imageDimension", adEntity.imageDimention);
                writableMapCreateMap.putString(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, adEntity.countryCode);
                writableMapCreateMap.putString("showDates", adEntity.showDates);
                writableMapCreateMap.putString("multipleImageUrl", adEntity.multipleImageUrl);
                writableMapCreateMap.putString("jumpParams", adEntity.jumpParams);
                ((Callback) this.f1340b).invoke(writableMapCreateMap);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e16) {
                    e16.printStackTrace();
                    return;
                }
                break;
            case 17:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 18:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(adEntity, "adEntity");
                try {
                    org.chromium.support_lib_boundary.util.b.P(adEntity);
                } catch (Exception e17) {
                    e17.printStackTrace();
                    return;
                }
                break;
            default:
                org.chromium.support_lib_boundary.util.b.P(adEntity);
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onClosed() {
        switch (this.f1339a) {
            case 2:
                HomeFragment.v((HomeFragment) this.f1340b);
                break;
            case 7:
                break;
            default:
                super.onClosed();
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadFailed() {
        MarqueeViewV2 marqueeViewV2;
        MarqueeView marqueeView;
        Object obj = this.f1340b;
        switch (this.f1339a) {
            case 0:
                super.onLoadFailed();
                String str = RechargeActivity.f26858r0;
                MarqueeView marqueeViewO = ((RechargeActivity) obj).o();
                if (marqueeViewO != null) {
                    marqueeViewO.setVisibility(8);
                }
                break;
            case 1:
                super.onLoadFailed();
                WithdrawHomeActivity withdrawHomeActivity = (WithdrawHomeActivity) obj;
                Intrinsics.checkNotNullParameter(withdrawHomeActivity, "<this>");
                Object value = withdrawHomeActivity.f26935d.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                p220oa.h.c((DragView) value);
                break;
            case 2:
                super.onLoadFailed();
                HomeFragment.v((HomeFragment) obj);
                break;
            case 3:
                super.onLoadFailed();
                HomeMeFragment homeMeFragment = (HomeMeFragment) obj;
                MarqueeViewV2 marqueeViewV3 = homeMeFragment.f35128X;
                if (marqueeViewV3 != null) {
                    p220oa.h.s(marqueeViewV3, false);
                }
                MarqueeViewV2 marqueeViewV4 = homeMeFragment.f35128X;
                if (marqueeViewV4 != null) {
                    p220oa.h.k(marqueeViewV4, null, null, null, 0, 7);
                }
                break;
            case 4:
                break;
            case 5:
                super.onLoadFailed();
                HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                MarqueeViewV2 marqueeViewV5 = (MarqueeViewV2) ((HomeSavingsUserV2Fragment) obj).f35172p0.getValue();
                if (marqueeViewV5 != null) {
                    p220oa.h.s(marqueeViewV5, false);
                }
                break;
            case 6:
            case 14:
            case 15:
            case 17:
            case 19:
            default:
                super.onLoadFailed();
                break;
            case 7:
                int i7 = TransactionHistoryFragment.f35248k0;
                Bc.x xVar = (Bc.x) ((TransactionHistoryFragment) obj).f27335j;
                if (xVar != null && (marqueeViewV2 = xVar.f876i) != null) {
                    marqueeViewV2.setVisibility(8);
                    break;
                }
                break;
            case 8:
                super.onLoadFailed();
                Bc.f fVar = ((AddMoneyHomeActivity) obj).f26980j;
                if (fVar != null && (marqueeView = (MarqueeView) fVar.f701g) != null) {
                    marqueeView.setVisibility(8);
                    break;
                }
                break;
            case 9:
                super.onLoadFailed();
                Me.j jVar = (Me.j) obj;
                View view = jVar.f5976c;
                if (view != null) {
                    p220oa.h.c(view);
                }
                jVar.k(jVar.f5976c, false);
                break;
            case 10:
                super.onLoadFailed();
                Me.k kVar = (Me.k) obj;
                View view2 = kVar.f5978d;
                if (view2 != null) {
                    p220oa.h.c(view2);
                }
                kVar.k(kVar.f5978d, false);
                break;
            case 11:
                super.onLoadFailed();
                Me.l lVar = (Me.l) obj;
                SingleAdView singleAdView = lVar.f5981e;
                if (singleAdView != null) {
                    p220oa.h.c(singleAdView);
                }
                ModelPalmPrizeBanner modelPalmPrizeBanner = lVar.f5980d;
                if (modelPalmPrizeBanner != null) {
                    p220oa.h.k(modelPalmPrizeBanner, 0, null, null, null, 14);
                }
                break;
            case 12:
                super.onLoadFailed();
                MarqueeViewV2 limitTimeAd = ((ModelBillNoticeItem) obj).getLimitTimeAd();
                if (limitTimeAd != null) {
                    p220oa.h.s(limitTimeAd, false);
                }
                break;
            case 13:
                SingleAdView singleAdView2 = ((CloseContactsFragment) obj).f27268o;
                if (singleAdView2 != null) {
                    singleAdView2.setVisibility(8);
                }
                break;
            case 16:
                super.onLoadFailed();
                CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                MarqueeViewV2 marqueeViewV6 = (MarqueeViewV2) ((CashBoxMainFragment) obj).f32396I0.getValue();
                if (marqueeViewV6 != null) {
                    p220oa.h.s(marqueeViewV6, false);
                }
                break;
            case 18:
                Object value2 = ((OcTotalBillActivity) obj).f29904i.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((LinearLayout) value2).setVisibility(8);
                break;
            case 20:
                super.onLoadFailed();
                LoanHomeFragment.a aVar3 = LoanHomeFragment.f30338Z;
                LoanHomeFragment loanHomeFragment = (LoanHomeFragment) obj;
                loanHomeFragment.A();
                loanHomeFragment.t = true;
                break;
        }
    }

    @Override // com.transsnet.adsdk.interfaces.CommonAdListener, com.transsnet.adsdk.interfaces.IAdListener
    public void onLoadSuccess() {
        MarqueeViewV2 marqueeViewV2;
        LinearLayout linearLayout;
        boolean z3 = false;
        Object obj = this.f1340b;
        switch (this.f1339a) {
            case 0:
                super.onLoadSuccess();
                String str = RechargeActivity.f26858r0;
                MarqueeView marqueeViewO = ((RechargeActivity) obj).o();
                if (marqueeViewO != null) {
                    marqueeViewO.setVisibility(0);
                }
                break;
            case 1:
                super.onLoadSuccess();
                WithdrawHomeActivity withdrawHomeActivity = (WithdrawHomeActivity) obj;
                Intrinsics.checkNotNullParameter(withdrawHomeActivity, "<this>");
                Object value = withdrawHomeActivity.f26935d.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                p220oa.h.C((DragView) value);
                break;
            case 2:
            case 3:
            case 6:
            case 14:
            case 15:
            case 18:
            default:
                super.onLoadSuccess();
                break;
            case 4:
                ImageView imageView = (ImageView) obj;
                if (imageView != null) {
                    p220oa.h.A(imageView, false, p025ba.a.core_anim_fade_out);
                }
                break;
            case 5:
                super.onLoadSuccess();
                HomeSavingsUserV2Fragment.a aVar = HomeSavingsUserV2Fragment.f35149F0;
                MarqueeViewV2 marqueeViewV3 = (MarqueeViewV2) ((HomeSavingsUserV2Fragment) obj).f35172p0.getValue();
                if (marqueeViewV3 != null) {
                    p220oa.h.s(marqueeViewV3, true);
                }
                break;
            case 7:
                int i7 = TransactionHistoryFragment.f35248k0;
                Bc.x xVar = (Bc.x) ((TransactionHistoryFragment) obj).f27335j;
                if (xVar != null && (marqueeViewV2 = xVar.f876i) != null) {
                    marqueeViewV2.setVisibility(0);
                    break;
                }
                break;
            case 8:
                super.onLoadSuccess();
                AddMoneyHomeActivity addMoneyHomeActivity = (AddMoneyHomeActivity) obj;
                Bc.f fVar = addMoneyHomeActivity.f26980j;
                if (fVar != null) {
                    ((MarqueeView) fVar.f701g).setVisibility(0);
                }
                Bc.f fVar2 = addMoneyHomeActivity.f26980j;
                if (fVar2 != null) {
                    ((MarqueeView) fVar2.f701g).setCompoundDrawablesWithIntrinsicBounds(G8.a.x(addMoneyHomeActivity, S6.a.pay_News, Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, addMoneyHomeActivity)), null, 16.0f, 116), (Drawable) null, (Drawable) null, (Drawable) null);
                }
                break;
            case 9:
            case 10:
                break;
            case 11:
                super.onLoadSuccess();
                Me.l lVar = (Me.l) obj;
                SingleAdView singleAdView = lVar.f5981e;
                if (singleAdView != null) {
                    p220oa.h.s(singleAdView, true);
                }
                ModelPalmPrizeBanner modelPalmPrizeBanner = lVar.f5980d;
                if (modelPalmPrizeBanner != null) {
                    p220oa.h.k(modelPalmPrizeBanner, Integer.valueOf(lVar.f5982f), null, null, null, 14);
                }
                break;
            case 12:
                super.onLoadSuccess();
                ModelBillNoticeItem modelBillNoticeItem = (ModelBillNoticeItem) obj;
                MarqueeViewV2 limitTimeAd = modelBillNoticeItem.getLimitTimeAd();
                if (limitTimeAd != null) {
                    LinearLayout channelNoticeLayout = modelBillNoticeItem.getChannelNoticeLayout();
                    if (channelNoticeLayout != null && channelNoticeLayout.getVisibility() == 0) {
                        z3 = true;
                    }
                    p220oa.h.s(limitTimeAd, true ^ z3);
                }
                break;
            case 13:
                SingleAdView singleAdView2 = ((CloseContactsFragment) obj).f27268o;
                if (singleAdView2 != null) {
                    singleAdView2.setVisibility(0);
                }
                break;
            case 16:
                super.onLoadSuccess();
                CashBoxMainFragment.a aVar2 = CashBoxMainFragment.f32383V0;
                MarqueeViewV2 marqueeViewV4 = (MarqueeViewV2) ((CashBoxMainFragment) obj).f32396I0.getValue();
                if (marqueeViewV4 != null) {
                    p220oa.h.s(marqueeViewV4, true);
                }
                break;
            case 17:
                super.onLoadSuccess();
                int i10 = PayShopHomeActivity.f28705p0;
                Object value2 = ((PayShopHomeActivity) obj).f28712Q.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                p220oa.h.C((SingleAdView) value2);
                break;
            case 19:
                CLOpenFragment cLOpenFragment = (CLOpenFragment) obj;
                if (i0.W(cLOpenFragment.getActivity()) && cLOpenFragment.isAdded() && !cLOpenFragment.isDetached() && (linearLayout = (LinearLayout) cLOpenFragment.f30309j.getValue()) != null) {
                    linearLayout.setVisibility(0);
                    break;
                }
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
