package com.transsnet.palmpay.account.ui.dialog;

import C0.AbstractC0130w;
import F8.d;
import F8.e;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.transsnet.palmpay.account.ui.dialog.GetBvnMethodDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.PhoneUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/account/ui/dialog/GetBvnMethodDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "LC0/w;", "mNavController", "<init>", "(Landroid/content/Context;LC0/w;)V", "", "initViews", "()V", "LC0/w;", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetBvnMethodDialog extends b {

    @Nullable
    private AbstractC0130w mNavController;

    public GetBvnMethodDialog(@Nullable Context context, @Nullable AbstractC0130w abstractC0130w) {
        super(context, e.ac_dialog_get_bvn_method);
        this.mNavController = abstractC0130w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(GetBvnMethodDialog getBvnMethodDialog, View view) {
        getBvnMethodDialog.dismiss();
        AbstractC0130w abstractC0130w = getBvnMethodDialog.mNavController;
        if (abstractC0130w != null) {
            abstractC0130w.h(d.fragment_identity_verification_get_bvn, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(GetBvnMethodDialog getBvnMethodDialog, View view) {
        getBvnMethodDialog.dismiss();
        PhoneUtils.dial("*565*0" + Uri.encode("#"));
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        showAtBottom(getWindow());
        TextView textView = (TextView) findViewById(d.tv11);
        if (textView != null) {
            textView.setText(new SpanUtils().append("Dial").append(" *565*0# ").append("to get").create());
        }
        final int i7 = 0;
        findViewById(d.layout2).setOnClickListener(new View.OnClickListener(this) { // from class: Q8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GetBvnMethodDialog f7638b;

            {
                this.f7638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        GetBvnMethodDialog.initViews$lambda$0(this.f7638b, view);
                        break;
                    case 1:
                        this.f7638b.dismiss();
                        break;
                    default:
                        GetBvnMethodDialog.initViews$lambda$2(this.f7638b, view);
                        break;
                }
            }
        });
        final int i10 = 1;
        findViewById(d.ivClose).setOnClickListener(new View.OnClickListener(this) { // from class: Q8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GetBvnMethodDialog f7638b;

            {
                this.f7638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        GetBvnMethodDialog.initViews$lambda$0(this.f7638b, view);
                        break;
                    case 1:
                        this.f7638b.dismiss();
                        break;
                    default:
                        GetBvnMethodDialog.initViews$lambda$2(this.f7638b, view);
                        break;
                }
            }
        });
        final int i11 = 2;
        findViewById(d.layout1).setOnClickListener(new View.OnClickListener(this) { // from class: Q8.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GetBvnMethodDialog f7638b;

            {
                this.f7638b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        GetBvnMethodDialog.initViews$lambda$0(this.f7638b, view);
                        break;
                    case 1:
                        this.f7638b.dismiss();
                        break;
                    default:
                        GetBvnMethodDialog.initViews$lambda$2(this.f7638b, view);
                        break;
                }
            }
        });
    }
}
