package p141j9;

import C0.G;
import C9.V;
import Ea.a;
import Fb.k;
import Pa.i0;
import Pa.k0;
import Pa.r0;
import Pd.c;
import Pd.f;
import Rd.I;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.airtime.bean.AirtimeDetailData;
import com.transsnet.palmpay.airtime.ui.AirtimeBillDetailActivity;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import com.transsnet.palmpay.core.bean.BillProcessData2;
import com.transsnet.palmpay.core.bean.BillProcessDetail;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle2;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.teller.ui.view.ModelPointClaimItem;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p052da.ViewOnClickListenerC1649v;
import p054dd.d;
import p220oa.h;
import p355xf.l;

/* JADX INFO: renamed from: j9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1795c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AirtimeBillDetailActivity f38396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AirtimeBillDetailActivity f38397c;

    public /* synthetic */ C1795c(AirtimeBillDetailActivity airtimeBillDetailActivity, AirtimeBillDetailActivity airtimeBillDetailActivity2, int i7) {
        this.f38395a = i7;
        this.f38396b = airtimeBillDetailActivity;
        this.f38397c = airtimeBillDetailActivity2;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x028f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0295  */
    /* JADX WARN: Code duplicated, block: B:157:0x02aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r6v114 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        I i7;
        I i10;
        ImageView orderStatusArrow;
        I i11;
        Boolean needClaimPoint;
        Long unclaimedReturnPoint;
        I i12;
        Integer orderStatus;
        LinearLayout orderStatusLayout;
        ImageView orderStatusArrow2;
        List<BillProcessData2> list;
        I i13;
        int i14 = 13;
        AirtimeBillDetailActivity airtimeBillDetailActivity = this.f38397c;
        AirtimeBillDetailActivity airtimeBillDetailActivity2 = this.f38396b;
        boolean zBooleanValue = false;
        zBooleanValue = false;
        switch (this.f38395a) {
            case 0:
                q it = (q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof o) {
                    airtimeBillDetailActivity2.showLoadingDialog(true, true);
                } else if (it instanceof p) {
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                    CommonBeanResult commonBeanResult = (CommonBeanResult) ((p) it).f27360a;
                    if (commonBeanResult.isSuccess()) {
                        AirtimeDetailData airtimeDetailData = (AirtimeDetailData) commonBeanResult.data;
                        if (airtimeDetailData != null) {
                            airtimeBillDetailActivity.f26458g = airtimeDetailData;
                            if (i0.W(airtimeBillDetailActivity)) {
                                I i15 = (I) airtimeBillDetailActivity.f27334c;
                                if (i15 != null) {
                                    i15.f8076d.setVisibility(8);
                                }
                                if (!"03".equalsIgnoreCase(airtimeDetailData.getOrderType()) && (i13 = (I) airtimeBillDetailActivity.f27334c) != null) {
                                    i13.f8077e.setVisibility(0);
                                }
                                if (TextUtils.isEmpty(airtimeDetailData.getIcon())) {
                                    I i16 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i16 != null) {
                                        i16.f8078f.e(a.c("04", (14 & 2) != 0 ? null : -1, null, null));
                                    }
                                } else {
                                    I i17 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i17 != null) {
                                        i17.f8078f.f(airtimeDetailData.getIcon());
                                    }
                                }
                                I i18 = (I) airtimeBillDetailActivity.f27334c;
                                if (i18 != null) {
                                    i18.f8078f.o(airtimeDetailData.getNetwork());
                                }
                                I i19 = (I) airtimeBillDetailActivity.f27334c;
                                if (i19 != null) {
                                    i19.f8078f.k(airtimeDetailData.getOrderStatusDesc());
                                }
                                Long amount = Intrinsics.c(airtimeDetailData.getOrderType(), "03") ? airtimeDetailData.getAmount() : airtimeDetailData.getPayAmount();
                                I i20 = (I) airtimeBillDetailActivity.f27334c;
                                if (i20 != null) {
                                    i20.f8078f.c(r0.B(amount != null ? amount.longValue() : 0L, false));
                                }
                                Integer orderStatus2 = airtimeDetailData.getOrderStatus();
                                int iIntValue = orderStatus2 != null ? orderStatus2.intValue() : 0;
                                if ((iIntValue == 1 || iIntValue == 7) == true) {
                                    I i21 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i21 != null) {
                                        i21.f8078f.l(OrderResultHeaderModel.a.successIcon$default(OrderResultHeaderModel.f31610A, airtimeBillDetailActivity, 0.0f, 2, null));
                                    }
                                } else {
                                    Integer orderStatus3 = airtimeDetailData.getOrderStatus();
                                    int iIntValue2 = orderStatus3 != null ? orderStatus3.intValue() : 0;
                                    if (iIntValue2 == 12 || iIntValue2 == 14 || iIntValue2 == 23) {
                                        i7 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i7 != null) {
                                            i7.f8078f.l(OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, airtimeBillDetailActivity, 0.0f, 2, null));
                                        }
                                        if (!TextUtils.isEmpty(airtimeDetailData.getErrorMessage()) && (i10 = (I) airtimeBillDetailActivity.f27334c) != null) {
                                            i10.f8078f.m(airtimeDetailData.getErrorMessage());
                                        }
                                    } else {
                                        Integer orderStatus4 = airtimeDetailData.getOrderStatus();
                                        int iIntValue3 = orderStatus4 != null ? orderStatus4.intValue() : 0;
                                        if (iIntValue3 == 0 || iIntValue3 == 5 || iIntValue3 == 11 || iIntValue3 == 22 || iIntValue3 == 8 || iIntValue3 == 9) {
                                            i7 = (I) airtimeBillDetailActivity.f27334c;
                                            if (i7 != null) {
                                                i7.f8078f.l(OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, airtimeBillDetailActivity, 0.0f, 2, null));
                                            }
                                            if (!TextUtils.isEmpty(airtimeDetailData.getErrorMessage())) {
                                                i10.f8078f.m(airtimeDetailData.getErrorMessage());
                                            }
                                        } else {
                                            Integer orderStatus5 = airtimeDetailData.getOrderStatus();
                                            if (((orderStatus5 != null ? orderStatus5.intValue() : 0) == 10) == true) {
                                                i7 = (I) airtimeBillDetailActivity.f27334c;
                                                if (i7 != null) {
                                                    i7.f8078f.l(OrderResultHeaderModel.a.failIcon$default(OrderResultHeaderModel.f31610A, airtimeBillDetailActivity, 0.0f, 2, null));
                                                }
                                                if (!TextUtils.isEmpty(airtimeDetailData.getErrorMessage())) {
                                                    i10.f8078f.m(airtimeDetailData.getErrorMessage());
                                                }
                                            } else {
                                                Integer orderStatus6 = airtimeDetailData.getOrderStatus();
                                                if (((orderStatus6 != null ? orderStatus6.intValue() : 0) == 21) == true) {
                                                    I i22 = (I) airtimeBillDetailActivity.f27334c;
                                                    if (i22 != null) {
                                                        i22.f8078f.l(OrderResultHeaderModel.a.bookSuccessIcon$default(OrderResultHeaderModel.f31610A, airtimeBillDetailActivity, 0.0f, 2, null));
                                                    }
                                                } else {
                                                    I i23 = (I) airtimeBillDetailActivity.f27334c;
                                                    if (i23 != null) {
                                                        i23.f8078f.l(OrderResultHeaderModel.a.processingIcon$default(OrderResultHeaderModel.f31610A, airtimeBillDetailActivity, 0.0f, 2, null));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                BillProcessDetail orderStatusInfo = airtimeDetailData.getOrderStatusInfo();
                                boolean z3 = ((orderStatusInfo == null || (list = orderStatusInfo.fullTips) == null) ? 0 : list.size()) > 0;
                                if (z3) {
                                    I i24 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i24 != null && (orderStatusArrow = i24.f8078f.getOrderStatusArrow()) != null) {
                                        orderStatusArrow.setVisibility(0);
                                    }
                                } else {
                                    I i25 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i25 != null && (orderStatusArrow2 = i25.f8078f.getOrderStatusArrow()) != null) {
                                        orderStatusArrow2.setVisibility(8);
                                    }
                                }
                                I i26 = (I) airtimeBillDetailActivity.f27334c;
                                if (i26 != null && (orderStatusLayout = i26.f8078f.getOrderStatusLayout()) != null) {
                                    orderStatusLayout.setOnClickListener(new k(airtimeBillDetailActivity, 4, airtimeDetailData, z3));
                                }
                                if (!TextUtils.isEmpty(airtimeDetailData.getPendingCouponRemark())) {
                                    I i27 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i27 != null) {
                                        i27.f8078f.i();
                                    }
                                    I i28 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i28 != null) {
                                        i28.f8078f.j(k0.b(airtimeDetailData.getPendingCouponRemark()).toString());
                                    }
                                    I i29 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i29 != null) {
                                        i29.f8078f.p(new d(i14));
                                    }
                                }
                                if ("03".equalsIgnoreCase(airtimeDetailData.getOrderType()) && (orderStatus = airtimeDetailData.getOrderStatus()) != null && orderStatus.intValue() == 21) {
                                    TextView textView = new TextView(airtimeBillDetailActivity);
                                    textView.setTextAppearance(w.txt_mi_lg);
                                    textView.setText(airtimeBillDetailActivity.getString(f.qt_airtime_down_time_detail_success_tips));
                                    int iDip2px = ScreenUtils.dip2px(12.0f);
                                    textView.setPadding(iDip2px, 0, iDip2px, iDip2px);
                                    textView.setLineSpacing(0.0f, 1.2f);
                                    I i30 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i30 != null) {
                                        i30.f8074b.addView(textView, -1, -2);
                                    }
                                } else {
                                    I i31 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i31 != null) {
                                        LinearLayout linearLayout = i31.f8074b;
                                        int i32 = v.cv_order_amount;
                                        Long amount2 = airtimeDetailData.getAmount();
                                        linearLayout.addView(new OrderResultAmountStyle1(airtimeBillDetailActivity, i32, r0.B(amount2 != null ? amount2.longValue() : 0L, false)));
                                    }
                                    Long payFee = airtimeDetailData.getPayFee();
                                    long jLongValue = payFee != null ? payFee.longValue() : 0L;
                                    Long taxFee = airtimeDetailData.getTaxFee();
                                    long jLongValue2 = jLongValue + (taxFee != null ? taxFee.longValue() : 0L);
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    if (jLongValue2 <= 0) {
                                        lValueOf = null;
                                    }
                                    if (lValueOf != null) {
                                        OrderResultAmountStyle1 orderResultAmountStyle1 = new OrderResultAmountStyle1(airtimeBillDetailActivity, v.cv_fee, r0.B(lValueOf.longValue(), false));
                                        orderResultAmountStyle1.setOnClickListener(new ViewOnClickListenerC1793a(airtimeDetailData, airtimeBillDetailActivity));
                                        I i33 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i33 != null) {
                                            i33.f8074b.addView(orderResultAmountStyle1);
                                        }
                                    }
                                    Long loyaltyPoint = airtimeDetailData.getLoyaltyPoint();
                                    if (loyaltyPoint != null) {
                                        if (loyaltyPoint.longValue() <= 0) {
                                            loyaltyPoint = null;
                                        }
                                        if (loyaltyPoint != null) {
                                            String strO = G.o("- ", r0.x0(loyaltyPoint.longValue()));
                                            I i34 = (I) airtimeBillDetailActivity.f27334c;
                                            if (i34 != null) {
                                                i34.f8074b.addView(new OrderResultAmountStyle1(airtimeBillDetailActivity, v.cv_palm_points_used, strO));
                                            }
                                        }
                                    }
                                    Long discountAmount = airtimeDetailData.getDiscountAmount();
                                    if (discountAmount != null) {
                                        if (discountAmount.longValue() <= 0) {
                                            discountAmount = null;
                                        }
                                        if (discountAmount != null) {
                                            String strO2 = G.o("- ", r0.B(discountAmount.longValue(), true));
                                            I i35 = (I) airtimeBillDetailActivity.f27334c;
                                            if (i35 != null) {
                                                i35.f8074b.addView(new OrderResultAmountStyle1(airtimeBillDetailActivity, v.cv_discount, strO2));
                                            }
                                        }
                                    }
                                    Long flexiDiscount = airtimeDetailData.getFlexiDiscount();
                                    if (flexiDiscount != null) {
                                        if (flexiDiscount.longValue() <= 0) {
                                            flexiDiscount = null;
                                        }
                                        if (flexiDiscount != null) {
                                            String strO3 = G.o("- ", r0.B(flexiDiscount.longValue(), true));
                                            I i36 = (I) airtimeBillDetailActivity.f27334c;
                                            if (i36 != null) {
                                                i36.f8074b.addView(new OrderResultAmountStyle1(airtimeBillDetailActivity, p025ba.k.core_flexi_discount, strO3));
                                            }
                                        }
                                    }
                                    Long couponAmount = airtimeDetailData.getCouponAmount();
                                    if (couponAmount != null) {
                                        if (couponAmount.longValue() <= 0) {
                                            couponAmount = null;
                                        }
                                        if (couponAmount != null) {
                                            String strO4 = G.o("- ", r0.B(couponAmount.longValue(), true));
                                            I i37 = (I) airtimeBillDetailActivity.f27334c;
                                            if (i37 != null) {
                                                i37.f8074b.addView(new OrderResultAmountStyle1(airtimeBillDetailActivity, v.cv_coupon, strO4));
                                            }
                                        }
                                    }
                                    I i38 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i38 != null) {
                                        LinearLayout linearLayout2 = i38.f8074b;
                                        int i39 = v.cv_payment_amount;
                                        Long payAmount = airtimeDetailData.getPayAmount();
                                        linearLayout2.addView(new OrderResultAmountStyle2(airtimeBillDetailActivity, i39, r0.B(payAmount != null ? payAmount.longValue() : 0L, false)));
                                    }
                                    if (airtimeDetailData.isAgent() && (i11 = (I) airtimeBillDetailActivity.f27334c) != null) {
                                        LinearLayout linearLayout3 = i11.f8074b;
                                        int i40 = p025ba.k.core_commission_earned;
                                        Long commissionAmount = airtimeDetailData.getCommissionAmount();
                                        linearLayout3.addView(new OrderResultAmountStyle2(airtimeBillDetailActivity, i40, r0.B(commissionAmount != null ? commissionAmount.longValue() : 0L, false)));
                                    }
                                    Long returnPoint = airtimeDetailData.getReturnPoint();
                                    if (returnPoint != null) {
                                        if (returnPoint.longValue() <= 0) {
                                            returnPoint = null;
                                        }
                                        if (returnPoint != null) {
                                            Long returnPoint2 = airtimeDetailData.getReturnPoint();
                                            String strO5 = G.o("+ ", r0.x0(returnPoint2 != null ? returnPoint2.longValue() : 0L));
                                            I i41 = (I) airtimeBillDetailActivity.f27334c;
                                            if (i41 != null) {
                                                i41.f8074b.addView(new OrderResultAmountStyle2(airtimeBillDetailActivity, v.cv_all_point_earned, strO5));
                                            }
                                        }
                                    }
                                    Long returnBonus = airtimeDetailData.getReturnBonus();
                                    if (returnBonus != null) {
                                        if (returnBonus.longValue() <= 0) {
                                            returnBonus = null;
                                        }
                                        if (returnBonus != null) {
                                            Long returnBonus2 = airtimeDetailData.getReturnBonus();
                                            String strT = i0.t(returnBonus2 != null ? returnBonus2.longValue() : 0L);
                                            I i42 = (I) airtimeBillDetailActivity.f27334c;
                                            if (i42 != null) {
                                                i42.f8074b.addView(new OrderResultAmountStyle2(airtimeBillDetailActivity, v.cv_all_data_bonus_earned, strT));
                                            }
                                        }
                                    }
                                }
                                List<OrderDetailItemBean> list2 = airtimeDetailData.extendFields;
                                if (list2 != null && (i12 = (I) airtimeBillDetailActivity.f27334c) != null) {
                                    i12.f8075c.a(list2, new C1794b(airtimeBillDetailActivity, zBooleanValue ? 1 : 0));
                                }
                                if ("03".equalsIgnoreCase(airtimeDetailData.getOrderType())) {
                                    Integer orderStatus7 = airtimeDetailData.getOrderStatus();
                                    if (orderStatus7 != null && orderStatus7.intValue() == 21) {
                                        I i43 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i43 != null) {
                                            i43.f8079g.c();
                                        }
                                        I i44 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i44 != null) {
                                            i44.f8079g.setVisibility(0);
                                        }
                                        I i45 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i45 != null) {
                                            i45.f8079g.setOnClickListener(new ViewOnClickListenerC1793a(airtimeBillDetailActivity, airtimeDetailData, zBooleanValue ? 1 : 0));
                                        }
                                    } else {
                                        I i46 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i46 != null) {
                                            i46.f8079g.setVisibility(8);
                                        }
                                    }
                                } else {
                                    Integer orderStatus8 = airtimeDetailData.getOrderStatus();
                                    int iIntValue4 = orderStatus8 != null ? orderStatus8.intValue() : 0;
                                    if ((iIntValue4 == 1 || iIntValue4 == 7) == true) {
                                        I i47 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i47 != null) {
                                            i47.f8079g.setVisibility(0);
                                        }
                                        I i48 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i48 != null) {
                                            i48.f8079g.setOnClickListener(new ViewOnClickListenerC1649v(airtimeDetailData, 15));
                                        }
                                        try {
                                            if (airtimeBillDetailActivity.f26455d == null) {
                                                I i49 = (I) airtimeBillDetailActivity.f27334c;
                                                if ((i49 != null ? i49.f8080i.getParent() : null) != null) {
                                                    I i50 = (I) airtimeBillDetailActivity.f27334c;
                                                    if (i50 != null) {
                                                        i50.f8080i.setLayoutResource(Pd.d.qt_stub_order_detail_reward);
                                                    }
                                                    I i51 = (I) airtimeBillDetailActivity.f27334c;
                                                    View viewInflate = i51 != null ? i51.f8080i.inflate() : null;
                                                    I i52 = (I) airtimeBillDetailActivity.f27334c;
                                                    if (i52 != null) {
                                                        h.s(i52.f8080i, true);
                                                    }
                                                    airtimeBillDetailActivity.f26455d = viewInflate != null ? (ModelPointClaimItem) viewInflate.findViewById(c.modelPointClaimItem) : null;
                                                }
                                            }
                                            ModelPointClaimItem modelPointClaimItem = airtimeBillDetailActivity.f26455d;
                                            if (modelPointClaimItem != null) {
                                                AirtimeDetailData airtimeDetailData2 = airtimeBillDetailActivity.f26458g;
                                                long jLongValue3 = (airtimeDetailData2 == null || (unclaimedReturnPoint = airtimeDetailData2.getUnclaimedReturnPoint()) == null) ? 0L : unclaimedReturnPoint.longValue();
                                                AirtimeDetailData airtimeDetailData3 = airtimeBillDetailActivity.f26458g;
                                                if (airtimeDetailData3 != null && (needClaimPoint = airtimeDetailData3.getNeedClaimPoint()) != null) {
                                                    zBooleanValue = needClaimPoint.booleanValue();
                                                }
                                                modelPointClaimItem.a(jLongValue3, zBooleanValue);
                                            }
                                            break;
                                        } catch (Exception unused) {
                                        }
                                    } else {
                                        I i53 = (I) airtimeBillDetailActivity.f27334c;
                                        if (i53 != null) {
                                            i53.f8079g.setVisibility(8);
                                        }
                                    }
                                }
                                if (Intrinsics.c(airtimeDetailData.getShowRefund(), Boolean.TRUE)) {
                                    I i54 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i54 != null) {
                                        h.C(i54.f8081j);
                                    }
                                    I i55 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i55 != null) {
                                        i55.f8081j.setOnClickListener(new ViewOnClickListenerC1649v(airtimeBillDetailActivity, 16));
                                    }
                                } else {
                                    I i56 = (I) airtimeBillDetailActivity.f27334c;
                                    if (i56 != null) {
                                        h.c(i56.f8081j);
                                    }
                                }
                            }
                        }
                    } else {
                        airtimeBillDetailActivity.showErrorMessageDialog(commonBeanResult.getRespMsg());
                    }
                } else if (it instanceof m) {
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it instanceof n)) {
                        throw new l();
                    }
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showShort(((n) it).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            case 1:
                q it2 = (q) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 instanceof o) {
                    airtimeBillDetailActivity2.showLoadingDialog(true, true);
                } else if (it2 instanceof p) {
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult = (CommonResult) ((p) it2).f27360a;
                    if (commonResult.isSuccess()) {
                        ToastUtils.showLong(p025ba.k.core_success);
                        Intent intent = new Intent();
                        intent.putExtra("orderNo", airtimeBillDetailActivity.f26456e);
                        Unit unit = Unit.f38893a;
                        airtimeBillDetailActivity.setResult(-1, intent);
                        airtimeBillDetailActivity.finish();
                    } else {
                        ToastUtils.showLong(commonResult.getRespMsg(), new Object[0]);
                    }
                } else if (it2 instanceof m) {
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it2 instanceof n)) {
                        throw new l();
                    }
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it2).f27358a, new Object[0]);
                }
                return Unit.f38893a;
            default:
                q it3 = (q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3 instanceof o) {
                    airtimeBillDetailActivity2.showLoadingDialog(true, true);
                } else if (it3 instanceof p) {
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                    CommonResult commonResult2 = (CommonResult) ((p) it3).f27360a;
                    if (commonResult2.isSuccess()) {
                        ToastUtils.showLong("Refunded successfully", new Object[0]);
                        Intent intent2 = new Intent();
                        intent2.putExtra("orderNo", airtimeBillDetailActivity.f26456e);
                        Unit unit2 = Unit.f38893a;
                        airtimeBillDetailActivity.setResult(-1, intent2);
                        airtimeBillDetailActivity.finish();
                    } else if (Intrinsics.c(commonResult2.getRespMsg(), "A000007") && Intrinsics.c(commonResult2.getRespMsg(), "A000008")) {
                        airtimeBillDetailActivity.showErrorMessageDialog(airtimeBillDetailActivity.getString(f.qt_apply_refund), commonResult2.getRespMsg(), airtimeBillDetailActivity.getString(p025ba.k.core_confirm), new V(i14, commonResult2, airtimeBillDetailActivity));
                    } else {
                        ToastUtils.showLong(commonResult2.getRespMsg(), new Object[0]);
                    }
                } else if (it3 instanceof m) {
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                } else {
                    if (!(it3 instanceof n)) {
                        throw new l();
                    }
                    airtimeBillDetailActivity2.showLoadingDialog(false, true);
                    ToastUtils.showLong(((n) it3).f27358a, new Object[0]);
                }
                return Unit.f38893a;
        }
    }
}
