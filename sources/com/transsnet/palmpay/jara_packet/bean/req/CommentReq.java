package com.transsnet.palmpay.jara_packet.bean.req;

/* JADX INFO: loaded from: classes4.dex */
public class CommentReq {
    public String bussinessSource;
    public String grabCommodityId;
    public int pageNum;
    public int pageSize;

    public CommentReq(String bussinessSource, String grabCommodityId, int pageNum, int pageSize) {
        this.bussinessSource = bussinessSource;
        this.grabCommodityId = grabCommodityId;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
}
