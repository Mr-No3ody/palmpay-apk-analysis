package com.transsnet.palmpay.credit.bean.resp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u0002\n\u0002\b*\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u009c\u00012\u00020\u0001:\u0002\u009c\u0001Bõ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\n\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010+\u001a\u0004\u0018\u00010\r\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b.\u0010/B\u0011\b\u0016\u0012\u0006\u00100\u001a\u000201¢\u0006\u0004\b.\u00102J\u0018\u0010m\u001a\u00020n2\u0006\u00100\u001a\u0002012\u0006\u0010o\u001a\u00020\u0003H\u0016J\b\u0010p\u001a\u00020\u0003H\u0016J\u0010\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010v\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010x\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010@J\u0010\u0010y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010z\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0010\u0010~\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010@J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0011\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0011\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0012\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010QJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\u0011\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010QJ\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00104J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010@J\u0011\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u00107J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003JÆ\u0003\u0010\u0095\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0003\u0010\u0096\u0001J\u0016\u0010\u0097\u0001\u001a\u00020\u001e2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u0001HÖ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u009b\u0001\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b:\u00104R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b;\u00107R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\b>\u00104R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010A\u001a\u0004\bB\u0010@R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bC\u0010=R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bD\u0010=R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bE\u00107R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bF\u00104R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bG\u00107R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010A\u001a\u0004\bH\u0010@R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bI\u0010=R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bJ\u00107R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bK\u00104R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bL\u00107R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bM\u00104R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010R\u001a\u0004\bP\u0010QR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bS\u0010=R\u001e\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\bT\u00107\"\u0004\bU\u0010VR\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u0015\u0010#\u001a\u0004\u0018\u00010\u001e¢\u0006\n\n\u0002\u0010R\u001a\u0004\b[\u0010QR\u0015\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b\\\u00107R\u0015\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\b]\u00107R\u001e\u0010&\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010R\u001a\u0004\b^\u0010Q\"\u0004\b_\u0010`R\u0015\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\ba\u00107R\u001c\u0010(\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010=\"\u0004\bc\u0010dR\u001e\u0010)\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\be\u00104\"\u0004\bf\u0010gR\u0015\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u00105\u001a\u0004\bh\u00104R\u0015\u0010+\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010A\u001a\u0004\bi\u0010@R\u0015\u0010,\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u00108\u001a\u0004\bj\u00107R\u001c\u0010-\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010=\"\u0004\bl\u0010d¨\u0006\u009d\u0001"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "Landroid/os/Parcelable;", "id", "", "interest", "", "interestSum", "loanDays", "repaymentDate", "loanAccount", "", "interestDays", "interestRatio", "", "penaltyRatio", "prompt", "couponType", "discountInterestSum", "discountType", "originInterestSum", "originInterestRatio", "cardNo", "loanAmount", "loanTerm", "outstandingAmountSum", "productSubId", "repaymentPlanList", "", "Lcom/transsnet/palmpay/credit/bean/resp/RepaymentPlan;", "select", "", FirebaseAnalytics.Param.TERM, "couponId", FirebaseAnalytics.Param.COUPON, "Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;", "upperLimit", "serviceFeeSum", "serviceFee", "available", "managementFeeSum", "termSpanUnit", "termSpan", "reductionWay", "discountRatio", "stampDuty", "stampDutyText", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInterest", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInterestSum", "getLoanDays", "getRepaymentDate", "getLoanAccount", "()Ljava/lang/String;", "getInterestDays", "getInterestRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPenaltyRatio", "getPrompt", "getCouponType", "getDiscountInterestSum", "getDiscountType", "getOriginInterestSum", "getOriginInterestRatio", "getCardNo", "getLoanAmount", "getLoanTerm", "getOutstandingAmountSum", "getProductSubId", "getRepaymentPlanList", "()Ljava/util/List;", "getSelect", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTerm", "getCouponId", "setCouponId", "(Ljava/lang/Long;)V", "getCoupon", "()Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;", "setCoupon", "(Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;)V", "getUpperLimit", "getServiceFeeSum", "getServiceFee", "getAvailable", "setAvailable", "(Ljava/lang/Boolean;)V", "getManagementFeeSum", "getTermSpanUnit", "setTermSpanUnit", "(Ljava/lang/String;)V", "getTermSpan", "setTermSpan", "(Ljava/lang/Integer;)V", "getReductionWay", "getDiscountRatio", "getStampDuty", "getStampDutyText", "setStampDutyText", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;)Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "equals", "other", "", "hashCode", "toString", "CREATOR", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CLRepaymentPlanData implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Boolean available;

    @Nullable
    private final String cardNo;

    @Nullable
    private CLBorrowCouponData coupon;

    @Nullable
    private Long couponId;

    @Nullable
    private final String couponType;

    @Nullable
    private final Long discountInterestSum;

    @Nullable
    private final Double discountRatio;

    @Nullable
    private final Integer discountType;

    @Nullable
    private final Integer id;

    @Nullable
    private final Long interest;

    @Nullable
    private final Integer interestDays;

    @Nullable
    private final Double interestRatio;

    @Nullable
    private final Long interestSum;

    @Nullable
    private final String loanAccount;

    @Nullable
    private final Long loanAmount;

    @Nullable
    private final Integer loanDays;

    @Nullable
    private final Integer loanTerm;

    @Nullable
    private final Long managementFeeSum;

    @Nullable
    private final Double originInterestRatio;

    @Nullable
    private final Long originInterestSum;

    @Nullable
    private final Long outstandingAmountSum;

    @Nullable
    private final Double penaltyRatio;

    @Nullable
    private final Integer productSubId;

    @Nullable
    private final String prompt;

    @Nullable
    private final Integer reductionWay;

    @Nullable
    private final Long repaymentDate;

    @Nullable
    private final List<RepaymentPlan> repaymentPlanList;

    @Nullable
    private final Boolean select;

    @Nullable
    private final Long serviceFee;

    @Nullable
    private final Long serviceFeeSum;

    @Nullable
    private final Long stampDuty;

    @Nullable
    private String stampDutyText;

    @Nullable
    private final String term;

    @Nullable
    private Integer termSpan;

    @Nullable
    private String termSpanUnit;

    @Nullable
    private final Boolean upperLimit;

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/credit/bean/resp/CLRepaymentPlanData;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CLRepaymentPlanData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CLRepaymentPlanData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CLRepaymentPlanData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CLRepaymentPlanData[] newArray(int size) {
            return new CLRepaymentPlanData[size];
        }
    }

    public CLRepaymentPlanData(@Nullable Integer num, @Nullable Long l5, @Nullable Long l6, @Nullable Integer num2, @Nullable Long l8, @Nullable String str, @Nullable Integer num3, @Nullable Double d2, @Nullable Double d10, @Nullable String str2, @Nullable String str3, @Nullable Long l10, @Nullable Integer num4, @Nullable Long l11, @Nullable Double d11, @Nullable String str4, @Nullable Long l12, @Nullable Integer num5, @Nullable Long l13, @Nullable Integer num6, @Nullable List<RepaymentPlan> list, @Nullable Boolean bool, @Nullable String str5, @Nullable Long l14, @Nullable CLBorrowCouponData cLBorrowCouponData, @Nullable Boolean bool2, @Nullable Long l15, @Nullable Long l16, @Nullable Boolean bool3, @Nullable Long l17, @Nullable String str6, @Nullable Integer num7, @Nullable Integer num8, @Nullable Double d12, @Nullable Long l18, @Nullable String str7) {
        this.id = num;
        this.interest = l5;
        this.interestSum = l6;
        this.loanDays = num2;
        this.repaymentDate = l8;
        this.loanAccount = str;
        this.interestDays = num3;
        this.interestRatio = d2;
        this.penaltyRatio = d10;
        this.prompt = str2;
        this.couponType = str3;
        this.discountInterestSum = l10;
        this.discountType = num4;
        this.originInterestSum = l11;
        this.originInterestRatio = d11;
        this.cardNo = str4;
        this.loanAmount = l12;
        this.loanTerm = num5;
        this.outstandingAmountSum = l13;
        this.productSubId = num6;
        this.repaymentPlanList = list;
        this.select = bool;
        this.term = str5;
        this.couponId = l14;
        this.coupon = cLBorrowCouponData;
        this.upperLimit = bool2;
        this.serviceFeeSum = l15;
        this.serviceFee = l16;
        this.available = bool3;
        this.managementFeeSum = l17;
        this.termSpanUnit = str6;
        this.termSpan = num7;
        this.reductionWay = num8;
        this.discountRatio = d12;
        this.stampDuty = l18;
        this.stampDutyText = str7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CLRepaymentPlanData copy$default(CLRepaymentPlanData cLRepaymentPlanData, Integer num, Long l5, Long l6, Integer num2, Long l8, String str, Integer num3, Double d2, Double d10, String str2, String str3, Long l10, Integer num4, Long l11, Double d11, String str4, Long l12, Integer num5, Long l13, Integer num6, List list, Boolean bool, String str5, Long l14, CLBorrowCouponData cLBorrowCouponData, Boolean bool2, Long l15, Long l16, Boolean bool3, Long l17, String str6, Integer num7, Integer num8, Double d12, Long l18, String str7, int i7, int i10, Object obj) {
        String str8;
        Long l19;
        Integer num9 = (i7 & 1) != 0 ? cLRepaymentPlanData.id : num;
        Long l20 = (i7 & 2) != 0 ? cLRepaymentPlanData.interest : l5;
        Long l21 = (i7 & 4) != 0 ? cLRepaymentPlanData.interestSum : l6;
        Integer num10 = (i7 & 8) != 0 ? cLRepaymentPlanData.loanDays : num2;
        Long l22 = (i7 & 16) != 0 ? cLRepaymentPlanData.repaymentDate : l8;
        String str9 = (i7 & 32) != 0 ? cLRepaymentPlanData.loanAccount : str;
        Integer num11 = (i7 & 64) != 0 ? cLRepaymentPlanData.interestDays : num3;
        Double d13 = (i7 & 128) != 0 ? cLRepaymentPlanData.interestRatio : d2;
        Double d14 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cLRepaymentPlanData.penaltyRatio : d10;
        String str10 = (i7 & 512) != 0 ? cLRepaymentPlanData.prompt : str2;
        String str11 = (i7 & 1024) != 0 ? cLRepaymentPlanData.couponType : str3;
        Long l23 = (i7 & 2048) != 0 ? cLRepaymentPlanData.discountInterestSum : l10;
        Integer num12 = (i7 & 4096) != 0 ? cLRepaymentPlanData.discountType : num4;
        Long l24 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? cLRepaymentPlanData.originInterestSum : l11;
        Integer num13 = num9;
        Double d15 = (i7 & 16384) != 0 ? cLRepaymentPlanData.originInterestRatio : d11;
        String str12 = (i7 & 32768) != 0 ? cLRepaymentPlanData.cardNo : str4;
        Long l25 = (i7 & 65536) != 0 ? cLRepaymentPlanData.loanAmount : l12;
        Integer num14 = (i7 & 131072) != 0 ? cLRepaymentPlanData.loanTerm : num5;
        Long l26 = (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? cLRepaymentPlanData.outstandingAmountSum : l13;
        Integer num15 = (i7 & 524288) != 0 ? cLRepaymentPlanData.productSubId : num6;
        List list2 = (i7 & 1048576) != 0 ? cLRepaymentPlanData.repaymentPlanList : list;
        Boolean bool4 = (i7 & 2097152) != 0 ? cLRepaymentPlanData.select : bool;
        String str13 = (i7 & 4194304) != 0 ? cLRepaymentPlanData.term : str5;
        Long l27 = (i7 & 8388608) != 0 ? cLRepaymentPlanData.couponId : l14;
        CLBorrowCouponData cLBorrowCouponData2 = (i7 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? cLRepaymentPlanData.coupon : cLBorrowCouponData;
        Boolean bool5 = (i7 & 33554432) != 0 ? cLRepaymentPlanData.upperLimit : bool2;
        Long l28 = (i7 & 67108864) != 0 ? cLRepaymentPlanData.serviceFeeSum : l15;
        Long l29 = (i7 & 134217728) != 0 ? cLRepaymentPlanData.serviceFee : l16;
        Boolean bool6 = (i7 & 268435456) != 0 ? cLRepaymentPlanData.available : bool3;
        Long l30 = (i7 & 536870912) != 0 ? cLRepaymentPlanData.managementFeeSum : l17;
        String str14 = (i7 & 1073741824) != 0 ? cLRepaymentPlanData.termSpanUnit : str6;
        Integer num16 = (i7 & Integer.MIN_VALUE) != 0 ? cLRepaymentPlanData.termSpan : num7;
        Integer num17 = (i10 & 1) != 0 ? cLRepaymentPlanData.reductionWay : num8;
        Double d16 = (i10 & 2) != 0 ? cLRepaymentPlanData.discountRatio : d12;
        Long l31 = (i10 & 4) != 0 ? cLRepaymentPlanData.stampDuty : l18;
        if ((i10 & 8) != 0) {
            l19 = l31;
            str8 = cLRepaymentPlanData.stampDutyText;
        } else {
            str8 = str7;
            l19 = l31;
        }
        return cLRepaymentPlanData.copy(num13, l20, l21, num10, l22, str9, num11, d13, d14, str10, str11, l23, num12, l24, d15, str12, l25, num14, l26, num15, list2, bool4, str13, l27, cLBorrowCouponData2, bool5, l28, l29, bool6, l30, str14, num16, num17, d16, l19, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrompt() {
        return this.prompt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCouponType() {
        return this.couponType;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getDiscountInterestSum() {
        return this.discountInterestSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getDiscountType() {
        return this.discountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getOriginInterestSum() {
        return this.originInterestSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Double getOriginInterestRatio() {
        return this.originInterestRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getLoanTerm() {
        return this.loanTerm;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getOutstandingAmountSum() {
        return this.outstandingAmountSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getInterest() {
        return this.interest;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final List<RepaymentPlan> component21() {
        return this.repaymentPlanList;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Boolean getSelect() {
        return this.select;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getTerm() {
        return this.term;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final CLBorrowCouponData getCoupon() {
        return this.coupon;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final Boolean getUpperLimit() {
        return this.upperLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final Long getServiceFeeSum() {
        return this.serviceFeeSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final Long getServiceFee() {
        return this.serviceFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Boolean getAvailable() {
        return this.available;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getInterestSum() {
        return this.interestSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Long getManagementFeeSum() {
        return this.managementFeeSum;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final String getTermSpanUnit() {
        return this.termSpanUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final Integer getTermSpan() {
        return this.termSpan;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final Integer getReductionWay() {
        return this.reductionWay;
    }

    @Nullable
    /* JADX INFO: renamed from: component34, reason: from getter */
    public final Double getDiscountRatio() {
        return this.discountRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component35, reason: from getter */
    public final Long getStampDuty() {
        return this.stampDuty;
    }

    @Nullable
    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getStampDutyText() {
        return this.stampDutyText;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getLoanDays() {
        return this.loanDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLoanAccount() {
        return this.loanAccount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getInterestDays() {
        return this.interestDays;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getInterestRatio() {
        return this.interestRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Double getPenaltyRatio() {
        return this.penaltyRatio;
    }

    @NotNull
    public final CLRepaymentPlanData copy(@Nullable Integer id2, @Nullable Long interest, @Nullable Long interestSum, @Nullable Integer loanDays, @Nullable Long repaymentDate, @Nullable String loanAccount, @Nullable Integer interestDays, @Nullable Double interestRatio, @Nullable Double penaltyRatio, @Nullable String prompt, @Nullable String couponType, @Nullable Long discountInterestSum, @Nullable Integer discountType, @Nullable Long originInterestSum, @Nullable Double originInterestRatio, @Nullable String cardNo, @Nullable Long loanAmount, @Nullable Integer loanTerm, @Nullable Long outstandingAmountSum, @Nullable Integer productSubId, @Nullable List<RepaymentPlan> repaymentPlanList, @Nullable Boolean select, @Nullable String term, @Nullable Long couponId, @Nullable CLBorrowCouponData coupon, @Nullable Boolean upperLimit, @Nullable Long serviceFeeSum, @Nullable Long serviceFee, @Nullable Boolean available, @Nullable Long managementFeeSum, @Nullable String termSpanUnit, @Nullable Integer termSpan, @Nullable Integer reductionWay, @Nullable Double discountRatio, @Nullable Long stampDuty, @Nullable String stampDutyText) {
        return new CLRepaymentPlanData(id2, interest, interestSum, loanDays, repaymentDate, loanAccount, interestDays, interestRatio, penaltyRatio, prompt, couponType, discountInterestSum, discountType, originInterestSum, originInterestRatio, cardNo, loanAmount, loanTerm, outstandingAmountSum, productSubId, repaymentPlanList, select, term, couponId, coupon, upperLimit, serviceFeeSum, serviceFee, available, managementFeeSum, termSpanUnit, termSpan, reductionWay, discountRatio, stampDuty, stampDutyText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CLRepaymentPlanData)) {
            return false;
        }
        CLRepaymentPlanData cLRepaymentPlanData = (CLRepaymentPlanData) other;
        return Intrinsics.c(this.id, cLRepaymentPlanData.id) && Intrinsics.c(this.interest, cLRepaymentPlanData.interest) && Intrinsics.c(this.interestSum, cLRepaymentPlanData.interestSum) && Intrinsics.c(this.loanDays, cLRepaymentPlanData.loanDays) && Intrinsics.c(this.repaymentDate, cLRepaymentPlanData.repaymentDate) && Intrinsics.c(this.loanAccount, cLRepaymentPlanData.loanAccount) && Intrinsics.c(this.interestDays, cLRepaymentPlanData.interestDays) && Intrinsics.c(this.interestRatio, cLRepaymentPlanData.interestRatio) && Intrinsics.c(this.penaltyRatio, cLRepaymentPlanData.penaltyRatio) && Intrinsics.c(this.prompt, cLRepaymentPlanData.prompt) && Intrinsics.c(this.couponType, cLRepaymentPlanData.couponType) && Intrinsics.c(this.discountInterestSum, cLRepaymentPlanData.discountInterestSum) && Intrinsics.c(this.discountType, cLRepaymentPlanData.discountType) && Intrinsics.c(this.originInterestSum, cLRepaymentPlanData.originInterestSum) && Intrinsics.c(this.originInterestRatio, cLRepaymentPlanData.originInterestRatio) && Intrinsics.c(this.cardNo, cLRepaymentPlanData.cardNo) && Intrinsics.c(this.loanAmount, cLRepaymentPlanData.loanAmount) && Intrinsics.c(this.loanTerm, cLRepaymentPlanData.loanTerm) && Intrinsics.c(this.outstandingAmountSum, cLRepaymentPlanData.outstandingAmountSum) && Intrinsics.c(this.productSubId, cLRepaymentPlanData.productSubId) && Intrinsics.c(this.repaymentPlanList, cLRepaymentPlanData.repaymentPlanList) && Intrinsics.c(this.select, cLRepaymentPlanData.select) && Intrinsics.c(this.term, cLRepaymentPlanData.term) && Intrinsics.c(this.couponId, cLRepaymentPlanData.couponId) && Intrinsics.c(this.coupon, cLRepaymentPlanData.coupon) && Intrinsics.c(this.upperLimit, cLRepaymentPlanData.upperLimit) && Intrinsics.c(this.serviceFeeSum, cLRepaymentPlanData.serviceFeeSum) && Intrinsics.c(this.serviceFee, cLRepaymentPlanData.serviceFee) && Intrinsics.c(this.available, cLRepaymentPlanData.available) && Intrinsics.c(this.managementFeeSum, cLRepaymentPlanData.managementFeeSum) && Intrinsics.c(this.termSpanUnit, cLRepaymentPlanData.termSpanUnit) && Intrinsics.c(this.termSpan, cLRepaymentPlanData.termSpan) && Intrinsics.c(this.reductionWay, cLRepaymentPlanData.reductionWay) && Intrinsics.c(this.discountRatio, cLRepaymentPlanData.discountRatio) && Intrinsics.c(this.stampDuty, cLRepaymentPlanData.stampDuty) && Intrinsics.c(this.stampDutyText, cLRepaymentPlanData.stampDutyText);
    }

    @Nullable
    public final Boolean getAvailable() {
        return this.available;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final CLBorrowCouponData getCoupon() {
        return this.coupon;
    }

    @Nullable
    public final Long getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final String getCouponType() {
        return this.couponType;
    }

    @Nullable
    public final Long getDiscountInterestSum() {
        return this.discountInterestSum;
    }

    @Nullable
    public final Double getDiscountRatio() {
        return this.discountRatio;
    }

    @Nullable
    public final Integer getDiscountType() {
        return this.discountType;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Long getInterest() {
        return this.interest;
    }

    @Nullable
    public final Integer getInterestDays() {
        return this.interestDays;
    }

    @Nullable
    public final Double getInterestRatio() {
        return this.interestRatio;
    }

    @Nullable
    public final Long getInterestSum() {
        return this.interestSum;
    }

    @Nullable
    public final String getLoanAccount() {
        return this.loanAccount;
    }

    @Nullable
    public final Long getLoanAmount() {
        return this.loanAmount;
    }

    @Nullable
    public final Integer getLoanDays() {
        return this.loanDays;
    }

    @Nullable
    public final Integer getLoanTerm() {
        return this.loanTerm;
    }

    @Nullable
    public final Long getManagementFeeSum() {
        return this.managementFeeSum;
    }

    @Nullable
    public final Double getOriginInterestRatio() {
        return this.originInterestRatio;
    }

    @Nullable
    public final Long getOriginInterestSum() {
        return this.originInterestSum;
    }

    @Nullable
    public final Long getOutstandingAmountSum() {
        return this.outstandingAmountSum;
    }

    @Nullable
    public final Double getPenaltyRatio() {
        return this.penaltyRatio;
    }

    @Nullable
    public final Integer getProductSubId() {
        return this.productSubId;
    }

    @Nullable
    public final String getPrompt() {
        return this.prompt;
    }

    @Nullable
    public final Integer getReductionWay() {
        return this.reductionWay;
    }

    @Nullable
    public final Long getRepaymentDate() {
        return this.repaymentDate;
    }

    @Nullable
    public final List<RepaymentPlan> getRepaymentPlanList() {
        return this.repaymentPlanList;
    }

    @Nullable
    public final Boolean getSelect() {
        return this.select;
    }

    @Nullable
    public final Long getServiceFee() {
        return this.serviceFee;
    }

    @Nullable
    public final Long getServiceFeeSum() {
        return this.serviceFeeSum;
    }

    @Nullable
    public final Long getStampDuty() {
        return this.stampDuty;
    }

    @Nullable
    public final String getStampDutyText() {
        return this.stampDutyText;
    }

    @Nullable
    public final String getTerm() {
        return this.term;
    }

    @Nullable
    public final Integer getTermSpan() {
        return this.termSpan;
    }

    @Nullable
    public final String getTermSpanUnit() {
        return this.termSpanUnit;
    }

    @Nullable
    public final Boolean getUpperLimit() {
        return this.upperLimit;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l5 = this.interest;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.interestSum;
        int iHashCode3 = (iHashCode2 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Integer num2 = this.loanDays;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l8 = this.repaymentDate;
        int iHashCode5 = (iHashCode4 + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str = this.loanAccount;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.interestDays;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d2 = this.interestRatio;
        int iHashCode8 = (iHashCode7 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d10 = this.penaltyRatio;
        int iHashCode9 = (iHashCode8 + (d10 == null ? 0 : d10.hashCode())) * 31;
        String str2 = this.prompt;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.couponType;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l10 = this.discountInterestSum;
        int iHashCode12 = (iHashCode11 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num4 = this.discountType;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l11 = this.originInterestSum;
        int iHashCode14 = (iHashCode13 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Double d11 = this.originInterestRatio;
        int iHashCode15 = (iHashCode14 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str4 = this.cardNo;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.loanAmount;
        int iHashCode17 = (iHashCode16 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num5 = this.loanTerm;
        int iHashCode18 = (iHashCode17 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l13 = this.outstandingAmountSum;
        int iHashCode19 = (iHashCode18 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Integer num6 = this.productSubId;
        int iHashCode20 = (iHashCode19 + (num6 == null ? 0 : num6.hashCode())) * 31;
        List<RepaymentPlan> list = this.repaymentPlanList;
        int iHashCode21 = (iHashCode20 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.select;
        int iHashCode22 = (iHashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.term;
        int iHashCode23 = (iHashCode22 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l14 = this.couponId;
        int iHashCode24 = (iHashCode23 + (l14 == null ? 0 : l14.hashCode())) * 31;
        CLBorrowCouponData cLBorrowCouponData = this.coupon;
        int iHashCode25 = (iHashCode24 + (cLBorrowCouponData == null ? 0 : cLBorrowCouponData.hashCode())) * 31;
        Boolean bool2 = this.upperLimit;
        int iHashCode26 = (iHashCode25 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l15 = this.serviceFeeSum;
        int iHashCode27 = (iHashCode26 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.serviceFee;
        int iHashCode28 = (iHashCode27 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Boolean bool3 = this.available;
        int iHashCode29 = (iHashCode28 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l17 = this.managementFeeSum;
        int iHashCode30 = (iHashCode29 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str6 = this.termSpanUnit;
        int iHashCode31 = (iHashCode30 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num7 = this.termSpan;
        int iHashCode32 = (iHashCode31 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.reductionWay;
        int iHashCode33 = (iHashCode32 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Double d12 = this.discountRatio;
        int iHashCode34 = (iHashCode33 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Long l18 = this.stampDuty;
        int iHashCode35 = (iHashCode34 + (l18 == null ? 0 : l18.hashCode())) * 31;
        String str7 = this.stampDutyText;
        return iHashCode35 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAvailable(@Nullable Boolean bool) {
        this.available = bool;
    }

    public final void setCoupon(@Nullable CLBorrowCouponData cLBorrowCouponData) {
        this.coupon = cLBorrowCouponData;
    }

    public final void setCouponId(@Nullable Long l5) {
        this.couponId = l5;
    }

    public final void setStampDutyText(@Nullable String str) {
        this.stampDutyText = str;
    }

    public final void setTermSpan(@Nullable Integer num) {
        this.termSpan = num;
    }

    public final void setTermSpanUnit(@Nullable String str) {
        this.termSpanUnit = str;
    }

    @NotNull
    public String toString() {
        Integer num = this.id;
        Long l5 = this.interest;
        Long l6 = this.interestSum;
        Integer num2 = this.loanDays;
        Long l8 = this.repaymentDate;
        String str = this.loanAccount;
        Integer num3 = this.interestDays;
        Double d2 = this.interestRatio;
        Double d10 = this.penaltyRatio;
        String str2 = this.prompt;
        String str3 = this.couponType;
        Long l10 = this.discountInterestSum;
        Integer num4 = this.discountType;
        Long l11 = this.originInterestSum;
        Double d11 = this.originInterestRatio;
        String str4 = this.cardNo;
        Long l12 = this.loanAmount;
        Integer num5 = this.loanTerm;
        Long l13 = this.outstandingAmountSum;
        Integer num6 = this.productSubId;
        List<RepaymentPlan> list = this.repaymentPlanList;
        Boolean bool = this.select;
        String str5 = this.term;
        Long l14 = this.couponId;
        CLBorrowCouponData cLBorrowCouponData = this.coupon;
        Boolean bool2 = this.upperLimit;
        Long l15 = this.serviceFeeSum;
        Long l16 = this.serviceFee;
        Boolean bool3 = this.available;
        Long l17 = this.managementFeeSum;
        String str6 = this.termSpanUnit;
        Integer num7 = this.termSpan;
        Integer num8 = this.reductionWay;
        Double d12 = this.discountRatio;
        Long l18 = this.stampDuty;
        String str7 = this.stampDutyText;
        StringBuilder sb2 = new StringBuilder("CLRepaymentPlanData(id=");
        sb2.append(num);
        sb2.append(", interest=");
        sb2.append(l5);
        sb2.append(", interestSum=");
        sb2.append(l6);
        sb2.append(", loanDays=");
        sb2.append(num2);
        sb2.append(", repaymentDate=");
        sb2.append(l8);
        sb2.append(", loanAccount=");
        sb2.append(str);
        sb2.append(", interestDays=");
        sb2.append(num3);
        sb2.append(", interestRatio=");
        sb2.append(d2);
        sb2.append(", penaltyRatio=");
        sb2.append(d10);
        sb2.append(", prompt=");
        sb2.append(str2);
        sb2.append(", couponType=");
        sb2.append(str3);
        sb2.append(", discountInterestSum=");
        sb2.append(l10);
        sb2.append(", discountType=");
        sb2.append(num4);
        sb2.append(", originInterestSum=");
        sb2.append(l11);
        sb2.append(", originInterestRatio=");
        sb2.append(d11);
        sb2.append(", cardNo=");
        sb2.append(str4);
        sb2.append(", loanAmount=");
        sb2.append(l12);
        sb2.append(", loanTerm=");
        sb2.append(num5);
        sb2.append(", outstandingAmountSum=");
        sb2.append(l13);
        sb2.append(", productSubId=");
        sb2.append(num6);
        sb2.append(", repaymentPlanList=");
        sb2.append(list);
        sb2.append(", select=");
        sb2.append(bool);
        sb2.append(", term=");
        sb2.append(str5);
        sb2.append(", couponId=");
        sb2.append(l14);
        sb2.append(", coupon=");
        sb2.append(cLBorrowCouponData);
        sb2.append(", upperLimit=");
        sb2.append(bool2);
        sb2.append(", serviceFeeSum=");
        q0.w(sb2, l15, ", serviceFee=", l16, ", available=");
        sb2.append(bool3);
        sb2.append(", managementFeeSum=");
        sb2.append(l17);
        sb2.append(", termSpanUnit=");
        sb2.append(str6);
        sb2.append(", termSpan=");
        sb2.append(num7);
        sb2.append(", reductionWay=");
        sb2.append(num8);
        sb2.append(", discountRatio=");
        sb2.append(d12);
        sb2.append(", stampDuty=");
        sb2.append(l18);
        sb2.append(", stampDutyText=");
        sb2.append(str7);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.id);
        parcel.writeValue(this.interest);
        parcel.writeValue(this.interestSum);
        parcel.writeValue(this.loanDays);
        parcel.writeValue(this.repaymentDate);
        parcel.writeString(this.loanAccount);
        parcel.writeValue(this.interestDays);
        parcel.writeValue(this.interestRatio);
        parcel.writeValue(this.penaltyRatio);
        parcel.writeString(this.prompt);
        parcel.writeString(this.couponType);
        parcel.writeValue(this.discountInterestSum);
        parcel.writeValue(this.discountType);
        parcel.writeValue(this.originInterestSum);
        parcel.writeValue(this.originInterestRatio);
        parcel.writeString(this.cardNo);
        parcel.writeValue(this.loanAmount);
        parcel.writeValue(this.loanTerm);
        parcel.writeValue(this.outstandingAmountSum);
        parcel.writeValue(this.productSubId);
        parcel.writeTypedList(this.repaymentPlanList);
        parcel.writeValue(this.select);
        parcel.writeString(this.term);
        parcel.writeValue(this.couponId);
        parcel.writeParcelable(this.coupon, flags);
        parcel.writeValue(this.upperLimit);
        parcel.writeValue(this.serviceFeeSum);
        parcel.writeValue(this.serviceFee);
        parcel.writeValue(this.available);
        parcel.writeValue(this.managementFeeSum);
        parcel.writeString(this.termSpanUnit);
        parcel.writeValue(this.termSpan);
        parcel.writeValue(this.reductionWay);
        parcel.writeValue(this.discountRatio);
        parcel.writeValue(this.stampDuty);
        parcel.writeValue(this.stampDutyText);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CLRepaymentPlanData(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        Class cls2 = Long.TYPE;
        Object value2 = parcel.readValue(cls2.getClassLoader());
        Long l5 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls2.getClassLoader());
        Long l6 = value3 instanceof Long ? (Long) value3 : null;
        Object value4 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value4 instanceof Integer ? (Integer) value4 : null;
        Object value5 = parcel.readValue(cls2.getClassLoader());
        Long l8 = value5 instanceof Long ? (Long) value5 : null;
        String string = parcel.readString();
        Object value6 = parcel.readValue(cls.getClassLoader());
        Integer num3 = value6 instanceof Integer ? (Integer) value6 : null;
        Class cls3 = Double.TYPE;
        Object value7 = parcel.readValue(cls3.getClassLoader());
        Double d2 = value7 instanceof Double ? (Double) value7 : null;
        Object value8 = parcel.readValue(cls3.getClassLoader());
        Double d10 = value8 instanceof Double ? (Double) value8 : null;
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        Object value9 = parcel.readValue(cls2.getClassLoader());
        Long l10 = value9 instanceof Long ? (Long) value9 : null;
        Object value10 = parcel.readValue(cls.getClassLoader());
        Integer num4 = value10 instanceof Integer ? (Integer) value10 : null;
        Object value11 = parcel.readValue(cls2.getClassLoader());
        Long l11 = value11 instanceof Long ? (Long) value11 : null;
        Object value12 = parcel.readValue(cls3.getClassLoader());
        Long l12 = l11;
        Double d11 = value12 instanceof Double ? (Double) value12 : null;
        String string4 = parcel.readString();
        Object value13 = parcel.readValue(cls2.getClassLoader());
        Double d12 = d11;
        Long l13 = value13 instanceof Long ? (Long) value13 : null;
        Object value14 = parcel.readValue(cls.getClassLoader());
        Long l14 = l13;
        Integer num5 = value14 instanceof Integer ? (Integer) value14 : null;
        Object value15 = parcel.readValue(cls2.getClassLoader());
        Integer num6 = num5;
        Long l15 = value15 instanceof Long ? (Long) value15 : null;
        Object value16 = parcel.readValue(cls.getClassLoader());
        Long l16 = l15;
        Integer num7 = value16 instanceof Integer ? (Integer) value16 : null;
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(RepaymentPlan.INSTANCE);
        Class cls4 = Boolean.TYPE;
        Object value17 = parcel.readValue(cls4.getClassLoader());
        Integer num8 = num7;
        Boolean bool = value17 instanceof Boolean ? (Boolean) value17 : null;
        String string5 = parcel.readString();
        Boolean bool2 = bool;
        Object value18 = parcel.readValue(cls2.getClassLoader());
        Long l17 = value18 instanceof Long ? (Long) value18 : null;
        CLBorrowCouponData cLBorrowCouponData = (CLBorrowCouponData) parcel.readParcelable(CLBorrowCouponData.class.getClassLoader());
        Long l18 = l17;
        Object value19 = parcel.readValue(cls4.getClassLoader());
        Boolean bool3 = value19 instanceof Boolean ? (Boolean) value19 : null;
        Object value20 = parcel.readValue(cls2.getClassLoader());
        Boolean bool4 = bool3;
        Long l19 = value20 instanceof Long ? (Long) value20 : null;
        Object value21 = parcel.readValue(cls2.getClassLoader());
        Long l20 = l19;
        Long l21 = value21 instanceof Long ? (Long) value21 : null;
        Object value22 = parcel.readValue(cls4.getClassLoader());
        Long l22 = l21;
        Boolean bool5 = value22 instanceof Boolean ? (Boolean) value22 : null;
        Object value23 = parcel.readValue(cls2.getClassLoader());
        Boolean bool6 = bool5;
        Long l23 = value23 instanceof Long ? (Long) value23 : null;
        String string6 = parcel.readString();
        Object value24 = parcel.readValue(cls.getClassLoader());
        Long l24 = l23;
        Integer num9 = value24 instanceof Integer ? (Integer) value24 : null;
        Object value25 = parcel.readValue(cls.getClassLoader());
        Integer num10 = num9;
        Integer num11 = value25 instanceof Integer ? (Integer) value25 : null;
        Object value26 = parcel.readValue(cls3.getClassLoader());
        Double d13 = value26 instanceof Double ? (Double) value26 : null;
        Object value27 = parcel.readValue(cls2.getClassLoader());
        Long l25 = value27 instanceof Long ? (Long) value27 : null;
        Object value28 = parcel.readValue(String.class.getClassLoader());
        this(num, l5, l6, num2, l8, string, num3, d2, d10, string2, string3, l10, num4, l12, d12, string4, l14, num6, l16, num8, arrayListCreateTypedArrayList, bool2, string5, l18, cLBorrowCouponData, bool4, l20, l22, bool6, l24, string6, num10, num11, d13, l25, value28 instanceof String ? (String) value28 : null);
    }
}
