package com.transsnet.palmpay.core.dialog;

import N8.q0;
import Pa.r0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.luck.picture.lib.config.PictureMimeType;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.util.ImageUtils;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p173ld.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/core/dialog/CommonQRCodeDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;)V", "", "saveQRCode2File", "()V", "initViews", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "Landroid/widget/ImageView;", "mIvQRCode", "Landroid/widget/ImageView;", "getMIvQRCode", "()Landroid/widget/ImageView;", "setMIvQRCode", "(Landroid/widget/ImageView;)V", "Landroid/widget/TextView;", "mTvDownQRCode", "Landroid/widget/TextView;", "getMTvDownQRCode", "()Landroid/widget/TextView;", "setMTvDownQRCode", "(Landroid/widget/TextView;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommonQRCodeDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private final Bitmap bitmap;
    public ImageView mIvQRCode;
    public TextView mTvDownQRCode;

    @NotNull
    private final View.OnClickListener onClickListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonQRCodeDialog(@NotNull Context context, @Nullable Bitmap bitmap) {
        super(context, p025ba.g.core_dialog_common_share);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bitmap = bitmap;
        this.onClickListener = new o(this, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClickListener$lambda$0(CommonQRCodeDialog commonQRCodeDialog, View view) {
        if (view.getId() == p025ba.e.dcm_down_qr_code) {
            commonQRCodeDialog.saveQRCode2File();
            commonQRCodeDialog.dismiss();
            Bitmap bitmap = commonQRCodeDialog.bitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    private final void saveQRCode2File() {
        if (this.bitmap != null) {
            File file = new File(BaseApplication.get().getExternalFilesDir(Environment.DIRECTORY_DCIM), "qrcode_" + System.currentTimeMillis() + PictureMimeType.JPG);
            File fileSaveViewsAsImage = ImageUtils.saveViewsAsImage(file, SizeUtils.dp2px(120.0f), SizeUtils.dp2px(120.0f), new WeakReference(getMIvQRCode()));
            if (fileSaveViewsAsImage != null) {
                ToastUtils.showLong(q0.y(getContext().getString(k.core_msg_save_qr_code_to_gallery), ":", fileSaveViewsAsImage.getAbsolutePath()), new Object[0]);
                Context context = BaseApplication.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                r0.N1(context, file.getPath());
            }
        }
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @NotNull
    public final ImageView getMIvQRCode() {
        ImageView imageView = this.mIvQRCode;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.n("mIvQRCode");
        throw null;
    }

    @NotNull
    public final TextView getMTvDownQRCode() {
        TextView textView = this.mTvDownQRCode;
        if (textView != null) {
            return textView;
        }
        Intrinsics.n("mTvDownQRCode");
        throw null;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setMIvQRCode((ImageView) findViewById(p025ba.e.dcm_iv_qr_code));
        setMTvDownQRCode((TextView) findViewById(p025ba.e.dcm_down_qr_code));
        getMIvQRCode().setImageBitmap(this.bitmap);
        p220oa.h.q(this.onClickListener, getMTvDownQRCode());
    }

    public final void setMIvQRCode(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mIvQRCode = imageView;
    }

    public final void setMTvDownQRCode(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTvDownQRCode = textView;
    }
}
