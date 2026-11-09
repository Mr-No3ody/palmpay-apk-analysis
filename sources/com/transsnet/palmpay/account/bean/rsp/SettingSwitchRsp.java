package com.transsnet.palmpay.account.bean.rsp;

/* JADX INFO: loaded from: classes3.dex */
public class SettingSwitchRsp {
    private boolean showGuardian;
    private boolean showLoginAuthorization;
    private boolean showMerchants;
    private boolean showTeen;

    public boolean isShowGuardian() {
        return this.showGuardian;
    }

    public boolean isShowLoginAuthorization() {
        return this.showLoginAuthorization;
    }

    public boolean isShowMerchants() {
        return this.showMerchants;
    }

    public boolean isShowTeen() {
        return this.showTeen;
    }

    public void setShowGuardian(boolean z3) {
        this.showGuardian = z3;
    }

    public void setShowLoginAuthorization(boolean z3) {
        this.showLoginAuthorization = z3;
    }

    public void setShowMerchants(boolean z3) {
        this.showMerchants = z3;
    }

    public void setShowTeen(boolean z3) {
        this.showTeen = z3;
    }
}
