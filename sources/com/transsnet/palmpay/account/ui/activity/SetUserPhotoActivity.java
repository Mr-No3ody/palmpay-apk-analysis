package com.transsnet.palmpay.account.ui.activity;

import Ab.D;
import Ad.C0058e;
import Da.j;
import Gb.T;
import I8.c;
import N8.C0457a;
import N8.Y;
import N8.a0;
import N8.c0;
import N8.d0;
import N8.q0;
import Pa.i0;
import Wf.AbstractC0780y;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.messaging.Constants;
import com.luck.picture.lib.config.PictureConfig;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectMimeType;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import com.transsnet.palmpay.account.bean.req.UserPhotoReq;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.callback.SafeLockCheck;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.photograph.crop.PhotoCropActivity;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.CloseUtils;
import com.transsnet.palmpay.util.EncryptUtils;
import com.transsnet.palmpay.util.FileUtils;
import com.transsnet.palmpay.util.ImageUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.reactivex.internal.operators.observable.C1760l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p038ca.d;
import p038ca.e;
import p071ef.b;
import p177m.h;
import p242q0.g;
import p298tf.f;
import p377z5.l;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/setUserPhoto")
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0089\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0005J\u0019\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u0005J)\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\b)\u0010'J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010.J\u001b\u00102\u001a\u00020\u000e2\n\u00101\u001a\u00060/j\u0002`0H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0017H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0017H\u0016¢\u0006\u0004\b6\u00105J\u0017\u00108\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u0017H\u0016¢\u0006\u0004\b8\u0010\u001aJ\u000f\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010\u0005J\u000f\u0010:\u001a\u00020\u0017H\u0002¢\u0006\u0004\b:\u00105J\u000f\u0010;\u001a\u00020\u0017H\u0002¢\u0006\u0004\b;\u00105J!\u0010?\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\"2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\bA\u0010BJ!\u0010C\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\bC\u0010'J\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010\u0005J\u000f\u0010G\u001a\u00020\u000eH\u0002¢\u0006\u0004\bG\u0010\u0005J\u0017\u0010J\u001a\u00020\u000e2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020$H\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020$2\u0006\u0010P\u001a\u00020OH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\u00172\u0006\u0010(\u001a\u00020$H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u000eH\u0002¢\u0006\u0004\bU\u0010\u0005J\u000f\u0010V\u001a\u00020$H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020X2\u0006\u0010Y\u001a\u00020XH\u0002¢\u0006\u0004\bZ\u0010[J!\u0010^\u001a\u00020\u000e2\b\u0010\\\u001a\u0004\u0018\u00010H2\u0006\u0010]\u001a\u00020$H\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010^\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020$2\u0006\u0010]\u001a\u00020$H\u0002¢\u0006\u0004\b^\u0010`J\u0019\u0010a\u001a\u00020\u000e2\b\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\ba\u0010KJ\u0019\u0010b\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\bb\u0010NJ\u0019\u0010d\u001a\u00020\u000e2\b\b\u0002\u0010c\u001a\u00020\"H\u0002¢\u0006\u0004\bd\u0010EJ\u000f\u0010e\u001a\u00020\u000eH\u0002¢\u0006\u0004\be\u0010\u0005J\u000f\u0010f\u001a\u00020\u000eH\u0002¢\u0006\u0004\bf\u0010\u0005R\u0018\u0010g\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010k\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bk\u0010jR\u0016\u0010l\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bl\u0010jR\u0018\u0010m\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bm\u0010hR\u0016\u0010n\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bn\u0010jR\u0016\u0010o\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bo\u0010jR\u0016\u0010p\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bp\u0010jR\u0018\u0010q\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bq\u0010hR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010vR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0080\u0001R\u001f\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R%\u0010\u0087\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\"0\u0086\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/SetUserPhotoActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "Lcom/transsnet/palmpay/core/manager/FileUploadManager$UploadListener;", "Lcom/transsnet/palmpay/core/callback/SafeLockCheck;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/viewbinding/ViewBinding;", "initViewBinding", "(Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding;", "", "getLayoutId", "()I", "", "initStatusBar", "setupView", "initData", "processLogic", "(Landroid/os/Bundle;)V", "requestedOrientation", "setRequestedOrientation", "(I)V", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "onDestroy", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onActivityResult", "(IILandroid/content/Intent;)V", "", "url", "Ljava/io/File;", "originFile", "onStartSync", "(Ljava/lang/String;Ljava/io/File;)V", "file", "onComplete", "", "bytesCurrent", "bytesTotal", "onProgressChanged", "(JJ)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "onError", "(Ljava/lang/Exception;)V", "isForceNoNightMode", "()Z", "ignoreLock", "show", "showLoadingDialog", "updatePdfOptionVisibility", "isPdfModeEnabled", "checkCameraPermission", "permission", "Lca/a;", "appDetailsSettingsLauncher", "showRequestPermissionDialog", "(Ljava/lang/String;Lca/a;)V", "handleResult", "(ILandroid/content/Intent;)V", "setResult", "saveAvatar", "(Ljava/lang/String;)V", "onPickFromAlbumClick", "onChoosePdfClick", "Landroid/net/Uri;", "uri", "handlePdfSelected", "(Landroid/net/Uri;)V", "pdfFile", "openPreviewPdfForSnap", "(Ljava/io/File;)V", "Landroid/os/ParcelFileDescriptor;", "pfd", "copyPfdToCache", "(Landroid/os/ParcelFileDescriptor;)Ljava/io/File;", "isValidPdfHeader", "(Ljava/io/File;)Z", "onTakePhotoClick", "getTempDir", "()Ljava/io/File;", "Landroid/graphics/Bitmap;", "bmp", "getSquareBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "src", "dest", "copyExif", "(Landroid/net/Uri;Ljava/io/File;)V", "(Ljava/io/File;Ljava/io/File;)V", "compressPhoto", "uploadFile", "error", "gotoFail", "gotoFailCancelled", "gotoFailCameraPermission", "mPhotoType", "Ljava/lang/String;", "bBigPhoto", "Z", "bTakePhotoOnly", "mSetAvatarByUri", "mSetAvatarUri", "bOriginPhoto", "bCropPhoto", "bPrivate", "pdfMode", "Landroid/view/View;", "mRootView", "Landroid/view/View;", "mTargetFile", "Ljava/io/File;", "mPdfFile", "Lca/d;", "mPermissionLauncher", "Lca/d;", "LI8/c;", "binding", "LI8/c;", "Lca/e;", "takePhotoLauncher", "Lca/e;", "previewPdfLauncher", "Landroidx/activity/result/a;", "Landroidx/activity/result/i;", "pickMedia", "Landroidx/activity/result/a;", "", "pickPdf", "Companion", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSetUserPhotoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SetUserPhotoActivity.kt\ncom/transsnet/palmpay/account/ui/activity/SetUserPhotoActivity\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,864:1\n28#2:865\n*S KotlinDebug\n*F\n+ 1 SetUserPhotoActivity.kt\ncom/transsnet/palmpay/account/ui/activity/SetUserPhotoActivity\n*L\n147#1:865\n*E\n"})
public final class SetUserPhotoActivity extends BaseActivity implements FileUploadManager.UploadListener, SafeLockCheck {

    @NotNull
    private static final String ERR_PDF_INVALID = "pdf_invalid";

    @NotNull
    private static final String ERR_PDF_TOO_LARGE = "pdf_too_large";
    private static final long MAX_BIG_PHOTO_FILE_SIZE = 262144;
    private static final int MAX_BIG_PHOTO_FRAME_SIZE = 1080;
    private static final long MAX_PDF_FILE_SIZE = 5242880;
    private static final int MAX_PHOTO_FRAME_SIZE = 250;
    public static final int REQUEST_CODE_CAPTURE_FACE = 524;
    public static final int REQUEST_CODE_PICK_PHOTO = 523;
    public static final int REQUEST_CODE_SET_AVATAR_OF_URI = 526;
    public static final int REQUEST_CODE_TAKE_PHOTO = 522;

    @Autowired(name = "photoBig")
    @JvmField
    public boolean bBigPhoto;

    @Autowired(name = "origin_photo")
    @JvmField
    public boolean bOriginPhoto;

    @Autowired(name = "private_photo")
    @JvmField
    public boolean bPrivate;

    @Autowired(name = "takePhotoOnly")
    @JvmField
    public boolean bTakePhotoOnly;

    @Nullable
    private c binding;

    @Nullable
    private File mPdfFile;

    @Autowired(name = "photoType")
    @JvmField
    @Nullable
    public String mPhotoType;

    @Nullable
    private View mRootView;

    @Autowired(name = "extra_mode")
    @JvmField
    public boolean mSetAvatarByUri;

    @Autowired(name = "extra_token")
    @JvmField
    @Nullable
    public String mSetAvatarUri;

    @Nullable
    private File mTargetFile;

    @Autowired(name = "pdf_mode")
    @JvmField
    @Nullable
    public String pdfMode;

    @NotNull
    private final androidx.activity.result.a pickMedia;

    @NotNull
    private final androidx.activity.result.a pickPdf;

    @Autowired(name = "crop_photo")
    @JvmField
    public boolean bCropPhoto = true;

    @NotNull
    private final d mPermissionLauncher = new d(this);

    @NotNull
    private final e takePhotoLauncher = new e(this, null, null);

    @NotNull
    private final e previewPdfLauncher = new e(this, null, null);

    public SetUserPhotoActivity() {
        final int i7 = 0;
        this.pickMedia = registerForActivityResult(new h(), new ActivityResultCallback(this) { // from class: N8.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetUserPhotoActivity f6189b;

            {
                this.f6189b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i7) {
                    case 0:
                        SetUserPhotoActivity.pickMedia$lambda$8(this.f6189b, (Uri) obj);
                        break;
                    default:
                        SetUserPhotoActivity.pickPdf$lambda$9(this.f6189b, (Uri) obj);
                        break;
                }
            }
        });
        final int i10 = 1;
        this.pickPdf = registerForActivityResult(new V3.a(3), new ActivityResultCallback(this) { // from class: N8.Z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SetUserPhotoActivity f6189b;

            {
                this.f6189b = this;
            }

            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                switch (i10) {
                    case 0:
                        SetUserPhotoActivity.pickMedia$lambda$8(this.f6189b, (Uri) obj);
                        break;
                    default:
                        SetUserPhotoActivity.pickPdf$lambda$9(this.f6189b, (Uri) obj);
                        break;
                }
            }
        });
    }

    private final boolean checkCameraPermission() {
        return l.o(this, "android.permission.CAMERA");
    }

    private final void compressPhoto(Uri uri) {
        String strEncryptMD5ToString = EncryptUtils.encryptMD5ToString(p367ya.a.d().i() + System.currentTimeMillis());
        if (this.bOriginPhoto) {
            strEncryptMD5ToString = q0.j(strEncryptMD5ToString, PictureMimeType.JPG);
        }
        new C1760l(df.d.h(uri).k(f.f42629b), new C0457a(new C0058e(14, this, strEncryptMD5ToString), 5), 2).i(b.a()).subscribe(new D(this, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File compressPhoto$lambda$17(SetUserPhotoActivity setUserPhotoActivity, String str, Uri uri) {
        File file = new File(setUserPhotoActivity.getTempDir(), str);
        InputStream inputStreamOpenInputStream = uri == null ? null : setUserPhotoActivity.getContentResolver().openInputStream(uri);
        Bitmap bitmapScale = ImageUtils.scale(ImageUtils.getBitmap(inputStreamOpenInputStream), setUserPhotoActivity.bBigPhoto ? MAX_BIG_PHOTO_FRAME_SIZE : 250, true);
        if (inputStreamOpenInputStream != null) {
            CloseUtils.closeIO(inputStreamOpenInputStream);
        }
        if ("1".equals(setUserPhotoActivity.mPhotoType)) {
            Intrinsics.e(bitmapScale);
            bitmapScale = setUserPhotoActivity.getSquareBitmap(bitmapScale);
        }
        if (setUserPhotoActivity.bBigPhoto) {
            ImageUtils.saveBySize(bitmapScale, file, MAX_BIG_PHOTO_FILE_SIZE, true);
        } else {
            ImageUtils.save(bitmapScale, file, Bitmap.CompressFormat.JPEG, true);
        }
        setUserPhotoActivity.copyExif(uri, file);
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File compressPhoto$lambda$18(Function1 function1, Object p3) {
        Intrinsics.checkNotNullParameter(p3, "p0");
        return (File) function1.invoke(p3);
    }

    private final void copyExif(Uri src, File dest) {
        FileInputStream fileInputStream;
        InputStream inputStream = null;
        try {
            ContentResolver contentResolver = getContentResolver();
            Intrinsics.e(src);
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(src);
            try {
                fileInputStream = new FileInputStream(dest);
                try {
                    Intrinsics.e(inputStreamOpenInputStream);
                    String strD = new g(inputStreamOpenInputStream).d("Orientation");
                    if (strD != null) {
                        g gVar = new g(fileInputStream);
                        gVar.F("Orientation", strD);
                        gVar.B();
                    }
                    CloseUtils.closeIO(inputStreamOpenInputStream, fileInputStream);
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamOpenInputStream;
                    try {
                        F6.d.c(this.TAG, "copyExif: ", th);
                        CloseUtils.closeIO(inputStream, fileInputStream);
                    } catch (Throwable th2) {
                        CloseUtils.closeIO(inputStream, fileInputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File copyPfdToCache(ParcelFileDescriptor pfd) throws Exception {
        File file = new File(getTempDir(), "bill_" + System.currentTimeMillis() + ".pdf");
        if (file.exists()) {
            file.delete();
        }
        try {
            if (pfd.getStatSize() > MAX_PDF_FILE_SIZE) {
                throw new IOException(ERR_PDF_TOO_LARGE);
            }
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(pfd);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[16384];
                    long j6 = 0;
                    while (true) {
                        int i7 = autoCloseInputStream.read(bArr);
                        if (i7 == -1) {
                            fileOutputStream.flush();
                            Unit unit = Unit.f38893a;
                            fileOutputStream.close();
                            autoCloseInputStream.close();
                            if (isValidPdfHeader(file)) {
                                return file;
                            }
                            file.delete();
                            throw new IOException(ERR_PDF_INVALID);
                        }
                        j6 += (long) i7;
                        if (j6 > MAX_PDF_FILE_SIZE) {
                            throw new IOException(ERR_PDF_TOO_LARGE);
                        }
                        fileOutputStream.write(bArr, 0, i7);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(fileOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    org.chromium.support_lib_boundary.util.b.o(autoCloseInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e10) {
            if (file.exists()) {
                file.delete();
            }
            try {
                pfd.close();
            } catch (Exception unused) {
            }
            if (e10 instanceof IOException) {
                throw e10;
            }
            throw new IOException(e10.getMessage(), e10);
        }
    }

    private final Bitmap getSquareBitmap(Bitmap bmp) {
        int width = bmp.getWidth();
        int height = bmp.getHeight();
        if (width == height) {
            return bmp;
        }
        if (width > height) {
            Bitmap bitmapClip = ImageUtils.clip(bmp, (width - height) / 2, 0, height, height, true);
            Intrinsics.e(bitmapClip);
            return bitmapClip;
        }
        Bitmap bitmapClip2 = ImageUtils.clip(bmp, 0, (height - width) / 2, width, width, true);
        Intrinsics.e(bitmapClip2);
        return bitmapClip2;
    }

    private final File getTempDir() {
        File externalCacheDir;
        if (Build.VERSION.SDK_INT >= 29 || (externalCacheDir = getExternalCacheDir()) == null) {
            externalCacheDir = getCacheDir();
        }
        File file = new File(externalCacheDir, OfflineConstant.TEMP_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoFail(String error) {
        ToastUtils.showLong(error, new Object[0]);
        showLoadingDialog(false);
        finish();
    }

    public static /* synthetic */ void gotoFail$default(SetUserPhotoActivity setUserPhotoActivity, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = setUserPhotoActivity.getString(F8.h.ac_operation_fail);
        }
        setUserPhotoActivity.gotoFail(str);
    }

    private final void gotoFailCameraPermission() {
        String string = getString(F8.h.ac_photo_permission_camera);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gotoFail(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void gotoFailCancelled() {
        String string = getString(F8.h.ac_photo_cancelled);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        gotoFail(string);
    }

    private final void handlePdfSelected(Uri uri) {
        showLoadingDialog(true);
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = getContentResolver().openFileDescriptor(uri, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                gotoFail$default(this, null, 1, null);
            } else {
                AbstractC0780y.m(V.f(this), null, null, new c0(this, parcelFileDescriptorOpenFileDescriptor, null), 3);
            }
        } catch (Exception e10) {
            F6.d.c(this.TAG, "handlePdfSelected openFileDescriptor: ", e10);
            gotoFail$default(this, null, 1, null);
        }
    }

    private final void handleResult(int requestCode, Intent data) {
        switch (requestCode) {
            case REQUEST_CODE_TAKE_PHOTO /* 522 */:
                if (!FileUtils.isFileExists(this.mTargetFile)) {
                    this.mTargetFile = null;
                    gotoFail$default(this, null, 1, null);
                } else {
                    compressPhoto(Uri.fromFile(this.mTargetFile));
                }
                break;
            case REQUEST_CODE_PICK_PHOTO /* 523 */:
                if (data == null || data.getData() == null) {
                    gotoFailCancelled();
                } else {
                    compressPhoto(data.getData());
                }
                break;
            case REQUEST_CODE_CAPTURE_FACE /* 524 */:
                if (data != null && data.getData() != null) {
                    Uri data2 = data.getData();
                    if ((data2 != null ? data2.getPath() : null) != null) {
                        Uri data3 = data.getData();
                        uploadFile(new File(data3 != null ? data3.getPath() : null));
                    }
                }
                gotoFail$default(this, null, 1, null);
                break;
            case REQUEST_CODE_SET_AVATAR_OF_URI /* 526 */:
                File file = new File((String) top.zibin.luban.io.a.g(this).f42646c);
                if (FileUtils.getFileLength(file) <= 0) {
                    gotoFail$default(this, null, 1, null);
                } else {
                    compressPhoto(Uri.fromFile(file));
                }
                break;
        }
    }

    private final boolean isPdfModeEnabled() {
        return "pick_only".equals(this.pdfMode) || "pick_and_upload".equals(this.pdfMode) || "pick_and_snap".equals(this.pdfMode);
    }

    private final boolean isValidPdfHeader(File file) throws Throwable {
        if (FileUtils.getFileLength(file) >= 5) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[5];
                        boolean z3 = fileInputStream2.read(bArr) >= 4 && bArr[0] == 37 && bArr[1] == 80 && bArr[2] == 68 && bArr[3] == 70;
                        CloseUtils.closeIO(fileInputStream2);
                        return z3;
                    } catch (Exception e10) {
                        e = e10;
                        fileInputStream = fileInputStream2;
                        F6.d.c(this.TAG, "isValidPdfHeader: ", e);
                        CloseUtils.closeIO(fileInputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        CloseUtils.closeIO(fileInputStream);
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onChoosePdfClick() {
        if (isPdfModeEnabled()) {
            try {
                this.pickPdf.a(new String[]{"application/pdf"});
            } catch (Exception e10) {
                F6.d.c(this.TAG, "onChoosePdfClick: ", e10);
                gotoFail$default(this, null, 1, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPickFromAlbumClick() {
        try {
            androidx.activity.result.a aVar = this.pickMedia;
            p177m.g mediaType = p177m.g.f39407a;
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            i iVar = new i();
            iVar.f12068a = p177m.f.f39406a;
            Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
            iVar.f12068a = mediaType;
            aVar.a(iVar);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTakePhotoClick() {
        if (!checkCameraPermission()) {
            this.mPermissionLauncher.f("android.permission.CAMERA", new a0(this, 1), new a0(this, 2), new a0(this, 3));
            return;
        }
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            if (this.bTakePhotoOnly) {
                intent.putExtra(PictureConfig.CAMERA_FACING, 1);
                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                intent.putExtra("camerasensortype", 2);
            }
            File file = new File(getTempDir(), AppUtils.getAppName() + "_" + System.currentTimeMillis() + PictureMimeType.JPG);
            if (file.exists()) {
                boolean zDelete = file.delete();
                F6.d.h(this.TAG, 3, "onTakePhotoClick: delete file " + zDelete);
            }
            this.mTargetFile = file;
            try {
                intent.putExtra("output", androidx.core.content.f.getUriForFile(this, i0.w(this), file));
                intent.addFlags(3);
                this.takePhotoLauncher.f(intent, new a0(this, 4));
            } catch (Exception e10) {
                F6.d.c(this.TAG, "Failed to get FileProvider URI, fallback to file URI", e10);
                throw e10;
            }
        } catch (Exception e11) {
            F6.d.c(this.TAG, "onTakePhotoClick: ", e11);
            gotoFail$default(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTakePhotoClick$lambda$13(SetUserPhotoActivity setUserPhotoActivity) {
        if (setUserPhotoActivity.checkCameraPermission()) {
            setUserPhotoActivity.onTakePhotoClick();
        } else {
            setUserPhotoActivity.gotoFailCameraPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTakePhotoClick$lambda$14(SetUserPhotoActivity setUserPhotoActivity, p038ca.a aVar) {
        if (aVar != null) {
            setUserPhotoActivity.showRequestPermissionDialog("android.permission.CAMERA", aVar);
        } else {
            setUserPhotoActivity.gotoFailCameraPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTakePhotoClick$lambda$15(SetUserPhotoActivity setUserPhotoActivity, p038ca.a aVar) {
        if (aVar != null) {
            setUserPhotoActivity.showRequestPermissionDialog("android.permission.CAMERA", aVar);
        } else {
            setUserPhotoActivity.gotoFailCameraPermission();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onTakePhotoClick$lambda$16(SetUserPhotoActivity setUserPhotoActivity, int i7, Intent intent) {
        if (i7 == -1) {
            setUserPhotoActivity.handleResult(REQUEST_CODE_TAKE_PHOTO, intent);
        } else {
            setUserPhotoActivity.mTargetFile = null;
            setUserPhotoActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPreviewPdfForSnap(File pdfFile) {
        PreviewPdfActivity.a aVar = PreviewPdfActivity.f25953C;
        String absolutePath = pdfFile.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        this.previewPdfLauncher.f(aVar.createIntent(this, absolutePath, this.bPrivate, true), new a0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openPreviewPdfForSnap$lambda$10(SetUserPhotoActivity setUserPhotoActivity, int i7, Intent intent) {
        Uri data;
        if (i7 != -1) {
            setUserPhotoActivity.gotoFailCancelled();
            return;
        }
        String path = (intent == null || (data = intent.getData()) == null) ? null : data.getPath();
        File file = (path == null || path.length() == 0) ? null : new File(path);
        if (file == null || !file.exists() || FileUtils.getFileLength(file) <= 0) {
            gotoFail$default(setUserPhotoActivity, null, 1, null);
        } else if (setUserPhotoActivity.bOriginPhoto) {
            setUserPhotoActivity.setResult("", file);
            setUserPhotoActivity.finish();
        } else {
            setUserPhotoActivity.showLoadingDialog(true);
            setUserPhotoActivity.uploadFile(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickMedia$lambda$8(SetUserPhotoActivity setUserPhotoActivity, Uri uri) {
        if (uri == null) {
            setUserPhotoActivity.gotoFailCancelled();
            F6.d.h(setUserPhotoActivity.TAG, 3, "No media selected");
            return;
        }
        setUserPhotoActivity.compressPhoto(uri);
        F6.d.h(setUserPhotoActivity.TAG, 3, "Selected URI: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickPdf$lambda$9(SetUserPhotoActivity setUserPhotoActivity, Uri uri) {
        if (uri != null) {
            setUserPhotoActivity.handlePdfSelected(uri);
        } else {
            setUserPhotoActivity.gotoFailCancelled();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveAvatar(String url) {
        try {
            User user = BaseApplication.get().getUser();
            user.setAvatar(url);
            BaseApplication.get().getUserDataSource().getClass();
            p156ka.a.c(user);
        } catch (Exception e10) {
            F6.d.c(this.TAG, "saveAvatar: ", e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    public final void setResult(String url, File file) {
        Intent intent = new Intent();
        intent.putExtra("photoUrl", url);
        if (file != null) {
            intent.setData(Uri.fromFile(file));
            if (this.mPdfFile == null) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (y.g(name, ".pdf", true)) {
                    intent.putExtra("pdf_local_path", file.getAbsolutePath());
                }
            } else {
                intent.putExtra("pdf_local_path", file.getAbsolutePath());
            }
        }
        setResult(-1, intent);
    }

    private final void showRequestPermissionDialog(String permission, p038ca.a appDetailsSettingsLauncher) {
        O6.c cVar = new O6.c(this);
        cVar.e(k.core_opps);
        cVar.f6598d = "android.permission.CAMERA".equals(permission) ? "Please grant Camera permission to continue." : "Please grant storage permission to continue.";
        cVar.d(k.core_confirm, new T(22, appDetailsSettingsLauncher, this));
        cVar.c(k.core_cancel, new Y(this, 5));
        cVar.f6605k = true;
        O6.d dVarA = cVar.a();
        Intrinsics.checkNotNullExpressionValue(dVarA, "create(...)");
        dVarA.setOnCancelListener(new j(this, 1));
        dVarA.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRequestPermissionDialog$lambda$5(p038ca.a aVar, SetUserPhotoActivity setUserPhotoActivity, View view) {
        p038ca.a.f(aVar);
        setUserPhotoActivity.finish();
    }

    private final void updatePdfOptionVisibility() {
        TextView textView;
        View view;
        boolean zIsPdfModeEnabled = isPdfModeEnabled();
        c cVar = this.binding;
        if (cVar != null && (view = cVar.f4053g) != null) {
            p220oa.h.s(view, zIsPdfModeEnabled);
        }
        c cVar2 = this.binding;
        if (cVar2 == null || (textView = cVar2.f4049c) == null) {
            return;
        }
        p220oa.h.s(textView, zIsPdfModeEnabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadFile(File file) {
        if (FileUtils.getFileLength(file) <= 0) {
            gotoFail$default(this, null, 1, null);
        } else {
            FileUploadManager.getInstance().uploadFile(file, this.bPrivate, this);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public int getLayoutId() {
        requestLayoutFullScreen();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.callback.SafeLockCheck
    public boolean ignoreLock() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void initData() {
        c cVar = this.binding;
        if (cVar != null) {
            cVar.f4051e.setOnClickListener(new Y(this, 1));
        }
        c cVar2 = this.binding;
        if (cVar2 != null) {
            cVar2.f4050d.setOnClickListener(new Y(this, 2));
        }
        c cVar3 = this.binding;
        if (cVar3 != null) {
            cVar3.f4049c.setOnClickListener(new Y(this, 3));
        }
        c cVar4 = this.binding;
        if (cVar4 != null) {
            cVar4.f4048b.setOnClickListener(new Y(this, 4));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void initStatusBar() {
        initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    @NotNull
    public ViewBinding initViewBinding(@Nullable Bundle savedInstanceState) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(F8.e.ac_activity_set_user_photo, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i7 = F8.d.tvCancel;
        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
        if (textView != null) {
            i7 = F8.d.tvChoosePdf;
            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
            if (textView2 != null) {
                i7 = F8.d.tvPickPhoto;
                TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView3 != null) {
                    i7 = F8.d.tvTakePhoto;
                    TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView4 != null) {
                        i7 = F8.d.viewContainer;
                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout != null && (viewM = p059e1.a.m((i7 = F8.d.viewPdfDivider), viewInflate)) != null) {
                            c cVar = new c(constraintLayout, textView, textView2, textView3, textView4, linearLayout, viewM);
                            this.binding = cVar;
                            return cVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public boolean isForceNoNightMode() {
        if (getIntent() != null) {
            return !getIntent().getBooleanExtra("extra_use_night_mode", false);
        }
        return super.isForceNoNightMode();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            showLoadingDialog(true);
            handleResult(requestCode, data);
        } else {
            this.mTargetFile = null;
            finish();
        }
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public void onComplete(@NotNull String url, @NotNull File file) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        File file2 = this.mPdfFile;
        if (file2 != null) {
            file = file2;
        }
        if (TextUtils.isEmpty(this.mPhotoType)) {
            setResult(url, file);
            finish();
            return;
        }
        UserPhotoReq userPhotoReq = new UserPhotoReq();
        userPhotoReq.memberId = p367ya.a.d().i();
        userPhotoReq.photoUrl = url;
        userPhotoReq.photoType = this.mPhotoType;
        G8.a.t().setUserPhotoByType(userPhotoReq).k(f.f42629b).i(b.a()).subscribe(new d0(this, 0, url, file));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        showLoadingDialog(false);
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public void onError(@NotNull Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        F6.d.c(this.TAG, "uploadFile: ", ex);
        String message = ex.getMessage();
        if (ex instanceof p309ua.c) {
            p309ua.c cVar = (p309ua.c) ex;
            message = cVar.f42731b;
            if (TextUtils.isEmpty(message)) {
                message = "Code:" + cVar.f42730a;
            }
        }
        if (TextUtils.isEmpty(message)) {
            message = getString(F8.h.ac_operation_fail);
        } else {
            Intrinsics.e(message);
        }
        Intrinsics.e(message);
        gotoFail(message);
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public void onProgressChanged(long bytesCurrent, long bytesTotal) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public void onStartSync(@NotNull String url, @NotNull File originFile) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(originFile, "originFile");
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void processLogic(@Nullable Bundle savedInstanceState) {
        if (this.bTakePhotoOnly) {
            onTakePhotoClick();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.app.Activity
    public void setRequestedOrientation(int requestedOrientation) {
        if (Build.VERSION.SDK_INT == 26) {
            super.setRequestedOrientation(-1);
        } else {
            super.setRequestedOrientation(requestedOrientation);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        ARouter.getInstance().inject(this);
        getWindow().setBackgroundDrawable(new ColorDrawable(getColor(p.transparent_30)));
        View viewFindViewById = findViewById(F8.d.rootView);
        this.mRootView = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new Y(this, 0));
        }
        if (!this.mSetAvatarByUri || this.mSetAvatarUri == null) {
            if (this.bTakePhotoOnly) {
                return;
            }
            c cVar = this.binding;
            if (cVar != null) {
                p220oa.h.s(cVar.f4052f, true);
            }
            updatePdfOptionVisibility();
            return;
        }
        try {
            this.bOriginPhoto = false;
            this.bTakePhotoOnly = false;
            top.zibin.luban.io.a aVarG = top.zibin.luban.io.a.g(this);
            Uri uri = Uri.parse(this.mSetAvatarUri);
            aVarG.getClass();
            Intent intent = new Intent();
            intent.setClass(this, PhotoCropActivity.class);
            intent.setDataAndType(uri, SelectMimeType.SYSTEM_IMAGE);
            Intrinsics.checkNotNullExpressionValue(intent, "getCropIntent(...)");
            startActivityForResult(intent, REQUEST_CODE_SET_AVATAR_OF_URI);
        } catch (IOException unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, com.transsnet.palmpay.core.base.IBaseView
    public void showLoadingDialog(boolean show) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        super.showLoadingDialog(show);
        if (show) {
            c cVar = this.binding;
            if (cVar == null || (linearLayout2 = cVar.f4052f) == null) {
                return;
            }
            p220oa.h.c(linearLayout2);
            return;
        }
        c cVar2 = this.binding;
        if (cVar2 == null || (linearLayout = cVar2.f4052f) == null) {
            return;
        }
        p220oa.h.C(linearLayout);
    }

    private final void copyExif(File src, File dest) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            FileInputStream fileInputStream3 = new FileInputStream(src);
            try {
                fileInputStream = new FileInputStream(dest);
                try {
                    String strD = new g(fileInputStream3).d("Orientation");
                    if (strD != null) {
                        g gVar = new g(fileInputStream);
                        gVar.F("Orientation", strD);
                        gVar.B();
                    }
                    CloseUtils.closeIO(fileInputStream3, fileInputStream);
                } catch (Exception e10) {
                    e = e10;
                    fileInputStream2 = fileInputStream3;
                    try {
                        F6.d.c(this.TAG, "copyExif: ", e);
                        CloseUtils.closeIO(fileInputStream2, fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        CloseUtils.closeIO(fileInputStream2, fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream3;
                    CloseUtils.closeIO(fileInputStream2, fileInputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
            }
        } catch (Exception e12) {
            e = e12;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }
}
