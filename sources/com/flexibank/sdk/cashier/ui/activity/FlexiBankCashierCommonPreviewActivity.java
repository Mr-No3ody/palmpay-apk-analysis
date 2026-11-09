package com.flexibank.sdk.cashier.ui.activity;

import C0.G;
import M3.f;
import N8.q0;
import S3.b;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcOfPaymentMethodResultBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcPaymentEarnInfoBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcPaymentEarnItem;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcPaymentFeeInfoBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcPaymentPromotionBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcPaymentPromotionItemBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierCouponItem;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierTaxDetailBean;
import com.flexibank.sdk.cashier.bean.FlexiBankFeeTips;
import com.flexibank.sdk.cashier.bean.FlexiBankPayByOrderResp;
import com.flexibank.sdk.cashier.bean.FlexiBankPaymentFeeDetailBean;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelDiscountPromotionItem;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentEarnLayout;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentInfoItem;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionLayout;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPointPromotionItem;
import com.flexibank.sdk.p;
import com.flexibank.sdk.r;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentPromotionItemBean;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import j4.j;
import j4.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/activity/FlexiBankCashierCommonPreviewActivity;", "Lcom/flexibank/sdk/cashier/ui/activity/a;", "<init>", "()V", "a", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankCashierCommonPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankCashierCommonPreviewActivity.kt\ncom/flexibank/sdk/cashier/ui/activity/FlexiBankCashierCommonPreviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
public final class FlexiBankCashierCommonPreviewActivity extends com.flexibank.sdk.cashier.ui.activity.a {

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ int f21969F0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final t f21970E0 = C2131j.b(new f(this, 13));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // P3.c
    public final void g(FlexiBankPayByOrderResp.DataBean dataBean) {
        String orderData;
        JsonObject jsonObject;
        Intent intentA;
        JsonElement jsonElement;
        String asString = null;
        if (dataBean != null) {
            try {
                orderData = dataBean.getOrderData();
            } catch (Exception unused) {
            }
        } else {
            orderData = null;
        }
        if (orderData != null && !StringsKt.F(orderData)) {
            j jVar = j.f38294b.get();
            JsonElement jsonElement2 = (JsonElement) jVar.a(orderData, JsonElement.class);
            if (jsonElement2 instanceof JsonObject) {
                jsonObject = (JsonObject) jsonElement2;
            } else {
                jsonObject = (jsonElement2 != null && jsonElement2.isJsonPrimitive() && jsonElement2.getAsJsonPrimitive().isString()) ? (JsonObject) jVar.a(jsonElement2.getAsString(), JsonObject.class) : null;
            }
            if (jsonObject != null && (jsonElement = jsonObject.get("resultUrl")) != null) {
                if (!jsonElement.isJsonPrimitive() || !jsonElement.getAsJsonPrimitive().isString()) {
                    jsonElement = null;
                }
                if (jsonElement != null) {
                    asString = jsonElement.getAsString();
                }
            }
            if (asString != null && !StringsKt.F(asString) && (intentA = u.a(asString)) != null) {
                ActivityUtils.startActivity(intentA);
            }
        }
        setResult(-1, new Intent().putExtra("flexibank_sdk_pay_result", dataBean));
        finish();
    }

    @Override // K3.d
    public final boolean isForceNoNightMode() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0289  */
    /* JADX WARN: Code duplicated, block: B:189:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:226:0x034f  */
    /* JADX WARN: Code duplicated, block: B:261:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:303:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:304:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:311:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:322:0x059e  */
    /* JADX WARN: Code duplicated, block: B:325:0x05a8  */
    @Override // com.flexibank.sdk.cashier.ui.activity.a
    public final void v(FlexiBankCalcOfPaymentMethodResultBean bean, boolean z3) {
        long jLongValue;
        long j6;
        String title;
        String str;
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout;
        View viewFindViewById;
        FlexiBankCalcPaymentEarnInfoBean earnInfo;
        List earnItemList;
        String earnTips;
        List<FlexiBankCalcPaymentEarnItem> earnItemList2;
        Unit unit;
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout2;
        String strJ;
        String strO;
        long jLongValue2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String strO2;
        String strJ2;
        long jLongValue3;
        boolean z8;
        boolean zBooleanValue3;
        boolean z10;
        String string;
        String str2;
        Long l5;
        String couponType;
        boolean zBooleanValue4;
        int i7;
        boolean zBooleanValue5;
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout3;
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout4;
        FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout5;
        FlexiBankModelDiscountPromotionItem discountPromotionItem;
        FlexiBankModelPointPromotionItem pointPromotionItem;
        List promotionItemList;
        Object next;
        List promotionItemList2;
        Object next2;
        List promotionItemList3;
        Object next3;
        String promotionTips;
        Unit unit2;
        List promotionItemList4;
        FlexiBankPaymentFeeDetailBean feeDetail;
        ImageView itemKeyIconIv;
        TextView itemKeyTv;
        ImageView itemKeyIconIv2;
        String tipsText;
        FlexiBankFeeTips feeTips;
        Long platformVat;
        Long platformFee;
        Long vat;
        Long fee;
        Intrinsics.checkNotNullParameter(bean, "bean");
        Intrinsics.checkNotNullParameter(bean, "bean");
        if (!TextUtils.isEmpty(bean.getRiskMsg())) {
            ToastUtils.showLong(bean.getRiskMsg(), new Object[0]);
        }
        long j10 = this.f6882M;
        if (j10 > 0) {
            x4.a aVar = (x4.a) this.f4917e;
            if (aVar != null) {
                aVar.f43572d.f594e.setText(p118hf.a.t(j10, true));
            }
        } else {
            x4.a aVar2 = (x4.a) this.f4917e;
            if (aVar2 != null) {
                aVar2.f43572d.f594e.setText(p118hf.a.t(0L, true));
            }
        }
        s(bean);
        FlexiBankCalcPaymentFeeInfoBean feeInfo = bean.getFeeInfo();
        long jLongValue4 = ((feeInfo == null || (fee = feeInfo.getFee()) == null) ? 0L : fee.longValue()) + ((feeInfo == null || (vat = feeInfo.getVat()) == null) ? 0L : vat.longValue());
        long jLongValue5 = ((feeInfo == null || (platformFee = feeInfo.getPlatformFee()) == null) ? 0L : platformFee.longValue()) + ((feeInfo == null || (platformVat = feeInfo.getPlatformVat()) == null) ? 0L : platformVat.longValue());
        FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL = l();
        if (flexiBankModelPaymentInfoItemL != null) {
            flexiBankModelPaymentInfoItemL.setVisibility(jLongValue4 + jLongValue5 > 0 ? 0 : 8);
        }
        FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL2 = l();
        if (flexiBankModelPaymentInfoItemL2 != null) {
            flexiBankModelPaymentInfoItemL2.f(p118hf.a.t(jLongValue4, true));
        }
        if (jLongValue5 > 0) {
            FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL3 = l();
            if (flexiBankModelPaymentInfoItemL3 != null) {
                flexiBankModelPaymentInfoItemL3.e(p118hf.a.t(jLongValue4 + jLongValue5, true));
            }
        } else {
            FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL4 = l();
            if (flexiBankModelPaymentInfoItemL4 != null) {
                flexiBankModelPaymentInfoItemL4.e("");
            }
        }
        FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL5 = l();
        if (flexiBankModelPaymentInfoItemL5 != null) {
            if (feeInfo == null || (feeTips = feeInfo.getFeeTips()) == null || (tipsText = feeTips.getTipsText()) == null) {
                tipsText = "";
            }
            flexiBankModelPaymentInfoItemL5.c(tipsText);
        }
        if (feeInfo != null && (feeDetail = feeInfo.getFeeDetail()) != null) {
            FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL6 = l();
            if (flexiBankModelPaymentInfoItemL6 != null && (itemKeyIconIv2 = flexiBankModelPaymentInfoItemL6.getItemKeyIconIv()) != null) {
                p062e4.a.d(itemKeyIconIv2, true);
            }
            Oc.j jVar = new Oc.j(4, this, feeDetail);
            FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL7 = l();
            if (flexiBankModelPaymentInfoItemL7 != null && (itemKeyTv = flexiBankModelPaymentInfoItemL7.getItemKeyTv()) != null) {
                itemKeyTv.setOnClickListener(jVar);
            }
            FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemL8 = l();
            if (flexiBankModelPaymentInfoItemL8 != null && (itemKeyIconIv = flexiBankModelPaymentInfoItemL8.getItemKeyIconIv()) != null) {
                itemKeyIconIv.setOnClickListener(jVar);
            }
        }
        FlexiBankCashierTaxDetailBean taxInfo = bean.getTaxInfo();
        if (taxInfo == null) {
            FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemN = n();
            if (flexiBankModelPaymentInfoItemN != null) {
                flexiBankModelPaymentInfoItemN.setVisibility(8);
            }
            j6 = 0;
        } else {
            Long totalPayerTax = taxInfo.getTotalPayerTax();
            long jLongValue6 = totalPayerTax != null ? totalPayerTax.longValue() : 0L;
            Long totalPlatformTax = taxInfo.getTotalPlatformTax();
            if (totalPlatformTax != null) {
                jLongValue = totalPlatformTax.longValue();
                j6 = 0;
            } else {
                jLongValue = 0;
                j6 = 0;
            }
            long j11 = jLongValue6 + jLongValue;
            if (j11 <= j6) {
                FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemN2 = n();
                if (flexiBankModelPaymentInfoItemN2 != null) {
                    flexiBankModelPaymentInfoItemN2.setVisibility(8);
                }
            } else {
                FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItemN3 = n();
                if (flexiBankModelPaymentInfoItemN3 != null) {
                    flexiBankModelPaymentInfoItemN3.setVisibility(0);
                    List payerTaxDetails = taxInfo.getPayerTaxDetails();
                    String title2 = "Tax";
                    if (payerTaxDetails != null) {
                        if (payerTaxDetails.isEmpty()) {
                            payerTaxDetails = null;
                        }
                        if (payerTaxDetails != null) {
                            if (payerTaxDetails.size() > 1) {
                                title2 = taxInfo.getTitle();
                                if (title2 == null) {
                                    title2 = "Taxes";
                                }
                            } else if (payerTaxDetails.size() == 1 && (title = ((FlexiBankCashierTaxDetailBean.TaxDetail) payerTaxDetails.get(0)).getTitle()) != null) {
                                title2 = title;
                            }
                        }
                    }
                    flexiBankModelPaymentInfoItemN3.d(title2);
                    flexiBankModelPaymentInfoItemN3.f(p118hf.a.t(jLongValue6, true));
                    if (jLongValue > j6) {
                        flexiBankModelPaymentInfoItemN3.e(p118hf.a.t(j11, true));
                    } else {
                        flexiBankModelPaymentInfoItemN3.e("");
                    }
                    flexiBankModelPaymentInfoItemN3.c(taxInfo.getPayerTaxTips());
                    ImageView itemKeyIconIv3 = flexiBankModelPaymentInfoItemN3.getItemKeyIconIv();
                    if (itemKeyIconIv3 != null) {
                        p062e4.a.d(itemKeyIconIv3, true);
                    }
                    Oc.j jVar2 = new Oc.j(3, this, taxInfo);
                    TextView itemKeyTv2 = flexiBankModelPaymentInfoItemN3.getItemKeyTv();
                    if (itemKeyTv2 != null) {
                        itemKeyTv2.setOnClickListener(jVar2);
                    }
                    ImageView itemKeyIconIv4 = flexiBankModelPaymentInfoItemN3.getItemKeyIconIv();
                    if (itemKeyIconIv4 != null) {
                        itemKeyIconIv4.setOnClickListener(jVar2);
                    }
                }
            }
        }
        if (this.f21993w0 == null) {
            try {
                x4.a aVar3 = (x4.a) this.f4917e;
                View viewInflate = aVar3 != null ? ((ViewStub) aVar3.f43572d.f599o).inflate() : null;
                if (viewInflate != null) {
                    this.f21993w0 = (FlexiBankModelPaymentInfoItem) viewInflate.findViewById(p.fb_previewEarlyRefundItem);
                }
            } catch (Exception e10) {
                Log.e(this.f4914b, "getMonthEarlyRefundLayout: ", e10);
            }
        }
        FlexiBankModelPaymentInfoItem flexiBankModelPaymentInfoItem = this.f21993w0;
        if (flexiBankModelPaymentInfoItem != null) {
            p062e4.a.d(flexiBankModelPaymentInfoItem, Intrinsics.c(bean.getEarlyRefundEnable(), Boolean.TRUE));
        }
        x4.a aVar4 = (x4.a) this.f4917e;
        if (aVar4 != null) {
            TextView textView = (TextView) aVar4.f43572d.t;
            Long totalDiscountAmount = bean.getTotalDiscountAmount();
            if ((totalDiscountAmount != null ? totalDiscountAmount.longValue() : j6) > j6) {
                p062e4.a.d(textView, true);
                Long totalDiscountAmount2 = bean.getTotalDiscountAmount();
                long jLongValue7 = totalDiscountAmount2 != null ? totalDiscountAmount2.longValue() : j6;
                Long payAmount = bean.getPayAmount();
                textView.setText(p118hf.a.t(jLongValue7 + (payAmount != null ? payAmount.longValue() : j6), true));
                textView.setPaintFlags(textView.getPaintFlags() | 16);
            } else {
                p062e4.a.d(textView, false);
            }
            Unit unit3 = Unit.f38893a;
        }
        if (bean.getPromotion() != null) {
            q();
            FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout6 = this.f21980A0;
            if (flexiBankModelPaymentPromotionLayout6 != null) {
                p062e4.a.d(flexiBankModelPaymentPromotionLayout6, true);
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                str = "";
                q();
                flexiBankModelPaymentPromotionLayout = this.f21980A0;
                if (flexiBankModelPaymentPromotionLayout != null) {
                    p062e4.a.d(flexiBankModelPaymentPromotionLayout, false);
                    Unit unit4 = Unit.f38893a;
                }
            } else {
                FlexiBankCalcPaymentPromotionBean promotion = bean.getPromotion();
                if (promotion == null || (promotionTips = promotion.getPromotionTips()) == null) {
                    q();
                    flexiBankModelPaymentPromotionLayout2 = this.f21980A0;
                    if (flexiBankModelPaymentPromotionLayout2 != null) {
                        flexiBankModelPaymentPromotionLayout2.c(0, "");
                        Unit unit5 = Unit.f38893a;
                    }
                } else {
                    q();
                    FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout7 = this.f21980A0;
                    if (flexiBankModelPaymentPromotionLayout7 != null) {
                        FlexiBankCalcPaymentPromotionBean promotion2 = bean.getPromotion();
                        flexiBankModelPaymentPromotionLayout7.c((promotion2 == null || (promotionItemList4 = promotion2.getPromotionItemList()) == null) ? 0 : promotionItemList4.size(), promotionTips);
                        unit2 = Unit.f38893a;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        q();
                        flexiBankModelPaymentPromotionLayout2 = this.f21980A0;
                        if (flexiBankModelPaymentPromotionLayout2 != null) {
                            flexiBankModelPaymentPromotionLayout2.c(0, "");
                            Unit unit6 = Unit.f38893a;
                        }
                    }
                }
                FlexiBankCalcPaymentPromotionBean promotion3 = bean.getPromotion();
                if (promotion3 == null || (promotionItemList3 = promotion3.getPromotionItemList()) == null) {
                    strJ = "";
                    strO = strJ;
                    jLongValue2 = j6;
                    zBooleanValue = false;
                    zBooleanValue2 = false;
                } else {
                    Iterator it = promotionItemList3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!CalcPaymentPromotionItemBean.PROMOTION_TYPE_POINT.equalsIgnoreCase(((FlexiBankCalcPaymentPromotionItemBean) next3).getPromotionType()));
                    FlexiBankCalcPaymentPromotionItemBean flexiBankCalcPaymentPromotionItemBean = (FlexiBankCalcPaymentPromotionItemBean) next3;
                    if (flexiBankCalcPaymentPromotionItemBean != null) {
                        Boolean isUsed = flexiBankCalcPaymentPromotionItemBean.getIsUsed();
                        zBooleanValue = isUsed != null ? isUsed.booleanValue() : false;
                        Long promotionAmount = flexiBankCalcPaymentPromotionItemBean.getPromotionAmount();
                        strO = G.o("-", p118hf.a.t(promotionAmount != null ? promotionAmount.longValue() : j6, true));
                        Long promotionAmount2 = flexiBankCalcPaymentPromotionItemBean.getPromotionAmount();
                        jLongValue2 = promotionAmount2 != null ? promotionAmount2.longValue() : j6;
                        Boolean isShow = flexiBankCalcPaymentPromotionItemBean.getIsShow();
                        zBooleanValue2 = isShow != null ? isShow.booleanValue() : false;
                        Long promotionAmount3 = flexiBankCalcPaymentPromotionItemBean.getPromotionAmount();
                        strJ = q0.j(p118hf.a.t(promotionAmount3 != null ? promotionAmount3.longValue() : j6, true), " available");
                        Unit unit7 = Unit.f38893a;
                    } else {
                        strJ = "";
                        strO = strJ;
                        jLongValue2 = j6;
                        zBooleanValue = false;
                        zBooleanValue2 = false;
                    }
                }
                FlexiBankCalcPaymentPromotionBean promotion4 = bean.getPromotion();
                if (promotion4 == null || (promotionItemList2 = promotion4.getPromotionItemList()) == null) {
                    jLongValue2 = jLongValue2;
                    strO2 = "";
                    strJ2 = strO2;
                    jLongValue3 = j6;
                    z8 = false;
                    zBooleanValue3 = false;
                } else {
                    Iterator it2 = promotionItemList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!"DISCOUNT".equalsIgnoreCase(((FlexiBankCalcPaymentPromotionItemBean) next2).getPromotionType()));
                    FlexiBankCalcPaymentPromotionItemBean flexiBankCalcPaymentPromotionItemBean2 = (FlexiBankCalcPaymentPromotionItemBean) next2;
                    if (flexiBankCalcPaymentPromotionItemBean2 != null) {
                        Boolean isUsed2 = flexiBankCalcPaymentPromotionItemBean2.getIsUsed();
                        boolean zBooleanValue6 = isUsed2 != null ? isUsed2.booleanValue() : false;
                        Long promotionAmount4 = flexiBankCalcPaymentPromotionItemBean2.getPromotionAmount();
                        jLongValue3 = promotionAmount4 != null ? promotionAmount4.longValue() : j6;
                        Long promotionAmount5 = flexiBankCalcPaymentPromotionItemBean2.getPromotionAmount();
                        strO2 = G.o("-", p118hf.a.t(promotionAmount5 != null ? promotionAmount5.longValue() : j6, true));
                        Boolean isShow2 = flexiBankCalcPaymentPromotionItemBean2.getIsShow();
                        zBooleanValue3 = isShow2 != null ? isShow2.booleanValue() : false;
                        Long promotionAmount6 = flexiBankCalcPaymentPromotionItemBean2.getPromotionAmount();
                        strJ2 = q0.j(p118hf.a.t(promotionAmount6 != null ? promotionAmount6.longValue() : j6, true), " available");
                        Unit unit8 = Unit.f38893a;
                        z8 = zBooleanValue6;
                    } else {
                        jLongValue2 = jLongValue2;
                        strO2 = "";
                        strJ2 = strO2;
                        jLongValue3 = j6;
                        z8 = false;
                        zBooleanValue3 = false;
                    }
                }
                FlexiBankCalcPaymentPromotionBean promotion5 = bean.getPromotion();
                if (promotion5 == null || (promotionItemList = promotion5.getPromotionItemList()) == null) {
                    z10 = zBooleanValue;
                } else {
                    Iterator it3 = promotionItemList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z10 = zBooleanValue;
                            next = null;
                            break;
                        } else {
                            next = it3.next();
                            z10 = zBooleanValue;
                            if (CalcPaymentPromotionItemBean.PROMOTION_TYPE_COUPON.equalsIgnoreCase(((FlexiBankCalcPaymentPromotionItemBean) next).getPromotionType())) {
                                break;
                            } else {
                                zBooleanValue = z10;
                            }
                        }
                    }
                    FlexiBankCalcPaymentPromotionItemBean flexiBankCalcPaymentPromotionItemBean3 = (FlexiBankCalcPaymentPromotionItemBean) next;
                    if (flexiBankCalcPaymentPromotionItemBean3 != null) {
                        Boolean isUsed3 = flexiBankCalcPaymentPromotionItemBean3.getIsUsed();
                        zBooleanValue4 = isUsed3 != null ? isUsed3.booleanValue() : false;
                        Integer availableCoupon = flexiBankCalcPaymentPromotionItemBean3.getAvailableCoupon();
                        int iIntValue = availableCoupon != null ? availableCoupon.intValue() : 0;
                        Long promotionAmount7 = flexiBankCalcPaymentPromotionItemBean3.getPromotionAmount();
                        String strO3 = G.o("-", p118hf.a.t(promotionAmount7 != null ? promotionAmount7.longValue() : j6, true));
                        Boolean isShow3 = flexiBankCalcPaymentPromotionItemBean3.getIsShow();
                        zBooleanValue5 = isShow3 != null ? isShow3.booleanValue() : false;
                        Long couponId = flexiBankCalcPaymentPromotionItemBean3.getCouponId();
                        couponType = flexiBankCalcPaymentPromotionItemBean3.getCouponType();
                        i7 = iIntValue;
                        int i10 = r.fb_x_max_available;
                        Long promotionAmount8 = flexiBankCalcPaymentPromotionItemBean3.getPromotionAmount();
                        string = getString(i10, p118hf.a.t(promotionAmount8 != null ? promotionAmount8.longValue() : j6, true));
                        Unit unit9 = Unit.f38893a;
                        str2 = strO3;
                        l5 = couponId;
                    }
                    if (!zBooleanValue4) {
                        this.f21990t0 = null;
                    } else if (z3 && l5 != null && l5.longValue() != j6) {
                        FlexiBankCashierCouponItem flexiBankCashierCouponItem = new FlexiBankCashierCouponItem(0);
                        flexiBankCashierCouponItem.s(l5);
                        flexiBankCashierCouponItem.t(couponType);
                        this.f21990t0 = flexiBankCashierCouponItem;
                    }
                    q();
                    flexiBankModelPaymentPromotionLayout3 = this.f21980A0;
                    if (flexiBankModelPaymentPromotionLayout3 != null) {
                        flexiBankModelPaymentPromotionLayout3.getCouponPromotionItem().e(string);
                        q();
                        flexiBankModelPaymentPromotionLayout4 = this.f21980A0;
                        if (flexiBankModelPaymentPromotionLayout4 != null && (pointPromotionItem = flexiBankModelPaymentPromotionLayout4.getPointPromotionItem()) != null) {
                            pointPromotionItem.e(strJ);
                        }
                        q();
                        flexiBankModelPaymentPromotionLayout5 = this.f21980A0;
                        if (flexiBankModelPaymentPromotionLayout5 != null && (discountPromotionItem = flexiBankModelPaymentPromotionLayout5.getDiscountPromotionItem()) != null) {
                            discountPromotionItem.e(strJ2);
                        }
                        str = "";
                        flexiBankModelPaymentPromotionLayout3.a(kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z10)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue2)), new Pair("DATA_POINT_PROMOTION_VALUE", ""), new Pair("DATA_POINT_PROMOTION_AMOUNT_STR", strO), new Pair("DATA_POINT_PROMOTION_AMOUNT", Long.valueOf(jLongValue2))), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z8)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue3)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT", Long.valueOf(jLongValue3)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT_STR", strO2)), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(zBooleanValue4)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue5)), new Pair("DATA_COUPON_PROMOTION_AMOUNT_STR", str2), new Pair("DATA_COUPON_NUMBER_VALUE", Integer.valueOf(i7))));
                        Unit unit10 = Unit.f38893a;
                    } else {
                        str = "";
                    }
                }
                string = "";
                str2 = string;
                l5 = null;
                couponType = null;
                zBooleanValue4 = false;
                i7 = 0;
                zBooleanValue5 = false;
                if (!zBooleanValue4) {
                    this.f21990t0 = null;
                } else if (z3) {
                    FlexiBankCashierCouponItem flexiBankCashierCouponItem2 = new FlexiBankCashierCouponItem(0);
                    flexiBankCashierCouponItem2.s(l5);
                    flexiBankCashierCouponItem2.t(couponType);
                    this.f21990t0 = flexiBankCashierCouponItem2;
                }
                q();
                flexiBankModelPaymentPromotionLayout3 = this.f21980A0;
                if (flexiBankModelPaymentPromotionLayout3 != null) {
                    flexiBankModelPaymentPromotionLayout3.getCouponPromotionItem().e(string);
                    q();
                    flexiBankModelPaymentPromotionLayout4 = this.f21980A0;
                    if (flexiBankModelPaymentPromotionLayout4 != null) {
                        pointPromotionItem.e(strJ);
                    }
                    q();
                    flexiBankModelPaymentPromotionLayout5 = this.f21980A0;
                    if (flexiBankModelPaymentPromotionLayout5 != null) {
                        discountPromotionItem.e(strJ2);
                    }
                    str = "";
                    flexiBankModelPaymentPromotionLayout3.a(kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z10)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue2)), new Pair("DATA_POINT_PROMOTION_VALUE", ""), new Pair("DATA_POINT_PROMOTION_AMOUNT_STR", strO), new Pair("DATA_POINT_PROMOTION_AMOUNT", Long.valueOf(jLongValue2))), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z8)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue3)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT", Long.valueOf(jLongValue3)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT_STR", strO2)), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(zBooleanValue4)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue5)), new Pair("DATA_COUPON_PROMOTION_AMOUNT_STR", str2), new Pair("DATA_COUPON_NUMBER_VALUE", Integer.valueOf(i7))));
                    Unit unit11 = Unit.f38893a;
                } else {
                    str = "";
                }
            }
        } else {
            str = "";
            q();
            flexiBankModelPaymentPromotionLayout = this.f21980A0;
            if (flexiBankModelPaymentPromotionLayout != null) {
                p062e4.a.d(flexiBankModelPaymentPromotionLayout, false);
                Unit unit12 = Unit.f38893a;
            }
        }
        if (bean.getEarnInfo() == null || (earnInfo = bean.getEarnInfo()) == null || (earnItemList = earnInfo.getEarnItemList()) == null || !(!earnItemList.isEmpty())) {
            x4.a aVar5 = (x4.a) this.f4917e;
            if (aVar5 != null) {
                ((FlexiBankModelPaymentEarnLayout) aVar5.f43572d.f596g).setVisibility(8);
            }
        } else {
            x4.a aVar6 = (x4.a) this.f4917e;
            if (aVar6 != null) {
                ((FlexiBankModelPaymentEarnLayout) aVar6.f43572d.f596g).setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            FlexiBankCalcPaymentEarnInfoBean earnInfo2 = bean.getEarnInfo();
            if (earnInfo2 != null && (earnItemList2 = earnInfo2.getEarnItemList()) != null) {
                for (FlexiBankCalcPaymentEarnItem flexiBankCalcPaymentEarnItem : earnItemList2) {
                    arrayList.add(new b(flexiBankCalcPaymentEarnItem.getShowName(), flexiBankCalcPaymentEarnItem.getShowValue()));
                }
            }
            x4.a aVar7 = (x4.a) this.f4917e;
            if (aVar7 != null) {
                FlexiBankModelPaymentEarnLayout flexiBankModelPaymentEarnLayout = (FlexiBankModelPaymentEarnLayout) aVar7.f43572d.f596g;
                FlexiBankCalcPaymentEarnInfoBean earnInfo3 = bean.getEarnInfo();
                flexiBankModelPaymentEarnLayout.setEarnInfoTips((earnInfo3 == null || (earnTips = earnInfo3.getEarnTips()) == null) ? str : earnTips);
            }
            x4.a aVar8 = (x4.a) this.f4917e;
            if (aVar8 != null) {
                ((FlexiBankModelPaymentEarnLayout) aVar8.f43572d.f596g).setEarnInfoList(arrayList);
            }
        }
        if (!Intrinsics.c(bean.getIsQuickPay(), Boolean.TRUE) && (viewFindViewById = findViewById(p.fb_cl_cashier_preview)) != null) {
            p062e4.a.d(viewFindViewById, true);
        }
        Intrinsics.checkNotNullParameter(bean, "bean");
        if (((Boolean) this.f21970E0.getValue()).booleanValue() || !z3) {
            return;
        }
        showLoadingDialog(true);
        if (this.f21991u0 != null) {
            u();
            return;
        }
        View viewFindViewById2 = findViewById(p.fb_cl_cashier_preview);
        if (viewFindViewById2 == null || viewFindViewById2.getVisibility() != 0) {
            finish();
        }
    }
}
