package com.transsnet.palmpay.core.bean.req;

import com.transsnet.palmpay.core.base.BaseApplication;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class QueryUiResourceReq {
    private List<String> choiceList;
    private String country = BaseApplication.getCountryLocale();
    private String channel = BaseApplication.getChannel();

    public QueryUiResourceReq(List<String> choiceList) {
        this.choiceList = choiceList;
    }

    public List<String> getChoiceList() {
        return this.choiceList;
    }

    public void setChoiceList(List<String> choiceList) {
        this.choiceList = choiceList;
    }
}
