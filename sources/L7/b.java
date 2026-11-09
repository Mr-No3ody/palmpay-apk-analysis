package L7;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.snail.antifake.IEmulatorCheck;
import com.snail.antifake.jni.EmulatorCheckService;
import com.snail.antifake.jni.EmulatorDetectUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Binder implements IEmulatorCheck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EmulatorCheckService f5558a;

    public b(EmulatorCheckService emulatorCheckService) {
        this.f5558a = emulatorCheckService;
        attachInterface(this, "com.snail.antifake.IEmulatorCheck");
    }

    @Override // com.snail.antifake.IEmulatorCheck
    public final boolean isEmulator() {
        return EmulatorDetectUtil.isEmulator(this.f5558a);
    }

    @Override // com.snail.antifake.IEmulatorCheck
    public final void kill() {
        EmulatorCheckService emulatorCheckService = this.f5558a;
        emulatorCheckService.stopSelf();
        emulatorCheckService.f25247a.postDelayed(new a(0), 500L);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 >= 1 && i7 <= 16777215) {
            parcel.enforceInterface("com.snail.antifake.IEmulatorCheck");
        }
        if (i7 == 1598968902) {
            parcel2.writeString("com.snail.antifake.IEmulatorCheck");
            return true;
        }
        if (i7 == 1) {
            boolean zIsEmulator = EmulatorDetectUtil.isEmulator(this.f5558a);
            parcel2.writeNoException();
            parcel2.writeInt(zIsEmulator ? 1 : 0);
        } else {
            if (i7 != 2) {
                return super.onTransact(i7, parcel, parcel2, i10);
            }
            kill();
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
