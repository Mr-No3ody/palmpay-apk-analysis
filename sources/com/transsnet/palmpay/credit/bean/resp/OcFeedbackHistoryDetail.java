package com.transsnet.palmpay.credit.bean.resp;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015¨\u0006&"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcFeedbackHistoryDetail;", "", FirebaseAnalytics.Param.CONTENT, "", "createTime", "", "feedbackImage", "feedbackType", "fullName", "id", "memberId", "mobileNo", "remark", "solverImage", "status", "", "updateTime", "feedbackNo", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getCreateTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFeedbackImage", "getFeedbackType", "getFullName", "getId", "getMemberId", "getMobileNo", "getRemark", "getSolverImage", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUpdateTime", "getFeedbackNo", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcFeedbackHistoryDetail {

    @Nullable
    private final String content;

    @Nullable
    private final Long createTime;

    @Nullable
    private final String feedbackImage;

    @Nullable
    private final String feedbackNo;

    @Nullable
    private final String feedbackType;

    @Nullable
    private final String fullName;

    @Nullable
    private final Long id;

    @Nullable
    private final String memberId;

    @Nullable
    private final String mobileNo;

    @Nullable
    private final String remark;

    @Nullable
    private final String solverImage;

    @Nullable
    private final Integer status;

    @Nullable
    private final Long updateTime;

    public OcFeedbackHistoryDetail(@Nullable String str, @Nullable Long l5, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l6, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num, @Nullable Long l8, @Nullable String str9) {
        this.content = str;
        this.createTime = l5;
        this.feedbackImage = str2;
        this.feedbackType = str3;
        this.fullName = str4;
        this.id = l6;
        this.memberId = str5;
        this.mobileNo = str6;
        this.remark = str7;
        this.solverImage = str8;
        this.status = num;
        this.updateTime = l8;
        this.feedbackNo = str9;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Long getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getFeedbackImage() {
        return this.feedbackImage;
    }

    @Nullable
    public final String getFeedbackNo() {
        return this.feedbackNo;
    }

    @Nullable
    public final String getFeedbackType() {
        return this.feedbackType;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getMobileNo() {
        return this.mobileNo;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getSolverImage() {
        return this.solverImage;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }
}
