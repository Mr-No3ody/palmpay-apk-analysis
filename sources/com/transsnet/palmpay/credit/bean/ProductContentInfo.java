package com.transsnet.palmpay.credit.bean;

import android.text.TextUtils;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.credit.bean.other.LoanCoupon;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B§\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010$\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\b\u00100\u001a\u0004\u0018\u00010\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0003\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010\u0003\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\b\u00107\u001a\u0004\u0018\u00010\u0005\u0012\b\u00108\u001a\u0004\u0018\u00010\u0003\u0012\b\u00109\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010F\u001a\u0004\u0018\u00010G\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010V¢\u0006\u0004\bW\u0010XJ\u0006\u0010\\\u001a\u00020$J\u0006\u0010]\u001a\u00020\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010YR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010ZR\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010[R\u0014\u0010%\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010YR\u0012\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010.\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010/\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00100\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00102\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00105\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010YR\u0012\u00108\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00109\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010<\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010>\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010@\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010A\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010B\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010YR\u0012\u0010C\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010D\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010H\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010I\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010J\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010K\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010L\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010M\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010N\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010O\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010P\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010Q\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010R\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010S\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010T\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010U\u001a\u0004\u0018\u00010V8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/ProductContentInfo;", "", "loanProduct", "", "accountType", "", "status", "style", "productIcon", "productIconDark", "productTitle", "productSubTitle", "topTitle", "topTitleBg", "extraInfoTitle", "extraInfoIcon", "extraInfoIcon2", "cardStatusTitle", "amountTitle", "amountUnit", "amount", "", "periodTitle", "periodString", "period", "periodUnit", "periodSubTitle", "periodSubTitleDark", "interest", "interestString", "termChangeContent", "quotaChangeContent", "interestRatioChangeContent", "maxCreditQuota", "minLoanRatio", "isOtherLoan", "", "subTitle", "subTitle2", "extraInfoList", "", "Lcom/transsnet/palmpay/credit/bean/ExtraInfo;", "button", "enable", "applyIcon", "applyIconDark", "applyIcon2", "applyIcon2Dark", "applyTitle", "applySubTitle", "androidLinkCard", "jumpPath", "jumpType", "jumpParams", "advertisementId", "productSubId", "applyId", "tempQuotaDesc", "tempQuotaDescIconBright", "tempQuotaDescIconDark", "bottomContent", "bottomIcon", "bottomIconDark", "button2", "button2Background", "button2BackgroundDark", "enable2", "jumpPath2", "jumpType2", "jumpParams2", FirebaseAnalytics.Param.COUPON, "Lcom/transsnet/palmpay/credit/bean/other/LoanCoupon;", "giftImage", "groupTitle", "lightTheme", "darkTheme", "androidLink", "androidLink2", "tagIcon", "tagTitle", "increaseIcon", "increaseTitle", "increaseArrowIcon", "increaseAndroidLink", "increaseIOSLink", "multiLoanInfo", "Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/other/LoanCoupon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/credit/bean/MultiLoanInfo;)V", "Ljava/lang/Integer;", "Ljava/lang/Long;", "Ljava/lang/Boolean;", "palLoanMigrate", "copy", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductContentInfo {

    @JvmField
    @Nullable
    public final Integer accountType;

    @JvmField
    @Nullable
    public final String advertisementId;

    @JvmField
    @Nullable
    public final Long amount;

    @JvmField
    @Nullable
    public final String amountTitle;

    @JvmField
    @Nullable
    public final String amountUnit;

    @JvmField
    @Nullable
    public final String androidLink;

    @JvmField
    @Nullable
    public final String androidLink2;

    @JvmField
    @Nullable
    public final String androidLinkCard;

    @JvmField
    @Nullable
    public final String applyIcon;

    @JvmField
    @Nullable
    public final String applyIcon2;

    @JvmField
    @Nullable
    public final String applyIcon2Dark;

    @JvmField
    @Nullable
    public final String applyIconDark;

    @JvmField
    @Nullable
    public final String applyId;

    @JvmField
    @Nullable
    public final String applySubTitle;

    @JvmField
    @Nullable
    public final String applyTitle;

    @JvmField
    @Nullable
    public final String bottomContent;

    @JvmField
    @Nullable
    public final String bottomIcon;

    @JvmField
    @Nullable
    public final String bottomIconDark;

    @JvmField
    @Nullable
    public String button;

    @JvmField
    @Nullable
    public final String button2;

    @JvmField
    @Nullable
    public final String button2Background;

    @JvmField
    @Nullable
    public final String button2BackgroundDark;

    @JvmField
    @Nullable
    public final String cardStatusTitle;

    @JvmField
    @Nullable
    public final LoanCoupon coupon;

    @JvmField
    @Nullable
    public final String darkTheme;

    @JvmField
    @Nullable
    public final Integer enable;

    @JvmField
    @Nullable
    public final Integer enable2;

    @JvmField
    @Nullable
    public final String extraInfoIcon;

    @JvmField
    @Nullable
    public final String extraInfoIcon2;

    @JvmField
    @Nullable
    public final List<ExtraInfo> extraInfoList;

    @JvmField
    @Nullable
    public final String extraInfoTitle;

    @JvmField
    @Nullable
    public final String giftImage;

    @JvmField
    @Nullable
    public final String groupTitle;

    @JvmField
    @Nullable
    public final String increaseAndroidLink;

    @JvmField
    @Nullable
    public final String increaseArrowIcon;

    @JvmField
    @Nullable
    public final String increaseIOSLink;

    @JvmField
    @Nullable
    public final String increaseIcon;

    @JvmField
    @Nullable
    public final String increaseTitle;

    @JvmField
    @Nullable
    public String interest;

    @JvmField
    @Nullable
    public String interestRatioChangeContent;

    @JvmField
    @Nullable
    public String interestString;

    @JvmField
    @Nullable
    public Boolean isOtherLoan;

    @JvmField
    @Nullable
    public final String jumpParams;

    @JvmField
    @Nullable
    public final String jumpParams2;

    @JvmField
    @Nullable
    public final String jumpPath;

    @JvmField
    @Nullable
    public final String jumpPath2;

    @JvmField
    @Nullable
    public final String jumpType;

    @JvmField
    @Nullable
    public final String jumpType2;

    @JvmField
    @Nullable
    public final String lightTheme;

    @JvmField
    @Nullable
    public final String loanProduct;

    @JvmField
    @Nullable
    public String maxCreditQuota;

    @JvmField
    @Nullable
    public String minLoanRatio;

    @JvmField
    @Nullable
    public final MultiLoanInfo multiLoanInfo;

    @JvmField
    @Nullable
    public String period;

    @JvmField
    @Nullable
    public String periodString;

    @JvmField
    @Nullable
    public final String periodSubTitle;

    @JvmField
    @Nullable
    public final String periodSubTitleDark;

    @JvmField
    @Nullable
    public String periodTitle;

    @JvmField
    @Nullable
    public final String periodUnit;

    @JvmField
    @Nullable
    public final String productIcon;

    @JvmField
    @Nullable
    public final String productIconDark;

    @JvmField
    @Nullable
    public final Integer productSubId;

    @JvmField
    @Nullable
    public final String productSubTitle;

    @JvmField
    @Nullable
    public final String productTitle;

    @JvmField
    @Nullable
    public String quotaChangeContent;

    @JvmField
    @Nullable
    public String status;

    @JvmField
    @Nullable
    public String style;

    @JvmField
    @Nullable
    public String subTitle;

    @JvmField
    @Nullable
    public String subTitle2;

    @JvmField
    @Nullable
    public final String tagIcon;

    @JvmField
    @Nullable
    public final String tagTitle;

    @JvmField
    @Nullable
    public final String tempQuotaDesc;

    @JvmField
    @Nullable
    public final String tempQuotaDescIconBright;

    @JvmField
    @Nullable
    public final String tempQuotaDescIconDark;

    @JvmField
    @Nullable
    public String termChangeContent;

    @JvmField
    @Nullable
    public final String topTitle;

    @JvmField
    @Nullable
    public final String topTitleBg;

    public ProductContentInfo(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable Long l5, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26, @Nullable String str27, @Nullable String str28, @Nullable Boolean bool, @Nullable String str29, @Nullable String str30, @Nullable List<ExtraInfo> list, @Nullable String str31, @Nullable Integer num2, @Nullable String str32, @Nullable String str33, @Nullable String str34, @Nullable String str35, @Nullable String str36, @Nullable String str37, @Nullable String str38, @Nullable String str39, @Nullable String str40, @Nullable String str41, @Nullable String str42, @Nullable Integer num3, @Nullable String str43, @Nullable String str44, @Nullable String str45, @Nullable String str46, @Nullable String str47, @Nullable String str48, @Nullable String str49, @Nullable String str50, @Nullable String str51, @Nullable String str52, @Nullable Integer num4, @Nullable String str53, @Nullable String str54, @Nullable String str55, @Nullable LoanCoupon loanCoupon, @Nullable String str56, @Nullable String str57, @Nullable String str58, @Nullable String str59, @Nullable String str60, @Nullable String str61, @Nullable String str62, @Nullable String str63, @Nullable String str64, @Nullable String str65, @Nullable String str66, @Nullable String str67, @Nullable String str68, @Nullable MultiLoanInfo multiLoanInfo) {
        this.loanProduct = str;
        this.accountType = num;
        this.status = str2;
        this.style = str3;
        this.productIcon = str4;
        this.productIconDark = str5;
        this.productTitle = str6;
        this.productSubTitle = str7;
        this.topTitle = str8;
        this.topTitleBg = str9;
        this.extraInfoTitle = str10;
        this.extraInfoIcon = str11;
        this.extraInfoIcon2 = str12;
        this.cardStatusTitle = str13;
        this.amountTitle = str14;
        this.amountUnit = str15;
        this.amount = l5;
        this.periodTitle = str16;
        this.periodString = str17;
        this.period = str18;
        this.periodUnit = str19;
        this.periodSubTitle = str20;
        this.periodSubTitleDark = str21;
        this.interest = str22;
        this.interestString = str23;
        this.termChangeContent = str24;
        this.quotaChangeContent = str25;
        this.interestRatioChangeContent = str26;
        this.maxCreditQuota = str27;
        this.minLoanRatio = str28;
        this.isOtherLoan = bool;
        this.subTitle = str29;
        this.subTitle2 = str30;
        this.extraInfoList = list;
        this.button = str31;
        this.enable = num2;
        this.applyIcon = str32;
        this.applyIconDark = str33;
        this.applyIcon2 = str34;
        this.applyIcon2Dark = str35;
        this.applyTitle = str36;
        this.applySubTitle = str37;
        this.androidLinkCard = str38;
        this.jumpPath = str39;
        this.jumpType = str40;
        this.jumpParams = str41;
        this.advertisementId = str42;
        this.productSubId = num3;
        this.applyId = str43;
        this.tempQuotaDesc = str44;
        this.tempQuotaDescIconBright = str45;
        this.tempQuotaDescIconDark = str46;
        this.bottomContent = str47;
        this.bottomIcon = str48;
        this.bottomIconDark = str49;
        this.button2 = str50;
        this.button2Background = str51;
        this.button2BackgroundDark = str52;
        this.enable2 = num4;
        this.jumpPath2 = str53;
        this.jumpType2 = str54;
        this.jumpParams2 = str55;
        this.coupon = loanCoupon;
        this.giftImage = str56;
        this.groupTitle = str57;
        this.lightTheme = str58;
        this.darkTheme = str59;
        this.androidLink = str60;
        this.androidLink2 = str61;
        this.tagIcon = str62;
        this.tagTitle = str63;
        this.increaseIcon = str64;
        this.increaseTitle = str65;
        this.increaseArrowIcon = str66;
        this.increaseAndroidLink = str67;
        this.increaseIOSLink = str68;
        this.multiLoanInfo = multiLoanInfo;
    }

    @NotNull
    public final ProductContentInfo copy() {
        return new ProductContentInfo(this.loanProduct, this.accountType, this.status, this.style, this.productIcon, this.productIconDark, this.productTitle, this.productSubTitle, this.topTitle, this.topTitleBg, this.extraInfoTitle, this.extraInfoIcon, this.extraInfoIcon2, this.cardStatusTitle, this.amountTitle, this.amountUnit, this.amount, this.periodTitle, this.periodString, this.period, this.periodUnit, this.periodSubTitle, this.periodSubTitleDark, this.interest, this.interestString, this.termChangeContent, this.quotaChangeContent, this.interestRatioChangeContent, this.maxCreditQuota, this.minLoanRatio, this.isOtherLoan, this.subTitle, this.subTitle2, this.extraInfoList, this.button, this.enable, this.applyIcon, this.applyIconDark, this.applyIcon2, this.applyIcon2Dark, this.applyTitle, this.applySubTitle, this.androidLinkCard, this.jumpPath, this.jumpType, this.jumpParams, this.advertisementId, this.productSubId, this.applyId, this.tempQuotaDesc, this.tempQuotaDescIconBright, this.tempQuotaDescIconDark, this.bottomContent, this.bottomIcon, this.bottomIconDark, this.button2, this.button2Background, this.button2BackgroundDark, this.enable2, this.jumpPath2, this.jumpType2, this.jumpParams2, this.coupon, this.giftImage, this.groupTitle, this.lightTheme, this.darkTheme, this.androidLink, this.androidLink2, this.tagIcon, this.tagTitle, this.increaseIcon, this.increaseTitle, this.increaseArrowIcon, this.increaseAndroidLink, this.increaseIOSLink, this.multiLoanInfo);
    }

    public final boolean palLoanMigrate() {
        return !TextUtils.isEmpty(this.bottomContent);
    }

    public /* synthetic */ ProductContentInfo(String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l5, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, Boolean bool, String str29, String str30, List list, String str31, Integer num2, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, Integer num3, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, Integer num4, String str53, String str54, String str55, LoanCoupon loanCoupon, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, MultiLoanInfo multiLoanInfo, int i7, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, l5, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, bool, str29, str30, list, str31, num2, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, num3, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, num4, str53, str54, str55, loanCoupon, str56, str57, (i11 & 2) != 0 ? null : str58, (i11 & 4) != 0 ? null : str59, (i11 & 8) != 0 ? null : str60, (i11 & 16) != 0 ? null : str61, (i11 & 32) != 0 ? null : str62, (i11 & 64) != 0 ? null : str63, (i11 & 128) != 0 ? null : str64, (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str65, (i11 & 512) != 0 ? null : str66, (i11 & 1024) != 0 ? null : str67, (i11 & 2048) != 0 ? null : str68, (i11 & 4096) != 0 ? null : multiLoanInfo);
    }
}
