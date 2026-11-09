package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.ExpressageInfoBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/ExpressInfo;", "", "shippingCompany", "", "shippingNo", "shoppingAddress", "Lcom/transsnet/palmpay/core/bean/rsp/ShippingAddress;", "trackList", "", "Lcom/transsnet/palmpay/core/bean/ExpressageInfoBean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/transsnet/palmpay/core/bean/rsp/ShippingAddress;Ljava/util/List;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExpressInfo {

    @JvmField
    @NotNull
    public final String shippingCompany;

    @JvmField
    @NotNull
    public final String shippingNo;

    @JvmField
    @NotNull
    public final ShippingAddress shoppingAddress;

    @JvmField
    @NotNull
    public final List<ExpressageInfoBean> trackList;

    public ExpressInfo(@NotNull String shippingCompany, @NotNull String shippingNo, @NotNull ShippingAddress shoppingAddress, @NotNull List<ExpressageInfoBean> trackList) {
        Intrinsics.checkNotNullParameter(shippingCompany, "shippingCompany");
        Intrinsics.checkNotNullParameter(shippingNo, "shippingNo");
        Intrinsics.checkNotNullParameter(shoppingAddress, "shoppingAddress");
        Intrinsics.checkNotNullParameter(trackList, "trackList");
        this.shippingCompany = shippingCompany;
        this.shippingNo = shippingNo;
        this.shoppingAddress = shoppingAddress;
        this.trackList = trackList;
    }
}
