package com.transsnet.palmpay.send_money.bean.resp;

import C0.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/transsnet/palmpay/send_money/bean/resp/TransferBizConfigResp;", "", "keyWord", "", "tips", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKeyWord", "()Ljava/lang/String;", "getTips", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransferBizConfigResp {

    @Nullable
    private final String keyWord;

    @Nullable
    private final String tips;

    public TransferBizConfigResp(@Nullable String str, @Nullable String str2) {
        this.keyWord = str;
        this.tips = str2;
    }

    public static /* synthetic */ TransferBizConfigResp copy$default(TransferBizConfigResp transferBizConfigResp, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = transferBizConfigResp.keyWord;
        }
        if ((i7 & 2) != 0) {
            str2 = transferBizConfigResp.tips;
        }
        return transferBizConfigResp.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyWord() {
        return this.keyWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTips() {
        return this.tips;
    }

    @NotNull
    public final TransferBizConfigResp copy(@Nullable String keyWord, @Nullable String tips) {
        return new TransferBizConfigResp(keyWord, tips);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferBizConfigResp)) {
            return false;
        }
        TransferBizConfigResp transferBizConfigResp = (TransferBizConfigResp) other;
        return Intrinsics.c(this.keyWord, transferBizConfigResp.keyWord) && Intrinsics.c(this.tips, transferBizConfigResp.tips);
    }

    @Nullable
    public final String getKeyWord() {
        return this.keyWord;
    }

    @Nullable
    public final String getTips() {
        return this.tips;
    }

    public int hashCode() {
        String str = this.keyWord;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tips;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return G.q("TransferBizConfigResp(keyWord=", this.keyWord, ", tips=", this.tips, ")");
    }
}
