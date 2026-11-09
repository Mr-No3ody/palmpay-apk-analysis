package com.transsnet.palmpay.account.bean.rsp;

import Pa.C0525w;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.gson.Gson;
import com.palmpay.lib.apm.launchcounter.util.d;
import com.transsnet.palmpay.account.bean.RealNameAuthInfoRsp;
import com.transsnet.palmpay.account.bean.Tier3ApplyStatusRsp;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class PreCheckApplyTier3Rsp {
    public static final int RESULT_CODE_FAIL = 9997;
    public static final int RESULT_CODE_NOPASS = 2;
    public String billNo;
    public boolean canApply;
    public String errorMsg;
    public List<String> imgUrlList;
    public Tier3ApplyStatusRsp lastApplyOrder;
    public boolean needFaceCapture;
    public long validBillDuration;

    public void applyTier3() {
        applyTier3(null);
    }

    public boolean isApplyFailed() {
        Tier3ApplyStatusRsp tier3ApplyStatusRsp = this.lastApplyOrder;
        if (tier3ApplyStatusRsp != null) {
            return tier3ApplyStatusRsp.isApplyFailed();
        }
        return false;
    }

    public void applyTier3(RealNameAuthInfoRsp realNameAuthInfoRsp) {
        if (!this.canApply) {
            ToastUtils.showLong(this.errorMsg);
            return;
        }
        if (this.lastApplyOrder == null) {
            ARouter.getInstance().build("/account/upgrade_tier3").withBoolean("extra_flag", !this.needFaceCapture).withString("orderNo", this.billNo).withStringArrayList("extra_data_1", (ArrayList) this.imgUrlList).withLong("extra_data_2", this.validBillDuration).navigation();
        } else if (isApplyFailed()) {
            ARouter.getInstance().build("/account/upgrade_tier3").withBoolean("extra_flag", !this.needFaceCapture).withString("orderNo", this.billNo).withParcelable("extra_data", this.lastApplyOrder).withStringArrayList("extra_data_1", (ArrayList) this.imgUrlList).withLong("extra_data_2", this.validBillDuration).navigation();
        } else {
            d.G("/account/upgrade_tier3_result", ((Gson) C0525w.f().f7166b).toJson(this));
        }
    }
}
