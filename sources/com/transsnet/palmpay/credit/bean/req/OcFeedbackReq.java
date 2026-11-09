package com.transsnet.palmpay.credit.bean.req;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/OcFeedbackReq;", "", FirebaseAnalytics.Param.CONTENT, "", "feedbackImage", "feedbackType", "secondFeedbackType", "fullName", "mobileNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getFeedbackImage", "getFeedbackType", "getSecondFeedbackType", "getFullName", "getMobileNo", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcFeedbackReq {

    @Nullable
    private final String content;

    @Nullable
    private final String feedbackImage;

    @Nullable
    private final String feedbackType;

    @Nullable
    private final String fullName;

    @Nullable
    private final String mobileNo;

    @Nullable
    private final String secondFeedbackType;

    public OcFeedbackReq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.content = str;
        this.feedbackImage = str2;
        this.feedbackType = str3;
        this.secondFeedbackType = str4;
        this.fullName = str5;
        this.mobileNo = str6;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getFeedbackImage() {
        return this.feedbackImage;
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
    public final String getMobileNo() {
        return this.mobileNo;
    }

    @Nullable
    public final String getSecondFeedbackType() {
        return this.secondFeedbackType;
    }
}
