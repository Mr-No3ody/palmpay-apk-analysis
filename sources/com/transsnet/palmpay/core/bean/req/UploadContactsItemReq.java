package com.transsnet.palmpay.core.bean.req;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/core/bean/req/UploadContactsItemReq;", "", "contractInfoDTOListList", "", "Lcom/transsnet/palmpay/core/bean/req/UploadContactsItemBean;", "<init>", "(Ljava/util/List;)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UploadContactsItemReq {

    @JvmField
    @Nullable
    public final List<UploadContactsItemBean> contractInfoDTOListList;

    public UploadContactsItemReq(@Nullable List<UploadContactsItemBean> list) {
        this.contractInfoDTOListList = list;
    }
}
