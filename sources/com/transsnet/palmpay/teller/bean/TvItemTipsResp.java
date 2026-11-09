package com.transsnet.palmpay.teller.bean;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/teller/bean/TvItemTipsResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/teller/bean/TvItemTipsBean;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TvItemTipsResp extends CommonResult {

    @Nullable
    private final ArrayList<TvItemTipsBean> data;

    public TvItemTipsResp(@Nullable ArrayList<TvItemTipsBean> arrayList) {
        this.data = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TvItemTipsResp copy$default(TvItemTipsResp tvItemTipsResp, ArrayList arrayList, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            arrayList = tvItemTipsResp.data;
        }
        return tvItemTipsResp.copy(arrayList);
    }

    @Nullable
    public final ArrayList<TvItemTipsBean> component1() {
        return this.data;
    }

    @NotNull
    public final TvItemTipsResp copy(@Nullable ArrayList<TvItemTipsBean> data) {
        return new TvItemTipsResp(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TvItemTipsResp) && Intrinsics.c(this.data, ((TvItemTipsResp) other).data);
    }

    @Nullable
    public final ArrayList<TvItemTipsBean> getData() {
        return this.data;
    }

    public int hashCode() {
        ArrayList<TvItemTipsBean> arrayList = this.data;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    @Override // com.transsnet.palmpay.core.bean.CommonResult
    @NotNull
    public String toString() {
        return "TvItemTipsResp(data=" + this.data + ")";
    }
}
