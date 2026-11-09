package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.custom_view.interfac.OnRvItemClickListener;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLReceiveAccountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/core/bean/PaymentMethod;", "Lkotlin/collections/ArrayList;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "selectedIndex", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;I)V", "", "initView", "()V", "setListener", "initViews", "Lcom/transsnet/palmpay/custom_view/interfac/OnRvItemClickListener;", "selectedListener", "setSelectedBtListener", "(Lcom/transsnet/palmpay/custom_view/interfac/OnRvItemClickListener;)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "Ljava/util/ArrayList;", "I", "Landroidx/recyclerview/widget/RecyclerView;", "bw_receive_account_rv$delegate", "Lkotlin/Lazy;", "getBw_receive_account_rv", "()Landroidx/recyclerview/widget/RecyclerView;", "bw_receive_account_rv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "Lxb/t;", "mAdapter", "Lxb/t;", "mSelectedListener", "Lcom/transsnet/palmpay/custom_view/interfac/OnRvItemClickListener;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLReceiveAccountDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: bw_receive_account_rv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bw_receive_account_rv;

    @NotNull
    private final ArrayList<PaymentMethod> data;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private p351xb.t mAdapter;

    @Nullable
    private OnRvItemClickListener mSelectedListener;
    private int selectedIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLReceiveAccountDialog(@NotNull Context context, @NotNull ArrayList<PaymentMethod> data, int i7) {
        super(context, Ya.f.cs_cl_receive_account_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.selectedIndex = i7;
        final int i10 = 0;
        this.bw_receive_account_rv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLReceiveAccountDialog f30060b;

            {
                this.f30060b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLReceiveAccountDialog.bw_receive_account_rv_delegate$lambda$0(this.f30060b);
                    default:
                        return CLReceiveAccountDialog.ivClose_delegate$lambda$1(this.f30060b);
                }
            }
        });
        final int i11 = 1;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.W

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLReceiveAccountDialog f30060b;

            {
                this.f30060b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLReceiveAccountDialog.bw_receive_account_rv_delegate$lambda$0(this.f30060b);
                    default:
                        return CLReceiveAccountDialog.ivClose_delegate$lambda$1(this.f30060b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView bw_receive_account_rv_delegate$lambda$0(CLReceiveAccountDialog cLReceiveAccountDialog) {
        return (RecyclerView) cLReceiveAccountDialog.findViewById(Ya.e.bw_receive_account_rv);
    }

    private final RecyclerView getBw_receive_account_rv() {
        return (RecyclerView) this.bw_receive_account_rv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final void initView() {
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        this.mAdapter = new p351xb.t(mContext, this.data, this.selectedIndex);
        RecyclerView bw_receive_account_rv = getBw_receive_account_rv();
        if (bw_receive_account_rv != null) {
            bw_receive_account_rv.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        }
        RecyclerView bw_receive_account_rv2 = getBw_receive_account_rv();
        if (bw_receive_account_rv2 != null) {
            bw_receive_account_rv2.setAdapter(this.mAdapter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$1(CLReceiveAccountDialog cLReceiveAccountDialog) {
        return (ImageView) cLReceiveAccountDialog.findViewById(Ya.e.ivClose);
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 3), ivClose);
        }
        p351xb.t tVar = this.mAdapter;
        if (tVar != null) {
            p1.c itemClickListener = new p1.c(this, 20);
            Intrinsics.checkNotNullParameter(itemClickListener, "itemClickListener");
            tVar.f4993c = itemClickListener;
        }
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
        initView();
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

    public final void setSelectedBtListener(@NotNull OnRvItemClickListener selectedListener) {
        Intrinsics.checkNotNullParameter(selectedListener, "selectedListener");
        this.mSelectedListener = selectedListener;
    }
}
