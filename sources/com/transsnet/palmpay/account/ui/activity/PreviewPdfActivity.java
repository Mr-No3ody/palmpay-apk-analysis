package com.transsnet.palmpay.account.ui.activity;

import Da.h;
import F6.d;
import F8.e;
import L6.b;
import N8.E;
import N8.H;
import N8.J;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.didiglobal.booster.instrument.ShadowExecutors;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.button.PpButton;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.account.ui.activity.PreviewPdfActivity;
import com.transsnet.palmpay.account.ui.viewmodel.PreviewPdfViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.manager.FileUploadManager;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.FileUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p140j8.f;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/account/previewPdf")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/account/ui/activity/PreviewPdfActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/account/ui/viewmodel/PreviewPdfViewModel;", "LI8/a;", "Lcom/transsnet/palmpay/core/manager/FileUploadManager$UploadListener;", "<init>", "()V", "a", "module_account_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreviewPdfActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewPdfActivity.kt\ncom/transsnet/palmpay/account/ui/activity/PreviewPdfActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,722:1\n1#2:723\n*E\n"})
public final class PreviewPdfActivity extends BaseMvvmVBActivity<PreviewPdfViewModel, I8.a> implements FileUploadManager.UploadListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f25953C = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f25954A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f25955B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25956d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PdfRenderer f25958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25959g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Future f25961j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ExecutorService f25962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f25963p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f25964v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f25965w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent createIntent$default(a aVar, Context context, String str, boolean z3, boolean z8, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                z3 = true;
            }
            if ((i7 & 8) != 0) {
                z8 = false;
            }
            return aVar.createIntent(context, str, z3, z8);
        }

        @NotNull
        public final Intent createIntent(@NotNull Context context, @NotNull String pdfPath, boolean z3, boolean z8) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(pdfPath, "pdfPath");
            Intent intent = new Intent(context, (Class<?>) PreviewPdfActivity.class);
            intent.putExtra("pdf_local_path", pdfPath);
            intent.putExtra("private_photo", z3);
            intent.putExtra("pdf_snap_only", z8);
            File file = new File(pdfPath);
            if (file.exists()) {
                intent.setData(Uri.fromFile(file));
            }
            return intent;
        }

        private a() {
        }
    }

    public PreviewPdfActivity() {
        ExecutorService executorServiceNewOptimizedSingleThreadExecutor = ShadowExecutors.newOptimizedSingleThreadExecutor("\u200bcom.transsnet.palmpay.account.ui.activity.PreviewPdfActivity");
        Intrinsics.checkNotNullExpressionValue(executorServiceNewOptimizedSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f25962o = executorServiceNewOptimizedSingleThreadExecutor;
        this.f25963p = new ArrayList();
        this.f25955B = new AtomicBoolean(false);
    }

    public static void r(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundLight, this));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0039  */
    public final boolean isValidPdfHeader(File file) {
        boolean z3;
        if (file.length() >= 5) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[5];
                    if (fileInputStream.read(bArr) >= 4 && bArr[0] == 37) {
                        z3 = bArr[1] == 80 && bArr[2] == 68 && bArr[3] == 70;
                    }
                    fileInputStream.close();
                    return z3;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        org.chromium.support_lib_boundary.util.b.o(fileInputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                d.c(this.TAG, "isValidPdfHeader", e10);
            }
        }
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(e.ac_activity_preview_pdf, (ViewGroup) null, false);
        int i7 = F8.d.bottomBar;
        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = F8.d.btnTakeScreenshot;
            PpButton ppButton = (PpButton) p059e1.a.m(i7, viewInflate);
            if (ppButton != null) {
                i7 = F8.d.ivTipWarning;
                if (((IconicsImageView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = F8.d.pdfPageContainer;
                    LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                    if (linearLayout != null) {
                        i7 = F8.d.pdfScrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i7, viewInflate);
                        if (nestedScrollView != null) {
                            i7 = F8.d.tipBanner;
                            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = F8.d.titleBar;
                                PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                if (ppTitleBar != null) {
                                    i7 = F8.d.tvTip;
                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView != null) {
                                        I8.a aVar = new I8.a((ConstraintLayout) viewInflate, ppButton, linearLayout, nestedScrollView, ppTitleBar, textView);
                                        Intrinsics.checkNotNullExpressionValue(aVar, "inflate(...)");
                                        return aVar;
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

    public final void n(ArrayList arrayList) {
        I8.a aVar = (I8.a) this.f27334c;
        LinearLayout linearLayout = aVar != null ? aVar.f4035c : null;
        if (linearLayout == null) {
            r(arrayList);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = (Bitmap) it.next();
            this.f25963p.add(bitmap);
            ImageView imageView = new ImageView(this);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setBackgroundColor(this.f25954A);
            imageView.setImageBitmap(bitmap);
            linearLayout.addView(imageView, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    public final void o() {
        try {
            PdfRenderer pdfRenderer = this.f25958f;
            if (pdfRenderer != null) {
                pdfRenderer.close();
            }
        } catch (Exception unused) {
        }
        this.f25958f = null;
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onComplete(String url, File file) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(file, "file");
        runOnUiThread(new h(this, 6, url, file));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        ExecutorService executorService = this.f25962o;
        I8.a aVar = (I8.a) this.f27334c;
        if (aVar != null) {
            aVar.f4036d.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) null);
        }
        Future future = this.f25961j;
        if (future != null) {
            future.cancel(true);
        }
        try {
            executorService.execute(new E(this, 0));
        } catch (Exception unused) {
            o();
        }
        executorService.shutdownNow();
        showLoadingDialog(false);
        ArrayList arrayList = this.f25963p;
        r(arrayList);
        arrayList.clear();
        I8.a aVar2 = (I8.a) this.f27334c;
        if (aVar2 != null) {
            aVar2.f4035c.removeAllViews();
        }
        super.onDestroy();
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onError(Exception ex) {
        Intrinsics.checkNotNullParameter(ex, "ex");
        runOnUiThread(new E(this, 2));
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onProgressChanged(long j6, long j10) {
    }

    @Override // com.transsnet.palmpay.core.manager.FileUploadManager.UploadListener
    public final void onStartSync(String url, File originFile) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(originFile, "originFile");
    }

    public final boolean p(Bitmap bitmap, File file) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        int i7 = 100;
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= 204800) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return v(file, byteArray);
        }
        byteArrayOutputStream.reset();
        bitmap.compress(compressFormat, 0, byteArrayOutputStream);
        if (byteArrayOutputStream.size() <= 204800) {
            int i10 = 0;
            int i11 = 0;
            while (i10 <= i7) {
                int i12 = (i10 + i7) / 2;
                byteArrayOutputStream.reset();
                bitmap.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                if (byteArrayOutputStream.size() <= 204800) {
                    i10 = i12 + 1;
                    i11 = i12;
                } else {
                    i7 = i12 - 1;
                }
            }
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray2, "toByteArray(...)");
            if (v(file, byteArray2) && byteArrayOutputStream.size() <= 204800) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[PHI: r3
      0x0056: PHI (r3v3 java.io.File) = (r3v2 java.io.File), (r3v4 java.io.File) binds: [B:39:0x00b0, B:25:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) throws FileNotFoundException {
        Uri data;
        File file;
        ConstraintLayout constraintLayout;
        Intent intent = getIntent();
        File file2 = null;
        String stringExtra = intent != null ? intent.getStringExtra("pdf_local_path") : null;
        if (stringExtra == null || stringExtra.length() == 0) {
            Intent intent2 = getIntent();
            if (intent2 != null && (data = intent2.getData()) != null) {
                if ("file".equalsIgnoreCase(data.getScheme())) {
                    String path = data.getPath();
                    if (path != null) {
                        file = new File(path);
                        if (file.exists() && file.length() > 0) {
                            file2 = file;
                        }
                    }
                } else {
                    file = new File(getCacheDir(), "preview_" + System.currentTimeMillis() + ".pdf");
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = getContentResolver().openFileDescriptor(data, "r");
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    f.d(autoCloseInputStream, fileOutputStream);
                                    fileOutputStream.flush();
                                    Unit unit = Unit.f38893a;
                                    fileOutputStream.close();
                                    autoCloseInputStream.close();
                                    if (file.exists() && file.length() > 0 && isValidPdfHeader(file)) {
                                        file2 = file;
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
                            d.c(this.TAG, "resolveLocalFile copy failed", e10);
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Exception unused) {
                            }
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                }
            }
        } else {
            file2 = new File(stringExtra);
        }
        if (file2 == null || !file2.exists() || file2.length() <= 0) {
            ToastUtils.showLong(getString(F8.h.ac_pdf_file_invalid), new Object[0]);
            finish();
        } else {
            if (!isValidPdfHeader(file2)) {
                ToastUtils.showLong(getString(F8.h.ac_pdf_file_invalid), new Object[0]);
                finish();
                return;
            }
            I8.a aVar = (I8.a) this.f27334c;
            if (aVar == null || (constraintLayout = aVar.f4033a) == null) {
                return;
            }
            constraintLayout.post(new H(this, file2));
        }
    }

    public final void q() {
        I8.a aVar;
        NestedScrollView nestedScrollView;
        View childAt;
        if (!this.f25960i || this.f25964v >= this.t || (aVar = (I8.a) this.f27334c) == null || (childAt = (nestedScrollView = aVar.f4036d).getChildAt(0)) == null) {
            return;
        }
        boolean z3 = nestedScrollView.getHeight() + nestedScrollView.getScrollY() >= childAt.getHeight() - CommonViewExtKt.getDp(80);
        boolean z8 = childAt.getHeight() <= nestedScrollView.getHeight();
        if ((z3 || z8) && this.f25964v < this.t && this.f25955B.compareAndSet(false, true)) {
            int i7 = this.f25964v;
            int i10 = i7 + 1;
            int i11 = this.t;
            if (i10 > i11) {
                i10 = i11;
            }
            this.f25964v = i10;
            this.f25961j = this.f25962o.submit(new J(this, i7, i10, 0));
        }
    }

    public final ArrayList s(PdfRenderer pdfRenderer, int i7, int i10) {
        ArrayList arrayList = new ArrayList();
        int i11 = this.f25965w;
        int i12 = this.f25954A;
        while (i7 < i10) {
            if (Thread.currentThread().isInterrupted()) {
                r(arrayList);
                arrayList.clear();
                return arrayList;
            }
            PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i7);
            Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
            try {
                int height = (int) (pageOpenPage.getHeight() * (i11 / pageOpenPage.getWidth()));
                if (height < 1) {
                    height = 1;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, height, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                bitmapCreateBitmap.eraseColor(i12);
                pageOpenPage.render(bitmapCreateBitmap, null, null, 1);
                arrayList.add(bitmapCreateBitmap);
                pageOpenPage.close();
                i7++;
            } catch (Throwable th) {
                pageOpenPage.close();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        I8.a aVar = (I8.a) this.f27334c;
        if (aVar != null) {
            final int i7 = 0;
            aVar.f4037e.setBackButtonClickListener(new View.OnClickListener(this) { // from class: N8.I

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreviewPdfActivity f6154b;

                {
                    this.f6154b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x00d6, code lost:
                
                    if (r11 == false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
                
                    r1.recycle();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
                
                    if (r11 == false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x0104, code lost:
                
                    if (r11 == false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r11) {
                    /*
                        Method dump skipped, instruction units count: 336
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: N8.I.onClick(android.view.View):void");
                }
            });
        }
        I8.a aVar2 = (I8.a) this.f27334c;
        if (aVar2 != null) {
            aVar2.f4034b.setEnabled(false);
        }
        I8.a aVar3 = (I8.a) this.f27334c;
        if (aVar3 != null) {
            final int i10 = 1;
            aVar3.f4034b.setOnClickListener(new View.OnClickListener(this) { // from class: N8.I

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PreviewPdfActivity f6154b;

                {
                    this.f6154b = this;
                }

                /* JADX WARN: Code restructure failed: missing block: B:33:0x00d6, code lost:
                
                    if (r11 == false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
                
                    r1.recycle();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
                
                    if (r11 == false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x0104, code lost:
                
                    if (r11 == false) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onClick(android.view.View r11) {
                    /*
                        Method dump skipped, instruction units count: 336
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: N8.I.onClick(android.view.View):void");
                }
            });
        }
    }

    public final boolean t(Bitmap bitmap, File file) throws Throwable {
        Bitmap bitmapCreateScaledBitmap;
        boolean z3 = true;
        if (bitmap.getWidth() <= 720) {
            bitmapCreateScaledBitmap = bitmap;
        } else {
            int height = (int) (bitmap.getHeight() * (720 / bitmap.getWidth()));
            if (height < 1) {
                height = 1;
            }
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 720, height, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        }
        boolean z8 = bitmapCreateScaledBitmap != bitmap;
        while (true) {
            try {
                boolean zP = p(bitmapCreateScaledBitmap, file);
                long fileLength = FileUtils.getFileLength(file);
                if (zP && fileLength > 0) {
                    if (z8 && !bitmapCreateScaledBitmap.isRecycled()) {
                        bitmapCreateScaledBitmap.recycle();
                    }
                    return true;
                }
                int i7 = 480;
                if (bitmapCreateScaledBitmap.getWidth() <= 480) {
                    d.h(this.TAG, 5, "saveScreenshotForOcr still oversized len=" + fileLength + " width=" + bitmapCreateScaledBitmap.getWidth());
                    if (z8 && !bitmapCreateScaledBitmap.isRecycled()) {
                        bitmapCreateScaledBitmap.recycle();
                        return false;
                    }
                } else {
                    int width = (int) (bitmapCreateScaledBitmap.getWidth() * 0.8f);
                    if (width >= 480) {
                        i7 = width;
                    }
                    if (i7 < bitmapCreateScaledBitmap.getWidth()) {
                        int height2 = (int) (bitmapCreateScaledBitmap.getHeight() * (i7 / bitmapCreateScaledBitmap.getWidth()));
                        if (height2 < 1) {
                            height2 = 1;
                        }
                        Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, i7, height2, true);
                        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap2, "createScaledBitmap(...)");
                        if (z8 && !bitmapCreateScaledBitmap.isRecycled()) {
                            bitmapCreateScaledBitmap.recycle();
                        }
                        try {
                            d.h(this.TAG, 3, "saveScreenshotForOcr scale down to " + bitmapCreateScaledBitmap2.getWidth() + "x" + bitmapCreateScaledBitmap2.getHeight());
                            z8 = true;
                            bitmapCreateScaledBitmap = bitmapCreateScaledBitmap2;
                        } catch (Throwable th) {
                            th = th;
                            bitmapCreateScaledBitmap = bitmapCreateScaledBitmap2;
                        }
                    } else if (z8 && !bitmapCreateScaledBitmap.isRecycled()) {
                        bitmapCreateScaledBitmap.recycle();
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                z3 = z8;
            }
            if (z3 && !bitmapCreateScaledBitmap.isRecycled()) {
                bitmapCreateScaledBitmap.recycle();
            }
            throw th;
        }
    }

    public final void u(boolean z3) {
        I8.a aVar = (I8.a) this.f27334c;
        if (aVar != null) {
            aVar.f4034b.b(z3);
        }
    }

    public final boolean v(File file, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                Unit unit = Unit.f38893a;
                fileOutputStream.close();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.o(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            d.c(this.TAG, "writeJpegBytes", e10);
            return false;
        }
    }
}
