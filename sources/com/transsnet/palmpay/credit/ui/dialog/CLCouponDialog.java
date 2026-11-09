package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.messaging.Constants;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.credit.bean.resp.CLBorrowCouponData;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u001d\u0010%\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001d\u0010/\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLCouponDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/credit/bean/resp/CLBorrowCouponData;", "Lkotlin/collections/ArrayList;", "couponData", "", "selectedIndex", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;I)V", "", "setListener", "()V", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setData", "(Ljava/util/List;)V", "initViews", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setConfirmListener", "(Landroid/view/View$OnClickListener;)V", "getSelectedIndex", "()I", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "Ljava/util/ArrayList;", "I", "Landroid/widget/Button;", "coupon_confirm_bt$delegate", "Lkotlin/Lazy;", "getCoupon_confirm_bt", "()Landroid/widget/Button;", "coupon_confirm_bt", "Landroidx/recyclerview/widget/RecyclerView;", "coupon_rv$delegate", "getCoupon_rv", "()Landroidx/recyclerview/widget/RecyclerView;", "coupon_rv", "Landroid/widget/ImageView;", "cdsc_close_iv$delegate", "getCdsc_close_iv", "()Landroid/widget/ImageView;", "cdsc_close_iv", "Lxb/h;", "couponAdapter", "Lxb/h;", "confirmListener", "Landroid/view/View$OnClickListener;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLCouponDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: cdsc_close_iv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdsc_close_iv;

    @Nullable
    private View.OnClickListener confirmListener;

    @Nullable
    private p351xb.h couponAdapter;

    @NotNull
    private final ArrayList<CLBorrowCouponData> couponData;

    /* JADX INFO: renamed from: coupon_confirm_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coupon_confirm_bt;

    /* JADX INFO: renamed from: coupon_rv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coupon_rv;
    private int selectedIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLCouponDialog(@NotNull Context context, @NotNull ArrayList<CLBorrowCouponData> couponData, int i7) {
        super(context, Ya.f.cs_cl_coupon_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(couponData, "couponData");
        this.couponData = couponData;
        this.selectedIndex = i7;
        final int i10 = 0;
        this.coupon_confirm_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCouponDialog f30171b;

            {
                this.f30171b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLCouponDialog.coupon_confirm_bt_delegate$lambda$0(this.f30171b);
                    case 1:
                        return CLCouponDialog.coupon_rv_delegate$lambda$1(this.f30171b);
                    default:
                        return CLCouponDialog.cdsc_close_iv_delegate$lambda$2(this.f30171b);
                }
            }
        });
        final int i11 = 1;
        this.coupon_rv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCouponDialog f30171b;

            {
                this.f30171b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLCouponDialog.coupon_confirm_bt_delegate$lambda$0(this.f30171b);
                    case 1:
                        return CLCouponDialog.coupon_rv_delegate$lambda$1(this.f30171b);
                    default:
                        return CLCouponDialog.cdsc_close_iv_delegate$lambda$2(this.f30171b);
                }
            }
        });
        final int i12 = 2;
        this.cdsc_close_iv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLCouponDialog f30171b;

            {
                this.f30171b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLCouponDialog.coupon_confirm_bt_delegate$lambda$0(this.f30171b);
                    case 1:
                        return CLCouponDialog.coupon_rv_delegate$lambda$1(this.f30171b);
                    default:
                        return CLCouponDialog.cdsc_close_iv_delegate$lambda$2(this.f30171b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView cdsc_close_iv_delegate$lambda$2(CLCouponDialog cLCouponDialog) {
        return (ImageView) cLCouponDialog.findViewById(Ya.e.cdsc_close_iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button coupon_confirm_bt_delegate$lambda$0(CLCouponDialog cLCouponDialog) {
        return (Button) cLCouponDialog.findViewById(Ya.e.coupon_confirm_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView coupon_rv_delegate$lambda$1(CLCouponDialog cLCouponDialog) {
        return (RecyclerView) cLCouponDialog.findViewById(Ya.e.coupon_rv);
    }

    private final ImageView getCdsc_close_iv() {
        return (ImageView) this.cdsc_close_iv.getValue();
    }

    private final Button getCoupon_confirm_bt() {
        return (Button) this.coupon_confirm_bt.getValue();
    }

    private final RecyclerView getCoupon_rv() {
        return (RecyclerView) this.coupon_rv.getValue();
    }

    private final void setData(List<CLBorrowCouponData> data) {
        this.couponData.clear();
        this.couponData.addAll(data);
    }

    private final void setListener() {
        ImageView cdsc_close_iv = getCdsc_close_iv();
        if (cdsc_close_iv != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLCouponDialog f30177b;

                {
                    this.f30177b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CLCouponDialog.setListener$lambda$4(this.f30177b, view);
                            break;
                        default:
                            CLCouponDialog.setListener$lambda$5(this.f30177b, view);
                            break;
                    }
                }
            }, cdsc_close_iv);
        }
        p351xb.h hVar = this.couponAdapter;
        if (hVar != null) {
            org.greenrobot.eventbus.f itemClickListener = new org.greenrobot.eventbus.f(this, 13);
            Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            hVar.f43774e = itemClickListener;
        }
        Button coupon_confirm_bt = getCoupon_confirm_bt();
        if (coupon_confirm_bt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.p

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLCouponDialog f30177b;

                {
                    this.f30177b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            CLCouponDialog.setListener$lambda$4(this.f30177b, view);
                            break;
                        default:
                            CLCouponDialog.setListener$lambda$5(this.f30177b, view);
                            break;
                    }
                }
            }, coupon_confirm_bt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$4(CLCouponDialog cLCouponDialog, View view) {
        View.OnClickListener onClickListener = cLCouponDialog.confirmListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        cLCouponDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$5(CLCouponDialog cLCouponDialog, View view) {
        View.OnClickListener onClickListener = cLCouponDialog.confirmListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        cLCouponDialog.dismiss();
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        this.couponAdapter = new p351xb.h(mContext, this.couponData, this.selectedIndex);
        RecyclerView coupon_rv = getCoupon_rv();
        if (coupon_rv != null) {
            coupon_rv.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        }
        RecyclerView coupon_rv2 = getCoupon_rv();
        if (coupon_rv2 != null) {
            coupon_rv2.addItemDecoration(new C1548f(this.mContext.getColor(com.transsnet.palmpay.custom_view.p.transparent), DensityUtil.dp2px(18.0f)));
        }
        RecyclerView coupon_rv3 = getCoupon_rv();
        if (coupon_rv3 != null) {
            coupon_rv3.setAdapter(this.couponAdapter);
        }
        setListener();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        View decorView3;
        super.onWindowFocusChanged(hasFocus);
        if (!hasFocus || getWindow() == null) {
            return;
        }
        Window window3 = getWindow();
        if (((window3 == null || (decorView3 = window3.getDecorView()) == null || decorView3.getHeight() != 0) && ((window = getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getWidth() != 0)) || (window2 = getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        decorView2.requestLayout();
    }

    public final void setConfirmListener(@Nullable View.OnClickListener listener) {
        this.confirmListener = listener;
    }
}
