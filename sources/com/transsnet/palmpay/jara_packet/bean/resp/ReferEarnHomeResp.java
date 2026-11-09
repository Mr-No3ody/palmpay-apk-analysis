package com.transsnet.palmpay.jara_packet.bean.resp;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0002*+B\u0089\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0006\u0010&\u001a\u00020\u0017J\u0006\u0010'\u001a\u00020\u0017J\u0006\u0010(\u001a\u00020\u0017J\u0006\u0010)\u001a\u00020\u0017R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnHomeResp;", "Ljava/io/Serializable;", "actualAmt", "", "createTime", "endTime", "headPortrait", "", "topAmountBg", "id", "memberId", "memberName", "nextAmt", "nextUserCount", "phone", "remark", "inviteCode", "status", "targetAmt1", "targetAmt2", "targetAmt3", "updateTime", "upgradeFlag", "", "withdrawAmt", "shareEnable", "userCount1", "userCount2", "userCount3", "popover", "", "msg", "groupId", "cardContextDTOS", "", "Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnHomeResp$ReferEarnHomeCardBean;", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJJZJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/util/List;)V", "needShowDialog", "isDialog1Type", "isDialog2Type", "isDialog3Type", "Companion", "ReferEarnHomeCardBean", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReferEarnHomeResp implements Serializable {

    @NotNull
    public static final String ABTEST_GROUP_1 = "ABTEST_REpopwindow_1";

    @NotNull
    public static final String ABTEST_GROUP_2 = "ABTEST_REpopwindow_2";

    @NotNull
    public static final String ABTEST_GROUP_3 = "ABTEST_REpopwindow_3";

    @NotNull
    public static final String ABTEST_GROUP_4 = "ABTEST_REpopwindow_4";

    @JvmField
    public final long actualAmt;

    @JvmField
    @Nullable
    public List<ReferEarnHomeCardBean> cardContextDTOS;

    @JvmField
    public final long createTime;

    @JvmField
    public final long endTime;

    @JvmField
    @Nullable
    public String groupId;

    @JvmField
    @Nullable
    public final String headPortrait;

    @JvmField
    @Nullable
    public final String id;

    @JvmField
    @Nullable
    public final String inviteCode;

    @JvmField
    @Nullable
    public final String memberId;

    @JvmField
    @Nullable
    public final String memberName;

    @JvmField
    public long msg;

    @JvmField
    public final long nextAmt;

    @JvmField
    @Nullable
    public final String nextUserCount;

    @JvmField
    @Nullable
    public final String phone;

    @JvmField
    public int popover;

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
    @Nullable
    public final String topAmountBg;

    @JvmField
    public final long updateTime;

    @JvmField
    public final boolean upgradeFlag;

    @JvmField
    @Nullable
    public String userCount1;

    @JvmField
    @Nullable
    public String userCount2;

    @JvmField
    @Nullable
    public String userCount3;

    @JvmField
    public final long withdrawAmt;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/ReferEarnHomeResp$ReferEarnHomeCardBean;", "Ljava/io/Serializable;", "middleValue", "", "<init>", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReferEarnHomeCardBean implements Serializable {

        @JvmField
        @Nullable
        public Long middleValue;

        public ReferEarnHomeCardBean(@Nullable Long l5) {
            this.middleValue = l5;
        }
    }

    public ReferEarnHomeResp(long j6, long j10, long j11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j12, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, long j13, long j14, long j15, long j16, long j17, boolean z3, long j18, boolean z8, @Nullable String str10, @Nullable String str11, @Nullable String str12, int i7, long j19, @Nullable String str13, @Nullable List<ReferEarnHomeCardBean> list) {
        this.actualAmt = j6;
        this.createTime = j10;
        this.endTime = j11;
        this.headPortrait = str;
        this.topAmountBg = str2;
        this.id = str3;
        this.memberId = str4;
        this.memberName = str5;
        this.nextAmt = j12;
        this.nextUserCount = str6;
        this.phone = str7;
        this.remark = str8;
        this.inviteCode = str9;
        this.status = j13;
        this.targetAmt1 = j14;
        this.targetAmt2 = j15;
        this.targetAmt3 = j16;
        this.updateTime = j17;
        this.upgradeFlag = z3;
        this.withdrawAmt = j18;
        this.shareEnable = z8;
        this.userCount1 = str10;
        this.userCount2 = str11;
        this.userCount3 = str12;
        this.popover = i7;
        this.msg = j19;
        this.groupId = str13;
        this.cardContextDTOS = list;
    }

    public final boolean isDialog1Type() {
        String str = this.groupId;
        if (str != null) {
            return str.equals(ABTEST_GROUP_2);
        }
        return false;
    }

    public final boolean isDialog2Type() {
        String str = this.groupId;
        if (str != null) {
            return str.equals(ABTEST_GROUP_3);
        }
        return false;
    }

    public final boolean isDialog3Type() {
        String str = this.groupId;
        if (str != null) {
            return str.equals(ABTEST_GROUP_4);
        }
        return false;
    }

    public final boolean needShowDialog() {
        String str = this.groupId;
        if (str != null) {
            return str.equals(ABTEST_GROUP_2) || str.equals(ABTEST_GROUP_3) || str.equals(ABTEST_GROUP_4);
        }
        return false;
    }
}
