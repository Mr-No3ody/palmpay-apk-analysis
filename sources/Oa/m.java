package Oa;

import Gb.T;
import android.content.Context;
import android.widget.LinearLayout;
import com.transsnet.palmpay.core.bean.rsp.QueryOrderDetailRsp;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {
    public static final void a(LinearLayout linearLayout, List list, QueryOrderDetailRsp.OrderResultKeyDetailBean orderResultKeyDetailBean) {
        String str;
        Intrinsics.checkNotNullParameter(linearLayout, "<this>");
        linearLayout.removeAllViews();
        if (list == null) {
            list = z.f38935a;
        }
        int i7 = 0;
        for (Object obj : list) {
            int i10 = i7 + 1;
            T t = null;
            if (i7 < 0) {
                C1850q.k();
                throw null;
            }
            QueryOrderDetailRsp.OrderResultItemBean orderResultItemBean = (QueryOrderDetailRsp.OrderResultItemBean) obj;
            Context context = linearLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String str2 = orderResultItemBean.contentSubKey;
            OrderResultItemModel orderResultItemModel = new OrderResultItemModel(context, ((str2 == null || str2.length() == 0) && ((str = orderResultItemBean.contentSubValue) == null || str.length() == 0)) ? 1002 : 1008, orderResultItemBean.contentKey, orderResultItemBean.contentValue, 0.0f, 0.0f, CommonViewExtKt.getDp(20));
            String str3 = orderResultKeyDetailBean != null ? orderResultKeyDetailBean.paymentMethodKey : null;
            if (str3 != null && str3.length() != 0) {
                String str4 = orderResultKeyDetailBean != null ? orderResultKeyDetailBean.paymentMethodValue : null;
                if (str4 != null && str4.length() != 0) {
                    if (Intrinsics.c(orderResultItemBean.contentKey, orderResultKeyDetailBean != null ? orderResultKeyDetailBean.paymentMethodKey : null)) {
                        if (Intrinsics.c(orderResultItemBean.contentValue, orderResultKeyDetailBean != null ? orderResultKeyDetailBean.paymentMethodValue : null)) {
                            orderResultItemModel.getItemValueTv().setTextColor(CommonViewExtKt.colorInt(p025ba.c.core_color_00a49a, linearLayout.getContext()));
                            orderResultItemModel.k(p025ba.d.core_ic_result_flexi_loan);
                            SpanUtils spanUtils = new SpanUtils();
                            String str5 = orderResultItemBean.contentValue;
                            if (str5 == null) {
                                str5 = "";
                            }
                            orderResultItemModel.j(spanUtils.append(str5).setFontFamily("sans-serif-medium").create());
                        }
                    }
                }
            }
            String str6 = orderResultItemBean.contentSubUrl;
            if (str6 != null && str6.length() != 0) {
                t = new T(27, linearLayout, str6);
            }
            orderResultItemModel.n(orderResultItemBean.contentSubKey, orderResultItemBean.contentSubValue, t);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (i7 > 0) {
                layoutParams.topMargin = CommonViewExtKt.getDp(12);
            }
            Unit unit = Unit.f38893a;
            linearLayout.addView(orderResultItemModel, layoutParams);
            i7 = i10;
        }
    }
}
