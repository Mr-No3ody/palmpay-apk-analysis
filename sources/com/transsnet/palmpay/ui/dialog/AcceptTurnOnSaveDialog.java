package com.transsnet.palmpay.ui.dialog;

import Ac.e;
import Ae.c;
import Bc.t;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import Wf.I;
import Wf.V;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.w;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ag.o;
import p042cg.f;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/ui/dialog/AcceptTurnOnSaveDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "mJumpParams", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "openAutoSaveCash", "()V", "initViews", "Ljava/lang/String;", "LBc/t;", "binding", "LBc/t;", "Companion", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AcceptTurnOnSaveDialog extends b {

    @NotNull
    private static final String AUTO_SAVE_TURN_ON_H5 = "/h5/conditions/ng/auto-transfer?showTitle=true";

    @Nullable
    private t binding;

    @Nullable
    private String mJumpParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptTurnOnSaveDialog(@NotNull Context context, @Nullable String str) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mJumpParams = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(AcceptTurnOnSaveDialog acceptTurnOnSaveDialog, View view) {
        if (r0.U0()) {
            return;
        }
        int id2 = view.getId();
        if (id2 == e.viewBottom) {
            i0.c0(d.g(AUTO_SAVE_TURN_ON_H5));
            return;
        }
        if (id2 == e.btnNext) {
            n0.g().m("AutoSave_Popup_Click", "AutoSave_Popup_Click", "");
            acceptTurnOnSaveDialog.openAutoSaveCash();
        } else if (id2 == e.ivClose) {
            acceptTurnOnSaveDialog.dismiss();
        }
    }

    private final void openAutoSaveCash() {
        V v3 = V.f10828a;
        f fVar = I.f10809a;
        AbstractC0780y.m(v3, o.f11960a, null, new c(this, null), 2);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        View viewM;
        int i7 = 0;
        setContentView(Ac.f.main_dialog_accept_turn_on_save);
        showAtCenter(getWindow(), w.Animation_CommonDialog, ScreenUtils.getScreenWidth());
        View viewFindViewById = findViewById(e.viewRoot);
        int i10 = e.btnNext;
        View viewM2 = a.m(i10, viewFindViewById);
        if (viewM2 != null) {
            i10 = e.ivClose;
            IconicsImageView iconicsImageView = (IconicsImageView) a.m(i10, viewFindViewById);
            if (iconicsImageView != null) {
                i10 = e.ivIcon;
                ImageView imageView = (ImageView) a.m(i10, viewFindViewById);
                if (imageView != null && (viewM = a.m((i10 = e.viewBottom), viewFindViewById)) != null) {
                    this.binding = new t((ConstraintLayout) viewFindViewById, viewM2, iconicsImageView, imageView, viewM);
                    r0.h1(imageView, r0.y0("main_turn_on_save.webp"), Ac.d.main_turn_on_save);
                    Ae.a aVar = new Ae.a(this, i7);
                    t tVar = this.binding;
                    h.q(aVar, tVar != null ? tVar.f849d : null, tVar != null ? tVar.f847b : null, tVar != null ? tVar.f848c : null);
                    n0.g().m("AutoSave_Popup_View", "AutoSave_Popup_Click", "");
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewFindViewById.getResources().getResourceName(i10)));
    }
}
