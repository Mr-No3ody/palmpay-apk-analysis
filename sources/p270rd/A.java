package p270rd;

import Pa.F;
import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.send_money.bean.TradeRecordDetailResp;
import com.transsnet.palmpay.send_money.ui.activity.TradeRecordDetailActivity;
import com.transsnet.palmpay.util.ActivityUtils;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class A implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailActivity f41671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TradeRecordDetailResp.RecordDetail f41672c;

    public /* synthetic */ A(TradeRecordDetailActivity tradeRecordDetailActivity, TradeRecordDetailResp.RecordDetail recordDetail, int i7) {
        this.f41670a = i7;
        this.f41671b = tradeRecordDetailActivity;
        this.f41672c = recordDetail;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TradeRecordDetailActivity tradeRecordDetailActivity = this.f41671b;
        TradeRecordDetailResp.RecordDetail recordDetail = this.f41672c;
        switch (this.f41670a) {
            case 0:
                TradeRecordDetailActivity.a aVar = TradeRecordDetailActivity.f33213B;
                Intent intentA = F.a(tradeRecordDetailActivity, recordDetail.getDetailBtnJumpUrl());
                if (intentA != null) {
                    tradeRecordDetailActivity.startActivity(intentA);
                }
                break;
            default:
                TradeRecordDetailActivity.a aVar2 = TradeRecordDetailActivity.f33213B;
                ActivityUtils.startActivity(F.a(tradeRecordDetailActivity, recordDetail.getCsLevyFeeJumpUrl()));
                break;
        }
    }
}
