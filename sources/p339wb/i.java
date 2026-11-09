package p339wb;

import Ce.O;
import Eb.a;
import Eb.n;
import Hb.A;
import L6.b;
import M1.j;
import Pa.r0;
import Ya.d;
import Ya.e;
import Ya.f;
import Ya.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentAccount;
import com.transsnet.palmpay.credit.bean.rsp.LoanHomeRepaymentDetail;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import p141j9.C1807o;
import p327vd.c;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1807o f43379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SimpleDateFormat f43380b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C1807o onOpenRepaymentSamePage) {
        super(f.cs_item_loan_repayment_card, null);
        Intrinsics.checkNotNullParameter(onOpenRepaymentSamePage, "onOpenRepaymentSamePage");
        this.f43379a = onOpenRepaymentSamePage;
        this.f43380b = new SimpleDateFormat("MMM dd", Locale.ENGLISH);
    }

    public static void b(BaseViewHolder baseViewHolder) {
        Object tag = baseViewHolder.itemView.getTag(e.rootLoanRepaymentCard);
        n nVar = tag instanceof n ? (n) tag : null;
        if (nVar != null) {
            nVar.b();
        }
        baseViewHolder.itemView.setTag(e.rootLoanRepaymentCard, null);
    }

    public final void a(BaseViewHolder baseViewHolder, long j6) {
        a.e(getContext(), (TextView) baseViewHolder.getView(e.tvLimitedOfferDays), (TextView) baseViewHolder.getView(e.tvLimitedOfferHour), (TextView) baseViewHolder.getView(e.tvLimitedOfferMinute), (TextView) baseViewHolder.getView(e.tvLimitedOfferSecond), j6);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0226  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x034b  */
    /* JADX WARN: Code duplicated, block: B:241:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:303:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:333:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0123  */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        LoanHomeRepaymentDetail detail;
        boolean z3;
        Bb.a aVar;
        String string;
        int i7;
        Long currentOutstandingAmount;
        int i10;
        int i11;
        String str;
        String strB;
        String string2;
        boolean z8;
        String string3;
        int i12;
        boolean z10;
        Integer accountType;
        Integer accountType2;
        String string4;
        String str2;
        long j6;
        Iterator<T> it;
        Object next;
        Object next2;
        LoanHomeRepaymentAccount account = (LoanHomeRepaymentAccount) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(account, "item");
        Intrinsics.checkNotNullParameter(account, "account");
        List<LoanHomeRepaymentDetail> detailList = account.getDetailList();
        if (detailList == null) {
            detail = null;
        } else {
            if (detailList.isEmpty()) {
                detailList = null;
            }
            if (detailList == null) {
                detail = null;
            } else {
                Long outstandingBillId = account.getOutstandingBillId();
                if (outstandingBillId != null) {
                    long jLongValue = outstandingBillId.longValue();
                    Iterator<T> it2 = detailList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        Long billId = ((LoanHomeRepaymentDetail) next2).getBillId();
                        if (billId != null && billId.longValue() == jLongValue) {
                            break;
                        }
                    }
                    detail = (LoanHomeRepaymentDetail) next2;
                    if (detail == null) {
                        it = detailList.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (Intrinsics.c(((LoanHomeRepaymentDetail) next).getCurrentCleared(), Boolean.TRUE));
                        detail = (LoanHomeRepaymentDetail) next;
                        if (detail == null) {
                            detail = (LoanHomeRepaymentDetail) CollectionsKt.F(detailList);
                        }
                    }
                } else {
                    it = detailList.iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (Intrinsics.c(((LoanHomeRepaymentDetail) next).getCurrentCleared(), Boolean.TRUE));
                    detail = (LoanHomeRepaymentDetail) next;
                    if (detail == null) {
                        detail = (LoanHomeRepaymentDetail) CollectionsKt.F(detailList);
                    }
                }
            }
        }
        if (detail == null) {
            return;
        }
        Context context = getContext();
        b(holder);
        holder.getView(e.tvDerateFlag).setVisibility(8);
        holder.getView(e.llDerateFlag).setVisibility(8);
        Integer accountType3 = account.getAccountType();
        if ((accountType3 != null && accountType3.intValue() == 6) || (accountType3 != null && accountType3.intValue() == 7) || (accountType3 != null && accountType3.intValue() == 9)) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(detail, "detail");
            WaiverInfo waiverInfo = account.getWaiverInfo();
            if (waiverInfo == null) {
                waiverInfo = detail.getWaiverInfo();
            }
            if (a.q(waiverInfo)) {
                Context context2 = getContext();
                Intrinsics.checkNotNullParameter(account, "account");
                Intrinsics.checkNotNullParameter(detail, "detail");
                WaiverInfo waiverInfo2 = account.getWaiverInfo();
                if (waiverInfo2 == null) {
                    waiverInfo2 = detail.getWaiverInfo();
                }
                if (waiverInfo2 == null) {
                    return;
                }
                int color = context2.getColor(b.ppColorFlexiCashPrimary);
                int i13 = e.tvProductName;
                String productTitle = account.getProductTitle();
                if (productTitle == null) {
                    productTitle = context2.getString(g.cs_loan_repayment_card_default_product_name);
                    Intrinsics.checkNotNullExpressionValue(productTitle, "getString(...)");
                } else {
                    if (StringsKt.F(productTitle)) {
                        productTitle = null;
                    }
                    if (productTitle == null) {
                        productTitle = context2.getString(g.cs_loan_repayment_card_default_product_name);
                        Intrinsics.checkNotNullExpressionValue(productTitle, "getString(...)");
                    }
                }
                holder.setText(i13, productTitle);
                AppCompatImageView appCompatImageView = (AppCompatImageView) holder.getView(e.ivProductIcon);
                if (TextUtils.isEmpty(account.getProductIcon())) {
                    IconicsDrawable iconicsDrawable = new IconicsDrawable(context2, S6.a.pay_LoanFill);
                    j6 = 0;
                    iconicsDrawable.a(new O(color, 8));
                    appCompatImageView.setImageDrawable(iconicsDrawable);
                } else {
                    j6 = 0;
                    r0.l1(account.getProductIcon(), appCompatImageView);
                }
                TextView textView = (TextView) holder.getView(e.tvDerateFlag);
                textView.setVisibility(TextUtils.isEmpty(waiverInfo2.getBadgeText()) ? 8 : 0);
                String badgeText = waiverInfo2.getBadgeText();
                if (badgeText == null) {
                    badgeText = "";
                }
                textView.setText(badgeText);
                textView.setBackgroundResource(Intrinsics.c(waiverInfo2.getWaiverType(), WaiverInfo.TYPE_PARTIAL) ? d.cs_cl_loan_fully_bj : d.cs_cl_loan_fully_bj);
                TextView textView2 = (TextView) holder.getView(e.tvPrimaryAmountLabel);
                textView2.setVisibility(TextUtils.isEmpty(waiverInfo2.getAmountLabel()) ? 8 : 0);
                String amountLabel = waiverInfo2.getAmountLabel();
                textView2.setText(amountLabel != null ? amountLabel : "");
                int i14 = e.tvMainAmount;
                Long currentOutstandingAmount2 = waiverInfo2.getCurrentOutstandingAmount();
                holder.setText(i14, r0.B(currentOutstandingAmount2 != null ? currentOutstandingAmount2.longValue() : j6, true));
                ((TextView) holder.getView(e.tvMainAmount)).setTextColor(context2.getColor(b.ppColorTextPrimary));
                TextView textView3 = (TextView) holder.getView(e.tvSubLine);
                if (TextUtils.isEmpty(waiverInfo2.getSummaryText())) {
                    textView3.setVisibility(8);
                } else {
                    textView3.setVisibility(0);
                    textView3.setText(waiverInfo2.getSummaryText());
                    textView3.setTextColor(context2.getColor(b.ppColorTextAssist));
                }
                TextView textView4 = (TextView) holder.getView(e.tvRepay);
                String ctaText = waiverInfo2.getCtaText();
                if (ctaText == null) {
                    ctaText = context2.getString(g.cs_cl_waiver_settle_now);
                    Intrinsics.checkNotNullExpressionValue(ctaText, "getString(...)");
                } else {
                    if (StringsKt.F(ctaText)) {
                        ctaText = null;
                    }
                    if (ctaText == null) {
                        ctaText = context2.getString(g.cs_cl_waiver_settle_now);
                        Intrinsics.checkNotNullExpressionValue(ctaText, "getString(...)");
                    }
                }
                textView4.setText(ctaText);
                textView4.setBackgroundTintList(ColorStateList.valueOf(color));
                holder.getView(e.barTotalOutstanding).setVisibility(8);
                holder.getView(e.llDerateFlag).setVisibility(0);
                Long validUntil = waiverInfo2.getValidUntil();
                if (validUntil != null) {
                    a(holder, validUntil.longValue());
                    n nVar = new n(validUntil.longValue(), new A(this, 11, holder, validUntil), new h(0, this, holder));
                    holder.itemView.setTag(e.rootLoanRepaymentCard, nVar);
                    nVar.a();
                }
                final D6.a aVar2 = new D6.a(context2, 6, account, detail);
                final int i15 = 0;
                holder.getView(e.rowAmountClick).setOnClickListener(new View.OnClickListener() { // from class: wb.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                aVar2.invoke(view);
                                break;
                            case 1:
                                aVar2.invoke(view);
                                break;
                            default:
                                aVar2.invoke(view);
                                break;
                        }
                    }
                });
                final int i16 = 1;
                ((TextView) holder.getView(e.tvRepay)).setOnClickListener(new View.OnClickListener() { // from class: wb.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                aVar2.invoke(view);
                                break;
                            case 1:
                                aVar2.invoke(view);
                                break;
                            default:
                                aVar2.invoke(view);
                                break;
                        }
                    }
                });
                final int i17 = 2;
                holder.getView(e.rootLoanRepaymentCard).setOnClickListener(new View.OnClickListener() { // from class: wb.f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                aVar2.invoke(view);
                                break;
                            case 1:
                                aVar2.invoke(view);
                                break;
                            default:
                                aVar2.invoke(view);
                                break;
                        }
                    }
                });
                holder.getView(e.rowTotalAmountClick).setOnClickListener(null);
                return;
            }
        }
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(detail, "detail");
        if (detail.getRepaymentDateStamp() == null) {
            z3 = false;
        } else {
            Long repaymentDateStamp = detail.getRepaymentDateStamp();
            Intrinsics.e(repaymentDateStamp);
            if (repaymentDateStamp.longValue() < System.currentTimeMillis()) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        Integer numH = J3.a.h(detail.getRepaymentDateStamp());
        boolean z11 = (z3 || numH == null || !new IntRange(1, 7, 1).contains(numH.intValue())) ? false : true;
        if (z3) {
            aVar = Bb.a.f579b;
        } else {
            aVar = z11 ? Bb.a.f580c : Bb.a.f578a;
        }
        int color2 = context.getColor(b.ppColorTextPrimary);
        int color3 = context.getColor(b.ppColorTextAssist);
        int color4 = context.getColor(b.ppColorError);
        int color5 = context.getColor(b.ppColorWarning);
        int color6 = context.getColor(b.ppColorFlexiCashPrimary);
        Long repaymentDateStamp2 = detail.getRepaymentDateStamp();
        boolean zIsToday = TimeUtils.isToday(repaymentDateStamp2 != null ? repaymentDateStamp2.longValue() : 0L);
        int i18 = e.tvProductName;
        String productTitle2 = account.getProductTitle();
        if (productTitle2 == null) {
            string = context.getString(g.cs_loan_repayment_card_default_product_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            if (StringsKt.F(productTitle2)) {
                productTitle2 = null;
            }
            if (productTitle2 == null) {
                string = context.getString(g.cs_loan_repayment_card_default_product_name);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            } else {
                string = productTitle2;
            }
        }
        holder.setText(i18, string);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) holder.getView(e.ivProductIcon);
        if (TextUtils.isEmpty(account.getProductIcon())) {
            IconicsDrawable iconicsDrawable2 = new IconicsDrawable(context, S6.a.pay_LoanFill);
            iconicsDrawable2.a(new O(color6, 7));
            appCompatImageView2.setImageDrawable(iconicsDrawable2);
        } else {
            r0.l1(account.getProductIcon(), appCompatImageView2);
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            i7 = g.cs_loan_repayment_card_upcoming_repayment;
        } else if (iOrdinal == 1) {
            i7 = g.cs_loan_repayment_card_overdue_amount;
        } else {
            if (iOrdinal != 2) {
                throw new l();
            }
            i7 = g.cs_loan_repayment_card_upcoming_amount;
        }
        holder.setText(e.tvPrimaryAmountLabel, TextUtils.isEmpty(account.getTitle()) ? context.getString(i7) : account.getTitle());
        if (detail.getNextCycleInstallmentAmount() != null) {
            currentOutstandingAmount = detail.getNextCycleInstallmentAmount();
        } else {
            currentOutstandingAmount = detail.getCurrentOutstandingAmount() != null ? detail.getCurrentOutstandingAmount() : 0L;
        }
        holder.setText(e.tvMainAmount, r0.B(currentOutstandingAmount != null ? currentOutstandingAmount.longValue() : 0L, true));
        int iOrdinal2 = aVar.ordinal();
        if (iOrdinal2 != 1) {
            i10 = iOrdinal2 != 2 ? color2 : color5;
        } else {
            i10 = color4;
        }
        if (zIsToday) {
            i10 = color5;
        }
        ((TextView) holder.getView(e.tvMainAmount)).setTextColor(i10);
        ((ImageView) holder.getView(e.ivAmountChevron)).setImageTintList(ColorStateList.valueOf(i10));
        int iOrdinal3 = aVar.ordinal();
        SimpleDateFormat simpleDateFormat = this.f43380b;
        String str3 = "Today";
        if (iOrdinal3 == 1) {
            i11 = color4;
            Long repaymentDateStamp3 = detail.getRepaymentDateStamp();
            if (repaymentDateStamp3 != null) {
                long jLongValue2 = repaymentDateStamp3.longValue();
                if (!TimeUtils.isToday(jLongValue2)) {
                    String str4 = simpleDateFormat.format(new Date(jLongValue2));
                    Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                    str3 = str4;
                }
                str = str3;
            } else {
                str = null;
            }
            Long unpaidPenalty = detail.getUnpaidPenalty();
            if (unpaidPenalty == null) {
                strB = null;
            } else {
                if (unpaidPenalty.longValue() <= 0) {
                    unpaidPenalty = null;
                }
                if (unpaidPenalty != null) {
                    strB = r0.B(unpaidPenalty.longValue(), true);
                } else {
                    strB = null;
                }
            }
            Integer numH2 = J3.a.h(detail.getRepaymentDateStamp());
            int iAbs = Math.abs(numH2 != null ? numH2.intValue() : 0);
            if (str == null || strB == null) {
                string2 = str != null ? context.getString(g.cs_loan_repayment_card_overdue_date_subtitle, str) : null;
            } else if (iAbs > 1) {
                string2 = context.getString(g.cs_loan_repayment_card_overdue_subtitle_1, str, strB, Integer.valueOf(iAbs));
            } else {
                string2 = iAbs == 1 ? context.getString(g.cs_loan_repayment_card_overdue_subtitle_2, str, strB, Integer.valueOf(iAbs)) : context.getString(g.cs_loan_repayment_card_overdue_subtitle_3, str, strB);
            }
            z8 = !(string2 == null || StringsKt.F(string2));
            string3 = string2;
            color3 = zIsToday ? color5 : i11;
        } else if (iOrdinal3 != 2) {
            Long repaymentDateStamp4 = detail.getRepaymentDateStamp();
            i11 = color4;
            if (repaymentDateStamp4 != null) {
                long jLongValue3 = repaymentDateStamp4.longValue();
                if (!TimeUtils.isToday(jLongValue3)) {
                    String str5 = simpleDateFormat.format(new Date(jLongValue3));
                    Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                    str3 = str5;
                }
                str2 = str3;
            } else {
                str2 = null;
            }
            Integer numH3 = J3.a.h(detail.getRepaymentDateStamp());
            string3 = (str2 == null || numH3 == null) ? null : context.getString(g.cs_loan_repayment_card_due_subtitle, str2, numH3);
            z8 = !(string3 == null || StringsKt.F(string3));
        } else {
            i11 = color4;
            Integer numH4 = J3.a.h(detail.getRepaymentDateStamp());
            int iIntValue = numH4 != null ? numH4.intValue() : 0;
            Long repaymentDateStamp5 = detail.getRepaymentDateStamp();
            if (TimeUtils.isToday(repaymentDateStamp5 != null ? repaymentDateStamp5.longValue() : 0L)) {
                string4 = "Due today";
            } else {
                string4 = context.getString(g.cs_loan_repayment_card_near_due_fallback, Integer.valueOf(iIntValue));
                Intrinsics.e(string4);
            }
            string3 = string4;
            z8 = true;
            color3 = color5;
        }
        TextView textView5 = (TextView) holder.getView(e.tvSubLine);
        if (!z8 || string3 == null || StringsKt.F(string3)) {
            textView5.setVisibility(8);
        } else {
            textView5.setVisibility(0);
            textView5.setText(string3);
            textView5.setTextColor(color3);
        }
        TextView textView6 = (TextView) holder.getView(e.tvRepay);
        int iOrdinal4 = aVar.ordinal();
        if (iOrdinal4 != 1) {
            i12 = iOrdinal4 != 2 ? color6 : color5;
        } else {
            i12 = i11;
        }
        if (!zIsToday) {
            color5 = i12;
        }
        textView6.setBackgroundTintList(ColorStateList.valueOf(color5));
        Long totalOutstandingAmount = detail.getTotalOutstandingAmount();
        long jLongValue4 = totalOutstandingAmount != null ? totalOutstandingAmount.longValue() : 0L;
        Long currentOutstandingAmount3 = detail.getCurrentOutstandingAmount();
        if (jLongValue4 > (currentOutstandingAmount3 != null ? currentOutstandingAmount3.longValue() : 0L)) {
            z10 = true;
        } else {
            Integer outstandingBillCount = account.getOutstandingBillCount();
            if ((outstandingBillCount != null ? outstandingBillCount.intValue() : 0) > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        Integer accountType4 = account.getAccountType();
        if ((accountType4 != null && accountType4.intValue() == 11) || (((accountType = account.getAccountType()) != null && accountType.intValue() == 13) || ((accountType2 = account.getAccountType()) != null && accountType2.intValue() == 6))) {
            z10 = false;
        }
        View view = holder.getView(e.barTotalOutstanding);
        Long totalOutstandingAmount2 = detail.getTotalOutstandingAmount();
        if (!z10 || totalOutstandingAmount2 == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            holder.setText(e.tvTotalOutstandingAmount, r0.B(totalOutstandingAmount2.longValue(), true));
            ((ImageView) holder.getView(e.ivTotalChevron)).setImageTintList(ColorStateList.valueOf(color2));
        }
        D6.a aVar3 = new D6.a(this, 7, detail, account);
        LoanHomeRepaymentDetail loanHomeRepaymentDetail = detail;
        holder.getView(e.rowAmountClick).setOnClickListener(new c(new g(context, account, loanHomeRepaymentDetail, this, 0), 3));
        textView6.setOnClickListener(new c(new g(context, account, loanHomeRepaymentDetail, this, 1), 4));
        holder.getView(e.rowTotalAmountClick).setOnClickListener(new c(aVar3, 5));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        BaseViewHolder holder = (BaseViewHolder) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        b(holder);
        super.onViewRecycled(holder);
    }
}
