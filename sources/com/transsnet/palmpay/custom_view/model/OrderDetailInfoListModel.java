package com.transsnet.palmpay.custom_view.model;

import L6.b;
import Oc.j;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.transsnet.palmpay.custom_view.bean.OrderDetailItemBean;
import com.transsnet.palmpay.custom_view.interfac.OnOrderDetailItemClickListener;
import com.transsnet.palmpay.util.SpanUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderDetailInfoListModel;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOrderDetailInfoListModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderDetailInfoListModel.kt\ncom/transsnet/palmpay/custom_view/model/OrderDetailInfoListModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n1869#2,2:39\n*S KotlinDebug\n*F\n+ 1 OrderDetailInfoListModel.kt\ncom/transsnet/palmpay/custom_view/model/OrderDetailInfoListModel\n*L\n30#1:39,2\n*E\n"})
public final class OrderDetailInfoListModel extends LinearLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderDetailInfoListModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(List data, OnOrderDetailItemClickListener clickListener) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        if (getChildCount() > 0) {
            removeAllViews();
        }
        Iterator it = data.iterator();
        while (it.hasNext()) {
            OrderDetailItemBean orderDetailItemBean = (OrderDetailItemBean) it.next();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            OrderResultItemModel orderResultItemModel = new OrderResultItemModel(context, (AttributeSet) null, 0, 0.0f, 0.0f, 0, 62);
            if (orderDetailItemBean != null) {
                Integer style = orderDetailItemBean.getStyle();
                int iIntValue = style != null ? style.intValue() : 1002;
                orderResultItemModel.m(iIntValue);
                orderResultItemModel.g(orderDetailItemBean.getKey());
                SpanUtils spanUtils = new SpanUtils();
                String value = orderDetailItemBean.getValue();
                if (value == null) {
                    value = "";
                }
                SpanUtils spanUtilsAppend = spanUtils.append(value);
                if (!TextUtils.isEmpty(orderDetailItemBean.getSubValue())) {
                    String subValue = orderDetailItemBean.getSubValue();
                    spanUtilsAppend.appendLine(subValue != null ? subValue : "").setForegroundColor(context.getColor(iIntValue == 1006 ? b.ppColorTextNormal : b.ppColorTextPrimary)).setFontSize(12, true);
                }
                if (iIntValue == 1004) {
                    orderResultItemModel.setOnClickListener(new j(18, clickListener, orderDetailItemBean));
                }
                orderResultItemModel.j(spanUtilsAppend.create());
            }
            addView(orderResultItemModel);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderDetailInfoListModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderDetailInfoListModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderDetailInfoListModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
    }
}
