package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.other.CLNoPermissionBean;
import com.transsnet.palmpay.credit.view.CountdownTextView;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0014R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u0004\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcNoPermissionDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/credit/bean/other/CLNoPermissionBean;", "Lkotlin/collections/ArrayList;", "mData", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "Lkotlin/Function0;", "", "closeClickListener", "setOnCloseClickListener", "(Lkotlin/jvm/functions/Function0;)V", "setPermissionClickListener", "setOnSetPermissionClickListener", "setCountdownListener", "setOnSetCountdownListener", "initViews", "()V", "show", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/credit/view/CountdownTextView;", "no_permission_sure_bt$delegate", "Lkotlin/Lazy;", "getNo_permission_sure_bt", "()Lcom/transsnet/palmpay/credit/view/CountdownTextView;", "no_permission_sure_bt", "Landroidx/recyclerview/widget/RecyclerView;", "permission_content_rv$delegate", "getPermission_content_rv", "()Landroidx/recyclerview/widget/RecyclerView;", "permission_content_rv", "Landroid/widget/ImageView;", "no_permission_closeI_img$delegate", "getNo_permission_closeI_img", "()Landroid/widget/ImageView;", "no_permission_closeI_img", "mCloseClickListener", "Lkotlin/jvm/functions/Function0;", "mSetPermissionClickListener", "mSetCountdownListener", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcNoPermissionDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    private Function0<Unit> mCloseClickListener;

    @NotNull
    private final ArrayList<CLNoPermissionBean> mData;

    @NotNull
    private Function0<Unit> mSetCountdownListener;

    @NotNull
    private Function0<Unit> mSetPermissionClickListener;

    /* JADX INFO: renamed from: no_permission_closeI_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy no_permission_closeI_img;

    /* JADX INFO: renamed from: no_permission_sure_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy no_permission_sure_bt;

    /* JADX INFO: renamed from: permission_content_rv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy permission_content_rv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcNoPermissionDialog(@NotNull Context context, @NotNull ArrayList<CLNoPermissionBean> mData) {
        super(context, Ya.f.cs_no_permission_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.mData = mData;
        final int i7 = 0;
        this.no_permission_sure_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcNoPermissionDialog f29931b;

            {
                this.f29931b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcNoPermissionDialog.no_permission_sure_bt_delegate$lambda$0(this.f29931b);
                    case 1:
                        return OcNoPermissionDialog.permission_content_rv_delegate$lambda$1(this.f29931b);
                    default:
                        return OcNoPermissionDialog.no_permission_closeI_img_delegate$lambda$2(this.f29931b);
                }
            }
        });
        final int i10 = 1;
        this.permission_content_rv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcNoPermissionDialog f29931b;

            {
                this.f29931b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcNoPermissionDialog.no_permission_sure_bt_delegate$lambda$0(this.f29931b);
                    case 1:
                        return OcNoPermissionDialog.permission_content_rv_delegate$lambda$1(this.f29931b);
                    default:
                        return OcNoPermissionDialog.no_permission_closeI_img_delegate$lambda$2(this.f29931b);
                }
            }
        });
        final int i11 = 2;
        this.no_permission_closeI_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.A0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcNoPermissionDialog f29931b;

            {
                this.f29931b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcNoPermissionDialog.no_permission_sure_bt_delegate$lambda$0(this.f29931b);
                    case 1:
                        return OcNoPermissionDialog.permission_content_rv_delegate$lambda$1(this.f29931b);
                    default:
                        return OcNoPermissionDialog.no_permission_closeI_img_delegate$lambda$2(this.f29931b);
                }
            }
        });
        this.mCloseClickListener = new com.transsnet.palmpay.core.ui.activity.T(7);
        this.mSetPermissionClickListener = new com.transsnet.palmpay.core.ui.activity.T(8);
        this.mSetCountdownListener = new com.transsnet.palmpay.core.ui.activity.T(9);
    }

    private final ImageView getNo_permission_closeI_img() {
        return (ImageView) this.no_permission_closeI_img.getValue();
    }

    private final CountdownTextView getNo_permission_sure_bt() {
        return (CountdownTextView) this.no_permission_sure_bt.getValue();
    }

    private final RecyclerView getPermission_content_rv() {
        return (RecyclerView) this.permission_content_rv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(OcNoPermissionDialog ocNoPermissionDialog, View view) {
        CountdownTextView no_permission_sure_bt;
        ocNoPermissionDialog.mCloseClickListener.invoke();
        CountdownTextView no_permission_sure_bt2 = ocNoPermissionDialog.getNo_permission_sure_bt();
        if (no_permission_sure_bt2 != null && no_permission_sure_bt2.f30728c && (no_permission_sure_bt = ocNoPermissionDialog.getNo_permission_sure_bt()) != null) {
            com.transsnet.palmpay.credit.view.a aVar = no_permission_sure_bt.f30726a;
            if (aVar != null) {
                aVar.cancel();
            }
            no_permission_sure_bt.b(no_permission_sure_bt.f30727b);
            no_permission_sure_bt.f30728c = false;
        }
        ocNoPermissionDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$7(OcNoPermissionDialog ocNoPermissionDialog, View view) {
        CountdownTextView no_permission_sure_bt;
        ocNoPermissionDialog.mSetPermissionClickListener.invoke();
        CountdownTextView no_permission_sure_bt2 = ocNoPermissionDialog.getNo_permission_sure_bt();
        if (no_permission_sure_bt2 != null && no_permission_sure_bt2.f30728c && (no_permission_sure_bt = ocNoPermissionDialog.getNo_permission_sure_bt()) != null) {
            com.transsnet.palmpay.credit.view.a aVar = no_permission_sure_bt.f30726a;
            if (aVar != null) {
                aVar.cancel();
            }
            no_permission_sure_bt.b(no_permission_sure_bt.f30727b);
            no_permission_sure_bt.f30728c = false;
        }
        ocNoPermissionDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView no_permission_closeI_img_delegate$lambda$2(OcNoPermissionDialog ocNoPermissionDialog) {
        return (ImageView) ocNoPermissionDialog.findViewById(Ya.e.no_permission_closeI_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CountdownTextView no_permission_sure_bt_delegate$lambda$0(OcNoPermissionDialog ocNoPermissionDialog) {
        return (CountdownTextView) ocNoPermissionDialog.findViewById(Ya.e.no_permission_sure_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView permission_content_rv_delegate$lambda$1(OcNoPermissionDialog ocNoPermissionDialog) {
        return (RecyclerView) ocNoPermissionDialog.findViewById(Ya.e.permission_content_rv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(80);
        window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        RecyclerView permission_content_rv = getPermission_content_rv();
        if (permission_content_rv != null) {
            permission_content_rv.setLayoutManager(new LinearLayoutManager(this.mContext, 1, false));
        }
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        p351xb.r rVar = new p351xb.r(mContext, this.mData);
        RecyclerView permission_content_rv2 = getPermission_content_rv();
        if (permission_content_rv2 != null) {
            permission_content_rv2.setAdapter(rVar);
        }
        ImageView no_permission_closeI_img = getNo_permission_closeI_img();
        if (no_permission_closeI_img != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.B0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcNoPermissionDialog f29936b;

                {
                    this.f29936b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            OcNoPermissionDialog.initViews$lambda$6(this.f29936b, view);
                            break;
                        default:
                            OcNoPermissionDialog.initViews$lambda$7(this.f29936b, view);
                            break;
                    }
                }
            }, no_permission_closeI_img);
        }
        CountdownTextView no_permission_sure_bt = getNo_permission_sure_bt();
        if (no_permission_sure_bt != null) {
            Intrinsics.checkNotNullParameter("Agree", "customText");
            no_permission_sure_bt.f30730e = "Agree";
            long j6 = 3 * ((long) 1000);
            no_permission_sure_bt.f30727b = j6;
            no_permission_sure_bt.b(j6);
        }
        CountdownTextView no_permission_sure_bt2 = getNo_permission_sure_bt();
        if (no_permission_sure_bt2 != null) {
            no_permission_sure_bt2.setCountdownListener(new C0(this));
        }
        CountdownTextView no_permission_sure_bt3 = getNo_permission_sure_bt();
        if (no_permission_sure_bt3 != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.B0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcNoPermissionDialog f29936b;

                {
                    this.f29936b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            OcNoPermissionDialog.initViews$lambda$6(this.f29936b, view);
                            break;
                        default:
                            OcNoPermissionDialog.initViews$lambda$7(this.f29936b, view);
                            break;
                    }
                }
            }, no_permission_sure_bt3);
        }
    }

    public final void setOnCloseClickListener(@NotNull Function0<Unit> closeClickListener) {
        Intrinsics.checkNotNullParameter(closeClickListener, "closeClickListener");
        this.mCloseClickListener = closeClickListener;
    }

    public final void setOnSetCountdownListener(@NotNull Function0<Unit> setCountdownListener) {
        Intrinsics.checkNotNullParameter(setCountdownListener, "setCountdownListener");
        this.mSetCountdownListener = setCountdownListener;
    }

    public final void setOnSetPermissionClickListener(@NotNull Function0<Unit> setPermissionClickListener) {
        Intrinsics.checkNotNullParameter(setPermissionClickListener, "setPermissionClickListener");
        this.mSetPermissionClickListener = setPermissionClickListener;
    }

    @Override // O6.f, android.app.Dialog
    public void show() {
        super.show();
        CountdownTextView no_permission_sure_bt = getNo_permission_sure_bt();
        if (no_permission_sure_bt != null) {
            com.transsnet.palmpay.credit.view.a aVar = no_permission_sure_bt.f30726a;
            if (aVar != null) {
                aVar.cancel();
            }
            com.transsnet.palmpay.credit.view.a aVar2 = new com.transsnet.palmpay.credit.view.a(no_permission_sure_bt, no_permission_sure_bt.f30727b);
            no_permission_sure_bt.f30726a = aVar2;
            aVar2.start();
            no_permission_sure_bt.f30728c = true;
        }
    }
}
