package Ab;

import Pa.n0;
import Pa.r0;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Z;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.bean.CLBorrowAllDiscountInfo;
import com.transsnet.palmpay.credit.bean.req.CLWithdrawReq;
import com.transsnet.palmpay.credit.bean.req.OrderExtendData;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.credit.bean.resp.RepaymentPlan;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowData;
import com.transsnet.palmpay.credit.ui.dialog.CLBorrowDateDisableDialog;
import com.transsnet.palmpay.credit.ui.dialog.CLBorrowRepaymentDialog;
import com.transsnet.palmpay.credit.ui.dialog.SelectKeepTimeDialogFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLBorrowBaseFragment;
import com.transsnet.palmpay.credit.ui.fragment.cashloan.CLInstallmentBorrowFragment;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CLInstallmentBorrowFragment f123b;

    public /* synthetic */ f(CLInstallmentBorrowFragment cLInstallmentBorrowFragment, int i7) {
        this.f122a = i7;
        this.f123b = cLInstallmentBorrowFragment;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:138:0x0306  */
    /* JADX WARN: Code duplicated, block: B:141:0x030c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0313  */
    /* JADX WARN: Code duplicated, block: B:145:0x0319  */
    /* JADX WARN: Code duplicated, block: B:146:0x0320  */
    /* JADX WARN: Code duplicated, block: B:152:0x033c  */
    /* JADX WARN: Code duplicated, block: B:164:0x035f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0362  */
    /* JADX WARN: Code duplicated, block: B:167:0x0366  */
    /* JADX WARN: Code duplicated, block: B:172:0x0375  */
    /* JADX WARN: Code duplicated, block: B:173:0x0378  */
    /* JADX WARN: Code duplicated, block: B:199:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:226:0x043c  */
    /* JADX WARN: Code duplicated, block: B:227:0x0443  */
    /* JADX WARN: Code duplicated, block: B:230:0x0449  */
    /* JADX WARN: Code duplicated, block: B:231:0x0450  */
    /* JADX WARN: Code duplicated, block: B:234:0x0456  */
    /* JADX WARN: Code duplicated, block: B:235:0x045d  */
    /* JADX WARN: Code duplicated, block: B:241:0x0479  */
    /* JADX WARN: Code duplicated, block: B:253:0x049c  */
    /* JADX WARN: Code duplicated, block: B:254:0x049f  */
    /* JADX WARN: Code duplicated, block: B:256:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:261:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b5  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Long maxLoanAmt;
        long repaymentDate;
        CLBorrowCouponData coupon;
        Integer couponDiscountInfo;
        CLBorrowCouponData coupon2;
        Long nominaValue;
        long jLongValue;
        int i7;
        Integer reductionWay;
        Integer reductionWay2;
        CLBorrowCouponData coupon3;
        CLWithdrawReq cLWithdrawReq;
        CLBorrowCouponData coupon4;
        Integer discountType;
        Integer num;
        Integer num2;
        CLBorrowCouponData coupon5;
        Integer couponDiscountInfo2;
        CLRepaymentPlanData cLRepaymentPlanData;
        List<RepaymentPlan> repaymentPlanList;
        CLRepaymentPlanData cLRepaymentPlanData2;
        String term;
        CLRepaymentPlanData cLRepaymentPlanData3;
        Integer productSubId;
        CLRepaymentPlanData cLRepaymentPlanData4;
        int iIntValue;
        CLRepaymentPlanData cLRepaymentPlanData5;
        CLRepaymentPlanData cLRepaymentPlanData6;
        CLBorrowCouponData coupon6;
        Long nominaValue2;
        Long l5;
        String str;
        Integer reductionWay3;
        Integer reductionWay4;
        Integer reductionWay5;
        Integer reductionWay6;
        CLBorrowCouponData coupon7;
        int i10;
        CLBorrowCouponData coupon8;
        Integer discountType2;
        Integer num3;
        Integer num4;
        CLBorrowCouponData coupon9;
        Integer couponDiscountInfo3;
        CLRepaymentPlanData cLRepaymentPlanData7;
        List<RepaymentPlan> repaymentPlanList2;
        CLRepaymentPlanData cLRepaymentPlanData8;
        String term2;
        CLRepaymentPlanData cLRepaymentPlanData9;
        Integer productSubId2;
        CLRepaymentPlanData cLRepaymentPlanData10;
        int iIntValue2;
        CLRepaymentPlanData cLRepaymentPlanData11;
        CLRepaymentPlanData cLRepaymentPlanData12;
        CLBorrowCouponData coupon10;
        Long nominaValue3;
        Long l6;
        String str2;
        Integer reductionWay7;
        Integer reductionWay8;
        Integer reductionWay9;
        Integer reductionWay10;
        CLBorrowCouponData coupon11;
        final int i11 = 3;
        final int i12 = 2;
        cLWithdrawReq = null;
        cLWithdrawReq = null;
        CLWithdrawReq cLWithdrawReq2 = null;
        final int i13 = 1;
        final int iIntValue3 = 0;
        final CLInstallmentBorrowFragment cLInstallmentBorrowFragment = this.f123b;
        long jLongValue2 = 0;
        switch (this.f122a) {
            case 0:
                int i14 = CLBorrowBaseFragment.f30503H1;
                cLInstallmentBorrowFragment.d0(true);
                break;
            case 1:
                int i15 = CLBorrowBaseFragment.f30503H1;
                AmountEditText amountEditTextX = cLInstallmentBorrowFragment.x();
                CLCanBorrowData cLCanBorrowData = cLInstallmentBorrowFragment.f30555l1;
                if (cLCanBorrowData != null && (maxLoanAmt = cLCanBorrowData.getMaxLoanAmt()) != null) {
                    jLongValue2 = maxLoanAmt.longValue();
                }
                amountEditTextX.setText(new SpannableStringBuilder(r0.n0(jLongValue2)));
                cLInstallmentBorrowFragment.d0(false);
                cLInstallmentBorrowFragment.t();
                break;
            case 2:
                int i16 = CLBorrowBaseFragment.f30503H1;
                new CLBorrowDateDisableDialog(cLInstallmentBorrowFragment.getContext()).show();
                break;
            case 3:
                int i17 = CLBorrowBaseFragment.f30503H1;
                cLInstallmentBorrowFragment.b0();
                break;
            case 4:
                int i18 = CLBorrowBaseFragment.f30503H1;
                Object obj = cLInstallmentBorrowFragment.f30566r1.get(cLInstallmentBorrowFragment.f30559o1);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                CLRepaymentPlanData cLRepaymentPlanData13 = (CLRepaymentPlanData) obj;
                List<RepaymentPlan> repaymentPlanList3 = cLRepaymentPlanData13.getRepaymentPlanList();
                if (repaymentPlanList3 == null || repaymentPlanList3.isEmpty()) {
                    repaymentDate = 0L;
                } else {
                    List<RepaymentPlan> repaymentPlanList4 = cLRepaymentPlanData13.getRepaymentPlanList();
                    Intrinsics.e(repaymentPlanList4);
                    List<RepaymentPlan> repaymentPlanList5 = cLRepaymentPlanData13.getRepaymentPlanList();
                    repaymentDate = repaymentPlanList4.get((repaymentPlanList5 != null ? repaymentPlanList5.size() : 1) - 1).getRepaymentDate();
                }
                Bundle bundle = new Bundle();
                bundle.putString("loanAmount", String.valueOf(cLInstallmentBorrowFragment.x().getLong()));
                bundle.putString("repaymentDate", String.valueOf(repaymentDate));
                CLRepaymentPlanData cLRepaymentPlanData14 = cLInstallmentBorrowFragment.f30562p1;
                bundle.putString("couponId", String.valueOf((cLRepaymentPlanData14 == null || (coupon3 = cLRepaymentPlanData14.getCoupon()) == null) ? null : coupon3.getCouponId()));
                CLRepaymentPlanData cLRepaymentPlanData15 = cLInstallmentBorrowFragment.f30562p1;
                bundle.putString("productSubId", String.valueOf(cLRepaymentPlanData15 != null ? cLRepaymentPlanData15.getProductSubId() : null));
                bundle.putString("accountType", String.valueOf(cLInstallmentBorrowFragment.f30554k1));
                CLRepaymentPlanData cLRepaymentPlanData16 = cLInstallmentBorrowFragment.f30562p1;
                bundle.putString("reductionWay", String.valueOf(cLRepaymentPlanData16 != null ? cLRepaymentPlanData16.getReductionWay() : null));
                CLRepaymentPlanData cLRepaymentPlanData17 = cLInstallmentBorrowFragment.f30562p1;
                bundle.putString("discountType", String.valueOf(cLRepaymentPlanData17 != null ? cLRepaymentPlanData17.getDiscountType() : null));
                CLRepaymentPlanData cLRepaymentPlanData18 = cLInstallmentBorrowFragment.f30562p1;
                if (cLRepaymentPlanData18 == null || (reductionWay2 = cLRepaymentPlanData18.getReductionWay()) == null || reductionWay2.intValue() != 2) {
                    CLRepaymentPlanData cLRepaymentPlanData19 = cLInstallmentBorrowFragment.f30562p1;
                    if (cLRepaymentPlanData19 != null && (coupon = cLRepaymentPlanData19.getCoupon()) != null && (couponDiscountInfo = coupon.getCouponDiscountInfo()) != null) {
                        iIntValue3 = couponDiscountInfo.intValue();
                    }
                } else {
                    CLRepaymentPlanData cLRepaymentPlanData20 = cLInstallmentBorrowFragment.f30562p1;
                    iIntValue3 = r0.w1(String.valueOf(cLRepaymentPlanData20 != null ? cLRepaymentPlanData20.getDiscountRatio() : null), "100").intValueExact();
                }
                bundle.putString("couponDiscountInfo", String.valueOf(iIntValue3));
                CLRepaymentPlanData cLRepaymentPlanData21 = cLInstallmentBorrowFragment.f30562p1;
                if (cLRepaymentPlanData21 == null || (reductionWay = cLRepaymentPlanData21.getReductionWay()) == null || reductionWay.intValue() != 2) {
                    CLRepaymentPlanData cLRepaymentPlanData22 = cLInstallmentBorrowFragment.f30562p1;
                    if (cLRepaymentPlanData22 != null && (coupon2 = cLRepaymentPlanData22.getCoupon()) != null && (nominaValue = coupon2.getNominaValue()) != null) {
                        jLongValue = nominaValue.longValue();
                        jLongValue2 = jLongValue;
                    }
                } else {
                    CLBorrowAllDiscountInfo cLBorrowAllDiscountInfo = cLInstallmentBorrowFragment.f30577w1;
                    if (cLBorrowAllDiscountInfo != null) {
                        jLongValue = cLBorrowAllDiscountInfo.discountLimit;
                        jLongValue2 = jLongValue;
                    }
                }
                bundle.putString("nominaValue", String.valueOf(jLongValue2));
                F6.d.h(cLInstallmentBorrowFragment.f27317a, 3, androidx.camera.video.u.h(cLInstallmentBorrowFragment.f30506A1, "mOnlyProductType = ", cLInstallmentBorrowFragment.f30509B1, ", mSelectedMethod = "));
                int i19 = cLInstallmentBorrowFragment.f30506A1;
                if (i19 == 2 || (i7 = cLInstallmentBorrowFragment.f30509B1) == 2) {
                    bundle.remove("reductionWay");
                    bundle.remove("discountType");
                    bundle.remove("couponDiscountInfo");
                    bundle.remove("nominaValue");
                    bundle.putString("largeLoanTerm", String.valueOf(cLRepaymentPlanData13.getTerm()));
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "LargeLoanAgreement");
                } else if (i19 == 1) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "NormalLoanAgreement");
                } else if (i19 == 3) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "PalLoanAgreement");
                } else if (i7 == 1) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "NormalLoanAgreement");
                } else if (i7 == 3) {
                    com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "NormalLoanAgreement");
                }
                break;
            case 5:
                int i20 = CLBorrowBaseFragment.f30503H1;
                n0.g().l("PalmpayLoanTrialElementClick_Next");
                cLInstallmentBorrowFragment.d0(false);
                F6.d.h(cLInstallmentBorrowFragment.f27317a, 3, androidx.camera.video.u.h(cLInstallmentBorrowFragment.f30506A1, "mOnlyProductType = ", cLInstallmentBorrowFragment.f30509B1, ", mSelectedMethod = "));
                int i21 = cLInstallmentBorrowFragment.f30506A1;
                String str3 = "";
                if (i21 == 1 || i21 == 3 || i21 == 2 || (i10 = cLInstallmentBorrowFragment.f30509B1) == 2) {
                    int i22 = cLInstallmentBorrowFragment.f30559o1;
                    if (i22 < 0 || i22 >= cLInstallmentBorrowFragment.f30566r1.size()) {
                        ToastUtils.showLong("Please choose repayment plan", new Object[0]);
                    } else {
                        Long lValueOf = Long.valueOf(cLInstallmentBorrowFragment.x().getLong());
                        Long lI0 = cLInstallmentBorrowFragment.i0();
                        String string = SPUtils.get().getString("cl_borrow_last_order_id");
                        CLRepaymentPlanData cLRepaymentPlanData23 = cLInstallmentBorrowFragment.f30562p1;
                        Long couponId = (cLRepaymentPlanData23 == null || (coupon7 = cLRepaymentPlanData23.getCoupon()) == null) ? null : coupon7.getCouponId();
                        CLRepaymentPlanData cLRepaymentPlanData24 = cLInstallmentBorrowFragment.f30562p1;
                        if (cLRepaymentPlanData24 == null || (reductionWay6 = cLRepaymentPlanData24.getReductionWay()) == null || reductionWay6.intValue() != 2) {
                            CLRepaymentPlanData cLRepaymentPlanData25 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData25 == null || (coupon4 = cLRepaymentPlanData25.getCoupon()) == null) {
                                num = null;
                            } else {
                                discountType = coupon4.getDiscountType();
                                num = discountType;
                            }
                        } else {
                            CLRepaymentPlanData cLRepaymentPlanData26 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData26 != null) {
                                discountType = cLRepaymentPlanData26.getDiscountType();
                                num = discountType;
                            } else {
                                num = null;
                            }
                        }
                        CLRepaymentPlanData cLRepaymentPlanData27 = cLInstallmentBorrowFragment.f30562p1;
                        if (cLRepaymentPlanData27 == null || (reductionWay5 = cLRepaymentPlanData27.getReductionWay()) == null || reductionWay5.intValue() != 2) {
                            CLRepaymentPlanData cLRepaymentPlanData28 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData28 == null || (coupon5 = cLRepaymentPlanData28.getCoupon()) == null) {
                                num2 = null;
                            } else {
                                couponDiscountInfo2 = coupon5.getCouponDiscountInfo();
                            }
                            cLRepaymentPlanData = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData != null) {
                                repaymentPlanList = cLRepaymentPlanData.getRepaymentPlanList();
                            } else {
                                repaymentPlanList = null;
                            }
                            cLRepaymentPlanData2 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData2 != null) {
                                term = cLRepaymentPlanData2.getTerm();
                            } else {
                                term = null;
                            }
                            cLRepaymentPlanData3 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData3 != null) {
                                productSubId = cLRepaymentPlanData3.getProductSubId();
                            } else {
                                productSubId = null;
                            }
                            OrderExtendData orderExtendData = new OrderExtendData(repaymentPlanList, null, term, productSubId, null, 16, null);
                            cLRepaymentPlanData4 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData4 != null || (reductionWay4 = cLRepaymentPlanData4.getReductionWay()) == null) {
                                iIntValue = 0;
                            } else {
                                iIntValue = reductionWay4.intValue();
                            }
                            Integer numValueOf = Integer.valueOf(iIntValue);
                            cLRepaymentPlanData5 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData5 == null && (reductionWay3 = cLRepaymentPlanData5.getReductionWay()) != null && reductionWay3.intValue() == 2) {
                                CLBorrowAllDiscountInfo cLBorrowAllDiscountInfo2 = cLInstallmentBorrowFragment.f30577w1;
                                if (cLBorrowAllDiscountInfo2 != null) {
                                    nominaValue2 = Long.valueOf(cLBorrowAllDiscountInfo2.discountLimit);
                                    l5 = nominaValue2;
                                } else {
                                    l5 = null;
                                }
                            } else {
                                cLRepaymentPlanData6 = cLInstallmentBorrowFragment.f30562p1;
                                if (cLRepaymentPlanData6 != null || (coupon6 = cLRepaymentPlanData6.getCoupon()) == null) {
                                    l5 = null;
                                } else {
                                    nominaValue2 = coupon6.getNominaValue();
                                    l5 = nominaValue2;
                                }
                            }
                            if (cLInstallmentBorrowFragment.f30554k1 == 9) {
                                str = "INSTALLMENT_LOAN";
                            } else {
                                str = null;
                            }
                            cLWithdrawReq = new CLWithdrawReq(lValueOf, lI0, string, couponId, num, num2, orderExtendData, numValueOf, l5, null, str, 512, null);
                            cLWithdrawReq2 = cLWithdrawReq;
                        } else {
                            CLRepaymentPlanData cLRepaymentPlanData29 = cLInstallmentBorrowFragment.f30562p1;
                            couponDiscountInfo2 = Integer.valueOf(r0.w1(String.valueOf(cLRepaymentPlanData29 != null ? cLRepaymentPlanData29.getDiscountRatio() : null), "100").intValueExact());
                        }
                        num2 = couponDiscountInfo2;
                        cLRepaymentPlanData = cLInstallmentBorrowFragment.f30562p1;
                        if (cLRepaymentPlanData != null) {
                            repaymentPlanList = cLRepaymentPlanData.getRepaymentPlanList();
                        } else {
                            repaymentPlanList = null;
                        }
                        cLRepaymentPlanData2 = cLInstallmentBorrowFragment.f30562p1;
                        if (cLRepaymentPlanData2 != null) {
                            term = cLRepaymentPlanData2.getTerm();
                        } else {
                            term = null;
                        }
                        cLRepaymentPlanData3 = cLInstallmentBorrowFragment.f30562p1;
                        if (cLRepaymentPlanData3 != null) {
                            productSubId = cLRepaymentPlanData3.getProductSubId();
                        } else {
                            productSubId = null;
                        }
                        OrderExtendData orderExtendData2 = new OrderExtendData(repaymentPlanList, null, term, productSubId, null, 16, null);
                        cLRepaymentPlanData4 = cLInstallmentBorrowFragment.f30562p1;
                        if (cLRepaymentPlanData4 != null) {
                            iIntValue = 0;
                        } else {
                            iIntValue = 0;
                        }
                        Integer numValueOf2 = Integer.valueOf(iIntValue);
                        cLRepaymentPlanData5 = cLInstallmentBorrowFragment.f30562p1;
                        if (cLRepaymentPlanData5 == null) {
                            cLRepaymentPlanData6 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData6 != null) {
                            }
                            l5 = null;
                            if (cLInstallmentBorrowFragment.f30554k1 == 9) {
                                str = "INSTALLMENT_LOAN";
                            } else {
                                str = null;
                            }
                            cLWithdrawReq = new CLWithdrawReq(lValueOf, lI0, string, couponId, num, num2, orderExtendData2, numValueOf2, l5, null, str, 512, null);
                            cLWithdrawReq2 = cLWithdrawReq;
                        } else {
                            cLRepaymentPlanData6 = cLInstallmentBorrowFragment.f30562p1;
                            if (cLRepaymentPlanData6 != null) {
                            }
                            l5 = null;
                            if (cLInstallmentBorrowFragment.f30554k1 == 9) {
                                str = "INSTALLMENT_LOAN";
                            } else {
                                str = null;
                            }
                            cLWithdrawReq = new CLWithdrawReq(lValueOf, lI0, string, couponId, num, num2, orderExtendData2, numValueOf2, l5, null, str, 512, null);
                            cLWithdrawReq2 = cLWithdrawReq;
                        }
                    }
                } else if (i10 == 1 || i10 == 3) {
                    int i23 = cLInstallmentBorrowFragment.f30581y1;
                    if (i23 < 0 || i23 >= cLInstallmentBorrowFragment.f30583z1.size()) {
                        ToastUtils.showLong("Please choose repayment plan", new Object[0]);
                    } else {
                        Long lValueOf2 = Long.valueOf(cLInstallmentBorrowFragment.x().getLong());
                        Long lI1 = cLInstallmentBorrowFragment.i0();
                        String string2 = SPUtils.get().getString("cl_borrow_last_order_id");
                        CLRepaymentPlanData cLRepaymentPlanData30 = cLInstallmentBorrowFragment.f30564q1;
                        Long couponId2 = (cLRepaymentPlanData30 == null || (coupon11 = cLRepaymentPlanData30.getCoupon()) == null) ? null : coupon11.getCouponId();
                        CLRepaymentPlanData cLRepaymentPlanData31 = cLInstallmentBorrowFragment.f30564q1;
                        if (cLRepaymentPlanData31 == null || (reductionWay10 = cLRepaymentPlanData31.getReductionWay()) == null || reductionWay10.intValue() != 2) {
                            CLRepaymentPlanData cLRepaymentPlanData32 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData32 == null || (coupon8 = cLRepaymentPlanData32.getCoupon()) == null) {
                                num3 = null;
                            } else {
                                discountType2 = coupon8.getDiscountType();
                                num3 = discountType2;
                            }
                        } else {
                            CLRepaymentPlanData cLRepaymentPlanData33 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData33 != null) {
                                discountType2 = cLRepaymentPlanData33.getDiscountType();
                                num3 = discountType2;
                            } else {
                                num3 = null;
                            }
                        }
                        CLRepaymentPlanData cLRepaymentPlanData34 = cLInstallmentBorrowFragment.f30564q1;
                        if (cLRepaymentPlanData34 == null || (reductionWay9 = cLRepaymentPlanData34.getReductionWay()) == null || reductionWay9.intValue() != 2) {
                            CLRepaymentPlanData cLRepaymentPlanData35 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData35 == null || (coupon9 = cLRepaymentPlanData35.getCoupon()) == null) {
                                num4 = null;
                            } else {
                                couponDiscountInfo3 = coupon9.getCouponDiscountInfo();
                            }
                            cLRepaymentPlanData7 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData7 != null) {
                                repaymentPlanList2 = cLRepaymentPlanData7.getRepaymentPlanList();
                            } else {
                                repaymentPlanList2 = null;
                            }
                            cLRepaymentPlanData8 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData8 != null) {
                                term2 = cLRepaymentPlanData8.getTerm();
                            } else {
                                term2 = null;
                            }
                            cLRepaymentPlanData9 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData9 != null) {
                                productSubId2 = cLRepaymentPlanData9.getProductSubId();
                            } else {
                                productSubId2 = null;
                            }
                            OrderExtendData orderExtendData3 = new OrderExtendData(repaymentPlanList2, null, term2, productSubId2, null, 16, null);
                            cLRepaymentPlanData10 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData10 != null || (reductionWay8 = cLRepaymentPlanData10.getReductionWay()) == null) {
                                iIntValue2 = 0;
                            } else {
                                iIntValue2 = reductionWay8.intValue();
                            }
                            Integer numValueOf3 = Integer.valueOf(iIntValue2);
                            cLRepaymentPlanData11 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData11 == null && (reductionWay7 = cLRepaymentPlanData11.getReductionWay()) != null && reductionWay7.intValue() == 2) {
                                CLBorrowAllDiscountInfo cLBorrowAllDiscountInfo3 = cLInstallmentBorrowFragment.f30577w1;
                                if (cLBorrowAllDiscountInfo3 != null) {
                                    nominaValue3 = Long.valueOf(cLBorrowAllDiscountInfo3.discountLimit);
                                    l6 = nominaValue3;
                                } else {
                                    l6 = null;
                                }
                            } else {
                                cLRepaymentPlanData12 = cLInstallmentBorrowFragment.f30564q1;
                                if (cLRepaymentPlanData12 != null || (coupon10 = cLRepaymentPlanData12.getCoupon()) == null) {
                                    l6 = null;
                                } else {
                                    nominaValue3 = coupon10.getNominaValue();
                                    l6 = nominaValue3;
                                }
                            }
                            if (cLInstallmentBorrowFragment.f30554k1 == 9) {
                                str2 = "INSTALLMENT_LOAN";
                            } else {
                                str2 = null;
                            }
                            cLWithdrawReq = new CLWithdrawReq(lValueOf2, lI1, string2, couponId2, num3, num4, orderExtendData3, numValueOf3, l6, null, str2, 512, null);
                            cLWithdrawReq2 = cLWithdrawReq;
                        } else {
                            CLRepaymentPlanData cLRepaymentPlanData36 = cLInstallmentBorrowFragment.f30564q1;
                            couponDiscountInfo3 = Integer.valueOf(r0.w1(String.valueOf(cLRepaymentPlanData36 != null ? cLRepaymentPlanData36.getDiscountRatio() : null), "100").intValueExact());
                        }
                        num4 = couponDiscountInfo3;
                        cLRepaymentPlanData7 = cLInstallmentBorrowFragment.f30564q1;
                        if (cLRepaymentPlanData7 != null) {
                            repaymentPlanList2 = cLRepaymentPlanData7.getRepaymentPlanList();
                        } else {
                            repaymentPlanList2 = null;
                        }
                        cLRepaymentPlanData8 = cLInstallmentBorrowFragment.f30564q1;
                        if (cLRepaymentPlanData8 != null) {
                            term2 = cLRepaymentPlanData8.getTerm();
                        } else {
                            term2 = null;
                        }
                        cLRepaymentPlanData9 = cLInstallmentBorrowFragment.f30564q1;
                        if (cLRepaymentPlanData9 != null) {
                            productSubId2 = cLRepaymentPlanData9.getProductSubId();
                        } else {
                            productSubId2 = null;
                        }
                        OrderExtendData orderExtendData4 = new OrderExtendData(repaymentPlanList2, null, term2, productSubId2, null, 16, null);
                        cLRepaymentPlanData10 = cLInstallmentBorrowFragment.f30564q1;
                        if (cLRepaymentPlanData10 != null) {
                            iIntValue2 = 0;
                        } else {
                            iIntValue2 = 0;
                        }
                        Integer numValueOf4 = Integer.valueOf(iIntValue2);
                        cLRepaymentPlanData11 = cLInstallmentBorrowFragment.f30564q1;
                        if (cLRepaymentPlanData11 == null) {
                            cLRepaymentPlanData12 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData12 != null) {
                            }
                            l6 = null;
                            if (cLInstallmentBorrowFragment.f30554k1 == 9) {
                                str2 = "INSTALLMENT_LOAN";
                            } else {
                                str2 = null;
                            }
                            cLWithdrawReq = new CLWithdrawReq(lValueOf2, lI1, string2, couponId2, num3, num4, orderExtendData4, numValueOf4, l6, null, str2, 512, null);
                            cLWithdrawReq2 = cLWithdrawReq;
                        } else {
                            cLRepaymentPlanData12 = cLInstallmentBorrowFragment.f30564q1;
                            if (cLRepaymentPlanData12 != null) {
                            }
                            l6 = null;
                            if (cLInstallmentBorrowFragment.f30554k1 == 9) {
                                str2 = "INSTALLMENT_LOAN";
                            } else {
                                str2 = null;
                            }
                            cLWithdrawReq = new CLWithdrawReq(lValueOf2, lI1, string2, couponId2, num3, num4, orderExtendData4, numValueOf4, l6, null, str2, 512, null);
                            cLWithdrawReq2 = cLWithdrawReq;
                        }
                    }
                } else {
                    str3 = "Something is wrong";
                }
                if (cLWithdrawReq2 != null) {
                    cLInstallmentBorrowFragment.z().setEnabled(false);
                    p221ob.c.f40268a.getInstance().getClass();
                    p221ob.c.a().clCreateBorrowOrder(cLWithdrawReq2).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new n(cLInstallmentBorrowFragment, iIntValue3));
                } else if (!TextUtils.isEmpty(str3)) {
                    ToastUtils.showLong(str3, new Object[0]);
                }
                break;
            case 6:
                int i24 = CLInstallmentBorrowFragment.f30584M1;
                final ArrayList arrayListS = cLInstallmentBorrowFragment.S();
                int iV = cLInstallmentBorrowFragment.V();
                int i25 = cLInstallmentBorrowFragment.f30506A1;
                if (i25 == -1) {
                    i25 = cLInstallmentBorrowFragment.f30509B1;
                }
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragmentNewInstance = SelectKeepTimeDialogFragment.f30022X.newInstance(iV < arrayListS.size() ? iV : -1, i25, arrayListS);
                Function1 confirmClickListener = new Function1() { // from class: Ab.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int iIntValue4;
                        CLInstallmentBorrowFragment cLInstallmentBorrowFragment2 = cLInstallmentBorrowFragment;
                        ArrayList arrayList = arrayListS;
                        Integer num5 = (Integer) obj2;
                        switch (i13) {
                            case 0:
                                int i26 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList.size() - 1))) {
                                    if (cLInstallmentBorrowFragment2.f30506A1 != -1 || cLInstallmentBorrowFragment2.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30562p1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30564q1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment2.e0();
                                }
                                break;
                            case 1:
                                int i27 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList.size() - 1))) {
                                    if (cLInstallmentBorrowFragment2.f30506A1 != -1 || cLInstallmentBorrowFragment2.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30562p1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30564q1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment2.e0();
                                }
                                break;
                            case 2:
                                int i28 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList.size() - 1))) {
                                    if (cLInstallmentBorrowFragment2.f30506A1 != -1 || cLInstallmentBorrowFragment2.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30562p1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30564q1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment2.e0();
                                }
                                break;
                            default:
                                int i29 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList.size() - 1))) {
                                    if (cLInstallmentBorrowFragment2.f30506A1 != -1 || cLInstallmentBorrowFragment2.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30562p1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment2.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment2.f30564q1 = (CLRepaymentPlanData) arrayList.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment2.e0();
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                selectKeepTimeDialogFragmentNewInstance.getClass();
                Intrinsics.checkNotNullParameter(confirmClickListener, "confirmClickListener");
                selectKeepTimeDialogFragmentNewInstance.f30027Q = confirmClickListener;
                Z childFragmentManager = cLInstallmentBorrowFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                selectKeepTimeDialogFragmentNewInstance.show(childFragmentManager, "showSelectKeepTimeDialog");
                break;
            case 7:
                int i26 = CLInstallmentBorrowFragment.f30584M1;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment2 = this.f123b;
                int i27 = cLInstallmentBorrowFragment2.f30559o1;
                if (i27 >= 0) {
                    ArrayList arrayList = cLInstallmentBorrowFragment2.f30566r1;
                    if (i27 < arrayList.size()) {
                        new CLBorrowRepaymentDialog(cLInstallmentBorrowFragment2, cLInstallmentBorrowFragment2.f30506A1, (CLRepaymentPlanData) arrayList.get(cLInstallmentBorrowFragment2.f30559o1), cLInstallmentBorrowFragment2.f30557n1, null, 16, null).show();
                    }
                }
                break;
            case 8:
                int i28 = CLInstallmentBorrowFragment.f30584M1;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment3 = this.f123b;
                int i29 = cLInstallmentBorrowFragment3.f30559o1;
                if (i29 >= 0) {
                    ArrayList arrayList2 = cLInstallmentBorrowFragment3.f30566r1;
                    if (i29 < arrayList2.size()) {
                        new CLBorrowRepaymentDialog(cLInstallmentBorrowFragment3, cLInstallmentBorrowFragment3.f30509B1, (CLRepaymentPlanData) arrayList2.get(cLInstallmentBorrowFragment3.f30559o1), cLInstallmentBorrowFragment3.f30557n1, null, 16, null).show();
                    }
                }
                break;
            case 9:
                int i30 = CLInstallmentBorrowFragment.f30584M1;
                CLInstallmentBorrowFragment cLInstallmentBorrowFragment4 = this.f123b;
                int i31 = cLInstallmentBorrowFragment4.f30581y1;
                if (i31 >= 0) {
                    ArrayList arrayList3 = cLInstallmentBorrowFragment4.f30583z1;
                    if (i31 < arrayList3.size()) {
                        new CLBorrowRepaymentDialog(cLInstallmentBorrowFragment4, cLInstallmentBorrowFragment4.f30512C1, (CLRepaymentPlanData) arrayList3.get(cLInstallmentBorrowFragment4.f30581y1), cLInstallmentBorrowFragment4.f30588L1, null, 16, null).show();
                    }
                }
                break;
            case 10:
                int i32 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.l0(false);
                cLInstallmentBorrowFragment.f30519G1 = true;
                cLInstallmentBorrowFragment.f30579x1 = null;
                cLInstallmentBorrowFragment.u();
                break;
            case 11:
                int i33 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.l0(true);
                cLInstallmentBorrowFragment.f30519G1 = true;
                cLInstallmentBorrowFragment.f30579x1 = null;
                cLInstallmentBorrowFragment.u();
                break;
            case 12:
                int i34 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.j0();
                break;
            case 13:
                int i35 = CLInstallmentBorrowFragment.f30584M1;
                cLInstallmentBorrowFragment.j0();
                break;
            case 14:
                int i36 = CLInstallmentBorrowFragment.f30584M1;
                F f10 = new F();
                O6.c cVar = new O6.c(cLInstallmentBorrowFragment.getContext());
                cVar.f6615v = L6.i.ppFlexiCashDialogTheme;
                cVar.f6596b = O6.d.f(cLInstallmentBorrowFragment.getString(Ya.g.cs_cl_stamp_duty_dialog_title));
                CLRepaymentPlanData cLRepaymentPlanData37 = cLInstallmentBorrowFragment.f30562p1;
                cVar.f6598d = cLRepaymentPlanData37 != null ? cLRepaymentPlanData37.getStampDutyText() : null;
                String string3 = cLInstallmentBorrowFragment.getString(Ya.g.cs_got_it);
                l lVar = new l(f10, iIntValue3);
                cVar.f6600f = string3;
                cVar.f6602h = lVar;
                O6.d dVarA = cVar.a();
                f10.f38951a = dVarA;
                dVarA.show();
                break;
            case 15:
                int i37 = CLInstallmentBorrowFragment.f30584M1;
                final ArrayList arrayListS2 = cLInstallmentBorrowFragment.S();
                int iV2 = cLInstallmentBorrowFragment.V();
                int i38 = cLInstallmentBorrowFragment.f30506A1;
                if (i38 == -1) {
                    i38 = cLInstallmentBorrowFragment.f30509B1;
                }
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragmentNewInstance2 = SelectKeepTimeDialogFragment.f30022X.newInstance(iV2 < arrayListS2.size() ? iV2 : -1, i38, arrayListS2);
                Function1 confirmClickListener2 = new Function1() { // from class: Ab.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int iIntValue4;
                        CLInstallmentBorrowFragment cLInstallmentBorrowFragment5 = cLInstallmentBorrowFragment;
                        ArrayList arrayList4 = arrayListS2;
                        Integer num5 = (Integer) obj2;
                        switch (iIntValue3) {
                            case 0:
                                int i210 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            case 1:
                                int i211 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            case 2:
                                int i212 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            default:
                                int i213 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                selectKeepTimeDialogFragmentNewInstance2.getClass();
                Intrinsics.checkNotNullParameter(confirmClickListener2, "confirmClickListener");
                selectKeepTimeDialogFragmentNewInstance2.f30027Q = confirmClickListener2;
                Z childFragmentManager2 = cLInstallmentBorrowFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                selectKeepTimeDialogFragmentNewInstance2.show(childFragmentManager2, "showSelectKeepTimeDialog");
                break;
            case 16:
                int i39 = CLInstallmentBorrowFragment.f30584M1;
                final ArrayList arrayListS3 = cLInstallmentBorrowFragment.S();
                int iV3 = cLInstallmentBorrowFragment.V();
                int i40 = cLInstallmentBorrowFragment.f30506A1;
                if (i40 == -1) {
                    i40 = cLInstallmentBorrowFragment.f30509B1;
                }
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragmentNewInstance3 = SelectKeepTimeDialogFragment.f30022X.newInstance(cLInstallmentBorrowFragment.f30559o1 < arrayListS3.size() ? iV3 : -1, i40, arrayListS3);
                Function1 confirmClickListener3 = new Function1() { // from class: Ab.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int iIntValue4;
                        CLInstallmentBorrowFragment cLInstallmentBorrowFragment5 = cLInstallmentBorrowFragment;
                        ArrayList arrayList4 = arrayListS3;
                        Integer num5 = (Integer) obj2;
                        switch (i11) {
                            case 0:
                                int i210 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            case 1:
                                int i211 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            case 2:
                                int i212 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            default:
                                int i213 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                selectKeepTimeDialogFragmentNewInstance3.getClass();
                Intrinsics.checkNotNullParameter(confirmClickListener3, "confirmClickListener");
                selectKeepTimeDialogFragmentNewInstance3.f30027Q = confirmClickListener3;
                Z childFragmentManager3 = cLInstallmentBorrowFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                selectKeepTimeDialogFragmentNewInstance3.show(childFragmentManager3, "showSelectKeepTimeDialog");
                break;
            case 17:
                int i41 = CLInstallmentBorrowFragment.f30584M1;
                final ArrayList arrayListS4 = cLInstallmentBorrowFragment.S();
                int iV4 = cLInstallmentBorrowFragment.V();
                int i42 = cLInstallmentBorrowFragment.f30506A1;
                if (i42 == -1) {
                    i42 = cLInstallmentBorrowFragment.f30509B1;
                }
                SelectKeepTimeDialogFragment selectKeepTimeDialogFragmentNewInstance4 = SelectKeepTimeDialogFragment.f30022X.newInstance(iV4 < arrayListS4.size() ? iV4 : -1, i42, arrayListS4);
                Function1 confirmClickListener4 = new Function1() { // from class: Ab.m
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int iIntValue4;
                        CLInstallmentBorrowFragment cLInstallmentBorrowFragment5 = cLInstallmentBorrowFragment;
                        ArrayList arrayList4 = arrayListS4;
                        Integer num5 = (Integer) obj2;
                        switch (i12) {
                            case 0:
                                int i210 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            case 1:
                                int i211 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            case 2:
                                int i212 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                            default:
                                int i213 = CLInstallmentBorrowFragment.f30584M1;
                                if (!r0.S0(String.valueOf(num5), String.valueOf(arrayList4.size() - 1))) {
                                    if (cLInstallmentBorrowFragment5.f30506A1 != -1 || cLInstallmentBorrowFragment5.f30509B1 == 2) {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30559o1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30562p1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    } else {
                                        iIntValue4 = num5 != null ? num5.intValue() : -1;
                                        cLInstallmentBorrowFragment5.f30581y1 = iIntValue4;
                                        cLInstallmentBorrowFragment5.f30564q1 = (CLRepaymentPlanData) arrayList4.get(iIntValue4);
                                    }
                                    cLInstallmentBorrowFragment5.e0();
                                }
                                break;
                        }
                        return Unit.f38893a;
                    }
                };
                selectKeepTimeDialogFragmentNewInstance4.getClass();
                Intrinsics.checkNotNullParameter(confirmClickListener4, "confirmClickListener");
                selectKeepTimeDialogFragmentNewInstance4.f30027Q = confirmClickListener4;
                Z childFragmentManager4 = cLInstallmentBorrowFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
                selectKeepTimeDialogFragmentNewInstance4.show(childFragmentManager4, "showSelectKeepTimeDialog");
                break;
            case 18:
                int i43 = CLInstallmentBorrowFragment.f30584M1;
                new CLBorrowDateDisableDialog(cLInstallmentBorrowFragment.getContext()).show();
                break;
            case 19:
                int i44 = CLInstallmentBorrowFragment.f30584M1;
                new CLBorrowDateDisableDialog(cLInstallmentBorrowFragment.getContext()).show();
                break;
            default:
                ARouter.getInstance().build("/credit_score/oc_total_bill_activity").navigation(cLInstallmentBorrowFragment.getContext());
                break;
        }
    }
}
