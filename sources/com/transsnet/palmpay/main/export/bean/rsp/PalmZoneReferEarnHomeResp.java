package com.transsnet.palmpay.main.export.bean.rsp;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0019B\u0093\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneReferEarnHomeResp;", "Ljava/io/Serializable;", "actualAmt", "", "createTime", "endTime", "id", "", "phone", "remark", "status", "targetAmt1", "targetAmt2", "targetAmt3", "updateTime", "shareEnable", "", "userCount1", "userCount2", "userCount3", "msg", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "isSingleLevelReward", "hasValidCardData", "PalmZoneReferEarnHomeCardBean", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalmZoneReferEarnHomeResp implements Serializable {

    @JvmField
    public final long actualAmt;

    @JvmField
    public final long createTime;

    @JvmField
    public final long endTime;

    @JvmField
    @Nullable
    public final String id;

    @JvmField
    public long msg;

    @JvmField
    @Nullable
    public final String phone;

    @JvmField
    @Nullable
    public final String remark;

    @JvmField
    public final boolean shareEnable;

    @JvmField
    public final long status;

    @JvmField
    public final long targetAmt1;

    @JvmField
    public final long targetAmt2;

    @JvmField
    public final long targetAmt3;

    @JvmField
    public final long updateTime;

    @JvmField
    @Nullable
    public String userCount1;

    @JvmField
    @Nullable
    public String userCount2;

    @JvmField
    @Nullable
    public String userCount3;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/main/export/bean/rsp/PalmZoneReferEarnHomeResp$PalmZoneReferEarnHomeCardBean;", "Ljava/io/Serializable;", "middleValue", "", "<init>", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "module_main_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PalmZoneReferEarnHomeCardBean implements Serializable {

        @JvmField
        @Nullable
        public Long middleValue;

        public PalmZoneReferEarnHomeCardBean(@Nullable Long l5) {
            this.middleValue = l5;
        }
    }

    public PalmZoneReferEarnHomeResp(long j6, long j10, long j11, @Nullable String str, @Nullable String str2, @Nullable String str3, long j12, long j13, long j14, long j15, long j16, boolean z3, @Nullable String str4, @Nullable String str5, @Nullable String str6, long j17) {
        this.actualAmt = j6;
        this.createTime = j10;
        this.endTime = j11;
        this.id = str;
        this.phone = str2;
        this.remark = str3;
        this.status = j12;
        this.targetAmt1 = j13;
        this.targetAmt2 = j14;
        this.targetAmt3 = j15;
        this.updateTime = j16;
        this.shareEnable = z3;
        this.userCount1 = str4;
        this.userCount2 = str5;
        this.userCount3 = str6;
        this.msg = j17;
    }

    public final boolean hasValidCardData() {
        String str = this.id;
        return !(str == null || str.length() == 0);
    }

    public final boolean isSingleLevelReward() {
        return this.targetAmt2 == 0 || this.targetAmt3 == 0;
    }
}
