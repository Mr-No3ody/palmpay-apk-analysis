package defpackage;

import com.didi.drouter.annotation.Service;
import com.palmpay.lib.bridge.BaseBridge;
import com.palmpay.lib.bridge.IBridge;
import com.palmpay.lib.bridgewrapper.location.LocationBridge;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.PalmPayLatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p367ya.a;

/* JADX INFO: loaded from: classes.dex */
@Service(alias = {"/location/get"}, function = {IBridge.class}, priority = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"LPLocationBridge;", "Lcom/palmpay/lib/bridgewrapper/location/LocationBridge;", "<init>", "()V", "requestPermissions", "", "", "requestTimeout", "", "handleTimeout", "", "error", "", "module_common_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PLocationBridge extends LocationBridge {
    @Override // com.palmpay.lib.bridgewrapper.location.LocationBridge
    public void handleTimeout(@NotNull Throwable error) {
        PalmPayLatLng location;
        Intrinsics.checkNotNullParameter(error, "error");
        LocationRecord locationRecordF = a.d().f();
        if (locationRecordF == null || (location = locationRecordF.getLocation()) == null) {
            super.handleTimeout(error);
        } else {
            BaseBridge.handleSuccess$default(this, location, null, 2, null);
        }
    }

    @Override // com.palmpay.lib.bridgewrapper.location.LocationBridge
    @NotNull
    public List<String> requestPermissions() {
        return C1849p.c("android.permission.ACCESS_COARSE_LOCATION");
    }

    @Override // com.palmpay.lib.bridgewrapper.location.LocationBridge
    public long requestTimeout() {
        return 2000L;
    }
}
