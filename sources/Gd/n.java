package Gd;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelCouponPromotionItem;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelDiscountPromotionItem;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionLayout;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPointPromotionItem;
import com.transsnet.palmpay.airtime.ui.dialog.WeekAndDaySelectDialog;
import com.transsnet.palmpay.core.viewmodel.ModelProgressListView;
import com.transsnet.palmpay.custom_view.FaceRecognitionGuideView;
import com.transsnet.palmpay.custom_view.model.ModelCouponPromotionItem;
import com.transsnet.palmpay.custom_view.model.ModelDiscountPromotionItem;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionLayout;
import com.transsnet.palmpay.custom_view.model.ModelPointPromotionItem;
import com.transsnet.palmpay.send_money.ui.view.TransferToBankAccountView;
import com.transsnet.palmpay.send_money.ui.view.TransferToPalmPayAccountView;
import kotlin.jvm.functions.Function0;
import p173ld.C1894a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3361b;

    public /* synthetic */ n(Context context, int i7) {
        this.f3360a = i7;
        this.f3361b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f3361b;
        switch (this.f3360a) {
            case 0:
                int i7 = TransferToBankAccountView.f33899A;
                return new C1894a(context);
            case 1:
                int i10 = TransferToPalmPayAccountView.t;
                return new C1894a(context);
            case 2:
                int i11 = FlexiBankModelPaymentPromotionLayout.f22058w;
                FlexiBankModelPointPromotionItem flexiBankModelPointPromotionItem = new FlexiBankModelPointPromotionItem(context, null, 0);
                String string = context.getString(com.flexibank.sdk.r.fb_points);
                flexiBankModelPointPromotionItem.setMPromotionKey(string != null ? string : "");
                return flexiBankModelPointPromotionItem;
            case 3:
                int i12 = FlexiBankModelPaymentPromotionLayout.f22058w;
                FlexiBankModelDiscountPromotionItem flexiBankModelDiscountPromotionItem = new FlexiBankModelDiscountPromotionItem(context, null, 0);
                String string2 = context.getString(com.flexibank.sdk.r.fb_discount);
                flexiBankModelDiscountPromotionItem.setMPromotionKey(string2 != null ? string2 : "");
                return flexiBankModelDiscountPromotionItem;
            case 4:
                int i13 = FlexiBankModelPaymentPromotionLayout.f22058w;
                FlexiBankModelCouponPromotionItem flexiBankModelCouponPromotionItem = new FlexiBankModelCouponPromotionItem(context, null, 0);
                String string3 = context.getString(com.flexibank.sdk.r.fb_coupons);
                flexiBankModelCouponPromotionItem.setMPromotionKey(string3 != null ? string3 : "");
                return flexiBankModelCouponPromotionItem;
            case 5:
                int i14 = ModelProgressListView.f28419g;
                return new LinearLayoutManager(context, 1, false);
            case 6:
                int i15 = ModelPaymentPromotionLayout.f31554w;
                ModelPointPromotionItem modelPointPromotionItem = new ModelPointPromotionItem(context, null, 6, 0);
                String string4 = context.getString(com.transsnet.palmpay.custom_view.v.cv_points);
                modelPointPromotionItem.setMPromotionKey(string4 != null ? string4 : "");
                return modelPointPromotionItem;
            case 7:
                int i16 = ModelPaymentPromotionLayout.f31554w;
                ModelDiscountPromotionItem modelDiscountPromotionItem = new ModelDiscountPromotionItem(context, null, 6, 0);
                String string5 = context.getString(com.transsnet.palmpay.custom_view.v.cv_discount);
                modelDiscountPromotionItem.setMPromotionKey(string5 != null ? string5 : "");
                return modelDiscountPromotionItem;
            case 8:
                int i17 = ModelPaymentPromotionLayout.f31554w;
                ModelCouponPromotionItem modelCouponPromotionItem = new ModelCouponPromotionItem(context, null, 6, 0);
                String string6 = context.getString(com.transsnet.palmpay.custom_view.v.cv_coupons);
                modelCouponPromotionItem.setMPromotionKey(string6 != null ? string6 : "");
                return modelCouponPromotionItem;
            case 9:
                int i18 = FaceRecognitionGuideView.f31019d;
                return new CharSequence[]{context.getText(com.transsnet.palmpay.custom_view.v.cv_msg_face_capture_1), context.getText(com.transsnet.palmpay.custom_view.v.cv_msg_face_capture_2), context.getText(com.transsnet.palmpay.custom_view.v.cv_msg_face_capture_3)};
            default:
                return WeekAndDaySelectDialog.timeWeeks_delegate$lambda$0(context);
        }
    }
}
