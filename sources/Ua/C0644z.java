package Ua;

import android.widget.LinearLayout;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeTextView;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.rsp.QueryServiceStateByCategoryIdRsp;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: Ua.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0644z extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CommonResult f9515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModelBillNoticeItem f9516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644z(CommonResult commonResult, Continuation continuation, ModelBillNoticeItem modelBillNoticeItem) {
        super(2, continuation);
        this.f9515a = commonResult;
        this.f9516b = modelBillNoticeItem;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0644z(this.f9515a, continuation, this.f9516b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0644z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        QueryServiceStateByCategoryIdRsp queryServiceStateByCategoryIdRsp = (QueryServiceStateByCategoryIdRsp) this.f9515a;
        if (queryServiceStateByCategoryIdRsp != null && queryServiceStateByCategoryIdRsp.isSuccess()) {
            List<String> list = queryServiceStateByCategoryIdRsp.data;
            List<String> list2 = list;
            ModelBillNoticeItem modelBillNoticeItem = this.f9516b;
            if (list2 == null || list2.isEmpty()) {
                LinearLayout channelNoticeLayout = modelBillNoticeItem.getChannelNoticeLayout();
                if (channelNoticeLayout != null) {
                    p220oa.h.s(channelNoticeLayout, false);
                }
            } else {
                MarqueeTextView channelNoticeTv = modelBillNoticeItem.getChannelNoticeTv();
                if (channelNoticeTv != null) {
                    channelNoticeTv.setText(CollectionsKt.J(list, "   ", null, null, null, 62));
                }
                MarqueeViewV2 limitTimeAd = modelBillNoticeItem.getLimitTimeAd();
                if (limitTimeAd != null) {
                    p220oa.h.s(limitTimeAd, false);
                }
                LinearLayout channelNoticeLayout2 = modelBillNoticeItem.getChannelNoticeLayout();
                if (channelNoticeLayout2 != null) {
                    p220oa.h.s(channelNoticeLayout2, true);
                }
            }
        }
        return Unit.f38893a;
    }
}
