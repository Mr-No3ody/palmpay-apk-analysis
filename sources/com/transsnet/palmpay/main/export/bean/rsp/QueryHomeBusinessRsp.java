package com.transsnet.palmpay.main.export.bean.rsp;

import com.transsnet.palmpay.core.bean.LastPayerDataBean;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.rsp.UnReadMsgCntRsp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class QueryHomeBusinessRsp {
    public int memberLabel;
    public UnReadMsgCntRsp msgUnReadRes;
    public LastPayerDataBean newestOrder;
    public List<GetMsgRsp.DataBean.ListBean> queryMsgRespPageDto;
}
