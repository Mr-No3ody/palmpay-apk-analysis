package N8;

import android.os.ParcelFileDescriptor;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends Ff.h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SetUserPhotoActivity f6196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptor f6197b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SetUserPhotoActivity setUserPhotoActivity, ParcelFileDescriptor parcelFileDescriptor, Continuation continuation) {
        super(2, continuation);
        this.f6196a = setUserPhotoActivity;
        this.f6197b = parcelFileDescriptor;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new b0(this.f6196a, this.f6197b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        Ef.a aVar = Ef.a.f2423a;
        androidx.camera.core.impl.utils.executor.g.M(obj);
        return this.f6196a.copyPfdToCache(this.f6197b);
    }
}
