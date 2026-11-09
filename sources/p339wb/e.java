package p339wb;

import Bc.C0105b;
import Bc.s;
import Ce.ViewOnClickListenerC0159a;
import Fb.j;
import Gb.M;
import Gb.v;
import M1.b;
import Pa.r0;
import Ya.d;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import com.transsnet.palmpay.credit.bean.RepaymentPlan;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.DefaultInfoData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentCardData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentFirstPayCardData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.ProductInfoChangeData;
import com.transsnet.palmpay.credit.bean.style.MobileInstallmentFirstPayStyleConfig;
import com.transsnet.palmpay.credit.bean.style.MobileInstallmentStyleConfig;
import com.transsnet.palmpay.credit.bean.style.ProductInfoChangeStyleConfig;
import com.transsnet.palmpay.credit.view.AboutRepaymentInfoView;
import com.transsnet.palmpay.credit.view.AgentInformationView;
import com.transsnet.palmpay.credit.view.DefaultInfoView;
import com.transsnet.palmpay.credit.view.InnerRecyclerView;
import com.transsnet.palmpay.credit.view.PhoneInstallmentDailyLoanView;
import com.transsnet.palmpay.credit.view.PhoneInstallmentLoanView;
import com.transsnet.palmpay.credit.view.PhoneInstallmentLoanWaitPayView;
import com.transsnet.palmpay.credit.view.ProductInfoChangeView;
import com.transsnet.palmpay.credit.view.VaTransferRepaymentInfoView;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p220oa.h;
import p377z5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f43367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f43368c;

    /* JADX WARN: Code duplicated, block: B:229:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x0379  */
    @Override // M1.j
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void convert(BaseViewHolder holder, CLPhoneInstallmentMainData item) {
        boolean z3;
        Integer repaymentStatus;
        MobileInstallmentStyleConfig mobileInstallmentStyleConfig;
        Integer repaymentStatus2;
        TextStyleConfig textStyleConfig;
        String bgColor;
        String bgColor2;
        String bgColor3;
        MobileInstallmentFirstPayCardData hirePurchaseDownPayCardData;
        MobileInstallmentFirstPayStyleConfig mobileInstallmentFirstPayStyleConfig;
        ProductInfoChangeStyleConfig productInfoChangeStyleConfig;
        VaTransferRepaymentInfoView vaTransferRepaymentInfoView;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int itemViewType = holder.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                AgentInformationView agentInformationView = (AgentInformationView) holder.getView(Ya.e.agentInfoView);
                if (agentInformationView != null) {
                    agentInformationView.c(item.getAgentInfoData());
                    return;
                }
                return;
            }
            if (itemViewType != 3) {
                if (itemViewType != 5) {
                    if (itemViewType == 6) {
                        AboutRepaymentInfoView aboutRepaymentInfoView = (AboutRepaymentInfoView) holder.getView(Ya.e.aboutRepaymentView);
                        if (aboutRepaymentInfoView != null) {
                            aboutRepaymentInfoView.a(item.getAboutRepaymentData());
                            return;
                        }
                        return;
                    }
                    if (itemViewType != 7) {
                        if (itemViewType == 8 && (vaTransferRepaymentInfoView = (VaTransferRepaymentInfoView) holder.getView(Ya.e.vaTransferRepaymentView)) != null) {
                            vaTransferRepaymentInfoView.a(item);
                            return;
                        }
                        return;
                    }
                    DefaultInfoView defaultInfoView = (DefaultInfoView) holder.getView(Ya.e.defaultView);
                    if (defaultInfoView != null) {
                        defaultInfoView.setAccountNo(this.f43367b);
                        DefaultInfoData defaultInfoData = item.getDefaultInfoData();
                        if (defaultInfoData == null) {
                            return;
                        }
                        String str = defaultInfoData.itemStyle;
                        if (str != null && str.length() != 0) {
                        }
                        C0105b c0105b = defaultInfoView.f30737a;
                        r0.q1(c0105b != null ? (ImageView) c0105b.f666f : null, defaultInfoData.phoneImage, defaultInfoData.phoneImageDark);
                        r0.q1(c0105b != null ? (ImageView) c0105b.f667g : null, defaultInfoData.descriptionImage, defaultInfoData.descriptionImageDark);
                        r0.q1(c0105b != null ? (ImageView) c0105b.f665e : null, defaultInfoData.customerServiceImage, defaultInfoData.customerServiceImageDark);
                        if (c0105b != null) {
                            ((TextView) c0105b.f663c).setText(defaultInfoData.customerServicePhone);
                        }
                        if (c0105b != null) {
                            ((LinearLayout) c0105b.f662b).setOnClickListener(new ViewOnClickListenerC0159a(defaultInfoData, 18));
                            return;
                        }
                        return;
                    }
                    return;
                }
                ProductInfoChangeView productInfoChangeView = (ProductInfoChangeView) holder.getView(Ya.e.productInfoChangeView);
                if (productInfoChangeView != null) {
                    ProductInfoChangeData productInfoChangeData = item.getProductInfoChangeData();
                    h.s(productInfoChangeView, productInfoChangeData != null);
                    if (productInfoChangeData != null) {
                        String itemStyle = productInfoChangeData.getItemStyle();
                        C0105b c0105b2 = productInfoChangeView.f30878a;
                        if (itemStyle != null && itemStyle.length() != 0 && (productInfoChangeStyleConfig = (ProductInfoChangeStyleConfig) l.l(itemStyle, "getMobileInstallmentProductInfoStyleConfig", ProductInfoChangeStyleConfig.class)) != null) {
                            j.a(c0105b2 != null ? (ConstraintLayout) c0105b2.f662b : null, productInfoChangeStyleConfig.productInfoChangeBg);
                            j.c(c0105b2 != null ? (TextView) c0105b2.f665e : null, productInfoChangeStyleConfig.productInfoTitle);
                            j.c(c0105b2 != null ? (TextView) c0105b2.f664d : null, productInfoChangeStyleConfig.productInfoSubTitle);
                            j.a(c0105b2 != null ? (ImageView) c0105b2.f666f : null, productInfoChangeStyleConfig.productInfoTitleImageIcon);
                            j.a(c0105b2 != null ? (ImageView) c0105b2.f667g : null, productInfoChangeStyleConfig.productInfoActiveImageIcon);
                            j.a(c0105b2 != null ? (TextView) c0105b2.f663c : null, productInfoChangeStyleConfig.getProductInfoLocateBg());
                            j.c(c0105b2 != null ? (TextView) c0105b2.f663c : null, productInfoChangeStyleConfig.productInfoLocateText);
                        }
                        ImageView imageView = c0105b2 != null ? (ImageView) c0105b2.f666f : null;
                        Context context = productInfoChangeView.getContext();
                        Intrinsics.f(context, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                        r0.l1(((BaseActivity) context).isDarkMode() ? productInfoChangeData.getTitleImageDark() : productInfoChangeData.getTitleImage(), imageView);
                        ImageView imageView2 = c0105b2 != null ? (ImageView) c0105b2.f667g : null;
                        Context context2 = productInfoChangeView.getContext();
                        Intrinsics.f(context2, "null cannot be cast to non-null type com.transsnet.palmpay.core.base.BaseActivity");
                        r0.l1(((BaseActivity) context2).isDarkMode() ? productInfoChangeData.getActiveImageDark() : productInfoChangeData.getActiveImage(), imageView2);
                        if (c0105b2 != null) {
                            ((TextView) c0105b2.f665e).setText(productInfoChangeData.getTitle());
                        }
                        if (c0105b2 != null) {
                            ((TextView) c0105b2.f664d).setText(productInfoChangeData.getDescription());
                        }
                        if (c0105b2 != null) {
                            ((TextView) c0105b2.f663c).setText(productInfoChangeData.getButton());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            PhoneInstallmentLoanWaitPayView phoneInstallmentLoanWaitPayView = (PhoneInstallmentLoanWaitPayView) holder.getView(Ya.e.phoneInstallmentLoanWaitPayView);
            if (phoneInstallmentLoanWaitPayView == null || (hirePurchaseDownPayCardData = item.getHirePurchaseDownPayCardData()) == null) {
                return;
            }
            String itemStyle2 = hirePurchaseDownPayCardData.getItemStyle();
            s sVar = phoneInstallmentLoanWaitPayView.f30874a;
            if (itemStyle2 == null || itemStyle2.length() == 0) {
                mobileInstallmentFirstPayStyleConfig = null;
            } else {
                mobileInstallmentFirstPayStyleConfig = (MobileInstallmentFirstPayStyleConfig) l.l(itemStyle2, "getMobileInstallmentFirstPayStyleConfig", MobileInstallmentFirstPayStyleConfig.class);
                if (mobileInstallmentFirstPayStyleConfig != null) {
                    j.a(sVar != null ? sVar.f831H : null, mobileInstallmentFirstPayStyleConfig.topDividerBg);
                    j.a(sVar != null ? (ConstraintLayout) sVar.f844v : null, mobileInstallmentFirstPayStyleConfig.cardBg);
                    j.c(sVar != null ? sVar.f835c : null, mobileInstallmentFirstPayStyleConfig.brand);
                    j.c(sVar != null ? sVar.f839g : null, mobileInstallmentFirstPayStyleConfig.mobilePriceLabel);
                    j.c(sVar != null ? sVar.f840i : null, mobileInstallmentFirstPayStyleConfig.productAmount);
                    j.c(sVar != null ? sVar.f838f : null, mobileInstallmentFirstPayStyleConfig.downPaymentTitle);
                    j.c(sVar != null ? sVar.f837e : null, mobileInstallmentFirstPayStyleConfig.downPaymentAmount);
                    TextView textView = sVar != null ? sVar.f834b : null;
                    Integer repaymentStatus3 = hirePurchaseDownPayCardData.getRepaymentStatus();
                    j.a(textView, (repaymentStatus3 != null && repaymentStatus3.intValue() == 6) ? mobileInstallmentFirstPayStyleConfig.btnConfirmPay : mobileInstallmentFirstPayStyleConfig.btnConfirmPayUnable);
                    j.a(sVar != null ? (ConstraintLayout) sVar.f845w : null, mobileInstallmentFirstPayStyleConfig.totalOutstandingBg);
                    j.c(sVar != null ? sVar.f843p : null, mobileInstallmentFirstPayStyleConfig.totalOutstandingTitle);
                    j.c(sVar != null ? sVar.f842o : null, mobileInstallmentFirstPayStyleConfig.totalOutstandingAmount);
                    j.c(sVar != null ? sVar.f841j : null, mobileInstallmentFirstPayStyleConfig.repaymentTotalTerms);
                }
            }
            r0.k1(sVar != null ? (ImageView) sVar.f828A : null, hirePurchaseDownPayCardData.getTitleBrandIocUrl(), hirePurchaseDownPayCardData.getTitleBrandIocUrlDark());
            r0.k1(sVar != null ? (ImageView) sVar.f829B : null, hirePurchaseDownPayCardData.getPhoneBrandIocUrl(), hirePurchaseDownPayCardData.getPhoneBrandIocUrlDark());
            if (sVar != null) {
                sVar.f835c.setText(hirePurchaseDownPayCardData.getBrand() + " " + hirePurchaseDownPayCardData.getType() + "," + hirePurchaseDownPayCardData.getStorage() + "+" + hirePurchaseDownPayCardData.getMemory());
            }
            if (sVar != null) {
                TextView textView2 = sVar.f840i;
                Long productAmount = hirePurchaseDownPayCardData.getProductAmount();
                textView2.setText(String.valueOf(r0.B(productAmount != null ? productAmount.longValue() : 0L, true)));
            }
            if (sVar != null) {
                sVar.f838f.setText(hirePurchaseDownPayCardData.getDownPaymentTitle());
            }
            if (sVar != null) {
                TextView textView3 = sVar.f837e;
                Long downPaymentAmount = hirePurchaseDownPayCardData.getDownPaymentAmount();
                textView3.setText(r0.B(downPaymentAmount != null ? downPaymentAmount.longValue() : 0L, true));
            }
            if (sVar != null) {
                sVar.f843p.setText(hirePurchaseDownPayCardData.getUnpaidAmountTitle());
            }
            if (sVar != null) {
                TextView textView4 = sVar.f842o;
                Long unpaidAmount = hirePurchaseDownPayCardData.getUnpaidAmount();
                textView4.setText(r0.B(unpaidAmount != null ? unpaidAmount.longValue() : 0L, true));
            }
            if (sVar != null) {
                sVar.f834b.setText(hirePurchaseDownPayCardData.getBtnConfirmPay());
            }
            String btnMsg = hirePurchaseDownPayCardData.getBtnMsg();
            if (btnMsg != null) {
                if (TextUtils.isEmpty(btnMsg)) {
                    btnMsg = null;
                }
                if (btnMsg != null) {
                    if (sVar != null) {
                        h.C(sVar.f836d);
                    }
                    if (sVar != null) {
                        sVar.f836d.setText(btnMsg);
                    }
                } else if (sVar != null) {
                    h.c(sVar.f836d);
                }
            } else if (sVar != null) {
                h.c(sVar.f836d);
            }
            if (sVar != null) {
                sVar.f841j.setText(hirePurchaseDownPayCardData.getLoanTermTitle());
            }
            if (sVar != null) {
                ((InnerRecyclerView) sVar.f830C).setHasFixedSize(true);
            }
            if (sVar != null) {
                ((InnerRecyclerView) sVar.f830C).setLayoutManager(new LinearLayoutManager(phoneInstallmentLoanWaitPayView.getContext(), 1, false));
            }
            if (sVar != null) {
                InnerRecyclerView innerRecyclerView = (InnerRecyclerView) sVar.f830C;
                int i7 = f.cs_cl_phone_installment_loan_repayment_plan_item;
                List<RepaymentPlan> repaymentPlanList = hirePurchaseDownPayCardData.getRepaymentPlanList();
                innerRecyclerView.setAdapter(new M(mobileInstallmentFirstPayStyleConfig, i7, repaymentPlanList != null ? CollectionsKt.Z(repaymentPlanList) : null));
                return;
            }
            return;
        }
        MobileInstallmentCardData mobileInstallmentCardData = item.getMobileInstallmentCardData();
        PhoneInstallmentDailyLoanView phoneInstallmentDailyLoanView = (PhoneInstallmentDailyLoanView) holder.getView(Ya.e.phoneInstallmentDailyLoanView);
        PhoneInstallmentLoanView phoneInstallmentLoanView = (PhoneInstallmentLoanView) holder.getView(Ya.e.phoneInstallmentLoanView);
        String loanTermSpanUnit = mobileInstallmentCardData != null ? mobileInstallmentCardData.getLoanTermSpanUnit() : null;
        if ("D".equalsIgnoreCase(loanTermSpanUnit != null ? StringsKt.V(loanTermSpanUnit).toString() : null)) {
            if (phoneInstallmentLoanView != null) {
                h.c(phoneInstallmentLoanView);
            }
            if (phoneInstallmentDailyLoanView != null) {
                h.C(phoneInstallmentDailyLoanView);
            }
            if (phoneInstallmentDailyLoanView != null) {
                phoneInstallmentDailyLoanView.setOnUnlockCountDownFinished(this.f43368c);
                phoneInstallmentDailyLoanView.j(mobileInstallmentCardData);
                return;
            }
            return;
        }
        if (phoneInstallmentDailyLoanView != null) {
            h.c(phoneInstallmentDailyLoanView);
        }
        if (phoneInstallmentLoanView != null) {
            h.C(phoneInstallmentLoanView);
        }
        if (phoneInstallmentLoanView != null) {
            phoneInstallmentLoanView.setOnUnlockCountDownFinished(this.f43368c);
            if (mobileInstallmentCardData == null) {
                phoneInstallmentLoanView.b();
                return;
            }
            String itemStyle3 = mobileInstallmentCardData.getItemStyle();
            p099gb.e eVar = phoneInstallmentLoanView.f30869a;
            if (itemStyle3 != null && itemStyle3.length() != 0 && (mobileInstallmentStyleConfig = (MobileInstallmentStyleConfig) l.l(itemStyle3, "getMobileInstallmentStyleConfig", MobileInstallmentStyleConfig.class)) != null) {
                j.a(eVar != null ? eVar.f37123e : null, mobileInstallmentStyleConfig.cardBg);
                j.c(eVar != null ? eVar.f37117Y : null, mobileInstallmentStyleConfig.brand);
                TextView textView5 = eVar != null ? eVar.f37134s0 : null;
                TextStyleConfig textStyleConfig2 = mobileInstallmentStyleConfig.mobilePriceLabel;
                if (textStyleConfig2 == null) {
                    textStyleConfig2 = mobileInstallmentStyleConfig.deviceActiveTitle;
                }
                j.c(textView5, textStyleConfig2);
                j.a(eVar != null ? eVar.f37130p : null, mobileInstallmentStyleConfig.deviceActiveIcon);
                j.a(eVar != null ? eVar.f37137v : null, mobileInstallmentStyleConfig.deviceActiveRefreshIcon);
                j.c(eVar != null ? eVar.f37128k0 : null, mobileInstallmentStyleConfig.currentOutstandingTitle);
                j.c(eVar != null ? eVar.f37118Z : null, mobileInstallmentStyleConfig.currentOutstandingAmount);
                Integer overDueStatus = mobileInstallmentCardData.getOverDueStatus();
                if (((overDueStatus == null || overDueStatus.intValue() != 1) && ((repaymentStatus2 = mobileInstallmentCardData.getRepaymentStatus()) == null || repaymentStatus2.intValue() != 2)) || (textStyleConfig = mobileInstallmentStyleConfig.phoneInstallmentTipsOverdue) == null) {
                    textStyleConfig = mobileInstallmentStyleConfig.phoneInstallmentTips;
                }
                j.c(eVar != null ? eVar.f37100D0 : null, textStyleConfig);
                j.a(eVar != null ? eVar.f37109L : null, mobileInstallmentStyleConfig.phoneInstallmentExemptionBg);
                j.c(eVar != null ? eVar.f37101E0 : null, mobileInstallmentStyleConfig.phoneInstallmentExemptionTips);
                j.c(eVar != null ? eVar.f37121c : null, mobileInstallmentStyleConfig.btnRepayPrimary);
                j.c(eVar != null ? eVar.f37122d : null, mobileInstallmentStyleConfig.btnTemporaryUnlock);
                j.a(eVar != null ? eVar.f37120b : null, mobileInstallmentStyleConfig.expireTimeBg);
                j.c(eVar != null ? eVar.f37141x0 : null, mobileInstallmentStyleConfig.expireTimeTitle);
                j.c(eVar != null ? eVar.f37142y0 : null, mobileInstallmentStyleConfig.expireTimeMinute);
                j.c(eVar != null ? eVar.f37143z0 : null, mobileInstallmentStyleConfig.expireTimeSecond);
                j.c(eVar != null ? eVar.f37140w0 : null, mobileInstallmentStyleConfig.expireTimeColon);
                j.c(eVar != null ? eVar.f37105H0 : null, mobileInstallmentStyleConfig.totalOutstandingTitle);
                j.a(eVar != null ? eVar.f37096B : null, mobileInstallmentStyleConfig.dailyPaymentBg);
                j.c(eVar != null ? eVar.f37132q0 : null, mobileInstallmentStyleConfig.dailyPaymentTitle);
                j.c(eVar != null ? eVar.f37131p0 : null, mobileInstallmentStyleConfig.dailyPaymentAmount);
                j.a(eVar != null ? eVar.f37115Q : null, mobileInstallmentStyleConfig.weeklyPaymentBg);
                j.c(eVar != null ? eVar.f37113N0 : null, mobileInstallmentStyleConfig.weeklyPaymentTitle);
                j.c(eVar != null ? eVar.f37112M0 : null, mobileInstallmentStyleConfig.weeklyPaymentAmount);
                j.a(eVar != null ? eVar.f37104H : null, mobileInstallmentStyleConfig.monthlyPaymentBg);
                j.c(eVar != null ? eVar.f37099C0 : null, mobileInstallmentStyleConfig.monthlyPaymentTitle);
                j.c(eVar != null ? eVar.f37097B0 : null, mobileInstallmentStyleConfig.monthlyPaymentAmount);
                ImageView imageView3 = eVar != null ? eVar.f37124f : null;
                BaseStyleConfig baseStyleConfig = mobileInstallmentStyleConfig.cardBg;
                if (baseStyleConfig != null) {
                    try {
                        bgColor = baseStyleConfig.getBgColor();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } else {
                    bgColor = null;
                }
                if (!TextUtils.isEmpty(bgColor)) {
                    if (baseStyleConfig == null || (bgColor2 = baseStyleConfig.getBgColor()) == null) {
                        bgColor2 = "";
                    }
                    if (new Regex("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$").b(bgColor2)) {
                        if (baseStyleConfig == null || (bgColor3 = baseStyleConfig.getBgColor()) == null) {
                            bgColor3 = "";
                        }
                        int color = Color.parseColor(bgColor3);
                        if (imageView3 != null) {
                            imageView3.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                        }
                    }
                }
                if (Intrinsics.c(mobileInstallmentCardData.getLocked(), Boolean.TRUE)) {
                    j.a(eVar != null ? eVar.f37139w : null, mobileInstallmentStyleConfig.deviceInfoBgLock);
                    j.c(eVar != null ? eVar.f37133r0 : null, mobileInstallmentStyleConfig.deviceActiveTimeLock);
                } else {
                    j.a(eVar != null ? eVar.f37139w : null, mobileInstallmentStyleConfig.deviceInfoBg);
                    j.c(eVar != null ? eVar.f37133r0 : null, mobileInstallmentStyleConfig.deviceActiveTime);
                }
            }
            r0.k1(eVar != null ? eVar.f37125g : null, mobileInstallmentCardData.getTitleBrandIocUrl(), mobileInstallmentCardData.getTitleBrandIocUrlDark());
            r0.k1(eVar != null ? eVar.f37126i : null, mobileInstallmentCardData.getImageLockNew(), mobileInstallmentCardData.getImageLockDarkNew());
            r0.k1(eVar != null ? eVar.f37127j : null, mobileInstallmentCardData.getImageLockNew(), mobileInstallmentCardData.getImageLockDarkNew());
            r0.k1(eVar != null ? eVar.f37130p : null, mobileInstallmentCardData.getImageLock(), mobileInstallmentCardData.getImageLockDark());
            r0.k1(eVar != null ? eVar.f37137v : null, mobileInstallmentCardData.getImageRefresh(), mobileInstallmentCardData.getImageRefreshDark());
            if (eVar != null) {
                eVar.f37117Y.setText(mobileInstallmentCardData.getBrand() + " " + mobileInstallmentCardData.getType() + "," + mobileInstallmentCardData.getStorage() + "+" + mobileInstallmentCardData.getMemory());
            }
            if (eVar != null) {
                eVar.f37134s0.setText(mobileInstallmentCardData.getDeviceActiveTitle());
            }
            if (eVar != null) {
                eVar.f37133r0.setText(TimeUtils.millis2String(PhoneInstallmentLoanView.f30868f.resolveDeviceActiveTimeMs(mobileInstallmentCardData.getDeviceActiveTime()), new SimpleDateFormat("MMM/dd/yyyy HH:mm", Locale.ENGLISH)));
            }
            if (eVar != null) {
                ConstraintLayout constraintLayout = eVar.f37094A;
                Integer overDueStatus2 = mobileInstallmentCardData.getOverDueStatus();
                h.s(constraintLayout, (overDueStatus2 == null || overDueStatus2.intValue() != 1) && ((repaymentStatus = mobileInstallmentCardData.getRepaymentStatus()) == null || repaymentStatus.intValue() != 2) && ((repaymentStatus == null || repaymentStatus.intValue() != 3) && (repaymentStatus == null || repaymentStatus.intValue() != 4)));
            }
            if (eVar != null) {
                eVar.f37128k0.setText(mobileInstallmentCardData.getUnpaidAmountTitle());
            }
            if (eVar != null) {
                TextView textView6 = eVar.f37118Z;
                Long unpaidAmount2 = mobileInstallmentCardData.getUnpaidAmount();
                textView6.setText(r0.B(unpaidAmount2 != null ? unpaidAmount2.longValue() : 0L, false));
            }
            Boolean exemptionBadgeVisible = mobileInstallmentCardData.getExemptionBadgeVisible();
            Boolean bool = Boolean.TRUE;
            boolean zC = Intrinsics.c(exemptionBadgeVisible, bool);
            if (eVar != null) {
                h.s(eVar.f37129o, zC);
            }
            if (eVar != null) {
                h.s(eVar.f37109L, zC);
            }
            if (eVar != null) {
                z3 = false;
                h.s(eVar.f37100D0, false);
            } else {
                z3 = false;
            }
            if (eVar != null) {
                h.s(eVar.f37116X, z3);
            }
            if (zC) {
                if (eVar != null) {
                    AppCompatTextView appCompatTextView = eVar.f37101E0;
                    String repaymentReminderContent = mobileInstallmentCardData.getRepaymentReminderContent();
                    appCompatTextView.setText(repaymentReminderContent != null ? repaymentReminderContent : "");
                }
                String exemptionBadgeAssetUrl = mobileInstallmentCardData.getExemptionBadgeAssetUrl();
                if (exemptionBadgeAssetUrl != null && exemptionBadgeAssetUrl.length() != 0) {
                    r0.l1(exemptionBadgeAssetUrl, eVar != null ? eVar.f37129o : null);
                } else if (eVar != null) {
                    eVar.f37129o.setImageResource(d.icon_phone_exemption_badge);
                }
                phoneInstallmentLoanView.d(mobileInstallmentCardData.getExemptionExpireTime());
            } else {
                Integer overDueStatus3 = mobileInstallmentCardData.getOverDueStatus();
                if (overDueStatus3 == null || overDueStatus3.intValue() != 1) {
                    if (eVar != null) {
                        h.s(eVar.f37100D0, !TextUtils.isEmpty(mobileInstallmentCardData.getRepaymentReminderContent()));
                    }
                    if (eVar != null) {
                        eVar.f37100D0.setText(mobileInstallmentCardData.getRepaymentReminderContent());
                    }
                } else if (!TextUtils.isEmpty(mobileInstallmentCardData.getRepaymentReminderContent())) {
                    if (eVar != null) {
                        h.C(eVar.f37116X);
                    }
                    if (eVar != null) {
                        eVar.f37102F0.setText(mobileInstallmentCardData.getRepaymentReminderContent());
                    }
                    if (Intrinsics.c(mobileInstallmentCardData.getLocked(), bool)) {
                        if (eVar != null) {
                            h.C(eVar.t);
                        }
                        r0.k1(eVar != null ? eVar.t : null, mobileInstallmentCardData.getRepaymentReminderBackground(), mobileInstallmentCardData.getRepaymentReminderBackground());
                    } else if (eVar != null) {
                        h.d(eVar.t);
                    }
                } else if (eVar != null) {
                    h.c(eVar.f37116X);
                }
            }
            if (eVar != null) {
                eVar.f37121c.setText(mobileInstallmentCardData.getBtnRepayContent());
            }
            if (eVar != null) {
                TextView textView7 = eVar.f37122d;
                textView7.setText(mobileInstallmentCardData.getBtnTemporaryUnlockContent());
                h.s(textView7, !TextUtils.isEmpty(mobileInstallmentCardData.getBtnTemporaryUnlockContent()));
            }
            if (eVar != null) {
                eVar.f37141x0.setText(mobileInstallmentCardData.getBtnExpireIn());
            }
            if (eVar != null) {
                h.s(eVar.f37120b, !TextUtils.isEmpty(mobileInstallmentCardData.getBtnExpireIn()));
            }
            if (eVar != null) {
                eVar.f37105H0.setText(mobileInstallmentCardData.getTotalOutstandingAmountTitle());
            }
            if (eVar != null) {
                IconicsTextView iconicsTextView = eVar.f37103G0;
                Long totalOutstandingAmount = mobileInstallmentCardData.getTotalOutstandingAmount();
                iconicsTextView.setText(r0.B(totalOutstandingAmount != null ? totalOutstandingAmount.longValue() : 0L, false));
            }
            if (eVar != null) {
                eVar.f37132q0.setText(phoneInstallmentLoanView.a(g.cs_mi_repayment_cycle_daily_label, mobileInstallmentCardData.getDailyPaymentAmountTitle()));
            }
            if (eVar != null) {
                TextView textView8 = eVar.f37131p0;
                Long dailyPaymentAmount = mobileInstallmentCardData.getDailyPaymentAmount();
                textView8.setText(r0.B(dailyPaymentAmount != null ? dailyPaymentAmount.longValue() : 0L, false));
            }
            if (eVar != null) {
                eVar.f37113N0.setText(phoneInstallmentLoanView.a(g.cs_mi_repayment_cycle_weekly_label, mobileInstallmentCardData.getWeeklyPaymentAmountTitle()));
            }
            if (eVar != null) {
                TextView textView9 = eVar.f37112M0;
                Long weeklyPaymentAmount = mobileInstallmentCardData.getWeeklyPaymentAmount();
                textView9.setText(r0.B(weeklyPaymentAmount != null ? weeklyPaymentAmount.longValue() : 0L, false));
            }
            if (eVar != null) {
                eVar.f37099C0.setText(phoneInstallmentLoanView.a(g.cs_mi_repayment_cycle_monthly_label, mobileInstallmentCardData.getMonthlyPaymentAmountTitle()));
            }
            if (eVar != null) {
                TextView textView10 = eVar.f37097B0;
                Long monthlyPaymentAmount = mobileInstallmentCardData.getMonthlyPaymentAmount();
                textView10.setText(r0.B(monthlyPaymentAmount != null ? monthlyPaymentAmount.longValue() : 0L, false));
            }
            phoneInstallmentLoanView.c(mobileInstallmentCardData);
        }
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj, List payloads) {
        PhoneInstallmentLoanView phoneInstallmentLoanView;
        PhoneInstallmentLoanView phoneInstallmentLoanView2;
        CLPhoneInstallmentMainData item = (CLPhoneInstallmentMainData) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        List list = payloads;
        if (!list.isEmpty() && Intrinsics.c(payloads.get(0), "EXEMPTION_COUNTDOWN_UPDATE")) {
            if (holder.getItemViewType() == 0) {
                MobileInstallmentCardData mobileInstallmentCardData = item.getMobileInstallmentCardData();
                String loanTermSpanUnit = mobileInstallmentCardData != null ? mobileInstallmentCardData.getLoanTermSpanUnit() : null;
                if ("D".equalsIgnoreCase(loanTermSpanUnit != null ? StringsKt.V(loanTermSpanUnit).toString() : null) || (phoneInstallmentLoanView2 = (PhoneInstallmentLoanView) holder.getView(Ya.e.phoneInstallmentLoanView)) == null) {
                    return;
                }
                MobileInstallmentCardData mobileInstallmentCardData2 = item.getMobileInstallmentCardData();
                phoneInstallmentLoanView2.d(mobileInstallmentCardData2 != null ? mobileInstallmentCardData2.getExemptionExpireTime() : null);
                return;
            }
            return;
        }
        if (list.isEmpty() || !Intrinsics.c(payloads.get(0), "COUNTDOWN_UPDATE")) {
            convert(holder, item);
            return;
        }
        if (holder.getItemViewType() == 0) {
            MobileInstallmentCardData mobileInstallmentCardData3 = item.getMobileInstallmentCardData();
            String loanTermSpanUnit2 = mobileInstallmentCardData3 != null ? mobileInstallmentCardData3.getLoanTermSpanUnit() : null;
            if ("D".equalsIgnoreCase(loanTermSpanUnit2 != null ? StringsKt.V(loanTermSpanUnit2).toString() : null) || (phoneInstallmentLoanView = (PhoneInstallmentLoanView) holder.getView(Ya.e.phoneInstallmentLoanView)) == null) {
                return;
            }
            phoneInstallmentLoanView.c(item.getMobileInstallmentCardData());
        }
    }
}
