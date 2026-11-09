package com.transsnet.palmpay.credit.bean.req;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/req/CLComparePhotoData;", "", "failTimes", "", "threshold", "faceOptFirstThreshold", "faceOptSecondThreshold", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFailTimes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getThreshold", "getFaceOptFirstThreshold", "getFaceOptSecondThreshold", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLComparePhotoData {

    @Nullable
    private final Integer faceOptFirstThreshold;

    @Nullable
    private final Integer faceOptSecondThreshold;

    @Nullable
    private final Integer failTimes;

    @Nullable
    private final Integer threshold;

    public CLComparePhotoData(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.failTimes = num;
        this.threshold = num2;
        this.faceOptFirstThreshold = num3;
        this.faceOptSecondThreshold = num4;
    }

    @Nullable
    public final Integer getFaceOptFirstThreshold() {
        return this.faceOptFirstThreshold;
    }

    @Nullable
    public final Integer getFaceOptSecondThreshold() {
        return this.faceOptSecondThreshold;
    }

    @Nullable
    public final Integer getFailTimes() {
        return this.failTimes;
    }

    @Nullable
    public final Integer getThreshold() {
        return this.threshold;
    }
}
