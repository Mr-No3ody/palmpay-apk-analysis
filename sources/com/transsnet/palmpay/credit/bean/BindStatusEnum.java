package com.transsnet.palmpay.credit.bean;

import com.facebook.imagepipeline.nativecode.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/BindStatusEnum;", "", "statusCode", "", "desc", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getStatusCode", "()I", "getDesc", "()Ljava/lang/String;", "BING_NO_EXIST", "UNBOUND", "CAN_PARTICIPATE", "CAN_NOT_PARTICIPATE", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum BindStatusEnum {
    BING_NO_EXIST(0, "码牌不存在"),
    UNBOUND(1, "未绑定"),
    CAN_PARTICIPATE(2, "能参加随机立减"),
    CAN_NOT_PARTICIPATE(3, "不能随机立减");

    private static final /* synthetic */ EnumEntries $ENTRIES = b.n(values());

    @NotNull
    private final String desc;
    private final int statusCode;

    BindStatusEnum(int i7, String str) {
        this.statusCode = i7;
        this.desc = str;
    }

    @NotNull
    public static EnumEntries<BindStatusEnum> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }
}
