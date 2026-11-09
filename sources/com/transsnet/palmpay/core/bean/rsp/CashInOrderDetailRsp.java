package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.OrderContentDTO;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/CashInOrderDetailRsp;", "", "<init>", "()V", "orderNo", "", "orderIcon", "payerName", "payeeAmount", "", "Ljava/lang/Long;", "orderStatus", "", "Ljava/lang/Integer;", "orderStatusDesc", "orderDesc", "firstContentDTOList", "", "Lcom/transsnet/palmpay/core/bean/OrderContentDTO;", "secondContentDTOList", "cashOrderExtendDTO", "Lcom/transsnet/palmpay/core/bean/rsp/CashOrderExtendBean;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CashInOrderDetailRsp {

    @JvmField
    @Nullable
    public CashOrderExtendBean cashOrderExtendDTO;

    @JvmField
    @Nullable
    public final List<OrderContentDTO> firstContentDTOList;

    @JvmField
    @Nullable
    public final String orderDesc;

    @JvmField
    @Nullable
    public final String orderIcon;

    @JvmField
    @Nullable
    public final String orderNo;

    @JvmField
    @Nullable
    public final Integer orderStatus;

    @JvmField
    @Nullable
    public final String orderStatusDesc;

    @JvmField
    @Nullable
    public final Long payeeAmount;

    @JvmField
    @Nullable
    public final String payerName;

    @JvmField
    @Nullable
    public final List<OrderContentDTO> secondContentDTOList;
}
