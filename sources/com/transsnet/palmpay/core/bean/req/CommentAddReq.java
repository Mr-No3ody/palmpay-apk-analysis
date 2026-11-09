package com.transsnet.palmpay.core.bean.req;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/CommentAddReq;", "", "anonymous", "", "bussinessSource", "", "commentsContent", "commodityName", "orderNo", "pictureList", "", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommentAddReq {

    @JvmField
    public final boolean anonymous;

    @JvmField
    @Nullable
    public final String bussinessSource;

    @JvmField
    @Nullable
    public final String commentsContent;

    @JvmField
    @Nullable
    public final String commodityName;

    @JvmField
    @Nullable
    public final String orderNo;

    @JvmField
    @Nullable
    public final List<String> pictureList;

    public CommentAddReq(boolean z3, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list) {
        this.anonymous = z3;
        this.bussinessSource = str;
        this.commentsContent = str2;
        this.commodityName = str3;
        this.orderNo = str4;
        this.pictureList = list;
    }
}
