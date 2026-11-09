package Ua;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.reward.BtnContentItem;
import com.transsnet.palmpay.core.bean.reward.OrderResultRewardItemBean;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class A0 extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9300a;

    public A0() {
        super(p025ba.g.core_item_payment_reward, null);
        addChildClickViewIds(p025ba.e.tv_btn);
        this.f9300a = Pa.i0.T();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008a  */
    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        BtnContentItem btnContentItem;
        int iColorInt;
        Integer num;
        OrderResultRewardItemBean item = (OrderResultRewardItemBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        ImageView imageView = (ImageView) holder.getView(p025ba.e.iv_icon);
        boolean z3 = this.f9300a;
        Pa.r0.l1((!z3 || TextUtils.isEmpty(item.rewardDarkIcon)) ? item.rewardIcon : item.rewardDarkIcon, imageView);
        ((TextView) holder.getView(p025ba.e.tv_name)).setText(CommonExtKt.formatHtmlText((!z3 || TextUtils.isEmpty(item.rewardTopicDark)) ? item.rewardTopic : item.rewardTopicDark));
        holder.setText(p025ba.e.tv_desc, item.rewardIntroduce);
        List<BtnContentItem> list = item.btnContentList;
        Integer num2 = item.rewardStatus;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (Intrinsics.c(((BtnContentItem) obj2).rewardStatus, num2)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                btnContentItem = (BtnContentItem) arrayList.get(0);
            } else {
                btnContentItem = null;
            }
        } else {
            btnContentItem = null;
        }
        TextView textView = (TextView) holder.getView(p025ba.e.tv_btn);
        textView.setText(btnContentItem != null ? btnContentItem.buttonContent : null);
        if (btnContentItem != null) {
            Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iColorInt = btnContentItem.getBtnForeground(context);
        } else {
            iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorButtonTextWhite, textView.getContext());
        }
        textView.setTextColor(iColorInt);
        textView.setBackgroundResource(btnContentItem != null ? btnContentItem.getBtnBackground() : com.transsnet.palmpay.custom_view.r.cv_shape_halfround_purple);
        textView.setEnabled(((btnContentItem == null || (num = btnContentItem.functionType) == null) ? 1 : num.intValue()) != 3);
    }
}
