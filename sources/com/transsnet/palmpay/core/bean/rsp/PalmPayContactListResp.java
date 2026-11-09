package com.transsnet.palmpay.core.bean.rsp;

import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PalmPayContactListResp extends CommonResult {
    private DataBean data;

    public static class DataBean {
        private List<PalmPayContact> memberContactsFavouriteList;
        private List<PalmPayContact> memberContactsList;
        private List<PalmPayContact> memberContactsRelationshipList;

        public List<PalmPayContact> getMemberContactsFavouriteList() {
            return this.memberContactsFavouriteList;
        }

        public List<PalmPayContact> getMemberContactsList() {
            return this.memberContactsList;
        }

        public List<PalmPayContact> getMemberContactsRelationshipList() {
            return this.memberContactsRelationshipList;
        }

        public void setMemberContactsFavouriteList(List<PalmPayContact> memberContactsFavouriteList) {
            this.memberContactsFavouriteList = memberContactsFavouriteList;
        }

        public void setMemberContactsList(List<PalmPayContact> memberContactsList) {
            this.memberContactsList = memberContactsList;
        }

        public void setMemberContactsRelationshipList(List<PalmPayContact> memberContactsRelationshipList) {
            this.memberContactsRelationshipList = memberContactsRelationshipList;
        }
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
}
