package com.transsnet.palmpay.send_money.bean.resp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 R2\u00020\u0001:\u0001RB£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0012\u0010\u0016J\u0018\u00109\u001a\u00020:2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010;\u001a\u00020\u0003H\u0016J\b\u0010<\u001a\u00020\u0003H\u0016J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010@\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010C\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001dJª\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\u0003HÖ\u0001J\t\u0010Q\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010$\"\u0004\b0\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b7\u0010\u001d\"\u0004\b8\u0010\u001f¨\u0006S"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferCreateResp;", "Landroid/os/Parcelable;", "type", "", "businessAmount", "", "taskType", "taskNo", "", "transferNum", "taskStartDate", "payeeName", "payeeIcon", "payeePhone", "payeeBankNo", "payeeBankName", "payeeBankCode", "nextExecuteDate", "<init>", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBusinessAmount", "()Ljava/lang/Long;", "setBusinessAmount", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTaskType", "setTaskType", "getTaskNo", "()Ljava/lang/String;", "setTaskNo", "(Ljava/lang/String;)V", "getTransferNum", "setTransferNum", "getTaskStartDate", "setTaskStartDate", "getPayeeName", "setPayeeName", "getPayeeIcon", "setPayeeIcon", "getPayeePhone", "setPayeePhone", "getPayeeBankNo", "setPayeeBankNo", "getPayeeBankName", "setPayeeBankName", "getPayeeBankCode", "setPayeeBankCode", "getNextExecuteDate", "setNextExecuteDate", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferCreateResp;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScheduleTransferCreateResp implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Long businessAmount;

    @Nullable
    private Long nextExecuteDate;

    @Nullable
    private String payeeBankCode;

    @Nullable
    private String payeeBankName;

    @Nullable
    private String payeeBankNo;

    @Nullable
    private String payeeIcon;

    @Nullable
    private String payeeName;

    @Nullable
    private String payeePhone;

    @Nullable
    private String taskNo;

    @Nullable
    private Long taskStartDate;

    @Nullable
    private Integer taskType;

    @Nullable
    private Integer transferNum;

    @Nullable
    private Integer type;

    /* JADX INFO: renamed from: com.transsnet.palmpay.send_money.bean.resp.ScheduleTransferCreateResp$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferCreateResp$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferCreateResp;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/send_money/bean/resp/ScheduleTransferCreateResp;", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ScheduleTransferCreateResp> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ScheduleTransferCreateResp createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScheduleTransferCreateResp(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ScheduleTransferCreateResp[] newArray(int size) {
            return new ScheduleTransferCreateResp[size];
        }
    }

    public ScheduleTransferCreateResp() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ ScheduleTransferCreateResp copy$default(ScheduleTransferCreateResp scheduleTransferCreateResp, Integer num, Long l5, Integer num2, String str, Integer num3, Long l6, String str2, String str3, String str4, String str5, String str6, String str7, Long l8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            num = scheduleTransferCreateResp.type;
        }
        return scheduleTransferCreateResp.copy(num, (i7 & 2) != 0 ? scheduleTransferCreateResp.businessAmount : l5, (i7 & 4) != 0 ? scheduleTransferCreateResp.taskType : num2, (i7 & 8) != 0 ? scheduleTransferCreateResp.taskNo : str, (i7 & 16) != 0 ? scheduleTransferCreateResp.transferNum : num3, (i7 & 32) != 0 ? scheduleTransferCreateResp.taskStartDate : l6, (i7 & 64) != 0 ? scheduleTransferCreateResp.payeeName : str2, (i7 & 128) != 0 ? scheduleTransferCreateResp.payeeIcon : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? scheduleTransferCreateResp.payeePhone : str4, (i7 & 512) != 0 ? scheduleTransferCreateResp.payeeBankNo : str5, (i7 & 1024) != 0 ? scheduleTransferCreateResp.payeeBankName : str6, (i7 & 2048) != 0 ? scheduleTransferCreateResp.payeeBankCode : str7, (i7 & 4096) != 0 ? scheduleTransferCreateResp.nextExecuteDate : l8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPayeeBankNo() {
        return this.payeeBankNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPayeeBankName() {
        return this.payeeBankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPayeeBankCode() {
        return this.payeeBankCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getNextExecuteDate() {
        return this.nextExecuteDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getBusinessAmount() {
        return this.businessAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTaskType() {
        return this.taskType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTaskNo() {
        return this.taskNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTransferNum() {
        return this.transferNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getTaskStartDate() {
        return this.taskStartDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayeeName() {
        return this.payeeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPayeeIcon() {
        return this.payeeIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPayeePhone() {
        return this.payeePhone;
    }

    @NotNull
    public final ScheduleTransferCreateResp copy(@Nullable Integer type, @Nullable Long businessAmount, @Nullable Integer taskType, @Nullable String taskNo, @Nullable Integer transferNum, @Nullable Long taskStartDate, @Nullable String payeeName, @Nullable String payeeIcon, @Nullable String payeePhone, @Nullable String payeeBankNo, @Nullable String payeeBankName, @Nullable String payeeBankCode, @Nullable Long nextExecuteDate) {
        return new ScheduleTransferCreateResp(type, businessAmount, taskType, taskNo, transferNum, taskStartDate, payeeName, payeeIcon, payeePhone, payeeBankNo, payeeBankName, payeeBankCode, nextExecuteDate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleTransferCreateResp)) {
            return false;
        }
        ScheduleTransferCreateResp scheduleTransferCreateResp = (ScheduleTransferCreateResp) other;
        return Intrinsics.c(this.type, scheduleTransferCreateResp.type) && Intrinsics.c(this.businessAmount, scheduleTransferCreateResp.businessAmount) && Intrinsics.c(this.taskType, scheduleTransferCreateResp.taskType) && Intrinsics.c(this.taskNo, scheduleTransferCreateResp.taskNo) && Intrinsics.c(this.transferNum, scheduleTransferCreateResp.transferNum) && Intrinsics.c(this.taskStartDate, scheduleTransferCreateResp.taskStartDate) && Intrinsics.c(this.payeeName, scheduleTransferCreateResp.payeeName) && Intrinsics.c(this.payeeIcon, scheduleTransferCreateResp.payeeIcon) && Intrinsics.c(this.payeePhone, scheduleTransferCreateResp.payeePhone) && Intrinsics.c(this.payeeBankNo, scheduleTransferCreateResp.payeeBankNo) && Intrinsics.c(this.payeeBankName, scheduleTransferCreateResp.payeeBankName) && Intrinsics.c(this.payeeBankCode, scheduleTransferCreateResp.payeeBankCode) && Intrinsics.c(this.nextExecuteDate, scheduleTransferCreateResp.nextExecuteDate);
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
    public final String getTaskNo() {
        return this.taskNo;
    }

    @Nullable
    public final Long getTaskStartDate() {
        return this.taskStartDate;
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
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l5 = this.businessAmount;
        int iHashCode2 = (iHashCode + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num2 = this.taskType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.taskNo;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.transferNum;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l6 = this.taskStartDate;
        int iHashCode6 = (iHashCode5 + (l6 == null ? 0 : l6.hashCode())) * 31;
        String str2 = this.payeeName;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payeeIcon;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.payeePhone;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.payeeBankNo;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payeeBankName;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payeeBankCode;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l8 = this.nextExecuteDate;
        return iHashCode12 + (l8 != null ? l8.hashCode() : 0);
    }

    public final void setBusinessAmount(@Nullable Long l5) {
        this.businessAmount = l5;
    }

    public final void setNextExecuteDate(@Nullable Long l5) {
        this.nextExecuteDate = l5;
    }

    public final void setPayeeBankCode(@Nullable String str) {
        this.payeeBankCode = str;
    }

    public final void setPayeeBankName(@Nullable String str) {
        this.payeeBankName = str;
    }

    public final void setPayeeBankNo(@Nullable String str) {
        this.payeeBankNo = str;
    }

    public final void setPayeeIcon(@Nullable String str) {
        this.payeeIcon = str;
    }

    public final void setPayeeName(@Nullable String str) {
        this.payeeName = str;
    }

    public final void setPayeePhone(@Nullable String str) {
        this.payeePhone = str;
    }

    public final void setTaskNo(@Nullable String str) {
        this.taskNo = str;
    }

    public final void setTaskStartDate(@Nullable Long l5) {
        this.taskStartDate = l5;
    }

    public final void setTaskType(@Nullable Integer num) {
        this.taskType = num;
    }

    public final void setTransferNum(@Nullable Integer num) {
        this.transferNum = num;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        Integer num = this.type;
        Long l5 = this.businessAmount;
        Integer num2 = this.taskType;
        String str = this.taskNo;
        Integer num3 = this.transferNum;
        Long l6 = this.taskStartDate;
        String str2 = this.payeeName;
        String str3 = this.payeeIcon;
        String str4 = this.payeePhone;
        String str5 = this.payeeBankNo;
        String str6 = this.payeeBankName;
        String str7 = this.payeeBankCode;
        Long l8 = this.nextExecuteDate;
        StringBuilder sb2 = new StringBuilder("ScheduleTransferCreateResp(type=");
        sb2.append(num);
        sb2.append(", businessAmount=");
        sb2.append(l5);
        sb2.append(", taskType=");
        sb2.append(num2);
        sb2.append(", taskNo=");
        sb2.append(str);
        sb2.append(", transferNum=");
        sb2.append(num3);
        sb2.append(", taskStartDate=");
        sb2.append(l6);
        sb2.append(", payeeName=");
        u.x(sb2, str2, ", payeeIcon=", str3, ", payeePhone=");
        u.x(sb2, str4, ", payeeBankNo=", str5, ", payeeBankName=");
        u.x(sb2, str6, ", payeeBankCode=", str7, ", nextExecuteDate=");
        sb2.append(l8);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.type);
        parcel.writeValue(this.businessAmount);
        parcel.writeValue(this.taskType);
        parcel.writeString(this.taskNo);
        parcel.writeValue(this.transferNum);
        parcel.writeValue(this.taskStartDate);
        parcel.writeString(this.payeeName);
        parcel.writeString(this.payeeIcon);
        parcel.writeString(this.payeePhone);
        parcel.writeString(this.payeeBankNo);
        parcel.writeString(this.payeeBankName);
        parcel.writeString(this.payeeBankCode);
        parcel.writeValue(this.nextExecuteDate);
    }

    public ScheduleTransferCreateResp(@Nullable Integer num, @Nullable Long l5, @Nullable Integer num2, @Nullable String str, @Nullable Integer num3, @Nullable Long l6, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Long l8) {
        this.type = num;
        this.businessAmount = l5;
        this.taskType = num2;
        this.taskNo = str;
        this.transferNum = num3;
        this.taskStartDate = l6;
        this.payeeName = str2;
        this.payeeIcon = str3;
        this.payeePhone = str4;
        this.payeeBankNo = str5;
        this.payeeBankName = str6;
        this.payeeBankCode = str7;
        this.nextExecuteDate = l8;
    }

    public /* synthetic */ ScheduleTransferCreateResp(Integer num, Long l5, Integer num2, String str, Integer num3, Long l6, String str2, String str3, String str4, String str5, String str6, String str7, Long l8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : num, (i7 & 2) != 0 ? null : l5, (i7 & 4) != 0 ? null : num2, (i7 & 8) != 0 ? null : str, (i7 & 16) != 0 ? null : num3, (i7 & 32) != 0 ? null : l6, (i7 & 64) != 0 ? null : str2, (i7 & 128) != 0 ? null : str3, (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4, (i7 & 512) != 0 ? null : str5, (i7 & 1024) != 0 ? null : str6, (i7 & 2048) != 0 ? null : str7, (i7 & 4096) != 0 ? null : l8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ScheduleTransferCreateResp(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Integer.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Integer num = value instanceof Integer ? (Integer) value : null;
        Class cls2 = Long.TYPE;
        Object value2 = parcel.readValue(cls2.getClassLoader());
        Long l5 = value2 instanceof Long ? (Long) value2 : null;
        Object value3 = parcel.readValue(cls.getClassLoader());
        Integer num2 = value3 instanceof Integer ? (Integer) value3 : null;
        String string = parcel.readString();
        Object value4 = parcel.readValue(cls.getClassLoader());
        Integer num3 = value4 instanceof Integer ? (Integer) value4 : null;
        Object value5 = parcel.readValue(cls2.getClassLoader());
        Long l6 = value5 instanceof Long ? (Long) value5 : null;
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        Object value6 = parcel.readValue(cls2.getClassLoader());
        this(num, l5, num2, string, num3, l6, string2, string3, string4, string5, string6, string7, value6 instanceof Long ? (Long) value6 : null);
    }
}
