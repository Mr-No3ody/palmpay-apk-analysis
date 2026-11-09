package com.transsnet.palmpay.jara_packet.bean.resp;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\f\u0010\rR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/jara_packet/bean/resp/Comment;", "", "commentsContent", "", "commodityName", "createTime", "", "amount", "headPortrait", "nickName", "pictureList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "module_rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Comment {

    @JvmField
    public final long amount;

    @JvmField
    @NotNull
    public final String commentsContent;

    @JvmField
    @NotNull
    public final String commodityName;

    @JvmField
    public final long createTime;

    @JvmField
    @NotNull
    public final String headPortrait;

    @JvmField
    @NotNull
    public final String nickName;

    @JvmField
    @NotNull
    public final List<String> pictureList;

    public Comment(@NotNull String commentsContent, @NotNull String commodityName, long j6, long j10, @NotNull String headPortrait, @NotNull String nickName, @NotNull List<String> pictureList) {
        Intrinsics.checkNotNullParameter(commentsContent, "commentsContent");
        Intrinsics.checkNotNullParameter(commodityName, "commodityName");
        Intrinsics.checkNotNullParameter(headPortrait, "headPortrait");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        Intrinsics.checkNotNullParameter(pictureList, "pictureList");
        this.commentsContent = commentsContent;
        this.commodityName = commodityName;
        this.createTime = j6;
        this.amount = j10;
        this.headPortrait = headPortrait;
        this.nickName = nickName;
        this.pictureList = pictureList;
    }
}
