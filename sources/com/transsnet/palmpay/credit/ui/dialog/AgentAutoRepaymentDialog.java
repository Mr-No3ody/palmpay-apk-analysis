package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/AgentAutoRepaymentDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/ui/dialog/AgentAutoRepaymentDialogListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/ui/dialog/AgentAutoRepaymentDialogListener;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/credit/ui/dialog/AgentAutoRepaymentDialogListener;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAgentAutoRepaymentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentAutoRepaymentDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/AgentAutoRepaymentDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class AgentAutoRepaymentDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private AgentAutoRepaymentDialogListener listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AgentAutoRepaymentDialog(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(AgentAutoRepaymentDialog agentAutoRepaymentDialog, View view) {
        int id2 = view.getId();
        if (id2 != Ya.e.tv_agree) {
            if (id2 == Ya.e.ii_close) {
                agentAutoRepaymentDialog.dismiss();
            }
        } else {
            AgentAutoRepaymentDialogListener agentAutoRepaymentDialogListener = agentAutoRepaymentDialog.listener;
            if (agentAutoRepaymentDialogListener != null) {
                agentAutoRepaymentDialogListener.onConfirm();
            }
            agentAutoRepaymentDialog.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(Ya.f.cs_dialog_agent_auto_repayment);
        View viewFindViewById = findViewById(Ya.e.ii_close);
        p220oa.h.q(new Yd.i(this, 27), (TextView) findViewById(Ya.e.tv_agree), viewFindViewById);
    }

    public /* synthetic */ AgentAutoRepaymentDialog(Context context, AgentAutoRepaymentDialogListener agentAutoRepaymentDialogListener, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : agentAutoRepaymentDialogListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AgentAutoRepaymentDialog(@NotNull Context context, @Nullable AgentAutoRepaymentDialogListener agentAutoRepaymentDialogListener) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (agentAutoRepaymentDialogListener != null) {
            this.listener = agentAutoRepaymentDialogListener;
        }
    }
}
