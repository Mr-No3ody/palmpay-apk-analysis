package Xd;

import Pa.r0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.appcompat.widget.AppCompatImageView;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.teller.bean.resp.BillerHistoryItemBean;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends M1.d implements LoadMoreModule {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11150b;

    static {
        new h(null);
    }

    public j() {
        a(new i(this));
        a(new N3.c(1));
        addChildClickViewIds(Pd.c.rtv_history_buy_again);
    }

    @Override // com.chad.library.adapter.base.module.LoadMoreModule
    public final S1.c addLoadMoreModule(M1.j jVar) {
        return S1.e.a(this, jVar);
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        Integer itemType = ((BillerHistoryItemBean) data.get(i7)).getItemType();
        return (itemType != null && itemType.intValue() == 2) ? 2 : 1;
    }

    public void d(BaseViewHolder holder, BillerHistoryItemBean item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = Pd.c.tv_history_pay_amount;
        Long payAmount = item.getPayAmount();
        holder.setText(i7, "-" + r0.A(payAmount != null ? payAmount.longValue() : 0L));
        int i10 = Pd.c.tv_history_order_time;
        Long createTime = item.getCreateTime();
        holder.setText(i10, r0.R(createTime != null ? createTime.longValue() : 0L));
        if (TextUtils.isEmpty(item.getPaymentItemName())) {
            int i11 = Pd.c.tv_history_content;
            String str = p070ee.c.f36289a;
            Context context = getContext();
            String categoryId = item.getCategoryId();
            holder.setText(i11, p070ee.c.c(context, categoryId != null ? categoryId : ""));
        } else {
            int i12 = Pd.c.tv_history_content;
            String paymentItemName = item.getPaymentItemName();
            holder.setText(i12, paymentItemName != null ? paymentItemName : "");
        }
        Uri uriF = p070ee.c.f(item.getCategoryId());
        AppCompatImageView appCompatImageView = (AppCompatImageView) holder.getView(Pd.c.iv_history_icon);
        if (TextUtils.isEmpty(item.getIcon())) {
            com.bumptech.glide.b.f(appCompatImageView).load(uriF).a(new G1.d().I(new com.bumptech.glide.load.resource.bitmap.z(SizeUtils.dp2px(4.0f)), true)).S(appCompatImageView);
        } else {
            r0.j1(appCompatImageView, item.getIcon(), (G1.d) ((G1.d) ((G1.d) new G1.d().j(Pd.b.qt_icon_default_biller_history)).x(Pd.b.qt_icon_default_biller_history)).H(new com.bumptech.glide.load.resource.bitmap.z(SizeUtils.dp2px(4.0f))));
        }
        Integer orderStatus = item.getOrderStatus();
        int iIntValue = orderStatus != null ? orderStatus.intValue() : 0;
        if (iIntValue == 8 || iIntValue == 9) {
            holder.setText(Pd.c.tv_history_order_status_desc, p025ba.k.core_closed);
            holder.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorError);
        } else {
            Integer orderStatus2 = item.getOrderStatus();
            int iIntValue2 = orderStatus2 != null ? orderStatus2.intValue() : 0;
            if (iIntValue2 == 2 || iIntValue2 == 7) {
                holder.setText(Pd.c.tv_history_order_status_desc, Pd.f.qt_state_fail);
                holder.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorError);
            } else {
                Integer orderStatus3 = item.getOrderStatus();
                int iIntValue3 = orderStatus3 != null ? orderStatus3.intValue() : 0;
                if (iIntValue3 == 1 || iIntValue3 == 2 || iIntValue3 == 7 || iIntValue3 == 8 || iIntValue3 == 9 || iIntValue3 == 6) {
                    Integer orderStatus4 = item.getOrderStatus();
                    if ((orderStatus4 != null ? orderStatus4.intValue() : 0) == 6) {
                        holder.setText(Pd.c.tv_history_order_status_desc, p025ba.k.core_refund);
                        holder.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorTextAssist);
                    } else {
                        Integer orderStatus5 = item.getOrderStatus();
                        if ((orderStatus5 != null ? orderStatus5.intValue() : 0) == 1) {
                            holder.setText(Pd.c.tv_history_order_status_desc, p025ba.k.core_successful);
                            holder.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorSuccess);
                        }
                    }
                } else {
                    holder.setText(Pd.c.tv_history_order_status_desc, Pd.f.qt_state_pending);
                    holder.setTextColorRes(Pd.c.tv_history_order_status_desc, L6.b.ppColorWarning);
                }
            }
        }
        Integer orderStatus6 = item.getOrderStatus();
        if ((orderStatus6 != null ? orderStatus6.intValue() : 0) == 1 && e()) {
            holder.setGone(Pd.c.tv_history_order_status_desc, true);
            holder.setGone(Pd.c.rtv_history_buy_again, false);
        } else {
            holder.setGone(Pd.c.tv_history_order_status_desc, false);
            holder.setGone(Pd.c.rtv_history_buy_again, true);
        }
    }

    public abstract boolean e();
}
