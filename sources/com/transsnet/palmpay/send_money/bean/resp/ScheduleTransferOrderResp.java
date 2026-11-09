package com.transsnet.palmpay.send_money.bean.resp;

import C0.G;
import N8.q0;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\bF\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010A\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008a\u0002\u0010K\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010LJ\u0013\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\u0007HÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b(\u0010\"R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b)\u0010\"R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b*\u0010\"R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b+\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b,\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010#\u001a\u0004\b-\u0010\"R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001dR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001d¨\u0006R"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferOrderResp;", "", "taskNo", "", "businessAmount", "", "taskType", "", "transferTime", "taskStartDate", "taskEndDate", "nextExecuteDate", "taskStatus", "type", "transferNum", "successNum", "residueNum", "payType", "scheduleNote", "payTypeDesc", "payeeIcon", "payeeName", "payeeBankNo", "payeeBankCode", "payeeBankName", "payeePhone", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTaskNo", "()Ljava/lang/String;", "getBusinessAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTaskType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTransferTime", "getTaskStartDate", "getTaskEndDate", "getNextExecuteDate", "getTaskStatus", "getType", "getTransferNum", "getSuccessNum", "getResidueNum", "getPayType", "getScheduleNote", "getPayTypeDesc", "getPayeeIcon", "getPayeeName", "getPayeeBankNo", "getPayeeBankCode", "getPayeeBankName", "getPayeePhone", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferOrderResp;", "equals", "", "other", "hashCode", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScheduleTransferOrderResp {

    @Nullable
    private final Long businessAmount;

    @Nullable
    private final Long nextExecuteDate;

    @Nullable
    private final Integer payType;

    @Nullable
    private final String payTypeDesc;

    @Nullable
    private final String payeeBankCode;

    @Nullable
    private final String payeeBankName;

    @Nullable
    private final String payeeBankNo;

    @Nullable
    private final String payeeIcon;

    @Nullable
    private final String payeeName;

    @Nullable
    private final String payeePhone;

    @Nullable
    private final Integer residueNum;

    @Nullable
    private final String scheduleNote;

    @Nullable
    private final Integer successNum;

    @Nullable
    private final Long taskEndDate;

    @Nullable
    private final String taskNo;

    @Nullable
    private final Long taskStartDate;

    @Nullable
    private final Integer taskStatus;

    @Nullable
    private final Integer taskType;

    @Nullable
    private final Integer transferNum;

    @Nullable
    private final Integer transferTime;

    @Nullable
    private final Integer type;

    public ScheduleTransferOrderResp(@Nullable String str, @Nullable Long l5, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable Integer num7, @Nullable Integer num8, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.taskNo = str;
        this.businessAmount = l5;
        this.taskType = num;
        this.transferTime = num2;
        this.taskStartDate = l6;
        this.taskEndDate = l8;
        this.nextExecuteDate = l10;
        this.taskStatus = num3;
        this.type = num4;
        this.transferNum = num5;
        this.successNum = num6;
        this.residueNum = num7;
        this.payType = num8;
        this.scheduleNote = str2;
        this.payTypeDesc = str3;
        this.payeeIcon = str4;
        this.payeeName = str5;
        this.payeeBankNo = str6;
        this.payeeBankCode = str7;
        this.payeeBankName = str8;
        this.payeePhone = str9;
    }

    public static /* synthetic */ ScheduleTransferOrderResp copy$default(ScheduleTransferOrderResp scheduleTransferOrderResp, String str, Long l5, Integer num, Integer num2, Long l6, Long l8, Long l10, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i7, Object obj) {
        String str10;
        String str11;
        String str12 = (i7 & 1) != 0 ? scheduleTransferOrderResp.taskNo : str;
        Long l11 = (i7 & 2) != 0 ? scheduleTransferOrderResp.businessAmount : l5;
        Integer num9 = (i7 & 4) != 0 ? scheduleTransferOrderResp.taskType : num;
        Integer num10 = (i7 & 8) != 0 ? scheduleTransferOrderResp.transferTime : num2;
        Long l12 = (i7 & 16) != 0 ? scheduleTransferOrderResp.taskStartDate : l6;
        Long l13 = (i7 & 32) != 0 ? scheduleTransferOrderResp.taskEndDate : l8;
        Long l14 = (i7 & 64) != 0 ? scheduleTransferOrderResp.nextExecuteDate : l10;
        Integer num11 = (i7 & 128) != 0 ? scheduleTransferOrderResp.taskStatus : num3;
        Integer num12 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? scheduleTransferOrderResp.type : num4;
        Integer num13 = (i7 & 512) != 0 ? scheduleTransferOrderResp.transferNum : num5;
        Integer num14 = (i7 & 1024) != 0 ? scheduleTransferOrderResp.successNum : num6;
        Integer num15 = (i7 & 2048) != 0 ? scheduleTransferOrderResp.residueNum : num7;
        Integer num16 = (i7 & 4096) != 0 ? scheduleTransferOrderResp.payType : num8;
        String str13 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? scheduleTransferOrderResp.scheduleNote : str2;
        String str14 = str12;
        String str15 = (i7 & 16384) != 0 ? scheduleTransferOrderResp.payTypeDesc : str3;
        String str16 = (i7 & 32768) != 0 ? scheduleTransferOrderResp.payeeIcon : str4;
        String str17 = (i7 & 65536) != 0 ? scheduleTransferOrderResp.payeeName : str5;
        String str18 = (i7 & 131072) != 0 ? scheduleTransferOrderResp.payeeBankNo : str6;
        String str19 = (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? scheduleTransferOrderResp.payeeBankCode : str7;
        String str20 = (i7 & 524288) != 0 ? scheduleTransferOrderResp.payeeBankName : str8;
        if ((i7 & 1048576) != 0) {
            str11 = str20;
            str10 = scheduleTransferOrderResp.payeePhone;
        } else {
            str10 = str9;
            str11 = str20;
        }
        return scheduleTransferOrderResp.copy(str14, l11, num9, num10, l12, l13, l14, num11, num12, num13, num14, num15, num16, str13, str15, str16, str17, str18, str19, str11, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskNo() {
        return this.taskNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getTransferNum() {
        return this.transferNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getSuccessNum() {
        return this.successNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getResidueNum() {
        return this.residueNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getPayType() {
        return this.payType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getScheduleNote() {
        return this.scheduleNote;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getPayTypeDesc() {
        return this.payTypeDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getPayeeIcon() {
        return this.payeeIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPayeeName() {
        return this.payeeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getPayeeBankNo() {
        return this.payeeBankNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getPayeeBankName() {
        return this.payeeBankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getPayeePhone() {
        return this.payeePhone;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTaskType() {
        return this.taskType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTransferTime() {
        return this.transferTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTaskStartDate() {
        return this.taskStartDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTaskEndDate() {
        return this.taskEndDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getNextExecuteDate() {
        return this.nextExecuteDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getTaskStatus() {
        return this.taskStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final ScheduleTransferOrderResp copy(@Nullable String taskNo, @Nullable Long businessAmount, @Nullable Integer taskType, @Nullable Integer transferTime, @Nullable Long taskStartDate, @Nullable Long taskEndDate, @Nullable Long nextExecuteDate, @Nullable Integer taskStatus, @Nullable Integer type, @Nullable Integer transferNum, @Nullable Integer successNum, @Nullable Integer residueNum, @Nullable Integer payType, @Nullable String scheduleNote, @Nullable String payTypeDesc, @Nullable String payeeIcon, @Nullable String payeeName, @Nullable String payeeBankNo, @Nullable String payeeBankCode, @Nullable String payeeBankName, @Nullable String payeePhone) {
        return new ScheduleTransferOrderResp(taskNo, businessAmount, taskType, transferTime, taskStartDate, taskEndDate, nextExecuteDate, taskStatus, type, transferNum, successNum, residueNum, payType, scheduleNote, payTypeDesc, payeeIcon, payeeName, payeeBankNo, payeeBankCode, payeeBankName, payeePhone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleTransferOrderResp)) {
            return false;
        }
        ScheduleTransferOrderResp scheduleTransferOrderResp = (ScheduleTransferOrderResp) other;
        return Intrinsics.c(this.taskNo, scheduleTransferOrderResp.taskNo) && Intrinsics.c(this.businessAmount, scheduleTransferOrderResp.businessAmount) && Intrinsics.c(this.taskType, scheduleTransferOrderResp.taskType) && Intrinsics.c(this.transferTime, scheduleTransferOrderResp.transferTime) && Intrinsics.c(this.taskStartDate, scheduleTransferOrderResp.taskStartDate) && Intrinsics.c(this.taskEndDate, scheduleTransferOrderResp.taskEndDate) && Intrinsics.c(this.nextExecuteDate, scheduleTransferOrderResp.nextExecuteDate) && Intrinsics.c(this.taskStatus, scheduleTransferOrderResp.taskStatus) && Intrinsics.c(this.type, scheduleTransferOrderResp.type) && Intrinsics.c(this.transferNum, scheduleTransferOrderResp.transferNum) && Intrinsics.c(this.successNum, scheduleTransferOrderResp.successNum) && Intrinsics.c(this.residueNum, scheduleTransferOrderResp.residueNum) && Intrinsics.c(this.payType, scheduleTransferOrderResp.payType) && Intrinsics.c(this.scheduleNote, scheduleTransferOrderResp.scheduleNote) && Intrinsics.c(this.payTypeDesc, scheduleTransferOrderResp.payTypeDesc) && Intrinsics.c(this.payeeIcon, scheduleTransferOrderResp.payeeIcon) && Intrinsics.c(this.payeeName, scheduleTransferOrderResp.payeeName) && Intrinsics.c(this.payeeBankNo, scheduleTransferOrderResp.payeeBankNo) && Intrinsics.c(this.payeeBankCode, scheduleTransferOrderResp.payeeBankCode) && Intrinsics.c(this.payeeBankName, scheduleTransferOrderResp.payeeBankName) && Intrinsics.c(this.payeePhone, scheduleTransferOrderResp.payeePhone);
    }

    @Nullable
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    public final Long getNextExecuteDate() {
        return this.nextExecuteDate;
    }

    @Nullable
    public final Integer getPayType() {
        return this.payType;
    }

    @Nullable
    public final String getPayTypeDesc() {
        return this.payTypeDesc;
    }

    @Nullable
    public final String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    @Nullable
    public final String getPayeeBankName() {
        return this.payeeBankName;
    }

    @Nullable
    public final String getPayeeBankNo() {
        return this.payeeBankNo;
    }

    @Nullable
    public final String getPayeeIcon() {
        return this.payeeIcon;
    }

    @Nullable
    public final String getPayeeName() {
        return this.payeeName;
    }

    @Nullable
    public final String getPayeePhone() {
        return this.payeePhone;
    }

    @Nullable
    public final Integer getResidueNum() {
        return this.residueNum;
    }

    @Nullable
    public final String getScheduleNote() {
        return this.scheduleNote;
    }

    @Nullable
    public final Integer getSuccessNum() {
        return this.successNum;
    }

    @Nullable
    public final Long getTaskEndDate() {
        return this.taskEndDate;
    }

    @Nullable
    public final String getTaskNo() {
        return this.taskNo;
    }

    @Nullable
    public final Long getTaskStartDate() {
        return this.taskStartDate;
    }

    @Nullable
    public final Integer getTaskStatus() {
        return this.taskStatus;
    }

    @Nullable
    public final Integer getTaskType() {
        return this.taskType;
    }

    @Nullable
    public final Integer getTransferNum() {
        return this.transferNum;
    }

    @Nullable
    public final Integer getTransferTime() {
        return this.transferTime;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.taskNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l5 = this.businessAmount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num = this.taskType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.transferTime;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l6 = this.taskStartDate;
        int iHashCode5 = (iHashCode4 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.taskEndDate;
        int iHashCode6 = (iHashCode5 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.nextExecuteDate;
        int iHashCode7 = (iHashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num3 = this.taskStatus;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.type;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.transferNum;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.successNum;
        int iHashCode11 = (iHashCode10 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.residueNum;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.payType;
        int iHashCode13 = (iHashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str2 = this.scheduleNote;
        int iHashCode14 = (iHashCode13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payTypeDesc;
        int iHashCode15 = (iHashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payeeIcon;
        int iHashCode16 = (iHashCode15 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payeeName;
        int iHashCode17 = (iHashCode16 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payeeBankNo;
        int iHashCode18 = (iHashCode17 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payeeBankCode;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.payeeBankName;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.payeePhone;
        return iHashCode20 + (str9 != null ? str9.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.taskNo;
        Long l5 = this.businessAmount;
        Integer num = this.taskType;
        Integer num2 = this.transferTime;
        Long l6 = this.taskStartDate;
        Long l8 = this.taskEndDate;
        Long l10 = this.nextExecuteDate;
        Integer num3 = this.taskStatus;
        Integer num4 = this.type;
        Integer num5 = this.transferNum;
        Integer num6 = this.successNum;
        Integer num7 = this.residueNum;
        Integer num8 = this.payType;
        String str2 = this.scheduleNote;
        String str3 = this.payTypeDesc;
        String str4 = this.payeeIcon;
        String str5 = this.payeeName;
        String str6 = this.payeeBankNo;
        String str7 = this.payeeBankCode;
        String str8 = this.payeeBankName;
        String str9 = this.payeePhone;
        StringBuilder sb2 = new StringBuilder("ScheduleTransferOrderResp(taskNo=");
        sb2.append(str);
        sb2.append(", businessAmount=");
        sb2.append(l5);
        sb2.append(", taskType=");
        sb2.append(num);
        sb2.append(", transferTime=");
        sb2.append(num2);
        sb2.append(", taskStartDate=");
        q0.w(sb2, l6, ", taskEndDate=", l8, ", nextExecuteDate=");
        sb2.append(l10);
        sb2.append(", taskStatus=");
        sb2.append(num3);
        sb2.append(", type=");
        sb2.append(num4);
        sb2.append(", transferNum=");
        sb2.append(num5);
        sb2.append(", successNum=");
        sb2.append(num6);
        sb2.append(", residueNum=");
        sb2.append(num7);
        sb2.append(", payType=");
        sb2.append(num8);
        sb2.append(", scheduleNote=");
        sb2.append(str2);
        sb2.append(", payTypeDesc=");
        u.x(sb2, str3, ", payeeIcon=", str4, ", payeeName=");
        u.x(sb2, str5, ", payeeBankNo=", str6, ", payeeBankCode=");
        u.x(sb2, str7, ", payeeBankName=", str8, ", payeePhone=");
        return G.r(sb2, str9, ")");
    }
}
