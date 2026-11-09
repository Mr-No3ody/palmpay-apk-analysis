package com.transsnet.palmpay.core.bean.bill;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes3.dex */
public class TransHistoryReq {

    @Expose(deserialize = false, serialize = false)
    public int beginMonth;
    public long beginTime;

    @Expose(deserialize = false, serialize = false)
    public int beginYear;
    public long endTime;
    public int inOutFlag;
    public int pageNum;
    public int pageSize;
    public Integer status;
    public String transType;
}
