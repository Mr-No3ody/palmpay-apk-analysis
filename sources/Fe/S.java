package Fe;

import Pa.C0525w;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import com.transsnet.palmpay.ui.mvp.contract.PaymentMessageListContract;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.disposables.Disposable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends Z4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f2746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2747g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f2748i;

    public S(T t, boolean z3, int i7) {
        this.f2748i = t;
        this.f2746f = z3;
        this.f2747g = i7;
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(Disposable disposable) {
        this.f2748i.addSubscription(disposable);
    }

    @Override // Z4.e
    public final void w(String str) {
        boolean z3 = this.f2746f;
        T t = this.f2748i;
        if (z3) {
            ((PaymentMessageListContract.View) t.f27351a).showLoading(false);
        }
        ((PaymentMessageListContract.View) t.f27351a).stopLoadMore();
    }

    @Override // Z4.e
    public final void y(Object obj) {
        List<GetMsgRsp.DataBean.ListBean> list;
        boolean zContains;
        List<GetMsgRsp.DataBean.ListBean> list2;
        GetMsgRsp getMsgRsp = (GetMsgRsp) obj;
        T t = this.f2748i;
        if (this.f2746f) {
            ((PaymentMessageListContract.View) t.f27351a).showLoading(false);
        }
        if (!getMsgRsp.isSuccess()) {
            ToastUtils.showLong(getMsgRsp.getRespMsg());
            ((PaymentMessageListContract.View) t.f27351a).stopLoadMore();
            return;
        }
        int i7 = this.f2747g;
        if (i7 == 1) {
            t.f2750d.clear();
        }
        GetMsgRsp.DataBean dataBean = getMsgRsp.data;
        if (dataBean == null || (list2 = dataBean.list) == null || list2.size() < 10) {
            ((PaymentMessageListContract.View) t.f27351a).setTotalPage(i7);
        } else {
            ((PaymentMessageListContract.View) t.f27351a).setTotalPage(1000);
        }
        GetMsgRsp.DataBean dataBean2 = getMsgRsp.data;
        if (dataBean2 != null && (list = dataBean2.list) != null) {
            for (GetMsgRsp.DataBean.ListBean listBean : list) {
                MsgContentBean content = listBean.getContent();
                if (content != null) {
                    if (String.valueOf(0).equals(listBean.getNotificationType()) && TextUtils.isEmpty(content.outsideInsideNotificationInfo)) {
                        String str = listBean.content;
                        try {
                            C0525w.f().getClass();
                            MsgContentBean msgContentBean = (MsgContentBean) C0525w.d(str, MsgContentBean.class);
                            String str2 = msgContentBean != null ? msgContentBean.messageType : null;
                            zContains = TextUtils.isEmpty(str2) ? false : t.f2751e.contains(str2);
                        } catch (Exception e10) {
                            F6.d.c("T", "isSupported: ", e10);
                        }
                        if (zContains) {
                            t.f2750d.add(listBean);
                        }
                    } else {
                        t.f2750d.add(listBean);
                    }
                }
            }
        }
        ((PaymentMessageListContract.View) t.f27351a).showMessageList(t.f2750d);
        ((PaymentMessageListContract.View) t.f27351a).stopLoadMore();
    }
}
