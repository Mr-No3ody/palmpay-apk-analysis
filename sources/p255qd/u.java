package p255qd;

import Z4.e;
import android.text.TextUtils;
import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.send_money.bean.QueryMemberDetailResp;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.contract.TransferToMobileContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v f41519f;

    public u(v vVar) {
        this.f41519f = vVar;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f41519f.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        ToastUtils.showLong(str);
    }

    @Override // Z4.e
    public final void y(Object obj) {
        RecipientListResp recipientListResp = (RecipientListResp) obj;
        if (!recipientListResp.isSuccess()) {
            ToastUtils.showLong(recipientListResp.getRespMsg());
            return;
        }
        List<RecipientListResp.RecipientBean> data = recipientListResp.getData();
        if (data == null || data.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (RecipientListResp.RecipientBean recipientBean : data) {
            QueryMemberDetailResp.Data data2 = new QueryMemberDetailResp.Data();
            data2.nickName = recipientBean.getRecipientNickname();
            data2.firstName = recipientBean.getRecipientFirstName();
            data2.lastName = recipientBean.getRecipientLastName();
            data2.fullName = (TextUtils.isEmpty(data2.firstName) || TextUtils.isEmpty(data2.lastName)) ? "" : data2.firstName + " " + data2.lastName;
            data2.headPortrait = recipientBean.getRecipientHeadImage();
            data2.userEmail = recipientBean.getUserEmail();
            data2.memberId = recipientBean.getRecipientMemberId();
            data2.phone = recipientBean.getRecipientPhone();
            data2.createTime = recipientBean.getCreateTime();
            data2.authen = recipientBean.isAuther();
            data2.palmPayTag = recipientBean.getPalmPayTag();
            data2.facebookName = recipientBean.getFacebookName();
            data2.accountTierTips = recipientBean.getAccountTierTips();
            data2.mobileMoneyAccountTier = recipientBean.getMobileMoneyAccountTier();
            data2.agentMemberId = recipientBean.getAgentMemberId();
            data2.accountNo = recipientBean.getAccountNo();
            data2.keywordType = recipientBean.getKeywordType();
            data2.ppAccountNo = recipientBean.getPpAccountNo();
            data2.businessType = 2;
            arrayList.add(data2);
        }
        IBaseView iBaseView = this.f41519f.f27351a;
        if (iBaseView != null) {
            ((TransferToMobileContract$IView) iBaseView).showRecipientsResp(arrayList);
        }
    }
}
