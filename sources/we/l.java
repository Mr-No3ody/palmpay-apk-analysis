package we;

import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterContentType;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterShowType;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements HomeRewardsClaimClickEvent {
    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    public final String takeActivityId() {
        return HomeRewardsClaimClickEvent.DefaultImpls.takeActivityId(this);
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    public final List takeBizIdList() {
        return HomeRewardsClaimClickEvent.DefaultImpls.takeBizIdList(this);
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    public final Integer takeContentType() {
        return Integer.valueOf(HomeRewardsCenterContentType.INSTANCE.getCONTENT_TYPE_COUPON());
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    public final String takeCouponCode() {
        return HomeRewardsClaimClickEvent.DefaultImpls.takeCouponCode(this);
    }

    @Override // com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsClaimClickEvent
    public final Integer taskShowType() {
        return Integer.valueOf(HomeRewardsCenterShowType.INSTANCE.getCOUPON_COMBO());
    }
}
