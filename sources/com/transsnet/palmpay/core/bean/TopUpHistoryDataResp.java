package com.transsnet.palmpay.core.bean;

import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0006\u0010\u0007R%\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/bean/TopUpHistoryDataResp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/core/bean/TopUpRecordItem;", "Lkotlin/collections/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TopUpHistoryDataResp extends CommonResult {

    @Nullable
    private final ArrayList<TopUpRecordItem> data;

    public TopUpHistoryDataResp(@Nullable ArrayList<TopUpRecordItem> arrayList) {
        this.data = arrayList;
    }

    @Nullable
    public final ArrayList<TopUpRecordItem> getData() {
        return this.data;
    }
}
