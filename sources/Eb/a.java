package Eb;

import C0.G;
import Gb.A;
import Pa.r0;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.camera.video.u;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.TransferByLoanOpenParams;
import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.MultiLoanInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import com.transsnet.palmpay.credit.bean.req.CLRepaymentPlanV4Req;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanV4Resp;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowData;
import com.transsnet.palmpay.credit.bean.rsp.CLCanBorrowResp;
import com.transsnet.palmpay.credit.network.IApiCreditService;
import com.transsnet.palmpay.credit.view.FitFontSizePpButton;
import com.transsnet.palmpay.credit.view.MultiLoanCtaLightView;
import com.transsnet.palmpay.credit.view.MultiLoanHomeBannerView;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile String f2267a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2268b = new a();

    public static void a(Intent intent, Function1 function1) {
        String strU = u(intent, function1);
        if (strU == null || StringsKt.F(strU)) {
            return;
        }
        f2267a = LoanHomeSource.INSTANCE.normalize(strU);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0089  */
    public static void b(BaseViewHolder holder, ProductContentInfo item, ProductThemeInfoButton productThemeInfoButton) {
        CornerRadius cornerRadius;
        String str;
        Drawable drawableI;
        List<String> list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        FitFontSizePpButton fitFontSizePpButton = (FitFontSizePpButton) holder.itemView.findViewById(Ya.e.rtvBorrow);
        if (fitFontSizePpButton == null) {
            return;
        }
        Context context = holder.itemView.getContext();
        Integer num = item.enable;
        boolean z3 = num != null && num.intValue() == 1;
        if (productThemeInfoButton == null || (cornerRadius = productThemeInfoButton.cornerRadius) == null) {
            cornerRadius = new CornerRadius();
            cornerRadius.setTopLeft(16);
            cornerRadius.setTopRight(16);
            cornerRadius.setBottomLeft(16);
            cornerRadius.setBottomRight(16);
        }
        if (productThemeInfoButton == null || (list = productThemeInfoButton.bgColor) == null || (str = (String) CollectionsKt.firstOrNull(list)) == null) {
            str = "#00A49A";
        }
        fitFontSizePpButton.setBackgroundTintList(null);
        if (z3) {
            List<String> list2 = productThemeInfoButton != null ? productThemeInfoButton.bgColor : null;
            if (list2 == null || list2.isEmpty()) {
                drawableI = context.getDrawable(Ya.d.cs_corner_16_bg_00a49a);
            } else {
                if ((productThemeInfoButton != null ? productThemeInfoButton.cornerRadius : null) != null) {
                    List<String> list3 = productThemeInfoButton.bgColor;
                    Intrinsics.e(list3);
                    CornerRadius cornerRadius2 = productThemeInfoButton.cornerRadius;
                    Intrinsics.e(cornerRadius2);
                    drawableI = i(list3, cornerRadius2, 0, -1);
                } else {
                    drawableI = context.getDrawable(Ya.d.cs_corner_16_bg_00a49a);
                }
            }
        } else {
            int color = Color.parseColor(str);
            String str2 = String.format("#%02X%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf((int) (255 * 0.2f)), Integer.valueOf(Color.red(color)), Integer.valueOf(Color.green(color)), Integer.valueOf(Color.blue(color))}, 4));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            drawableI = i(C1849p.c(str2), cornerRadius, 0, -1);
        }
        fitFontSizePpButton.setBackground(drawableI);
        fitFontSizePpButton.setEnabled(true);
        String str3 = productThemeInfoButton != null ? productThemeInfoButton.titleColor : null;
        if (str3 == null || str3.length() == 0) {
            fitFontSizePpButton.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorButtonTextWhite, fitFontSizePpButton.getContext()));
        } else {
            fitFontSizePpButton.setTextColor(Color.parseColor(str3));
        }
    }

    public static void c(BaseViewHolder holder, ProductContentInfo item, boolean z3, boolean z8, boolean z10, int i7) {
        Integer num;
        boolean z11 = (i7 & 16) == 0;
        if ((i7 & 32) != 0) {
            z10 = false;
        }
        boolean z12 = (i7 & 64) == 0;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        Integer num2 = item.accountType;
        if (num2 == null || num2.intValue() != 9) {
            MultiLoanHomeBannerView multiLoanHomeBannerView = (MultiLoanHomeBannerView) holder.itemView.findViewById(Ya.e.multiLoanBanner);
            if (multiLoanHomeBannerView != null) {
                multiLoanHomeBannerView.c(null);
            }
            MultiLoanCtaLightView multiLoanCtaLightView = (MultiLoanCtaLightView) holder.itemView.findViewById(Ya.e.multiLoanCtaLight);
            if (multiLoanCtaLightView != null) {
                multiLoanCtaLightView.c();
            }
            f(holder, null, z11, true);
            return;
        }
        MultiLoanInfo multiLoanInfo = item.multiLoanInfo;
        MultiLoanHomeBannerView multiLoanHomeBannerView2 = (MultiLoanHomeBannerView) holder.itemView.findViewById(Ya.e.multiLoanBanner);
        if (z3 && z8) {
            if (multiLoanHomeBannerView2 != null) {
                multiLoanHomeBannerView2.setVisibility(8);
            }
        } else if (multiLoanHomeBannerView2 != null) {
            multiLoanHomeBannerView2.c(multiLoanInfo);
        }
        boolean z13 = (multiLoanInfo != null ? Intrinsics.c(multiLoanInfo.getCtaEnabled(), Boolean.TRUE) : false) && (num = item.enable) != null && num.intValue() == 1;
        A style = z12 ? A.f3220b : A.f3219a;
        MultiLoanCtaLightView multiLoanCtaLightView2 = (MultiLoanCtaLightView) holder.itemView.findViewById(Ya.e.multiLoanCtaLight);
        if (multiLoanCtaLightView2 != null) {
            Intrinsics.checkNotNullParameter(style, "style");
            boolean z14 = multiLoanCtaLightView2.f30803c != style;
            multiLoanCtaLightView2.f30803c = style;
            int i10 = style != A.f3220b ? 2 : 1;
            if (multiLoanCtaLightView2.getLayerType() != i10) {
                multiLoanCtaLightView2.setLayerType(i10, null);
            }
            multiLoanCtaLightView2.f30802b = z13;
            if (z13) {
                multiLoanCtaLightView2.setVisibility(0);
                if (z14) {
                    ValueAnimator valueAnimator = multiLoanCtaLightView2.f30801a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    multiLoanCtaLightView2.f30801a = null;
                }
                multiLoanCtaLightView2.b();
            } else {
                multiLoanCtaLightView2.c();
            }
        }
        f(holder, multiLoanInfo, z11, z10);
    }

    public static void d(Context context, TextView textView) {
        Intrinsics.checkNotNullParameter(context, "context");
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, context);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            textView.setText(new SpanUtils().append("I have read, understood and agreed to ").setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, context)).append("Credit Limit Application Agreement,").setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 1)).append(" ").append("Loan Terms,").setForegroundColor(iColorInt).setUnderline().setClickSpan(new Dd.d(iColorInt, 2)).append(" ").append("Privacy Policy.").setForegroundColor(iColorInt).setUnderline().setForegroundColor(iColorInt).setClickSpan(new Dd.d(iColorInt, 3)).create());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    public static void e(Context context, TextView daysTv, TextView hourTv, TextView minuteTv, TextView secondTv, long j6) {
        p pVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(daysTv, "daysTv");
        Intrinsics.checkNotNullParameter(hourTv, "hourTv");
        Intrinsics.checkNotNullParameter(minuteTv, "minuteTv");
        Intrinsics.checkNotNullParameter(secondTv, "secondTv");
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = j6 - jCurrentTimeMillis;
        if (j10 <= 0) {
            pVar = null;
        } else {
            int i7 = (int) ((j10 / ((long) 1000)) / ((long) 86400));
            o oVarW = w(j6, jCurrentTimeMillis);
            if (oVarW == null) {
                pVar = null;
            } else {
                pVar = new p(i7, oVarW);
            }
        }
        if (pVar == null) {
            return;
        }
        daysTv.setText(context.getString(Ya.g.cs_cl_waiver_limited_offer_days, Integer.valueOf(pVar.f2297a)));
        o oVar = pVar.f2298b;
        hourTv.setText(oVar.f2294a);
        minuteTv.setText(oVar.f2295b);
        secondTv.setText(oVar.f2296c);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    public static void f(BaseViewHolder baseViewHolder, MultiLoanInfo multiLoanInfo, boolean z3, boolean z8) {
        boolean z10;
        TextView textView = (TextView) baseViewHolder.itemView.findViewById(Ya.e.tvMultiLoanBadge);
        if (textView == null) {
            return;
        }
        if (!z3 || z8) {
            z10 = false;
        } else {
            String badgeText = multiLoanInfo != null ? multiLoanInfo.getBadgeText() : null;
            if (badgeText == null || StringsKt.F(badgeText)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        textView.setVisibility(z10 ? 0 : 8);
        if (z10) {
            textView.setText(multiLoanInfo != null ? multiLoanInfo.getBadgeText() : null);
        }
    }

    public static void g(String str, Function1 apply, Function0 hide) {
        Intrinsics.checkNotNullParameter(apply, "apply");
        Intrinsics.checkNotNullParameter(hide, "hide");
        if (TextUtils.isEmpty(str)) {
            hide.invoke();
        } else {
            Intrinsics.e(str);
            apply.invoke(str);
        }
    }

    public static StateListDrawable h(String color, CornerRadius cornerRadius, int i7, int i10) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        return i(C1849p.c(color), cornerRadius, i7, i10);
    }

    public static StateListDrawable i(List colors, CornerRadius cornerRadius, int i7, int i10) {
        char c6;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        int i11;
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {R.attr.state_enabled};
        int[] iArr2 = new int[0];
        if (colors.size() > 0) {
            c10 = 7;
            GradientDrawable gradientDrawable = new GradientDrawable();
            c11 = 6;
            gradientDrawable.setColor(Color.parseColor((String) colors.get(0)));
            Integer topLeft = cornerRadius.getTopLeft();
            float fDp2px = SizeUtils.dp2px(topLeft != null ? topLeft.intValue() : 0.0f);
            Integer topLeft2 = cornerRadius.getTopLeft();
            c12 = 5;
            float fDp2px2 = SizeUtils.dp2px(topLeft2 != null ? topLeft2.intValue() : 0.0f);
            Integer topRight = cornerRadius.getTopRight();
            c13 = 4;
            float fDp2px3 = SizeUtils.dp2px(topRight != null ? topRight.intValue() : 0.0f);
            Integer topRight2 = cornerRadius.getTopRight();
            c14 = 3;
            float fDp2px4 = SizeUtils.dp2px(topRight2 != null ? topRight2.intValue() : 0.0f);
            Integer bottomRight = cornerRadius.getBottomRight();
            c15 = 2;
            float fDp2px5 = SizeUtils.dp2px(bottomRight != null ? bottomRight.intValue() : 0.0f);
            Integer bottomRight2 = cornerRadius.getBottomRight();
            c6 = 0;
            float fDp2px6 = SizeUtils.dp2px(bottomRight2 != null ? bottomRight2.intValue() : 0.0f);
            Integer bottomLeft = cornerRadius.getBottomLeft();
            i11 = 1;
            float fDp2px7 = SizeUtils.dp2px(bottomLeft != null ? bottomLeft.intValue() : 0.0f);
            Integer bottomLeft2 = cornerRadius.getBottomLeft();
            gradientDrawable.setCornerRadii(new float[]{fDp2px, fDp2px2, fDp2px3, fDp2px4, fDp2px5, fDp2px6, fDp2px7, SizeUtils.dp2px(bottomLeft2 != null ? bottomLeft2.intValue() : 0.0f)});
            gradientDrawable.setStroke(i7, i10);
            Unit unit = Unit.f38893a;
            stateListDrawable.addState(iArr, gradientDrawable);
        } else {
            c6 = 0;
            c10 = 7;
            c11 = 6;
            c12 = 5;
            c13 = 4;
            c14 = 3;
            c15 = 2;
            i11 = 1;
        }
        int i12 = i11;
        if (colors.size() > i12) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(Color.parseColor((String) colors.get(i12)));
            Integer topLeft3 = cornerRadius.getTopLeft();
            float fDp2px8 = SizeUtils.dp2px(topLeft3 != null ? topLeft3.intValue() : 0.0f);
            Integer topLeft4 = cornerRadius.getTopLeft();
            float fDp2px9 = SizeUtils.dp2px(topLeft4 != null ? topLeft4.intValue() : 0.0f);
            Integer topRight3 = cornerRadius.getTopRight();
            float fDp2px10 = SizeUtils.dp2px(topRight3 != null ? topRight3.intValue() : 0.0f);
            Integer topRight4 = cornerRadius.getTopRight();
            float fDp2px11 = SizeUtils.dp2px(topRight4 != null ? topRight4.intValue() : 0.0f);
            Integer bottomRight3 = cornerRadius.getBottomRight();
            float fDp2px12 = SizeUtils.dp2px(bottomRight3 != null ? bottomRight3.intValue() : 0.0f);
            Integer bottomRight4 = cornerRadius.getBottomRight();
            float fDp2px13 = SizeUtils.dp2px(bottomRight4 != null ? bottomRight4.intValue() : 0.0f);
            Integer bottomLeft3 = cornerRadius.getBottomLeft();
            float fDp2px14 = SizeUtils.dp2px(bottomLeft3 != null ? bottomLeft3.intValue() : 0.0f);
            Integer bottomLeft4 = cornerRadius.getBottomLeft();
            float fDp2px15 = SizeUtils.dp2px(bottomLeft4 != null ? bottomLeft4.intValue() : 0.0f);
            float[] fArr = new float[8];
            fArr[c6] = fDp2px8;
            fArr[1] = fDp2px9;
            fArr[c15] = fDp2px10;
            fArr[c14] = fDp2px11;
            fArr[c13] = fDp2px12;
            fArr[c12] = fDp2px13;
            fArr[c11] = fDp2px14;
            fArr[c10] = fDp2px15;
            gradientDrawable2.setCornerRadii(fArr);
            gradientDrawable2.setStroke(i7, i10);
            Unit unit2 = Unit.f38893a;
            stateListDrawable.addState(iArr2, gradientDrawable2);
        }
        return stateListDrawable;
    }

    public static h j(CommonResult commonResult, String str) {
        String respCode = commonResult.getRespCode();
        if (respCode != null) {
            if (StringsKt.F(respCode)) {
                respCode = null;
            }
            if (respCode != null) {
                str = respCode;
            }
        }
        String respMsg = commonResult.getRespMsg();
        if (respMsg == null) {
            respMsg = "";
        }
        return new h(str, respMsg);
    }

    public static String k(Context context, long j6) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Intrinsics.checkNotNullParameter(context, "context");
        long j10 = j6 - jCurrentTimeMillis;
        if (j10 <= 0 || j10 <= 86400000) {
            return null;
        }
        long j11 = j10 / ((long) 1000);
        long j12 = 86400;
        long j13 = j11 / j12;
        long j14 = (j11 % j12) / ((long) 3600);
        return context.getString(Ya.g.cs_cl_waiver_countdown_day_hour, Long.valueOf(j13), j13 > 1 ? "s" : "", Long.valueOf(j14), j14 > 1 ? "s" : "");
    }

    public static String l(Long l5) {
        if (l5 != null) {
            if (l5.longValue() <= 0) {
                l5 = null;
            }
            if (l5 != null) {
                return G.o("-", r0.B(l5.longValue(), true));
            }
        }
        return null;
    }

    public static void m() {
        Intrinsics.checkNotNullParameter("INSTALLMENT_LOAN", "loanProduct");
        F6.d.h("LoanAgreementHelper", 3, "gotoBorrowAndDirectDebitAgreement >>> loanProduct=INSTALLMENT_LOAN");
        Bundle bundle = new Bundle();
        bundle.putString("loanProduct", "INSTALLMENT_LOAN");
        bundle.putStringArray("tabTitles", new String[]{"Loan Agreement", "Direct Debit Mandate"});
        bundle.putStringArray("agreementTypes", new String[]{"BORROW_CONTRACT", "DEDUCTION_AGREEMENT"});
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AgreementCommonPage");
    }

    public static void n() {
        Intrinsics.checkNotNullParameter("CASH_LOAN", "loanProduct");
        F6.d.h("LoanAgreementHelper", 3, "gotoCreditAgreement >>> loanProduct=CASH_LOAN");
        Bundle bundle = new Bundle();
        bundle.putBoolean("showTitle", true);
        bundle.putString("title", "Credit Limit Application Agreement");
        bundle.putString("loanProduct", "CASH_LOAN");
        bundle.putStringArray("agreementTypes", new String[]{"CREDIT_CONTRACT"});
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AgreementCommonPage");
    }

    public static void o() {
        Intrinsics.checkNotNullParameter("CASH_LOAN", "loanProduct");
        F6.d.h("LoanAgreementHelper", 3, "gotoPrivacyPolicy >>> loanProduct=CASH_LOAN");
        Bundle bundle = new Bundle();
        bundle.putBoolean("showTitle", true);
        bundle.putString("title", "Privacy Policy");
        bundle.putString("loanProduct", "CASH_LOAN");
        bundle.putStringArray("agreementTypes", new String[]{"PRIVACY_AGREEMENT"});
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AgreementCommonPage");
    }

    public static void p() {
        Intrinsics.checkNotNullParameter("CASH_LOAN", "loanProduct");
        F6.d.h("LoanAgreementHelper", 3, "gotoTermsAndConditions >>> loanProduct=CASH_LOAN");
        Bundle bundle = new Bundle();
        bundle.putBoolean("showTitle", true);
        bundle.putString("title", "Terms And Conditions");
        bundle.putString("loanProduct", "CASH_LOAN");
        bundle.putStringArray("agreementTypes", new String[]{"TERMS_AND_CONDITIONS"});
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AgreementCommonPage");
    }

    public static boolean q(WaiverInfo waiverInfo) {
        Long validUntil;
        return waiverInfo != null && Intrinsics.c(waiverInfo.getWaiverEnable(), Boolean.TRUE) && (validUntil = waiverInfo.getValidUntil()) != null && validUntil.longValue() > System.currentTimeMillis();
    }

    public static String s(long j6) {
        return j6 < 10 ? u.i(j6, "0") : String.valueOf(j6);
    }

    public static int t(Context context, String str) {
        if (str != null) {
            return CommonViewExtKt.hexToColorInt(str, context, L6.b.ppColorTextPrimary);
        }
        return -16777216;
    }

    public static String u(Intent intent, Function1 function1) {
        String queryParameter;
        String str;
        String queryParameter2;
        String str2;
        if (intent != null) {
            String stringExtra = intent.getStringExtra(LoanHomeSource.TRACK_PARAM_KEY);
            if (stringExtra != null) {
                if (StringsKt.F(stringExtra)) {
                    stringExtra = null;
                }
                if (stringExtra != null) {
                    return stringExtra;
                }
            }
            if (function1 != null && (str2 = (String) function1.invoke(LoanHomeSource.TRACK_PARAM_KEY)) != null) {
                if (StringsKt.F(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    return str2;
                }
            }
            Uri data = intent.getData();
            if (data != null && (queryParameter2 = data.getQueryParameter(LoanHomeSource.TRACK_PARAM_KEY)) != null) {
                if (StringsKt.F(queryParameter2)) {
                    queryParameter2 = null;
                }
                if (queryParameter2 != null) {
                    return queryParameter2;
                }
            }
            String stringExtra2 = intent.getStringExtra(LoanHomeSource.TRACK_PARAM_KEY);
            if (stringExtra2 != null) {
                if (StringsKt.F(stringExtra2)) {
                    stringExtra2 = null;
                }
                if (stringExtra2 != null) {
                    return stringExtra2;
                }
            }
            if (function1 != null && (str = (String) function1.invoke(LoanHomeSource.TRACK_PARAM_KEY)) != null) {
                if (StringsKt.F(str)) {
                    str = null;
                }
                if (str != null) {
                    return str;
                }
            }
            Uri data2 = intent.getData();
            if (data2 != null && (queryParameter = data2.getQueryParameter(LoanHomeSource.TRACK_PARAM_KEY)) != null && !StringsKt.F(queryParameter)) {
                return queryParameter;
            }
        }
        return null;
    }

    public static boolean v(long j6) {
        long jCurrentTimeMillis = j6 - System.currentTimeMillis();
        return jCurrentTimeMillis > 0 && jCurrentTimeMillis <= 86400000;
    }

    public static o w(long j6, long j10) {
        long j11 = j6 - j10;
        if (j11 <= 0) {
            return null;
        }
        long j12 = (j11 / ((long) 1000)) % ((long) 86400);
        long j13 = 3600;
        long j14 = 60;
        return new o(s(j12 / j13), s((j12 % j13) / j14), s(j12 % j14));
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00f8 A[Catch: Exception -> 0x0037, CancellationException -> 0x003a, TryCatch #2 {CancellationException -> 0x003a, Exception -> 0x0037, blocks: (B:13:0x0032, B:58:0x00f0, B:60:0x00f8, B:62:0x0104, B:64:0x0112, B:66:0x0121, B:22:0x0049, B:29:0x0073, B:31:0x007b, B:33:0x0087, B:35:0x008b, B:39:0x0098, B:41:0x00a2, B:44:0x00a7, B:46:0x00ae, B:48:0x00b2, B:51:0x00b7, B:54:0x00be, B:68:0x012c, B:25:0x0050), top: B:90:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0104 A[Catch: Exception -> 0x0037, CancellationException -> 0x003a, TryCatch #2 {CancellationException -> 0x003a, Exception -> 0x0037, blocks: (B:13:0x0032, B:58:0x00f0, B:60:0x00f8, B:62:0x0104, B:64:0x0112, B:66:0x0121, B:22:0x0049, B:29:0x0073, B:31:0x007b, B:33:0x0087, B:35:0x008b, B:39:0x0098, B:41:0x00a2, B:44:0x00a7, B:46:0x00ae, B:48:0x00b2, B:51:0x00b7, B:54:0x00be, B:68:0x012c, B:25:0x0050), top: B:90:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0112 A[Catch: Exception -> 0x0037, CancellationException -> 0x003a, TryCatch #2 {CancellationException -> 0x003a, Exception -> 0x0037, blocks: (B:13:0x0032, B:58:0x00f0, B:60:0x00f8, B:62:0x0104, B:64:0x0112, B:66:0x0121, B:22:0x0049, B:29:0x0073, B:31:0x007b, B:33:0x0087, B:35:0x008b, B:39:0x0098, B:41:0x00a2, B:44:0x00a7, B:46:0x00ae, B:48:0x00b2, B:51:0x00b7, B:54:0x00be, B:68:0x012c, B:25:0x0050), top: B:90:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0121 A[Catch: Exception -> 0x0037, CancellationException -> 0x003a, TryCatch #2 {CancellationException -> 0x003a, Exception -> 0x0037, blocks: (B:13:0x0032, B:58:0x00f0, B:60:0x00f8, B:62:0x0104, B:64:0x0112, B:66:0x0121, B:22:0x0049, B:29:0x0073, B:31:0x007b, B:33:0x0087, B:35:0x008b, B:39:0x0098, B:41:0x00a2, B:44:0x00a7, B:46:0x00ae, B:48:0x00b2, B:51:0x00b7, B:54:0x00be, B:68:0x012c, B:25:0x0050), top: B:90:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object r(TransferByLoanOpenParams transferByLoanOpenParams, Ff.c cVar) {
        m mVar;
        h hVar;
        TransferByLoanOpenParams transferByLoanOpenParams2;
        String str;
        CLRepaymentPlanV4Resp cLRepaymentPlanV4Resp;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i7 = mVar.f2288d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                mVar.f2288d = i7 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objCanBorrowForMvvm = mVar.f2286b;
        Ef.a aVar = Ef.a.f2423a;
        int i10 = mVar.f2288d;
        try {
            if (i10 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(objCanBorrowForMvvm);
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA = p221ob.c.a();
                Integer num = new Integer(9);
                mVar.f2285a = transferByLoanOpenParams;
                mVar.f2288d = 1;
                objCanBorrowForMvvm = iApiCreditServiceA.canBorrowForMvvm(num, mVar);
                if (objCanBorrowForMvvm != aVar) {
                    transferByLoanOpenParams2 = transferByLoanOpenParams;
                }
                return aVar;
            }
            if (i10 == 1) {
                transferByLoanOpenParams2 = (TransferByLoanOpenParams) mVar.f2285a;
                androidx.camera.core.impl.utils.executor.g.M(objCanBorrowForMvvm);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) mVar.f2285a;
                androidx.camera.core.impl.utils.executor.g.M(objCanBorrowForMvvm);
            }
            cLRepaymentPlanV4Resp = (CLRepaymentPlanV4Resp) objCanBorrowForMvvm;
            if (!cLRepaymentPlanV4Resp.isSuccess()) {
                return new i(j(cLRepaymentPlanV4Resp, "PLAN_FAIL"));
            }
            List listZ = Z4.e.z(cLRepaymentPlanV4Resp.getData());
            return listZ.isEmpty() ? new i(new h("EMPTY_PLANS", "no type-9 trial plans")) : new j(new l(str, listZ));
            CLCanBorrowResp cLCanBorrowResp = (CLCanBorrowResp) objCanBorrowForMvvm;
            if (!cLCanBorrowResp.isSuccess()) {
                return new i(j(cLCanBorrowResp, "CAN_BORROW_FAIL"));
            }
            CLCanBorrowData cLCanBorrowData = cLCanBorrowResp.data;
            if (!(cLCanBorrowData != null ? Intrinsics.c(cLCanBorrowData.can, Boolean.TRUE) : false)) {
                CLCanBorrowData cLCanBorrowData2 = cLCanBorrowResp.data;
                String str2 = cLCanBorrowData2 != null ? cLCanBorrowData2.msg : null;
                if (str2 == null) {
                    str2 = "";
                }
                return new i(new h("CANNOT_BORROW", str2));
            }
            CLCanBorrowData cLCanBorrowData3 = cLCanBorrowResp.data;
            String str3 = cLCanBorrowData3 != null ? cLCanBorrowData3.cardNo : null;
            if (str3 != null && str3.length() != 0) {
                p221ob.c.f40268a.getInstance().getClass();
                IApiCreditService iApiCreditServiceA2 = p221ob.c.a();
                CLRepaymentPlanV4Req cLRepaymentPlanV4Req = new CLRepaymentPlanV4Req(new Long(transferByLoanOpenParams2.getLoanAmount()), str3, null, null, null, null, null, "03", 124, null);
                mVar.f2285a = str3;
                mVar.f2288d = 2;
                objCanBorrowForMvvm = iApiCreditServiceA2.queryRepaymentPlanV4(cLRepaymentPlanV4Req, mVar);
                if (objCanBorrowForMvvm != aVar) {
                    str = str3;
                    cLRepaymentPlanV4Resp = (CLRepaymentPlanV4Resp) objCanBorrowForMvvm;
                    if (!cLRepaymentPlanV4Resp.isSuccess()) {
                        return new i(j(cLRepaymentPlanV4Resp, "PLAN_FAIL"));
                    }
                    List listZ2 = Z4.e.z(cLRepaymentPlanV4Resp.getData());
                    if (listZ2.isEmpty()) {
                    }
                }
                return aVar;
            }
            return new i(new h("EMPTY_CARD_NO", "cardNo is empty"));
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            if ((e11 instanceof SocketTimeoutException) || (e11 instanceof TimeoutException) || (e11.getCause() instanceof SocketTimeoutException)) {
                String message = e11.getMessage();
                hVar = new h("TIMEOUT", message != null ? message : "");
            } else {
                String message2 = e11.getMessage();
                hVar = new h("NETWORK_ERROR", message2 != null ? message2 : "");
            }
            return new i(hVar);
        }
    }
}
