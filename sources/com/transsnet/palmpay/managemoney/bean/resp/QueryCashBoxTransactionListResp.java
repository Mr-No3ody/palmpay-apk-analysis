package com.transsnet.palmpay.managemoney.bean.resp;

import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PageDataBean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxTransactionListResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/core/bean/PageDataBean;", "Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxTransactionListResp$CashBoxTransaction;", "<init>", "(Lcom/transsnet/palmpay/core/bean/PageDataBean;)V", "getData", "()Lcom/transsnet/palmpay/core/bean/PageDataBean;", "CashBoxTransaction", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QueryCashBoxTransactionListResp extends CommonResult {

    @NotNull
    private final PageDataBean<CashBoxTransaction> data;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\\\b\u0086\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b!\u0010\"J\b\u0010Y\u001a\u00020\u0003H\u0016J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\u0007HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0005HÆ\u0003J\t\u0010d\u001a\u00020\u0005HÆ\u0003J\t\u0010e\u001a\u00020\u0007HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\u0007HÆ\u0003J\t\u0010h\u001a\u00020\u0007HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010o\u001a\u00020\u001bHÆ\u0003J\t\u0010p\u001a\u00020\u001dHÆ\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010QJ\u000b\u0010r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J®\u0002\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020\u001b2\b\u0010w\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010x\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010$R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010&\"\u0004\b1\u00102R\u001a\u0010\u0010\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010(\"\u0004\b4\u00105R\u001a\u0010\u0011\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010(\"\u0004\b7\u00105R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010(\"\u0004\b9\u00105R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010(\"\u0004\b;\u00105R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010$\"\u0004\b=\u0010>R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010$\"\u0004\b@\u0010>R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010$\"\u0004\bB\u0010>R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010$\"\u0004\bD\u0010>R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010$\"\u0004\bF\u0010>R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010$\"\u0004\bH\u0010>R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010I\"\u0004\bJ\u0010KR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010T\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010$\"\u0004\bV\u0010>R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010$\"\u0004\bX\u0010>¨\u0006y"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxTransactionListResp$CashBoxTransaction;", "", "transactionType", "", "transactionDirection", "", "amount", "", "gmtCreated", "payId", "orgTransactionType", "orgOrderNo", "transactionStatus", "transactionName", "operationType", "itemType", "inComeAmount", "payOutAmount", "startTime", "endTime", "redirect", "transType", "subTransType", "fundName", "fundId", "accountId", "isJump", "", "units", "", "balance", "customLinkH5", "customLinkAndroid", "<init>", "(Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getTransactionType", "()Ljava/lang/String;", "getTransactionDirection", "()I", "getAmount", "()J", "getGmtCreated", "getPayId", "getOrgTransactionType", "getOrgOrderNo", "getTransactionStatus", "getTransactionName", "getOperationType", "getItemType", "setItemType", "(I)V", "getInComeAmount", "setInComeAmount", "(J)V", "getPayOutAmount", "setPayOutAmount", "getStartTime", "setStartTime", "getEndTime", "setEndTime", "getRedirect", "setRedirect", "(Ljava/lang/String;)V", "getTransType", "setTransType", "getSubTransType", "setSubTransType", "getFundName", "setFundName", "getFundId", "setFundId", "getAccountId", "setAccountId", "()Z", "setJump", "(Z)V", "getUnits", "()D", "setUnits", "(D)V", "getBalance", "()Ljava/lang/Long;", "setBalance", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getCustomLinkH5", "setCustomLinkH5", "getCustomLinkAndroid", "setCustomLinkAndroid", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIJJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/managemoney/bean/resp/QueryCashBoxTransactionListResp$CashBoxTransaction;", "equals", "other", "hashCode", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CashBoxTransaction {

        @Nullable
        private String accountId;
        private final long amount;

        @Nullable
        private Long balance;

        @Nullable
        private String customLinkAndroid;

        @Nullable
        private String customLinkH5;
        private long endTime;

        @Nullable
        private String fundId;

        @Nullable
        private String fundName;
        private final long gmtCreated;
        private long inComeAmount;
        private boolean isJump;
        private int itemType;
        private final int operationType;

        @Nullable
        private final String orgOrderNo;

        @Nullable
        private final String orgTransactionType;

        @Nullable
        private final String payId;
        private long payOutAmount;

        @Nullable
        private String redirect;
        private long startTime;

        @Nullable
        private String subTransType;

        @Nullable
        private String transType;
        private final int transactionDirection;

        @Nullable
        private final String transactionName;
        private final int transactionStatus;

        @Nullable
        private final String transactionType;
        private double units;

        public CashBoxTransaction() {
            this(null, 0, 0L, 0L, null, null, null, 0, null, 0, 0, 0L, 0L, 0L, 0L, null, null, null, null, null, null, false, 0.0d, null, null, null, 67108863, null);
        }

        public static /* synthetic */ CashBoxTransaction copy$default(CashBoxTransaction cashBoxTransaction, String str, int i7, long j6, long j10, String str2, String str3, String str4, int i10, String str5, int i11, int i12, long j11, long j12, long j13, long j14, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3, double d2, Long l5, String str12, String str13, int i13, Object obj) {
            String str14;
            Long l6;
            String str15 = (i13 & 1) != 0 ? cashBoxTransaction.transactionType : str;
            int i14 = (i13 & 2) != 0 ? cashBoxTransaction.transactionDirection : i7;
            long j15 = (i13 & 4) != 0 ? cashBoxTransaction.amount : j6;
            long j16 = (i13 & 8) != 0 ? cashBoxTransaction.gmtCreated : j10;
            String str16 = (i13 & 16) != 0 ? cashBoxTransaction.payId : str2;
            String str17 = (i13 & 32) != 0 ? cashBoxTransaction.orgTransactionType : str3;
            String str18 = (i13 & 64) != 0 ? cashBoxTransaction.orgOrderNo : str4;
            int i15 = (i13 & 128) != 0 ? cashBoxTransaction.transactionStatus : i10;
            String str19 = (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cashBoxTransaction.transactionName : str5;
            int i16 = (i13 & 512) != 0 ? cashBoxTransaction.operationType : i11;
            int i17 = (i13 & 1024) != 0 ? cashBoxTransaction.itemType : i12;
            String str20 = str15;
            int i18 = i14;
            long j17 = (i13 & 2048) != 0 ? cashBoxTransaction.inComeAmount : j11;
            long j18 = (i13 & 4096) != 0 ? cashBoxTransaction.payOutAmount : j12;
            long j19 = (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? cashBoxTransaction.startTime : j13;
            long j20 = (i13 & 16384) != 0 ? cashBoxTransaction.endTime : j14;
            String str21 = (i13 & 32768) != 0 ? cashBoxTransaction.redirect : str6;
            String str22 = (i13 & 65536) != 0 ? cashBoxTransaction.transType : str7;
            long j21 = j20;
            String str23 = (i13 & 131072) != 0 ? cashBoxTransaction.subTransType : str8;
            String str24 = (i13 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? cashBoxTransaction.fundName : str9;
            String str25 = str23;
            String str26 = (i13 & 524288) != 0 ? cashBoxTransaction.fundId : str10;
            String str27 = (i13 & 1048576) != 0 ? cashBoxTransaction.accountId : str11;
            boolean z8 = (i13 & 2097152) != 0 ? cashBoxTransaction.isJump : z3;
            String str28 = str24;
            double d10 = (i13 & 4194304) != 0 ? cashBoxTransaction.units : d2;
            Long l8 = (i13 & 8388608) != 0 ? cashBoxTransaction.balance : l5;
            String str29 = (i13 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? cashBoxTransaction.customLinkH5 : str12;
            if ((i13 & 33554432) != 0) {
                l6 = l8;
                str14 = cashBoxTransaction.customLinkAndroid;
            } else {
                str14 = str13;
                l6 = l8;
            }
            return cashBoxTransaction.copy(str20, i18, j15, j16, str16, str17, str18, i15, str19, i16, i17, j17, j18, j19, j21, str21, str22, str25, str28, str26, str27, z8, d10, l6, str29, str14);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTransactionType() {
            return this.transactionType;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final int getOperationType() {
            return this.operationType;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final int getItemType() {
            return this.itemType;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final long getInComeAmount() {
            return this.inComeAmount;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final long getPayOutAmount() {
            return this.payOutAmount;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final long getStartTime() {
            return this.startTime;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final long getEndTime() {
            return this.endTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component16, reason: from getter */
        public final String getRedirect() {
            return this.redirect;
        }

        @Nullable
        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getTransType() {
            return this.transType;
        }

        @Nullable
        /* JADX INFO: renamed from: component18, reason: from getter */
        public final String getSubTransType() {
            return this.subTransType;
        }

        @Nullable
        /* JADX INFO: renamed from: component19, reason: from getter */
        public final String getFundName() {
            return this.fundName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getTransactionDirection() {
            return this.transactionDirection;
        }

        @Nullable
        /* JADX INFO: renamed from: component20, reason: from getter */
        public final String getFundId() {
            return this.fundId;
        }

        @Nullable
        /* JADX INFO: renamed from: component21, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component22, reason: from getter */
        public final boolean getIsJump() {
            return this.isJump;
        }

        /* JADX INFO: renamed from: component23, reason: from getter */
        public final double getUnits() {
            return this.units;
        }

        @Nullable
        /* JADX INFO: renamed from: component24, reason: from getter */
        public final Long getBalance() {
            return this.balance;
        }

        @Nullable
        /* JADX INFO: renamed from: component25, reason: from getter */
        public final String getCustomLinkH5() {
            return this.customLinkH5;
        }

        @Nullable
        /* JADX INFO: renamed from: component26, reason: from getter */
        public final String getCustomLinkAndroid() {
            return this.customLinkAndroid;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final long getGmtCreated() {
            return this.gmtCreated;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPayId() {
            return this.payId;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getOrgTransactionType() {
            return this.orgTransactionType;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getOrgOrderNo() {
            return this.orgOrderNo;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getTransactionStatus() {
            return this.transactionStatus;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getTransactionName() {
            return this.transactionName;
        }

        @NotNull
        public final CashBoxTransaction copy(@Nullable String transactionType, int transactionDirection, long amount, long gmtCreated, @Nullable String payId, @Nullable String orgTransactionType, @Nullable String orgOrderNo, int transactionStatus, @Nullable String transactionName, int operationType, int itemType, long inComeAmount, long payOutAmount, long startTime, long endTime, @Nullable String redirect, @Nullable String transType, @Nullable String subTransType, @Nullable String fundName, @Nullable String fundId, @Nullable String accountId, boolean isJump, double units, @Nullable Long balance, @Nullable String customLinkH5, @Nullable String customLinkAndroid) {
            return new CashBoxTransaction(transactionType, transactionDirection, amount, gmtCreated, payId, orgTransactionType, orgOrderNo, transactionStatus, transactionName, operationType, itemType, inComeAmount, payOutAmount, startTime, endTime, redirect, transType, subTransType, fundName, fundId, accountId, isJump, units, balance, customLinkH5, customLinkAndroid);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CashBoxTransaction)) {
                return false;
            }
            CashBoxTransaction cashBoxTransaction = (CashBoxTransaction) other;
            return Intrinsics.c(this.transactionType, cashBoxTransaction.transactionType) && this.transactionDirection == cashBoxTransaction.transactionDirection && this.amount == cashBoxTransaction.amount && this.gmtCreated == cashBoxTransaction.gmtCreated && Intrinsics.c(this.payId, cashBoxTransaction.payId) && Intrinsics.c(this.orgTransactionType, cashBoxTransaction.orgTransactionType) && Intrinsics.c(this.orgOrderNo, cashBoxTransaction.orgOrderNo) && this.transactionStatus == cashBoxTransaction.transactionStatus && Intrinsics.c(this.transactionName, cashBoxTransaction.transactionName) && this.operationType == cashBoxTransaction.operationType && this.itemType == cashBoxTransaction.itemType && this.inComeAmount == cashBoxTransaction.inComeAmount && this.payOutAmount == cashBoxTransaction.payOutAmount && this.startTime == cashBoxTransaction.startTime && this.endTime == cashBoxTransaction.endTime && Intrinsics.c(this.redirect, cashBoxTransaction.redirect) && Intrinsics.c(this.transType, cashBoxTransaction.transType) && Intrinsics.c(this.subTransType, cashBoxTransaction.subTransType) && Intrinsics.c(this.fundName, cashBoxTransaction.fundName) && Intrinsics.c(this.fundId, cashBoxTransaction.fundId) && Intrinsics.c(this.accountId, cashBoxTransaction.accountId) && this.isJump == cashBoxTransaction.isJump && Double.compare(this.units, cashBoxTransaction.units) == 0 && Intrinsics.c(this.balance, cashBoxTransaction.balance) && Intrinsics.c(this.customLinkH5, cashBoxTransaction.customLinkH5) && Intrinsics.c(this.customLinkAndroid, cashBoxTransaction.customLinkAndroid);
        }

        @Nullable
        public final String getAccountId() {
            return this.accountId;
        }

        public final long getAmount() {
            return this.amount;
        }

        @Nullable
        public final Long getBalance() {
            return this.balance;
        }

        @Nullable
        public final String getCustomLinkAndroid() {
            return this.customLinkAndroid;
        }

        @Nullable
        public final String getCustomLinkH5() {
            return this.customLinkH5;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final String getFundId() {
            return this.fundId;
        }

        @Nullable
        public final String getFundName() {
            return this.fundName;
        }

        public final long getGmtCreated() {
            return this.gmtCreated;
        }

        public final long getInComeAmount() {
            return this.inComeAmount;
        }

        public final int getItemType() {
            return this.itemType;
        }

        public final int getOperationType() {
            return this.operationType;
        }

        @Nullable
        public final String getOrgOrderNo() {
            return this.orgOrderNo;
        }

        @Nullable
        public final String getOrgTransactionType() {
            return this.orgTransactionType;
        }

        @Nullable
        public final String getPayId() {
            return this.payId;
        }

        public final long getPayOutAmount() {
            return this.payOutAmount;
        }

        @Nullable
        public final String getRedirect() {
            return this.redirect;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        @Nullable
        public final String getSubTransType() {
            return this.subTransType;
        }

        @Nullable
        public final String getTransType() {
            return this.transType;
        }

        public final int getTransactionDirection() {
            return this.transactionDirection;
        }

        @Nullable
        public final String getTransactionName() {
            return this.transactionName;
        }

        public final int getTransactionStatus() {
            return this.transactionStatus;
        }

        @Nullable
        public final String getTransactionType() {
            return this.transactionType;
        }

        public final double getUnits() {
            return this.units;
        }

        public int hashCode() {
            String str = this.transactionType;
            int iB = q0.b(q0.b(u.b(this.transactionDirection, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.amount), 31, this.gmtCreated);
            String str2 = this.payId;
            int iHashCode = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.orgTransactionType;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.orgOrderNo;
            int iB2 = u.b(this.transactionStatus, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
            String str5 = this.transactionName;
            int iB3 = q0.b(q0.b(q0.b(q0.b(u.b(this.itemType, u.b(this.operationType, (iB2 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31), 31, this.inComeAmount), 31, this.payOutAmount), 31, this.startTime), 31, this.endTime);
            String str6 = this.redirect;
            int iHashCode3 = (iB3 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.transType;
            int iHashCode4 = (iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.subTransType;
            int iHashCode5 = (iHashCode4 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.fundName;
            int iHashCode6 = (iHashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.fundId;
            int iHashCode7 = (iHashCode6 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.accountId;
            int iHashCode8 = (Double.hashCode(this.units) + u.d((iHashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31, 31, this.isJump)) * 31;
            Long l5 = this.balance;
            int iHashCode9 = (iHashCode8 + (l5 == null ? 0 : l5.hashCode())) * 31;
            String str12 = this.customLinkH5;
            int iHashCode10 = (iHashCode9 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.customLinkAndroid;
            return iHashCode10 + (str13 != null ? str13.hashCode() : 0);
        }

        public final boolean isJump() {
            return this.isJump;
        }

        public final void setAccountId(@Nullable String str) {
            this.accountId = str;
        }

        public final void setBalance(@Nullable Long l5) {
            this.balance = l5;
        }

        public final void setCustomLinkAndroid(@Nullable String str) {
            this.customLinkAndroid = str;
        }

        public final void setCustomLinkH5(@Nullable String str) {
            this.customLinkH5 = str;
        }

        public final void setEndTime(long j6) {
            this.endTime = j6;
        }

        public final void setFundId(@Nullable String str) {
            this.fundId = str;
        }

        public final void setFundName(@Nullable String str) {
            this.fundName = str;
        }

        public final void setInComeAmount(long j6) {
            this.inComeAmount = j6;
        }

        public final void setItemType(int i7) {
            this.itemType = i7;
        }

        public final void setJump(boolean z3) {
            this.isJump = z3;
        }

        public final void setPayOutAmount(long j6) {
            this.payOutAmount = j6;
        }

        public final void setRedirect(@Nullable String str) {
            this.redirect = str;
        }

        public final void setStartTime(long j6) {
            this.startTime = j6;
        }

        public final void setSubTransType(@Nullable String str) {
            this.subTransType = str;
        }

        public final void setTransType(@Nullable String str) {
            this.transType = str;
        }

        public final void setUnits(double d2) {
            this.units = d2;
        }

        @NotNull
        public String toString() {
            String str = this.transactionType;
            int i7 = this.transactionDirection;
            long j6 = this.amount;
            long j10 = this.gmtCreated;
            String str2 = this.payId;
            String str3 = this.orgTransactionType;
            int i10 = this.transactionStatus;
            String str4 = this.transactionName;
            int i11 = this.itemType;
            long j11 = this.inComeAmount;
            long j12 = this.payOutAmount;
            long j13 = this.startTime;
            long j14 = this.endTime;
            StringBuilder sb2 = new StringBuilder("CashBoxTransaction(transactionType=");
            sb2.append(str);
            sb2.append(", transactionDirection=");
            sb2.append(i7);
            sb2.append(", amount=");
            sb2.append(j6);
            u.v(sb2, ", gmtCreated=", j10, ", payId=");
            u.x(sb2, str2, ", orgTransactionType=", str3, ", transactionStatus=");
            sb2.append(i10);
            sb2.append(", transactionName=");
            sb2.append(str4);
            sb2.append(", itemType=");
            sb2.append(i11);
            sb2.append(", inComeAmount=");
            sb2.append(j11);
            u.v(sb2, ", payOutAmount=", j12, ", startTime=");
            sb2.append(j13);
            sb2.append(", endTime=");
            sb2.append(j14);
            sb2.append(")");
            return sb2.toString();
        }

        public CashBoxTransaction(@Nullable String str, int i7, long j6, long j10, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i10, @Nullable String str5, int i11, int i12, long j11, long j12, long j13, long j14, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, boolean z3, double d2, @Nullable Long l5, @Nullable String str12, @Nullable String str13) {
            this.transactionType = str;
            this.transactionDirection = i7;
            this.amount = j6;
            this.gmtCreated = j10;
            this.payId = str2;
            this.orgTransactionType = str3;
            this.orgOrderNo = str4;
            this.transactionStatus = i10;
            this.transactionName = str5;
            this.operationType = i11;
            this.itemType = i12;
            this.inComeAmount = j11;
            this.payOutAmount = j12;
            this.startTime = j13;
            this.endTime = j14;
            this.redirect = str6;
            this.transType = str7;
            this.subTransType = str8;
            this.fundName = str9;
            this.fundId = str10;
            this.accountId = str11;
            this.isJump = z3;
            this.units = d2;
            this.balance = l5;
            this.customLinkH5 = str12;
            this.customLinkAndroid = str13;
        }

        public /* synthetic */ CashBoxTransaction(String str, int i7, long j6, long j10, String str2, String str3, String str4, int i10, String str5, int i11, int i12, long j11, long j12, long j13, long j14, String str6, String str7, String str8, String str9, String str10, String str11, boolean z3, double d2, Long l5, String str12, String str13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i7, (i13 & 4) != 0 ? 0L : j6, (i13 & 8) == 0 ? j10 : 0L, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : str3, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? 0 : i10, (i13 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5, (i13 & 512) != 0 ? 0 : i11, (i13 & 1024) != 0 ? 0 : i12, (i13 & 2048) != 0 ? -1L : j11, (i13 & 4096) != 0 ? -1L : j12, (i13 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? -1L : j13, (i13 & 16384) == 0 ? j14 : -1L, (32768 & i13) != 0 ? null : str6, (i13 & 65536) != 0 ? null : str7, (i13 & 131072) != 0 ? null : str8, (i13 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? null : str9, (i13 & 524288) != 0 ? null : str10, (i13 & 1048576) != 0 ? null : str11, (i13 & 2097152) != 0 ? false : z3, (i13 & 4194304) != 0 ? 0.0d : d2, (i13 & 8388608) != 0 ? null : l5, (i13 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? null : str12, (i13 & 33554432) != 0 ? null : str13);
        }
    }

    public QueryCashBoxTransactionListResp(@NotNull PageDataBean<CashBoxTransaction> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    public final PageDataBean<CashBoxTransaction> getData() {
        return this.data;
    }
}
