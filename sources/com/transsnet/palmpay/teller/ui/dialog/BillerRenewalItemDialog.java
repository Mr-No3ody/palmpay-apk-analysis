package com.transsnet.palmpay.teller.ui.dialog;

import C0.G;
import Oc.j;
import Pa.b0;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.P;
import Uc.I0;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.rsp.BillerRenewalBodyBean;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/dialog/BillerRenewalItemDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Lkotlin/Function0;", "function", "setOnConfirmClickListener", "(Lkotlin/jvm/functions/Function0;)Lcom/transsnet/palmpay/teller/ui/dialog/BillerRenewalItemDialog;", "LRd/P;", "binding", "LRd/P;", "Lkotlin/jvm/functions/Function0;", "Lcom/transsnet/palmpay/core/bean/rsp/BillerRenewalBodyBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/rsp/BillerRenewalBodyBean;", "getData", "()Lcom/transsnet/palmpay/core/bean/rsp/BillerRenewalBodyBean;", "setData", "(Lcom/transsnet/palmpay/core/bean/rsp/BillerRenewalBodyBean;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BillerRenewalItemDialog extends b {

    @Nullable
    private P binding;

    @Nullable
    private BillerRenewalBodyBean data;

    @NotNull
    private Function0<Unit> function;

    public BillerRenewalItemDialog(@Nullable Context context) {
        super(context, d.qt_biller_renewal_item_dialog, w.BaseDialogTheme);
        this.function = new b0(26);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(BillerRenewalItemDialog billerRenewalItemDialog, String str, View view) {
        billerRenewalItemDialog.function.invoke();
        n0.g().l(str);
        billerRenewalItemDialog.dismiss();
    }

    @Nullable
    public final BillerRenewalBodyBean getData() {
        return this.data;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        String recipientNumber;
        Long itemAmount;
        CouponItem couponDetailInfo;
        CouponItem couponDetailInfo2;
        CouponItem couponDetailInfo3;
        String content;
        setContentView(d.qt_biller_renewal_item_dialog);
        View viewFindViewById = findViewById(c.viewRoot);
        int i7 = c.closeIv;
        IconicsImageView iconicsImageView = (IconicsImageView) a.m(i7, viewFindViewById);
        if (iconicsImageView != null) {
            i7 = c.confirmTv;
            TextView textView = (TextView) a.m(i7, viewFindViewById);
            if (textView != null) {
                i7 = c.contentTv;
                TextView textView2 = (TextView) a.m(i7, viewFindViewById);
                if (textView2 != null) {
                    i7 = c.couponAmountTv;
                    TextView textView3 = (TextView) a.m(i7, viewFindViewById);
                    if (textView3 != null) {
                        i7 = c.couponDateTv;
                        TextView textView4 = (TextView) a.m(i7, viewFindViewById);
                        if (textView4 != null) {
                            i7 = c.couponIconIv;
                            if (((ImageView) a.m(i7, viewFindViewById)) != null) {
                                i7 = c.couponLimitTv;
                                TextView textView5 = (TextView) a.m(i7, viewFindViewById);
                                if (textView5 != null) {
                                    i7 = c.couponNameTv;
                                    TextView textView6 = (TextView) a.m(i7, viewFindViewById);
                                    if (textView6 != null) {
                                        i7 = c.llCouponLayout;
                                        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewFindViewById);
                                        if (linearLayout != null) {
                                            i7 = c.ll_left;
                                            if (((LinearLayout) a.m(i7, viewFindViewById)) != null) {
                                                i7 = c.llMobileNumberLayout;
                                                if (((LinearLayout) a.m(i7, viewFindViewById)) != null) {
                                                    i7 = c.llRightLayout;
                                                    if (((LinearLayout) a.m(i7, viewFindViewById)) != null) {
                                                        i7 = c.llTopUpAmountLayout;
                                                        if (((LinearLayout) a.m(i7, viewFindViewById)) != null) {
                                                            i7 = c.mobileTv;
                                                            TextView textView7 = (TextView) a.m(i7, viewFindViewById);
                                                            if (textView7 != null) {
                                                                i7 = c.topBgIv;
                                                                ImageView imageView = (ImageView) a.m(i7, viewFindViewById);
                                                                if (imageView != null) {
                                                                    i7 = c.topUpAmountTv;
                                                                    TextView textView8 = (TextView) a.m(i7, viewFindViewById);
                                                                    if (textView8 != null) {
                                                                        this.binding = new P((ConstraintLayout) viewFindViewById, iconicsImageView, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, textView7, imageView, textView8);
                                                                        BillerRenewalBodyBean billerRenewalBodyBean = this.data;
                                                                        if (!TextUtils.isEmpty(billerRenewalBodyBean != null ? billerRenewalBodyBean.getTopUrl() : null)) {
                                                                            BillerRenewalBodyBean billerRenewalBodyBean2 = this.data;
                                                                            r0.l1(billerRenewalBodyBean2 != null ? billerRenewalBodyBean2.getTopUrl() : null, imageView);
                                                                        }
                                                                        P p3 = this.binding;
                                                                        String str = "";
                                                                        if (p3 != null) {
                                                                            TextView textView9 = p3.f8127d;
                                                                            BillerRenewalBodyBean billerRenewalBodyBean3 = this.data;
                                                                            if (billerRenewalBodyBean3 == null || (content = billerRenewalBodyBean3.getContent()) == null) {
                                                                                content = "";
                                                                            }
                                                                            textView9.setText(content);
                                                                        }
                                                                        BillerRenewalBodyBean billerRenewalBodyBean4 = this.data;
                                                                        long jLongValue = 0;
                                                                        if (billerRenewalBodyBean4 == null || (couponDetailInfo = billerRenewalBodyBean4.getCouponDetailInfo()) == null) {
                                                                            P p10 = this.binding;
                                                                            if (p10 != null) {
                                                                                h.s(p10.f8132j, false);
                                                                            }
                                                                        } else {
                                                                            P p11 = this.binding;
                                                                            if (p11 != null) {
                                                                                h.s(p11.f8132j, true);
                                                                            }
                                                                            P p12 = this.binding;
                                                                            if (p12 != null) {
                                                                                TextView textView10 = p12.f8131i;
                                                                                String str2 = couponDetailInfo.couponName;
                                                                                if (str2 == null) {
                                                                                    str2 = "";
                                                                                }
                                                                                textView10.setText(str2);
                                                                            }
                                                                            P p13 = this.binding;
                                                                            if (p13 != null) {
                                                                                TextView textView11 = p13.f8129f;
                                                                                Resources resources = this.mContext.getResources();
                                                                                int i10 = k.core_valid_until;
                                                                                BillerRenewalBodyBean billerRenewalBodyBean5 = this.data;
                                                                                textView11.setText(resources.getString(i10, r0.S((billerRenewalBodyBean5 == null || (couponDetailInfo3 = billerRenewalBodyBean5.getCouponDetailInfo()) == null) ? 0L : couponDetailInfo3.endTime)));
                                                                            }
                                                                            if (couponDetailInfo.limitAmt > 0) {
                                                                                P p14 = this.binding;
                                                                                if (p14 != null) {
                                                                                    h.s(p14.f8130g, true);
                                                                                }
                                                                                P p15 = this.binding;
                                                                                if (p15 != null) {
                                                                                    TextView textView12 = p15.f8130g;
                                                                                    Context context = this.mContext;
                                                                                    int i11 = k.core_over_amount_available;
                                                                                    BillerRenewalBodyBean billerRenewalBodyBean6 = this.data;
                                                                                    textView12.setText(context.getString(i11, r0.B((billerRenewalBodyBean6 == null || (couponDetailInfo2 = billerRenewalBodyBean6.getCouponDetailInfo()) == null) ? 0L : couponDetailInfo2.limitAmt, true)));
                                                                                }
                                                                            } else {
                                                                                P p16 = this.binding;
                                                                                if (p16 != null) {
                                                                                    h.s(p16.f8130g, false);
                                                                                }
                                                                            }
                                                                            SpanUtils fontSize = G.i("₦").setFontSize(CommonViewExtKt.getDp(16));
                                                                            String strA = r0.A(couponDetailInfo.nominaValue);
                                                                            Intrinsics.checkNotNullExpressionValue(strA, "getAmountString(...)");
                                                                            SpannableStringBuilder spannableStringBuilderCreate = fontSize.append(y.k(strA, ".00", "")).setFontSize(CommonViewExtKt.getDp(32)).create();
                                                                            P p17 = this.binding;
                                                                            if (p17 != null) {
                                                                                p17.f8128e.setText(spannableStringBuilderCreate);
                                                                            }
                                                                        }
                                                                        BillerRenewalBodyBean billerRenewalBodyBean7 = this.data;
                                                                        if (billerRenewalBodyBean7 != null && (itemAmount = billerRenewalBodyBean7.getItemAmount()) != null) {
                                                                            jLongValue = itemAmount.longValue();
                                                                        }
                                                                        String strB = r0.B(jLongValue, true);
                                                                        P p18 = this.binding;
                                                                        if (p18 != null) {
                                                                            TextView textView13 = p18.f8133o;
                                                                            PhoneBaseNumberUtils phoneBaseNumberUtils = PhoneBaseNumberUtils.INSTANCE;
                                                                            BillerRenewalBodyBean billerRenewalBodyBean8 = this.data;
                                                                            if (billerRenewalBodyBean8 != null && (recipientNumber = billerRenewalBodyBean8.getRecipientNumber()) != null) {
                                                                                str = recipientNumber;
                                                                            }
                                                                            textView13.setText(phoneBaseNumberUtils.formatMobileNumber(str, false));
                                                                        }
                                                                        P p19 = this.binding;
                                                                        if (p19 != null) {
                                                                            p19.f8134p.setText(strB);
                                                                        }
                                                                        P p20 = this.binding;
                                                                        if (p20 != null) {
                                                                            p20.f8126c.setText(getContext().getString(k.core_top_up) + " " + strB);
                                                                        }
                                                                        BillerRenewalBodyBean billerRenewalBodyBean9 = this.data;
                                                                        String str3 = (billerRenewalBodyBean9 != null ? billerRenewalBodyBean9.getCouponDetailInfo() : null) != null ? "AirtimeReminderPop-UpHaveCoupon_Pay" : "AirtimeReminderPop-UpNoCoupon_Pay";
                                                                        P p21 = this.binding;
                                                                        if (p21 != null) {
                                                                            p21.f8126c.setOnClickListener(new j(28, this, str3));
                                                                        }
                                                                        P p22 = this.binding;
                                                                        if (p22 != null) {
                                                                            p22.f8125b.setOnClickListener(new I0(this, 29));
                                                                        }
                                                                        BillerRenewalBodyBean billerRenewalBodyBean10 = this.data;
                                                                        n0.g().v((billerRenewalBodyBean10 != null ? billerRenewalBodyBean10.getCouponDetailInfo() : null) != null ? "AirtimeReminderPop-UpHaveCoupon" : "AirtimeReminderPop-UpNoCoupon");
                                                                        return;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i7)));
    }

    public final void setData(@Nullable BillerRenewalBodyBean billerRenewalBodyBean) {
        this.data = billerRenewalBodyBean;
    }

    @NotNull
    public final BillerRenewalItemDialog setOnConfirmClickListener(@NotNull Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
        return this;
    }
}
