package com.transsnet.palmpay.credit.ui.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b1 f30095f = new b1(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d1 f30096g = new d1("https://static.chuanyinet.com/images/Frame%201686556740db7b3063-05c7-49.png", "https://static.chuanyinet.com/images/Frame%2016865567258cd11587-8b86-4b.png");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d1 f30097i = new d1("https://static.chuanyinet.com/images/cs_repayment_guide_slide_1eab46fdf-2278-4c.webp", "https://static.chuanyinet.com/images/cs_repayment_guide_slide_18907575e-eda5-41.webp");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d1 f30098j = new d1("https://static.chuanyinet.com/images/426436A8-9AAC-4E6E-9347-4309FD794CA58c87dccb-314a-40.png", "https://static.chuanyinet.com/images/lQLPJwI5MQ2vyg_NAwDNBAWwayGtWQ-cntsKbJELzpDuAQ_1029_768e44ea7a7-df60-4e.png");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d1 f30099o = new d1("https://static.chuanyinet.com/images/cs_repayment_guide_slide_20a72c2b5-2322-4b.webp", "https://static.chuanyinet.com/images/cs_repayment_guide_slide_2a178005c-e6cd-43.webp");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d1 f30100p = new d1("https://static.chuanyinet.com/images/cs_repayment_guide_slide_4b0bcf071-20bf-46.webp", "https://static.chuanyinet.com/images/cs_repayment_guide_slide_462c18408-c02d-4c.webp");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QueryLoanDialogPopUpsBean.PhoneModelDto f30101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f30102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f30103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1[] f30104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30105e;

    public e1(QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto) {
        String string;
        this.f30101a = phoneModelDto;
        String virtualAccountNo = phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null;
        String strK = (virtualAccountNo == null || (string = StringsKt.V(virtualAccountNo).toString()) == null) ? null : kotlin.text.y.k(string, " ", "");
        boolean z3 = (strK != null ? strK : "").length() > 0;
        boolean zIsDailyUnit = f30095f.isDailyUnit(phoneModelDto != null ? phoneModelDto.getLoanTermSpanUnit() : null);
        this.f30102b = zIsDailyUnit;
        Af.d dVarB = C1849p.b();
        if (zIsDailyUnit) {
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_daily));
            if (z3) {
                dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_3));
                dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_2));
                dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_4));
            } else {
                dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_2));
                dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_4));
            }
        } else if (z3) {
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_1));
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_3));
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_2));
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_4));
        } else {
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_1));
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_2));
            dVarB.add(Integer.valueOf(p116hb.d.cs_repayment_guide_page_4));
        }
        this.f30103c = CollectionsKt.X(C1849p.a(dVarB));
        Af.d dVarB2 = C1849p.b();
        d1 d1Var = f30098j;
        d1 d1Var2 = f30100p;
        d1 d1Var3 = f30099o;
        if (zIsDailyUnit) {
            dVarB2.add(null);
            if (z3) {
                dVarB2.add(d1Var);
                dVarB2.add(d1Var3);
                dVarB2.add(d1Var2);
            } else {
                dVarB2.add(d1Var3);
                dVarB2.add(d1Var2);
            }
        } else {
            d1 d1Var4 = f30097i;
            if (z3) {
                dVarB2.add(d1Var4);
                dVarB2.add(d1Var);
                dVarB2.add(d1Var3);
                dVarB2.add(d1Var2);
            } else {
                dVarB2.add(d1Var4);
                dVarB2.add(d1Var3);
                dVarB2.add(d1Var2);
            }
        }
        this.f30104d = (d1[]) C1849p.a(dVarB2).toArray(new d1[0]);
        this.f30105e = zIsDailyUnit ? -1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f30103c.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048 A[PHI: r15
      0x0048: PHI (r15v46 java.lang.Long) = (r15v25 java.lang.Long), (r15v47 java.lang.Long) binds: [B:20:0x0055, B:15:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i7) {
        boolean z3;
        String string;
        Long outstandingAmount;
        Long repaymentDate;
        Long repaymentDate2;
        String string2;
        Integer graceDays;
        Integer loanTerm;
        c1 holder = (c1) viewHolder;
        Intrinsics.checkNotNullParameter(holder, "holder");
        boolean z8 = this.f30102b;
        long jLongValue = 0;
        QueryLoanDialogPopUpsBean.PhoneModelDto phoneModelDto = this.f30101a;
        if (!z8 || i7 != 0) {
            if (i7 != this.f30105e) {
                d1 imageUrls = this.f30104d[i7];
                if (imageUrls != null) {
                    holder.getClass();
                    Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
                    ImageView view = (ImageView) holder.itemView.findViewById(p116hb.c.ivSlideIllustration);
                    if (view == null) {
                        return;
                    }
                    Intrinsics.checkNotNullParameter(view, "view");
                    Pa.r0.r1(Pa.i0.V(view) ? imageUrls.f30090b : imageUrls.f30089a, view);
                    return;
                }
                return;
            }
            holder.getClass();
            d1 imageUrls2 = f30097i;
            Intrinsics.checkNotNullParameter(imageUrls2, "imageUrls");
            View view2 = holder.itemView.findViewById(p116hb.c.clCalendarCard);
            if (view2 != null) {
                imageUrls2.getClass();
                Intrinsics.checkNotNullParameter(view2, "view");
                Pa.r0.n1(view2, Pa.i0.V(view2) ? imageUrls2.f30090b : imageUrls2.f30089a);
            }
            TextView textView = (TextView) holder.itemView.findViewById(p116hb.c.tvDateM);
            if (textView != null) {
                textView.setText(Pa.r0.X1(Long.valueOf((phoneModelDto == null || (repaymentDate2 = phoneModelDto.getRepaymentDate()) == null) ? 0L : repaymentDate2.longValue()), "MMM"));
            }
            TextView textView2 = (TextView) holder.itemView.findViewById(p116hb.c.tvDateD);
            if (textView2 != null) {
                textView2.setText(Pa.r0.X1(Long.valueOf((phoneModelDto == null || (repaymentDate = phoneModelDto.getRepaymentDate()) == null) ? 0L : repaymentDate.longValue()), "dd"));
            }
            TextView textView3 = (TextView) holder.itemView.findViewById(p116hb.c.tvRepaymentAmount);
            if (textView3 != null) {
                if (phoneModelDto != null && (outstandingAmount = phoneModelDto.getOutstandingAmount()) != null) {
                    jLongValue = outstandingAmount.longValue();
                }
                textView3.setText(Pa.r0.B(jLongValue, false));
            }
            TextView textView4 = (TextView) holder.itemView.findViewById(p116hb.c.tvTransferRepayAccount);
            ImageView imageView = (ImageView) holder.itemView.findViewById(p116hb.c.ivTransferRepayCopy);
            View viewFindViewById = holder.itemView.findViewById(p116hb.c.llTransferRepayAccount);
            String virtualAccountNo = phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null;
            String strK = (virtualAccountNo == null || (string = StringsKt.V(virtualAccountNo).toString()) == null) ? null : kotlin.text.y.k(string, " ", "");
            z3 = (strK != null ? strK : "").length() > 0;
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(z3 ? 0 : 8);
            }
            if (z3) {
                if (textView4 != null) {
                    textView4.setText(Fb.i.b(phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null));
                }
                Fb.i.a(imageView, phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null);
                return;
            }
            return;
        }
        ImageView view3 = (ImageView) holder.itemView.findViewById(p116hb.c.ivDailyBg);
        if (view3 == null) {
            return;
        }
        d1 d1Var = f30096g;
        d1Var.getClass();
        Intrinsics.checkNotNullParameter(view3, "view");
        Pa.r0.r1(Pa.i0.V(view3) ? d1Var.f30090b : d1Var.f30089a, view3);
        if (phoneModelDto == null || (outstandingAmount = phoneModelDto.getDayRepayAmount()) == null) {
            Long outstandingAmount2 = phoneModelDto != null ? phoneModelDto.getOutstandingAmount() : null;
            jLongValue = outstandingAmount2 != null ? outstandingAmount2.longValue() : 0L;
        }
        TextView textView5 = (TextView) holder.itemView.findViewById(p116hb.c.tvDailyAmount);
        if (textView5 != null) {
            textView5.setText(Pa.r0.B(jLongValue, false));
        }
        TextView textView6 = (TextView) holder.itemView.findViewById(p116hb.c.tvDailyForDays);
        int iIntValue = (phoneModelDto == null || (loanTerm = phoneModelDto.getLoanTerm()) == null) ? 0 : loanTerm.intValue();
        if (iIntValue > 0) {
            if (textView6 != null) {
                textView6.setVisibility(0);
            }
            if (textView6 != null) {
                textView6.setText(holder.itemView.getContext().getString(p116hb.f.cs_repayment_guide_daily_for_days, Integer.valueOf(iIntValue)));
            }
        } else if (textView6 != null) {
            textView6.setVisibility(8);
        }
        TextView textView7 = (TextView) holder.itemView.findViewById(p116hb.c.tvDailyStatLabel);
        TextView textView8 = (TextView) holder.itemView.findViewById(p116hb.c.tvDailyStatValue);
        int iIntValue2 = (phoneModelDto == null || (graceDays = phoneModelDto.getGraceDays()) == null) ? 0 : graceDays.intValue();
        if (iIntValue2 != 0) {
            if (textView7 != null) {
                textView7.setText(p116hb.f.cs_repayment_guide_phone_access_days);
            }
            if (textView8 != null) {
                textView8.setText(holder.itemView.getContext().getString(p116hb.f.cs_repayment_guide_access_days_value, Integer.valueOf(iIntValue2)));
            }
        } else {
            if (textView7 != null) {
                textView7.setText(p116hb.f.cs_repayment_guide_first_lock_date);
            }
            if (textView8 != null) {
                textView8.setText(p116hb.f.cs_repayment_guide_today);
            }
        }
        View viewFindViewById2 = holder.itemView.findViewById(p116hb.c.llDailyTransfer);
        String virtualAccountNo2 = phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null;
        String strK2 = (virtualAccountNo2 == null || (string2 = StringsKt.V(virtualAccountNo2).toString()) == null) ? null : kotlin.text.y.k(string2, " ", "");
        z3 = (strK2 != null ? strK2 : "").length() > 0;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(z3 ? 0 : 8);
        }
        if (z3) {
            TextView textView9 = (TextView) holder.itemView.findViewById(p116hb.c.tvDailyTransferAccount);
            if (textView9 != null) {
                textView9.setText(Fb.i.b(phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null));
            }
            Fb.i.a(holder.itemView.findViewById(p116hb.c.ivDailyTransferCopy), phoneModelDto != null ? phoneModelDto.getVirtualAccountNo() : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i7) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(this.f30103c[i7], parent, false);
        Intrinsics.e(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new c1(itemView);
    }
}
