package com.transsnet.palmpay.custom_view.input;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.dialog.BasePopupWindow;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.custom_view.t;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0010J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0007J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\rH\u0016R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/transsnet/palmpay/custom_view/input/OperatorSelectNewPopWindow;", "Lcom/transsnet/palmpay/custom_view/dialog/BasePopupWindow;", "context", "Landroid/content/Context;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "ignore", "", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$Adapter;Z)V", "contentView", "Landroid/view/View;", "width", "", "height", "focusable", "(Landroid/view/View;IIZ)V", "apw_rcv", "Landroidx/recyclerview/widget/RecyclerView;", "getApw_rcv", "()Landroidx/recyclerview/widget/RecyclerView;", "apw_rcv$delegate", "Lkotlin/Lazy;", "isIgnoreSuspend", "initViews", "", "init", "setIgnoreSuspend", "showAsDropDown", "view", "xoff", "yoff", "gravity", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OperatorSelectNewPopWindow extends BasePopupWindow {

    /* JADX INFO: renamed from: apw_rcv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy apw_rcv;
    private boolean isIgnoreSuspend;

    public /* synthetic */ OperatorSelectNewPopWindow(Context context, RecyclerView.Adapter adapter, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, adapter, (i7 & 4) != 0 ? false : z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView apw_rcv_delegate$lambda$0(OperatorSelectNewPopWindow operatorSelectNewPopWindow) {
        return (RecyclerView) operatorSelectNewPopWindow.mContentView.findViewById(s.apw_rcv);
    }

    private final RecyclerView getApw_rcv() {
        Object value = this.apw_rcv.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public void init() {
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BasePopupWindow
    public void initViews() {
    }

    public final void setIgnoreSuspend(boolean ignore) {
        this.isIgnoreSuspend = ignore;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(@NotNull View view, int xoff, int yoff, int gravity) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.showAsDropDown(view, xoff, yoff, gravity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorSelectNewPopWindow(@NotNull Context context, @NotNull RecyclerView.Adapter<?> adapter, boolean z3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.apw_rcv = C2131j.b(new X6.c(this, 23));
        View viewInflate = LayoutInflater.from(this.mContext).inflate(t.cv_pop_window_select_operator, (ViewGroup) null, false);
        this.mContentView = viewInflate;
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-2);
        setFocusable(true);
        this.isIgnoreSuspend = z3;
        getApw_rcv().setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        RecyclerView apw_rcv = getApw_rcv();
        C1548f c1548f = new C1548f(context.getColor(L6.b.ppColorDividerLine), DensityUtil.dp2px(1.0f));
        c1548f.f31336e = false;
        apw_rcv.addItemDecoration(c1548f);
        setBackgroundDrawable(new ColorDrawable(0));
        getApw_rcv().setAdapter(adapter);
    }

    public OperatorSelectNewPopWindow(@Nullable View view, int i7, int i10, boolean z3) {
        super(view, i7, i10, z3);
        this.apw_rcv = C2131j.b(new X6.c(this, 23));
    }
}
