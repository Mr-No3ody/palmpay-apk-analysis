package com.transsnet.palmpay.core.bean.rsp;

import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.CommonResult;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/rsp/GetMenuBillPaymentRsp;", "Lcom/transsnet/palmpay/core/bean/CommonResult;", "<init>", "()V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/core/bean/rsp/GetMenuBillPaymentGroup;", "Lkotlin/collections/ArrayList;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetMenuBillPaymentRsp extends CommonResult {

    @JvmField
    @Nullable
    public ArrayList<GetMenuBillPaymentGroup> data = new ArrayList<>();
}
