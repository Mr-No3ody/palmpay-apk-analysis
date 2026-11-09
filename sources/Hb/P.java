package Hb;

import B6.ViewOnClickListenerC0087i;
import Pa.C0525w;
import Pa.r0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.view.IconicsCheckBox;
import com.mikepenz.iconics.view.IconicsTextView;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.credit.bean.CouponThemeInfo;
import com.transsnet.palmpay.credit.bean.ExtraTagArea;
import com.transsnet.palmpay.credit.bean.ExtraThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoButton;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoCard;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoText;
import com.transsnet.palmpay.credit.bean.ProductThemeWrapper;
import com.transsnet.palmpay.credit.bean.TitleFont;
import com.transsnet.palmpay.credit.bean.other.LoanCoupon;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends T1.b {
    static {
        new O(null);
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Pa.F.f(str, null, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:103:0x020c  */
    /* JADX WARN: Code duplicated, block: B:104:0x020f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0220  */
    /* JADX WARN: Code duplicated, block: B:114:0x0231  */
    /* JADX WARN: Code duplicated, block: B:116:0x0237  */
    /* JADX WARN: Code duplicated, block: B:120:0x024e  */
    /* JADX WARN: Code duplicated, block: B:122:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x028c  */
    /* JADX WARN: Code duplicated, block: B:135:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:155:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:163:0x0300  */
    /* JADX WARN: Code duplicated, block: B:164:0x0303  */
    /* JADX WARN: Code duplicated, block: B:165:0x0310  */
    /* JADX WARN: Code duplicated, block: B:166:0x0312  */
    /* JADX WARN: Code duplicated, block: B:168:0x031a  */
    /* JADX WARN: Code duplicated, block: B:169:0x031d  */
    /* JADX WARN: Code duplicated, block: B:172:0x032e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0335  */
    /* JADX WARN: Code duplicated, block: B:177:0x0338 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x0343 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x039c  */
    /* JADX WARN: Code duplicated, block: B:209:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:211:0x03af  */
    /* JADX WARN: Code duplicated, block: B:213:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:219:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:224:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:225:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:227:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:229:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:231:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:232:0x0420  */
    /* JADX WARN: Code duplicated, block: B:234:0x0425  */
    /* JADX WARN: Code duplicated, block: B:237:0x0432  */
    /* JADX WARN: Code duplicated, block: B:239:0x043c  */
    /* JADX WARN: Code duplicated, block: B:241:0x0444  */
    /* JADX WARN: Code duplicated, block: B:243:0x0450  */
    /* JADX WARN: Code duplicated, block: B:248:0x045e  */
    /* JADX WARN: Code duplicated, block: B:250:0x0467  */
    /* JADX WARN: Code duplicated, block: B:252:0x046f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0472  */
    /* JADX WARN: Code duplicated, block: B:255:0x047f  */
    /* JADX WARN: Code duplicated, block: B:257:0x0487  */
    /* JADX WARN: Code duplicated, block: B:258:0x048a  */
    /* JADX WARN: Code duplicated, block: B:261:0x049a  */
    /* JADX WARN: Code duplicated, block: B:262:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:265:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:268:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:270:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:273:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:275:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:277:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:280:0x0502  */
    /* JADX WARN: Code duplicated, block: B:284:0x050d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0516  */
    /* JADX WARN: Code duplicated, block: B:288:0x051c  */
    /* JADX WARN: Code duplicated, block: B:291:0x053b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x05b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:325:0x05b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:332:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:335:0x05db  */
    /* JADX WARN: Code duplicated, block: B:336:0x05df  */
    /* JADX WARN: Code duplicated, block: B:338:0x05ed A[LOOP:0: B:337:0x05eb->B:338:0x05ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x0601  */
    /* JADX WARN: Code duplicated, block: B:342:0x060d  */
    /* JADX WARN: Code duplicated, block: B:343:0x060f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:349:0x0625 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:352:0x062a  */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:53:0x015f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:58:0x016b  */
    /* JADX WARN: Code duplicated, block: B:60:0x016e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Code duplicated, block: B:70:0x018f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0196  */
    /* JADX WARN: Code duplicated, block: B:74:0x019a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01da  */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        TextView textView;
        final ProductThemeInfo productThemeInfo;
        Context context;
        BaseActivity baseActivity;
        boolean z3;
        String str;
        String str2;
        String string;
        String string2;
        Long l5;
        long jLongValue;
        String strV1;
        boolean zIsEmpty;
        CharSequence charSequence;
        boolean z8;
        boolean zEquals;
        Integer num;
        boolean z10;
        boolean z11;
        boolean zEquals2;
        boolean zEquals3;
        int i7;
        ExtraTagArea extraTagArea;
        int i10;
        String str3;
        SpannableStringBuilder spannableStringBuilderB;
        TextView textView2;
        ExtraThemeInfo extraThemeInfo;
        ExtraTagArea extraTagArea2;
        String strString;
        IconicsCheckBox iconicsCheckBox;
        LoanCoupon loanCoupon;
        boolean z12;
        boolean z13;
        TextView textView3;
        final A a3;
        float f10;
        int i11;
        ViewGroup viewGroup;
        int childCount;
        int i12;
        ProductThemeInfoButton productThemeInfoButton;
        int i13;
        Integer num2;
        ProductThemeInfoButton productThemeInfoButton2;
        ProductThemeInfoButton productThemeInfoButton3;
        String strString2;
        CouponThemeInfo couponThemeInfo;
        TitleFont titleFont;
        ProductThemeInfoButton productThemeInfoButton4;
        ProductThemeInfoText productThemeInfoText;
        String str4;
        ProductThemeInfoText productThemeInfoText2;
        TitleFont titleFont2;
        ExtraThemeInfo extraThemeInfo2;
        TitleFont titleFont3;
        String str5;
        ExtraThemeInfo extraThemeInfo3;
        TitleFont titleFont4;
        ProductThemeInfoNameArea productThemeInfoNameArea;
        ProductThemeInfoText productThemeInfoText3;
        TitleFont titleFont5;
        String string3;
        ProductThemeInfoText productThemeInfoText4;
        TitleFont titleFont6;
        ProductThemeInfoNameArea productThemeInfoNameArea2;
        ProductThemeInfoText productThemeInfoText5;
        TitleFont titleFont7;
        ProductThemeInfoNameArea productThemeInfoNameArea3;
        ProductThemeInfoText productThemeInfoText6;
        String str6;
        ProductThemeInfoCard productThemeInfoCard;
        ProductContentInfo item = (ProductContentInfo) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        F6.d.h("LoanItemProvider", 3, C0.G.p("convert >>> loanProduct=", item.loanProduct, ", style=", item.style));
        AppCompatImageView appCompatImageView = (AppCompatImageView) helper.getView(Ya.e.ivLightning);
        TextView textView4 = (TextView) helper.getView(Ya.e.tvTitle);
        View view = helper.getView(Ya.e.ivArrowRight);
        TextView textView5 = (TextView) helper.getView(Ya.e.tvSubTitle);
        TextView textView6 = (TextView) helper.getView(Ya.e.tvAmount);
        TextView textView7 = (TextView) helper.getView(Ya.e.tvIncreaseLimit);
        TextView textView8 = (TextView) helper.getView(Ya.e.tvStatus);
        TextView textView9 = (TextView) helper.getView(Ya.e.tvInterestLabel);
        TextView textView10 = (TextView) helper.getView(Ya.e.tvBadge);
        final TextView textView11 = (TextView) helper.getView(Ya.e.btnAction);
        IconicsCheckBox iconicsCheckBox2 = (IconicsCheckBox) helper.getView(Ya.e.checkAgreement);
        TextView textView12 = (TextView) helper.getView(Ya.e.tvApplicationAgreement);
        View view2 = helper.getView(Ya.e.layoutCoupon);
        TextView textView13 = (TextView) helper.getView(Ya.e.tvCouponTitle);
        TextView textView14 = (TextView) helper.getView(Ya.e.btnCouponUse);
        View view3 = helper.getView(Ya.e.viewRoot);
        Context context2 = view3.getContext();
        BaseActivity baseActivity2 = context2 instanceof BaseActivity ? (BaseActivity) context2 : null;
        String str7 = (baseActivity2 == null || !baseActivity2.isDarkMode()) ? item.lightTheme : item.darkTheme;
        if (!TextUtils.isEmpty(str7)) {
            try {
                C0525w.f().getClass();
                productThemeInfo = (ProductThemeInfo) C0525w.d(str7, ProductThemeInfo.class);
                if (productThemeInfo != null) {
                    textView = textView9;
                    try {
                        if (productThemeInfo.card == null && productThemeInfo.text == null && productThemeInfo.nameArea == null && productThemeInfo.button == null && productThemeInfo.extraInfo == null && productThemeInfo.couponArea == null) {
                        }
                    } catch (Exception e10) {
                        e = e10;
                        F6.d.c("LoanItemProvider", e);
                    }
                    p220oa.h.c(textView8);
                    p220oa.h.c(textView);
                    context = helper.itemView.getContext();
                    if (context instanceof BaseActivity) {
                        baseActivity = (BaseActivity) context;
                    } else {
                        baseActivity = null;
                    }
                    if (baseActivity == null && baseActivity.isDarkMode()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (productThemeInfo != null && (productThemeInfoCard = productThemeInfo.card) != null) {
                        productThemeInfoCard.applyBackground(view3);
                        Unit unit = Unit.f38893a;
                    }
                    if (!z3 && !TextUtils.isEmpty(item.productIconDark)) {
                        str = item.productIconDark;
                    } else if (TextUtils.isEmpty(item.productIcon)) {
                        str = null;
                    } else {
                        str = item.productIcon;
                    }
                    if (TextUtils.isEmpty(str)) {
                        IconicsDrawable iconicsDrawable = new IconicsDrawable(c(), S6.a.pay_Loan);
                        iconicsDrawable.a(new Ab.C(this, 18));
                        appCompatImageView.setImageDrawable(iconicsDrawable);
                    } else {
                        r0.r1(str, appCompatImageView);
                    }
                    str2 = item.productTitle;
                    string = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    textView4.setText(str2);
                    if (productThemeInfo != null) {
                        productThemeInfoNameArea2 = productThemeInfo.nameArea;
                        if (productThemeInfoNameArea2 != null || (titleFont7 = productThemeInfoNameArea2.productTitleFont) == null) {
                            productThemeInfoText5 = productThemeInfo.text;
                            if (productThemeInfoText5 != null) {
                                titleFont7 = productThemeInfoText5.titleFont;
                            } else {
                                titleFont7 = null;
                            }
                        }
                        if (titleFont7 != null) {
                            titleFont7.applyTheme(textView4);
                            Unit unit2 = Unit.f38893a;
                        }
                        productThemeInfoNameArea3 = productThemeInfo.nameArea;
                        if (productThemeInfoNameArea3 != null || (str6 = productThemeInfoNameArea3.productTitleColor) == null) {
                            productThemeInfoText6 = productThemeInfo.text;
                            if (productThemeInfoText6 != null) {
                                str6 = productThemeInfoText6.titleColor;
                            } else {
                                str6 = null;
                            }
                        }
                        if (str6 != null) {
                            textView4.setTextColor(CommonViewExtKt.hexToColorInt(str6, textView4.getContext(), L6.b.ppColorTextPrimary));
                            Unit unit3 = Unit.f38893a;
                        }
                    }
                    p220oa.h.s(view, !TextUtils.isEmpty(item.androidLinkCard));
                    if (TextUtils.isEmpty(item.amountTitle)) {
                        string2 = helper.itemView.getContext().getString(Ya.g.cs_loan_amount);
                    } else {
                        string2 = item.amountTitle;
                    }
                    textView5.setText(string2);
                    if (productThemeInfo != null && (productThemeInfoText4 = productThemeInfo.text) != null && (titleFont6 = productThemeInfoText4.titleFont) != null) {
                        titleFont6.applyTheme(textView5);
                        Unit unit4 = Unit.f38893a;
                    }
                    l5 = item.amount;
                    if (l5 != null) {
                        jLongValue = l5.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    strV1 = r0.V1(r0.B(jLongValue, true));
                    Intrinsics.checkNotNullExpressionValue(strV1, "subZeroAndDot(...)");
                    zIsEmpty = TextUtils.isEmpty(strV1);
                    charSequence = strV1;
                    if (!zIsEmpty) {
                        string3 = StringsKt.V(strV1).toString();
                        if (kotlin.text.y.m(string3, "₦", false) && string3.length() > 1) {
                            charSequence = string3;
                            charSequence = string3;
                            SpannableString spannableString = new SpannableString(string3);
                            spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, 1, 33);
                            spannableString.setSpan(new AbsoluteSizeSpan(40, true), 1, string3.length(), 33);
                            charSequence = spannableString;
                        }
                    }
                    charSequence = string3;
                    charSequence = string3;
                    charSequence = string3;
                    textView6.setText(charSequence);
                    if (productThemeInfo != null && (productThemeInfoText3 = productThemeInfo.text) != null && (titleFont5 = productThemeInfoText3.amountFont) != null) {
                        titleFont5.applyTheme(textView6);
                        Unit unit5 = Unit.f38893a;
                    }
                    if (!TextUtils.equals(item.status, "calculating") || TextUtils.equals(item.status, "underReview") || TextUtils.equals(item.status, "assessment")) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    zEquals = TextUtils.equals(item.status, "needApply");
                    num = item.accountType;
                    if (num == null && num.intValue() == 14) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (zEquals || z10) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    zEquals2 = TextUtils.equals(item.status, "frozen");
                    zEquals3 = TextUtils.equals(item.status, "disable");
                    if (!zEquals2 || zEquals3) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    textView10.setVisibility(i7);
                    if (zEquals2) {
                        if (TextUtils.isEmpty(item.cardStatusTitle)) {
                            string = helper.itemView.getContext().getString(Ya.g.cs_loan_home_frozen);
                        } else {
                            string = item.cardStatusTitle;
                        }
                    } else if (zEquals3) {
                        if (TextUtils.isEmpty(item.cardStatusTitle)) {
                            string = helper.itemView.getContext().getString(Ya.g.cs_loan_home_disable);
                        } else {
                            string = item.cardStatusTitle;
                        }
                    }
                    textView10.setText(string);
                    if (productThemeInfo != null || (productThemeInfoNameArea = productThemeInfo.nameArea) == null) {
                        extraTagArea = null;
                    } else {
                        extraTagArea = productThemeInfoNameArea.tag;
                    }
                    if (!zEquals2 && zEquals3 && extraTagArea != null) {
                        extraTagArea.applyTheme(textView10);
                        Unit unit6 = Unit.f38893a;
                    }
                    if (!z8 || zEquals || zEquals2 || zEquals3 || TextUtils.isEmpty(item.button2)) {
                        z8 = z8;
                        i10 = 8;
                        textView7.setVisibility(8);
                        Unit unit7 = Unit.f38893a;
                    } else {
                        textView7.setVisibility(0);
                        textView7.setText(item.button2);
                        if (productThemeInfo != null && (extraThemeInfo3 = productThemeInfo.extraInfo) != null && (titleFont4 = extraThemeInfo3.titleFont) != null) {
                            titleFont4.applyTheme(textView7);
                            Unit unit8 = Unit.f38893a;
                        }
                        if (productThemeInfo == null || (extraThemeInfo2 = productThemeInfo.extraInfo) == null || (titleFont3 = extraThemeInfo2.titleFont) == null || (str5 = titleFont3.fontColor) == null) {
                            z8 = z8;
                        } else {
                            if (textView7 instanceof IconicsTextView) {
                                IconicsTextView iconicsTextView = (IconicsTextView) textView7;
                                iconicsTextView.setCompoundDrawableTintList(ColorStateList.valueOf(CommonViewExtKt.hexToColorInt(str5, iconicsTextView.getContext(), L6.b.ppColorTextPrimary)));
                            }
                            Unit unit9 = Unit.f38893a;
                        }
                        i10 = 8;
                    }
                    if (zEquals) {
                        if (TextUtils.isEmpty(item.interestString)) {
                            p220oa.h.c(textView8);
                            Unit unit10 = Unit.f38893a;
                        } else {
                            p220oa.h.C(textView8);
                            textView8.setText(item.interestString);
                            if (productThemeInfo != null && (productThemeInfoText2 = productThemeInfo.text) != null && (titleFont2 = productThemeInfoText2.subTitleFont2) != null) {
                                titleFont2.applyTheme(textView8);
                                Unit unit11 = Unit.f38893a;
                            }
                            if (productThemeInfo != null && (productThemeInfoText = productThemeInfo.text) != null && (str4 = productThemeInfoText.subTitleColor2) != null) {
                                textView8.setTextColor(CommonViewExtKt.hexToColorInt(str4, textView8.getContext(), L6.b.ppColorTextPrimary));
                                Unit unit12 = Unit.f38893a;
                            }
                        }
                    } else if (TextUtils.equals(item.status, "assessment")) {
                        if (TextUtils.isEmpty(item.cardStatusTitle)) {
                            p220oa.h.c(textView8);
                        } else {
                            p220oa.h.C(textView8);
                            str3 = item.cardStatusTitle;
                            if (str3 != null) {
                                spannableStringBuilderB = p220oa.h.B(str3, c(), Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorError, c())), null, null, null, null, 1020);
                            } else {
                                spannableStringBuilderB = null;
                            }
                            textView8.setText(spannableStringBuilderB);
                        }
                    }
                    if (TextUtils.equals(item.status, "canBorrow") || TextUtils.equals(item.status, "borrowed")) {
                        if (TextUtils.isEmpty(item.interestRatioChangeContent)) {
                            p220oa.h.c(textView);
                            Unit unit13 = Unit.f38893a;
                        } else {
                            p220oa.h.C(textView);
                            textView2 = textView;
                            textView2.setText(item.interestRatioChangeContent);
                            if (productThemeInfo != null && (extraThemeInfo = productThemeInfo.extraInfo) != null && (extraTagArea2 = extraThemeInfo.tag) != null) {
                                extraTagArea2.applyTheme(textView2);
                                Unit unit14 = Unit.f38893a;
                            }
                        }
                    }
                    if (zEquals) {
                        if (TextUtils.isEmpty(item.button)) {
                            strString = CommonViewExtKt.string(Ya.g.cs_cl_apply_now, c());
                        } else {
                            strString = item.button;
                        }
                    } else if (TextUtils.isEmpty(item.button)) {
                        strString = CommonViewExtKt.string(p116hb.f.cs_cl_borrow, c());
                    } else {
                        strString = item.button;
                    }
                    textView11.setText(strString);
                    if (z11) {
                        iconicsCheckBox = iconicsCheckBox2;
                        p220oa.h.s(iconicsCheckBox, true);
                        p220oa.h.s(textView12, true);
                        iconicsCheckBox.setChecked(true);
                        Eb.a.d(c(), textView12);
                    } else {
                        iconicsCheckBox = iconicsCheckBox2;
                        p220oa.h.s(iconicsCheckBox, false);
                        p220oa.h.s(textView12, false);
                        iconicsCheckBox.setOnCheckedChangeListener(null);
                    }
                    loanCoupon = item.coupon;
                    if (loanCoupon != null || TextUtils.isEmpty(loanCoupon.couponName)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        i10 = 0;
                    }
                    view2.setVisibility(i10);
                    if (z12) {
                        z13 = z11;
                        textView13.setText(loanCoupon.couponName);
                        if (TextUtils.isEmpty(loanCoupon.button)) {
                            strString2 = CommonViewExtKt.string(p025ba.k.core_use, c());
                        } else {
                            strString2 = loanCoupon.button;
                        }
                        textView3 = textView14;
                        textView3.setText(strString2);
                        if (productThemeInfo != null && (couponThemeInfo = productThemeInfo.couponArea) != null) {
                            couponThemeInfo.applyBackground(view2);
                            titleFont = couponThemeInfo.titleFont;
                            if (titleFont != null) {
                                titleFont.applyTheme(textView13);
                                Unit unit15 = Unit.f38893a;
                            }
                            productThemeInfoButton4 = couponThemeInfo.button;
                            if (productThemeInfoButton4 != null) {
                                productThemeInfoButton4.applyTheme(textView3);
                                Unit unit16 = Unit.f38893a;
                            }
                        }
                    } else {
                        z13 = z11;
                        zEquals2 = zEquals2;
                        textView3 = textView14;
                    }
                    a3 = new A(this, item, helper);
                    L l6 = new L(0, item, this);
                    p220oa.h.l(new ViewOnClickListenerC0087i(item, 11, this, l6), textView7);
                    if (!z8 || zEquals2 || zEquals3 || TextUtils.equals(item.status, "assessment") || ((num2 = item.enable) != null && num2.intValue() == 0)) {
                        if (!zEquals2 || zEquals3) {
                            f10 = 0.5f;
                        } else {
                            f10 = 1.0f;
                        }
                        i11 = 0;
                        textView11.setEnabled(false);
                        textView11.setOnClickListener(null);
                        helper.itemView.setOnClickListener(null);
                    } else {
                        boolean z14 = !z13 || iconicsCheckBox.isChecked();
                        textView11.setEnabled(z14);
                        if (z13) {
                            if (!z14) {
                                textView11.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, c())));
                            } else if (productThemeInfo != null && (productThemeInfoButton3 = productThemeInfo.button) != null) {
                                productThemeInfoButton3.applyTheme(textView11);
                            }
                            Unit unit17 = Unit.f38893a;
                        } else if (productThemeInfo != null && (productThemeInfoButton2 = productThemeInfo.button) != null) {
                            productThemeInfoButton2.applyTheme(textView11);
                            Unit unit18 = Unit.f38893a;
                        }
                        if (z14) {
                            p220oa.h.l(new M(a3, 0), textView11);
                        } else {
                            textView11.setOnClickListener(null);
                        }
                        View itemView = helper.itemView;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                        p220oa.h.l(new Ha.d(l6, 2), itemView);
                        f10 = 1.0f;
                        i11 = 0;
                    }
                    if (iconicsCheckBox != null) {
                        iconicsCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Hb.N
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z15) {
                                ProductThemeInfoButton productThemeInfoButton5;
                                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                                TextView textView15 = textView11;
                                textView15.setEnabled(z15);
                                P p3 = this;
                                if (z15) {
                                    p3.getClass();
                                    ProductThemeInfo productThemeInfo2 = productThemeInfo;
                                    if (productThemeInfo2 != null && (productThemeInfoButton5 = productThemeInfo2.button) != null) {
                                        productThemeInfoButton5.applyTheme(textView15);
                                    }
                                } else {
                                    textView15.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, p3.c())));
                                }
                                if (z15) {
                                    p220oa.h.l(new M(a3, 1), textView15);
                                } else {
                                    textView15.setOnClickListener(null);
                                }
                            }
                        });
                        Unit unit19 = Unit.f38893a;
                    }
                    if (view3 instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view3;
                        viewGroup.setAlpha(1.0f);
                        childCount = viewGroup.getChildCount();
                        for (i12 = i11; i12 < childCount; i12++) {
                            viewGroup.getChildAt(i12).setAlpha(f10);
                        }
                    } else {
                        view3.setAlpha(f10);
                    }
                    if (TextUtils.equals(item.status, "assessment")) {
                        textView11.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_round_corner_cash_primary);
                        textView11.setAlpha(0.3f);
                    } else if (!z13 && productThemeInfo != null && (productThemeInfoButton = productThemeInfo.button) != null) {
                        productThemeInfoButton.applyTheme(textView11);
                        Unit unit20 = Unit.f38893a;
                    }
                    p220oa.h.l(new Fb.k(this, 1, loanCoupon, z12), textView3);
                    if (!zEquals2 || zEquals3) {
                        i13 = 1;
                    } else {
                        i13 = i11;
                    }
                    Eb.a.c(helper, item, true, z12, i13, 64);
                }
                textView = textView9;
                C0525w.f().getClass();
                ProductThemeWrapper productThemeWrapper = (ProductThemeWrapper) C0525w.d(str7, ProductThemeWrapper.class);
                if (productThemeWrapper != null) {
                    Context context3 = view3.getContext();
                    BaseActivity baseActivity3 = context3 instanceof BaseActivity ? (BaseActivity) context3 : null;
                    productThemeInfo = (baseActivity3 == null || !baseActivity3.isDarkMode()) ? productThemeWrapper.lightTheme : productThemeWrapper.darkTheme;
                }
            } catch (Exception e11) {
                e = e11;
                textView = textView9;
            }
            p220oa.h.c(textView8);
            p220oa.h.c(textView);
            context = helper.itemView.getContext();
            if (context instanceof BaseActivity) {
                baseActivity = (BaseActivity) context;
            } else {
                baseActivity = null;
            }
            if (baseActivity == null) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (productThemeInfo != null) {
                productThemeInfoCard.applyBackground(view3);
                Unit unit21 = Unit.f38893a;
            }
            if (!z3) {
                if (TextUtils.isEmpty(item.productIcon)) {
                    str = item.productIcon;
                } else {
                    str = null;
                }
            } else if (TextUtils.isEmpty(item.productIcon)) {
                str = item.productIcon;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                r0.r1(str, appCompatImageView);
            } else {
                IconicsDrawable iconicsDrawable2 = new IconicsDrawable(c(), S6.a.pay_Loan);
                iconicsDrawable2.a(new Ab.C(this, 18));
                appCompatImageView.setImageDrawable(iconicsDrawable2);
            }
            str2 = item.productTitle;
            string = "";
            if (str2 == null) {
                str2 = "";
            }
            textView4.setText(str2);
            if (productThemeInfo != null) {
                productThemeInfoNameArea2 = productThemeInfo.nameArea;
                if (productThemeInfoNameArea2 != null) {
                    productThemeInfoText5 = productThemeInfo.text;
                    if (productThemeInfoText5 != null) {
                        titleFont7 = productThemeInfoText5.titleFont;
                    } else {
                        titleFont7 = null;
                    }
                } else {
                    productThemeInfoText5 = productThemeInfo.text;
                    if (productThemeInfoText5 != null) {
                        titleFont7 = productThemeInfoText5.titleFont;
                    } else {
                        titleFont7 = null;
                    }
                }
                if (titleFont7 != null) {
                    titleFont7.applyTheme(textView4);
                    Unit unit22 = Unit.f38893a;
                }
                productThemeInfoNameArea3 = productThemeInfo.nameArea;
                if (productThemeInfoNameArea3 != null) {
                    productThemeInfoText6 = productThemeInfo.text;
                    if (productThemeInfoText6 != null) {
                        str6 = productThemeInfoText6.titleColor;
                    } else {
                        str6 = null;
                    }
                } else {
                    productThemeInfoText6 = productThemeInfo.text;
                    if (productThemeInfoText6 != null) {
                        str6 = productThemeInfoText6.titleColor;
                    } else {
                        str6 = null;
                    }
                }
                if (str6 != null) {
                    textView4.setTextColor(CommonViewExtKt.hexToColorInt(str6, textView4.getContext(), L6.b.ppColorTextPrimary));
                    Unit unit23 = Unit.f38893a;
                }
            }
            p220oa.h.s(view, !TextUtils.isEmpty(item.androidLinkCard));
            if (TextUtils.isEmpty(item.amountTitle)) {
                string2 = item.amountTitle;
            } else {
                string2 = helper.itemView.getContext().getString(Ya.g.cs_loan_amount);
            }
            textView5.setText(string2);
            if (productThemeInfo != null) {
                titleFont6.applyTheme(textView5);
                Unit unit24 = Unit.f38893a;
            }
            l5 = item.amount;
            if (l5 != null) {
                jLongValue = l5.longValue();
            } else {
                jLongValue = 0;
            }
            strV1 = r0.V1(r0.B(jLongValue, true));
            Intrinsics.checkNotNullExpressionValue(strV1, "subZeroAndDot(...)");
            zIsEmpty = TextUtils.isEmpty(strV1);
            charSequence = strV1;
            if (!zIsEmpty) {
                string3 = StringsKt.V(strV1).toString();
                if (kotlin.text.y.m(string3, "₦", false)) {
                    charSequence = string3;
                    charSequence = string3;
                    SpannableString spannableString2 = new SpannableString(string3);
                    spannableString2.setSpan(new AbsoluteSizeSpan(18, true), 0, 1, 33);
                    spannableString2.setSpan(new AbsoluteSizeSpan(40, true), 1, string3.length(), 33);
                    charSequence = spannableString2;
                }
            }
            charSequence = string3;
            charSequence = string3;
            charSequence = string3;
            textView6.setText(charSequence);
            if (productThemeInfo != null) {
                titleFont5.applyTheme(textView6);
                Unit unit25 = Unit.f38893a;
            }
            if (TextUtils.equals(item.status, "calculating")) {
                z8 = true;
            } else {
                z8 = true;
            }
            zEquals = TextUtils.equals(item.status, "needApply");
            num = item.accountType;
            if (num == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (zEquals) {
                z11 = false;
            } else {
                z11 = false;
            }
            zEquals2 = TextUtils.equals(item.status, "frozen");
            zEquals3 = TextUtils.equals(item.status, "disable");
            if (zEquals2) {
                i7 = 0;
            } else {
                i7 = 0;
            }
            textView10.setVisibility(i7);
            if (zEquals2) {
                if (TextUtils.isEmpty(item.cardStatusTitle)) {
                    string = item.cardStatusTitle;
                } else {
                    string = helper.itemView.getContext().getString(Ya.g.cs_loan_home_frozen);
                }
            } else if (zEquals3) {
                if (TextUtils.isEmpty(item.cardStatusTitle)) {
                    string = item.cardStatusTitle;
                } else {
                    string = helper.itemView.getContext().getString(Ya.g.cs_loan_home_disable);
                }
            }
            textView10.setText(string);
            if (productThemeInfo != null) {
                extraTagArea = null;
            } else {
                extraTagArea = null;
            }
            if (!zEquals2) {
                extraTagArea.applyTheme(textView10);
                Unit unit26 = Unit.f38893a;
            }
            if (z8) {
                z8 = z8;
                i10 = 8;
                textView7.setVisibility(8);
                Unit unit27 = Unit.f38893a;
            } else {
                z8 = z8;
                i10 = 8;
                textView7.setVisibility(8);
                Unit unit28 = Unit.f38893a;
            }
            if (zEquals) {
                if (TextUtils.isEmpty(item.interestString)) {
                    p220oa.h.C(textView8);
                    textView8.setText(item.interestString);
                    if (productThemeInfo != null) {
                        titleFont2.applyTheme(textView8);
                        Unit unit110 = Unit.f38893a;
                    }
                    if (productThemeInfo != null) {
                        textView8.setTextColor(CommonViewExtKt.hexToColorInt(str4, textView8.getContext(), L6.b.ppColorTextPrimary));
                        Unit unit111 = Unit.f38893a;
                    }
                } else {
                    p220oa.h.c(textView8);
                    Unit unit112 = Unit.f38893a;
                }
            } else if (TextUtils.equals(item.status, "assessment")) {
                if (TextUtils.isEmpty(item.cardStatusTitle)) {
                    p220oa.h.C(textView8);
                    str3 = item.cardStatusTitle;
                    if (str3 != null) {
                        spannableStringBuilderB = p220oa.h.B(str3, c(), Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorError, c())), null, null, null, null, 1020);
                    } else {
                        spannableStringBuilderB = null;
                    }
                    textView8.setText(spannableStringBuilderB);
                } else {
                    p220oa.h.c(textView8);
                }
            }
            if (TextUtils.equals(item.status, "canBorrow")) {
                if (TextUtils.isEmpty(item.interestRatioChangeContent)) {
                    p220oa.h.C(textView);
                    textView2 = textView;
                    textView2.setText(item.interestRatioChangeContent);
                    if (productThemeInfo != null) {
                        extraTagArea2.applyTheme(textView2);
                        Unit unit113 = Unit.f38893a;
                    }
                } else {
                    p220oa.h.c(textView);
                    Unit unit114 = Unit.f38893a;
                }
            } else if (TextUtils.isEmpty(item.interestRatioChangeContent)) {
                p220oa.h.C(textView);
                textView2 = textView;
                textView2.setText(item.interestRatioChangeContent);
                if (productThemeInfo != null) {
                    extraTagArea2.applyTheme(textView2);
                    Unit unit115 = Unit.f38893a;
                }
            } else {
                p220oa.h.c(textView);
                Unit unit116 = Unit.f38893a;
            }
            if (zEquals) {
                if (TextUtils.isEmpty(item.button)) {
                    strString = item.button;
                } else {
                    strString = CommonViewExtKt.string(Ya.g.cs_cl_apply_now, c());
                }
            } else if (TextUtils.isEmpty(item.button)) {
                strString = item.button;
            } else {
                strString = CommonViewExtKt.string(p116hb.f.cs_cl_borrow, c());
            }
            textView11.setText(strString);
            if (z11) {
                iconicsCheckBox = iconicsCheckBox2;
                p220oa.h.s(iconicsCheckBox, true);
                p220oa.h.s(textView12, true);
                iconicsCheckBox.setChecked(true);
                Eb.a.d(c(), textView12);
            } else {
                iconicsCheckBox = iconicsCheckBox2;
                p220oa.h.s(iconicsCheckBox, false);
                p220oa.h.s(textView12, false);
                iconicsCheckBox.setOnCheckedChangeListener(null);
            }
            loanCoupon = item.coupon;
            if (loanCoupon != null) {
                z12 = false;
            } else {
                z12 = false;
            }
            if (z12) {
                i10 = 0;
            }
            view2.setVisibility(i10);
            if (z12) {
                z13 = z11;
                textView13.setText(loanCoupon.couponName);
                if (TextUtils.isEmpty(loanCoupon.button)) {
                    strString2 = loanCoupon.button;
                } else {
                    strString2 = CommonViewExtKt.string(p025ba.k.core_use, c());
                }
                textView3 = textView14;
                textView3.setText(strString2);
                if (productThemeInfo != null) {
                    couponThemeInfo.applyBackground(view2);
                    titleFont = couponThemeInfo.titleFont;
                    if (titleFont != null) {
                        titleFont.applyTheme(textView13);
                        Unit unit117 = Unit.f38893a;
                    }
                    productThemeInfoButton4 = couponThemeInfo.button;
                    if (productThemeInfoButton4 != null) {
                        productThemeInfoButton4.applyTheme(textView3);
                        Unit unit118 = Unit.f38893a;
                    }
                }
            } else {
                z13 = z11;
                zEquals2 = zEquals2;
                textView3 = textView14;
            }
            a3 = new A(this, item, helper);
            L l8 = new L(0, item, this);
            p220oa.h.l(new ViewOnClickListenerC0087i(item, 11, this, l8), textView7);
            if (z8) {
                if (zEquals2) {
                    f10 = 0.5f;
                } else {
                    f10 = 0.5f;
                }
                i11 = 0;
                textView11.setEnabled(false);
                textView11.setOnClickListener(null);
                helper.itemView.setOnClickListener(null);
            } else {
                if (zEquals2) {
                    f10 = 0.5f;
                } else {
                    f10 = 0.5f;
                }
                i11 = 0;
                textView11.setEnabled(false);
                textView11.setOnClickListener(null);
                helper.itemView.setOnClickListener(null);
            }
            if (iconicsCheckBox != null) {
                iconicsCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Hb.N
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z15) {
                        ProductThemeInfoButton productThemeInfoButton5;
                        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                        TextView textView15 = textView11;
                        textView15.setEnabled(z15);
                        P p3 = this;
                        if (z15) {
                            p3.getClass();
                            ProductThemeInfo productThemeInfo2 = productThemeInfo;
                            if (productThemeInfo2 != null && (productThemeInfoButton5 = productThemeInfo2.button) != null) {
                                productThemeInfoButton5.applyTheme(textView15);
                            }
                        } else {
                            textView15.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, p3.c())));
                        }
                        if (z15) {
                            p220oa.h.l(new M(a3, 1), textView15);
                        } else {
                            textView15.setOnClickListener(null);
                        }
                    }
                });
                Unit unit119 = Unit.f38893a;
            }
            if (view3 instanceof ViewGroup) {
                view3.setAlpha(f10);
            } else {
                viewGroup = (ViewGroup) view3;
                viewGroup.setAlpha(1.0f);
                childCount = viewGroup.getChildCount();
                while (i12 < childCount) {
                    viewGroup.getChildAt(i12).setAlpha(f10);
                }
            }
            if (TextUtils.equals(item.status, "assessment")) {
                textView11.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_round_corner_cash_primary);
                textView11.setAlpha(0.3f);
            } else if (!z13) {
                productThemeInfoButton.applyTheme(textView11);
                Unit unit29 = Unit.f38893a;
            }
            p220oa.h.l(new Fb.k(this, 1, loanCoupon, z12), textView3);
            if (zEquals2) {
                i13 = 1;
            } else {
                i13 = 1;
            }
            Eb.a.c(helper, item, true, z12, i13, 64);
        }
        textView = textView9;
        productThemeInfo = null;
        p220oa.h.c(textView8);
        p220oa.h.c(textView);
        context = helper.itemView.getContext();
        if (context instanceof BaseActivity) {
            baseActivity = (BaseActivity) context;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (productThemeInfo != null) {
            productThemeInfoCard.applyBackground(view3);
            Unit unit210 = Unit.f38893a;
        }
        if (!z3) {
            if (TextUtils.isEmpty(item.productIcon)) {
                str = item.productIcon;
            } else {
                str = null;
            }
        } else if (TextUtils.isEmpty(item.productIcon)) {
            str = item.productIcon;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            r0.r1(str, appCompatImageView);
        } else {
            IconicsDrawable iconicsDrawable3 = new IconicsDrawable(c(), S6.a.pay_Loan);
            iconicsDrawable3.a(new Ab.C(this, 18));
            appCompatImageView.setImageDrawable(iconicsDrawable3);
        }
        str2 = item.productTitle;
        string = "";
        if (str2 == null) {
            str2 = "";
        }
        textView4.setText(str2);
        if (productThemeInfo != null) {
            productThemeInfoNameArea2 = productThemeInfo.nameArea;
            if (productThemeInfoNameArea2 != null) {
                productThemeInfoText5 = productThemeInfo.text;
                if (productThemeInfoText5 != null) {
                    titleFont7 = productThemeInfoText5.titleFont;
                } else {
                    titleFont7 = null;
                }
            } else {
                productThemeInfoText5 = productThemeInfo.text;
                if (productThemeInfoText5 != null) {
                    titleFont7 = productThemeInfoText5.titleFont;
                } else {
                    titleFont7 = null;
                }
            }
            if (titleFont7 != null) {
                titleFont7.applyTheme(textView4);
                Unit unit211 = Unit.f38893a;
            }
            productThemeInfoNameArea3 = productThemeInfo.nameArea;
            if (productThemeInfoNameArea3 != null) {
                productThemeInfoText6 = productThemeInfo.text;
                if (productThemeInfoText6 != null) {
                    str6 = productThemeInfoText6.titleColor;
                } else {
                    str6 = null;
                }
            } else {
                productThemeInfoText6 = productThemeInfo.text;
                if (productThemeInfoText6 != null) {
                    str6 = productThemeInfoText6.titleColor;
                } else {
                    str6 = null;
                }
            }
            if (str6 != null) {
                textView4.setTextColor(CommonViewExtKt.hexToColorInt(str6, textView4.getContext(), L6.b.ppColorTextPrimary));
                Unit unit212 = Unit.f38893a;
            }
        }
        p220oa.h.s(view, !TextUtils.isEmpty(item.androidLinkCard));
        if (TextUtils.isEmpty(item.amountTitle)) {
            string2 = item.amountTitle;
        } else {
            string2 = helper.itemView.getContext().getString(Ya.g.cs_loan_amount);
        }
        textView5.setText(string2);
        if (productThemeInfo != null) {
            titleFont6.applyTheme(textView5);
            Unit unit213 = Unit.f38893a;
        }
        l5 = item.amount;
        if (l5 != null) {
            jLongValue = l5.longValue();
        } else {
            jLongValue = 0;
        }
        strV1 = r0.V1(r0.B(jLongValue, true));
        Intrinsics.checkNotNullExpressionValue(strV1, "subZeroAndDot(...)");
        zIsEmpty = TextUtils.isEmpty(strV1);
        charSequence = strV1;
        if (!zIsEmpty) {
            string3 = StringsKt.V(strV1).toString();
            if (kotlin.text.y.m(string3, "₦", false)) {
                charSequence = string3;
                charSequence = string3;
                SpannableString spannableString3 = new SpannableString(string3);
                spannableString3.setSpan(new AbsoluteSizeSpan(18, true), 0, 1, 33);
                spannableString3.setSpan(new AbsoluteSizeSpan(40, true), 1, string3.length(), 33);
                charSequence = spannableString3;
            }
        }
        charSequence = string3;
        charSequence = string3;
        charSequence = string3;
        textView6.setText(charSequence);
        if (productThemeInfo != null) {
            titleFont5.applyTheme(textView6);
            Unit unit214 = Unit.f38893a;
        }
        if (TextUtils.equals(item.status, "calculating")) {
            z8 = true;
        } else {
            z8 = true;
        }
        zEquals = TextUtils.equals(item.status, "needApply");
        num = item.accountType;
        if (num == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (zEquals) {
            z11 = false;
        } else {
            z11 = false;
        }
        zEquals2 = TextUtils.equals(item.status, "frozen");
        zEquals3 = TextUtils.equals(item.status, "disable");
        if (zEquals2) {
            i7 = 0;
        } else {
            i7 = 0;
        }
        textView10.setVisibility(i7);
        if (zEquals2) {
            if (TextUtils.isEmpty(item.cardStatusTitle)) {
                string = item.cardStatusTitle;
            } else {
                string = helper.itemView.getContext().getString(Ya.g.cs_loan_home_frozen);
            }
        } else if (zEquals3) {
            if (TextUtils.isEmpty(item.cardStatusTitle)) {
                string = item.cardStatusTitle;
            } else {
                string = helper.itemView.getContext().getString(Ya.g.cs_loan_home_disable);
            }
        }
        textView10.setText(string);
        if (productThemeInfo != null) {
            extraTagArea = null;
        } else {
            extraTagArea = null;
        }
        if (!zEquals2) {
            extraTagArea.applyTheme(textView10);
            Unit unit215 = Unit.f38893a;
        }
        if (z8) {
            z8 = z8;
            i10 = 8;
            textView7.setVisibility(8);
            Unit unit216 = Unit.f38893a;
        } else {
            z8 = z8;
            i10 = 8;
            textView7.setVisibility(8);
            Unit unit217 = Unit.f38893a;
        }
        if (zEquals) {
            if (TextUtils.isEmpty(item.interestString)) {
                p220oa.h.C(textView8);
                textView8.setText(item.interestString);
                if (productThemeInfo != null) {
                    titleFont2.applyTheme(textView8);
                    Unit unit1110 = Unit.f38893a;
                }
                if (productThemeInfo != null) {
                    textView8.setTextColor(CommonViewExtKt.hexToColorInt(str4, textView8.getContext(), L6.b.ppColorTextPrimary));
                    Unit unit1111 = Unit.f38893a;
                }
            } else {
                p220oa.h.c(textView8);
                Unit unit1112 = Unit.f38893a;
            }
        } else if (TextUtils.equals(item.status, "assessment")) {
            if (TextUtils.isEmpty(item.cardStatusTitle)) {
                p220oa.h.C(textView8);
                str3 = item.cardStatusTitle;
                if (str3 != null) {
                    spannableStringBuilderB = p220oa.h.B(str3, c(), Integer.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorError, c())), null, null, null, null, 1020);
                } else {
                    spannableStringBuilderB = null;
                }
                textView8.setText(spannableStringBuilderB);
            } else {
                p220oa.h.c(textView8);
            }
        }
        if (TextUtils.equals(item.status, "canBorrow")) {
            if (TextUtils.isEmpty(item.interestRatioChangeContent)) {
                p220oa.h.C(textView);
                textView2 = textView;
                textView2.setText(item.interestRatioChangeContent);
                if (productThemeInfo != null) {
                    extraTagArea2.applyTheme(textView2);
                    Unit unit1113 = Unit.f38893a;
                }
            } else {
                p220oa.h.c(textView);
                Unit unit1114 = Unit.f38893a;
            }
        } else if (TextUtils.isEmpty(item.interestRatioChangeContent)) {
            p220oa.h.C(textView);
            textView2 = textView;
            textView2.setText(item.interestRatioChangeContent);
            if (productThemeInfo != null) {
                extraTagArea2.applyTheme(textView2);
                Unit unit1115 = Unit.f38893a;
            }
        } else {
            p220oa.h.c(textView);
            Unit unit1116 = Unit.f38893a;
        }
        if (zEquals) {
            if (TextUtils.isEmpty(item.button)) {
                strString = item.button;
            } else {
                strString = CommonViewExtKt.string(Ya.g.cs_cl_apply_now, c());
            }
        } else if (TextUtils.isEmpty(item.button)) {
            strString = item.button;
        } else {
            strString = CommonViewExtKt.string(p116hb.f.cs_cl_borrow, c());
        }
        textView11.setText(strString);
        if (z11) {
            iconicsCheckBox = iconicsCheckBox2;
            p220oa.h.s(iconicsCheckBox, true);
            p220oa.h.s(textView12, true);
            iconicsCheckBox.setChecked(true);
            Eb.a.d(c(), textView12);
        } else {
            iconicsCheckBox = iconicsCheckBox2;
            p220oa.h.s(iconicsCheckBox, false);
            p220oa.h.s(textView12, false);
            iconicsCheckBox.setOnCheckedChangeListener(null);
        }
        loanCoupon = item.coupon;
        if (loanCoupon != null) {
            z12 = false;
        } else {
            z12 = false;
        }
        if (z12) {
            i10 = 0;
        }
        view2.setVisibility(i10);
        if (z12) {
            z13 = z11;
            textView13.setText(loanCoupon.couponName);
            if (TextUtils.isEmpty(loanCoupon.button)) {
                strString2 = loanCoupon.button;
            } else {
                strString2 = CommonViewExtKt.string(p025ba.k.core_use, c());
            }
            textView3 = textView14;
            textView3.setText(strString2);
            if (productThemeInfo != null) {
                couponThemeInfo.applyBackground(view2);
                titleFont = couponThemeInfo.titleFont;
                if (titleFont != null) {
                    titleFont.applyTheme(textView13);
                    Unit unit1117 = Unit.f38893a;
                }
                productThemeInfoButton4 = couponThemeInfo.button;
                if (productThemeInfoButton4 != null) {
                    productThemeInfoButton4.applyTheme(textView3);
                    Unit unit1118 = Unit.f38893a;
                }
            }
        } else {
            z13 = z11;
            zEquals2 = zEquals2;
            textView3 = textView14;
        }
        a3 = new A(this, item, helper);
        L l10 = new L(0, item, this);
        p220oa.h.l(new ViewOnClickListenerC0087i(item, 11, this, l10), textView7);
        if (z8) {
            if (zEquals2) {
                f10 = 0.5f;
            } else {
                f10 = 0.5f;
            }
            i11 = 0;
            textView11.setEnabled(false);
            textView11.setOnClickListener(null);
            helper.itemView.setOnClickListener(null);
        } else {
            if (zEquals2) {
                f10 = 0.5f;
            } else {
                f10 = 0.5f;
            }
            i11 = 0;
            textView11.setEnabled(false);
            textView11.setOnClickListener(null);
            helper.itemView.setOnClickListener(null);
        }
        if (iconicsCheckBox != null) {
            iconicsCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Hb.N
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z15) {
                    ProductThemeInfoButton productThemeInfoButton5;
                    Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                    TextView textView15 = textView11;
                    textView15.setEnabled(z15);
                    P p3 = this;
                    if (z15) {
                        p3.getClass();
                        ProductThemeInfo productThemeInfo2 = productThemeInfo;
                        if (productThemeInfo2 != null && (productThemeInfoButton5 = productThemeInfo2.button) != null) {
                            productThemeInfoButton5.applyTheme(textView15);
                        }
                    } else {
                        textView15.setBackgroundTintList(ColorStateList.valueOf(CommonViewExtKt.colorInt(L6.b.ppColorTextAssist, p3.c())));
                    }
                    if (z15) {
                        p220oa.h.l(new M(a3, 1), textView15);
                    } else {
                        textView15.setOnClickListener(null);
                    }
                }
            });
            Unit unit1119 = Unit.f38893a;
        }
        if (view3 instanceof ViewGroup) {
            view3.setAlpha(f10);
        } else {
            viewGroup = (ViewGroup) view3;
            viewGroup.setAlpha(1.0f);
            childCount = viewGroup.getChildCount();
            while (i12 < childCount) {
                viewGroup.getChildAt(i12).setAlpha(f10);
            }
        }
        if (TextUtils.equals(item.status, "assessment")) {
            textView11.setBackgroundResource(com.transsnet.palmpay.custom_view.r.cv_shape_round_corner_cash_primary);
            textView11.setAlpha(0.3f);
        } else if (!z13) {
            productThemeInfoButton.applyTheme(textView11);
            Unit unit218 = Unit.f38893a;
        }
        p220oa.h.l(new Fb.k(this, 1, loanCoupon, z12), textView3);
        if (zEquals2) {
            i13 = 1;
        } else {
            i13 = 1;
        }
        Eb.a.c(helper, item, true, z12, i13, 64);
    }

    @Override // T1.b
    public final int d() {
        return Gb.O.f3244d.getITEM_VIEW_TYPE_LOAN_PRODUCT();
    }

    @Override // T1.b
    public final int e() {
        return Ya.f.cs_cl_loan_item_view;
    }
}
