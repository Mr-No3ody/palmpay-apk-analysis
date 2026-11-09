package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.credit.bean.rsp.SysConfigValue;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001+B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/PreferredLanguageDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "datas", "Lcom/transsnet/palmpay/credit/ui/dialog/PreferredLanguageDialog$OnConfirmLanguageListener;", "onConfirmLanguageListener", "<init>", "(Landroid/content/Context;Ljava/util/List;Lcom/transsnet/palmpay/credit/ui/dialog/PreferredLanguageDialog$OnConfirmLanguageListener;)V", "", "findViews", "()V", "initViews", "Ljava/util/List;", "getDatas", "()Ljava/util/List;", "Lcom/transsnet/palmpay/credit/ui/dialog/PreferredLanguageDialog$OnConfirmLanguageListener;", "getOnConfirmLanguageListener", "()Lcom/transsnet/palmpay/credit/ui/dialog/PreferredLanguageDialog$OnConfirmLanguageListener;", "Landroid/widget/TextView;", "tv_apply", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "rv_language", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/ImageView;", "close", "Landroid/widget/ImageView;", "Lwb/s;", "mAdapter", "Lwb/s;", "getMAdapter", "()Lwb/s;", "setMAdapter", "(Lwb/s;)V", "mSelectedLanguage", "Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "getMSelectedLanguage", "()Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "setMSelectedLanguage", "(Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;)V", "OnConfirmLanguageListener", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreferredLanguageDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private ImageView close;

    @NotNull
    private final List<SysConfigValue> datas;

    @Nullable
    private p339wb.s mAdapter;

    @Nullable
    private SysConfigValue mSelectedLanguage;

    @NotNull
    private final OnConfirmLanguageListener onConfirmLanguageListener;

    @Nullable
    private RecyclerView rv_language;

    @Nullable
    private TextView tv_apply;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/PreferredLanguageDialog$OnConfirmLanguageListener;", "", "onConfirmLanguage", "", "language", "Lcom/transsnet/palmpay/credit/bean/rsp/SysConfigValue;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnConfirmLanguageListener {
        void onConfirmLanguage(@Nullable SysConfigValue language);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferredLanguageDialog(@Nullable Context context, @NotNull List<SysConfigValue> datas, @NotNull OnConfirmLanguageListener onConfirmLanguageListener) {
        super(context);
        Intrinsics.checkNotNullParameter(datas, "datas");
        Intrinsics.checkNotNullParameter(onConfirmLanguageListener, "onConfirmLanguageListener");
        this.datas = datas;
        this.onConfirmLanguageListener = onConfirmLanguageListener;
    }

    private final void findViews() {
        this.tv_apply = (TextView) findViewById(p116hb.c.tv_apply);
        this.rv_language = (RecyclerView) findViewById(p116hb.c.rv_language);
        this.close = (ImageView) findViewById(p116hb.c.close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(PreferredLanguageDialog preferredLanguageDialog, M1.j jVar, View view, int i7) {
        List<Object> data;
        Intrinsics.checkNotNullParameter(jVar, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        p339wb.s sVar = preferredLanguageDialog.mAdapter;
        SysConfigValue language = (sVar == null || (data = sVar.getData()) == null) ? null : (SysConfigValue) data.get(i7);
        Intrinsics.e(language);
        preferredLanguageDialog.mSelectedLanguage = language;
        p339wb.s sVar2 = preferredLanguageDialog.mAdapter;
        if (sVar2 != null) {
            Intrinsics.checkNotNullParameter(language, "language");
            sVar2.f43387a = language;
            sVar2.notifyDataSetChanged();
        }
        TextView textView = preferredLanguageDialog.tv_apply;
        if (textView != null) {
            textView.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$1(PreferredLanguageDialog preferredLanguageDialog, View view) {
        OnConfirmLanguageListener onConfirmLanguageListener = preferredLanguageDialog.onConfirmLanguageListener;
        if (onConfirmLanguageListener != null) {
            onConfirmLanguageListener.onConfirmLanguage(preferredLanguageDialog.mSelectedLanguage);
        }
        preferredLanguageDialog.dismiss();
    }

    @NotNull
    public final List<SysConfigValue> getDatas() {
        return this.datas;
    }

    @Nullable
    public final p339wb.s getMAdapter() {
        return this.mAdapter;
    }

    @Nullable
    public final SysConfigValue getMSelectedLanguage() {
        return this.mSelectedLanguage;
    }

    @NotNull
    public final OnConfirmLanguageListener getOnConfirmLanguageListener() {
        return this.onConfirmLanguageListener;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p116hb.d.cs_layout_preferred_language_dialog);
        findViews();
        this.mAdapter = new p339wb.s(p116hb.d.item_preferred_language, null);
        RecyclerView recyclerView = this.rv_language;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }
        p339wb.s sVar = this.mAdapter;
        if (sVar != null) {
            sVar.setOnItemClickListener(new com.transsnet.palmpay.core.ui.activity.Z(this, 14));
        }
        RecyclerView recyclerView2 = this.rv_language;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.mAdapter);
        }
        RecyclerView recyclerView3 = this.rv_language;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new a1());
        }
        p339wb.s sVar2 = this.mAdapter;
        if (sVar2 != null) {
            sVar2.setList(this.datas);
        }
        TextView textView = this.tv_apply;
        if (textView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Z0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferredLanguageDialog f30073b;

                {
                    this.f30073b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            PreferredLanguageDialog.initViews$lambda$1(this.f30073b, view);
                            break;
                        default:
                            this.f30073b.dismiss();
                            break;
                    }
                }
            }, textView);
        }
        ImageView imageView = this.close;
        if (imageView != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Z0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreferredLanguageDialog f30073b;

                {
                    this.f30073b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            PreferredLanguageDialog.initViews$lambda$1(this.f30073b, view);
                            break;
                        default:
                            this.f30073b.dismiss();
                            break;
                    }
                }
            }, imageView);
        }
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    public final void setMAdapter(@Nullable p339wb.s sVar) {
        this.mAdapter = sVar;
    }

    public final void setMSelectedLanguage(@Nullable SysConfigValue sysConfigValue) {
        this.mSelectedLanguage = sysConfigValue;
    }
}
