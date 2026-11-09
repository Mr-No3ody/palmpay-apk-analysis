package p176lg;

import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(with = x.class)
public abstract class w extends j {

    @NotNull
    public static final v Companion = new v(null);

    public abstract String a();

    public String toString() {
        return a();
    }
}
