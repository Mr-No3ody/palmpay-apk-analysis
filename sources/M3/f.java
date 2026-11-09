package M3;

import Je.l;
import Me.h;
import Me.i;
import Me.y;
import N8.q0;
import Ua.h0;
import Uc.C0669m;
import Wd.B;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.I;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.RecyclerView;
import com.flexibank.sdk.cashier.ui.activity.FlexiBankCashierCommonPreviewActivity;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentEarnLayout;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentFlexiLayout;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCashierPayMethodItem;
import com.flexibank.sdk.m;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.r;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.transsnet.palmpay.account.bean.req.SubmitGuardianReq;
import com.transsnet.palmpay.account.ui.activity.AddGuardianActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpActivity;
import com.transsnet.palmpay.account.ui.activity.SignUpSuccessActivity;
import com.transsnet.palmpay.account.ui.fragment.guardian.GuardianApproveAuthorizationConfirmFragment;
import com.transsnet.palmpay.account.ui.fragment.identify.IdentityVerificationAddressFragment;
import com.transsnet.palmpay.account.ui.viewmodel.SignUpViewModel;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.viewmodel.ActivityWebView;
import com.transsnet.palmpay.core.viewmodel.ModelBillQuickAccessItem;
import com.transsnet.palmpay.core.viewmodel.ModelBillerUSSDItem;
import com.transsnet.palmpay.core.viewmodel.ModelProgressListView;
import com.transsnet.palmpay.core.viewmodel.PayResultLotteryView;
import com.transsnet.palmpay.custom_view.model.ModelPaymentFlexiLayout;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.utils.KeyBoardListenerHelper;
import com.transsnet.palmpay.managemoney.bean.FixedSavingPlanRenewPopBean;
import com.transsnet.palmpay.managemoney.ui.dialog.AutoFixedSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.CashBoxAutoSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.SelectPayoutOptionsDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WhyTurnOffSaveDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawInterceptDialogFragment;
import com.transsnet.palmpay.managemoney.ui.dialog.WithdrawSureDialogFragment;
import com.transsnet.palmpay.p2pcash.ui.atm.view.P2PDashLine;
import com.transsnet.palmpay.teller.bean.TvRenewDataInfoBean;
import com.transsnet.palmpay.teller.ui.activity.CommomHistoryFragment;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.ui.activity.TvPreCheckActivity;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.A;
import kotlin.collections.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5760b;

    public /* synthetic */ f(Object obj, int i7) {
        this.f5759a = i7;
        this.f5760b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        I onBackPressedDispatcher;
        A aC;
        int i7 = 0;
        AttributeSet attributeSet = null;
        Object obj = this.f5760b;
        switch (this.f5759a) {
            case 0:
                g gVar = (g) obj;
                FlexiBankCashierPayMethodItem flexiBankCashierPayMethodItem = new FlexiBankCashierPayMethodItem(gVar.getContext(), attributeSet, 6, i7);
                ImageView mPayMethodImg = flexiBankCashierPayMethodItem.getMPayMethodImg();
                if (mPayMethodImg != null) {
                    mPayMethodImg.setImageResource(o.fb_add_circle_purple2);
                }
                TextView mPayMethodNameTv = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
                if (mPayMethodNameTv != null) {
                    mPayMethodNameTv.setText(flexiBankCashierPayMethodItem.getContext().getString(r.fb_add_bank_card_or_bank_account));
                }
                TextView mPayMethodNameTv2 = flexiBankCashierPayMethodItem.getMPayMethodNameTv();
                if (mPayMethodNameTv2 != null) {
                    mPayMethodNameTv2.setTextColor(flexiBankCashierPayMethodItem.getContext().getColor(m.fb_text_color_purple));
                }
                ImageView mRightIv = flexiBankCashierPayMethodItem.getMRightIv();
                if (mRightIv != null) {
                    mRightIv.setVisibility(8);
                }
                TextView mPayMethodNumTv = flexiBankCashierPayMethodItem.getMPayMethodNumTv();
                if (mPayMethodNumTv != null) {
                    mPayMethodNumTv.setText("");
                }
                FlexiBankCashierPayMethodItem.b(flexiBankCashierPayMethodItem.getMHintText(), "");
                flexiBankCashierPayMethodItem.setOnClickListener(new l(gVar, 10));
                return flexiBankCashierPayMethodItem;
            case 1:
                return new h((i) obj);
            case 2:
                WeakReference weakReference = new WeakReference((Me.A) obj);
                y yVar = new y();
                yVar.f6019a = weakReference;
                return yVar;
            case 3:
                AddGuardianActivity.a aVar = AddGuardianActivity.f25811i;
                SubmitGuardianReq submitGuardianReq = new SubmitGuardianReq();
                submitGuardianReq.authToken = ((AddGuardianActivity) obj).f25813b;
                return submitGuardianReq;
            case 4:
                SignUpActivity.a aVar2 = SignUpActivity.f26029C;
                return (SignUpViewModel) new androidx.camera.video.internal.c((SignUpActivity) obj).h(SignUpViewModel.class);
            case 5:
                int i10 = SignUpSuccessActivity.f26045o;
                L8.b bVar = new L8.b((SignUpSuccessActivity) obj);
                bVar.f5559a = 400.0f;
                return bVar;
            case 6:
                return Na.b.c((Na.b) obj);
            case 7:
                AutoFixedSaveDialogFragment.a aVar3 = AutoFixedSaveDialogFragment.f32277H;
                Bundle arguments = ((AutoFixedSaveDialogFragment) obj).getArguments();
                if (arguments != null) {
                    return (FixedSavingPlanRenewPopBean) arguments.getParcelable("source");
                }
                return null;
            case 8:
                CashBoxAutoSaveDialogFragment.a aVar4 = CashBoxAutoSaveDialogFragment.f32279M;
                Bundle arguments2 = ((CashBoxAutoSaveDialogFragment) obj).getArguments();
                if (arguments2 != null) {
                    return arguments2.getString("source", "");
                }
                return null;
            case 9:
                SelectPayoutOptionsDialogFragment.a aVar5 = SelectPayoutOptionsDialogFragment.f32319X;
                Bundle arguments3 = ((SelectPayoutOptionsDialogFragment) obj).getArguments();
                if (arguments3 != null) {
                    return arguments3.getParcelableArrayList("payout_option_list");
                }
                return null;
            case 10:
                WhyTurnOffSaveDialogFragment.a aVar6 = WhyTurnOffSaveDialogFragment.f32329Z;
                Bundle arguments4 = ((WhyTurnOffSaveDialogFragment) obj).getArguments();
                if (arguments4 != null) {
                    return arguments4.getString("source", "product");
                }
                return null;
            case 11:
                WithdrawInterceptDialogFragment.a aVar7 = WithdrawInterceptDialogFragment.f32335L;
                Bundle arguments5 = ((WithdrawInterceptDialogFragment) obj).getArguments();
                if (arguments5 != null) {
                    return arguments5.getString("source", "");
                }
                return null;
            case 12:
                WithdrawSureDialogFragment.a aVar8 = WithdrawSureDialogFragment.f32336X;
                Bundle arguments6 = ((WithdrawSureDialogFragment) obj).getArguments();
                if (arguments6 != null) {
                    return Long.valueOf(arguments6.getLong("source", 0L));
                }
                return null;
            case 13:
                int i11 = FlexiBankCashierCommonPreviewActivity.f21969F0;
                return Boolean.valueOf(((FlexiBankCashierCommonPreviewActivity) obj).getIntent().getBooleanExtra("flexibank_sdk_show_cashier_preview", true));
            case 14:
                int i12 = NetworkNotConnectView.f27120i;
                Q9.c cVar = new Q9.c();
                cVar.f7647a = new WeakReference((NetworkNotConnectView) obj);
                return cVar;
            case 15:
                int i13 = FlexiBankModelPaymentEarnLayout.f22045e;
                return (RecyclerView) ((FlexiBankModelPaymentEarnLayout) obj).findViewById(p.fb_ry_payment_earn_list);
            case 16:
                int i14 = FlexiBankModelPaymentFlexiLayout.f22050b;
                return (FlexboxLayout) ((FlexiBankModelPaymentFlexiLayout) obj).findViewById(p.fb_flexbox_payment_flexi_tag_layout);
            case 17:
                return obj;
            case 18:
                GuardianApproveAuthorizationConfirmFragment guardianApproveAuthorizationConfirmFragment = (GuardianApproveAuthorizationConfirmFragment) obj;
                guardianApproveAuthorizationConfirmFragment.f26141j = true;
                E activity = guardianApproveAuthorizationConfirmFragment.getActivity();
                if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.d();
                }
                return Unit.f38893a;
            case 19:
                int i15 = ModelBillQuickAccessItem.f28279f;
                return (RecyclerView) ((ModelBillQuickAccessItem) obj).findViewById(p025ba.e.rv_bill_list);
            case 20:
                int i16 = ModelBillerUSSDItem.f28283d;
                return (ImageView) ((ModelBillerUSSDItem) obj).findViewById(p025ba.e.ussdIv);
            case 21:
                int i17 = ModelProgressListView.f28419g;
                return new h0((ModelProgressListView) obj);
            case 22:
                int i18 = PayResultLotteryView.f28557c;
                return (ActivityWebView) ((PayResultLotteryView) obj).findViewById(p025ba.e.prlWebView);
            case 23:
                C0669m c0669m = (C0669m) obj;
                Object value = c0669m.f9683p.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                p220oa.h.c((CardView) value);
                Object value2 = c0669m.f9680i.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                ((CardView) value2).setCardBackgroundColor(Color.parseColor("#FFF8EC"));
                c0669m.a().setTextColor(Color.parseColor("#FFAA0C"));
                Object value3 = c0669m.f9677e.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                p220oa.h.d((P2PDashLine) value3);
                Object value4 = c0669m.f9676d.getValue();
                Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                p220oa.h.c((CardView) value4);
                Object value5 = c0669m.f9675c.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                p220oa.h.c((LinearLayout) value5);
                Object value6 = c0669m.f9673a.getValue();
                Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
                p220oa.h.c((CardView) value6);
                return Unit.f38893a;
            case 24:
                int i19 = IdentityVerificationAddressFragment.f26156Q;
                return new KeyBoardListenerHelper(((IdentityVerificationAddressFragment) obj).getActivity());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i20 = ModelPaymentFlexiLayout.f31534b;
                return (FlexboxLayout) ((ModelPaymentFlexiLayout) obj).findViewById(s.flexbox_payment_flexi_tag_layout);
            case 26:
                Wa.b bVar2 = (Wa.b) obj;
                String str = bVar2.f10658b;
                try {
                    InputStream inputStreamOpen = bVar2.f10657a.getAssets().open(str);
                    try {
                        Intrinsics.e(inputStreamOpen);
                        String strE = p264r5.a.E(new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), UserMetadata.MAX_INTERNAL_KEY_SIZE));
                        inputStreamOpen.close();
                        JSONArray jSONArray = new JSONArray(strE);
                        HashMap map = new HashMap(jSONArray.length());
                        int length = jSONArray.length();
                        while (i7 < length) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            String strOptString = jSONObject.optString("url");
                            String strOptString2 = jSONObject.optString("assetPath");
                            Intrinsics.e(strOptString);
                            if (strOptString.length() > 0) {
                                Intrinsics.e(strOptString2);
                                if (strOptString2.length() > 0) {
                                    map.put(strOptString, strOptString2);
                                }
                            }
                            i7++;
                        }
                        F6.d.h("AssetResInterceptor", 3, "[INIT] loaded " + map.size() + " mappings from assets/" + str);
                        return map;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            org.chromium.support_lib_boundary.util.b.o(inputStreamOpen, th);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                    F6.d.h("AssetResInterceptor", 5, q0.k("[INIT] mapping file not found: assets/", str, ", interceptor disabled"));
                    aC = G.c();
                    return aC;
                } catch (Exception e10) {
                    F6.d.c("AssetResInterceptor", C0.G.o("[INIT] failed to parse mapping file: assets/", str), e10);
                    aC = G.c();
                    return aC;
                }
            case 27:
                CommomHistoryFragment.a aVar9 = CommomHistoryFragment.f34200A;
                Xd.p pVar = new Xd.p();
                CommomHistoryFragment commomHistoryFragment = (CommomHistoryFragment) obj;
                pVar.setOnItemClickListener(new B(commomHistoryFragment, pVar));
                pVar.setOnItemChildClickListener(new B(pVar, commomHistoryFragment));
                return pVar;
            case 28:
                int i21 = JambHomeActivity.f34222B;
                JambHomeActivity jambHomeActivity = (JambHomeActivity) obj;
                BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) jambHomeActivity.l();
                String str2 = jambHomeActivity.f34224i;
                billPaymentHomeNGViewModel.g(str2);
                ((BillPaymentHomeNGViewModel) jambHomeActivity.l()).h(str2);
                ((BillPaymentHomeNGViewModel) jambHomeActivity.l()).f(false, false, jambHomeActivity.f34224i, null);
                return Unit.f38893a;
            default:
                TvRenewDataInfoBean tvRenewDataInfoBean = ((TvPreCheckActivity) obj).f34232d;
                return tvRenewDataInfoBean == null ? new TvRenewDataInfoBean() : tvRenewDataInfoBean;
        }
    }
}
