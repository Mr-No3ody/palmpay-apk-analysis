package N8;

import Wf.AbstractC0780y;
import android.os.ParcelFileDescriptor;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.util.FileUtils;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SetUserPhotoActivity f6201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptor f6202c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(SetUserPhotoActivity setUserPhotoActivity, ParcelFileDescriptor parcelFileDescriptor, Continuation continuation) {
        super(2, continuation);
        this.f6201b = setUserPhotoActivity;
        this.f6202c = parcelFileDescriptor;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c0(this.f6201b, this.f6202c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f6200a;
        SetUserPhotoActivity setUserPhotoActivity = this.f6201b;
        try {
            if (i7 == 0) {
                androidx.camera.core.impl.utils.executor.g.M(obj);
                p042cg.f fVar = Wf.I.f10809a;
                p042cg.e eVar = p042cg.e.f19009c;
                b0 b0Var = new b0(setUserPhotoActivity, this.f6202c, null);
                this.f6200a = 1;
                obj = AbstractC0780y.s(eVar, b0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidx.camera.core.impl.utils.executor.g.M(obj);
            }
            File file = (File) obj;
            if (FileUtils.getFileLength(file) <= 0) {
                SetUserPhotoActivity.gotoFail$default(setUserPhotoActivity, null, 1, null);
                return Unit.f38893a;
            }
            if (FileUtils.getFileLength(file) > 5242880) {
                String string = setUserPhotoActivity.getString(F8.h.ac_pdf_file_too_large);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                setUserPhotoActivity.gotoFail(string);
                return Unit.f38893a;
            }
            setUserPhotoActivity.mPdfFile = file;
            String str = setUserPhotoActivity.pdfMode;
            if (Intrinsics.c(str, "pick_only")) {
                setUserPhotoActivity.setResult("", file);
                setUserPhotoActivity.finish();
            } else if (Intrinsics.c(str, "pick_and_snap")) {
                setUserPhotoActivity.mPdfFile = null;
                setUserPhotoActivity.showLoadingDialog(false);
                setUserPhotoActivity.openPreviewPdfForSnap(file);
            } else {
                setUserPhotoActivity.uploadFile(file);
            }
            return Unit.f38893a;
        } catch (CancellationException e10) {
            throw e10;
        } catch (Exception e11) {
            F6.d.c(setUserPhotoActivity.TAG, "handlePdfSelected: ", e11);
            String message = e11.getMessage();
            if (Intrinsics.c(message, "pdf_too_large")) {
                String string2 = setUserPhotoActivity.getString(F8.h.ac_pdf_file_too_large);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                setUserPhotoActivity.gotoFail(string2);
            } else if (Intrinsics.c(message, "pdf_invalid")) {
                String string3 = setUserPhotoActivity.getString(F8.h.ac_pdf_file_invalid);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                setUserPhotoActivity.gotoFail(string3);
            } else {
                SetUserPhotoActivity.gotoFail$default(setUserPhotoActivity, null, 1, null);
            }
        }
    }
}
