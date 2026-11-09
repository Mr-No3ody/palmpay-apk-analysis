package Pa;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.transsnet.palmpay.core.dialog.ShareImgDialog;
import com.transsnet.palmpay.core.util.MediaStoreHelper$showLoadingDialogInterface;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements RequestListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaStoreHelper$showLoadingDialogInterface f7006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f7007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7008c;

    public B(MediaStoreHelper$showLoadingDialogInterface mediaStoreHelper$showLoadingDialogInterface, Context context, String str) {
        this.f7006a = mediaStoreHelper$showLoadingDialogInterface;
        this.f7007b = context;
        this.f7008c = str;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onLoadFailed(com.bumptech.glide.load.engine.u uVar, Object obj, Target target, boolean z3) {
        Intrinsics.checkNotNullParameter(target, "target");
        MediaStoreHelper$showLoadingDialogInterface mediaStoreHelper$showLoadingDialogInterface = this.f7006a;
        mediaStoreHelper$showLoadingDialogInterface.showDialog(false);
        mediaStoreHelper$showLoadingDialogInterface.completed();
        return false;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onResourceReady(Object obj, Object model, Target target, com.bumptech.glide.load.a dataSource, boolean z3) {
        File resource = (File) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        String str = resource.getName() + System.currentTimeMillis();
        Context context = this.f7007b;
        Uri uriA = p220oa.b.a(context, str, resource);
        boolean z8 = context instanceof Activity;
        MediaStoreHelper$showLoadingDialogInterface mediaStoreHelper$showLoadingDialogInterface = this.f7006a;
        if (z8) {
            ShareImgDialog shareImgDialog = new ShareImgDialog(context);
            shareImgDialog.setOnDismissListener(new Dd.b(mediaStoreHelper$showLoadingDialogInterface, 8));
            shareImgDialog.setShareUrl(uriA);
            shareImgDialog.setShareText(this.f7008c);
            shareImgDialog.show();
        } else {
            mediaStoreHelper$showLoadingDialogInterface.completed();
        }
        mediaStoreHelper$showLoadingDialogInterface.showDialog(false);
        return false;
    }
}
