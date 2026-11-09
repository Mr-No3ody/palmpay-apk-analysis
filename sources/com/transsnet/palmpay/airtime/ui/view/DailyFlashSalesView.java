package com.transsnet.palmpay.airtime.ui.view;

import Bc.C0107d;
import L6.b;
import M1.j;
import Pd.c;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.airtime.bean.rsp.FlashSalesProductsDataBean;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p141j9.C1794b;
import p155k9.h;
import p171lb.d;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002$%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000e2\u001a\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011j\n\u0012\u0004\u0012\u00020\u0012\u0018\u0001`\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/view/DailyFlashSalesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "title", "", "setTitle", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/airtime/bean/rsp/FlashSalesProductsDataBean;", "Lkotlin/collections/ArrayList;", "products", "setList", "(Ljava/util/ArrayList;)V", ViewProps.POSITION, "setSelectedPosition", "(I)V", "Lcom/transsnet/palmpay/airtime/ui/view/DailyFlashSalesView$OnDailyFlashSalesListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnDailyFlashSalesListener", "(Lcom/transsnet/palmpay/airtime/ui/view/DailyFlashSalesView$OnDailyFlashSalesListener;)V", "Lk9/h;", "c", "Lkotlin/Lazy;", "getMFlashSalesAdapter", "()Lk9/h;", "mFlashSalesAdapter", "a", "OnDailyFlashSalesListener", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyFlashSalesView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyFlashSalesView.kt\ncom/transsnet/palmpay/airtime/ui/view/DailyFlashSalesView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class DailyFlashSalesView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f26582d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0107d f26583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnDailyFlashSalesListener f26584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f26585c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/view/DailyFlashSalesView$OnDailyFlashSalesListener;", "", "onItemClick", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/transsnet/palmpay/airtime/bean/rsp/FlashSalesProductsDataBean;", ViewProps.POSITION, "", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnDailyFlashSalesListener {
        void onItemClick(@NotNull FlashSalesProductsDataBean data, int position);
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DailyFlashSalesView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(DailyFlashSalesView dailyFlashSalesView, j jVar, View view, int i7) {
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        FlashSalesProductsDataBean flashSalesProductsDataBean = (FlashSalesProductsDataBean) dailyFlashSalesView.getMFlashSalesAdapter().getItem(i7);
        OnDailyFlashSalesListener onDailyFlashSalesListener = dailyFlashSalesView.f26584b;
        if (onDailyFlashSalesListener != null) {
            onDailyFlashSalesListener.onItemClick(flashSalesProductsDataBean, i7);
        }
    }

    private final h getMFlashSalesAdapter() {
        return (h) this.f26585c.getValue();
    }

    public final void setList(@Nullable ArrayList<FlashSalesProductsDataBean> products) {
        if (products != null) {
            if (products.isEmpty()) {
                products = null;
            }
            if (products != null) {
                getMFlashSalesAdapter().setList(products);
                return;
            }
        }
        getMFlashSalesAdapter().setList(new ArrayList());
    }

    public final void setOnDailyFlashSalesListener(@NotNull OnDailyFlashSalesListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f26584b = listener;
    }

    public final void setSelectedPosition(int position) {
        getMFlashSalesAdapter().notifyDataSetChanged();
    }

    public final void setTitle(@Nullable String title) {
        C0107d c0107d;
        TextView textView;
        if (TextUtils.isEmpty(title) || (c0107d = this.f26583a) == null || (textView = (TextView) c0107d.f683e) == null) {
            return;
        }
        textView.setText(title);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DailyFlashSalesView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyFlashSalesView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26585c = C2131j.b(new d(23));
        View viewInflate = LayoutInflater.from(getContext()).inflate(Pd.d.qt_airtime_layout_daily_flash_sales, this);
        int i10 = c.atua_pick_special_amount_rcv;
        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
        if (recyclerView != null) {
            i10 = c.iv_airtime_flash_sale_question_icon;
            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, viewInflate);
            if (iconicsImageView != null) {
                i10 = c.tv_title_daily_flash_sales;
                TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                if (textView != null) {
                    this.f26583a = new C0107d(viewInflate, recyclerView, iconicsImageView, textView, 16);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
                    C0107d c0107d = this.f26583a;
                    if (c0107d != null) {
                        ((RecyclerView) c0107d.f681c).addItemDecoration(new p114h9.a(getContext().getColor(b.ppColorDisabled), getContext().getColor(b.ppColorPrimary)));
                    }
                    C0107d c0107d2 = this.f26583a;
                    if (c0107d2 != null) {
                        ((RecyclerView) c0107d2.f681c).setAdapter(getMFlashSalesAdapter());
                    }
                    getMFlashSalesAdapter().setOnItemClickListener(new C1794b(this, 16));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
