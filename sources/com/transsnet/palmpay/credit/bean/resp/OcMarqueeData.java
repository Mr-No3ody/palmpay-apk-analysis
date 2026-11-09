package com.transsnet.palmpay.credit.bean.resp;

import N8.q0;
import Pa.r0;
import com.transsnet.palmpay.custom_view.marqueeview.IMarqueeItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/resp/OcMarqueeData;", "Lcom/transsnet/palmpay/custom_view/marqueeview/IMarqueeItem;", "amount", "", "headImage", "", "memberId", "nickName", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()J", "getHeadImage", "()Ljava/lang/String;", "getMemberId", "getNickName", "marqueeMessage", "", "getImgUrl", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcMarqueeData implements IMarqueeItem {
    private final long amount;

    @NotNull
    private final String headImage;

    @NotNull
    private final String memberId;

    @NotNull
    private final String nickName;

    public OcMarqueeData(long j6, @NotNull String headImage, @NotNull String memberId, @NotNull String nickName) {
        Intrinsics.checkNotNullParameter(headImage, "headImage");
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(nickName, "nickName");
        this.amount = j6;
        this.headImage = headImage;
        this.memberId = memberId;
        this.nickName = nickName;
    }

    public final long getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getHeadImage() {
        return this.headImage;
    }

    @Override // com.transsnet.palmpay.custom_view.marqueeview.IMarqueeItem
    @NotNull
    public String getImgUrl() {
        String str = this.headImage;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getMemberId() {
        return this.memberId;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    @Override // com.transsnet.palmpay.custom_view.marqueeview.IMarqueeItem
    @NotNull
    public CharSequence marqueeMessage() {
        return q0.l(this.nickName, " got ₦", r0.n0(this.amount), " just now!");
    }
}
