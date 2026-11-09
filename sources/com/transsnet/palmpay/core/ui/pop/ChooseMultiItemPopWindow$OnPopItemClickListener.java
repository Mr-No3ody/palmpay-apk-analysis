package com.transsnet.palmpay.core.ui.pop;

import com.transsnet.palmpay.core.bean.bill.BillType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/transsnet/palmpay/core/ui/pop/ChooseMultiItemPopWindow$OnPopItemClickListener", "", "Lcom/transsnet/palmpay/core/bean/bill/BillType;", "keyValue", "", "onItemSelect", "(Lcom/transsnet/palmpay/core/bean/bill/BillType;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ChooseMultiItemPopWindow$OnPopItemClickListener {
    void onItemSelect(@NotNull BillType keyValue);
}
