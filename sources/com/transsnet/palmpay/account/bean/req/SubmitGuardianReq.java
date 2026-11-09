package com.transsnet.palmpay.account.bean.req;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SubmitGuardianReq {
    public static final int FILE_TYPE_BIRTH = 1;
    public static final int FILE_TYPE_DEATH = 2;
    public String authToken;
    public List<FileAddress> fileAddress;
    public String guardianPhone;
    public String otpToken;
    public Integer relationType;

    public class FileAddress {
        public String fileAddress;
        public int fileType;

        public FileAddress(int i7, String str) {
            this.fileType = i7;
            this.fileAddress = str;
        }
    }

    public void addUrl(int i7, String str) {
        if (this.fileAddress == null) {
            this.fileAddress = new ArrayList();
        }
        for (FileAddress fileAddress : this.fileAddress) {
            if (fileAddress.fileType == i7) {
                fileAddress.fileAddress = str;
                return;
            }
        }
        this.fileAddress.add(new FileAddress(i7, str));
    }

    public void clearFiles() {
        List<FileAddress> list = this.fileAddress;
        if (list != null) {
            list.clear();
        }
    }

    public String getFileUrl(int i7) {
        List<FileAddress> list = this.fileAddress;
        if (list == null) {
            return null;
        }
        for (FileAddress fileAddress : list) {
            if (fileAddress.fileType == i7) {
                return fileAddress.fileAddress;
            }
        }
        return null;
    }
}
