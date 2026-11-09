package p176lg;

import com.google.maps.android.BuildConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(with = q.class)
public final class p extends w {

    @NotNull
    public static final p INSTANCE = new p();

    @Override // p176lg.w
    public final String a() {
        return BuildConfig.TRAVIS;
    }

    @NotNull
    public final KSerializer<p> serializer() {
        return q.f39392a;
    }
}
