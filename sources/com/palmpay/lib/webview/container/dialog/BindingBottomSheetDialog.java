package com.palmpay.lib.webview.container.dialog;

import L6.b;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.palmpay.lib.webview.R;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0002\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H$¢\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0084\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/palmpay/lib/webview/container/dialog/BindingBottomSheetDialog;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "onCreateViewBinding", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setFull", "initView", "getBind", "getScreenHeight", "", "lib_webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBindingBottomSheetDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BindingBottomSheetDialog.kt\ncom/palmpay/lib/webview/container/dialog/BindingBottomSheetDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"})
public abstract class BindingBottomSheetDialog<VB extends ViewBinding> extends BottomSheetDialog {

    @Nullable
    private VB binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindingBottomSheetDialog(@NotNull Context context) {
        super(context, R.style.BottomSheetDialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final VB getBind() {
        try {
            Type genericSuperclass = getClass().getGenericSuperclass();
            if (genericSuperclass != null) {
                Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
                Intrinsics.f(type, "null cannot be cast to non-null type java.lang.Class<*>");
                Object objInvoke = ((Class) type).getDeclaredMethod("inflate", LayoutInflater.class).invoke(null, getLayoutInflater());
                Intrinsics.f(objInvoke, "null cannot be cast to non-null type VB of com.palmpay.lib.webview.container.dialog.BindingBottomSheetDialog");
                return (VB) objInvoke;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    private final int getScreenHeight(Context context) {
        Display defaultDisplay;
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        Point point = new Point();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealSize(point);
        }
        return point.y;
    }

    private final void setFull() {
        View decorView;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        Window window3 = getWindow();
        WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
        if (attributes != null) {
            attributes.width = -1;
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setAttributes(attributes);
        }
    }

    @Nullable
    public final VB getBinding() {
        return this.binding;
    }

    public abstract void initView(@NotNull VB binding);

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.K, androidx.activity.n, android.app.Dialog
    public void onCreate(@Nullable Bundle savedInstanceState) {
        View root;
        super.onCreate(savedInstanceState);
        setFull();
        supportRequestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(b.pp_transparent);
        }
        VB vb2 = (VB) onCreateViewBinding();
        this.binding = vb2;
        if (vb2 == null) {
            this.binding = (VB) getBind();
        }
        VB vb3 = this.binding;
        if (vb3 != null && (root = vb3.getRoot()) != null) {
            setContentView(root);
        }
        VB vb4 = this.binding;
        if (vb4 != null) {
            initView(vb4);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.getDecorView().setBackgroundResource(b.pp_transparent);
            View viewFindViewById = window2.findViewById(com.google.android.material.R.id.design_bottom_sheet);
            if (viewFindViewById != null) {
                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(viewFindViewById);
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "from(...)");
                Context context = window2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                bottomSheetBehaviorFrom.setPeekHeight((int) (((double) getScreenHeight(context)) * 0.75d));
                bottomSheetBehaviorFrom.setState(3);
            }
            window2.setLayout(-1, getBehavior().getPeekHeight());
        }
    }

    @Nullable
    public VB onCreateViewBinding() {
        return null;
    }

    public final void setBinding(@Nullable VB vb2) {
        this.binding = vb2;
    }
}
