package Hb;

import Pa.r0;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.ExtraTagArea;
import com.transsnet.palmpay.credit.bean.ExtraThemeInfo;
import com.transsnet.palmpay.credit.bean.OverdueArea;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.TopArea;
import com.transsnet.palmpay.credit.bean.other.LoanCoupon;
import com.transsnet.palmpay.credit.view.ProductContentListView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends T1.b implements View.OnClickListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C f3795g = new C(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p355xf.t f3796i = C2131j.b(new G9.j(9));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p355xf.t f3797e = C2131j.b(new G9.j(10));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p355xf.t f3798f = C2131j.b(new G9.j(11));

    /* JADX WARN: Code duplicated, block: B:184:0x0441  */
    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        ProductThemeInfo productThemeInfoC;
        TextView textView;
        TextView textView2;
        BaseViewHolder baseViewHolder;
        TextView textView3;
        CornerRadius cornerRadius;
        String str;
        String str2;
        String str3;
        ExtraThemeInfo extraThemeInfo;
        ExtraTagArea extraTagArea;
        ExtraThemeInfo extraThemeInfo2;
        ExtraTagArea extraTagArea2;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("InstallmentLoanV2ItemProvider", 3, C0.G.p("convert >>> loanProduct=", item.loanProduct, ", style=", item.style));
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
        Gb.O o10 = bindingAdapter instanceof Gb.O ? (Gb.O) bindingAdapter : null;
        ProductContentListView productContentListView = o10 != null ? o10.f3254b : null;
        if (productContentListView != null) {
            productContentListView.d();
        }
        if (productContentListView == null || (productThemeInfoC = productContentListView.c(item.style)) == null) {
            productThemeInfoC = productContentListView != null ? productContentListView.c("extraWithButtonV2") : null;
        }
        ImageView imageView = (ImageView) holder.getView(Ya.e.ivTopBar);
        TextView textView4 = (TextView) holder.getView(Ya.e.tvAmountTitle);
        TextView textView5 = (TextView) holder.getView(Ya.e.tvAmountValue);
        View view = holder.getView(Ya.e.layoutLimitIncreased);
        TextView textView6 = (TextView) holder.getView(Ya.e.tvLimitIncreased);
        View view2 = holder.getView(Ya.e.ivPolygon);
        View view3 = holder.getView(Ya.e.layoutOverdueNoticeBar);
        TextView textView7 = (TextView) holder.getView(Ya.e.tvOverdueNoticeMessage);
        TextView textView8 = (TextView) holder.getView(Ya.e.btnOverdueRepay);
        p220oa.h.l(this, textView8);
        TextView textView9 = (TextView) holder.getView(Ya.e.tvInterestValue);
        TextView textView10 = (TextView) holder.getView(Ya.e.tvInterestLabel);
        Gb.O o11 = o10;
        TextView textView11 = (TextView) holder.getView(Ya.e.tvInterestBadge);
        View view4 = holder.getView(Ya.e.layoutInterest);
        View view5 = holder.getView(Ya.e.layoutInfoRow);
        TextView textView12 = (TextView) holder.getView(Ya.e.tvInterestValue2);
        ImageView imageView2 = (ImageView) holder.getView(Ya.e.ivPeriodIcon);
        TextView textView13 = (TextView) holder.getView(Ya.e.tvPeriodValue);
        TextView textView14 = (TextView) holder.getView(Ya.e.tvPeriodLabel);
        TextView textView15 = (TextView) holder.getView(Ya.e.tvExtendBadge);
        View view6 = holder.getView(Ya.e.layoutCoupon);
        TextView textView16 = (TextView) holder.getView(Ya.e.tvCouponTitle);
        p355xf.t tVar = this.f3798f;
        Handler handler = (Handler) tVar.getValue();
        p355xf.t tVar2 = this.f3797e;
        handler.removeCallbacks((D) tVar2.getValue());
        TextView tvView = (TextView) holder.getView(Ya.e.tvCouponExpireTime);
        TextView textView17 = (TextView) holder.getView(Ya.e.rtvBorrow);
        String str4 = item.amountTitle;
        if (str4 == null) {
            str4 = "";
        }
        textView4.setText(str4);
        p220oa.h.s(textView4, !TextUtils.isEmpty(textView4.getText()));
        Long l5 = item.amount;
        if (l5 != null) {
            textView5.setText(r0.V1(r0.B(l5.longValue(), true)));
            p220oa.h.s(textView5, true);
        } else {
            p220oa.h.s(textView5, false);
        }
        boolean zIsEmpty = TextUtils.isEmpty(item.quotaChangeContent);
        boolean z3 = !zIsEmpty;
        p220oa.h.s(view, z3);
        p220oa.h.s(view2, z3);
        if (!zIsEmpty) {
            String str5 = item.quotaChangeContent;
            if (str5 == null) {
                str5 = "";
            }
            textView6.setText(str5);
        }
        boolean z8 = !TextUtils.isEmpty(item.subTitle) && Intrinsics.c(item.status, "overdue");
        p220oa.h.s(view3, z8);
        p220oa.h.s(textView17, !z8);
        if (z8) {
            String str6 = item.subTitle;
            if (str6 == null) {
                str6 = "";
            }
            textView7.setText(str6);
            String str7 = item.button;
            if (str7 == null) {
                str7 = "Repay";
            }
            textView8.setText(str7);
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(item.interestRatioChangeContent);
        p220oa.h.s(textView11, !zIsEmpty2);
        if (!zIsEmpty2) {
            String str8 = item.interestRatioChangeContent;
            if (str8 == null) {
                str8 = "";
            }
            textView11.setText(str8);
            if (productThemeInfoC != null && (extraThemeInfo2 = productThemeInfoC.extraInfo) != null && (extraTagArea2 = extraThemeInfo2.tag) != null) {
                extraTagArea2.applyTheme(textView11);
                Unit unit = Unit.f38893a;
            }
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(item.termChangeContent);
        p220oa.h.s(textView15, !zIsEmpty3);
        if (!zIsEmpty3) {
            textView15.setText(item.termChangeContent);
            if (productThemeInfoC != null && (extraThemeInfo = productThemeInfoC.extraInfo) != null && (extraTagArea = extraThemeInfo.tag) != null) {
                extraTagArea.applyTheme(textView15);
                Unit unit2 = Unit.f38893a;
            }
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(item.periodTitle);
        boolean z10 = !zIsEmpty4;
        p220oa.h.s(textView13, z10);
        p220oa.h.s(textView14, z10);
        p220oa.h.s(imageView2, z10);
        p220oa.h.s(view4, zIsEmpty4);
        p220oa.h.s(view5, z10);
        if (zIsEmpty4) {
            textView = textView9;
            textView12.setText(item.interest + " " + item.interestString);
        } else {
            textView10.setText(item.interestString);
            textView = textView9;
            textView.setText(item.interest);
            String str9 = item.periodString;
            if (str9 == null) {
                str9 = "";
            }
            textView13.setText(str9);
            textView14.setText(item.periodTitle);
        }
        LoanCoupon loanCoupon = item.coupon;
        boolean z11 = (loanCoupon == null || loanCoupon.couponName == null) ? false : true;
        p220oa.h.s(view6, z11);
        if (z11) {
            LoanCoupon loanCoupon2 = item.coupon;
            textView16.setText(loanCoupon2 != null ? loanCoupon2.couponName : null);
            D d2 = (D) tVar2.getValue();
            d2.getClass();
            Intrinsics.checkNotNullParameter(tvView, "tvView");
            d2.f3794a = new WeakReference(tvView);
            LoanCoupon loanCoupon3 = item.coupon;
            long j6 = loanCoupon3 != null ? loanCoupon3.endTime : 0L;
            C c6 = f3795g;
            long refreshTime = c6.getRefreshTime(j6);
            if (refreshTime > 0) {
                ((Handler) tVar.getValue()).postDelayed((D) tVar2.getValue(), refreshTime);
            }
            LoanCoupon loanCoupon4 = item.coupon;
            tvView.setTag(loanCoupon4 != null ? Long.valueOf(loanCoupon4.endTime) : 0L);
            Context context = tvView.getContext();
            LoanCoupon loanCoupon5 = item.coupon;
            tvView.setText(c6.getExpireTime(context, loanCoupon5 != null ? loanCoupon5.endTime : 0L));
        } else {
            textView17 = textView17;
        }
        float f10 = z8 != 0 ? 0.4f : 1.0f;
        view4.setAlpha(f10);
        view5.setAlpha(f10);
        if (z8 != 0) {
            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextDisable, c());
            textView5.setTextColor(iColorInt);
            textView2 = textView4;
            textView2.setTextColor(iColorInt);
        } else {
            textView2 = textView4;
            int iColorInt2 = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, c());
            int iColorInt3 = CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, c());
            textView5.setTextColor(iColorInt2);
            textView2.setTextColor(iColorInt3);
        }
        if (productThemeInfoC == null) {
            baseViewHolder = holder;
        } else {
            if (z8 == 0) {
                ProductThemeInfoText productThemeInfoText = productThemeInfoC.text;
                if (productThemeInfoText != null && (str3 = productThemeInfoText.titleColor) != null) {
                    textView2.setTextColor(CommonViewExtKt.hexToColorInt(str3, c(), L6.b.ppColorTextPrimary));
                    Unit unit3 = Unit.f38893a;
                }
                ProductThemeInfoText productThemeInfoText2 = productThemeInfoC.text;
                if (productThemeInfoText2 != null && (str2 = productThemeInfoText2.amountColor) != null) {
                    textView5.setTextColor(CommonViewExtKt.hexToColorInt(str2, c(), L6.b.ppColorTextPrimary));
                    Unit unit4 = Unit.f38893a;
                }
            }
            ProductThemeInfoText productThemeInfoText3 = productThemeInfoC.text;
            if (productThemeInfoText3 != null && (str = productThemeInfoText3.subTitleColor) != null) {
                textView.setTextColor(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
                textView13.setTextColor(CommonViewExtKt.hexToColorInt(str, c(), L6.b.ppColorTextPrimary));
                Unit unit5 = Unit.f38893a;
            }
            ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfoC.nameArea;
            if (productThemeInfoNameArea != null) {
                OverdueArea overdueArea = productThemeInfoNameArea.overdueArea;
                if (overdueArea != null) {
                    overdueArea.applyTheme(view3, textView7);
                    ProductThemeInfoButton productThemeInfoButton = overdueArea.button;
                    if (productThemeInfoButton != null) {
                        productThemeInfoButton.applyTheme(textView8);
                        Unit unit6 = Unit.f38893a;
                    }
                }
                if (z8) {
                    TopArea topArea = productThemeInfoNameArea.topArea;
                    if (!TextUtils.isEmpty(topArea != null ? topArea.bgImage2 : null)) {
                        TopArea topArea2 = productThemeInfoNameArea.topArea;
                        r0.r1(topArea2 != null ? topArea2.bgImage2 : null, imageView);
                    }
                } else {
                    TopArea topArea3 = productThemeInfoNameArea.topArea;
                    if (!TextUtils.isEmpty(topArea3 != null ? topArea3.bgImage1 : null)) {
                        TopArea topArea4 = productThemeInfoNameArea.topArea;
                        r0.r1(topArea4 != null ? topArea4.bgImage1 : null, imageView);
                    }
                }
                Unit unit7 = Unit.f38893a;
            }
            ProductThemeInfoButton productThemeInfoButton2 = productThemeInfoC.button;
            if (productThemeInfoButton2 != null) {
                List<String> list = productThemeInfoButton2.bgColor;
                if (list == null || (cornerRadius = productThemeInfoButton2.cornerRadius) == null) {
                    baseViewHolder = holder;
                } else {
                    baseViewHolder = holder;
                    TextView textView18 = (TextView) baseViewHolder.getView(Ya.e.rtvBorrow);
                    if (textView18 != null) {
                        textView18.setBackground(Eb.a.i(list, cornerRadius, 0, -1));
                        Unit unit8 = Unit.f38893a;
                    }
                    Unit unit9 = Unit.f38893a;
                }
                if (!TextUtils.isEmpty(productThemeInfoButton2.titleColor) && (textView3 = (TextView) baseViewHolder.getView(Ya.e.rtvBorrow)) != null) {
                    textView3.setTextColor(Color.parseColor(productThemeInfoButton2.titleColor));
                    Unit unit10 = Unit.f38893a;
                }
                Unit unit11 = Unit.f38893a;
            } else {
                baseViewHolder = holder;
            }
        }
        final A a3 = new A(item, 0, baseViewHolder, o11);
        if (Intrinsics.c(item.status, "disable") || Intrinsics.c(item.status, "borrowed")) {
            TextView textView19 = textView17;
            textView19.setEnabled(false);
            if (Intrinsics.c(item.status, "borrowed")) {
                textView19.setText(item.button);
            } else {
                textView19.setText("Repay to borrow again");
            }
            textView19.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_button_bg_grey_corner);
            p220oa.h.l(null, textView19);
            View itemView = baseViewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            p220oa.h.l(null, itemView);
            return;
        }
        TextView textView20 = textView17;
        final int i7 = 1;
        textView20.setEnabled(true);
        textView20.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_button_bg_text_primary_corner_12);
        textView20.setText(item.button);
        final int i10 = 0;
        p220oa.h.l(new View.OnClickListener() { // from class: Hb.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                switch (i10) {
                    case 0:
                        a3.invoke();
                        break;
                    default:
                        a3.invoke();
                        break;
                }
            }
        }, textView20);
        View itemView2 = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        p220oa.h.l(new View.OnClickListener() { // from class: Hb.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view7) {
                switch (i7) {
                    case 0:
                        a3.invoke();
                        break;
                    default:
                        a3.invoke();
                        break;
                }
            }
        }, itemView2);
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_INSTALLMENT_LOAN_V2();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_product_info_installment_loan_card_v2_view;
    }

    @Override // T1.b
    public final void h(BaseViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.h(holder);
        ((D) this.f3797e.getValue()).f3794a = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null || view.getId() != Ya.e.btnOverdueRepay) {
            return;
        }
        com.palmpay.lib.apm.launchcounter.util.d.x(null, "LoanRepayMix");
    }
}
