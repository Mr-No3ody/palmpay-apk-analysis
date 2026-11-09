package com.transsnet.palmpay.send_money.ui.dialog;

import C0.G;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.bean.RecipientBeanV2;
import com.transsnet.palmpay.send_money.bean.RecipientListResp;
import com.transsnet.palmpay.send_money.bean.resp.RecipientMemberLogOutResp;
import com.transsnet.palmpay.send_money.ui.dialog.AccountUnavailableDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159kd.e;
import p159kd.f;
import p223od.n;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/AccountUnavailableDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/send_money/bean/RecipientListResp$RecipientBean;", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "setData", "(Lcom/transsnet/palmpay/send_money/bean/RecipientListResp$RecipientBean;)V", "Lcom/transsnet/palmpay/send_money/bean/RecipientBeanV2;", "(Lcom/transsnet/palmpay/send_money/bean/RecipientBeanV2;)V", "Lcom/transsnet/palmpay/send_money/bean/resp/RecipientMemberLogOutResp;", "setDialogInfo", "(Lcom/transsnet/palmpay/send_money/bean/resp/RecipientMemberLogOutResp;)V", "Lcom/transsnet/palmpay/send_money/ui/dialog/AccountUnavailableDialog$OnAccountUnavailableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/transsnet/palmpay/send_money/ui/dialog/AccountUnavailableDialog$OnAccountUnavailableListener;)V", "Lod/n;", "binding", "Lod/n;", "Lcom/transsnet/palmpay/send_money/ui/dialog/AccountUnavailableDialog$OnAccountUnavailableListener;", "OnAccountUnavailableListener", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAccountUnavailableDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountUnavailableDialog.kt\ncom/transsnet/palmpay/send_money/ui/dialog/AccountUnavailableDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
public final class AccountUnavailableDialog extends b {

    @Nullable
    private n binding;

    @Nullable
    private OnAccountUnavailableListener listener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/AccountUnavailableDialog$OnAccountUnavailableListener;", "", "onRemoveClick", "", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnAccountUnavailableListener {
        void onRemoveClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUnavailableDialog(@NotNull Context context) {
        super(context, f.sm_dialog_add_from_contacts);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(AccountUnavailableDialog accountUnavailableDialog, View view) {
        accountUnavailableDialog.dismiss();
        OnAccountUnavailableListener onAccountUnavailableListener = accountUnavailableDialog.listener;
        if (onAccountUnavailableListener != null) {
            onAccountUnavailableListener.onRemoveClick();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewInflate = getLayoutInflater().inflate(f.sm_dialog_account_unavailable, (ViewGroup) null, false);
        int i7 = e.btnNo;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null) {
            i7 = e.btnRemove;
            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView2 != null) {
                i7 = e.iivClose;
                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = e.ivAvatar;
                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = e.tvInfo;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView3 != null) {
                            i7 = e.tvName;
                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView4 != null) {
                                i7 = e.tvTips;
                                TextView textView5 = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView5 != null) {
                                    i7 = e.tvTitle;
                                    TextView textView6 = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView6 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.binding = new n(constraintLayout, textView, textView2, iconicsImageView, imageView, textView3, textView4, textView5, textView6);
                                        if (constraintLayout != null) {
                                            setContentView(constraintLayout);
                                        }
                                        n nVar = this.binding;
                                        if (nVar != null) {
                                            final int i10 = 0;
                                            nVar.f40431d.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.a

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ AccountUnavailableDialog f199b;

                                                {
                                                    this.f199b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i10) {
                                                        case 0:
                                                            this.f199b.dismiss();
                                                            break;
                                                        case 1:
                                                            this.f199b.dismiss();
                                                            break;
                                                        default:
                                                            AccountUnavailableDialog.initViews$lambda$3(this.f199b, view);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        n nVar2 = this.binding;
                                        if (nVar2 != null) {
                                            final int i11 = 1;
                                            nVar2.f40429b.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.a

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ AccountUnavailableDialog f199b;

                                                {
                                                    this.f199b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i11) {
                                                        case 0:
                                                            this.f199b.dismiss();
                                                            break;
                                                        case 1:
                                                            this.f199b.dismiss();
                                                            break;
                                                        default:
                                                            AccountUnavailableDialog.initViews$lambda$3(this.f199b, view);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        n nVar3 = this.binding;
                                        if (nVar3 != null) {
                                            final int i12 = 2;
                                            nVar3.f40430c.setOnClickListener(new View.OnClickListener(this) { // from class: Ad.a

                                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                                public final /* synthetic */ AccountUnavailableDialog f199b;

                                                {
                                                    this.f199b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i12) {
                                                        case 0:
                                                            this.f199b.dismiss();
                                                            break;
                                                        case 1:
                                                            this.f199b.dismiss();
                                                            break;
                                                        default:
                                                            AccountUnavailableDialog.initViews$lambda$3(this.f199b, view);
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    public final void setData(@Nullable RecipientListResp.RecipientBean info) {
        TextView textView;
        TextView textView2;
        if (info != null) {
            n nVar = this.binding;
            if (nVar != null && (textView2 = nVar.f40434g) != null) {
                textView2.setText(info.getRecipientNickname());
            }
            n nVar2 = this.binding;
            if (nVar2 != null && (textView = nVar2.f40433f) != null) {
                String recipientAccountNumber = info.getRecipientAccountNumber();
                Intrinsics.checkNotNullExpressionValue(recipientAccountNumber, "getRecipientAccountNumber(...)");
                textView.setText(r0.w(recipientAccountNumber));
            }
            n nVar3 = this.binding;
            r0.o1(info.getRecipientHeadImage(), nVar3 != null ? nVar3.f40432e : null);
        }
    }

    public final void setDialogInfo(@NotNull RecipientMemberLogOutResp info) {
        TextView textView;
        TextView textView2;
        Intrinsics.checkNotNullParameter(info, "info");
        n nVar = this.binding;
        if (nVar != null && (textView2 = nVar.f40436j) != null) {
            textView2.setText(info.getTitle());
        }
        n nVar2 = this.binding;
        if (nVar2 == null || (textView = nVar2.f40435i) == null) {
            return;
        }
        textView.setText(info.getContent());
    }

    public final void setListener(@NotNull OnAccountUnavailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setData(@Nullable RecipientBeanV2 info) {
        TextView textView;
        String ppAccountNo;
        String strW;
        String phone;
        TextView textView2;
        if (info != null) {
            n nVar = this.binding;
            if (nVar != null && (textView2 = nVar.f40434g) != null) {
                textView2.setText(info.getFullName());
            }
            n nVar2 = this.binding;
            if (nVar2 != null && (textView = nVar2.f40433f) != null) {
                if (!TextUtils.isEmpty(info.getPpAccountNo()) ? (ppAccountNo = info.getPpAccountNo()) == null || (strW = r0.w(ppAccountNo)) == null : (phone = info.getPhone()) == null || (strW = r0.w(phone)) == null) {
                    strW = "";
                }
                textView.setText(strW + (TextUtils.isEmpty(info.getPalmPayTag()) ? "" : G.o(" ", info.getPalmPayTag())));
            }
            n nVar3 = this.binding;
            r0.m1(info.getHeadPortrait(), nVar3 != null ? nVar3.f40432e : null);
        }
    }
}
