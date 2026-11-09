package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.credit.bean.other.CLNoPermissionBean;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLNoPermissionDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Ljava/util/ArrayList;", "Lcom/transsnet/palmpay/credit/bean/other/CLNoPermissionBean;", "Lkotlin/collections/ArrayList;", "mData", "<init>", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/credit/ui/dialog/CLNoPermissionDialog$NoPermissionDialogInterface;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/transsnet/palmpay/credit/ui/dialog/CLNoPermissionDialog$NoPermissionDialogInterface;)V", "Ljava/util/ArrayList;", "Landroid/widget/Button;", "no_permission_sure_bt$delegate", "Lkotlin/Lazy;", "getNo_permission_sure_bt", "()Landroid/widget/Button;", "no_permission_sure_bt", "Landroidx/recyclerview/widget/RecyclerView;", "permission_content_rv$delegate", "getPermission_content_rv", "()Landroidx/recyclerview/widget/RecyclerView;", "permission_content_rv", "Landroid/widget/ImageView;", "no_permission_closeI_img$delegate", "getNo_permission_closeI_img", "()Landroid/widget/ImageView;", "no_permission_closeI_img", "mListener", "Lcom/transsnet/palmpay/credit/ui/dialog/CLNoPermissionDialog$NoPermissionDialogInterface;", "NoPermissionDialogInterface", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLNoPermissionDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    private final ArrayList<CLNoPermissionBean> mData;

    @Nullable
    private NoPermissionDialogInterface mListener;

    /* JADX INFO: renamed from: no_permission_closeI_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy no_permission_closeI_img;

    /* JADX INFO: renamed from: no_permission_sure_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy no_permission_sure_bt;

    /* JADX INFO: renamed from: permission_content_rv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy permission_content_rv;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLNoPermissionDialog$NoPermissionDialogInterface;", "", "negativeClick", "", "positiveClick", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface NoPermissionDialogInterface {
        void negativeClick();

        void positiveClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLNoPermissionDialog(@NotNull Context context, @NotNull ArrayList<CLNoPermissionBean> mData) {
        super(context, Ya.f.cs_cl_no_permission_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mData, "mData");
        this.mData = mData;
        final int i7 = 0;
        this.no_permission_sure_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLNoPermissionDialog f29993b;

            {
                this.f29993b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLNoPermissionDialog.no_permission_sure_bt_delegate$lambda$0(this.f29993b);
                    case 1:
                        return CLNoPermissionDialog.permission_content_rv_delegate$lambda$1(this.f29993b);
                    default:
                        return CLNoPermissionDialog.no_permission_closeI_img_delegate$lambda$2(this.f29993b);
                }
            }
        });
        final int i10 = 1;
        this.permission_content_rv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLNoPermissionDialog f29993b;

            {
                this.f29993b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLNoPermissionDialog.no_permission_sure_bt_delegate$lambda$0(this.f29993b);
                    case 1:
                        return CLNoPermissionDialog.permission_content_rv_delegate$lambda$1(this.f29993b);
                    default:
                        return CLNoPermissionDialog.no_permission_closeI_img_delegate$lambda$2(this.f29993b);
                }
            }
        });
        final int i11 = 2;
        this.no_permission_closeI_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.L

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLNoPermissionDialog f29993b;

            {
                this.f29993b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLNoPermissionDialog.no_permission_sure_bt_delegate$lambda$0(this.f29993b);
                    case 1:
                        return CLNoPermissionDialog.permission_content_rv_delegate$lambda$1(this.f29993b);
                    default:
                        return CLNoPermissionDialog.no_permission_closeI_img_delegate$lambda$2(this.f29993b);
                }
            }
        });
    }

    private final ImageView getNo_permission_closeI_img() {
        return (ImageView) this.no_permission_closeI_img.getValue();
    }

    private final Button getNo_permission_sure_bt() {
        return (Button) this.no_permission_sure_bt.getValue();
    }

    private final RecyclerView getPermission_content_rv() {
        return (RecyclerView) this.permission_content_rv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$4(CLNoPermissionDialog cLNoPermissionDialog, View view) {
        NoPermissionDialogInterface noPermissionDialogInterface = cLNoPermissionDialog.mListener;
        if (noPermissionDialogInterface != null) {
            noPermissionDialogInterface.positiveClick();
        }
        cLNoPermissionDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView no_permission_closeI_img_delegate$lambda$2(CLNoPermissionDialog cLNoPermissionDialog) {
        return (ImageView) cLNoPermissionDialog.findViewById(Ya.e.no_permission_closeI_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button no_permission_sure_bt_delegate$lambda$0(CLNoPermissionDialog cLNoPermissionDialog) {
        return (Button) cLNoPermissionDialog.findViewById(Ya.e.no_permission_sure_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView permission_content_rv_delegate$lambda$1(CLNoPermissionDialog cLNoPermissionDialog) {
        return (RecyclerView) cLNoPermissionDialog.findViewById(Ya.e.permission_content_rv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
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
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.M

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLNoPermissionDialog f29997b;

                {
                    this.f29997b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29997b.dismiss();
                            break;
                        default:
                            CLNoPermissionDialog.initViews$lambda$4(this.f29997b, view);
                            break;
                    }
                }
            }, no_permission_closeI_img);
        }
        Button no_permission_sure_bt = getNo_permission_sure_bt();
        if (no_permission_sure_bt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.M

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLNoPermissionDialog f29997b;

                {
                    this.f29997b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29997b.dismiss();
                            break;
                        default:
                            CLNoPermissionDialog.initViews$lambda$4(this.f29997b, view);
                            break;
                    }
                }
            }, no_permission_sure_bt);
        }
    }

    public final void setListener(@Nullable NoPermissionDialogInterface listener) {
        this.mListener = listener;
    }
}
